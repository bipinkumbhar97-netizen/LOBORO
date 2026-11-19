package com.example.domain.integrations

import com.example.domain.model.BadgeLevel
import com.example.domain.model.JobType
import com.example.domain.model.LoboroIdRegistry
import com.example.domain.model.NormalAccountRole
import com.example.domain.model.OwnerProfileSummary
import com.example.domain.model.SupportedLanguage
import com.example.domain.model.UserProfile

enum class IntegrationStatus {
    NOT_CONFIGURED,
    NEEDS_CREDENTIALS,
    CONNECTED
}

data class BackendServiceSpec(
    val id: String,
    val serviceName: String,
    val providerOptions: String,
    val purpose: String,
    val requiredSecrets: List<String>,
    val status: IntegrationStatus
)

/**
 * Real provider interfaces for Phase 2–7 backend & third-party integrations.
 * Phase 1 uses honest NOT_CONFIGURED responses rather than faking real OTPs,
 * payments, face matching, or telecom calls.
 */
interface OtpAuthProvider {
    val status: IntegrationStatus
    suspend fun requestOtp(mobileE164: String): Result<String>
    suspend fun verifyOtp(orderId: String, otp: String): Result<Boolean>
}

sealed interface OwnerBootstrapStatus {
    data class Initialized(val ownerProfile: OwnerProfileSummary) : OwnerBootstrapStatus
    data object Uninitialized : OwnerBootstrapStatus
    data class BackendNotConfigured(val reason: String) : OwnerBootstrapStatus
}

sealed interface OwnerRegistrationResult {
    data class Registered(
        val ownerProfile: OwnerProfileSummary,
        val sessionToken: String,
        val expiresInSeconds: Long
    ) : OwnerRegistrationResult
    data class AlreadyInitialized(val reason: String) : OwnerRegistrationResult
    data class Rejected(val reason: String) : OwnerRegistrationResult
    data class BackendNotConfigured(val reason: String) : OwnerRegistrationResult
}

sealed interface OwnerPinVerificationResult {
    data class Verified(
        val ownerProfile: OwnerProfileSummary,
        val sessionToken: String,
        val expiresInSeconds: Long
    ) : OwnerPinVerificationResult
    data class InvalidPin(val attemptsRemaining: Int) : OwnerPinVerificationResult
    data class RateLimited(val retryAfterSeconds: Long) : OwnerPinVerificationResult
    data class BackendNotConfigured(val reason: String) : OwnerPinVerificationResult
}

sealed interface OwnerPinChangeResult {
    data object Updated : OwnerPinChangeResult
    data class Rejected(val reason: String) : OwnerPinChangeResult
    data class BackendNotConfigured(val reason: String) : OwnerPinChangeResult
}

/**
 * Server-side Owner initialization, single-owner bootstrap registration,
 * PIN verification, and OTP-gated PIN rotation contract.
 * Never hardcode PINs, passwords, or setup bootstrap secrets in the client APK.
 */
interface OwnerAuthProvider {
    val status: IntegrationStatus
    suspend fun checkOwnerBootstrapStatus(): OwnerBootstrapStatus
    suspend fun requestFirstOwnerRegistrationOtp(
        setupAuthorizationCode: String,
        mobileNumber: String
    ): Result<String>
    suspend fun verifyFirstOwnerRegistrationOtp(
        otpSessionId: String,
        otpCode: String
    ): Result<Boolean>
    suspend fun registerFirstOwner(
        setupAuthorizationCode: String,
        fullName: String,
        mobileNumber: String,
        otpSessionId: String,
        loginPassword: String,
        adminPin: String,
        preferredLanguage: SupportedLanguage = SupportedLanguage.ENGLISH
    ): OwnerRegistrationResult
    suspend fun verifyOwnerPin(pin: String): OwnerPinVerificationResult
    suspend fun requestOwnerPinChangeOtp(sessionToken: String): Result<String>
    suspend fun verifyOwnerPinChangeOtp(
        sessionToken: String,
        otpSessionId: String,
        otpCode: String
    ): Result<Boolean>
    suspend fun updateOwnerPin(
        sessionToken: String,
        otpSessionId: String,
        newPin: String
    ): OwnerPinChangeResult
}

