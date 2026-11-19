package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.BuildConfig
import com.example.data.LoboroDemoRepository
import com.example.data.LoboroPreferences
import com.example.domain.integrations.HttpNormalUserAuthProvider
import com.example.domain.integrations.HttpOwnerAuthProvider
import com.example.domain.integrations.IntegrationStatus
import com.example.domain.integrations.NormalUserAuthProvider
import com.example.domain.integrations.NormalUserAuthResult
import com.example.domain.integrations.OwnerAuthProvider
import com.example.domain.integrations.OwnerBootstrapStatus
import com.example.domain.integrations.OwnerPinChangeResult
import com.example.domain.integrations.OwnerPinVerificationResult
import com.example.domain.integrations.OwnerRegistrationResult
import com.example.domain.model.*
import com.example.i18n.AppStrings
import com.example.i18n.Translations
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class JobSearchFilters(
    val query: String = "",
    val selectedCategory: JobCategoryId? = null,
    val country: String = "India",
    val state: String = "All States",
    val district: String = "",
    val city: String = "",
    val maxDistanceKm: Int = 1500,
    val willingToRelocate: Boolean = true,
    val foodOnly: Boolean = false,
    val accommodationOnly: Boolean = false
)

data class LoboroUiState(
    val activeLanguage: SupportedLanguage = SupportedLanguage.ENGLISH,
    val activeRole: UserRole = UserRole.WORKER,
    val activeProfile: UserProfile = LoboroDemoRepository.demoWorkerProfile,
    val lowDataMode: Boolean = false,
    val reducedMotion: Boolean = false,
    val showDemoPreviewNotice: Boolean = true,
    val activeJobTypeTab: JobType = JobType.DAILY,
    val filters: JobSearchFilters = JobSearchFilters(),
    val jobs: List<JobListing> = LoboroDemoRepository.demoJobs,
    val favoriteJobIds: Set<String> = emptySet(),
    val applications: List<JobApplication> = LoboroDemoRepository.demoApplications,
    val wallet: WalletAccount = LoboroDemoRepository.demoWallet,
    val feeConfig: FeeConfig = FeeConfig(),
    val safetyCases: List<SafetyCase> = LoboroDemoRepository.demoSafetyCases,
    val weeklyCheckIn: WeeklyCheckInState = WeeklyCheckInState(),
    val adminNotices: List<AdminNotice> = LoboroDemoRepository.demoAdminNotices,
    val dismissedNoticeIds: Set<String> = emptySet(),
    val masterControls: MasterFeatureControls = MasterFeatureControls(),
    val categoryConfigs: List<JobCategoryConfig> = JobCategoryId.entries.map { JobCategoryConfig(it) },
    val loyaltyConfig: LoyaltyProgramConfig = LoyaltyProgramConfig(),
    val chatThreads: List<ChatThread> = LoboroDemoRepository.demoChatThreads,
    val ownerBackendConfigured: Boolean = false,
    val ownerSession: OwnerSessionState = OwnerSessionState(),
    val ownerRegistrationForm: OwnerRegistrationFormState = OwnerRegistrationFormState(),
    val pinChangeState: OwnerPinChangeState = OwnerPinChangeState(),
    val normalUserSession: NormalUserSessionState = NormalUserSessionState(),
    val normalUserRegForm: NormalUserRegistrationFormState = NormalUserRegistrationFormState(),
    val normalUserLoginForm: NormalUserLoginFormState = NormalUserLoginFormState(),
    val ownerAuditLogs: List<OwnerAuditLogEntry> = listOf(
        OwnerAuditLogEntry(
            id = "AUD-100",
            timestampLabel = "System Init",
            actorId = "SYSTEM",
            action = "SECURITY_GUARD_ENABLED",
            details = "Hidden 10-tap Owner access, single-owner lock & server-only verification active."
        )
    ),
    val currentEpochMs: Long = System.currentTimeMillis(),
    val feedbackBannerMessage: String? = null
)

class LoboroViewModel(application: Application) : AndroidViewModel(application) {

    private val prefs = LoboroPreferences(application.applicationContext)
    private val ownerAuthProvider: OwnerAuthProvider = HttpOwnerAuthProvider(BuildConfig.LOBORO_BACKEND_URL)
    private val normalUserAuthProvider: NormalUserAuthProvider = HttpNormalUserAuthProvider(BuildConfig.LOBORO_BACKEND_URL)

    private var logoTapCount: Int = 0
    private var lastLogoTapEpochMs: Long = 0L

    private val _uiState = MutableStateFlow(
        LoboroUiState(ownerBackendConfigured = ownerAuthProvider.status == IntegrationStatus.CONNECTED)
    )
    val uiState: StateFlow<LoboroUiState> = _uiState.asStateFlow()

    private fun s(): AppStrings = Translations.forLanguage(_uiState.value.activeLanguage)

    private fun currentAccountId(state: LoboroUiState = _uiState.value): String? =
        state.normalUserSession.signedInProfile?.loboroId
            ?: state.ownerSession.ownerProfile?.loboroId?.takeIf { state.ownerSession.isAuthenticated }

    init {
        // Single atomic collector for all DataStore preferences to avoid cascading startup recompositions
        viewModelScope.launch {
            prefs.snapshot.distinctUntilChanged().collect { snap ->
                _uiState.update { state ->
                    val updatedOwnerSession = state.ownerSession.copy(
                        failedPinAttempts = snap.ownerPinFailedAttempts,
                        lockoutUntilEpochMs = snap.ownerPinLockoutUntilMs,
                        isOwnerInitialized = state.ownerSession.isOwnerInitialized || snap.ownerProfileSummary != null,
                        ownerProfile = snap.ownerProfileSummary ?: state.ownerSession.ownerProfile
                    )
                    state.copy(
                        activeLanguage = snap.selectedLanguage,
                        lowDataMode = snap.lowDataMode,
                        reducedMotion = snap.reducedMotion,
                        favoriteJobIds = snap.favoriteJobIds,
                        ownerSession = updatedOwnerSession
                    )
                }
            }
        }
        refreshOwnerBootstrapStatus()
        // Security ticker: enforces lockout countdown & automatic inactivity logout for Owner sessions
        // Only updates UI state when an Owner session or PIN lockout is actively counting down,
        // avoiding unnecessary 1-second full-app recompositions during normal user sessions.
        viewModelScope.launch {
            var wasLockoutActive = false
            while (true) {
                delay(1000L)
                val now = System.currentTimeMillis()
                val session = _uiState.value.ownerSession
                if (session.isAuthenticated &&
                    session.lastActivityEpochMs > 0L &&
                    now - session.lastActivityEpochMs >= session.sessionTimeoutMs
                ) {
                    logoutOwnerSession(s().msgOwnerTimedOut)
                    wasLockoutActive = false
                } else {
                    val isLockoutActive = session.lockoutUntilEpochMs > now
                    if (session.isAuthenticated || isLockoutActive || wasLockoutActive) {
                        _uiState.update { it.copy(currentEpochMs = now) }
                    }
                    wasLockoutActive = isLockoutActive
                }
            }
        }
    }

