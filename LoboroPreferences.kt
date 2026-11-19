package com.example.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.example.domain.model.OwnerProfileSummary
import com.example.domain.model.SupportedLanguage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.loboroDataStore by preferencesDataStore(name = "loboro_prefs")

class LoboroPreferences(
    private val context: Context,
    private val dataStoreOverride: DataStore<Preferences>? = null
) {

    private val store: DataStore<Preferences>
        get() = dataStoreOverride ?: context.loboroDataStore

    private object Keys {
        val SELECTED_LANGUAGE = stringPreferencesKey("selected_language")
        val ACTIVE_ACCOUNT_ID = stringPreferencesKey("active_account_id")
        val LOW_DATA_MODE = booleanPreferencesKey("low_data_mode")
        val REDUCED_MOTION = booleanPreferencesKey("reduced_motion")
        val FAVORITE_JOB_IDS = stringSetPreferencesKey("favorite_job_ids")
        val OWNER_PIN_FAILED_ATTEMPTS = intPreferencesKey("owner_pin_failed_attempts")
        val OWNER_PIN_LOCKOUT_UNTIL_MS = longPreferencesKey("owner_pin_lockout_until_ms")
        val OWNER_INITIALIZED = booleanPreferencesKey("owner_initialized")
        val OWNER_PROFILE_ID = stringPreferencesKey("owner_profile_id")
        val OWNER_PROFILE_NAME = stringPreferencesKey("owner_profile_name")
        val OWNER_PROFILE_MASKED_MOBILE = stringPreferencesKey("owner_profile_masked_mobile")
        val OWNER_INITIALIZED_AT = stringPreferencesKey("owner_initialized_at")
        val OWNER_PREFERRED_LANGUAGE = stringPreferencesKey("owner_preferred_language")

        fun accountLanguageKey(accountId: String) =
            stringPreferencesKey("account_lang_${accountId.uppercase().trim()}")
    }

    val selectedLanguage: Flow<SupportedLanguage> = store.data.map { prefs ->
        val activeAccountId = prefs[Keys.ACTIVE_ACCOUNT_ID]
        val code = if (!activeAccountId.isNullOrBlank()) {
            prefs[Keys.accountLanguageKey(activeAccountId)] ?: prefs[Keys.SELECTED_LANGUAGE]
        } else {
            prefs[Keys.SELECTED_LANGUAGE]
        } ?: SupportedLanguage.ENGLISH.code
        SupportedLanguage.entries.firstOrNull { it.code == code } ?: SupportedLanguage.ENGLISH
    }

    val lowDataMode: Flow<Boolean> = store.data.map { prefs ->
        prefs[Keys.LOW_DATA_MODE] ?: false
    }

    val reducedMotion: Flow<Boolean> = store.data.map { prefs ->
        prefs[Keys.REDUCED_MOTION] ?: false
    }

    val favoriteJobIds: Flow<Set<String>> = store.data.map { prefs ->
        prefs[Keys.FAVORITE_JOB_IDS] ?: emptySet()
    }

    val ownerPinFailedAttempts: Flow<Int> = store.data.map { prefs ->
        prefs[Keys.OWNER_PIN_FAILED_ATTEMPTS] ?: 0
    }

    val ownerPinLockoutUntilMs: Flow<Long> = store.data.map { prefs ->
        prefs[Keys.OWNER_PIN_LOCKOUT_UNTIL_MS] ?: 0L
    }

    val ownerInitialized: Flow<Boolean> = store.data.map { prefs ->
        prefs[Keys.OWNER_INITIALIZED] ?: false
    }

    val ownerProfileSummary: Flow<OwnerProfileSummary?> = store.data.map { prefs ->
        if (prefs[Keys.OWNER_INITIALIZED] == true) {
            val langCode = prefs[Keys.OWNER_PREFERRED_LANGUAGE] ?: SupportedLanguage.ENGLISH.code
            val lang = SupportedLanguage.entries.firstOrNull { it.code == langCode } ?: SupportedLanguage.ENGLISH
            OwnerProfileSummary(
                loboroId = prefs[Keys.OWNER_PROFILE_ID] ?: "OWNER-MASTER-01",
                fullName = prefs[Keys.OWNER_PROFILE_NAME] ?: "LOBORO Owner",
                maskedMobile = prefs[Keys.OWNER_PROFILE_MASKED_MOBILE] ?: "••••",
                initializedAtLabel = prefs[Keys.OWNER_INITIALIZED_AT] ?: "Verified",
                preferredLanguage = lang
            )
        } else null
    }

    data class AppPreferencesSnapshot(
        val selectedLanguage: SupportedLanguage,
        val lowDataMode: Boolean,
        val reducedMotion: Boolean,
        val favoriteJobIds: Set<String>,
        val ownerPinFailedAttempts: Int,
        val ownerPinLockoutUntilMs: Long,
        val ownerProfileSummary: OwnerProfileSummary?
    )

    val snapshot: Flow<AppPreferencesSnapshot> = store.data.map { prefs ->
        val activeAccountId = prefs[Keys.ACTIVE_ACCOUNT_ID]
        val langCode = if (!activeAccountId.isNullOrBlank()) {
            prefs[Keys.accountLanguageKey(activeAccountId)] ?: prefs[Keys.SELECTED_LANGUAGE]
        } else {
            prefs[Keys.SELECTED_LANGUAGE]
        } ?: SupportedLanguage.ENGLISH.code
        val language = SupportedLanguage.entries.firstOrNull { it.code == langCode } ?: SupportedLanguage.ENGLISH

        val summary = if (prefs[Keys.OWNER_INITIALIZED] == true) {
            val ownerLangCode = prefs[Keys.OWNER_PREFERRED_LANGUAGE] ?: SupportedLanguage.ENGLISH.code
            val ownerLang = SupportedLanguage.entries.firstOrNull { it.code == ownerLangCode } ?: SupportedLanguage.ENGLISH
            OwnerProfileSummary(
                loboroId = prefs[Keys.OWNER_PROFILE_ID] ?: "OWNER-MASTER-01",
                fullName = prefs[Keys.OWNER_PROFILE_NAME] ?: "LOBORO Owner",
                maskedMobile = prefs[Keys.OWNER_PROFILE_MASKED_MOBILE] ?: "••••",
                initializedAtLabel = prefs[Keys.OWNER_INITIALIZED_AT] ?: "Verified",
                preferredLanguage = ownerLang
            )
        } else null

        AppPreferencesSnapshot(
            selectedLanguage = language,
            lowDataMode = prefs[Keys.LOW_DATA_MODE] ?: false,
            reducedMotion = prefs[Keys.REDUCED_MOTION] ?: false,
            favoriteJobIds = prefs[Keys.FAVORITE_JOB_IDS] ?: emptySet(),
            ownerPinFailedAttempts = prefs[Keys.OWNER_PIN_FAILED_ATTEMPTS] ?: 0,
            ownerPinLockoutUntilMs = prefs[Keys.OWNER_PIN_LOCKOUT_UNTIL_MS] ?: 0L,
            ownerProfileSummary = summary
        )
    }

    suspend fun setSelectedLanguage(language: SupportedLanguage, accountId: String? = null) {
        store.edit { prefs ->
            val targetAccount = accountId?.takeIf { it.isNotBlank() } ?: prefs[Keys.ACTIVE_ACCOUNT_ID]
            if (!targetAccount.isNullOrBlank()) {
                // Save strictly against this account so switching accounts never alters another user's language
                prefs[Keys.accountLanguageKey(targetAccount)] = language.code
            } else {
                prefs[Keys.SELECTED_LANGUAGE] = language.code
            }
        }
    }

    suspend fun setActiveAccountSession(accountId: String?, accountLanguage: SupportedLanguage?) {
        store.edit { prefs ->
            if (accountId.isNullOrBlank()) {
                prefs.remove(Keys.ACTIVE_ACCOUNT_ID)
            } else {
                prefs[Keys.ACTIVE_ACCOUNT_ID] = accountId
                if (accountLanguage != null) {
                    prefs[Keys.accountLanguageKey(accountId)] = accountLanguage.code
                }
            }
        }
    }

    suspend fun getSavedLanguageForAccount(accountId: String?): SupportedLanguage {
        val prefs = store.data.first()
        val code = if (!accountId.isNullOrBlank()) {
            prefs[Keys.accountLanguageKey(accountId)] ?: prefs[Keys.SELECTED_LANGUAGE]
        } else {
            prefs[Keys.SELECTED_LANGUAGE]
        } ?: SupportedLanguage.ENGLISH.code
        return SupportedLanguage.entries.firstOrNull { it.code == code } ?: SupportedLanguage.ENGLISH
    }

    suspend fun setLowDataMode(enabled: Boolean) {
        store.edit { it[Keys.LOW_DATA_MODE] = enabled }
    }

    suspend fun setReducedMotion(enabled: Boolean) {
        store.edit { it[Keys.REDUCED_MOTION] = enabled }
    }

    suspend fun toggleFavoriteJob(jobId: String) {
        store.edit { prefs ->
            val current = prefs[Keys.FAVORITE_JOB_IDS] ?: emptySet()
            prefs[Keys.FAVORITE_JOB_IDS] = if (jobId in current) current - jobId else current + jobId
        }
    }

    suspend fun setOwnerPinLockoutState(failedAttempts: Int, lockoutUntilMs: Long) {
        store.edit { prefs ->
            prefs[Keys.OWNER_PIN_FAILED_ATTEMPTS] = failedAttempts
            prefs[Keys.OWNER_PIN_LOCKOUT_UNTIL_MS] = lockoutUntilMs
        }
    }

    suspend fun saveOwnerInitializationMetadata(summary: OwnerProfileSummary) {
        store.edit { prefs ->
            prefs[Keys.OWNER_INITIALIZED] = true
            prefs[Keys.OWNER_PROFILE_ID] = summary.loboroId
            prefs[Keys.OWNER_PROFILE_NAME] = summary.fullName
            prefs[Keys.OWNER_PROFILE_MASKED_MOBILE] = summary.maskedMobile
            prefs[Keys.OWNER_INITIALIZED_AT] = summary.initializedAtLabel
            prefs[Keys.OWNER_PREFERRED_LANGUAGE] = summary.preferredLanguage.code
        }
    }
}