class HttpOwnerAuthProvider(
    private val baseUrl: String
) : OwnerAuthProvider {

    private val normalizedBaseUrl: String = baseUrl.trim().trimEnd('/')

    override val status: IntegrationStatus
        get() = if (normalizedBaseUrl.isBlank()) {
            IntegrationStatus.NOT_CONFIGURED
        } else {
            IntegrationStatus.CONNECTED
        }

    private fun backendMissingMessage(): String =
        "Backend Owner Auth server & SMS/OTP provider are not configured (LOBORO_BACKEND_URL is empty). " +
            "No PIN, password, or OTP is simulated locally. Configure your backend server with Argon2id/bcrypt hashing, " +
            "one-time deployment bootstrap secret, single-Owner DB constraint, and DLT SMS/OTP gateway (MSG91/Twilio/Kaleyra)."

    override suspend fun checkOwnerBootstrapStatus(): OwnerBootstrapStatus {
        if (normalizedBaseUrl.isBlank()) {
            return OwnerBootstrapStatus.BackendNotConfigured(backendMissingMessage())
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val (code, body) = executeRequest("GET", "/owner/status", null, null)
                if (code in 200..299) {
                    val json = org.json.JSONObject(body)
                    if (json.optBoolean("initialized", false)) {
                        val profile = parseOwnerProfile(json.getJSONObject("ownerProfile"))
                        OwnerBootstrapStatus.Initialized(profile)
                    } else {
                        OwnerBootstrapStatus.Uninitialized
                    }
                } else {
                    OwnerBootstrapStatus.BackendNotConfigured("Backend status check returned HTTP $code.")
                }
            }.getOrElse { err ->
                OwnerBootstrapStatus.BackendNotConfigured(err.message ?: backendMissingMessage())
            }
        }
    }

    override suspend fun requestFirstOwnerRegistrationOtp(
        setupAuthorizationCode: String,
        mobileNumber: String
    ): Result<String> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("setupAuthorizationCode", setupAuthorizationCode)
                    .put("mobileNumber", mobileNumber)
                val (code, body) = executeRequest("POST", "/owner/register/send-otp", payload.toString(), null)
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    json.getString("otpSessionId")
                } else {
                    throw IllegalStateException(json.optString("error", "OTP dispatch rejected (HTTP $code)."))
                }
            }
        }
    }

    override suspend fun verifyFirstOwnerRegistrationOtp(
        otpSessionId: String,
        otpCode: String
    ): Result<Boolean> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("otpSessionId", otpSessionId)
                    .put("otpCode", otpCode)
                val (code, body) = executeRequest("POST", "/owner/register/verify-otp", payload.toString(), null)
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    json.optBoolean("verified", false)
                } else {
                    throw IllegalStateException(json.optString("error", "OTP verification failed (HTTP $code)."))
                }
            }
        }
    }

    override suspend fun registerFirstOwner(
        setupAuthorizationCode: String,
        fullName: String,
        mobileNumber: String,
        otpSessionId: String,
        loginPassword: String,
        adminPin: String,
        preferredLanguage: SupportedLanguage
    ): OwnerRegistrationResult {
        if (normalizedBaseUrl.isBlank()) {
            return OwnerRegistrationResult.BackendNotConfigured(backendMissingMessage())
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("setupAuthorizationCode", setupAuthorizationCode)
                    .put("fullName", fullName)
                    .put("mobileNumber", mobileNumber)
                    .put("otpSessionId", otpSessionId)
                    .put("loginPassword", loginPassword)
                    .put("adminPin", adminPin)
                    .put("preferredLanguage", preferredLanguage.code)
                val (code, body) = executeRequest("POST", "/owner/register/complete", payload.toString(), null)
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                when {
                    code in 200..299 -> OwnerRegistrationResult.Registered(
                        ownerProfile = parseOwnerProfile(json.getJSONObject("ownerProfile")),
                        sessionToken = json.getString("sessionToken"),
                        expiresInSeconds = json.optLong("expiresInSeconds", 300L)
                    )
                    code == 409 -> OwnerRegistrationResult.AlreadyInitialized(
                        json.optString("error", "An Owner account already exists. Duplicate Owner creation is blocked.")
                    )
                    else -> OwnerRegistrationResult.Rejected(
                        json.optString("error", "Registration rejected by server (HTTP $code).")
                    )
                }
            }.getOrElse { err ->
                OwnerRegistrationResult.Rejected(err.message ?: "Failed to reach Owner registration server.")
            }
        }
    }

    override suspend fun verifyOwnerPin(pin: String): OwnerPinVerificationResult {
        if (normalizedBaseUrl.isBlank()) {
            return OwnerPinVerificationResult.BackendNotConfigured(backendMissingMessage())
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject().put("adminPin", pin)
                val (code, body) = executeRequest("POST", "/owner/auth/verify-pin", payload.toString(), null)
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                when {
                    code in 200..299 -> OwnerPinVerificationResult.Verified(
                        ownerProfile = parseOwnerProfile(json.getJSONObject("ownerProfile")),
                        sessionToken = json.getString("sessionToken"),
                        expiresInSeconds = json.optLong("expiresInSeconds", 300L)
                    )
                    code == 429 -> OwnerPinVerificationResult.RateLimited(
                        json.optLong("retryAfterSeconds", 60L)
                    )
                    else -> OwnerPinVerificationResult.InvalidPin(
                        json.optInt("attemptsRemaining", 0)
                    )
                }
            }.getOrElse { err ->
                OwnerPinVerificationResult.BackendNotConfigured(err.message ?: backendMissingMessage())
            }
        }
    }

    override suspend fun requestOwnerPinChangeOtp(sessionToken: String): Result<String> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val (code, body) = executeRequest("POST", "/owner/pin-change/send-otp", "{}", sessionToken)
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    json.getString("otpSessionId")
                } else {
                    throw IllegalStateException(json.optString("error", "Failed to dispatch OTP to registered mobile."))
                }
            }
        }
    }

    override suspend fun verifyOwnerPinChangeOtp(
        sessionToken: String,
        otpSessionId: String,
        otpCode: String
    ): Result<Boolean> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("otpSessionId", otpSessionId)
                    .put("otpCode", otpCode)
                val (code, body) = executeRequest("POST", "/owner/pin-change/verify-otp", payload.toString(), sessionToken)
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    json.optBoolean("verified", false)
                } else {
                    throw IllegalStateException(json.optString("error", "OTP verification failed (HTTP $code)."))
                }
            }
        }
    }

    override suspend fun updateOwnerPin(
        sessionToken: String,
        otpSessionId: String,
        newPin: String
    ): OwnerPinChangeResult {
        if (normalizedBaseUrl.isBlank()) {
            return OwnerPinChangeResult.BackendNotConfigured(backendMissingMessage())
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("otpSessionId", otpSessionId)
                    .put("newAdminPin", newPin)
                val (code, body) = executeRequest("POST", "/owner/pin-change/update", payload.toString(), sessionToken)
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    OwnerPinChangeResult.Updated
                } else {
                    OwnerPinChangeResult.Rejected(json.optString("error", "PIN change rejected (HTTP $code)."))
                }
            }.getOrElse { err ->
                OwnerPinChangeResult.Rejected(err.message ?: "Failed to update Owner PIN.")
            }
        }
    }

    private fun parseOwnerProfile(obj: org.json.JSONObject): OwnerProfileSummary {
        val langCode = obj.optString("preferredLanguage", SupportedLanguage.ENGLISH.code)
        val lang = SupportedLanguage.entries.firstOrNull { it.code == langCode } ?: SupportedLanguage.ENGLISH
        return OwnerProfileSummary(
            loboroId = obj.optString("loboroId", "OWNER-MASTER-01"),
            fullName = obj.optString("fullName", "LOBORO Owner"),
            maskedMobile = obj.optString("maskedMobile", "••••"),
            initializedAtLabel = obj.optString("initializedAtLabel", "Verified"),
            preferredLanguage = lang
        )
    }

    private fun executeRequest(
        method: String,
        path: String,
        jsonBody: String?,
        bearerToken: String?
    ): Pair<Int, String> {
        val url = java.net.URL("$normalizedBaseUrl$path")
        val conn = (url.openConnection() as java.net.HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 10_000
            readTimeout = 10_000
            setRequestProperty("Accept", "application/json")
            if (bearerToken != null) {
                setRequestProperty("Authorization", "Bearer $bearerToken")
            }
            if (jsonBody != null) {
                doOutput = true
                setRequestProperty("Content-Type", "application/json; charset=utf-8")
                outputStream.use { it.write(jsonBody.toByteArray(Charsets.UTF_8)) }
            }
        }
        val statusCode = conn.responseCode
        val stream = if (statusCode in 200..299) conn.inputStream else conn.errorStream
        val body = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
        conn.disconnect()
        return statusCode to body
    }
}

