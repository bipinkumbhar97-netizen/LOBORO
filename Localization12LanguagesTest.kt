package com.example

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import com.example.data.LoboroDemoRepository
import com.example.data.LoboroPreferences
import com.example.domain.integrations.IntegrationStatus
import com.example.domain.model.ApplicationStatus
import com.example.domain.model.BadgeLevel
import com.example.domain.model.FeeChargePoint
import com.example.domain.model.JobCategoryId
import com.example.domain.model.SafetyCaseStatus
import com.example.domain.model.SafetyComplaintCategory
import com.example.domain.model.SupportedLanguage
import com.example.domain.model.TransactionStatus
import com.example.domain.model.TransactionType
import com.example.domain.model.UserRole
import com.example.i18n.Translations
import com.example.ui.viewmodel.LoboroViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class Localization12LanguagesTest {

    @Test
    fun `all 12 languages have complete enum maps, lists, legal text, and zero broken characters`() {
        assertEquals(12, SupportedLanguage.entries.size)

        SupportedLanguage.entries.forEach { lang ->
            val s = Translations.forLanguage(lang)
            val tag = lang.name

            // Core strings non-blank
            assertTrue("$tag tagline blank", s.tagline.isNotBlank())
            assertTrue("$tag navHome blank", s.navHome.isNotBlank())
            assertTrue("$tag navSearchJobs blank", s.navSearchJobs.isNotBlank())
            assertTrue("$tag navPostJob blank", s.navPostJob.isNotBlank())
            assertTrue("$tag navWallet blank", s.navWallet.isNotBlank())
            assertTrue("$tag navSettings blank", s.navSettings.isNotBlank())
            assertTrue("$tag userRegTitle blank", s.userRegTitle.isNotBlank())
            assertTrue("$tag userLoginTitle blank", s.userLoginTitle.isNotBlank())
            assertTrue("$tag ownerSetupTitle blank", s.ownerSetupTitle.isNotBlank())
            assertTrue("$tag ownerMasterControlTitle blank", s.ownerMasterControlTitle.isNotBlank())
            assertTrue("$tag privacyPolicyBody blank", s.privacyPolicyBody.isNotBlank())
            assertTrue("$tag termsOfServiceBody blank", s.termsOfServiceBody.isNotBlank())
            assertTrue("$tag helpSupportBody blank", s.helpSupportBody.isNotBlank())

            // Complete category & enum maps
            assertEquals("$tag missing categories", JobCategoryId.entries.toSet(), s.categories.keys)
            s.categories.values.forEach { assertTrue("$tag blank category", it.isNotBlank()) }

            assertEquals("$tag missing userRoles", UserRole.entries.toSet(), s.userRoles.keys)
            assertEquals("$tag missing applicationStatuses", ApplicationStatus.entries.toSet(), s.applicationStatuses.keys)
            assertEquals("$tag missing transactionStatuses", TransactionStatus.entries.toSet(), s.transactionStatuses.keys)
            assertEquals("$tag missing transactionTypes", TransactionType.entries.toSet(), s.transactionTypes.keys)
            assertEquals("$tag missing safetyCategories", SafetyComplaintCategory.entries.toSet(), s.safetyCategories.keys)
            assertEquals("$tag missing safetyStatuses", SafetyCaseStatus.entries.toSet(), s.safetyStatuses.keys)
            assertEquals("$tag missing badgeLevels", BadgeLevel.entries.toSet(), s.badgeLevels.keys)
            assertEquals("$tag missing feeChargePoints", FeeChargePoint.entries.toSet(), s.feeChargePoints.keys)
            assertEquals("$tag missing integrationStatuses", IntegrationStatus.entries.toSet(), s.integrationStatuses.keys)

            LoboroDemoRepository.indianStates.forEach { stateKey ->
                assertTrue("$tag missing state $stateKey", !s.indianStates[stateKey].isNullOrBlank())
            }

            // Lists & options
            assertEquals("$tag masterControlNames count", 25, s.masterControlNames.size)
            assertEquals("$tag scopeOptions count", 5, s.scopeOptions.size)
            assertEquals("$tag audienceOptions count", 3, s.audienceOptions.size)
            assertEquals("$tag ivrOptionLabels count", 7, s.ivrOptionLabels.size)
            assertTrue("$tag spokenSamples empty", s.spokenSamples.isNotEmpty())

            // No Unicode replacement characters in critical strings
            val checkStrings = listOf(
                s.tagline,
                s.navHome,
                s.dailyJobsTitle,
                s.monthlyJobsTitle,
                s.walletBalanceTitle,
                s.safetyEmergencyTitle,
                s.privacyPolicyBody,
                s.termsOfServiceBody,
                s.helpSupportBody
            ) + s.categories.values + s.masterControlNames
            checkStrings.forEach { text ->
                assertFalse("$tag contains replacement char U+FFFD in: $text", text.contains('\uFFFD'))
            }
        }
    }

    @Test
    fun `each non-English language uses its authentic regional Unicode script`() {
        val scriptRanges = mapOf(
            SupportedLanguage.HINDI to '\u0900'..'\u097F',
            SupportedLanguage.MARATHI to '\u0900'..'\u097F',
            SupportedLanguage.GUJARATI to '\u0A80'..'\u0AFF',
            SupportedLanguage.TELUGU to '\u0C00'..'\u0C7F',
            SupportedLanguage.TAMIL to '\u0B80'..'\u0BFF',
            SupportedLanguage.BENGALI to '\u0980'..'\u09FF',
            SupportedLanguage.ASSAMESE to '\u0980'..'\u09FF',
            SupportedLanguage.KANNADA to '\u0C80'..'\u0CFF',
            SupportedLanguage.MALAYALAM to '\u0D00'..'\u0D7F',
            SupportedLanguage.PUNJABI to '\u0A00'..'\u0A7F',
            SupportedLanguage.ODIA to '\u0B00'..'\u0B7F'
        )

        scriptRanges.forEach { (lang, range) ->
            val s = Translations.forLanguage(lang)
            assertTrue("${lang.name} tagline missing regional script", s.tagline.any { it in range })
            assertTrue("${lang.name} navHome missing regional script", s.navHome.any { it in range })
            assertTrue(
                "${lang.name} dailyJobsTitle missing regional script",
                s.dailyJobsTitle.any { it in range }
            )
            assertTrue(
                "${lang.name} privacyPolicyBody missing regional script",
                s.privacyPolicyBody.any { it in range }
            )
        }
    }

    @Test
    fun `format templates render safely across all 12 languages`() {
        SupportedLanguage.entries.forEach { lang ->
            val s = Translations.forLanguage(lang)
            val walletStrip = Translations.fmt(s.walletStripSummaryFormat, 12, 120)
            assertTrue("${lang.name} wallet strip missing 12", walletStrip.contains("12"))
            assertTrue("${lang.name} wallet strip missing 120", walletStrip.contains("120"))

            val perDay = Translations.fmt(s.perDayFormat, 950)
            assertTrue("${lang.name} perDay missing 950", perDay.contains("950"))

            val perMonth = Translations.fmt(s.perMonthFormat, 18000)
            assertTrue("${lang.name} perMonth missing 18000", perMonth.contains("18000"))

            val feeTitle = Translations.fmt(s.transparentJobFeeTitle, 2, 20)
            assertTrue("${lang.name} transparentJobFeeTitle missing 20", feeTitle.contains("20"))

            val langSaved = Translations.fmt(s.msgLanguageSavedFormat, lang.nativeName, lang.englishName)
            assertTrue("${lang.name} msgLanguageSavedFormat missing nativeName", langSaved.contains(lang.nativeName))

            val invalidPin = Translations.fmt(s.msgInvalidPinAttemptsFormat, 2, 5)
            assertTrue("${lang.name} msgInvalidPinAttemptsFormat missing 2", invalidPin.contains("2"))
        }
    }

    @Test
    fun `demo repository jobs, notices, wallet transactions, and safety cases cover all 12 languages`() {
        val allLangs = SupportedLanguage.entries.toSet()

        LoboroDemoRepository.demoJobs.forEach { job ->
            assertEquals("Job ${job.id} localizedTitles incomplete", allLangs, job.localizedTitles.keys)
            assertEquals("Job ${job.id} localizedDescriptions incomplete", allLangs, job.localizedDescriptions.keys)
        }
        LoboroDemoRepository.demoAdminNotices.forEach { notice ->
            assertEquals("Notice ${notice.id} localizedMessages incomplete", allLangs, notice.localizedMessages.keys)
        }
        LoboroDemoRepository.demoWallet.transactions.forEach { tx ->
            assertEquals("Tx ${tx.id} localizedTitles incomplete", allLangs, tx.localizedTitles.keys)
        }
        LoboroDemoRepository.demoSafetyCases.forEach { safeCase ->
            assertEquals("SafetyCase ${safeCase.id} localizedDescriptions incomplete", allLangs, safeCase.localizedDescriptions.keys)
            assertEquals("SafetyCase ${safeCase.id} localizedJobTitles incomplete", allLangs, safeCase.localizedJobTitles.keys)
        }
        LoboroDemoRepository.demoApplications.forEach { app ->
            assertEquals("Application ${app.id} localizedTitles incomplete", allLangs, app.localizedTitles.keys)
        }
    }

    @Test
    fun `viewModel selectLanguage updates activeLanguage and registration preferences immediately`() = runTest {
        val app = ApplicationProvider.getApplicationContext<Application>()
        val vm = LoboroViewModel(app)

        vm.selectLanguage(SupportedLanguage.MARATHI)
        advanceUntilIdle()
        assertEquals(SupportedLanguage.MARATHI, vm.uiState.value.activeLanguage)
        assertEquals(SupportedLanguage.MARATHI, vm.uiState.value.activeProfile.preferredLanguage)
        assertEquals(SupportedLanguage.MARATHI, vm.uiState.value.normalUserRegForm.preferredLanguage)
        assertEquals(SupportedLanguage.MARATHI, vm.uiState.value.ownerRegistrationForm.preferredLanguage)
        assertTrue(
            vm.uiState.value.feedbackBannerMessage.orEmpty()
                .contains(SupportedLanguage.MARATHI.nativeName)
        )

        vm.selectLanguage(SupportedLanguage.ODIA)
        advanceUntilIdle()
        assertEquals(SupportedLanguage.ODIA, vm.uiState.value.activeLanguage)
        assertEquals(SupportedLanguage.ODIA, vm.uiState.value.activeProfile.preferredLanguage)
    }

    @Test
    fun `preferences isolate per-account language selections without overwriting other accounts`(): Unit = kotlinx.coroutines.runBlocking {
        val app = ApplicationProvider.getApplicationContext<Application>()
        val tempDir = kotlin.io.path.createTempDirectory("loboro_prefs_test").toFile()
        val tempFile = java.io.File(tempDir, "test.preferences_pb")
        val scope = kotlinx.coroutines.CoroutineScope(kotlinx.coroutines.Dispatchers.IO + kotlinx.coroutines.SupervisorJob())
        val testDataStore = androidx.datastore.preferences.core.PreferenceDataStoreFactory.create(
            scope = scope,
            produceFile = { tempFile }
        )
        val prefs = LoboroPreferences(app, dataStoreOverride = testDataStore)

        try {
            kotlinx.coroutines.withTimeout(10_000L) {
                prefs.setSelectedLanguage(SupportedLanguage.TAMIL, accountId = "LB269")
                prefs.setSelectedLanguage(SupportedLanguage.GUJARATI, accountId = "LB3232")
                prefs.setSelectedLanguage(SupportedLanguage.KANNADA, accountId = null)

                assertEquals(SupportedLanguage.TAMIL, prefs.getSavedLanguageForAccount("LB269"))
                assertEquals(SupportedLanguage.GUJARATI, prefs.getSavedLanguageForAccount("LB3232"))
                assertEquals(SupportedLanguage.KANNADA, prefs.getSavedLanguageForAccount(null))
            }
        } finally {
            tempDir.deleteRecursively()
        }
    }
}