    fun selectLanguage(language: SupportedLanguage) {
        val current = _uiState.value
        if (!current.masterControls.languageSettingsEnabled && !current.ownerSession.isAuthenticated) {
            _uiState.update { it.copy(feedbackBannerMessage = s().languagePausedByOwner) }
            return
        }
        val accountId = currentAccountId(current)
        val targetStrings = Translations.forLanguage(language)
        _uiState.update { state ->
            val updatedNormalSession = if (state.normalUserSession.isSignedIn) {
                state.normalUserSession.copy(
                    signedInProfile = state.normalUserSession.signedInProfile?.copy(preferredLanguage = language)
                )
            } else {
                state.normalUserSession
            }
            val updatedOwnerSession = if (state.ownerSession.isAuthenticated) {
                state.ownerSession.copy(
                    ownerProfile = state.ownerSession.ownerProfile?.copy(preferredLanguage = language)
                )
            } else {
                state.ownerSession
            }
            state.copy(
                activeLanguage = language,
                activeProfile = state.activeProfile.copy(preferredLanguage = language),
                normalUserSession = updatedNormalSession,
                ownerSession = updatedOwnerSession,
                normalUserRegForm = state.normalUserRegForm.copy(preferredLanguage = language),
                ownerRegistrationForm = state.ownerRegistrationForm.copy(preferredLanguage = language),
                feedbackBannerMessage = Translations.fmt(
                    targetStrings.msgLanguageSavedFormat,
                    language.nativeName,
                    language.englishName
                )
            )
        }
        viewModelScope.launch {
            prefs.setSelectedLanguage(language, accountId)
            val normalSession = _uiState.value.normalUserSession
            if (normalSession.isSignedIn && !normalSession.sessionToken.isNullOrBlank()) {
                normalUserAuthProvider.syncPreferredLanguage(normalSession.sessionToken, language)
            }
        }
    }

    fun setLowDataMode(enabled: Boolean) {
        _uiState.update { it.copy(lowDataMode = enabled) }
        viewModelScope.launch { prefs.setLowDataMode(enabled) }
    }

    fun setReducedMotion(enabled: Boolean) {
        _uiState.update { it.copy(reducedMotion = enabled) }
        viewModelScope.launch { prefs.setReducedMotion(enabled) }
    }

    fun switchRolePreview(role: UserRole) {
        val str = s()
        // Security: Ordinary users or preview switcher can NEVER promote to OWNER_SUPER_ADMIN
        if (role == UserRole.OWNER_SUPER_ADMIN) {
            _uiState.update {
                it.copy(feedbackBannerMessage = str.msgOwnerPrivilegeBlocked)
            }
            return
        }
        val profile = when (role) {
            UserRole.WORKER -> LoboroDemoRepository.demoWorkerProfile
            UserRole.EMPLOYER -> LoboroDemoRepository.demoEmployerProfile
            UserRole.OWNER_SUPER_ADMIN -> return
        }.copy(preferredLanguage = _uiState.value.activeLanguage)
        _uiState.update {
            it.copy(
                activeRole = role,
                activeProfile = profile,
                feedbackBannerMessage = Translations.fmt(str.msgSwitchedPreviewFormat, profile.fullName, profile.loboroId)
            )
        }
    }

    // =========================================================================
    // NORMAL USER REGISTRATION & LOGIN SYSTEM (WORKERS & EMPLOYERS ONLY)
    // Completely separate from the one-time Owner/Super Admin registration flow.
    // =========================================================================

    fun updateNormalUserRegForm(transform: (NormalUserRegistrationFormState) -> NormalUserRegistrationFormState) {
        _uiState.update { it.copy(normalUserRegForm = transform(it.normalUserRegForm)) }
    }