sealed interface NormalUserAuthResult {
    data class Authenticated(
        val profile: UserProfile,
        val sessionToken: String
    ) : NormalUserAuthResult
    data class Rejected(val reason: String) : NormalUserAuthResult
    data class BackendNotConfigured(val reason: String) : NormalUserAuthResult
}

/**
 * Completely separate registration and login system for unlimited Workers and Employers.
 * Never accepts or issues OWNER_SUPER_ADMIN roles or reserved Owner/VIP IDs.
 */
interface NormalUserAuthProvider {
    val status: IntegrationStatus
    suspend fun requestRegistrationOtp(role: NormalAccountRole, mobileNumber: String): Result<String>
    suspend fun verifyRegistrationOtp(otpSessionId: String, otpCode: String): Result<Boolean>
    suspend fun completeRegistration(
        role: NormalAccountRole,
        fullName: String,
        mobileNumber: String,
        otpSessionId: String,
        homeState: String,
        homeDistrict: String,
        currentCityState: String,
        skills: List<String>,
        emergencyContactName: String,
        emergencyContactPhone: String,
        emergencyConsentGiven: Boolean,
        preferredLanguage: SupportedLanguage = SupportedLanguage.ENGLISH
    ): NormalUserAuthResult

    suspend fun requestLoginOtp(mobileNumber: String): Result<String>
    suspend fun verifyLoginOtp(otpSessionId: String, otpCode: String): NormalUserAuthResult
    suspend fun syncPreferredLanguage(sessionToken: String, language: SupportedLanguage): Result<Unit>
}

