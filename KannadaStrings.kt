package com.example.i18n.strings

import com.example.domain.integrations.IntegrationStatus
import com.example.domain.model.ApplicationStatus
import com.example.domain.model.BadgeLevel
import com.example.domain.model.FeeChargePoint
import com.example.domain.model.JobCategoryId
import com.example.domain.model.SafetyCaseStatus
import com.example.domain.model.SafetyComplaintCategory
import com.example.domain.model.TransactionStatus
import com.example.domain.model.TransactionType
import com.example.domain.model.UserRole
import com.example.i18n.AppStrings

object KannadaStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "ಗ್ಲೋಬಲ್ ಜಾಬ್ & ಸರ್ವಿಸ್"
    override val demoPreviewBanner = "ಡೆಮೊ ಪೂರ್ವವೀಕ್ಷಣೆ ಡೇಟಾ · ಲೈವ್ ಬಳಕೆಗೆ ಸೆಟ್ಟಿಂಗ್ಸ್‌ನಲ್ಲಿ ಬ್ಯಾಕೆಂಡ್ API ಸೇರಿಸಿ"
    override val verifiedNormalAccountBanner = "ಪರಿಶೀಲಿಸಿದ ಬಳಕೆದಾರ ಖಾತೆ · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO ಅಡ್ಮಿನ್ ಪ್ರಕಟಣೆ"
    override val maintenanceModeBanner = "ನಿರ್ವಹಣಾ ಮೋಡ್ ಸಕ್ರಿಯವಾಗಿದೆ · ನೇಮಕಾತಿ ಮತ್ತು ವ್ಯಾಲೆಟ್ ತಾತ್ಕಾಲಿಕವಾಗಿ ಸ್ಥಗಿತಗೊಂಡಿವೆ. ತುರ್ತು 112 ಮತ್ತು ಸುರಕ್ಷತಾ ಸೇವೆಗಳು ಚಾಲನೆಯಲ್ಲಿವೆ."
    override val navHome = "ಹೋಮ್"
    override val navSearchJobs = "ಕೆಲಸ ಹುಡುಕಿ"
    override val navPostJob = "ಕೆಲಸ ಪೋಸ್ಟ್"
    override val navWallet = "ವ್ಯಾಲೆಟ್"
    override val navMyApplications = "ನನ್ನ ಅರ್ಜಿಗಳು"
    override val navMyJobs = "ನನ್ನ ಕೆಲಸಗಳು"
    override val navNotifications = "ಸೂಚನೆಗಳು"
    override val navHelpSafety = "ಸಹಾಯ ಮತ್ತು ಸುರಕ್ಷತೆ"
    override val navProfile = "ಪ್ರೊಫೈಲ್"
    override val navSettings = "ಸೆಟ್ಟಿಂಗ್ಸ್"
    override val navAdmin = "ಮಾಲೀಕ ನಿಯಂತ್ರಣ"
    override val navBadgesLoyalty = "ಬ್ಯಾಡ್ಜ್ ಮತ್ತು ನಿಷ್ಠೆ"
    override val navIvrKeypad = "ಕೀಪ್ಯಾಡ್ ಮತ್ತು IVR"
    override val backLabel = "ಹಿಂದೆ"
    override val homeLabel = "ಹೋಮ್"
    override val languageLabel = "ಭಾಷೆ"
    override val languageSelectorTitle = "12 ಭಾಷೆಗಳು"
    override val activeBadgeLabel = "ಸಕ್ರಿಯ"
    override val closeLabel = "ಮುಚ್ಚಿ"
    override val okLabel = "ಸರಿ"
    override val understoodLabel = "ಅರ್ಥವಾಯಿತು"
    override val cancelLabel = "ರದ್ದುಮಾಡಿ"
    override val doneLabel = "ಮುಗಿಯಿತು"
    override val confirmActionLabel = "ದೃಢೀಕರಿಸಿ"
    override val resetLabel = "ಮರುಹೊಂದಿಸಿ"
    override val sendLabel = "ಕಳುಹಿಸಿ"

    override val shareAppTitle = "LOBORO ಆ್ಯಪ್ ಹಂಚಿಕೊಳ್ಳಿ"
    override val shareAppCta = "ಸ್ನೇಹಿತರಿಗೆ ಹಂಚಿ ಬಹುಮಾನ ಪಡೆಯಿರಿ"
    override val yourReferralLinkLabel = "ನಿಮ್ಮ ರೆಫರಲ್ ಲಿಂಕ್"
    override val loboroLinkLabel = "LOBORO ಲಿಂಕ್"
    override val shareMenuButton = "ಹಂಚಿಕೆ ಮೆನು"
    override val copyLinkButton = "ಲಿಂಕ್ ನಕಲಿಸಿ"
    override val referralCopiedToast = "ರೆಫರಲ್ ಸಂದೇಶ ನಕಲಿಸಲಾಗಿದೆ"
    override val openingShareMenuToast = "ಹಂಚಿಕೆ ಮೆನು ತೆರೆಯುತ್ತಿದೆ"
    override val shareMessageTemplate = "LOBORO ಗ್ಲೋಬಲ್ ಜಾಬ್ & ಸರ್ವಿಸ್‌ಗೆ ಸೇರಿ! ಭಾರತದಾದ್ಯಂತ ದಿನಗೂಲಿ ಅಥವಾ ತಿಂಗಳ ಸಂಬಳದ ಕೆಲಸ ಪಡೆಯಿರಿ. ನನ್ನ ರೆಫರಲ್ ID %1\$s ಬಳಸಿ: %2\$s"

    override val registerWorkerEmployerCta = "ಕಾರ್ಮಿಕ / ಉದ್ಯೋಗದಾತರಾಗಿ ನೋಂದಾಯಿಸಿ"
    override val logInLabel = "ಲಾಗಿನ್"
    override val signOutLabel = "ಸೈನ್ ಔಟ್"
    override val voiceSearchHint = "ಕೆಲಸ ಅಥವಾ ನಗರ ಮಾತನಾಡಿ ಅಥವಾ ಟೈಪ್ ಮಾಡಿ (ಉದಾ. ಹೈದರಾಬಾದ್‌ನಲ್ಲಿ ಮೇಸ್ತ್ರಿ)"
    override val tapMicToSpeak = "ಮಾತನಾಡಿ ಕೆಲಸ ಹುಡುಕಲು ಮೈಕ್ ಒತ್ತಿರಿ"
    override val listeningStatus = "ಕೇಳುತ್ತಿದ್ದೇವೆ... ನಿಮ್ಮ ಕೆಲಸವನ್ನು ಹೇಳಿ"
    override val stopListening = "ಕೇಳುವುದನ್ನು ನಿಲ್ಲಿಸಿ"
    override val searchAction = "ಹುಡುಕಿ"
    override val retryVoice = "ಮತ್ತೆ ಮಾತನಾಡಿ"
    override val voiceMicPermissionNeeded = "ಧ್ವನಿ ಹುಡುಕಾಟಕ್ಕಾಗಿ ನೀವು ಮೈಕ್ ಬಟನ್ ಒತ್ತಿದಾಗ ಮಾತ್ರ ಮೈಕ್ ಅನುಮತಿ ಕೇಳಲಾಗುತ್ತದೆ."
    override val voiceUnavailableHonest = "ಈ ಸಾಧನದಲ್ಲಿ ಧ್ವನಿ ಗುರುತಿಸುವಿಕೆ ಸೇವೆ ಸ್ಥಾಪಿಸಲಾಗಿಲ್ಲ. ಕ್ಲೌಡ್ ಧ್ವನಿ ಸೇವೆ ಸೇರಿಸಿ ಅಥವಾ ಕೆಳಗಿನ ಆಯ್ಕೆಯನ್ನು ಒತ್ತಿರಿ."
    override val voiceNoMatchError = "ಮಾತು ಸ್ಪಷ್ಟವಾಗಿ ಕೇಳಿಸಲಿಲ್ಲ. ಸ್ಪಷ್ಟವಾಗಿ ಮಾತನಾಡಿ ಅಥವಾ ಕೆಳಗಿನ ಮಾದರಿ ಒತ್ತಿರಿ."
    override val voiceNetworkError = "ನೆಟ್‌ವರ್ಕ್ ದೋಷ. ಇಂಟರ್ನೆಟ್ ಪರಿಶೀಲಿಸಿ ಅಥವಾ ಕೆಲಸ ಟೈಪ್ ಮಾಡಿ."
    override val voiceStoppedError = "ಧ್ವನಿ ಇನ್‌ಪುಟ್ ನಿಂತಿದೆ (ಕೋಡ್ %1\$d). ಟೈಪ್ ಮಾಡಿ ಅಥವಾ ಮತ್ತೆ ಪ್ರಯತ್ನಿಸಿ."
    override val voicePrivacyHint = "ಗೌಪ್ಯತೆ: ಮೈಕ್ ಸಾಮಾನ್ಯವಾಗಿ ಆಫ್ ಆಗಿರುತ್ತದೆ ಮತ್ತು ನೀವು ಒತ್ತಿದಾಗ ಮಾತ್ರ ಆನ್ ಆಗುತ್ತದೆ."
    override val clearSearchDesc = "ಹುಡುಕಾಟ ತೆರವುಗೊಳಿಸಿ"
    override val spokenSamples = listOf(
        "ಹೈದರಾಬಾದ್‌ನಲ್ಲಿ ಮೇಸ್ತ್ರಿ" to "Mason",
        "ಪುಣೆಯಲ್ಲಿ ಎಲೆಕ್ಟ್ರಿಷಿಯನ್" to "Electrician",
        "ಚೆನ್ನೈ ಹೋಟೆಲ್ ಅಡುಗೆಯವರು" to "Cook",
        "ವಿಜಯವಾಡ ಡ್ರೈವರ್" to "Driver",
        "ಸೂರತ್ ಪ್ಯಾಕಿಂಗ್ ಕೆಲಸ" to "Packing"
    )
    override val dailyJobsTitle = "ದೈನಂದಿನ ಕೆಲಸಗಳು (Daily)"
    override val dailyJobsSubtitle = "ದಿನಗೂಲಿ · ತಿಂಗಳ ಕೆಲಸಗಳಿಂದ ಪ್ರತ್ಯೇಕ ಪಟ್ಟಿ"
    override val monthlyJobsTitle = "ತಿಂಗಳ ಸಂಬಳದ ಕೆಲಸಗಳು"
    override val monthlyJobsSubtitle = "ನಿಗದಿತ ತಿಂಗಳ ಸಂಬಳ · ರಜೆ ಮತ್ತು ವಸತಿ ವಿವರ"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "ಕೆಲಸದ ವಿಭಾಗಗಳು (24)"
    override val walletStripSummaryFormat = "%1\$d ನಾಣ್ಯಗಳು (₹%2\$d) · 100%% ಹಿಂಪಡೆಯಬಹುದು"

    override val outOfStateTitle = "ಹೊರರಾಜ್ಯ ಮತ್ತು ಜಾಗತಿಕ ಕೆಲಸ ಹುಡುಕಾಟ"
    override val willingToRelocate = "ಬೇರೆ ರಾಜ್ಯಕ್ಕೆ ಹೋಗಿ ಕೆಲಸ ಮಾಡಲು ಸಿದ್ಧ"
    override val filterCountry = "ದೇಶ"
    override val filterState = "ರಾಜ್ಯ"
    override val filterDistrict = "ಜಿಲ್ಲೆ"
    override val filterCity = "ನಗರ"
    override val filterDistance = "ದೂರ"
    override val upToKmFormat = "%1\$d ಕಿ.ಮೀ ವರೆಗೆ"
    override val filterFoodIncluded = "ಊಟದ ಸೌಲಭ್ಯ"
    override val filterAccommodation = "ಕೊಠಡಿ / ವಸತಿ"
    override val allCategoriesLabel = "ಎಲ್ಲಾ ವಿಭಾಗಗಳು"
    override val noMatchingJobsTitle = "ನಿಮ್ಮ ಫಿಲ್ಟರ್‌ಗಳಿಗೆ ಹೊಂದುವ ಕೆಲಸಗಳಿಲ್ಲ"
    override val noMatchingJobsSubtitle = "ಫಿಲ್ಟರ್ ತೆರವುಗೊಳಿಸಿ ಅಥವಾ 'ಹೊರರಾಜ್ಯ ಕೆಲಸ' ಆನ್ ಮಾಡಿ."
    override val showAllJobsButton = "ಎಲ್ಲಾ ಕೆಲಸಗಳನ್ನು ತೋರಿಸಿ"
    override val dailyWageJobBadge = "ದಿನಗೂಲಿ ಕೆಲಸ"
    override val monthlySalaryJobBadge = "ತಿಂಗಳ ಸಂಬಳದ ಕೆಲಸ"
    override val demoDataTag = "ಡೆಮೊ"
    override val originalLangFormat = "ಮೂಲ ಭಾಷೆ: %1\$s"
    override val preTranslatedPreviewNote = "ಪೂರ್ವ-ಅನುವಾದಿತ ಪೂರ್ವವೀಕ್ಷಣೆ ಸಕ್ರಿಯವಾಗಿದೆ. ಲೈವ್ ಕೆಲಸಗಳಿಗಾಗಿ ಸೆಟ್ಟಿಂಗ್ಸ್‌ನಲ್ಲಿ ಅನುವಾದ API ಕೀ ಸೇರಿಸಿ."
    override val configureTranslationApiNote = "ಎಲ್ಲಾ 12 ಭಾಷೆಗಳಲ್ಲಿ ಲೈವ್ ಅನುವಾದಕ್ಕಾಗಿ ಸೆಟ್ಟಿಂಗ್ಸ್‌ನಲ್ಲಿ ಅನುವಾದ API ಕೀ ಸೇರಿಸಿ."
    override val translatedToggle = "ಅನುವಾದಿತ"
    override val originalToggle = "ಮೂಲ"
    override val compensationLabel = "ವೇತನ / ಸಂಬಳ"
    override val locationLabel = "ಸ್ಥಳ"
    override val employerLabel = "ಉದ್ಯೋಗದಾತ"
    override val vacanciesUnit = "ಹುದ್ದೆಗಳು"
    override val perDayFormat = "₹%1\$d / ದಿನ"
    override val perMonthFormat = "₹%1\$d / ತಿಂಗಳು"
    override val coinsCountFormat = "%1\$d ನಾಣ್ಯಗಳು"
    override val foodBadge = "ಊಟ"
    override val stayBadge = "ವಸತಿ"
    override val shareJobButton = "ಕೆಲಸ ಹಂಚಿ"
    override val applyNow = "ಅರ್ಜಿ ಸಲ್ಲಿಸಿ"
    override val saveJob = "ಉಳಿಸಿ"
    override val negotiateChat = "ಮಾತನಾಡಿ / ಚಾಟ್"
    override val reportJob = "ದೂರು ನೀಡಿ"
    override val foodAvailable = "ಊಟ ಸೇರಿದೆ"
    override val accommodationAvailable = "ವಸತಿ ಸೇರಿದೆ"
    override val notProvided = "ಸೇರಿಲ್ಲ"
    override val workersNeeded = "ಬೇಕಾದ ಕಾರ್ಮಿಕರು"
    override val workHoursLabel = "ಕೆಲಸದ ಸಮಯ"
    override val overtimeLabel = "ಓವರ್‌ಟೈಮ್"
    override val paymentFreqLabel = "ಪಾವತಿ"
    override val weeklyHolidayLabel = "ವಾರದ ರಜೆ"
    override val leavePolicyLabel = "ರಜೆ ನಿಯಮ"
    override val joiningDateLabel = "ಸೇರುವ ದಿನಾಂಕ"
    override val expiryLabel = "ಮುಕ್ತಾಯ"
    override val translatedBadgeLabel = "ಅನುವಾದಿತ"

    override val postingPausedFormat = "ಕೆಲಸ ಪೋಸ್ಟ್ ಮಾಡುವುದು ಪ್ರಸ್ತುತ ಮಾಲೀಕ ನಿಯಂತ್ರಣದಿಂದ (%1\$s) ತಾತ್ಕಾಲಿಕವಾಗಿ ನಿಲ್ಲಿಸಲಾಗಿದೆ."
    override val selectCategoryLabel = "ವಿಭಾಗ ಆಯ್ಕೆಮಾಡಿ (24 ವಿಭಾಗಗಳು)"
    override val jobTitleLabel = "ಕೆಲಸದ ಶೀರ್ಷಿಕೆ"
    override val jobTitlePlaceholder = "ಉದಾ. ಹಾಸ್ಟೆಲ್ ಕಟ್ಟಡಕ್ಕೆ 4 ಮೇಸ್ತ್ರಿಗಳು ಬೇಕಾಗಿದ್ದಾರೆ"
    override val jobDescLabel = "ಕೆಲಸದ ವಿವರ"
    override val jobDescPlaceholder = "ಕೆಲಸದ ಮಾಹಿತಿ, ಸುರಕ್ಷತಾ ಸಾಧನಗಳು, ಊಟ ಮತ್ತು ವಸತಿ ಸೌಲಭ್ಯ"
    override val dailyWageInrLabel = "ದಿನಗೂಲಿ (₹)"
    override val monthlySalaryInrLabel = "ತಿಂಗಳ ಸಂಬಳ (₹)"
    override val vacanciesLabel = "ಖಾಲಿ ಹುದ್ದೆಗಳು"
    override val cityTownLabel = "ನಗರ / ಪಟ್ಟಣ"
    override val stateLabel = "ರಾಜ್ಯ"
    override val transparentJobFeeTitle = "ಪಾರದರ್ಶಕ ಜಾಬ್ ಶುಲ್ಕ: %1\$d ನಾಣ್ಯ (₹%2\$d)"
    override val configuredByOwnerSub = "ಮಾಲೀಕರು ನಿಗದಿಪಡಿಸಿದ್ದು · ಶುಲ್ಕ ಸಮಯ: %1\$s · ಲಭ್ಯ: %2\$d ನಾಣ್ಯಗಳು"
    override val confirmAndPostJobButton = "ದೃಢೀಕರಿಸಿ ಕೆಲಸ ಪೋಸ್ಟ್ ಮಾಡಿ (%1\$d ನಾಣ್ಯಗಳು)"

    override val walletBalanceTitle = "LOBORO ನಾಣ್ಯ ಬ್ಯಾಲೆನ್ಸ್"
    override val withdrawableValueFormat = "₹%1\$d ಹಿಂಪಡೆಯಬಹುದಾದ ಮೌಲ್ಯ (1 ನಾಣ್ಯ = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% ಸಮಾನ ಹಣ ಹಿಂಪಡೆಯುವ ನಿಯಮ"
    override val withdrawableRuleBody = "ಖರೀದಿಸಿದ, ಉಡುಗೊರೆ, ಆಫರ್, ರೆಫರಲ್, ಬ್ಯಾಡ್ಜ್ ಅಥವಾ ನಿಷ್ಠೆಯ ಪ್ರತಿಯೊಂದು ನಾಣ್ಯವೂ ಸಮಾನ ನಗದು ಮೌಲ್ಯ ಮತ್ತು 100% ಹಿಂಪಡೆಯುವ ಅರ್ಹತೆ ಹೊಂದಿದೆ."
    override val buyCoins = "ನಾಣ್ಯ ಖರೀದಿಸಿ"
    override val withdrawCoins = "ಹಣ ಪಡೆಯಿರಿ"
    override val walletActionsPausedNote = "ಕೆಲವು ವ್ಯಾಲೆಟ್ ಸೇವೆಗಳನ್ನು ಮಾಲೀಕರು ನಿಲ್ಲಿಸಿದ್ದಾರೆ. ನಿಮ್ಮ ಬ್ಯಾಲೆನ್ಸ್ ಮತ್ತು ಮಂಜೂರಾದ ಮರುಪಾವತಿಗಳು ಸುರಕ್ಷಿತವಾಗಿವೆ."
    override val coinPackagesTitle = "ನಾಣ್ಯ ಪ್ಯಾಕೇಜ್‌ಗಳು (ಪಾರದರ್ಶಕ ಬೆಲೆ)"
    override val bankSecurityTitle = "ಬ್ಯಾಂಕ್ / UPI ಮತ್ತು ಮುಖ ಪರಿಶೀಲನೆ ಭದ್ರತೆ"
    override val payoutDestinationLabel = "ಪರಿಶೀಲಿಸಿದ ಪಾವತಿ ಖಾತೆ: %1\$s"
    override val bankSecurityStepsNote = "ಬ್ಯಾಂಕ್/UPI ಬದಲಾವಣೆಗೆ ಕಡ್ಡಾಯ ತಪಾಸಣೆ: ನೋಂದಾಯಿತ ಮೊಬೈಲ್ OTP + ಲೈವ್ ಸೆಲ್ಫಿ ಹೊಂದಾಣಿಕೆ + ತಾತ್ಕಾಲಿಕ ಪಾವತಿ ತಡೆ."
    override val changeBankUpiButton = "ಬ್ಯಾಂಕ್ / UPI ಬದಲಿಸಿ (OTP + ಮುಖ ತಪಾಸಣೆ)"
    override val unfreezePayoutsButton = "ಪಾವತಿ ಅನ್‌ಲಾಕ್ ಮಾಡಿ"
    override val lostPhoneFreezeButton = "ಫೋನ್ ಕಳೆದಿದೆಯೇ? ಹಣ ಪಡೆಯುವುದನ್ನು ನಿಲ್ಲಿಸಿ"
    override val payoutFreezeActiveNote = "ಪಾವತಿ ತಡೆ ಸಕ್ರಿಯವಾಗಿದೆ. ಗುರುತಿನ ಮರುಪರಿಶೀಲನೆ ಆಗುವವರೆಗೆ ಯಾವುದೇ ಹಣ ಹಿಂಪಡೆಯಲು ಸಾಧ್ಯವಿಲ್ಲ."
    override val transactionHistory = "ನಾಣ್ಯ ವಹಿವಾಟು ದಾಖಲೆ"
    override val demoLedgerSuffix = "(ಡೆಮೊ ದಾಖಲೆ)"
    override val buyCoinsDialogTitleFormat = "%1\$d ನಾಣ್ಯಗಳನ್ನು ಖರೀದಿಸಿ (₹%2\$d)"
    override val paymentNotConnectedBody = "ಲೈವ್ Razorpay / Cashfree UPI ಪಾವತಿ ಇನ್ನೂ ಸಂಪರ್ಕಗೊಂಡಿಲ್ಲ. ನಿಜವಾದ ಹಣ ಪಡೆಯುವ ಮೊದಲು ಪ್ರೊಡಕ್ಷನ್ ಕೀಗಳನ್ನು ಸೇರಿಸಿ."
    override val withdrawDialogTitleFormat = "₹%1\$d ಹಿಂಪಡೆಯಿರಿ"
    override val withdrawDialogBodyFormat = "ಸಂಪೂರ್ಣ ಬ್ಯಾಲೆನ್ಸ್ (%1\$d ನಾಣ್ಯಗಳು) ಸಮಾನ ಮೌಲ್ಯದೊಂದಿಗೆ 100%% ಹಿಂಪಡೆಯಬಹುದು.\nಖಾತೆ: %2\$s\n\nಈ ಬಿಲ್ಡ್‌ನಲ್ಲಿ ಲೈವ್ IMPS / UPI ಗೇಟ್‌ವೇ ಸಂಪರ್ಕಗೊಂಡಿಲ್ಲ."
    override val bankChangeDialogTitle = "3-ಹಂತದ ಬ್ಯಾಂಕ್ / UPI ಬದಲಾವಣೆ ರಕ್ಷಣೆ"
    override val bankChangeDialogBody = "ಫೋನ್ ಕಳೆದುಹೋದಾಗ ರಕ್ಷಿಸಲು ಬ್ಯಾಂಕ್/UPI ಬದಲಾಯಿಸಲು ಇವು ಅಗತ್ಯ:\n1. ನೋಂದಾಯಿತ ಮೊಬೈಲ್ OTP ಪರಿಶೀಲನೆ\n2. ನೋಂದಣಿ ಫೋಟೋದೊಂದಿಗೆ ಲೈವ್ ಮುಖ ಹೊಂದಾಣಿಕೆ\n3. ಬಿಡುಗಡೆಗೆ ಮುನ್ನ ಭದ್ರತಾ ಕಾಯುವ ಸಮಯ"
    override val receiptDialogTitle = "ವಹಿವಾಟು ರಸೀದಿ"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "ಉಲ್ಲೇಖ: %1\$s"
    override val receiptTypeLabel = "ವಿಧ: %1\$s"
    override val receiptCoinsLabel = "ನಾಣ್ಯಗಳು: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "ಸ್ಥಿತಿ: %1\$s"
    override val receiptTimeLabel = "ಸಮಯ: %1\$s"
    override val receiptWithdrawableYes = "ಹಿಂಪಡೆಯುವ ಅರ್ಹತೆ: 100% ಹೌದು"

    override val employerAppsHeading = "ಅರ್ಜಿಗಳು ಮತ್ತು ನೇರ ಚಾಟ್"
    override val secureChatHeading = "ಸುರಕ್ಷಿತ ಕಾರ್ಮಿಕ ↔ ಉದ್ಯೋಗದಾತ ಚಾಟ್"
    override val secureChatSubtitle = "ನೀವು ಸ್ವತಃ ಹಂಚಿಕೊಳ್ಳುವವರೆಗೆ ಫೋನ್ ಸಂಖ್ಯೆಗಳು ಗುಪ್ತವಾಗಿರುತ್ತವೆ. ತೆರೆಯಲು ಅಥವಾ ಬ್ಲಾಕ್ ಮಾಡಲು ಟ್ಯಾಪ್ ಮಾಡಿ."
    override val chatButton = "ಚಾಟ್"
    override val workerEmployerLineFormat = "ಕಾರ್ಮಿಕ: %1\$s (%2\$s) · ಉದ್ಯೋಗದಾತ: %3\$s"
    override val shortlistButton = "ಶಾರ್ಟ್‌ಲಿಸ್ಟ್"
    override val acceptButton = "ಸ್ವೀಕರಿಸಿ"
    override val withdrawButton = "ಹಿಂಪಡೆಯಿರಿ"
    override val phoneHiddenPrivacy = "ಗೌಪ್ಯತೆ ಸಕ್ರಿಯ: ಇಬ್ಬರೂ ಒಪ್ಪುವವರೆಗೆ ಖಾಸಗಿ ಫೋನ್ ಸಂಖ್ಯೆ ಕಾಣುವುದಿಲ್ಲ."
    override val blockUserLabel = "ಬ್ಲಾಕ್"
    override val userBlockedNotice = "ನೀವು ಈ ಸಂಭಾಷಣೆಯನ್ನು ಬ್ಲಾಕ್ ಮಾಡಿದ್ದೀರಿ. ಅಗತ್ಯವಿದ್ದರೆ ಸುರಕ್ಷತಾ ಕೇಂದ್ರದಲ್ಲಿ ದೂರು ನೀಡಿ."
    override val chatPlaceholder = "ನಿಮ್ಮ ಭಾಷೆಯಲ್ಲಿ ಸಂದೇಶ ಟೈಪ್ ಮಾಡಿ..."

    override val automaticBadgePrefix = "ಸ್ವಯಂಚಾಲಿತ ಬ್ಯಾಡ್ಜ್: %1\$s"
    override val badgeStatsFormat = "ರೇಟಿಂಗ್ %1\$.1f ★ · %2\$d ಪರಿಶೀಲಿಸಿದ ಕೆಲಸದ ದಿನಗಳು · %3\$d ಪೂರ್ಣಗೊಂಡ ಕೆಲಸಗಳು"
    override val progressToFormat = "%1\$s ಬ್ಯಾಡ್ಜ್ ಪ್ರಗತಿ: %2\$d / %3\$d ದಿನಗಳು"
    override val badgeAntiAbuseNote = "ಬ್ಯಾಡ್ಜ್‌ಗಳು ನಿಜವಾದ ಪೂರ್ಣಗೊಂಡ ಕೆಲಸಗಳು, ಪರಿಶೀಲಿಸಿದ ಹಾಜರಾತಿ ಮತ್ತು ನ್ಯಾಯಯುತ ರೇಟಿಂಗ್‌ನಿಂದ ಮಾತ್ರ ಸಿಗುತ್ತವೆ."
    override val badgeTiersTitle = "5 ಸ್ವಯಂಚಾಲಿತ ಬ್ಯಾಡ್ಜ್ ಹಂತಗಳು"
    override val minWorkdaysFormat = "ಕನಿಷ್ಠ %1\$d ಕೆಲಸದ ದಿನಗಳು · ಕನಿಷ್ಠ %2\$.1f★ ರೇಟಿಂಗ್"
    override val badgeAppealsNote = "ನ್ಯಾಯಯುತ ರಕ್ಷಣೆ: ಹಠಾತ್ ಅನುಮಾನಾಸ್ಪದ 1-ಸ್ಟಾರ್ ರೇಟಿಂಗ್‌ಗಳನ್ನು ಮೇಲ್ಮನವಿ ಮೂಲಕ ಪರಿಶೀಲಿಸಲಾಗುತ್ತದೆ."
    override val loyaltyTitle = "ಸೀನಿಯಾರಿಟಿ ಮತ್ತು ನಿಷ್ಠೆ ಆರ್ಥಿಕ ಸಹಾಯ"
    override val loyaltySubtitle = "ಪಾರದರ್ಶಕ ತ್ರೈಮಾಸಿಕ ಕಲ್ಯಾಣ ಮತ್ತು ಮೈಲಿಗಲ್ಲು ಬೋನಸ್"
    override val loyaltyDisclaimer = "ಕಡ್ಡಾಯ ಪ್ರಕಟಣೆ: ಇದು ವಿಮೆ ಅಲ್ಲ ಮತ್ತು ಖಚಿತ ಮಾಸಿಕ ಪಿಂಚಣಿಯೂ ಅಲ್ಲ. ಅರ್ಹತೆ, ಕೆಲಸದ ದಿನಗಳು, ಬಜೆಟ್ ಮತ್ತು ಅನುಮೋದನೆಗೆ ಒಳಪಟ್ಟಿರುತ್ತದೆ."
    override val loyaltyMinMembershipFormat = "ಕನಿಷ್ಠ ಸದಸ್ಯತ್ವ: %1\$d ತಿಂಗಳುಗಳು"
    override val loyaltyWorkdaysFormat = "ಪರಿಶೀಲಿಸಿದ ಕೆಲಸದ ದಿನಗಳು: %1\$d+ ದಿನಗಳು"
    override val loyaltyRequiredBadgeFormat = "ಅಗತ್ಯವಿರುವ ಬ್ಯಾಡ್ಜ್: %1\$s+"
    override val loyaltyRequiredRatingFormat = "ಕನಿಷ್ಠ ರೇಟಿಂಗ್: %1\$.1f★"
    override val loyaltyBudgetFormat = "ಅನುಮೋದಿತ ಸಹಾಯ: ₹%1\$d · ಬಜೆಟ್: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "ಕಾರ್ಮಿಕರ ಸುರಕ್ಷತೆ ಮತ್ತು ತುರ್ತು ಸಹಾಯ"
    override val callEmergency112 = "ತುರ್ತು 112 ಗೆ ಕರೆ ಮಾಡಿ"
    override val weeklyCheckInTitle = "ವಾರದ ಸುರಕ್ಷತಾ ತಪಾಸಣೆ"
    override val weeklyCheckInQuestion = "ನೀವು ಸುರಕ್ಷಿತವಾಗಿದ್ದೀರಾ?"
    override val checkInOpt1 = "1 · ನಾನು ಸುರಕ್ಷಿತವಾಗಿದ್ದೇನೆ"
    override val checkInOpt2 = "2 · ನನಗೆ ಸಮಸ್ಯೆ ಇದೆ"
    override val checkInOpt3 = "3 · LOBORO ಅಡ್ಮಿನ್ ಜೊತೆ ಮಾತನಾಡಿ"
    override val reportSafetyIssue = "ಸುರಕ್ಷತೆ / ಕೂಲಿ ದೂರು ಸಲ್ಲಿಸಿ"
    override val safetyOperationalNote = "ಕೆಲಸ ಪೋಸ್ಟಿಂಗ್ ಅಥವಾ ಪಾವತಿಗಳು ನಿಂತಿದ್ದರೂ ಸುರಕ್ಷತಾ ಸೇವೆ ಸದಾ ಚಾಲನೆಯಲ್ಲಿರುತ್ತದೆ."
    override val safetyDisclaimerNote = "ತಕ್ಷಣದ ಅಪಾಯದಲ್ಲಿ ನೇರವಾಗಿ 112 ಗೆ ಕರೆ ಮಾಡಿ. ನ್ಯಾಯಯುತ ಮಧ್ಯಸ್ಥಿಕೆಗಾಗಿ LOBORO ದೂರುಗಳನ್ನು ದಾಖಲಿಸುತ್ತದೆ."
    override val everyDaysFormat = "ಪ್ರತಿ %1\$d ದಿನಗಳಿಗೆ"
    override val lastStatusFormat = "ಕೊನೆಯ ತಪಾಸಣೆ: %1\$s"
    override val checkInNoResponseNote = "ಸತತ 2 ತಪಾಸಣೆ ತಪ್ಪಿದರೆ ಅಥವಾ ಸಮಸ್ಯೆ ಆಯ್ಕೆ ಮಾಡಿದರೆ LOBORO SMS, ಅಡ್ಮಿನ್ ಪರಿಶೀಲನೆ ಮತ್ತು ಸಮ್ಮತಿಯೊಂದಿಗೆ ಕುಟುಂಬಕ್ಕೆ ತಿಳಿಸುತ್ತದೆ."
    override val consentEmergencyTitle = "ಸಮ್ಮತಿಯೊಂದಿಗೆ ತುರ್ತು ಸ್ಥಳ ಮತ್ತು ಕುಟುಂಬ ಸಂಪರ್ಕ"
    override val workerIdLabel = "ಕಾರ್ಮಿಕ ID: %1\$s"
    override val homeOriginLabel = "ಮೂಲ ಊರು: %1\$s, %2\$s"
    override val currentJobCityLabel = "ಪ್ರಸ್ತುತ ಕೆಲಸದ ನಗರ: %1\$s"
    override val emergencyContactLabel = "ತುರ್ತು ಸಂಪರ್ಕ: %1\$s (%2\$s)"
    override val consentGranted = "ಸಮ್ಮತಿ ನೀಡಲಾಗಿದೆ"
    override val consentPending = "ಸಮ್ಮತಿ ಬಾಕಿ ಇದೆ"
    override val employerLoboroIdInput = "ಉದ್ಯೋಗದಾತ LOBORO ID (ಉದಾ. LB819)"
    override val currentSiteInput = "ಪ್ರಸ್ತುತ ಕೆಲಸದ ನಗರ / ಸ್ಥಳ"
    override val describeIssueInput = "ಸುರಕ್ಷತೆ ಅಥವಾ ವೇತನ ಸಮಸ್ಯೆಯನ್ನು ವಿವರಿಸಿ"
    override val submitSafetyDeskButton = "ಸುರಕ್ಷತಾ ಕೇಂದ್ರಕ್ಕೆ ಕಳುಹಿಸಿ"
    override val safetyCasesHeading = "ಇತ್ತೀಚಿನ ಸುರಕ್ಷತಾ ಪ್ರಕರಣಗಳು (ಆಡಿಟ್ ಯೋಗ್ಯ)"
    override val ivrTitle = "ಕೀಪ್ಯಾಡ್ ಫೋನ್ ಮಿಸ್ಡ್-ಕಾಲ್ ಮತ್ತು IVR ಮೆನು"
    override val ivrSubtitle = "ಸ್ಮಾರ್ಟ್‌ಫೋನ್ ಇಲ್ಲದೆಯೂ ಟೋಲ್-ಫ್ರೀ / ಮಿಸ್ಡ್-ಕಾಲ್ ಮೂಲಕ ಕಾರ್ಯನಿರ್ವಹಿಸುತ್ತದೆ"
    override val ivrArchNote = "ಲೈವ್ ಸಿಸ್ಟಮ್ Exotel / Knowlarity / Twilio Voice ಗೆ ಸಂಪರ್ಕಗೊಳ್ಳುತ್ತದೆ. 12-ಭಾಷೆಯ ಧ್ವನಿ ಮೆನು ಪರೀಕ್ಷಿಸಲು ಒತ್ತಿರಿ."
    override val ivrMenuTitle = "LOBORO ಧ್ವನಿ IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO ಗೆ ಸ್ವಾಗತ! ಧ್ವನಿ ಮೆನು ಕೇಳಲು ಕೀಪ್ಯಾಡ್ ಸಂಖ್ಯೆ ಒತ್ತಿರಿ."
    override val pressKeyFormat = "%1\$s ಒತ್ತಿರಿ → %2\$s"
    override val ivrSelectedSummaryFormat = "ಆಯ್ಕೆಮಾಡಿದ್ದು [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "ಇಂದಿನ ದಿನಗೂಲಿ ಕೆಲಸಗಳು",
        "2" to "ತಿಂಗಳ ಸಂಬಳದ ಕೆಲಸಗಳು",
        "3" to "ವಾರದ ಸುರಕ್ಷತಾ ತಪಾಸಣೆ ('ನೀವು ಸುರಕ್ಷಿತವಾಗಿದ್ದೀರಾ?')",
        "4" to "ವ್ಯಾಲೆಟ್ ನಾಣ್ಯ ಮತ್ತು ಇತ್ತೀಚಿನ ಸ್ಥಿತಿ ಕೇಳಿ",
        "5" to "ತುರ್ತು ಅಡ್ಮಿನ್ ಕಾಲ್‌ಬ್ಯಾಕ್",
        "6" to "ಅರ್ಜಿ ಸ್ಥಿತಿ ಪರಿಶೀಲಿಸಿ",
        "0" to "ಧ್ವನಿ ಭಾಷೆ ಬದಲಿಸಿ"
    )

    override val userRegTitle = "ಕಾರ್ಮಿಕ ಮತ್ತು ಉದ್ಯೋಗದಾತ ನೋಂದಣಿ"
    override val userLoginTitle = "ಕಾರ್ಮಿಕ ಮತ್ತು ಉದ್ಯೋಗದಾತ ಲಾಗಿನ್"
    override val userAuthSubtitle = "OTP-ಪರಿಶೀಲಿಸಿದ ಸಾಮಾನ್ಯ ಬಳಕೆದಾರ ಖಾತೆ · ರಹಸ್ಯ ಮಾಲೀಕ ವ್ಯವಸ್ಥೆಯಿಂದ ಸಂಪೂರ್ಣ ಪ್ರತ್ಯೇಕ"
    override val registerTab = "ನೋಂದಣಿ"
    override val loginTab = "ಲಾಗಿನ್"
    override val dbOtpNotConnectedTitle = "ಬ್ಯಾಕೆಂಡ್ ಡೇಟಾಬೇಸ್ / OTP ಸಂಪರ್ಕಗೊಂಡಿಲ್ಲ"
    override val dbOtpNotConnectedBody = "ನಿಜವಾದ ಕಾರ್ಮಿಕ ಮತ್ತು ಉದ್ಯೋಗದಾತ ಖಾತೆಗಳನ್ನು ಉಳಿಸಲು LOBORO_BACKEND_URL ಸೇರಿಸಿ."
    override val selectAccountTypeStep = "1. ಖಾತೆ ಪ್ರಕಾರ ಆಯ್ಕೆಮಾಡಿ"
    override val workerAccountLabel = "ಕಾರ್ಮಿಕ"
    override val employerAccountLabel = "ಉದ್ಯೋಗದಾತ"
    override val regPausedForRoleFormat = "%1\$s ನೋಂದಣಿ ಪ್ರಸ್ತುತ ಮಾಲೀಕರಿಂದ ಸ್ಥಗಿತಗೊಂಡಿದೆ."
    override val preferredLanguageLabel = "ಆಯ್ಕೆಯ ಆ್ಯಪ್ ಭಾಷೆ (12 ಭಾಷೆಗಳು)"
    override val fullNameStepLabel = "2. ಪೂರ್ಣ ಹೆಸರು *"
    override val businessNameStepLabel = "2. ವ್ಯಾಪಾರ / ಗುತ್ತಿಗೆದಾರರ ಪೂರ್ಣ ಹೆಸರು *"
    override val mobileStepLabel = "3. ಮೊಬೈಲ್ ಸಂಖ್ಯೆ (10 ಅಂಕಿಗಳು) *"
    override val sendRegOtpButton = "OTP ಕಳುಹಿಸಿ"
    override val resendMobileOtpButton = "ಮತ್ತೆ OTP ಕಳುಹಿಸಿ"
    override val enterOtpStepLabel = "4. ಮೊಬೈಲ್ OTP ನಮೂದಿಸಿ *"
    override val verifyOtpButton = "OTP ಪರಿಶೀಲಿಸಿ"
    override val verifiedLabel = "ಪರಿಶೀಲಿಸಲಾಗಿದೆ"
    override val mobileVerifiedNote = "ಸರ್ವರ್‌ನಲ್ಲಿ ಮೊಬೈಲ್ ಪರಿಶೀಲಿಸಲಾಗಿದೆ"
    override val homeStateLabel = "ಮೂಲ ರಾಜ್ಯ"
    override val homeDistrictLabel = "ಮೂಲ ಜಿಲ್ಲೆ"
    override val stateShortLabel = "ರಾಜ್ಯ"
    override val cityShortLabel = "ನಗರ"
    override val workCityStateLabel = "ಪ್ರಸ್ತುತ ಕೆಲಸದ ನಗರ ಮತ್ತು ರಾಜ್ಯ"
    override val businessLocationLabel = "ವ್ಯಾಪಾರದ ನಗರ ಮತ್ತು ರಾಜ್ಯ"
    override val skillsCategoriesLabel = "ಕೌಶಲ್ಯಗಳು / ಕೆಲಸ (ಉದಾ. ಮೇಸ್ತ್ರಿ, ಎಲೆಕ್ಟ್ರಿಷಿಯನ್)"
    override val hiringCategoriesLabel = "ನೇಮಕಾತಿ ವಿಭಾಗಗಳು"
    override val emergencyContactNameLabel = "ತುರ್ತು ಕುಟುಂಬ ಸಂಪರ್ಕ ಹೆಸರು"
    override val emergencyContactPhoneLabel = "ತುರ್ತು ಸಂಪರ್ಕ ಸಂಖ್ಯೆ"
    override val uniqueLbIdNotice = "ಪೂರ್ಣಗೊಂಡಾಗ ಸರ್ವರ್ ಶಾಶ್ವತ LB ID (LB2000+) ನೀಡುತ್ತದೆ. VIP ಮತ್ತು ಮಾಲೀಕ ಸಂಖ್ಯೆಗಳು ಸುರಕ್ಷಿತವಾಗಿರುತ್ತವೆ."
    override val creatingProfileLabel = "ಪ್ರೊಫೈಲ್ ರಚಿಸಲಾಗುತ್ತಿದೆ..."
    override val createProfileButton = "ಕಾರ್ಮಿಕ / ಉದ್ಯೋಗದಾತ ಪ್ರೊಫೈಲ್ ರಚಿಸಿ"
    override val loginHeading = "ನೋಂದಾಯಿತ ಮೊಬೈಲ್ OTP ಮೂಲಕ ಲಾಗಿನ್ ಮಾಡಿ"
    override val loginSubtitle = "ಕಾರ್ಮಿಕ ಅಥವಾ ಉದ್ಯೋಗದಾತರಾಗಿ ನೋಂದಾಯಿಸಿದ ಮೊಬೈಲ್ ಸಂಖ್ಯೆ ನಮೂದಿಸಿ."
    override val registeredMobileLabel = "ನೋಂದಾಯಿತ ಮೊಬೈಲ್ ಸಂಖ್ಯೆ"
    override val sendLoginOtpButton = "ಲಾಗಿನ್ OTP ಕಳುಹಿಸಿ"
    override val resendLoginOtpButton = "OTP ಮತ್ತೆ ಕಳುಹಿಸಿ"
    override val enterLoginOtpLabel = "ಲಾಗಿನ್ OTP ನಮೂದಿಸಿ"
    override val verifyingOtpLabel = "ಪರಿಶೀಲಿಸಲಾಗುತ್ತಿದೆ..."
    override val verifyOtpOpenHomeButton = "OTP ಪರಿಶೀಲಿಸಿ ಹೋಮ್ ತೆರೆಯಿರಿ"
    override val backToHomepageButton = "ಹೋಮ್‌ಪೇಜ್‌ಗೆ ಹಿಂತಿರುಗಿ"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "ಪಾತ್ರ"
    override val offlinePreviewHeading = "ಆಫ್‌ಲೈನ್ ಪ್ರೊಫೈಲ್ ಮತ್ತು ಫೋಟೋ ಪೂರ್ವವೀಕ್ಷಣೆ"
    override val offlinePreviewCardTitle = "ಪ್ರೊಫೈಲ್ ರಚಿಸಿ / ತಿದ್ದುಪಡಿ ಮಾಡಿ (ಆಫ್‌ಲೈನ್ ಪೂರ್ವವೀಕ್ಷಣೆ)"
    override val offlinePreviewCardSubtitle = "ಲೈವ್ ಡೇಟಾಬೇಸ್ ಸಂಪರ್ಕವಾಗುವವರೆಗೆ ಸ್ಥಳೀಯ ಪೂರ್ವವೀಕ್ಷಣೆಯಾಗಿ ಉಳಿಸಲಾಗುತ್ತದೆ."
    override val workLocationLabel = "ಕೆಲಸದ ಸ್ಥಳ (ನಗರ, ರಾಜ್ಯ)"
    override val businessAddressLabel = "ವ್ಯಾಪಾರದ ನಗರ, ರಾಜ್ಯ"
    override val skillsExpLabel = "ಕೌಶಲ್ಯ / ಕೆಲಸದ ವಿಧ"
    override val businessCatLabel = "ವ್ಯಾಪಾರದ ವಿಧ / ನೇಮಕಾತಿ ವಿಭಾಗಗಳು"
    override val aadhaarPrivacyNote = "ಡೇಟಾ ರಕ್ಷಣೆ: LOBORO ಸಾಧನದಲ್ಲಿ ಆಧಾರ್ ಚಿತ್ರಗಳನ್ನು ಉಳಿಸುವುದಿಲ್ಲ — ಪರಿಶೀಲಿಸಿದ ಹ್ಯಾಶ್ ಮತ್ತು ಸಮ್ಮತಿ ಮಾತ್ರ ಉಳಿಸುತ್ತದೆ."
    override val selectProfilePhotoBtn = "ಪ್ರೊಫೈಲ್ ಫೋಟೋ ಆಯ್ಕೆಮಾಡಿ (ಫೋಟೋ ಪಿಕರ್)"
    override val photoSelectedBtn = "ಫೋಟೋ ಆಯ್ಕೆಯಾಗಿದೆ ✓"
    override val offlineConsentCheck = "ಸುರಕ್ಷತಾ ತಪಾಸಣೆ ಮತ್ತು ಸಂಪರ್ಕಕ್ಕೆ ಸಿಗದಿದ್ದಾಗ ಕುಟುಂಬಕ್ಕೆ ತುರ್ತು ಮಾಹಿತಿ ನೀಡಲು ನಾನು ಸಮ್ಮತಿಸುತ್ತೇನೆ."
    override val previewProfileBtn = "ಪೂರ್ವವೀಕ್ಷಣೆ ಪ್ರೊಫೈಲ್ ಉಳಿಸಿ"
    override val audienceScopeFormat = "ಪ್ರೇಕ್ಷಕರು: %1\$s · ವ್ಯಾಪ್ತಿ: %2\$s · %3\$s"
    override val settingsHeading = "ಸೆಟ್ಟಿಂಗ್ಸ್ ಮತ್ತು ವೇದಿಕೆ ಮಾಹಿತಿ"
    override val languageSectionTitle = "ಆ್ಯಪ್ ಭಾಷೆ (ಎಲ್ಲಾ 12 ಭಾರತೀಯ ಭಾಷೆಗಳು)"
    override val languageSectionSubtitle = "ನಿಮ್ಮ ಸಕ್ರಿಯ ಖಾತೆಗೆ ಪ್ರತ್ಯೇಕವಾಗಿ ಉಳಿಸಲಾಗುತ್ತದೆ. ಇತರ ಖಾತೆಗಳ ಭಾಷೆ ಬದಲಾಗುವುದಿಲ್ಲ."
    override val languagePausedByOwner = "ಮಾಲೀಕ ನಿಯಂತ್ರಣದಿಂದ ಭಾಷೆ ಬದಲಾವಣೆ ತಾತ್ಕಾಲಿಕವಾಗಿ ನಿಲ್ಲಿಸಲಾಗಿದೆ."
    override val lowDataTitle = "ಕಡಿಮೆ ಡೇಟಾ ಮೋಡ್"
    override val lowDataSubtitle = "2G/3G ಗ್ರಾಮೀಣ ನೆಟ್‌ವರ್ಕ್‌ಗಳಲ್ಲಿ ಮೊಬೈಲ್ ಡೇಟಾ ಉಳಿಸುತ್ತದೆ"
    override val reducedMotionTitle = "ಕಡಿಮೆ ಅನಿಮೇಷನ್ ಮತ್ತು ಸ್ಪಷ್ಟ ದೃಶ್ಯ"
    override val reducedMotionSubtitle = "ಸ್ಪಷ್ಟ ಅಕ್ಷರಗಳು ಮತ್ತು ಸರಳ ಪರದೆ ಚಲನೆ"
    override val privacyPolicyTitle = "ಗೌಪ್ಯತಾ ನೀತಿ ಮತ್ತು ಡೇಟಾ ರಕ್ಷಣೆ"
    override val privacyPolicyBody = "• ನಿಮ್ಮ ಅನುಮತಿ ಇಲ್ಲದೆ ಚಾಟ್‌ನಲ್ಲಿ ಫೋನ್ ಸಂಖ್ಯೆಗಳು ಕಾಣುವುದಿಲ್ಲ.\n• ಧ್ವನಿ ಹುಡುಕಾಟ ಒತ್ತಿದಾಗ ಮಾತ್ರ ಮೈಕ್ರೋಫೋನ್ ಆನ್ ಆಗುತ್ತದೆ.\n• ಫೋಟೋ ಆಯ್ಕೆಗೆ ಸುರಕ್ಷಿತ ಆಂಡ್ರಾಯ್ಡ್ ಫೋಟೋ ಪಿಕರ್ ಬಳಸಲಾಗುತ್ತದೆ.\n• ನಿಮ್ಮ ಸಮ್ಮತಿಯೊಂದಿಗೆ ಮಾತ್ರ ಕುಟುಂಬಕ್ಕೆ ತುರ್ತು ಸ್ಥಳ ಕಳುಹಿಸಲಾಗುತ್ತದೆ."
    override val termsOfServiceTitle = "ಸೇವಾ ನಿಯಮಗಳು ಮತ್ತು ನ್ಯಾಯಯುತ ತತ್ವಗಳು"
    override val termsOfServiceBody = "• ದಿನಗೂಲಿ ಮತ್ತು ತಿಂಗಳ ಸಂಬಳದ ಕೆಲಸಗಳನ್ನು ಪ್ರತ್ಯೇಕವಾಗಿ ಇಡಲಾಗಿದೆ.\n• ಪ್ರತಿಯೊಂದು LOBORO ನಾಣ್ಯವೂ 100% ಸಮಾನ ನಗದು ಮೌಲ್ಯ ಮತ್ತು ಹಿಂಪಡೆಯುವ ಅರ್ಹತೆ ಹೊಂದಿದೆ.\n• ಬ್ಯಾಡ್ಜ್‌ಗಳು ನಿಜವಾದ ಕೆಲಸದ ದಿನಗಳು ಮತ್ತು ನ್ಯಾಯಯುತ ರೇಟಿಂಗ್‌ನಿಂದ ಮಾತ್ರ ದೊರೆಯುತ್ತವೆ.\n• VIP IDಗಳು (LB1–LB1999) ಮಾಲೀಕರಿಗೆ ಮಾತ್ರ ಮೀಸಲಾಗಿವೆ."
    override val helpSupportTitle = "ಸಹಾಯ, ಬೆಂಬಲ ಮತ್ತು ಸುರಕ್ಷತಾ ಕೇಂದ್ರ"
    override val helpSupportBody = "• ತಕ್ಷಣದ ಅಪಾಯದಲ್ಲಿ 112 ಗೆ ಕರೆ ಮಾಡಿ (ಲಾಗಿನ್ ಇಲ್ಲದಿದ್ದರೂ 24x7).\n• ಕೂಲಿ ಅಥವಾ ವಸತಿ ದೂರುಗಳಿಗೆ ಸಹಾಯ ಮತ್ತು ಸುರಕ್ಷತಾ ಕೇಂದ್ರದಲ್ಲಿ ಪ್ರಕರಣ ದಾಖಲಿಸಿ.\n• ಕೀಪ್ಯಾಡ್ ಫೋನ್‌ಗಳಿಗೆ ಟೋಲ್-ಫ್ರೀ ಕಾಲ್‌ಬ್ಯಾಕ್‌ಗಾಗಿ ಕೀಪ್ಯಾಡ್ ಮತ್ತು IVR ತೆರೆಯಿರಿ."
    override val backendChecklistTitle = "ಬ್ಯಾಕೆಂಡ್ ಮತ್ತು API ಸಂಯೋಜನೆ ಸ್ಥಿತಿ"
    override val providersLabel = "ಸೇವಾದಾತರು: %1\$s"
    override val secretsLabel = "ರಹಸ್ಯ ಕೀಗಳು: %1\$s"

    override val ownerSetupTitle = "ಒಂದು ಬಾರಿಯ ಮಾಲೀಕ / ಸೂಪರ್ ಅಡ್ಮಿನ್ ಸೆಟಪ್"
    override val ownerSetupSubtitle = "LOBORO ಸೃಷ್ಟಿಕರ್ತರಿಗೆ ಮಾತ್ರ. ಒಮ್ಮೆ ನೋಂದಾಯಿಸಿದ ನಂತರ ಶಾಶ್ವತವಾಗಿ ಲಾಕ್ ಆಗುತ್ತದೆ."
    override val ownerSetupLockNote = "ಭದ್ರತಾ ಲಾಕ್: ಒಂದೇ ಒಂದು ಮಾಲೀಕ ಖಾತೆ ಮಾತ್ರ ಇರಲು ಸಾಧ್ಯ. ಯಾವುದೇ ಕಾರ್ಮಿಕ ಅಥವಾ ಉದ್ಯೋಗದಾತರು ಇದನ್ನು ಬಳಸಲು ಸಾಧ್ಯವಿಲ್ಲ."
    override val ownerBackendReqTitle = "ಮಾಲೀಕ ಸರ್ವರ್ ಸಂಪರ್ಕಗೊಂಡಿಲ್ಲ"
    override val ownerBackendReqBody = "ಪಾಸ್‌ವರ್ಡ್ ಮತ್ತು 4-ಅಂಕಿಯ PIN ಅನ್ನು ಸರ್ವರ್‌ನಲ್ಲಿ ಸುರಕ್ಷಿತವಾಗಿಡಲು LOBORO_BACKEND_URL ಸೆಟ್ ಮಾಡಿ."
    override val serverSetupAuthHeading = "1. ಸರ್ವರ್ ಸೆಟಪ್ ಅನುಮತಿ"
    override val bootstrapSecretLabel = "ಒಂದು ಬಾರಿಯ ಸರ್ವರ್ ಬೂಟ್‌ಸ್ಟ್ರ್ಯಾಪ್ ಕೋಡ್ *"
    override val bootstrapSecretPlaceholder = "ನಿಮ್ಮ ಸರ್ವರ್ OWNER_BOOTSTRAP_SECRET ನಿಂದ"
    override val ownerIdentityHeading = "2. ಮಾಲೀಕ ಗುರುತು ಮತ್ತು ಮೊಬೈಲ್ OTP"
    override val ownerNameField = "ಮಾಲೀಕರ ಪೂರ್ಣ ಹೆಸರು *"
    override val ownerMobileField = "ಮಾಲೀಕರ ವೈಯಕ್ತಿಕ ಮೊಬೈಲ್ ಸಂಖ್ಯೆ *"
    override val ownerSendOtpBtn = "ಮಾಲೀಕ OTP ಕಳುಹಿಸಿ"
    override val ownerMobileVerifiedNote = "ಮಾಲೀಕ ಮೊಬೈಲ್ OTP ಪರಿಶೀಲಿಸಲಾಗಿದೆ"
    override val credentialsHeading = "3. ಪಾಸ್‌ವರ್ಡ್ ಮತ್ತು 4-ಅಂಕಿಯ ಅಡ್ಮಿನ್ PIN"
    override val createPasswordLabel = "ಲಾಗಿನ್ ಪಾಸ್‌ವರ್ಡ್ ರಚಿಸಿ (8+ ಅಕ್ಷರಗಳು) *"
    override val confirmPasswordLabel = "ಲಾಗಿನ್ ಪಾಸ್‌ವರ್ಡ್ ದೃಢೀಕರಿಸಿ *"
    override val passwordsMismatchError = "ಪಾಸ್‌ವರ್ಡ್‌ಗಳು ಹೊಂದುತ್ತಿಲ್ಲ"
    override val createPinLabel = "4-ಅಂಕಿಯ ಅಡ್ಮಿನ್ PIN ರಚಿಸಿ *"
    override val confirmPinLabel = "4-ಅಂಕಿಯ ಅಡ್ಮಿನ್ PIN ದೃಢೀಕರಿಸಿ *"
    override val pinsMismatchError = "PIN ಗಳು ಹೊಂದುತ್ತಿಲ್ಲ"
    override val credentialsHashNote = "ಸರ್ವರ್ ಪಾಸ್‌ವರ್ಡ್ ಮತ್ತು PIN ಅನ್ನು Argon2id ಮೂಲಕ ಸುರಕ್ಷಿತಗೊಳಿಸುತ್ತದೆ. ಆ್ಯಪ್‌ನಲ್ಲಿ ಸಂಗ್ರಹಿಸುವುದಿಲ್ಲ."
    override val registeringOwnerLabel = "ಮಾಲೀಕ ಖಾತೆ ರಚಿಸಲಾಗುತ್ತಿದೆ..."
    override val completeOwnerRegButton = "ಮಾಲೀಕ ನೋಂದಣಿ ಪೂರ್ಣಗೊಳಿಸಿ ಡ್ಯಾಶ್‌ಬೋರ್ಡ್ ತೆರೆಯಿರಿ"
    override val returnToAppButton = "LOBORO ಆ್ಯಪ್‌ಗೆ ಹಿಂತಿರುಗಿ"
    override val adminPinHeader = "ಮಾಲೀಕ ನಿಯಂತ್ರಣ · 4-ಅಂಕಿಯ PIN ಅಗತ್ಯವಿದೆ"
    override val adminPinPrompt = "ನಿಮ್ಮ 4-ಅಂಕಿಯ ಮಾಲೀಕ ಅಡ್ಮಿನ್ PIN ನಮೂದಿಸಿ. ಸರ್ವರ್‌ನಲ್ಲಿ ಮಿತಿಯೊಂದಿಗೆ ಪರಿಶೀಲಿಸಲಾಗುತ್ತದೆ."
    override val pinLockoutFormat = "ಹೆಚ್ಚು ತಪ್ಪು ಪ್ರಯತ್ನಗಳು. %1\$d ಸೆಕೆಂಡುಗಳ ನಂತರ ಪ್ರಯತ್ನಿಸಿ."
    override val clrKeyLabel = "ಅಳಿಸಿ"
    override val verifyPinServerBtn = "ಸರ್ವರ್‌ನಲ್ಲಿ 4-ಅಂಕಿಯ PIN ಪರಿಶೀಲಿಸಿ"
    override val pinSecurityPolicyFormat = "5 ತಪ್ಪು ಪ್ರಯತ್ನಗಳಿಗೆ ಲಾಕ್ · 5 ನಿಮಿಷ ನಿಷ್ಕ್ರಿಯವಾದರೆ ಲಾಗೌಟ್ · ಉಳಿದ ಪ್ರಯತ್ನಗಳು: %1\$d"
    override val ownerMasterControlTitle = "ಮಾಲೀಕ ಮಾಸ್ಟರ್ ಕಂಟ್ರೋಲ್"
    override val ownerMasterSubtitle = "ಮಾಲೀಕ ಸೂಪರ್ ಅಡ್ಮಿನ್ ಮಾತ್ರ · ಸರ್ವರ್ PIN + OTP + ಆಡಿಟ್ ಲಾಗ್"
    override val ownerSessionLockedNote = "ಮಾಲೀಕ ಸೆಷನ್ ಲಾಕ್ ಆಗಿದೆ. ಮಾಸ್ಟರ್ ಕಂಟ್ರೋಲ್ ತೆರೆಯಲು ಸರ್ವರ್ ಪರಿಶೀಲಿಸಿದ 4-ಅಂಕಿಯ PIN ಅಗತ್ಯ."
    override val verifyOwnerPinBtn = "ಮಾಲೀಕ 4-ಅಂಕಿಯ PIN ಪರಿಶೀಲಿಸಿ"
    override val ownerProfileLineFormat = "ಮಾಲೀಕ ಪ್ರೊಫೈಲ್ · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "ನೋಂದಾಯಿತ ಮೊಬೈಲ್: %1\$s · ಏಕೈಕ ಮಾಲೀಕ ಖಾತೆ (%2\$s)"
    override val activeSessionFormat = "ಸಕ್ರಿಯ ಮಾಲೀಕ ಸೆಷನ್ · %1\$dm %2\$02ds ನಲ್ಲಿ ಲಾಗೌಟ್"
    override val serverAuthorityNote = "ಸೆಷನ್ ಟೋಕನ್ ಪರಿಶೀಲಿಸಲಾಗಿದೆ (ಸರ್ವರ್ ಅಧಿಕಾರ)"
    override val lockAndExitBtn = "ಲಾಕ್ ಮಾಡಿ ನಿರ್ಗಮಿಸಿ"
    override val mandatoryProtectionTitle = "ಕಡ್ಡಾಯ ಸುರಕ್ಷತೆ ಮತ್ತು ಆರ್ಥಿಕ ಹೊಣೆಗಾರಿಕೆ ರಕ್ಷಣೆ"
    override val mandatoryProtectionBody = "ವೈಶಿಷ್ಟ್ಯಗಳನ್ನು ಆಫ್ ಮಾಡಿದರೂ ಅಥವಾ ನಿರ್ವಹಣಾ ಮೋಡ್ ಹಾಕಿದರೂ ಬಾಕಿ ಪಾವತಿಗಳು, ಮರುಪಾವತಿಗಳು ಮತ್ತು 112 ತುರ್ತು ಸೇವೆ ರದ್ದಾಗುವುದಿಲ್ಲ."
    override val changePinTitle = "ಅಡ್ಮಿನ್ PIN ಬದಲಿಸಿ (OTP ಪರಿಶೀಲನೆ ಕಡ್ಡಾಯ)"
    override val changePinSubtitle = "ಮಾಲೀಕರಿಗೆ ಮಾತ್ರ. ಪ್ರಸ್ತುತ PIN ಎಂದಿಗೂ ತೋರಿಸಲ್ಲ. ನೋಂದಾಯಿತ ಮೊಬೈಲ್ OTP ಕಡ್ಡಾಯ."
    override val otpToRegisteredMobileNote = "ನೋಂದಾಯಿತ ಮಾಲೀಕರ ಮೊಬೈಲ್‌ಗೆ ಮಾತ್ರ OTP ಕಳುಹಿಸಲಾಗುತ್ತದೆ: %1\$s"
    override val sendPinChangeOtpBtn = "ನೋಂದಾಯಿತ ಮಾಲೀಕ ಮೊಬೈಲ್‌ಗೆ OTP ಕಳುಹಿಸಿ"
    override val otpDispatchedNote = "ಮಾಲೀಕರ ಮೊಬೈಲ್ (%1\$s) ಗೆ OTP ಕಳುಹಿಸಲಾಗಿದೆ."
    override val enterServerOtpLabel = "ಸರ್ವರ್ OTP ಕೋಡ್ ನಮೂದಿಸಿ"
    override val verifyOtpServerBtn = "ಸರ್ವರ್‌ನಲ್ಲಿ OTP ಪರಿಶೀಲಿಸಿ"
    override val otpVerifiedNewPinNote = "OTP ಪರಿಶೀಲಿಸಲಾಗಿದೆ. ಈಗ ಹೊಸ 4-ಅಂಕಿಯ ಮಾಲೀಕ PIN ನಮೂದಿಸಿ ದೃಢೀಕರಿಸಿ."
    override val newPinLabel = "ಹೊಸ 4-ಅಂಕಿಯ PIN"
    override val confirmNewPinLabel = "ಹೊಸ 4-ಅಂಕಿಯ PIN ದೃಢೀಕರಿಸಿ"
    override val saveNewPinBtn = "ದೃಢೀಕರಿಸಿ ಅಡ್ಮಿನ್ PIN ನವೀಕರಿಸಿ"
    override val confirmPinChangeTitle = "ಅಡ್ಮಿನ್ PIN ಬದಲಾವಣೆ ದೃಢೀಕರಿಸಿ"
    override val confirmPinChangeDesc = "ಸರ್ವರ್‌ನಲ್ಲಿ 4-ಅಂಕಿಯ ಮಾಲೀಕ PIN ಬದಲಿಸಬೇಕೆ? ಸೆಷನ್ ಸಕ್ರಿಯವಾಗಿರುತ್ತದೆ ಮತ್ತು ಆಡಿಟ್ ದಾಖಲಾಗುತ್ತದೆ."
    override val pinUpdatedNote = "ಹೊಸ 4-ಅಂಕಿಯ ಮಾಲೀಕ PIN ಸರ್ವರ್‌ನಲ್ಲಿ ನವೀಕರಿಸಲಾಗಿದೆ."
    override val completeMasterControlTitle = "ಸಂಪೂರ್ಣ ಮಾಲೀಕ ಮಾಸ್ಟರ್ ಕಂಟ್ರೋಲ್ (25 ವಿಭಾಗಗಳು)"
    override val masterControlScopeSubtitle = "ಪ್ರದೇಶ ಅಥವಾ ಬಳಕೆದಾರ ಪಾತ್ರದ ಪ್ರಕಾರ ತಕ್ಷಣದ ON/OFF ನಿಯಂತ್ರಣಗಳು."
    override val scopeOptions = listOf(
        "ಜಾಗತಿಕ · ಭಾರತ (ಎಲ್ಲಾ ರಾಜ್ಯಗಳು)",
        "ತೆಲಂಗಾಣ ಮಾತ್ರ",
        "ತಮಿಳುನಾಡು ಮಾತ್ರ",
        "ಕಾರ್ಮಿಕರು ಮಾತ್ರ",
        "ಉದ್ಯೋಗದಾತರು ಮಾತ್ರ"
    )
    override val masterControlNames = listOf(
        "1. ಸಂಪೂರ್ಣ ಆ್ಯಪ್ ಮತ್ತು ನಿರ್ವಹಣಾ ಮೋಡ್",
        "2. ಕಾರ್ಮಿಕ ನೋಂದಣಿ",
        "3. ಉದ್ಯೋಗದಾತ ನೋಂದಣಿ",
        "4. ಕೆಲಸ ಪೋಸ್ಟ್ ಮಾಡುವುದು",
        "5. ಕೆಲಸ ಹುಡುಕುವುದು",
        "6. ದಿನಗೂಲಿ ಕೆಲಸಗಳು",
        "7. ತಿಂಗಳ ಸಂಬಳದ ಕೆಲಸಗಳು",
        "8. ನಾಣ್ಯ ಖರೀದಿಗಳು",
        "9. ವ್ಯಾಲೆಟ್ ಹಣ ಹಿಂಪಡೆಯುವಿಕೆ",
        "10. ಜಾಬ್ ಶುಲ್ಕ ಮತ್ತು ನಾಣ್ಯ ಬೆಲೆ",
        "11. ಆಫರ್‌ಗಳು ಮತ್ತು ಪ್ರಚಾರಗಳು",
        "12. ರೆಫರಲ್ ಬಹುಮಾನಗಳು",
        "13. ಸೂಚನೆಗಳು ಮತ್ತು ಪ್ರಕಟಣೆಗಳು",
        "14. ಕಾರ್ಮಿಕ ಮತ್ತು ಉದ್ಯೋಗದಾತ ಖಾತೆ ನಿಯಂತ್ರಣ",
        "15. ಕೆಲಸದ ವಿಭಾಗಗಳು ಮತ್ತು ಉಪವಿಭಾಗಗಳು",
        "16. ರೇಟಿಂಗ್ ಮತ್ತು ಸ್ವಯಂಚಾಲಿತ ಬ್ಯಾಡ್ಜ್‌ಗಳು",
        "17. ಸೀನಿಯಾರಿಟಿ ಮತ್ತು ನಿಷ್ಠೆ ಸಹಾಯ",
        "18. ತುರ್ತು ಮತ್ತು ಕಾರ್ಮಿಕ ಸುರಕ್ಷತಾ ವ್ಯವಸ್ಥೆ",
        "19. SMS ಎಚ್ಚರಿಕೆಗಳು",
        "20. IVR ಸೇವೆಗಳು",
        "21. ಭಾಷಾ ಸೆಟ್ಟಿಂಗ್ಸ್ (12 ಭಾಷೆಗಳು)",
        "22. ದೇಶ, ರಾಜ್ಯ ಮತ್ತು ನಗರ ಲಭ್ಯತೆ",
        "23. VIP ID ಮೀಸಲಾತಿ ಮತ್ತು ನಿರ್ವಹಣೆ",
        "24. ವರದಿಗಳು, ದೂರುಗಳು ಮತ್ತು ನಿಯಂತ್ರಣ",
        "25. ಪೇಮೆಂಟ್ ಗೇಟ್‌ವೇ ಏಕೀಕರಣ"
    )
    override val publishNoticeTitle = "ಕೆಂಪು LOBORO ಅಡ್ಮಿನ್ ಪ್ರಕಟಣೆ ಪ್ರಕಟಿಸಿ"
    override val announcementMessageLabel = "ಪ್ರಕಟಣೆ ಸಂದೇಶ"
    override val announcementPlaceholder = "ಉದಾ. ಹೊರರಾಜ್ಯ ಕಾರ್ಮಿಕರಿಗೆ ಹೊಸ ಸುರಕ್ಷತಾ ಸಹಾಯವಾಣಿ"
    override val actionLinkLabel = "ಬಟನ್ ಹೆಸರು"
    override val scopeFieldLabel = "ಪ್ರದೇಶ / ರಾಜ್ಯ ವ್ಯಾಪ್ತಿ"
    override val audienceOptions = listOf("ಎಲ್ಲಾ ಬಳಕೆದಾರರು", "ಕಾರ್ಮಿಕರು", "ಉದ್ಯೋಗದಾತರು")
    override val broadcastNoticeBtn = "ಕೆಂಪು ಅಡ್ಮಿನ್ ಪ್ರಕಟಣೆ ಪ್ರಸಾರ ಮಾಡಿ"
    override val confirmBroadcastTitle = "ಕೆಂಪು LOBORO ಅಡ್ಮಿನ್ ಪ್ರಕಟಣೆ ಕಳುಹಿಸಬೇಕೆ?"
    override val confirmBroadcastDescFormat = "ಸಂದೇಶ: %1\$s\nಬಳಕೆದಾರರು: %2\$s · ಪ್ರದೇಶ: %3\$s"
    override val coinPricingTitle = "ನಾಣ್ಯ ಬೆಲೆ ಮತ್ತು ಶುಲ್ಕ ನಿಯಂತ್ರಣ"
    override val coinPricingSummaryFormat = "1 ನಾಣ್ಯ = ₹%1\$d · ದೈನಂದಿನ = %2\$d ನಾಣ್ಯ · ವಿಶೇಷ = %3\$d ನಾಣ್ಯಗಳು · ಮಾಸಿಕ = %4\$d ನಾಣ್ಯಗಳು · ಸಮಯ: %5\$s"
    override val dailyBtnFormat = "ದೈನಂದಿನ +1 (%1\$d)"
    override val masonBtnFormat = "ವಿಶೇಷ +1 (%1\$d)"
    override val monthlyBtnFormat = "ಮಾಸಿಕ +5 (%1\$d)"
    override val protectedVipIdsTitle = "ರಕ್ಷಿತ VIP ಮತ್ತು ಮಾಲೀಕ IDಗಳು (ಸ್ವಯಂಚಾಲಿತವಾಗಿ ನೀಡಲಾಗುವುದಿಲ್ಲ)"
    override val protectedVipIdsNote = "ಸಾಮಾನ್ಯ ಬಳಕೆದಾರರಿಗೆ ಯಾವಾಗಲೂ LB2000+ ನೀಡಲಾಗುತ್ತದೆ. ವಿಶೇಷ ಸಂಖ್ಯೆಗಳು ಮಾಲೀಕರ ಹಂಚಿಕೆಗೆ ಮಾತ್ರ."
    override val safetyInvestigationTitle = "ಸುರಕ್ಷತಾ ಪ್ರಕರಣ ಮತ್ತು ದೂರು ತನಿಖಾ ಕೇಂದ್ರ"
    override val manageCategoriesTitle = "24 ಕೆಲಸದ ವಿಭಾಗಗಳ ನಿರ್ವಹಣೆ (ತಕ್ಷಣ ON/OFF)"
    override val showAll24Label = "ಎಲ್ಲಾ 24 ತೋರಿಸಿ"
    override val showLessLabel = "ಕಡಿಮೆ ತೋರಿಸಿ"
    override val auditLogTitle = "ಮಾಲೀಕ ಕ್ರಿಯೆಯ ಆಡಿಟ್ ಲಾಗ್"
    override val confirmToggleTitleFormat = "%1\$s ದೃಢೀಕರಿಸಿ"
    override val confirmToggleDescFormat = "%3\$s ಗಾಗಿ \"%1\$s\" ಅನ್ನು %2\$s ಮಾಡಬೇಕೆ? ಆರ್ಥಿಕ ಹೊಣೆಗಾರಿಕೆಗಳು ಮತ್ತು 112 ಸುರಕ್ಷತಾ ಸೇವೆಗಳು ರಕ್ಷಿತವಾಗಿರುತ್ತವೆ."

    override val categories = mapOf(
        JobCategoryId.MASON to "ಮೇಸ್ತ್ರಿ / ಗಾರೆ ಕೆಲಸ",
        JobCategoryId.CONSTRUCTION_LABOUR to "ಕಟ್ಟಡ ನಿರ್ಮಾಣ ಕಾರ್ಮಿಕ",
        JobCategoryId.GENERAL_LABOUR to "ಸಾಮಾನ್ಯ ಕೂಲಿ ಕಾರ್ಮಿಕ",
        JobCategoryId.PLUMBER to "ಪ್ಲಂಬರ್",
        JobCategoryId.ELECTRICIAN to "ಎಲೆಕ್ಟ್ರಿಷಿಯನ್",
        JobCategoryId.PAINTER to "ಪೇಂಟರ್",
        JobCategoryId.TILE_WORKER to "ಟೈಲ್ಸ್ ಕೆಲಸಗಾರ",
        JobCategoryId.CARPENTER to "ಬಡಗಿ / ಕಾರ್ಪೆಂಟರ್",
        JobCategoryId.WELDER to "ವೆಲ್ಡರ್",
        JobCategoryId.HOTEL_STAFF to "ಹೋಟೆಲ್ ಸಿಬ್ಬಂದಿ",
        JobCategoryId.COOK to "ಅಡುಗೆಯವರು / ಕುಕ್",
        JobCategoryId.WAITER to "ವೇಟರ್",
        JobCategoryId.HOUSEKEEPING to "ಹೌಸ್‌ಕೀಪಿಂಗ್",
        JobCategoryId.SECURITY_GUARD to "ಸೆಕ್ಯುರಿಟಿ ಗಾರ್ಡ್",
        JobCategoryId.DRIVER to "ಡ್ರೈವರ್",
        JobCategoryId.DELIVERY_WORKER to "ಡೆಲಿವರಿ ಸಿಬ್ಬಂದಿ",
        JobCategoryId.FACTORY_WORKER to "ಕಾರ್ಖಾನೆ ಕಾರ್ಮಿಕ",
        JobCategoryId.PACKING_WORKER to "ಪ್ಯಾಕಿಂಗ್ ಕೆಲಸಗಾರ",
        JobCategoryId.MACHINE_OPERATOR to "ಮೆಷಿನ್ ಆಪರೇಟರ್",
        JobCategoryId.AGRICULTURE_WORKER to "ಕೃಷಿ ಕಾರ್ಮಿಕ",
        JobCategoryId.OFFICE_ASSISTANT to "ಕಚೇರಿ ಸಹಾಯಕ",
        JobCategoryId.SHOP_STAFF to "ಅಂಗಡಿ ಸಿಬ್ಬಂದಿ",
        JobCategoryId.DOMESTIC_WORKER to "ಮನೆ ಕೆಲಸ ಸಹಾಯಕ",
        JobCategoryId.OTHER_JOBS to "ಇತರ ಕೆಲಸಗಳು"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "ಕಾರ್ಮಿಕ",
        UserRole.EMPLOYER to "ಉದ್ಯೋಗದಾತ",
        UserRole.OWNER_SUPER_ADMIN to "ಮಾಲೀಕ / ಸೂಪರ್ ಅಡ್ಮಿನ್"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "ಅರ್ಜಿ ಸಲ್ಲಿಸಲಾಗಿದೆ",
        ApplicationStatus.UNDER_REVIEW to "ಪರಿಶೀಲನೆಯಲ್ಲಿದೆ",
        ApplicationStatus.SHORTLISTED to "ಆಯ್ಕೆ ಪಟ್ಟಿಯಲ್ಲಿ",
        ApplicationStatus.ACCEPTED to "ಸ್ವೀಕರಿಸಲಾಗಿದೆ",
        ApplicationStatus.REJECTED to "ತಿರಸ್ಕರಿಸಲಾಗಿದೆ",
        ApplicationStatus.WITHDRAWN to "ಹಿಂಪಡೆಯಲಾಗಿದೆ",
        ApplicationStatus.COMPLETED to "ಪೂರ್ಣಗೊಂಡಿದೆ"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "ಬಾಕಿ ಇದೆ",
        TransactionStatus.SUCCESSFUL to "ಯಶಸ್ವಿ",
        TransactionStatus.FAILED to "ವಿಫಲ",
        TransactionStatus.REFUNDED to "ಮರುಪಾವತಿಯಾಗಿದೆ"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "ನಾಣ್ಯ ಖರೀದಿ",
        TransactionType.GIFT to "ಉಡುಗೊರೆ ಕ್ರೆಡಿಟ್",
        TransactionType.PROMO to "ಪ್ರೋಮೋ ಕ್ರೆಡಿಟ್",
        TransactionType.REFERRAL to "ರೆಫರಲ್ ಬೋನಸ್",
        TransactionType.BADGE_REWARD to "ಬ್ಯಾಡ್ಜ್ ಬಹುಮಾನ",
        TransactionType.LOYALTY_SUPPORT to "ನಿಷ್ಠೆ ಸಹಾಯ",
        TransactionType.JOB_FEE to "ಜಾಬ್ ಶುಲ್ಕ",
        TransactionType.WITHDRAWAL to "ಹಣ ಹಿಂಪಡೆಯುವಿಕೆ"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "ಬಾಕಿ ವೇತನ",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "ದೈಹಿಕ ಹಲ್ಲೆ",
        SafetyComplaintCategory.HARASSMENT to "ಕಿರುಕುಳ",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "ಊಟ / ವಸತಿ ಸಮಸ್ಯೆ",
        SafetyComplaintCategory.FRAUD to "ಕೆಲಸ ವಂಚನೆ",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "ಅಸುರಕ್ಷಿತ ಕೆಲಸದ ಸ್ಥಳ",
        SafetyComplaintCategory.OTHER_EMERGENCY to "ಇತರ ತುರ್ತು"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "ಹೊಸದು",
        SafetyCaseStatus.IN_REVIEW to "ಪರಿಶೀಲನೆಯಲ್ಲಿದೆ",
        SafetyCaseStatus.ADMIN_VERIFIED to "ಅಡ್ಮಿನ್ ಪರಿಶೀಲಿಸಿದ",
        SafetyCaseStatus.ACTION_TAKEN to "ಕ್ರಮ ಕೈಗೊಳ್ಳಲಾಗಿದೆ",
        SafetyCaseStatus.REFERRED to "ಕಳುಹಿಸಲಾಗಿದೆ",
        SafetyCaseStatus.CLOSED to "ಮುಚ್ಚಲಾಗಿದೆ"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "ಪ್ರಾರಂಭಿಕ",
        BadgeLevel.SILVER to "ಸಿಲ್ವರ್",
        BadgeLevel.GOLD to "ಗೋಲ್ಡ್",
        BadgeLevel.DIAMOND to "ಡೈಮಂಡ್",
        BadgeLevel.PLATINUM to "ಪ್ಲಾಟಿನಂ"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "ಕೆಲಸ ಪೋಸ್ಟ್ ಮಾಡುವಾಗ",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "ಪರಿಶೀಲಿಸಿದ ಸಂಪರ್ಕದಲ್ಲಿ",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "ಅರ್ಜಿ ಸ್ವೀಕರಿಸುವಾಗ"
    )
    override val indianStates = mapOf(
        "All States" to "ಎಲ್ಲಾ ರಾಜ್ಯಗಳು",
        "Telangana" to "ತೆಲಂಗಾಣ",
        "Andhra Pradesh" to "ಆಂಧ್ರ ಪ್ರದೇಶ",
        "Tamil Nadu" to "ತಮಿಳುನಾಡು",
        "Karnataka" to "ಕರ್ನಾಟಕ",
        "Maharashtra" to "ಮಹಾರಾಷ್ಟ್ರ",
        "Gujarat" to "ಗುಜರಾತ್",
        "Assam" to "ಅಸ್ಸಾಂ",
        "Bihar" to "ಬಿಹಾರ",
        "Uttar Pradesh" to "ಉತ್ತರ ಪ್ರದೇಶ",
        "West Bengal" to "ಪಶ್ಚಿಮ ಬಂಗಾಳ",
        "Odisha" to "ಒಡಿಶಾ",
        "Kerala" to "ಕೇರಳ",
        "Punjab" to "ಪಂಜಾಬ್"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "ಕ್ಲೌಡ್ ಡೇಟಾಬೇಸ್ ಮತ್ತು ಭದ್ರತೆ",
        "otp_sms" to "OTP ಮತ್ತು SMS ಸೇವೆ",
        "payment_gateway" to "UPI ಮತ್ತು ನಾಣ್ಯ ಪೇಮೆಂಟ್ ಗೇಟ್‌ವೇ",
        "face_liveness" to "ಮುಖ ಹೊಂದಾಣಿಕೆ ಮತ್ತು ಲೈವ್‌ನೆಸ್ ತಪಾಸಣೆ",
        "translation" to "ಲೈವ್ 12-ಭಾಷೆಯ ಕೆಲಸ ಅನುವಾದ",
        "telecom_ivr" to "ಕೀಪ್ಯಾಡ್ ಫೋನ್ ಮಿಸ್ಡ್-ಕಾಲ್ ಮತ್ತು IVR",
        "owner_pin_auth" to "ಮಾಲೀಕ ಬೂಟ್‌ಸ್ಟ್ರ್ಯಾಪ್ ಮತ್ತು 4-ಅಂಕಿಯ PIN ಸರ್ವರ್"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "ಸಂಪರ್ಕಗೊಂಡಿಲ್ಲ",
        IntegrationStatus.NEEDS_CREDENTIALS to "ಕೀ ಅಗತ್ಯ",
        IntegrationStatus.CONNECTED to "ಸಂಪರ್ಕಗೊಂಡಿದೆ"
    )

    override val msgOwnerPrivilegeBlocked = "ಅನಧಿಕೃತ: ಸಾರ್ವಜನಿಕ ಬಳಕೆದಾರರು ಎಂದಿಗೂ ಮಾಲೀಕ / ಸೂಪರ್ ಅಡ್ಮಿನ್ ಆಗಲು ಸಾಧ್ಯವಿಲ್ಲ."
    override val msgSwitchedPreviewFormat = "ಪೂರ್ವವೀಕ್ಷಣೆ ಖಾತೆಯನ್ನು %1\$s (%2\$s) ಗೆ ಬದಲಾಯಿಸಲಾಗಿದೆ."
    override val msgLanguageSavedFormat = "ಭಾಷೆಯನ್ನು %1\$s (%2\$s) ಗೆ ಬದಲಾಯಿಸಲಾಗಿದೆ"
    override val msgEnterNameBeforeOtp = "OTP ಕೇಳುವ ಮೊದಲು ನಿಮ್ಮ ಪೂರ್ಣ ಹೆಸರನ್ನು ನಮೂದಿಸಿ."
    override val msgEnterValidMobile = "ದಯವಿಟ್ಟು ಸರಿಯಾದ 10-ಅಂಕಿಯ ಮೊಬೈಲ್ ಸಂಖ್ಯೆಯನ್ನು ನಮೂದಿಸಿ."
    override val msgOtpDispatchedFormat = "ಸರ್ವರ್ OTP ಅನ್ನು %1\$s ಗೆ ಕಳುಹಿಸಲಾಗಿದೆ. ನಿಮ್ಮ ಫೋನ್‌ಗೆ ಬಂದ ಕೋಡ್ ನಮೂದಿಸಿ."
    override val msgUnableSendOtp = "OTP ಕಳುಹಿಸಲು ಸಾಧ್ಯವಾಗಲಿಲ್ಲ. ಬ್ಯಾಕೆಂಡ್ URL ಅಥವಾ ಇಂಟರ್ನೆಟ್ ಪರಿಶೀಲಿಸಿ."
    override val msgSendOtpAndEnterCode = "ಮೊದಲು OTP ಕಳುಹಿಸಿ 4–6 ಅಂಕಿಯ ಕೋಡ್ ನಮೂದಿಸಿ."
    override val msgOtpVerifiedCreateFormat = "ಮೊಬೈಲ್ OTP ಪರಿಶೀಲಿಸಲಾಗಿದೆ! ವಿವರಗಳನ್ನು ಭರ್ತಿ ಮಾಡಿ %1\$s ಪ್ರೊಫೈಲ್ ರಚಿಸಿ ಒತ್ತಿರಿ."
    override val msgIncorrectOtp = "ತಪ್ಪು ಅಥವಾ ಅವಧಿ ಮೀರಿದ OTP. ಹೊಸ OTP ಕೇಳಿ."
    override val msgServerOtpUnavailable = "ಸರ್ವರ್ OTP ಸೇವೆ ಲಭ್ಯವಿಲ್ಲ. ಲೈವ್ ಬ್ಯಾಕೆಂಡ್ ಸಂಪರ್ಕಿಸಿ."
    override val msgEnterFullName = "ಪೂರ್ಣ ಹೆಸರು ಅಗತ್ಯವಿದೆ."
    override val msgVerifyMobileOtpFirst = "ದಯವಿಟ್ಟು ಮೊದಲು ಮೊಬೈಲ್ OTP ಪರಿಶೀಲಿಸಿ."
    override val msgAccountCreatedFormat = "ಸ್ವಾಗತ %1\$s! %2\$s ಖಾತೆ ರಚಿಸಲಾಗಿದೆ (%3\$s)."
    override val msgLoggedInFormat = "%1\$s (%2\$s) ಆಗಿ ಲಾಗಿನ್ ಆಗಿದ್ದೀರಿ"
    override val msgSignedOut = "ಬಳಕೆದಾರ ಖಾತೆಯಿಂದ ಸೈನ್ ಔಟ್ ಆಗಿದ್ದೀರಿ."
    override val msgDuplicateOwnerBlocked = "ಭದ್ರತಾ ತಡೆ: ಮಾಲೀಕ ಖಾತೆ ಈಗಾಗಲೇ ಇದೆ. ಎರಡನೇ ಮಾಲೀಕರನ್ನು ರಚಿಸಲಾಗುವುದಿಲ್ಲ."
    override val msgBootstrapRequired = "ಸರ್ವರ್ ಬೂಟ್‌ಸ್ಟ್ರ್ಯಾಪ್ ಅನುಮತಿ ಕೋಡ್ ನಮೂದಿಸಿ."
    override val msgEnterPasswords = "ಮಾಲೀಕ ಲಾಗಿನ್ ಪಾಸ್‌ವರ್ಡ್ ನಮೂದಿಸಿ ದೃಢೀಕರಿಸಿ."
    override val msgPasswordsDoNotMatch = "ಪಾಸ್‌ವರ್ಡ್‌ಗಳು ಹೊಂದಾಣಿಕೆಯಾಗುತ್ತಿಲ್ಲ."
    override val msgPasswordTooShort = "ಪಾಸ್‌ವರ್ಡ್ ಕನಿಷ್ಠ 8 ಅಕ್ಷರಗಳಿರಬೇಕು."
    override val msgPinFourDigits = "ಅಡ್ಮಿನ್ PIN ನಿಖರವಾಗಿ 4 ಅಂಕಿಗಳಿರಬೇಕು."
    override val msgPinsDoNotMatch = "4-ಅಂಕಿಯ PIN ದೃಢೀಕರಣ ಹೊಂದಾಣಿಕೆಯಾಗುತ್ತಿಲ್ಲ."
    override val msgOwnerCreatedFormat = "%1\$s ಗಾಗಿ ಮಾಲೀಕ ಪ್ರೊಫೈಲ್ ರಚಿಸಲಾಗಿದೆ. ಹೊಸ ಮಾಲೀಕ ನೋಂದಣಿ ಶಾಶ್ವತವಾಗಿ ಲಾಕ್ ಆಗಿದೆ."
    override val msgOwnerLockedSession = "ಮಾಲೀಕ ಸೆಷನ್ ಲಾಕ್ ಆಗಿದೆ."
    override val msgOwnerTimedOut = "5 ನಿಮಿಷ ನಿಷ್ಕ್ರಿಯತೆಯಿಂದ ಮಾಲೀಕ ಸೆಷನ್ ಮುಗಿದಿದೆ. ಮತ್ತೆ PIN ನಮೂದಿಸಿ."
    override val msgOwnerUnlocked = "ಮಾಲೀಕ ಮಾಸ್ಟರ್ ಕಂಟ್ರೋಲ್ ತೆರೆಯಲಾಗಿದೆ."
    override val msgInvalidPinAttemptsFormat = "ತಪ್ಪು 4-ಅಂಕಿಯ ಮಾಲೀಕ PIN. ಇನ್ನೂ %1\$d ಪ್ರಯತ್ನ ಬಾಕಿ ಇದೆ."
    override val msgTooManyPinAttemptsFormat = "ತುಂಬಾ ತಪ್ಪು ಪ್ರಯತ್ನಗಳು. %1\$d ಸೆಕೆಂಡುಗಳವರೆಗೆ ಲಾಕ್ ಆಗಿದೆ."
    override val msgOwnerSessionRequired = "ಸಕ್ರಿಯ ಮಾಲೀಕ ಸೆಷನ್ ಅಗತ್ಯವಿದೆ."
    override val msgVerifyOtpBeforePinChange = "ಮೊದಲು ನೋಂದಾಯಿತ ಮೊಬೈಲ್‌ಗೆ ಬಂದ OTP ಪರಿಶೀಲಿಸಿ."
    override val msgPinUpdatedSuccess = "ಹೊಸ ಅಡ್ಮಿನ್ PIN ಸರ್ವರ್‌ನಲ್ಲಿ ಸುರಕ್ಷಿತವಾಗಿ ನವೀಕರಿಸಲಾಗಿದೆ."
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) ಗಾಗಿ ಡೆಮೊ ಪ್ರೊಫೈಲ್ ನವೀಕರಿಸಲಾಗಿದೆ"
    override val msgJobPostedFormat = "%1\$s ನಲ್ಲಿ ಡೆಮೊ ಕೆಲಸ ಪೋಸ್ಟ್ ಆಗಿದೆ! ಶುಲ್ಕ: %2\$d ನಾಣ್ಯ."
    override val msgAlreadyAppliedFormat = "%1\$s ಗೆ ಈಗಾಗಲೇ ಅರ್ಜಿ ಸಲ್ಲಿಸಲಾಗಿದೆ"
    override val msgApplicationSentFormat = "%1\$s ಗೆ ಅರ್ಜಿ ಕಳುಹಿಸಲಾಗಿದೆ"
    override val msgApplicationWithdrawnFormat = "ಅರ್ಜಿ %1\$s ಹಿಂಪಡೆಯಲಾಗಿದೆ"
    override val msgApplicationUpdatedFormat = "ಅರ್ಜಿ %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "ವಾರದ ತಪಾಸಣೆ ದಾಖಲಾಗಿದೆ: 1 · ನಾನು ಸುರಕ್ಷಿತವಾಗಿದ್ದೇನೆ."
    override val msgCheckInProblemRecorded = "ಎಚ್ಚರಿಕೆ ದಾಖಲಾಗಿದೆ (2 · ಸಮಸ್ಯೆ). ಸುರಕ್ಷತಾ ಕೇಂದ್ರಕ್ಕೆ ತಿಳಿಸಲಾಗಿದೆ."
    override val msgCheckInAdminRequested = "ತುರ್ತು ಅಡ್ಮಿನ್ ಕಾಲ್‌ಬ್ಯಾಕ್ ಕೋರಲಾಗಿದೆ (3). ಕುಟುಂಬ ಎಚ್ಚರಿಕೆ ಸರದಿಯಲ್ಲಿದೆ."
    override val msgSafetyComplaintSubmittedFormat = "ಸುರಕ್ಷತಾ ಪ್ರಕರಣ %1\$s ದಾಖಲಾಗಿದೆ."
    override val msgWithdrawalsFrozen = "ತುರ್ತು ತಡೆ ಸಕ್ರಿಯ: ಎಲ್ಲಾ ಹಣ ಹಿಂಪಡೆಯುವಿಕೆ ತಕ್ಷಣ ಲಾಕ್ ಆಗಿವೆ."
    override val msgWithdrawalsUnfrozen = "ಪರಿಶೀಲನೆಯ ನಂತರ ಹಣ ಹಿಂಪಡೆಯುವಿಕೆ ಅನ್‌ಲಾಕ್ ಆಗಿದೆ."
    override val msgOwnerNoticePublished = "ಕೆಂಪು LOBORO ಅಡ್ಮಿನ್ ಪ್ರಕಟಣೆ ಪ್ರಸಾರವಾಗಿದೆ."
}