    fun requestNormalUserRegistrationOtp() {
        val current = _uiState.value
        val str = s()
        val form = current.normalUserRegForm
        val rolePaused = current.masterControls.appMaintenanceMode ||
            (form.selectedRole == NormalAccountRole.WORKER && !current.masterControls.workerRegistration) ||
            (form.selectedRole == NormalAccountRole.EMPLOYER && !current.masterControls.employerRegistration)
        if (rolePaused) {
            val roleLabel = str.userRoles[form.selectedRole.toUserRole()] ?: form.selectedRole.name
            _uiState.update {
                it.copy(
                    normalUserRegForm = it.normalUserRegForm.copy(
                        statusMessage = Translations.fmt(str.regPausedForRoleFormat, roleLabel),
                        isError = true
                    )
                )
            }
            return
        }
        if (form.fullName.trim().length < 2) {
            _uiState.update {
                it.copy(
                    normalUserRegForm = it.normalUserRegForm.copy(
                        statusMessage = str.msgEnterNameBeforeOtp,
                        isError = true
                    )
                )
            }
            return
        }
        if (form.mobileNumber.filter { it.isDigit() }.length < 10) {
            _uiState.update {
                it.copy(
                    normalUserRegForm = it.normalUserRegForm.copy(
                        statusMessage = str.msgEnterValidMobile,
                        isError = true
                    )
                )
            }
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(normalUserRegForm = it.normalUserRegForm.copy(isSubmitting = true)) }
            val res = normalUserAuthProvider.requestRegistrationOtp(form.selectedRole, form.mobileNumber.trim())
            res.onSuccess { sessionId ->
                _uiState.update {
                    it.copy(
                        normalUserRegForm = it.normalUserRegForm.copy(
                            isSubmitting = false,
                            otpSessionId = sessionId,
                            otpSent = true,
                            otpVerifiedOnServer = false,
                            statusMessage = Translations.fmt(s().msgOtpDispatchedFormat, form.mobileNumber.trim()),
                            isError = false
                        )
                    )
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        normalUserRegForm = it.normalUserRegForm.copy(
                            isSubmitting = false,
                            otpSent = false,
                            otpVerifiedOnServer = false,
                            statusMessage = err.message ?: s().msgUnableSendOtp,
                            isError = true
                        )
                    )
                }
            }
        }
    }

    fun verifyNormalUserRegistrationOtp() {
        val str = s()
        val form = _uiState.value.normalUserRegForm
        val sessionId = form.otpSessionId
        if (sessionId == null || form.otpCodeInput.length < 4) {
            _uiState.update {
                it.copy(
                    normalUserRegForm = it.normalUserRegForm.copy(
                        statusMessage = str.msgSendOtpAndEnterCode,
                        isError = true
                    )
                )
            }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(normalUserRegForm = it.normalUserRegForm.copy(isSubmitting = true)) }
            val res = normalUserAuthProvider.verifyRegistrationOtp(sessionId, form.otpCodeInput.trim())
            res.onSuccess { verified ->
                val curStr = s()
                val roleLabel = curStr.userRoles[form.selectedRole.toUserRole()] ?: form.selectedRole.name
                _uiState.update {
                    it.copy(
                        normalUserRegForm = it.normalUserRegForm.copy(
                            isSubmitting = false,
                            otpVerifiedOnServer = verified,
                            statusMessage = if (verified) {
                                Translations.fmt(curStr.msgOtpVerifiedCreateFormat, roleLabel)
                            } else {
                                curStr.msgIncorrectOtp
                            },
                            isError = !verified
                        )
                    )
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        normalUserRegForm = it.normalUserRegForm.copy(
                            isSubmitting = false,
                            otpVerifiedOnServer = false,
                            statusMessage = err.message ?: s().msgServerOtpUnavailable,
                            isError = true
                        )
                    )
                }
            }
        }
    }

    fun submitNormalUserRegistration() {
        val current = _uiState.value
        val str = s()
        val f = current.normalUserRegForm
        val rolePaused = current.masterControls.appMaintenanceMode ||
            (f.selectedRole == NormalAccountRole.WORKER && !current.masterControls.workerRegistration) ||
            (f.selectedRole == NormalAccountRole.EMPLOYER && !current.masterControls.employerRegistration)
        if (rolePaused) {
            val roleLabel = str.userRoles[f.selectedRole.toUserRole()] ?: f.selectedRole.name
            _uiState.update {
                it.copy(
                    normalUserRegForm = it.normalUserRegForm.copy(
                        statusMessage = Translations.fmt(str.regPausedForRoleFormat, roleLabel),
                        isError = true
                    )
                )
            }
            return
        }
        val validationError = when {
            f.fullName.trim().length < 2 -> str.msgEnterFullName
            f.mobileNumber.filter { it.isDigit() }.length < 10 -> str.msgEnterValidMobile
            !f.otpVerifiedOnServer || f.otpSessionId == null -> str.msgVerifyMobileOtpFirst
            else -> null
        }
        if (validationError != null) {
            _uiState.update {
                it.copy(
                    normalUserRegForm = it.normalUserRegForm.copy(
                        statusMessage = validationError,
                        isError = true
                    )
                )
            }
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(normalUserRegForm = it.normalUserRegForm.copy(isSubmitting = true)) }
            when (
                val res = normalUserAuthProvider.completeRegistration(
                    role = f.selectedRole,
                    fullName = f.fullName.trim(),
                    mobileNumber = f.mobileNumber.trim(),
                    otpSessionId = f.otpSessionId!!,
                    homeState = f.homeState.trim(),
                    homeDistrict = f.homeDistrict.trim(),
                    currentCityState = f.currentCityState.trim(),
                    skills = f.skillsText.split(",").map { it.trim() }.filter { it.isNotEmpty() },
                    emergencyContactName = f.emergencyContactName.trim(),
                    emergencyContactPhone = f.emergencyContactPhone.trim(),
                    emergencyConsentGiven = f.emergencyConsent,
                    preferredLanguage = f.preferredLanguage
                )
            ) {
                is NormalUserAuthResult.Authenticated -> {
                    val chosenLang = f.preferredLanguage
                    val profileWithLang = res.profile.copy(preferredLanguage = chosenLang)
                    prefs.setActiveAccountSession(profileWithLang.loboroId, chosenLang)
                    val langStrings = Translations.forLanguage(chosenLang)
                    val roleLabel = langStrings.userRoles[profileWithLang.role] ?: profileWithLang.role.name
                    _uiState.update {
                        it.copy(
                            activeLanguage = chosenLang,
                            activeRole = profileWithLang.role,
                            activeProfile = profileWithLang,
                            showDemoPreviewNotice = false,
                            normalUserSession = NormalUserSessionState(
                                isSignedIn = true,
                                sessionToken = res.sessionToken,
                                signedInProfile = profileWithLang
                            ),
                            normalUserRegForm = NormalUserRegistrationFormState(preferredLanguage = chosenLang),
                            feedbackBannerMessage = Translations.fmt(
                                langStrings.msgAccountCreatedFormat,
                                profileWithLang.fullName,
                                roleLabel,
                                profileWithLang.loboroId
                            )
                        )
                    }
                }
                is NormalUserAuthResult.Rejected -> {
                    _uiState.update {
                        it.copy(
                            normalUserRegForm = it.normalUserRegForm.copy(
                                isSubmitting = false,
                                statusMessage = res.reason,
                                isError = true
                            )
                        )
                    }
                }
                is NormalUserAuthResult.BackendNotConfigured -> {
                    _uiState.update {
                        it.copy(
                            normalUserRegForm = it.normalUserRegForm.copy(
                                isSubmitting = false,
                                statusMessage = res.reason,
                                isError = true
                            )
                        )
                    }
                }
            }
        }
    }

    fun updateNormalUserLoginForm(transform: (NormalUserLoginFormState) -> NormalUserLoginFormState) {
        _uiState.update { it.copy(normalUserLoginForm = transform(it.normalUserLoginForm)) }
    }

    fun requestNormalUserLoginOtp() {
        val str = s()
        val f = _uiState.value.normalUserLoginForm
        if (f.mobileNumber.filter { it.isDigit() }.length < 10) {
            _uiState.update {
                it.copy(
                    normalUserLoginForm = it.normalUserLoginForm.copy(
                        statusMessage = str.msgEnterValidMobile,
                        isError = true
                    )
                )
            }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(normalUserLoginForm = it.normalUserLoginForm.copy(isSubmitting = true)) }
            val res = normalUserAuthProvider.requestLoginOtp(f.mobileNumber.trim())
            res.onSuccess { sessionId ->
                _uiState.update {
                    it.copy(
                        normalUserLoginForm = it.normalUserLoginForm.copy(
                            isSubmitting = false,
                            otpSessionId = sessionId,
                            otpSent = true,
                            statusMessage = Translations.fmt(s().msgOtpDispatchedFormat, f.mobileNumber.trim()),
                            isError = false
                        )
                    )
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        normalUserLoginForm = it.normalUserLoginForm.copy(
                            isSubmitting = false,
                            otpSent = false,
                            statusMessage = err.message ?: s().msgUnableSendOtp,
                            isError = true
                        )
                    )
                }
            }
        }
    }

    fun verifyNormalUserLoginOtp() {
        val str = s()
        val f = _uiState.value.normalUserLoginForm
        val sessionId = f.otpSessionId
        if (sessionId == null || f.otpCodeInput.length < 4) {
            _uiState.update {
                it.copy(
                    normalUserLoginForm = it.normalUserLoginForm.copy(
                        statusMessage = str.msgSendOtpAndEnterCode,
                        isError = true
                    )
                )
            }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(normalUserLoginForm = it.normalUserLoginForm.copy(isSubmitting = true)) }
            when (val res = normalUserAuthProvider.verifyLoginOtp(sessionId, f.otpCodeInput.trim())) {
                is NormalUserAuthResult.Authenticated -> {
                    val savedAccountLang = prefs.getSavedLanguageForAccount(res.profile.loboroId)
                    val resolvedLang = if (res.profile.preferredLanguage != SupportedLanguage.ENGLISH) {
                        res.profile.preferredLanguage
                    } else {
                        savedAccountLang
                    }
                    prefs.setActiveAccountSession(res.profile.loboroId, resolvedLang)
                    val langStrings = Translations.forLanguage(resolvedLang)
                    val profileWithLang = res.profile.copy(preferredLanguage = resolvedLang)
                    _uiState.update {
                        it.copy(
                            activeLanguage = resolvedLang,
                            activeRole = profileWithLang.role,
                            activeProfile = profileWithLang,
                            showDemoPreviewNotice = false,
                            normalUserSession = NormalUserSessionState(
                                isSignedIn = true,
                                sessionToken = res.sessionToken,
                                signedInProfile = profileWithLang
                            ),
                            normalUserLoginForm = NormalUserLoginFormState(),
                            feedbackBannerMessage = Translations.fmt(
                                langStrings.msgLoggedInFormat,
                                profileWithLang.fullName,
                                profileWithLang.loboroId
                            )
                        )
                    }
                }
                is NormalUserAuthResult.Rejected -> {
                    _uiState.update {
                        it.copy(
                            normalUserLoginForm = it.normalUserLoginForm.copy(
                                isSubmitting = false,
                                statusMessage = res.reason,
                                isError = true
                            )
                        )
                    }
                }
                is NormalUserAuthResult.BackendNotConfigured -> {
                    _uiState.update {
                        it.copy(
                            normalUserLoginForm = it.normalUserLoginForm.copy(
                                isSubmitting = false,
                                statusMessage = res.reason,
                                isError = true
                            )
                        )
                    }
                }
            }
        }
    }

    fun logoutNormalUser() {
        val currentOwner = _uiState.value.ownerSession
        viewModelScope.launch {
            val fallbackAccountId = currentOwner.ownerProfile?.loboroId?.takeIf { currentOwner.isAuthenticated }
            prefs.setActiveAccountSession(fallbackAccountId, null)
            val restoredLang = prefs.getSavedLanguageForAccount(fallbackAccountId)
            val str = Translations.forLanguage(restoredLang)
            _uiState.update {
                it.copy(
                    activeLanguage = restoredLang,
                    activeRole = UserRole.WORKER,
                    activeProfile = LoboroDemoRepository.demoWorkerProfile.copy(preferredLanguage = restoredLang),
                    showDemoPreviewNotice = true,
                    normalUserSession = NormalUserSessionState(),
                    feedbackBannerMessage = str.msgSignedOut
                )
            }
        }
    }

    /**
     * Hidden Owner Access Trigger:
     * Requires exactly 10 consecutive taps on the capital "L" emblem within 5 seconds per tap.
     * Shows no visible hint on taps 1–9 so normal users never discover an Admin button.
     */
    fun onLoboroEmblemTap(): Boolean {
        val now = System.currentTimeMillis()
        if (now - lastLogoTapEpochMs > 5000L) {
            logoTapCount = 0
        }
        logoTapCount += 1
        lastLogoTapEpochMs = now
        if (logoTapCount >= 10) {
            logoTapCount = 0
            return true
        }
        return false
    }

    fun refreshOwnerBootstrapStatus() {
        viewModelScope.launch {
            when (val status = ownerAuthProvider.checkOwnerBootstrapStatus()) {
                is OwnerBootstrapStatus.Initialized -> {
                    prefs.saveOwnerInitializationMetadata(status.ownerProfile)
                    _uiState.update {
                        it.copy(
                            ownerBackendConfigured = true,
                            ownerSession = it.ownerSession.copy(
                                isOwnerInitialized = true,
                                ownerProfile = status.ownerProfile
                            )
                        )
                    }
                }
                is OwnerBootstrapStatus.Uninitialized -> {
                    _uiState.update { it.copy(ownerBackendConfigured = true) }
                }
                is OwnerBootstrapStatus.BackendNotConfigured -> {
                    _uiState.update {
                        it.copy(
                            ownerBackendConfigured = ownerAuthProvider.status == IntegrationStatus.CONNECTED
                        )
                    }
                }
            }
        }
    }

    fun updateOwnerRegistrationForm(transform: (OwnerRegistrationFormState) -> OwnerRegistrationFormState) {
        _uiState.update { it.copy(ownerRegistrationForm = transform(it.ownerRegistrationForm)) }
    }

    fun requestFirstOwnerOtp() {
        val current = _uiState.value
        val str = s()
        if (current.ownerSession.isOwnerInitialized) {
            _uiState.update {
                it.copy(
                    ownerRegistrationForm = it.ownerRegistrationForm.copy(
                        statusMessage = str.msgDuplicateOwnerBlocked,
                        isError = true
                    )
                )
            }
            return
        }
        val form = current.ownerRegistrationForm
        if (form.setupAuthorizationCode.isBlank()) {
            _uiState.update {
                it.copy(
                    ownerRegistrationForm = it.ownerRegistrationForm.copy(
                        statusMessage = str.msgBootstrapRequired,
                        isError = true
                    )
                )
            }
            return
        }
        if (form.mobileNumber.filter { it.isDigit() }.length < 10) {
            _uiState.update {
                it.copy(
                    ownerRegistrationForm = it.ownerRegistrationForm.copy(
                        statusMessage = str.msgEnterValidMobile,
                        isError = true
                    )
                )
            }
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(ownerRegistrationForm = it.ownerRegistrationForm.copy(isSubmitting = true)) }
            val result = ownerAuthProvider.requestFirstOwnerRegistrationOtp(
                setupAuthorizationCode = form.setupAuthorizationCode.trim(),
                mobileNumber = form.mobileNumber.trim()
            )
            result.onSuccess { otpSessionId ->
                _uiState.update {
                    it.copy(
                        ownerRegistrationForm = it.ownerRegistrationForm.copy(
                            isSubmitting = false,
                            otpSessionId = otpSessionId,
                            otpSent = true,
                            otpVerifiedOnServer = false,
                            statusMessage = Translations.fmt(s().msgOtpDispatchedFormat, form.mobileNumber.trim()),
                            isError = false
                        )
                    )
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        ownerRegistrationForm = it.ownerRegistrationForm.copy(
                            isSubmitting = false,
                            otpSent = false,
                            otpVerifiedOnServer = false,
                            statusMessage = err.message ?: s().msgUnableSendOtp,
                            isError = true
                        )
                    )
                }
            }
        }
    }

    fun verifyFirstOwnerOtp() {
        val str = s()
        val form = _uiState.value.ownerRegistrationForm
        val sessionId = form.otpSessionId
        if (sessionId == null || form.otpCodeInput.length < 4) {
            _uiState.update {
                it.copy(
                    ownerRegistrationForm = it.ownerRegistrationForm.copy(
                        statusMessage = str.msgSendOtpAndEnterCode,
                        isError = true
                    )
                )
            }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(ownerRegistrationForm = it.ownerRegistrationForm.copy(isSubmitting = true)) }
            val result = ownerAuthProvider.verifyFirstOwnerRegistrationOtp(sessionId, form.otpCodeInput.trim())
            result.onSuccess { verified ->
                val curStr = s()
                if (verified) {
                    _uiState.update {
                        it.copy(
                            ownerRegistrationForm = it.ownerRegistrationForm.copy(
                                isSubmitting = false,
                                otpVerifiedOnServer = true,
                                statusMessage = curStr.ownerMobileVerifiedNote,
                                isError = false
                            )
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            ownerRegistrationForm = it.ownerRegistrationForm.copy(
                                isSubmitting = false,
                                otpVerifiedOnServer = false,
                                statusMessage = curStr.msgIncorrectOtp,
                                isError = true
                            )
                        )
                    }
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        ownerRegistrationForm = it.ownerRegistrationForm.copy(
                            isSubmitting = false,
                            otpVerifiedOnServer = false,
                            statusMessage = err.message ?: s().msgServerOtpUnavailable,
                            isError = true
                        )
                    )
                }
            }
        }
    }

    fun submitFirstOwnerRegistration() {
        val current = _uiState.value
        val str = s()
        if (current.ownerSession.isOwnerInitialized) {
            _uiState.update {
                it.copy(
                    ownerRegistrationForm = it.ownerRegistrationForm.copy(
                        statusMessage = str.msgDuplicateOwnerBlocked,
                        isError = true
                    )
                )
            }
            return
        }
        val f = current.ownerRegistrationForm
        val validationError = when {
            f.setupAuthorizationCode.isBlank() -> str.msgBootstrapRequired
            f.fullName.trim().length < 2 -> str.msgEnterFullName
            f.mobileNumber.filter { it.isDigit() }.length < 10 -> str.msgEnterValidMobile
            !f.otpVerifiedOnServer || f.otpSessionId == null -> str.msgVerifyMobileOtpFirst
            f.loginPassword.isBlank() || f.confirmLoginPassword.isBlank() -> str.msgEnterPasswords
            f.loginPassword.length < 8 -> str.msgPasswordTooShort
            f.loginPassword != f.confirmLoginPassword -> str.msgPasswordsDoNotMatch
            f.adminPin.length != 4 || !f.adminPin.all { it.isDigit() } -> str.msgPinFourDigits
            f.adminPin != f.confirmAdminPin -> str.msgPinsDoNotMatch
            else -> null
        }
        if (validationError != null) {
            _uiState.update {
                it.copy(
                    ownerRegistrationForm = it.ownerRegistrationForm.copy(
                        statusMessage = validationError,
                        isError = true
                    )
                )
            }
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(ownerRegistrationForm = it.ownerRegistrationForm.copy(isSubmitting = true)) }
            when (
                val res = ownerAuthProvider.registerFirstOwner(
                    setupAuthorizationCode = f.setupAuthorizationCode.trim(),
                    fullName = f.fullName.trim(),
                    mobileNumber = f.mobileNumber.trim(),
                    otpSessionId = f.otpSessionId!!,
                    loginPassword = f.loginPassword,
                    adminPin = f.adminPin,
                    preferredLanguage = f.preferredLanguage
                )
            ) {
                is OwnerRegistrationResult.Registered -> {
                    val chosenLang = f.preferredLanguage
                    val profileWithLang = res.ownerProfile.copy(preferredLanguage = chosenLang)
                    prefs.saveOwnerInitializationMetadata(profileWithLang)
                    prefs.setOwnerPinLockoutState(0, 0L)
                    prefs.setActiveAccountSession(profileWithLang.loboroId, chosenLang)
                    val langStrings = Translations.forLanguage(chosenLang)
                    _uiState.update {
                        it.copy(
                            activeLanguage = chosenLang,
                            ownerSession = it.ownerSession.copy(
                                isOwnerInitialized = true,
                                ownerProfile = profileWithLang,
                                isAuthenticated = true,
                                sessionToken = res.sessionToken,
                                lastActivityEpochMs = System.currentTimeMillis(),
                                sessionTimeoutMs = res.expiresInSeconds * 1000L,
                                failedPinAttempts = 0,
                                lockoutUntilEpochMs = 0L,
                                pinStatusMessage = null
                            ),
                            ownerRegistrationForm = OwnerRegistrationFormState(preferredLanguage = chosenLang),
                            feedbackBannerMessage = Translations.fmt(
                                langStrings.msgOwnerCreatedFormat,
                                profileWithLang.fullName
                            )
                        )
                    }
                    recordAuditLog(
                        "FIRST_OWNER_REGISTERED",
                        "Single Owner account initialized for ${profileWithLang.fullName} (${profileWithLang.loboroId})."
                    )
                }

                is OwnerRegistrationResult.AlreadyInitialized -> {
                    _uiState.update {
                        it.copy(
                            ownerSession = it.ownerSession.copy(isOwnerInitialized = true),
                            ownerRegistrationForm = it.ownerRegistrationForm.copy(
                                isSubmitting = false,
                                statusMessage = res.reason,
                                isError = true
                            )
                        )
                    }
                }

                is OwnerRegistrationResult.Rejected -> {
                    _uiState.update {
                        it.copy(
                            ownerRegistrationForm = it.ownerRegistrationForm.copy(
                                isSubmitting = false,
                                statusMessage = res.reason,
                                isError = true
                            )
                        )
                    }
                }

                is OwnerRegistrationResult.BackendNotConfigured -> {
                    _uiState.update {
                        it.copy(
                            ownerRegistrationForm = it.ownerRegistrationForm.copy(
                                isSubmitting = false,
                                statusMessage = res.reason,
                                isError = true
                            )
                        )
                    }
                }
            }
        }
    }

    fun submitOwnerPin(pin: String) {
        val now = System.currentTimeMillis()
        val str = s()
        val session = _uiState.value.ownerSession
        if (now < session.lockoutUntilEpochMs) {
            val secondsLeft = ((session.lockoutUntilEpochMs - now) / 1000L).coerceAtLeast(1L)
            _uiState.update {
                it.copy(
                    ownerSession = it.ownerSession.copy(
                        pinStatusMessage = Translations.fmt(str.msgTooManyPinAttemptsFormat, secondsLeft)
                    )
                )
            }
            return
        }
        if (pin.length != 4 || !pin.all { it.isDigit() }) {
            _uiState.update {
                it.copy(
                    ownerSession = it.ownerSession.copy(
                        pinStatusMessage = str.msgPinFourDigits
                    )
                )
            }
            return
        }

        viewModelScope.launch {
            when (val result = ownerAuthProvider.verifyOwnerPin(pin)) {
                is OwnerPinVerificationResult.Verified -> {
                    prefs.setOwnerPinLockoutState(0, 0L)
                    prefs.saveOwnerInitializationMetadata(result.ownerProfile)
                    val savedLang = prefs.getSavedLanguageForAccount(result.ownerProfile.loboroId)
                    val effectiveLang = if (result.ownerProfile.preferredLanguage != SupportedLanguage.ENGLISH) {
                        result.ownerProfile.preferredLanguage
                    } else {
                        savedLang
                    }
                    prefs.setActiveAccountSession(result.ownerProfile.loboroId, effectiveLang)
                    val langStrings = Translations.forLanguage(effectiveLang)
                    _uiState.update {
                        it.copy(
                            activeLanguage = effectiveLang,
                            ownerSession = it.ownerSession.copy(
                                isOwnerInitialized = true,
                                ownerProfile = result.ownerProfile.copy(preferredLanguage = effectiveLang),
                                isAuthenticated = true,
                                sessionToken = result.sessionToken,
                                lastActivityEpochMs = System.currentTimeMillis(),
                                sessionTimeoutMs = result.expiresInSeconds * 1000L,
                                failedPinAttempts = 0,
                                lockoutUntilEpochMs = 0L,
                                pinStatusMessage = null
                            ),
                            feedbackBannerMessage = langStrings.msgOwnerUnlocked
                        )
                    }
                    recordAuditLog("OWNER_LOGIN", "Verified 4-digit Owner PIN via server.")
                }

                is OwnerPinVerificationResult.InvalidPin -> {
                    val curStr = s()
                    val nextFailed = _uiState.value.ownerSession.failedPinAttempts + 1
                    val lockoutDurationMs = when {
                        nextFailed >= 7 -> 120_000L
                        nextFailed >= 5 -> 30_000L
                        else -> 0L
                    }
                    val lockoutUntil = if (lockoutDurationMs > 0L) System.currentTimeMillis() + lockoutDurationMs else 0L
                    prefs.setOwnerPinLockoutState(nextFailed, lockoutUntil)
                    _uiState.update {
                        it.copy(
                            ownerSession = it.ownerSession.copy(
                                failedPinAttempts = nextFailed,
                                lockoutUntilEpochMs = lockoutUntil,
                                pinStatusMessage = if (lockoutDurationMs > 0L) {
                                    Translations.fmt(curStr.msgTooManyPinAttemptsFormat, lockoutDurationMs / 1000L)
                                } else {
                                    Translations.fmt(curStr.msgInvalidPinAttemptsFormat, result.attemptsRemaining)
                                }
                            )
                        )
                    }
                }

                is OwnerPinVerificationResult.RateLimited -> {
                    val lockoutUntil = System.currentTimeMillis() + result.retryAfterSeconds * 1000L
                    prefs.setOwnerPinLockoutState(_uiState.value.ownerSession.failedPinAttempts + 1, lockoutUntil)
                    _uiState.update {
                        it.copy(
                            ownerSession = it.ownerSession.copy(
                                lockoutUntilEpochMs = lockoutUntil,
                                pinStatusMessage = Translations.fmt(s().msgTooManyPinAttemptsFormat, result.retryAfterSeconds)
                            )
                        )
                    }
                }

                is OwnerPinVerificationResult.BackendNotConfigured -> {
                    val nextFailed = _uiState.value.ownerSession.failedPinAttempts + 1
                    val lockoutDurationMs = if (nextFailed >= 5) 30_000L else 0L
                    val lockoutUntil = if (lockoutDurationMs > 0L) System.currentTimeMillis() + lockoutDurationMs else 0L
                    prefs.setOwnerPinLockoutState(nextFailed, lockoutUntil)
                    _uiState.update {
                        it.copy(
                            ownerSession = it.ownerSession.copy(
                                failedPinAttempts = nextFailed,
                                lockoutUntilEpochMs = lockoutUntil,
                                pinStatusMessage = result.reason
                            )
                        )
                    }
                }
            }
        }
    }

    fun touchOwnerSessionActivity() {
        if (_uiState.value.ownerSession.isAuthenticated) {
            _uiState.update {
                it.copy(ownerSession = it.ownerSession.copy(lastActivityEpochMs = System.currentTimeMillis()))
            }
        }
    }

    fun logoutOwnerSession(reason: String? = null) {
        val finalReason = reason ?: s().msgOwnerLockedSession
        if (_uiState.value.ownerSession.isAuthenticated) {
            recordAuditLog("OWNER_LOGOUT", finalReason)
        }
        val fallbackNormalId = _uiState.value.normalUserSession.signedInProfile?.loboroId
        viewModelScope.launch {
            prefs.setActiveAccountSession(fallbackNormalId, null)
            val restoredLang = prefs.getSavedLanguageForAccount(fallbackNormalId)
            _uiState.update {
                it.copy(
                    activeLanguage = restoredLang,
                    ownerSession = it.ownerSession.copy(
                        isAuthenticated = false,
                        sessionToken = null,
                        lastActivityEpochMs = 0L,
                        pinStatusMessage = null
                    ),
                    pinChangeState = OwnerPinChangeState(),
                    feedbackBannerMessage = finalReason
                )
            }
        }
    }

    fun updatePinChangeFields(transform: (OwnerPinChangeState) -> OwnerPinChangeState) {
        touchOwnerSessionActivity()
        _uiState.update { it.copy(pinChangeState = transform(it.pinChangeState)) }
    }

    fun requestOwnerPinChangeOtp() {
        touchOwnerSessionActivity()
        val session = _uiState.value.ownerSession
        val sessionToken = session.sessionToken
        if (!session.isAuthenticated || sessionToken.isNullOrBlank()) {
            _uiState.update {
                it.copy(
                    pinChangeState = it.pinChangeState.copy(
                        statusMessage = s().msgOwnerSessionRequired,
                        isError = true
                    )
                )
            }
            return
        }
        viewModelScope.launch {
            val res = ownerAuthProvider.requestOwnerPinChangeOtp(sessionToken)
            res.onSuccess { sessionId ->
                val curStr = s()
                recordAuditLog("OWNER_PIN_OTP_SENT", "OTP dispatched to Owner's previously registered mobile.")
                _uiState.update {
                    it.copy(
                        pinChangeState = it.pinChangeState.copy(
                            step = PinChangeStep.ENTER_OTP,
                            otpSessionId = sessionId,
                            statusMessage = Translations.fmt(
                                curStr.otpDispatchedNote,
                                session.ownerProfile?.maskedMobile ?: "••••"
                            ),
                            isError = false
                        )
                    )
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        pinChangeState = it.pinChangeState.copy(
                            statusMessage = err.message ?: s().msgUnableSendOtp,
                            isError = true
                        )
                    )
                }
            }
        }
    }

    fun verifyOwnerPinChangeOtp() {
        touchOwnerSessionActivity()
        val str = s()
        val session = _uiState.value.ownerSession
        val sessionToken = session.sessionToken
        if (!session.isAuthenticated || sessionToken.isNullOrBlank()) {
            _uiState.update {
                it.copy(
                    pinChangeState = it.pinChangeState.copy(
                        statusMessage = str.msgOwnerSessionRequired,
                        isError = true
                    )
                )
            }
            return
        }
        val pcs = _uiState.value.pinChangeState
        val otpSessionId = pcs.otpSessionId
        if (otpSessionId == null || pcs.otpCodeInput.length < 4) {
            _uiState.update {
                it.copy(
                    pinChangeState = it.pinChangeState.copy(
                        statusMessage = str.msgSendOtpAndEnterCode,
                        isError = true
                    )
                )
            }
            return
        }
        viewModelScope.launch {
            val res = ownerAuthProvider.verifyOwnerPinChangeOtp(sessionToken, otpSessionId, pcs.otpCodeInput)
            res.onSuccess { verified ->
                val curStr = s()
                if (verified) {
                    recordAuditLog("OWNER_PIN_OTP_VERIFIED", "Server verified OTP for PIN change.")
                    _uiState.update {
                        it.copy(
                            pinChangeState = it.pinChangeState.copy(
                                step = PinChangeStep.ENTER_NEW_PIN,
                                otpVerifiedOnServer = true,
                                statusMessage = curStr.otpVerifiedNewPinNote,
                                isError = false
                            )
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            pinChangeState = it.pinChangeState.copy(
                                otpVerifiedOnServer = false,
                                statusMessage = curStr.msgIncorrectOtp,
                                isError = true
                            )
                        )
                    }
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        pinChangeState = it.pinChangeState.copy(
                            otpVerifiedOnServer = false,
                            statusMessage = err.message ?: s().msgServerOtpUnavailable,
                            isError = true
                        )
                    )
                }
            }
        }
    }

    fun commitNewOwnerPin() {
        touchOwnerSessionActivity()
        val str = s()
        val state = _uiState.value
        val sessionToken = state.ownerSession.sessionToken
        val pcs = state.pinChangeState
        if (!state.ownerSession.isAuthenticated || sessionToken.isNullOrBlank() || !pcs.otpVerifiedOnServer || pcs.otpSessionId == null) {
            _uiState.update {
                it.copy(
                    pinChangeState = it.pinChangeState.copy(
                        statusMessage = str.msgVerifyOtpBeforePinChange,
                        isError = true
                    )
                )
            }
            return
        }
        if (pcs.newPinInput.length != 4 || !pcs.newPinInput.all { it.isDigit() }) {
            _uiState.update {
                it.copy(pinChangeState = it.pinChangeState.copy(statusMessage = str.msgPinFourDigits, isError = true))
            }
            return
        }
        if (pcs.newPinInput != pcs.confirmPinInput) {
            _uiState.update {
                it.copy(pinChangeState = it.pinChangeState.copy(statusMessage = str.msgPinsDoNotMatch, isError = true))
            }
            return
        }
        viewModelScope.launch {
            when (val res = ownerAuthProvider.updateOwnerPin(sessionToken, pcs.otpSessionId, pcs.newPinInput)) {
                OwnerPinChangeResult.Updated -> {
                    val curStr = s()
                    recordAuditLog("OWNER_PIN_CHANGED", "Owner 4-digit PIN rotated after OTP verification.")
                    _uiState.update {
                        it.copy(
                            pinChangeState = OwnerPinChangeState(
                                step = PinChangeStep.COMPLETED,
                                statusMessage = curStr.msgPinUpdatedSuccess,
                                isError = false
                            ),
                            feedbackBannerMessage = curStr.msgPinUpdatedSuccess
                        )
                    }
                }
                is OwnerPinChangeResult.Rejected -> {
                    _uiState.update {
                        it.copy(pinChangeState = it.pinChangeState.copy(statusMessage = res.reason, isError = true))
                    }
                }
                is OwnerPinChangeResult.BackendNotConfigured -> {
                    _uiState.update {
                        it.copy(pinChangeState = it.pinChangeState.copy(statusMessage = res.reason, isError = true))
                    }
                }
            }
        }
    }

    private fun recordAuditLog(action: String, details: String) {
        val entry = OwnerAuditLogEntry(
            id = "AUD-${System.currentTimeMillis() % 100000}",
            timestampLabel = "Just now",
            actorId = "OWNER",
            action = action,
            details = details
        )
        _uiState.update { it.copy(ownerAuditLogs = listOf(entry) + it.ownerAuditLogs) }
    }

    fun registerPreviewProfile(
        role: UserRole,
        fullName: String,
        homeState: String,
        homeDistrict: String,
        currentCity: String,
        skillsText: String,
        emergencyName: String,
        emergencyPhone: String,
        emergencyConsent: Boolean,
        photoUri: String?,
        faceCaptured: Boolean
    ) {
        val str = s()
        val safeRole = if (role == UserRole.OWNER_SUPER_ADMIN) UserRole.WORKER else role
        val generatedId = LoboroIdRegistry.generateNextStandardId(300 + (fullName.hashCode() and 0xFF))
        val newProfile = UserProfile(
            loboroId = generatedId,
            role = safeRole,
            fullName = fullName.ifBlank { str.userRoles[safeRole] ?: "LOBORO Member" },
            mobileMasked = "+91 98••••0000",
            homeState = homeState.ifBlank { "Assam" },
            homeDistrict = homeDistrict.ifBlank { "Barpeta" },
            currentCityState = currentCity.ifBlank { "Hyderabad, Telangana" },
            willingToRelocate = true,
            skills = skillsText.split(",").map { it.trim() }.filter { it.isNotEmpty() },
            experienceYears = 2,
            jobPreference = JobType.DAILY,
            badgeLevel = BadgeLevel.NONE,
            verifiedWorkdays = 0,
            completedJobs = 0,
            rating = 5.0,
            memberMonths = 1,
            emergencyContactName = emergencyName,
            emergencyContactPhoneMasked = emergencyPhone,
            emergencyConsentGiven = emergencyConsent,
            profilePhotoUri = photoUri,
            faceRegistrationCaptured = faceCaptured,
            isOwnerAccount = false,
            preferredLanguage = _uiState.value.activeLanguage
        )
        _uiState.update {
            it.copy(
                activeRole = safeRole,
                activeProfile = newProfile,
                feedbackBannerMessage = Translations.fmt(
                    str.msgDemoProfileUpdatedFormat,
                    newProfile.fullName,
                    generatedId
                )
            )
        }
    }

    fun selectJobTypeTab(type: JobType) {
        _uiState.update { it.copy(activeJobTypeTab = type) }
    }

    fun updateSearchQuery(query: String) {
        val str = s()
        val dailyTokens = listOf(
            "daily", str.dailyJobsTitle, "रोज", "दैनिक", "દૈનિક", "రోజువారీ",
            "தினசரி", "দৈনিক", "দৈনন্দিন", "ದೈನಂದಿನ", "ദിവസേന", "ਰੋਜ਼ਾਨਾ", "ଦୈନିକ"
        )
        val monthlyTokens = listOf(
            "monthly", "salary", str.monthlyJobsTitle, "सैलरी", "महीने", "मासिक", "માસિક",
            "నెలవారీ", "மாதாந்திர", "মাসিক", "মাহেকীয়া", "ತಿಂಗಳ", "പ്രതിമാസ", "ਮਹੀਨਾਵਾਰ", "ମାସିକ"
        )
        _uiState.update { state ->
            val inferredType = when {
                dailyTokens.any { token -> token.isNotBlank() && query.contains(token, ignoreCase = true) } -> JobType.DAILY
                monthlyTokens.any { token -> token.isNotBlank() && query.contains(token, ignoreCase = true) } -> JobType.MONTHLY
                else -> state.activeJobTypeTab
            }
            state.copy(
                activeJobTypeTab = inferredType,
                filters = state.filters.copy(query = query)
            )
        }
    }

    fun updateFilters(transform: (JobSearchFilters) -> JobSearchFilters) {
        _uiState.update { it.copy(filters = transform(it.filters)) }
    }

    fun clearFilters() {
        _uiState.update { it.copy(filters = JobSearchFilters()) }
    }

    fun toggleFavoriteJob(jobId: String) {
        viewModelScope.launch { prefs.toggleFavoriteJob(jobId) }
    }

    fun applyToJob(job: JobListing) {
        val state = _uiState.value
        val str = s()
        val displayTitle = job.localizedTitles[state.activeLanguage] ?: job.title
        val alreadyApplied = state.applications.any {
            it.jobId == job.id && it.workerLoboroId == state.activeProfile.loboroId && it.status != ApplicationStatus.WITHDRAWN
        }
        if (alreadyApplied) {
            _uiState.update {
                it.copy(feedbackBannerMessage = Translations.fmt(str.msgAlreadyAppliedFormat, displayTitle))
            }
            return
        }
        val wageText = if (job.jobType == JobType.DAILY) {
            Translations.fmt(str.perDayFormat, job.wageOrSalaryInr)
        } else {
            Translations.fmt(str.perMonthFormat, job.wageOrSalaryInr)
        }
        val app = JobApplication(
            id = "APP-${System.currentTimeMillis() % 10000}",
            jobId = job.id,
            jobTitle = job.title,
            jobType = job.jobType,
            cityState = "${job.city}, ${job.state}",
            wageLabel = wageText,
            workerLoboroId = state.activeProfile.loboroId,
            workerName = state.activeProfile.fullName,
            employerLoboroId = job.employerLoboroId,
            employerName = job.employerName,
            status = ApplicationStatus.APPLIED,
            appliedAtLabel = str.demoDataTag,
            localizedTitles = job.localizedTitles
        )
        _uiState.update {
            it.copy(
                applications = listOf(app) + it.applications,
                feedbackBannerMessage = Translations.fmt(str.msgApplicationSentFormat, displayTitle)
            )
        }
    }

    fun withdrawApplication(appId: String) {
        val str = s()
        _uiState.update { state ->
            state.copy(
                applications = state.applications.map {
                    if (it.id == appId) it.copy(status = ApplicationStatus.WITHDRAWN) else it
                },
                feedbackBannerMessage = Translations.fmt(str.msgApplicationWithdrawnFormat, appId)
            )
        }
    }

    fun updateApplicationStatus(appId: String, newStatus: ApplicationStatus) {
        val str = s()
        val statusLabel = str.applicationStatuses[newStatus] ?: newStatus.name
        _uiState.update { state ->
            state.copy(
                applications = state.applications.map {
                    if (it.id == appId) it.copy(status = newStatus) else it
                },
                feedbackBannerMessage = Translations.fmt(str.msgApplicationUpdatedFormat, appId, statusLabel)
            )
        }
    }

    fun postJobPreview(
        title: String,
        description: String,
        jobType: JobType,
        category: JobCategoryId,
        wageOrSalary: Int,
        stateName: String,
        cityName: String,
        workersNeeded: Int,
        workHours: String,
        foodProvided: Boolean,
        accommodationProvided: Boolean,
        overtimeDetails: String,
        weeklyHoliday: String,
        leavePolicy: String,
        joiningDate: String
    ) {
        val current = _uiState.value
        val str = s()
        val feeCoins = calculateJobFeeCoins(jobType, category, current.feeConfig)
        if (current.wallet.availableCoins < feeCoins) {
            _uiState.update {
                it.copy(
                    feedbackBannerMessage = "${Translations.fmt(str.coinsCountFormat, feeCoins)} — ${str.paymentNotConnectedBody}"
                )
            }
            return
        }
        val categoryLabel = str.categories[category] ?: category.defaultName
        val newJob = JobListing(
            id = "JOB-${if (jobType == JobType.DAILY) "D" else "M"}-${(100..999).random()}",
            title = title.ifBlank { categoryLabel },
            originalLanguage = current.activeLanguage,
            description = description.ifBlank { categoryLabel },
            jobType = jobType,
            category = category,
            wageOrSalaryInr = wageOrSalary.coerceAtLeast(300),
            state = stateName,
            district = cityName,
            city = cityName,
            distanceKm = 5,
            workHours = workHours.ifBlank { "9:00 AM – 6:00 PM" },
            workersRequired = workersNeeded.coerceAtLeast(1),
            foodProvided = foodProvided,
            accommodationProvided = accommodationProvided,
            overtimeDetails = overtimeDetails.ifBlank { "—" },
            paymentFrequency = if (jobType == JobType.DAILY) str.dailyJobsTitle else str.monthlyJobsTitle,
            weeklyHoliday = if (jobType == JobType.MONTHLY) weeklyHoliday else "",
            leavePolicy = if (jobType == JobType.MONTHLY) leavePolicy else "",
            joiningDate = if (jobType == JobType.MONTHLY) joiningDate else "",
            employerLoboroId = current.activeProfile.loboroId,
            employerName = current.activeProfile.fullName,
            employerBadge = current.activeProfile.badgeLevel,
            employerRating = current.activeProfile.rating,
            expiryLabel = str.demoDataTag
        )
        val feeLabel = str.transactionTypes[TransactionType.JOB_FEE] ?: "Job Fee"
        val feeTx = WalletTransaction(
            id = "TX-${System.currentTimeMillis() % 10000}",
            referenceId = "FEE-POST-${newJob.id}",
            type = TransactionType.JOB_FEE,
            coins = -feeCoins,
            inrValue = feeCoins * current.feeConfig.coinPriceInr,
            status = TransactionStatus.SUCCESSFUL,
            title = "$feeLabel (${newJob.id})",
            timestampLabel = str.demoDataTag
        )
        val newBalance = current.wallet.availableCoins - feeCoins
        val localizedState = str.indianStates[stateName] ?: stateName
        _uiState.update {
            it.copy(
                jobs = listOf(newJob) + it.jobs,
                wallet = it.wallet.copy(
                    availableCoins = newBalance,
                    withdrawableBalanceInr = newBalance * current.feeConfig.coinPriceInr,
                    transactions = listOf(feeTx) + it.wallet.transactions
                ),
                feedbackBannerMessage = Translations.fmt(str.msgJobPostedFormat, "$cityName, $localizedState", feeCoins)
            )
        }
    }

    fun calculateJobFeeCoins(jobType: JobType, category: JobCategoryId, config: FeeConfig): Int {
        return if (jobType == JobType.MONTHLY) {
            config.monthlySalaryJobCoins
        } else if (category.isSpecialSkill) {
            config.specialDailyJobCoins
        } else {
            config.normalDailyJobCoins
        }
    }

    fun toggleWithdrawalsFreeze() {
        val str = s()
        _uiState.update { state ->
            val frozen = !state.wallet.withdrawalsFrozenByUser
            state.copy(
                wallet = state.wallet.copy(withdrawalsFrozenByUser = frozen),
                feedbackBannerMessage = if (frozen) str.msgWithdrawalsFrozen else str.msgWithdrawalsUnfrozen
            )
        }
    }

    fun sendChatMessage(threadId: String, text: String) {
        if (text.isBlank()) return
        val current = _uiState.value
        _uiState.update { state ->
            state.copy(
                chatThreads = state.chatThreads.map { thread ->
                    if (thread.id == threadId && !thread.isBlocked) {
                        val msg = ChatMessage(
                            id = "MSG-${System.currentTimeMillis()}",
                            senderLoboroId = current.activeProfile.loboroId,
                            senderLabel = current.activeProfile.loboroId,
                            text = text.trim(),
                            timestampLabel = "•"
                        )
                        thread.copy(messages = thread.messages + msg)
                    } else thread
                }
            )
        }
    }

    fun toggleBlockChat(threadId: String) {
        val str = s()
        _uiState.update { state ->
            state.copy(
                chatThreads = state.chatThreads.map {
                    if (it.id == threadId) it.copy(isBlocked = !it.isBlocked) else it
                },
                feedbackBannerMessage = str.userBlockedNotice
            )
        }
    }

    fun respondWeeklyCheckIn(option: Int) {
        val str = s()
        val label = when (option) {
            1 -> str.msgCheckInSafeRecorded
            2 -> str.msgCheckInProblemRecorded
            else -> str.msgCheckInAdminRequested
        }
        _uiState.update { state ->
            val extraCases = if (option == 2 || option == 3) {
                listOf(
                    SafetyCase(
                        id = "SAFE-${(400..999).random()}",
                        workerLoboroId = state.activeProfile.loboroId,
                        employerLoboroId = "LB3232",
                        jobTitle = str.weeklyCheckInTitle,
                        location = state.activeProfile.currentCityState,
                        category = SafetyComplaintCategory.OTHER_EMERGENCY,
                        description = label,
                        timestampLabel = str.demoDataTag,
                        urgency = if (option == 2) SafetyUrgency.CRITICAL else SafetyUrgency.HIGH,
                        status = SafetyCaseStatus.NEW,
                        actionHistory = listOf(label),
                        localizedJobTitles = SupportedLanguage.entries.associateWith {
                            Translations.forLanguage(it).weeklyCheckInTitle
                        },
                        localizedDescriptions = SupportedLanguage.entries.associateWith { lang ->
                            val ls = Translations.forLanguage(lang)
                            when (option) {
                                2 -> ls.msgCheckInProblemRecorded
                                else -> ls.msgCheckInAdminRequested
                            }
                        }
                    )
                ) + state.safetyCases
            } else state.safetyCases

            state.copy(
                weeklyCheckIn = state.weeklyCheckIn.copy(
                    lastCheckInLabel = label,
                    pendingPrompt = false
                ),
                safetyCases = extraCases,
                feedbackBannerMessage = label
            )
        }
    }

    fun submitSafetyComplaint(
        category: SafetyComplaintCategory,
        employerId: String,
        location: String,
        description: String
    ) {
        val current = _uiState.value
        val str = s()
        val catLabel = str.safetyCategories[category] ?: category.name
        val newCase = SafetyCase(
            id = "SAFE-${(400..999).random()}",
            workerLoboroId = current.activeProfile.loboroId,
            employerLoboroId = employerId.ifBlank { "—" },
            jobTitle = catLabel,
            location = location.ifBlank { current.activeProfile.currentCityState },
            category = category,
            description = description.ifBlank { catLabel },
            timestampLabel = str.demoDataTag,
            urgency = if (category == SafetyComplaintCategory.PHYSICAL_ABUSE || category == SafetyComplaintCategory.HARASSMENT) {
                SafetyUrgency.CRITICAL
            } else {
                SafetyUrgency.HIGH
            },
            status = SafetyCaseStatus.NEW,
            actionHistory = listOf("${current.activeProfile.loboroId} · $catLabel"),
            localizedJobTitles = SupportedLanguage.entries.associateWith { lang ->
                Translations.forLanguage(lang).safetyCategories[category] ?: catLabel
            }
        )
        _uiState.update {
            it.copy(
                safetyCases = listOf(newCase) + it.safetyCases,
                feedbackBannerMessage = Translations.fmt(str.msgSafetyComplaintSubmittedFormat, newCase.id)
            )
        }
    }

    fun advanceSafetyCaseStatus(caseId: String, nextStatus: SafetyCaseStatus) {
        val statusLabel = s().safetyStatuses[nextStatus] ?: nextStatus.name
        _uiState.update { state ->
            state.copy(
                safetyCases = state.safetyCases.map { c ->
                    if (c.id == caseId) {
                        c.copy(
                            status = nextStatus,
                            actionHistory = c.actionHistory + statusLabel
                        )
                    } else c
                }
            )
        }
    }

    fun dismissNotice(noticeId: String) {
        _uiState.update { it.copy(dismissedNoticeIds = it.dismissedNoticeIds + noticeId) }
    }

    fun publishAdminNotice(message: String, actionLabel: String, targetAudience: String, regionScope: String) {
        if (!_uiState.value.ownerSession.isAuthenticated || message.isBlank()) return
        touchOwnerSessionActivity()
        val str = s()
        val newNotice = AdminNotice(
            id = "NTC-${System.currentTimeMillis() % 10000}",
            message = message.trim(),
            actionLabel = actionLabel.ifBlank { str.understoodLabel },
            targetRoute = "safety",
            targetAudience = targetAudience,
            regionScope = regionScope,
            expiryLabel = "30d",
            isRead = false,
            timestampLabel = str.demoDataTag,
            isActive = true
        )
        recordAuditLog("ADMIN_NOTICE_PUBLISHED", "$targetAudience ($regionScope): ${newNotice.message}")
        _uiState.update {
            it.copy(
                adminNotices = listOf(newNotice) + it.adminNotices,
                feedbackBannerMessage = str.msgOwnerNoticePublished
            )
        }
    }

    fun updateMasterControls(actionLabel: String = "MASTER_CONTROL_UPDATED", transform: (MasterFeatureControls) -> MasterFeatureControls) {
        if (!_uiState.value.ownerSession.isAuthenticated) return
        touchOwnerSessionActivity()
        val updated = transform(_uiState.value.masterControls)
        _uiState.update { it.copy(masterControls = updated) }
        recordAuditLog(actionLabel, "Scope: ${updated.activeScopeLabel}")
    }

    fun updateFeeConfig(transform: (FeeConfig) -> FeeConfig) {
        if (!_uiState.value.ownerSession.isAuthenticated) return
        touchOwnerSessionActivity()
        _uiState.update { state ->
            val updated = transform(state.feeConfig)
            state.copy(
                feeConfig = updated,
                wallet = state.wallet.copy(
                    coinValueInr = updated.coinPriceInr,
                    withdrawableBalanceInr = state.wallet.availableCoins * updated.coinPriceInr
                )
            )
        }
        recordAuditLog("FEE_CONFIG_UPDATED", "Updated coin pricing / charge event.")
    }

    fun toggleCategoryActive(categoryId: JobCategoryId) {
        if (!_uiState.value.ownerSession.isAuthenticated) return
        touchOwnerSessionActivity()
        _uiState.update { state ->
            state.copy(
                categoryConfigs = state.categoryConfigs.map {
                    if (it.id == categoryId) it.copy(active = !it.active) else it
                }
            )
        }
        recordAuditLog("CATEGORY_TOGGLED", "Toggled category ${categoryId.name}")
    }

    fun clearFeedbackBanner() {
        _uiState.update { it.copy(feedbackBannerMessage = null) }
    }
}