class HttpNormalUserAuthProvider(
    private val baseUrl: String
) : NormalUserAuthProvider {

    private val normalizedBaseUrl: String = baseUrl.trim().trimEnd('/')

    override val status: IntegrationStatus
        get() = if (normalizedBaseUrl.isBlank()) {
            IntegrationStatus.NOT_CONFIGURED
        } else {
            IntegrationStatus.CONNECTED
        }

    private fun backendMissingMessage(): String =
        "Normal user registration database & SMS/OTP provider are not configured (LOBORO_BACKEND_URL is empty). " +
            "Real OTP verification and globally unique LB ID database assignment (e.g., LB2349, LB5821) cannot be simulated offline. " +
            "Connect your backend database (Supabase/PostgreSQL or Firestore) + DLT SMS/OTP gateway (MSG91/Twilio/Kaleyra)."

    override suspend fun requestRegistrationOtp(role: NormalAccountRole, mobileNumber: String): Result<String> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("role", role.name)
                    .put("mobileNumber", mobileNumber)
                val (code, body) = executeRequest("POST", "/users/register/send-otp", payload.toString())
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    json.getString("otpSessionId")
                } else {
                    throw IllegalStateException(json.optString("error", "OTP dispatch failed (HTTP $code)."))
                }
            }
        }
    }

    override suspend fun verifyRegistrationOtp(otpSessionId: String, otpCode: String): Result<Boolean> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("otpSessionId", otpSessionId)
                    .put("otpCode", otpCode)
                val (code, body) = executeRequest("POST", "/users/register/verify-otp", payload.toString())
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    json.optBoolean("verified", false)
                } else {
                    throw IllegalStateException(json.optString("error", "OTP verification failed (HTTP $code)."))
                }
            }
        }
    }

    override suspend fun completeRegistration(
        role: NormalAccountRole,
        fullName: String,
        mobileNumber: String,
        otpSessionId: String,
        homeState: String,
        homeDistrict: String,
        currentCityState: String,
        skills: List<String>,
        emergencyContactName: String,
        emergencyContactPhone: String,
        emergencyConsentGiven: Boolean,
        preferredLanguage: SupportedLanguage
    ): NormalUserAuthResult {
        if (normalizedBaseUrl.isBlank()) {
            return NormalUserAuthResult.BackendNotConfigured(backendMissingMessage())
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("role", role.name)
                    .put("fullName", fullName)
                    .put("mobileNumber", mobileNumber)
                    .put("otpSessionId", otpSessionId)
                    .put("homeState", homeState)
                    .put("homeDistrict", homeDistrict)
                    .put("currentCityState", currentCityState)
                    .put("skills", org.json.JSONArray(skills))
                    .put("emergencyContactName", emergencyContactName)
                    .put("emergencyContactPhone", emergencyContactPhone)
                    .put("emergencyConsentGiven", emergencyConsentGiven)
                    .put("preferredLanguage", preferredLanguage.code)
                val (code, body) = executeRequest("POST", "/users/register/complete", payload.toString())
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    val profile = parseNormalUserProfile(json.getJSONObject("profile"), role)
                    if (LoboroIdRegistry.isReservedVipId(profile.loboroId) || profile.isOwnerAccount) {
                        return@runCatching NormalUserAuthResult.Rejected("Server returned a reserved/Owner ID for a normal user account.")
                    }
                    NormalUserAuthResult.Authenticated(
                        profile = profile,
                        sessionToken = json.getString("sessionToken")
                    )
                } else {
                    NormalUserAuthResult.Rejected(json.optString("error", "Registration failed (HTTP $code)."))
                }
            }.getOrElse { err ->
                NormalUserAuthResult.Rejected(err.message ?: "Unable to complete registration.")
            }
        }
    }

    override suspend fun requestLoginOtp(mobileNumber: String): Result<String> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject().put("mobileNumber", mobileNumber)
                val (code, body) = executeRequest("POST", "/users/login/send-otp", payload.toString())
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    json.getString("otpSessionId")
                } else {
                    throw IllegalStateException(json.optString("error", "Login OTP dispatch failed (HTTP $code)."))
                }
            }
        }
    }

    override suspend fun verifyLoginOtp(otpSessionId: String, otpCode: String): NormalUserAuthResult {
        if (normalizedBaseUrl.isBlank()) {
            return NormalUserAuthResult.BackendNotConfigured(backendMissingMessage())
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject()
                    .put("otpSessionId", otpSessionId)
                    .put("otpCode", otpCode)
                val (code, body) = executeRequest("POST", "/users/login/verify-otp", payload.toString())
                val json = org.json.JSONObject(body.ifBlank { "{}" })
                if (code in 200..299) {
                    val profileObj = json.getJSONObject("profile")
                    val roleName = profileObj.optString("role", "WORKER")
                    val safeNormalRole = if (roleName == NormalAccountRole.EMPLOYER.name) {
                        NormalAccountRole.EMPLOYER
                    } else {
                        NormalAccountRole.WORKER
                    }
                    val profile = parseNormalUserProfile(profileObj, safeNormalRole)
                    if (LoboroIdRegistry.isReservedVipId(profile.loboroId) || profile.isOwnerAccount) {
                        return@runCatching NormalUserAuthResult.Rejected("Normal login rejected reserved/Owner identity.")
                    }
                    NormalUserAuthResult.Authenticated(
                        profile = profile,
                        sessionToken = json.getString("sessionToken")
                    )
                } else {
                    NormalUserAuthResult.Rejected(json.optString("error", "Login OTP verification failed (HTTP $code)."))
                }
            }.getOrElse { err ->
                NormalUserAuthResult.Rejected(err.message ?: "Unable to verify login OTP.")
            }
        }
    }

    private fun parseNormalUserProfile(obj: org.json.JSONObject, fallbackRole: NormalAccountRole): UserProfile {
        val role = if (obj.optString("role") == NormalAccountRole.EMPLOYER.name) {
            NormalAccountRole.EMPLOYER
        } else if (obj.optString("role") == NormalAccountRole.WORKER.name) {
            NormalAccountRole.WORKER
        } else {
            fallbackRole
        }
        val skillsJson = obj.optJSONArray("skills")
        val skills = buildList {
            if (skillsJson != null) {
                for (i in 0 until skillsJson.length()) {
                    add(skillsJson.optString(i))
                }
            }
        }.filter { it.isNotBlank() }

        return UserProfile(
            loboroId = obj.getString("loboroId"),
            role = role.toUserRole(),
            fullName = obj.optString("fullName", "LOBORO User"),
            mobileMasked = obj.optString("mobileMasked", "••••"),
            homeState = obj.optString("homeState", "India"),
            homeDistrict = obj.optString("homeDistrict", ""),
            currentCityState = obj.optString("currentCityState", "India"),
            willingToRelocate = obj.optBoolean("willingToRelocate", true),
            skills = skills,
            experienceYears = obj.optInt("experienceYears", 0),
            jobPreference = JobType.DAILY,
            badgeLevel = BadgeLevel.NONE,
            verifiedWorkdays = obj.optInt("verifiedWorkdays", 0),
            completedJobs = obj.optInt("completedJobs", 0),
            rating = obj.optDouble("rating", 5.0),
            memberMonths = obj.optInt("memberMonths", 1),
            emergencyContactName = obj.optString("emergencyContactName", ""),
            emergencyContactPhoneMasked = obj.optString("emergencyContactPhoneMasked", ""),
            emergencyConsentGiven = obj.optBoolean("emergencyConsentGiven", true),
            profilePhotoUri = null,
            faceRegistrationCaptured = obj.optBoolean("faceRegistrationCaptured", false),
            isOwnerAccount = false,
            preferredLanguage = SupportedLanguage.entries.firstOrNull {
                it.code == obj.optString("preferredLanguage", SupportedLanguage.ENGLISH.code)
            } ?: SupportedLanguage.ENGLISH
        )
    }

    override suspend fun syncPreferredLanguage(sessionToken: String, language: SupportedLanguage): Result<Unit> {
        if (normalizedBaseUrl.isBlank()) {
            return Result.failure(IllegalStateException(backendMissingMessage()))
        }
        return kotlinx.coroutines.withContext(kotlinx.coroutines.Dispatchers.IO) {
            runCatching {
                val payload = org.json.JSONObject().put("preferredLanguage", language.code)
                val url = java.net.URL("$normalizedBaseUrl/users/me/language")
                val conn = (url.openConnection() as java.net.HttpURLConnection).apply {
                    requestMethod = "PUT"
                    connectTimeout = 10_000
                    readTimeout = 10_000
                    setRequestProperty("Accept", "application/json")
                    setRequestProperty("Authorization", "Bearer $sessionToken")
                    doOutput = true
                    setRequestProperty("Content-Type", "application/json; charset=utf-8")
                    outputStream.use { it.write(payload.toString().toByteArray(Charsets.UTF_8)) }
                }
                val code = conn.responseCode
                conn.disconnect()
                if (code !in 200..299) {
                    throw IllegalStateException("Language sync failed (HTTP $code).")
                }
            }
        }
    }

    private fun executeRequest(method: String, path: String, jsonBody: String): Pair<Int, String> {
        val url = java.net.URL("$normalizedBaseUrl$path")
        val conn = (url.openConnection() as java.net.HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 10_000
            readTimeout = 10_000
            setRequestProperty("Accept", "application/json")
            doOutput = true
            setRequestProperty("Content-Type", "application/json; charset=utf-8")
            outputStream.use { it.write(jsonBody.toByteArray(Charsets.UTF_8)) }
        }
        val statusCode = conn.responseCode
        val stream = if (statusCode in 200..299) conn.inputStream else conn.errorStream
        val body = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
        conn.disconnect()
        return statusCode to body
    }
}

interface PaymentGatewayProvider {
    val status: IntegrationStatus
    suspend fun createCoinOrder(coins: Int, amountInr: Int, userLoboroId: String): Result<String>
    suspend fun verifyWebhookPayment(orderId: String): Result<Boolean>
}

interface FaceVerificationProvider {
    val status: IntegrationStatus
    suspend fun startLivenessAndMatch(userLoboroId: String): Result<Boolean>
}

interface TranslationProvider {
    val status: IntegrationStatus
    suspend fun translateJobText(
        text: String,
        from: SupportedLanguage,
        to: SupportedLanguage
    ): Result<String>
}

interface TelecomIvrProvider {
    val status: IntegrationStatus
    val dedicatedNumber: String
    suspend fun triggerCallback(mobileE164: String, language: SupportedLanguage): Result<String>
}

object BackendServicesChecklist {
    val items: List<BackendServiceSpec> = listOf(
        BackendServiceSpec(
            id = "db_auth",
            serviceName = "Cloud Database & Row-Level Security",
            providerOptions = "Supabase (PostgreSQL + RLS) or Firebase Firestore",
            purpose = "Users, LB ID central registry, Jobs, Applications, Wallet Ledger, Audit Logs",
            requiredSecrets = listOf("SUPABASE_URL", "SUPABASE_ANON_KEY", "SUPABASE_SERVICE_ROLE_KEY"),
            status = IntegrationStatus.NOT_CONFIGURED
        ),
        BackendServiceSpec(
            id = "otp_sms",
            serviceName = "OTP & Transactional SMS",
            providerOptions = "MSG91 / Twilio / Kaleyra (DLT Registered for India)",
            purpose = "Worker/Employer mobile OTP, bank change OTP, missed safety check-in SMS",
            requiredSecrets = listOf("OTP_PROVIDER_API_KEY", "DLT_SENDER_ID", "DLT_TEMPLATE_ID"),
            status = IntegrationStatus.NOT_CONFIGURED
        ),
        BackendServiceSpec(
            id = "payment_gateway",
            serviceName = "UPI & Coin Payment Gateway",
            providerOptions = "Razorpay / Cashfree Payments (Server Webhook Verified)",
            purpose = "Coin purchases, dynamic QR, duplicate-proof server-side ledger credit, payout/IMPS",
            requiredSecrets = listOf("RAZORPAY_KEY_ID", "RAZORPAY_KEY_SECRET", "RAZORPAY_WEBHOOK_SECRET"),
            status = IntegrationStatus.NOT_CONFIGURED
        ),
        BackendServiceSpec(
            id = "face_liveness",
            serviceName = "Face Match & Liveness Verification",
            providerOptions = "AWS Rekognition Face Liveness / HyperVerge / Signzy",
            purpose = "Compare live selfie + blink/head liveness vs registration face photo on bank update",
            requiredSecrets = listOf("FACE_VERIFY_API_KEY", "FACE_VERIFY_ENDPOINT"),
            status = IntegrationStatus.NOT_CONFIGURED
        ),
        BackendServiceSpec(
            id = "translation",
            serviceName = "Live 12-Language Job Translation",
            providerOptions = "Google Cloud Translation / Bhashini API (India)",
            purpose = "Auto-translate Employer job descriptions across all 12 Indian languages",
            requiredSecrets = listOf("TRANSLATION_API_KEY"),
            status = IntegrationStatus.NOT_CONFIGURED
        ),
        BackendServiceSpec(
            id = "telecom_ivr",
            serviceName = "Keypad Phone Missed-Call & IVR",
            providerOptions = "Exotel / Knowlarity / Twilio Voice",
            purpose = "Dedicated LOBORO phone number, keypad job search, weekly 'Are you safe?' 1/2/3 check-in",
            requiredSecrets = listOf("IVR_SID", "IVR_TOKEN", "LOBORO_VIRTUAL_NUMBER"),
            status = IntegrationStatus.NOT_CONFIGURED
        ),
        BackendServiceSpec(
            id = "owner_pin_auth",
            serviceName = "Owner Bootstrap, 4-Digit PIN & MFA Server",
            providerOptions = "Supabase Edge Functions / Node.js API + Argon2id + Redis Rate Limiter",
            purpose = "Enforce single-Owner DB lock, verify one-time setup bootstrap secret, hash Owner password & 4-digit PIN, verify PIN/OTP on server, issue short-lived Owner JWT, and store immutable audit logs",
            requiredSecrets = listOf("LOBORO_BACKEND_URL", "OWNER_BOOTSTRAP_SECRET", "OWNER_PIN_PEPPER", "AUDIT_SIGNING_KEY"),
            status = IntegrationStatus.NOT_CONFIGURED
        )
    )
}
