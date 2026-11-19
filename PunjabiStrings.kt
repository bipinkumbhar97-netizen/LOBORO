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

object PunjabiStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "ਗਲੋਬਲ ਜੌਬ ਅਤੇ ਸੇਵਾ"
    override val demoPreviewBanner = "ਡੈਮੋ ਪ੍ਰੀਵਿਊ ਡਾਟਾ · ਲਾਈਵ ਵਰਤੋਂ ਲਈ ਸੈਟਿੰਗਾਂ ਵਿੱਚ ਬੈਕਐਂਡ API ਜੋੜੋ"
    override val verifiedNormalAccountBanner = "ਪ੍ਰਮਾਣਿਤ ਵਰਤੋਂਕਾਰ ਖਾਤਾ · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO ਐਡਮਿਨ ਸੂਚਨਾ"
    override val maintenanceModeBanner = "ਮੈਂਟੇਨੈਂਸ ਮੋਡ ਚਾਲੂ ਹੈ · ਭਰਤੀ ਅਤੇ ਵਾਲਿਟ ਅਸਥਾਈ ਤੌਰ 'ਤੇ ਬੰਦ ਹਨ। ਐਮਰਜੈਂਸੀ 112 ਅਤੇ ਸੁਰੱਖਿਆ ਸੇਵਾ ਚਾਲੂ ਹੈ।"
    override val navHome = "ਹੋਮ"
    override val navSearchJobs = "ਕੰਮ ਲੱਭੋ"
    override val navPostJob = "ਕੰਮ ਪਾਓ"
    override val navWallet = "ਵਾਲਿਟ"
    override val navMyApplications = "ਮੇਰੀਆਂ ਅਰਜ਼ੀਆਂ"
    override val navMyJobs = "ਮੇਰੇ ਕੰਮ"
    override val navNotifications = "ਸੂਚਨਾਵਾਂ"
    override val navHelpSafety = "ਮਦਦ ਅਤੇ ਸੁਰੱਖਿਆ"
    override val navProfile = "ਪ੍ਰੋਫਾਈਲ"
    override val navSettings = "ਸੈਟਿੰਗਾਂ"
    override val navAdmin = "ਮਾਲਕ ਕੰਟਰੋਲ"
    override val navBadgesLoyalty = "ਬੈਜ ਅਤੇ ਵਫ਼ਾਦਾਰੀ"
    override val navIvrKeypad = "ਕੀਪੈਡ ਅਤੇ IVR"
    override val backLabel = "ਪਿੱਛੇ"
    override val homeLabel = "ਹੋਮ"
    override val languageLabel = "ਭਾਸ਼ਾ"
    override val languageSelectorTitle = "12 ਭਾਸ਼ਾਵਾਂ"
    override val activeBadgeLabel = "ਸਰਗਰਮ"
    override val closeLabel = "ਬੰਦ ਕਰੋ"
    override val okLabel = "ਠੀਕ ਹੈ"
    override val understoodLabel = "ਸਮਝ ਗਿਆ"
    override val cancelLabel = "ਰੱਦ ਕਰੋ"
    override val doneLabel = "ਮੁਕੰਮਲ"
    override val confirmActionLabel = "ਪੁਸ਼ਟੀ ਕਰੋ"
    override val resetLabel = "ਰੀਸੈੱਟ"
    override val sendLabel = "ਭੇਜੋ"

    override val shareAppTitle = "LOBORO ਐਪ ਸ਼ੇਅਰ ਕਰੋ"
    override val shareAppCta = "ਦੋਸਤਾਂ ਨਾਲ ਸ਼ੇਅਰ ਕਰੋ ਅਤੇ ਇਨਾਮ ਜਿੱਤੋ"
    override val yourReferralLinkLabel = "ਤੁਹਾਡਾ ਰੈਫਰਲ ਲਿੰਕ"
    override val loboroLinkLabel = "LOBORO ਲਿੰਕ"
    override val shareMenuButton = "ਸ਼ੇਅਰ ਮੀਨੂ"
    override val copyLinkButton = "ਲਿੰਕ ਕਾਪੀ ਕਰੋ"
    override val referralCopiedToast = "ਰੈਫਰਲ ਸੁਨੇਹਾ ਕਾਪੀ ਹੋ ਗਿਆ"
    override val openingShareMenuToast = "ਸ਼ੇਅਰ ਮੀਨੂ ਖੁੱਲ੍ਹ ਰਿਹਾ ਹੈ"
    override val shareMessageTemplate = "LOBORO ਗਲੋਬਲ ਜੌਬ ਅਤੇ ਸੇਵਾ ਨਾਲ ਜੁੜੋ! ਪੂਰੇ ਭਾਰਤ ਵਿੱਚ ਦਿਹਾੜੀ ਜਾਂ ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ ਵਾਲਾ ਕੰਮ ਲੱਭੋ। ਮੇਰਾ ਰੈਫਰਲ ID %1\$s ਵਰਤੋ: %2\$s"

    override val registerWorkerEmployerCta = "ਮਜ਼ਦੂਰ / ਮਾਲਕ ਵਜੋਂ ਰਜਿਸਟਰ ਕਰੋ"
    override val logInLabel = "ਲੌਗ ਇਨ"
    override val signOutLabel = "ਸਾਈਨ ਆਉਟ"
    override val voiceSearchHint = "ਕੰਮ ਜਾਂ ਸ਼ਹਿਰ ਬੋਲੋ ਜਾਂ ਲਿਖੋ (ਜਿਵੇਂ: ਹੈਦਰਾਬਾਦ ਵਿੱਚ ਰਾਜਮਿਸਤਰੀ)"
    override val tapMicToSpeak = "ਬੋਲ ਕੇ ਕੰਮ ਲੱਭਣ ਲਈ ਮਾਈਕ ਦਬਾਓ"
    override val listeningStatus = "ਸੁਣ ਰਹੇ ਹਾਂ... ਆਪਣਾ ਲੋੜੀਂਦਾ ਕੰਮ ਬੋਲੋ"
    override val stopListening = "ਸੁਣਨਾ ਬੰਦ ਕਰੋ"
    override val searchAction = "ਲੱਭੋ"
    override val retryVoice = "ਦੁਬਾਰਾ ਬੋਲੋ"
    override val voiceMicPermissionNeeded = "ਵੌਇਸ ਖੋਜ ਲਈ ਮਾਈਕ ਦੀ ਇਜਾਜ਼ਤ ਸਿਰਫ਼ ਉਦੋਂ ਮੰਗੀ ਜਾਂਦੀ ਹੈ ਜਦੋਂ ਤੁਸੀਂ ਮਾਈਕ ਬਟਨ ਦਬਾਉਂਦੇ ਹੋ।"
    override val voiceUnavailableHonest = "ਇਸ ਡਿਵਾਈਸ ਵਿੱਚ ਵੌਇਸ ਪਛਾਣ ਸੇਵਾ ਇੰਸਟਾਲ ਨਹੀਂ ਹੈ। ਕਲਾਉਡ ਵੌਇਸ ਸੇਵਾ ਜੋੜੋ ਜਾਂ ਹੇਠਾਂ ਦਿੱਤਾ ਵਿਕਲਪ ਚੁਣੋ।"
    override val voiceNoMatchError = "ਆਵਾਜ਼ ਸਪਸ਼ਟ ਨਹੀਂ ਸੁਣੀ। ਸਾਫ਼ ਬੋਲੋ ਜਾਂ ਹੇਠਾਂ ਦਿੱਤਾ ਨਮੂਨਾ ਚੁਣੋ।"
    override val voiceNetworkError = "ਨੈੱਟਵਰਕ ਗਲਤੀ। ਇੰਟਰਨੈੱਟ ਜਾਂਚੋ ਜਾਂ ਕੰਮ ਟਾਈਪ ਕਰੋ।"
    override val voiceStoppedError = "ਵੌਇਸ ਇਨਪੁੱਟ ਰੁਕ ਗਿਆ (ਕੋਡ %1\$d)। ਟਾਈਪ ਕਰੋ ਜਾਂ ਦੁਬਾਰਾ ਕੋਸ਼ਿਸ਼ ਕਰੋ।"
    override val voicePrivacyHint = "ਗੋਪਨੀਯਤਾ: ਮਾਈਕ ਆਮ ਤੌਰ 'ਤੇ ਬੰਦ ਰਹਿੰਦਾ ਹੈ ਅਤੇ ਸਿਰਫ਼ ਤੁਹਾਡੇ ਦਬਾਉਣ 'ਤੇ ਹੀ ਚਾਲੂ ਹੁੰਦਾ ਹੈ।"
    override val clearSearchDesc = "ਖੋਜ ਸਾਫ਼ ਕਰੋ"
    override val spokenSamples = listOf(
        "ਹੈਦਰਾਬਾਦ ਵਿੱਚ ਰਾਜਮਿਸਤਰੀ" to "Mason",
        "ਪੁਣੇ ਵਿੱਚ ਇਲੈਕਟ੍ਰੀਸ਼ੀਅਨ" to "Electrician",
        "ਚੇਨਈ ਹੋਟਲ ਰਸੋਈਆ" to "Cook",
        "ਵਿਜੇਵਾੜਾ ਡਰਾਈਵਰ" to "Driver",
        "ਸੂਰਤ ਪੈਕਿੰਗ ਕੰਮ" to "Packing"
    )
    override val dailyJobsTitle = "ਰੋਜ਼ਾਨਾ ਕੰਮ (Daily)"
    override val dailyJobsSubtitle = "ਦਿਹਾੜੀਦਾਰ ਕੰਮ · ਮਹੀਨਾਵਾਰ ਕੰਮਾਂ ਤੋਂ ਵੱਖਰੀ ਸੂਚੀ"
    override val monthlyJobsTitle = "ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ ਵਾਲੇ ਕੰਮ"
    override val monthlyJobsSubtitle = "ਪੱਕੀ ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ · ਛੁੱਟੀ ਅਤੇ ਰਿਹਾਇਸ਼ ਦੀ ਜਾਣਕਾਰੀ"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "ਕੰਮ ਦੀਆਂ ਸ਼੍ਰੇਣੀਆਂ (24)"
    override val walletStripSummaryFormat = "%1\$d ਸਿੱਕੇ (₹%2\$d) · 100%% ਕਢਵਾਉਣ ਯੋਗ"

    override val outOfStateTitle = "ਹੋਰ ਰਾਜਾਂ ਅਤੇ ਗਲੋਬਲ ਕੰਮ ਦੀ ਖੋਜ"
    override val willingToRelocate = "ਹੋਰ ਰਾਜ ਵਿੱਚ ਜਾ ਕੇ ਕੰਮ ਕਰਨ ਲਈ ਤਿਆਰ"
    override val filterCountry = "ਦੇਸ਼"
    override val filterState = "ਰਾਜ"
    override val filterDistrict = "ਜ਼ਿਲ੍ਹਾ"
    override val filterCity = "ਸ਼ਹਿਰ"
    override val filterDistance = "ਦੂਰੀ"
    override val upToKmFormat = "%1\$d ਕਿ.ਮੀ. ਤੱਕ"
    override val filterFoodIncluded = "ਖਾਣਾ ਮਿਲੇਗਾ"
    override val filterAccommodation = "ਕਮਰਾ / ਰਿਹਾਇਸ਼"
    override val allCategoriesLabel = "ਸਾਰੀਆਂ ਸ਼੍ਰੇਣੀਆਂ"
    override val noMatchingJobsTitle = "ਤੁਹਾਡੇ ਫਿਲਟਰ ਮੁਤਾਬਕ ਕੋਈ ਕੰਮ ਨਹੀਂ ਮਿਲਿਆ"
    override val noMatchingJobsSubtitle = "ਫਿਲਟਰ ਰੀਸੈੱਟ ਕਰੋ ਜਾਂ 'ਹੋਰ ਰਾਜ ਵਿੱਚ ਕੰਮ' ਚਾਲੂ ਕਰੋ।"
    override val showAllJobsButton = "ਸਾਰੇ ਕੰਮ ਦਿਖਾਓ"
    override val dailyWageJobBadge = "ਦਿਹਾੜੀਦਾਰ ਕੰਮ"
    override val monthlySalaryJobBadge = "ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ ਵਾਲਾ ਕੰਮ"
    override val demoDataTag = "ਡੈਮੋ"
    override val originalLangFormat = "ਮੂਲ ਭਾਸ਼ਾ: %1\$s"
    override val preTranslatedPreviewNote = "ਪਹਿਲਾਂ ਤੋਂ ਅਨੁਵਾਦਿਤ ਪ੍ਰੀਵਿਊ ਚਾਲੂ ਹੈ। ਲਾਈਵ ਕੰਮਾਂ ਲਈ ਸੈਟਿੰਗਾਂ ਵਿੱਚ ਅਨੁਵਾਦ API ਕੁੰਜੀ ਜੋੜੋ।"
    override val configureTranslationApiNote = "ਸਾਰੀਆਂ 12 ਭਾਸ਼ਾਵਾਂ ਵਿੱਚ ਲਾਈਵ ਅਨੁਵਾਦ ਲਈ ਸੈਟਿੰਗਾਂ ਵਿੱਚ ਅਨੁਵਾਦ API ਕੁੰਜੀ ਜੋੜੋ।"
    override val translatedToggle = "ਅਨੁਵਾਦਿਤ"
    override val originalToggle = "ਮੂਲ"
    override val compensationLabel = "ਦਿਹਾੜੀ / ਤਨਖਾਹ"
    override val locationLabel = "ਥਾਂ"
    override val employerLabel = "ਰੁਜ਼ਗਾਰਦਾਤਾ"
    override val vacanciesUnit = "ਅਸਾਮੀਆਂ"
    override val perDayFormat = "₹%1\$d / ਦਿਨ"
    override val perMonthFormat = "₹%1\$d / ਮਹੀਨਾ"
    override val coinsCountFormat = "%1\$d ਸਿੱਕੇ"
    override val foodBadge = "ਖਾਣਾ"
    override val stayBadge = "ਰਿਹਾਇਸ਼"
    override val shareJobButton = "ਕੰਮ ਸ਼ੇਅਰ ਕਰੋ"
    override val applyNow = "ਅਰਜ਼ੀ ਦਿਓ"
    override val saveJob = "ਸੇਵ ਕਰੋ"
    override val negotiateChat = "ਗੱਲਬਾਤ / ਚੈਟ"
    override val reportJob = "ਸ਼ਿਕਾਇਤ ਕਰੋ"
    override val foodAvailable = "ਖਾਣਾ ਸ਼ਾਮਲ"
    override val accommodationAvailable = "ਰਿਹਾਇਸ਼ ਸ਼ਾਮਲ"
    override val notProvided = "ਸ਼ਾਮਲ ਨਹੀਂ"
    override val workersNeeded = "ਲੋੜੀਂਦੇ ਮਜ਼ਦੂਰ"
    override val workHoursLabel = "ਕੰਮ ਦੇ ਘੰਟੇ"
    override val overtimeLabel = "ਓਵਰਟਾਈਮ"
    override val paymentFreqLabel = "ਭੁਗਤਾਨ"
    override val weeklyHolidayLabel = "ਹਫ਼ਤਾਵਾਰੀ ਛੁੱਟੀ"
    override val leavePolicyLabel = "ਛੁੱਟੀ ਦੇ ਨਿਯਮ"
    override val joiningDateLabel = "ਸ਼ਾਮਲ ਹੋਣ ਦੀ ਤਾਰੀਖ"
    override val expiryLabel = "ਮਿਆਦ ਖਤਮ"
    override val translatedBadgeLabel = "ਅਨੁਵਾਦਿਤ"

    override val postingPausedFormat = "ਕੰਮ ਪੋਸਟ ਕਰਨਾ ਫਿਲਹਾਲ ਮਾਲਕ ਕੰਟਰੋਲ (%1\$s) ਵੱਲੋਂ ਰੋਕਿਆ ਗਿਆ ਹੈ।"
    override val selectCategoryLabel = "ਸ਼੍ਰੇਣੀ ਚੁਣੋ (24 ਸ਼੍ਰੇਣੀਆਂ)"
    override val jobTitleLabel = "ਕੰਮ ਦਾ ਸਿਰਲੇਖ"
    override val jobTitlePlaceholder = "ਜਿਵੇਂ: ਹੋਸਟਲ ਇਮਾਰਤ ਲਈ 4 ਰਾਜਮਿਸਤਰੀ ਚਾਹੀਦੇ ਹਨ"
    override val jobDescLabel = "ਕੰਮ ਦਾ ਵੇਰਵਾ"
    override val jobDescPlaceholder = "ਕੰਮ ਦੀ ਜਾਣਕਾਰੀ, ਸੁਰੱਖਿਆ ਸਾਮਾਨ, ਖਾਣਾ ਅਤੇ ਰਿਹਾਇਸ਼ ਸਹੂਲਤ"
    override val dailyWageInrLabel = "ਰੋਜ਼ਾਨਾ ਦਿਹਾੜੀ (₹)"
    override val monthlySalaryInrLabel = "ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ (₹)"
    override val vacanciesLabel = "ਖਾਲੀ ਅਸਾਮੀਆਂ"
    override val cityTownLabel = "ਸ਼ਹਿਰ / ਕਸਬਾ"
    override val stateLabel = "ਰਾਜ"
    override val transparentJobFeeTitle = "ਪਾਰਦਰਸ਼ੀ ਜੌਬ ਫੀਸ: %1\$d ਸਿੱਕੇ (₹%2\$d)"
    override val configuredByOwnerSub = "ਮਾਲਕ ਵੱਲੋਂ ਤੈਅ · ਫੀਸ ਸਮਾਂ: %1\$s · ਉਪਲਬਧ: %2\$d ਸਿੱਕੇ"
    override val confirmAndPostJobButton = "ਪੁਸ਼ਟੀ ਕਰੋ ਅਤੇ ਕੰਮ ਪਾਓ (%1\$d ਸਿੱਕੇ)"

    override val walletBalanceTitle = "LOBORO ਸਿੱਕਾ ਬੈਲੰਸ"
    override val withdrawableValueFormat = "₹%1\$d ਕਢਵਾਉਣ ਯੋਗ ਮੁੱਲ (1 ਸਿੱਕਾ = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% ਬਰਾਬਰ ਪੈਸੇ ਕਢਵਾਉਣ ਦਾ ਨਿਯਮ"
    override val withdrawableRuleBody = "ਖਰੀਦੇ, ਤੋਹਫ਼ੇ, ਆਫਰ, ਰੈਫਰਲ, ਬੈਜ ਜਾਂ ਵਫ਼ਾਦਾਰੀ ਦੇ ਸਾਰੇ ਸਿੱਕੇ ਬਰਾਬਰ ਨਕਦ ਮੁੱਲ ਅਤੇ 100% ਕਢਵਾਉਣ ਯੋਗ ਹਨ। ਕੋਈ ਬੰਦ ਸਿੱਕਾ ਨਹੀਂ।"
    override val buyCoins = "ਸਿੱਕੇ ਖਰੀਦੋ"
    override val withdrawCoins = "ਪੈਸੇ ਕਢਵਾਓ"
    override val walletActionsPausedNote = "ਕੁਝ ਵਾਲਿਟ ਸੇਵਾਵਾਂ ਮਾਲਕ ਵੱਲੋਂ ਰੋਕੀਆਂ ਗਈਆਂ ਹਨ। ਤੁਹਾਡਾ ਮੌਜੂਦਾ ਬੈਲੰਸ ਅਤੇ ਮਨਜ਼ੂਰ ਰਿਫੰਡ ਸੁਰੱਖਿਅਤ ਹਨ।"
    override val coinPackagesTitle = "ਸਿੱਕਾ ਪੈਕੇਜ (ਪਾਰਦਰਸ਼ੀ ਕੀਮਤ)"
    override val bankSecurityTitle = "ਬੈਂਕ / UPI ਅਤੇ ਚਿਹਰਾ ਜਾਂਚ ਸੁਰੱਖਿਆ"
    override val payoutDestinationLabel = "ਪ੍ਰਮਾਣਿਤ ਬੈਂਕ ਖਾਤਾ: %1\$s"
    override val bankSecurityStepsNote = "ਬੈਂਕ/UPI ਬਦਲਣ ਲਈ ਲਾਜ਼ਮੀ ਜਾਂਚ: ਰਜਿਸਟਰਡ ਮੋਬਾਈਲ OTP + ਲਾਈਵ ਸੈਲਫੀ ਮਿਲਾਣ + ਅਸਥਾਈ ਭੁਗਤਾਨ ਰੋਕ।"
    override val changeBankUpiButton = "ਬੈਂਕ / UPI ਬਦਲੋ (OTP + ਚਿਹਰਾ ਜਾਂਚ)"
    override val unfreezePayoutsButton = "ਕਢਵਾਉਣਾ ਅਨਲੌਕ ਕਰੋ"
    override val lostPhoneFreezeButton = "ਫੋਨ ਗੁਆਚ ਗਿਆ? ਪੈਸੇ ਕਢਵਾਉਣਾ ਰੋਕੋ"
    override val payoutFreezeActiveNote = "ਕਢਵਾਉਣ ਦੀ ਰੋਕ ਚਾਲੂ ਹੈ। ਪਛਾਣ ਦੀ ਮੁੜ ਜਾਂਚ ਤੱਕ ਕੋਈ ਪੈਸਾ ਨਹੀਂ ਨਿਕਲੇਗਾ।"
    override val transactionHistory = "ਸਿੱਕਾ ਲੈਣ-ਦੇਣ ਖਾਤਾ"
    override val demoLedgerSuffix = "(ਡੈਮੋ ਖਾਤਾ)"
    override val buyCoinsDialogTitleFormat = "%1\$d ਸਿੱਕੇ ਖਰੀਦੋ (₹%2\$d)"
    override val paymentNotConnectedBody = "ਲਾਈਵ Razorpay / Cashfree UPI ਭੁਗਤਾਨ ਹਾਲੇ ਜੁੜਿਆ ਨਹੀਂ ਹੈ। ਅਸਲ ਪੈਸੇ ਲੈਣ ਤੋਂ ਪਹਿਲਾਂ ਪ੍ਰੋਡਕਸ਼ਨ ਕੁੰਜੀਆਂ ਜੋੜੋ।"
    override val withdrawDialogTitleFormat = "₹%1\$d ਕਢਵਾਓ"
    override val withdrawDialogBodyFormat = "ਪੂਰਾ ਬੈਲੰਸ (%1\$d ਸਿੱਕੇ) ਬਰਾਬਰ ਨਕਦ ਮੁੱਲ ਨਾਲ 100%% ਕਢਵਾਉਣ ਯੋਗ ਹੈ।\nਖਾਤਾ: %2\$s\n\nਇਸ ਬਿਲਡ ਵਿੱਚ ਲਾਈਵ IMPS / UPI ਗੇਟਵੇ ਜੁੜਿਆ ਨਹੀਂ ਹੈ।"
    override val bankChangeDialogTitle = "3-ਪੜਾਅ ਬੈਂਕ / UPI ਬਦਲਾਅ ਸੁਰੱਖਿਆ"
    override val bankChangeDialogBody = "ਫੋਨ ਗੁਆਚਣ 'ਤੇ ਸੁਰੱਖਿਆ ਲਈ ਬੈਂਕ/UPI ਬਦਲਣ ਵਾਸਤੇ ਲੋੜੀਂਦਾ ਹੈ:\n1. ਰਜਿਸਟਰਡ ਮੋਬਾਈਲ OTP ਜਾਂਚ\n2. ਰਜਿਸਟ੍ਰੇਸ਼ਨ ਫੋਟੋ ਨਾਲ ਲਾਈਵ ਚਿਹਰਾ ਮਿਲਾਣ\n3. ਭੁਗਤਾਨ ਤੋਂ ਪਹਿਲਾਂ ਸੁਰੱਖਿਆ ਉਡੀਕ ਸਮਾਂ"
    override val receiptDialogTitle = "ਲੈਣ-ਦੇਣ ਰਸੀਦ"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "ਹਵਾਲਾ: %1\$s"
    override val receiptTypeLabel = "ਕਿਸਮ: %1\$s"
    override val receiptCoinsLabel = "ਸਿੱਕੇ: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "ਸਥਿਤੀ: %1\$s"
    override val receiptTimeLabel = "ਸਮਾਂ: %1\$s"
    override val receiptWithdrawableYes = "ਕਢਵਾਉਣ ਯੋਗਤਾ: 100% ਹਾਂ"

    override val employerAppsHeading = "ਅਰਜ਼ੀਆਂ ਅਤੇ ਸਿੱਧੀ ਗੱਲਬਾਤ"
    override val secureChatHeading = "ਸੁਰੱਖਿਅਤ ਮਜ਼ਦੂਰ ↔ ਰੁਜ਼ਗਾਰਦਾਤਾ ਚੈਟ"
    override val secureChatSubtitle = "ਜਦੋਂ ਤੱਕ ਤੁਸੀਂ ਖੁਦ ਸ਼ੇਅਰ ਨਾ ਕਰੋ, ਫੋਨ ਨੰਬਰ ਲੁਕਿਆ ਰਹਿੰਦਾ ਹੈ। ਖੋਲ੍ਹਣ ਜਾਂ ਬਲੌਕ ਕਰਨ ਲਈ ਟੈਪ ਕਰੋ।"
    override val chatButton = "ਚੈਟ"
    override val workerEmployerLineFormat = "ਮਜ਼ਦੂਰ: %1\$s (%2\$s) · ਰੁਜ਼ਗਾਰਦਾਤਾ: %3\$s"
    override val shortlistButton = "ਸ਼ਾਰਟਲਿਸਟ"
    override val acceptButton = "ਮਨਜ਼ੂਰ ਕਰੋ"
    override val withdrawButton = "ਵਾਪਸ ਲਓ"
    override val phoneHiddenPrivacy = "ਗੋਪਨੀਯਤਾ ਚਾਲੂ: ਦੋਵੇਂ ਧਿਰਾਂ ਦੀ ਮਨਜ਼ੂਰੀ ਤੋਂ ਬਿਨਾਂ ਨਿੱਜੀ ਫੋਨ ਨੰਬਰ ਲੁਕਿਆ ਰਹਿੰਦਾ ਹੈ।"
    override val blockUserLabel = "ਬਲੌਕ"
    override val userBlockedNotice = "ਤੁਸੀਂ ਇਹ ਗੱਲਬਾਤ ਬਲੌਕ ਕੀਤੀ ਹੈ। ਲੋੜ ਪੈਣ 'ਤੇ ਸੁਰੱਖਿਆ ਡੈਸਕ 'ਤੇ ਸ਼ਿਕਾਇਤ ਕਰੋ।"
    override val chatPlaceholder = "ਆਪਣੀ ਭਾਸ਼ਾ ਵਿੱਚ ਸੁਨੇਹਾ ਲਿਖੋ..."

    override val automaticBadgePrefix = "ਆਟੋਮੈਟਿਕ ਬੈਜ: %1\$s"
    override val badgeStatsFormat = "ਰੇਟਿੰਗ %1\$.1f ★ · %2\$d ਪ੍ਰਮਾਣਿਤ ਕੰਮ ਦਿਨ · %3\$d ਮੁਕੰਮਲ ਕੰਮ"
    override val progressToFormat = "%1\$s ਬੈਜ ਵੱਲ ਤਰੱਕੀ: %2\$d / %3\$d ਦਿਨ"
    override val badgeAntiAbuseNote = "ਬੈਜ ਸਿਰਫ਼ ਅਸਲ ਪੂਰੇ ਕੀਤੇ ਕੰਮਾਂ, ਪ੍ਰਮਾਣਿਤ ਹਾਜ਼ਰੀ ਅਤੇ ਨਿਰਪੱਖ ਰੇਟਿੰਗ ਤੋਂ ਮਿਲਦੇ ਹਨ — ਖਰੀਦੇ ਨਹੀਂ ਜਾਂਦੇ।"
    override val badgeTiersTitle = "5 ਆਟੋਮੈਟਿਕ ਬੈਜ ਪੱਧਰ"
    override val minWorkdaysFormat = "ਘੱਟੋ-ਘੱਟ %1\$d ਕੰਮ ਦਿਨ · ਘੱਟੋ-ਘੱਟ %2\$.1f★ ਰੇਟਿੰਗ"
    override val badgeAppealsNote = "ਨਿਰਪੱਖ ਸੁਰੱਖਿਆ: ਅਚਾਨਕ ਸ਼ੱਕੀ 1-ਸਟਾਰ ਰੇਟਿੰਗ ਦੀ ਅਪੀਲ 'ਤੇ ਸਮੀਖਿਆ ਕੀਤੀ ਜਾਂਦੀ ਹੈ।"
    override val loyaltyTitle = "ਸੀਨੀਆਰਤਾ ਅਤੇ ਵਫ਼ਾਦਾਰੀ ਵਿੱਤੀ ਸਹਾਇਤਾ"
    override val loyaltySubtitle = "ਪਾਰਦਰਸ਼ੀ ਤਿਮਾਹੀ ਭਲਾਈ ਅਤੇ ਮੀਲ-ਪੱਥਰ ਬੋਨਸ"
    override val loyaltyDisclaimer = "ਲਾਜ਼ਮੀ ਜਾਣਕਾਰੀ: ਇਹ ਬੀਮਾ ਨਹੀਂ ਹੈ ਅਤੇ ਨਾ ਹੀ ਪੱਕੀ ਮਹੀਨਾਵਾਰ ਪੈਨਸ਼ਨ ਹੈ। ਇਹ ਯੋਗਤਾ, ਕੰਮ ਦਿਨ, ਬਜਟ ਅਤੇ ਪ੍ਰਵਾਨਗੀ ਦੇ ਅਧੀਨ ਹੈ।"
    override val loyaltyMinMembershipFormat = "ਘੱਟੋ-ਘੱਟ ਮੈਂਬਰਸ਼ਿਪ: %1\$d ਮਹੀਨੇ"
    override val loyaltyWorkdaysFormat = "ਪ੍ਰਮਾਣਿਤ ਕੰਮ ਦਿਨ: %1\$d+ ਦਿਨ"
    override val loyaltyRequiredBadgeFormat = "ਲੋੜੀਂਦਾ ਬੈਜ: %1\$s+"
    override val loyaltyRequiredRatingFormat = "ਘੱਟੋ-ਘੱਟ ਰੇਟਿੰਗ: %1\$.1f★"
    override val loyaltyBudgetFormat = "ਪ੍ਰਵਾਨਿਤ ਮਦਦ: ₹%1\$d · ਬਜਟ ਪੂਲ: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "ਮਜ਼ਦੂਰ ਸੁਰੱਖਿਆ ਅਤੇ ਐਮਰਜੈਂਸੀ ਮਦਦ"
    override val callEmergency112 = "ਐਮਰਜੈਂਸੀ 112 'ਤੇ ਕਾਲ ਕਰੋ"
    override val weeklyCheckInTitle = "ਹਫ਼ਤਾਵਾਰੀ ਸੁਰੱਖਿਆ ਜਾਂਚ"
    override val weeklyCheckInQuestion = "ਕੀ ਤੁਸੀਂ ਸੁਰੱਖਿਅਤ ਹੋ?"
    override val checkInOpt1 = "1 · ਮੈਂ ਸੁਰੱਖਿਅਤ ਹਾਂ"
    override val checkInOpt2 = "2 · ਮੈਨੂੰ ਮੁਸ਼ਕਲ ਹੈ"
    override val checkInOpt3 = "3 · LOBORO ਐਡਮਿਨ ਨਾਲ ਗੱਲ ਕਰੋ"
    override val reportSafetyIssue = "ਸੁਰੱਖਿਆ / ਤਨਖਾਹ ਸ਼ਿਕਾਇਤ ਦਰਜ ਕਰੋ"
    override val safetyOperationalNote = "ਕੰਮ ਪੋਸਟ ਜਾਂ ਭੁਗਤਾਨ ਬੰਦ ਹੋਣ 'ਤੇ ਵੀ ਸੁਰੱਖਿਆ ਸੇਵਾ ਹਮੇਸ਼ਾ ਚਾਲੂ ਰਹਿੰਦੀ ਹੈ।"
    override val safetyDisclaimerNote = "ਤੁਰੰਤ ਖ਼ਤਰੇ ਵਿੱਚ ਸਿੱਧਾ 112 'ਤੇ ਕਾਲ ਕਰੋ। ਨਿਰਪੱਖ ਵਿਚੋਲਗੀ ਲਈ LOBORO ਸ਼ਿਕਾਇਤਾਂ ਦਰਜ ਕਰਦਾ ਹੈ।"
    override val everyDaysFormat = "ਹਰ %1\$d ਦਿਨਾਂ ਬਾਅਦ"
    override val lastStatusFormat = "ਆਖਰੀ ਜਾਂਚ: %1\$s"
    override val checkInNoResponseNote = "ਲਗਾਤਾਰ 2 ਜਾਂਚਾਂ ਖੁੰਝ ਜਾਣ ਜਾਂ ਮੁਸ਼ਕਲ ਚੁਣਨ 'ਤੇ LOBORO SMS, ਐਡਮਿਨ ਸਮੀਖਿਆ ਅਤੇ ਸਹਿਮਤੀ ਨਾਲ ਪਰਿਵਾਰ ਨੂੰ ਸੂਚਿਤ ਕਰਦਾ ਹੈ।"
    override val consentEmergencyTitle = "ਸਹਿਮਤੀ ਅਧਾਰਤ ਐਮਰਜੈਂਸੀ ਟਿਕਾਣਾ ਅਤੇ ਪਰਿਵਾਰ ਸੰਪਰਕ"
    override val workerIdLabel = "ਮਜ਼ਦੂਰ ID: %1\$s"
    override val homeOriginLabel = "ਮੂਲ ਪਤਾ: %1\$s, %2\$s"
    override val currentJobCityLabel = "ਮੌਜੂਦਾ ਕੰਮ ਦਾ ਸ਼ਹਿਰ: %1\$s"
    override val emergencyContactLabel = "ਐਮਰਜੈਂਸੀ ਸੰਪਰਕ: %1\$s (%2\$s)"
    override val consentGranted = "ਸਹਿਮਤੀ ਦਿੱਤੀ"
    override val consentPending = "ਸਹਿਮਤੀ ਬਾਕੀ"
    override val employerLoboroIdInput = "ਰੁਜ਼ਗਾਰਦਾਤਾ LOBORO ID (ਜਿਵੇਂ LB819)"
    override val currentSiteInput = "ਮੌਜੂਦਾ ਕੰਮ ਦਾ ਸ਼ਹਿਰ / ਥਾਂ"
    override val describeIssueInput = "ਸੁਰੱਖਿਆ ਜਾਂ ਦਿਹਾੜੀ ਦੀ ਸਮੱਸਿਆ ਲਿਖੋ"
    override val submitSafetyDeskButton = "ਸੁਰੱਖਿਆ ਡੈਸਕ ਨੂੰ ਭੇਜੋ"
    override val safetyCasesHeading = "ਤਾਜ਼ਾ ਸੁਰੱਖਿਆ ਮਾਮਲੇ (ਆਡਿਟ ਯੋਗ)"
    override val ivrTitle = "ਕੀਪੈਡ ਫੋਨ ਮਿਸਡ-ਕਾਲ ਅਤੇ IVR ਮੀਨੂ"
    override val ivrSubtitle = "ਸਮਾਰਟਫੋਨ ਤੋਂ ਬਿਨਾਂ ਟੋਲ-ਫ੍ਰੀ / ਮਿਸਡ-ਕਾਲ ਕਾਲਬੈਕ ਰਾਹੀਂ ਕੰਮ ਕਰਦਾ ਹੈ"
    override val ivrArchNote = "ਲਾਈਵ ਸਿਸਟਮ Exotel / Knowlarity / Twilio Voice ਨਾਲ ਜੁੜਦਾ ਹੈ। 12-ਭਾਸ਼ਾ ਵੌਇਸ ਮੀਨੂ ਜਾਂਚਣ ਲਈ ਬਟਨ ਦਬਾਓ।"
    override val ivrMenuTitle = "LOBORO ਵੌਇਸ IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO ਵਿੱਚ ਜੀ ਆਇਆਂ ਨੂੰ! ਵੌਇਸ ਮੀਨੂ ਸੁਣਨ ਲਈ ਕੀਪੈਡ ਨੰਬਰ ਦਬਾਓ।"
    override val pressKeyFormat = "%1\$s ਦਬਾਓ → %2\$s"
    override val ivrSelectedSummaryFormat = "ਚੁਣਿਆ [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "ਅੱਜ ਦੇ ਦਿਹਾੜੀਦਾਰ ਕੰਮ",
        "2" to "ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ ਵਾਲੇ ਕੰਮ",
        "3" to "ਹਫ਼ਤਾਵਾਰੀ ਸੁਰੱਖਿਆ ਜਾਂਚ ('ਕੀ ਤੁਸੀਂ ਸੁਰੱਖਿਅਤ ਹੋ?')",
        "4" to "ਵਾਲਿਟ ਸਿੱਕੇ ਅਤੇ ਤਾਜ਼ਾ ਸਥਿਤੀ ਸੁਣੋ",
        "5" to "ਐਮਰਜੈਂਸੀ ਐਡਮਿਨ ਕਾਲਬੈਕ",
        "6" to "ਅਰਜ਼ੀ ਦੀ ਸਥਿਤੀ ਜਾਂਚੋ",
        "0" to "ਪਸੰਦੀਦਾ ਵੌਇਸ ਭਾਸ਼ਾ ਬਦਲੋ"
    )

    override val userRegTitle = "ਮਜ਼ਦੂਰ ਅਤੇ ਰੁਜ਼ਗਾਰਦਾਤਾ ਰਜਿਸਟ੍ਰੇਸ਼ਨ"
    override val userLoginTitle = "ਮਜ਼ਦੂਰ ਅਤੇ ਰੁਜ਼ਗਾਰਦਾਤਾ ਲੌਗ ਇਨ"
    override val userAuthSubtitle = "OTP-ਪ੍ਰਮਾਣਿਤ ਆਮ ਵਰਤੋਂਕਾਰ ਖਾਤਾ · ਗੁਪਤ ਮਾਲਕ ਸਿਸਟਮ ਤੋਂ ਬਿਲਕੁਲ ਵੱਖਰਾ"
    override val registerTab = "ਰਜਿਸਟਰ"
    override val loginTab = "ਲੌਗ ਇਨ"
    override val dbOtpNotConnectedTitle = "ਬੈਕਐਂਡ ਡਾਟਾਬੇਸ / OTP ਜੁੜਿਆ ਨਹੀਂ"
    override val dbOtpNotConnectedBody = "ਅਸਲ ਮਜ਼ਦੂਰ ਅਤੇ ਰੁਜ਼ਗਾਰਦਾਤਾ ਖਾਤੇ ਸੇਵ ਕਰਨ ਲਈ LOBORO_BACKEND_URL ਜੋੜੋ।"
    override val selectAccountTypeStep = "1. ਖਾਤੇ ਦੀ ਕਿਸਮ ਚੁਣੋ"
    override val workerAccountLabel = "ਮਜ਼ਦੂਰ"
    override val employerAccountLabel = "ਰੁਜ਼ਗਾਰਦਾਤਾ"
    override val regPausedForRoleFormat = "%1\$s ਰਜਿਸਟ੍ਰੇਸ਼ਨ ਫਿਲਹਾਲ ਮਾਲਕ ਵੱਲੋਂ ਰੋਕੀ ਗਈ ਹੈ।"
    override val preferredLanguageLabel = "ਪਸੰਦੀਦਾ ਐਪ ਭਾਸ਼ਾ (12 ਭਾਸ਼ਾਵਾਂ)"
    override val fullNameStepLabel = "2. ਪੂਰਾ ਨਾਮ *"
    override val businessNameStepLabel = "2. ਕਾਰੋਬਾਰ / ਠੇਕੇਦਾਰ ਦਾ ਪੂਰਾ ਨਾਮ *"
    override val mobileStepLabel = "3. ਮੋਬਾਈਲ ਨੰਬਰ (10 ਅੰਕ) *"
    override val sendRegOtpButton = "OTP ਭੇਜੋ"
    override val resendMobileOtpButton = "ਦੁਬਾਰਾ OTP ਭੇਜੋ"
    override val enterOtpStepLabel = "4. ਮੋਬਾਈਲ OTP ਭਰੋ *"
    override val verifyOtpButton = "OTP ਜਾਂਚੋ"
    override val verifiedLabel = "ਪ੍ਰਮਾਣਿਤ"
    override val mobileVerifiedNote = "ਸਰਵਰ 'ਤੇ ਮੋਬਾਈਲ ਪ੍ਰਮਾਣਿਤ"
    override val homeStateLabel = "ਪਿੱਤਰੀ ਰਾਜ"
    override val homeDistrictLabel = "ਪਿੱਤਰੀ ਜ਼ਿਲ੍ਹਾ"
    override val stateShortLabel = "ਰਾਜ"
    override val cityShortLabel = "ਸ਼ਹਿਰ"
    override val workCityStateLabel = "ਮੌਜੂਦਾ ਕੰਮ ਦਾ ਸ਼ਹਿਰ ਅਤੇ ਰਾਜ"
    override val businessLocationLabel = "ਕਾਰੋਬਾਰ ਸ਼ਹਿਰ ਅਤੇ ਰਾਜ"
    override val skillsCategoriesLabel = "ਹੁਨਰ / ਕੰਮ (ਜਿਵੇਂ ਰਾਜਮਿਸਤਰੀ, ਇਲੈਕਟ੍ਰੀਸ਼ੀਅਨ)"
    override val hiringCategoriesLabel = "ਭਰਤੀ ਸ਼੍ਰੇਣੀਆਂ"
    override val emergencyContactNameLabel = "ਐਮਰਜੈਂਸੀ ਪਰਿਵਾਰ ਸੰਪਰਕ ਨਾਮ"
    override val emergencyContactPhoneLabel = "ਐਮਰਜੈਂਸੀ ਸੰਪਰਕ ਫੋਨ"
    override val uniqueLbIdNotice = "ਮੁਕੰਮਲ ਹੋਣ 'ਤੇ ਸਰਵਰ ਪੱਕਾ LB ID (LB2000+) ਦੇਵੇਗਾ। VIP ਅਤੇ ਮਾਲਕ ਨੰਬਰ ਸੁਰੱਖਿਅਤ ਹਨ।"
    override val creatingProfileLabel = "ਪ੍ਰੋਫਾਈਲ ਬਣ ਰਹੀ ਹੈ..."
    override val createProfileButton = "ਮਜ਼ਦੂਰ / ਰੁਜ਼ਗਾਰਦਾਤਾ ਪ੍ਰੋਫਾਈਲ ਬਣਾਓ"
    override val loginHeading = "ਰਜਿਸਟਰਡ ਮੋਬਾਈਲ OTP ਨਾਲ ਲੌਗ ਇਨ ਕਰੋ"
    override val loginSubtitle = "ਮਜ਼ਦੂਰ ਜਾਂ ਰੁਜ਼ਗਾਰਦਾਤਾ ਵਜੋਂ ਰਜਿਸਟਰ ਕੀਤਾ ਮੋਬਾਈਲ ਨੰਬਰ ਦਰਜ ਕਰੋ।"
    override val registeredMobileLabel = "ਰਜਿਸਟਰਡ ਮੋਬਾਈਲ ਨੰਬਰ"
    override val sendLoginOtpButton = "ਲੌਗ ਇਨ OTP ਭੇਜੋ"
    override val resendLoginOtpButton = "OTP ਦੁਬਾਰਾ ਭੇਜੋ"
    override val enterLoginOtpLabel = "ਲੌਗ ਇਨ OTP ਭਰੋ"
    override val verifyingOtpLabel = "ਜਾਂਚ ਹੋ ਰਹੀ ਹੈ..."
    override val verifyOtpOpenHomeButton = "OTP ਜਾਂਚੋ ਅਤੇ ਹੋਮ ਖੋਲ੍ਹੋ"
    override val backToHomepageButton = "ਹੋਮਪੇਜ 'ਤੇ ਵਾਪਸ ਜਾਓ"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "ਭੂਮਿਕਾ"
    override val offlinePreviewHeading = "ਆਫਲਾਈਨ ਪ੍ਰੋਫਾਈਲ ਅਤੇ ਫੋਟੋ ਪ੍ਰੀਵਿਊ"
    override val offlinePreviewCardTitle = "ਪ੍ਰੋਫਾਈਲ ਬਣਾਓ / ਸੋਧੋ (ਆਫਲਾਈਨ ਪ੍ਰੀਵਿਊ)"
    override val offlinePreviewCardSubtitle = "ਲਾਈਵ ਡਾਟਾਬੇਸ ਜੁੜਨ ਤੱਕ ਸਥਾਨਕ ਪ੍ਰੀਵਿਊ ਵਜੋਂ ਸੁਰੱਖਿਅਤ ਹੁੰਦਾ ਹੈ।"
    override val workLocationLabel = "ਕੰਮ ਦੀ ਥਾਂ (ਸ਼ਹਿਰ, ਰਾਜ)"
    override val businessAddressLabel = "ਕਾਰੋਬਾਰ ਸ਼ਹਿਰ, ਰਾਜ"
    override val skillsExpLabel = "ਹੁਨਰ / ਕੰਮ ਦੀ ਕਿਸਮ"
    override val businessCatLabel = "ਕਾਰੋਬਾਰ ਕਿਸਮ / ਭਰਤੀ ਸ਼੍ਰੇਣੀਆਂ"
    override val aadhaarPrivacyNote = "ਡਾਟਾ ਸੁਰੱਖਿਆ: LOBORO ਡਿਵਾਈਸ 'ਤੇ ਆਧਾਰ ਫੋਟੋ ਨਹੀਂ ਰੱਖਦਾ — ਸਿਰਫ਼ ਪ੍ਰਮਾਣਿਤ ਹੈਸ਼ ਅਤੇ ਸਹਿਮਤੀ ਰੱਖਦਾ ਹੈ।"
    override val selectProfilePhotoBtn = "ਪ੍ਰੋਫਾਈਲ ਫੋਟੋ ਚੁਣੋ (ਫੋਟੋ ਪਿਕਰ)"
    override val photoSelectedBtn = "ਫੋਟੋ ਚੁਣੀ ਗਈ ✓"
    override val offlineConsentCheck = "ਮੈਂ ਸੁਰੱਖਿਆ ਜਾਂਚ ਅਤੇ ਸੰਪਰਕ ਨਾ ਹੋਣ 'ਤੇ ਪਰਿਵਾਰ ਨੂੰ ਸੂਚਿਤ ਕਰਨ ਦੀ ਸਹਿਮਤੀ ਦਿੰਦਾ ਹਾਂ।"
    override val previewProfileBtn = "ਪ੍ਰੀਵਿਊ ਪ੍ਰੋਫਾਈਲ ਸੇਵ ਕਰੋ"
    override val audienceScopeFormat = "ਦਰਸ਼ਕ: %1\$s · ਖੇਤਰ: %2\$s · %3\$s"
    override val settingsHeading = "ਸੈਟਿੰਗਾਂ ਅਤੇ ਪਲੇਟਫਾਰਮ ਜਾਣਕਾਰੀ"
    override val languageSectionTitle = "ਐਪ ਦੀ ਭਾਸ਼ਾ (ਸਾਰੀਆਂ 12 ਭਾਰਤੀ ਭਾਸ਼ਾਵਾਂ)"
    override val languageSectionSubtitle = "ਤੁਹਾਡੇ ਸਰਗਰਮ ਖਾਤੇ ਲਈ ਵੱਖਰੇ ਤੌਰ 'ਤੇ ਸੇਵ ਹੁੰਦੀ ਹੈ। ਹੋਰ ਖਾਤਿਆਂ ਦੀ ਭਾਸ਼ਾ ਨਹੀਂ ਬਦਲਦੀ।"
    override val languagePausedByOwner = "ਮਾਲਕ ਕੰਟਰੋਲ ਵੱਲੋਂ ਭਾਸ਼ਾ ਬਦਲਣਾ ਅਸਥਾਈ ਤੌਰ 'ਤੇ ਬੰਦ ਹੈ।"
    override val lowDataTitle = "ਲੋ-ਡਾਟਾ ਮੋਡ"
    override val lowDataSubtitle = "2G/3G ਪੇਂਡੂ ਨੈੱਟਵਰਕਾਂ 'ਤੇ ਮੋਬਾਈਲ ਡਾਟਾ ਬਚਾਉਂਦਾ ਹੈ"
    override val reducedMotionTitle = "ਘੱਟ ਐਨੀਮੇਸ਼ਨ ਅਤੇ ਸਾਫ਼ ਦਿੱਖ"
    override val reducedMotionSubtitle = "ਸਪਸ਼ਟ ਅੱਖਰ ਅਤੇ ਸਧਾਰਨ ਸਕਰੀਨ ਗਤੀ"
    override val privacyPolicyTitle = "ਗੋਪਨੀਯਤਾ ਨੀਤੀ ਅਤੇ ਡਾਟਾ ਸੁਰੱਖਿਆ"
    override val privacyPolicyBody = "• ਚੈਟ ਵਿੱਚ ਤੁਹਾਡੀ ਮਨਜ਼ੂਰੀ ਤੋਂ ਬਿਨਾਂ ਫੋਨ ਨੰਬਰ ਲੁਕਿਆ ਰਹਿੰਦਾ ਹੈ।\n• ਮਾਈਕ ਸਿਰਫ਼ ਵੌਇਸ ਖੋਜ ਬਟਨ ਦਬਾਉਣ 'ਤੇ ਹੀ ਚਾਲੂ ਹੁੰਦਾ ਹੈ।\n• ਫੋਟੋ ਚੁਣਨ ਲਈ ਸੁਰੱਖਿਅਤ ਐਂਡਰਾਇਡ ਫੋਟੋ ਪਿਕਰ ਵਰਤਿਆ ਜਾਂਦਾ ਹੈ।\n• ਪਰਿਵਾਰ ਨੂੰ ਐਮਰਜੈਂਸੀ ਟਿਕਾਣਾ ਸਿਰਫ਼ ਤੁਹਾਡੀ ਸਹਿਮਤੀ ਨਾਲ ਭੇਜਿਆ ਜਾਂਦਾ ਹੈ।"
    override val termsOfServiceTitle = "ਸੇਵਾ ਦੀਆਂ ਸ਼ਰਤਾਂ ਅਤੇ ਨਿਰਪੱਖ ਨਿਯਮ"
    override val termsOfServiceBody = "• ਦਿਹਾੜੀਦਾਰ ਅਤੇ ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ ਵਾਲੇ ਕੰਮ ਵੱਖਰੇ ਰੱਖੇ ਗਏ ਹਨ।\n• ਹਰ LOBORO ਸਿੱਕਾ 100% ਬਰਾਬਰ ਨਕਦ ਮੁੱਲ ਅਤੇ ਕਢਵਾਉਣ ਯੋਗ ਹੈ।\n• ਬੈਜ ਸਿਰਫ਼ ਅਸਲ ਕੰਮ ਦਿਨਾਂ ਅਤੇ ਨਿਰਪੱਖ ਰੇਟਿੰਗ ਨਾਲ ਮਿਲਦੇ ਹਨ।\n• VIP ID (LB1–LB1999) ਸਿਰਫ਼ ਮਾਲਕ ਵੰਡ ਲਈ ਰਾਖਵੇਂ ਹਨ।"
    override val helpSupportTitle = "ਮਦਦ, ਸਹਾਇਤਾ ਅਤੇ ਸੁਰੱਖਿਆ ਡੈਸਕ"
    override val helpSupportBody = "• ਤੁਰੰਤ ਖ਼ਤਰੇ ਵਿੱਚ 112 'ਤੇ ਕਾਲ ਕਰੋ (ਲੌਗ ਇਨ ਤੋਂ ਬਿਨਾਂ ਵੀ 24x7)।\n• ਤਨਖਾਹ ਜਾਂ ਰਿਹਾਇਸ਼ ਸ਼ਿਕਾਇਤ ਲਈ ਮਦਦ ਅਤੇ ਸੁਰੱਖਿਆ ਡੈਸਕ ਖੋਲ੍ਹੋ।\n• ਕੀਪੈਡ ਫੋਨਾਂ ਲਈ ਟੋਲ-ਫ੍ਰੀ ਕਾਲਬੈਕ ਵਾਸਤੇ ਕੀਪੈਡ ਅਤੇ IVR ਦੇਖੋ।"
    override val backendChecklistTitle = "ਬੈਕਐਂਡ ਅਤੇ API ਏਕੀਕਰਨ ਸਥਿਤੀ"
    override val providersLabel = "ਪ੍ਰਦਾਤਾ: %1\$s"
    override val secretsLabel = "ਗੁਪਤ ਕੁੰਜੀਆਂ: %1\$s"

    override val ownerSetupTitle = "ਇੱਕ ਵਾਰ ਮਾਲਕ / ਸੁਪਰ ਐਡਮਿਨ ਸੈਟਅੱਪ"
    override val ownerSetupSubtitle = "ਸਿਰਫ਼ LOBORO ਨਿਰਮਾਤਾ ਲਈ। ਇੱਕ ਵਾਰ ਰਜਿਸਟ੍ਰੇਸ਼ਨ ਤੋਂ ਬਾਅਦ ਪੱਕੇ ਤੌਰ 'ਤੇ ਲੌਕ ਹੋ ਜਾਂਦਾ ਹੈ।"
    override val ownerSetupLockNote = "ਸੁਰੱਖਿਆ ਲੌਕ: ਸਿਰਫ਼ ਇੱਕ ਹੀ ਮਾਲਕ ਖਾਤਾ ਬਣ ਸਕਦਾ ਹੈ। ਕੋਈ ਮਜ਼ਦੂਰ ਜਾਂ ਰੁਜ਼ਗਾਰਦਾਤਾ ਇਹ ਫਾਰਮ ਨਹੀਂ ਵਰਤ ਸਕਦਾ।"
    override val ownerBackendReqTitle = "ਮਾਲਕ ਸਰਵਰ ਜੁੜਿਆ ਨਹੀਂ"
    override val ownerBackendReqBody = "ਪਾਸਵਰਡ ਅਤੇ 4-ਅੰਕੀ PIN ਨੂੰ ਸਰਵਰ 'ਤੇ ਸੁਰੱਖਿਅਤ ਰੱਖਣ ਲਈ LOBORO_BACKEND_URL ਸੈੱਟ ਕਰੋ।"
    override val serverSetupAuthHeading = "1. ਸਰਵਰ ਸੈਟਅੱਪ ਅਧਿਕਾਰ"
    override val bootstrapSecretLabel = "ਵਨ-ਟਾਈਮ ਸਰਵਰ ਬੂਟਸਟ੍ਰੈਪ ਕੋਡ *"
    override val bootstrapSecretPlaceholder = "ਤੁਹਾਡੇ ਸਰਵਰ OWNER_BOOTSTRAP_SECRET ਤੋਂ"
    override val ownerIdentityHeading = "2. ਮਾਲਕ ਪਛਾਣ ਅਤੇ ਮੋਬਾਈਲ OTP"
    override val ownerNameField = "ਮਾਲਕ ਦਾ ਪੂਰਾ ਨਾਮ *"
    override val ownerMobileField = "ਮਾਲਕ ਦਾ ਨਿੱਜੀ ਮੋਬਾਈਲ ਨੰਬਰ *"
    override val ownerSendOtpBtn = "ਮਾਲਕ OTP ਭੇਜੋ"
    override val ownerMobileVerifiedNote = "ਮਾਲਕ ਮੋਬਾਈਲ OTP ਪ੍ਰਮਾਣਿਤ"
    override val credentialsHeading = "3. ਪਾਸਵਰਡ ਅਤੇ 4-ਅੰਕੀ ਐਡਮਿਨ PIN"
    override val createPasswordLabel = "ਲੌਗ ਇਨ ਪਾਸਵਰਡ ਬਣਾਓ (8+ ਅੱਖਰ) *"
    override val confirmPasswordLabel = "ਲੌਗ ਇਨ ਪਾਸਵਰਡ ਪੁਸ਼ਟੀ ਕਰੋ *"
    override val passwordsMismatchError = "ਪਾਸਵਰਡ ਮੇਲ ਨਹੀਂ ਖਾਂਦੇ"
    override val createPinLabel = "4-ਅੰਕੀ ਐਡਮਿਨ PIN ਬਣਾਓ *"
    override val confirmPinLabel = "4-ਅੰਕੀ ਐਡਮਿਨ PIN ਪੁਸ਼ਟੀ ਕਰੋ *"
    override val pinsMismatchError = "PIN ਮੇਲ ਨਹੀਂ ਖਾਂਦੇ"
    override val credentialsHashNote = "ਸਰਵਰ Argon2id ਨਾਲ ਪਾਸਵਰਡ ਅਤੇ PIN ਸੁਰੱਖਿਅਤ ਕਰਦਾ ਹੈ। ਐਪ ਵਿੱਚ ਸੇਵ ਨਹੀਂ ਹੁੰਦਾ।"
    override val registeringOwnerLabel = "ਮਾਲਕ ਖਾਤਾ ਬਣ ਰਿਹਾ ਹੈ..."
    override val completeOwnerRegButton = "ਮਾਲਕ ਰਜਿਸਟ੍ਰੇਸ਼ਨ ਪੂਰੀ ਕਰਕੇ ਡੈਸ਼ਬੋਰਡ ਖੋਲ੍ਹੋ"
    override val returnToAppButton = "LOBORO ਐਪ 'ਤੇ ਵਾਪਸ ਜਾਓ"
    override val adminPinHeader = "ਮਾਲਕ ਕੰਟਰੋਲ · 4-ਅੰਕੀ PIN ਲੋੜੀਂਦਾ"
    override val adminPinPrompt = "ਆਪਣਾ 4-ਅੰਕੀ ਮਾਲਕ ਐਡਮਿਨ PIN ਦਰਜ ਕਰੋ। ਸਰਵਰ 'ਤੇ ਸੀਮਾ ਸਮੇਤ ਜਾਂਚ ਹੁੰਦੀ ਹੈ।"
    override val pinLockoutFormat = "ਬਹੁਤ ਗਲਤ ਕੋਸ਼ਿਸ਼ਾਂ। %1\$d ਸਕਿੰਟਾਂ ਬਾਅਦ ਦੁਬਾਰਾ ਕੋਸ਼ਿਸ਼ ਕਰੋ।"
    override val clrKeyLabel = "ਸਾਫ਼"
    override val verifyPinServerBtn = "ਸਰਵਰ 'ਤੇ 4-ਅੰਕੀ PIN ਜਾਂਚੋ"
    override val pinSecurityPolicyFormat = "5 ਗਲਤ ਕੋਸ਼ਿਸ਼ਾਂ 'ਤੇ ਲੌਕ · 5 ਮਿੰਟ ਨਿਸ਼ਕਿਰਿਆ 'ਤੇ ਲੌਗਆਉਟ · ਬਾਕੀ ਕੋਸ਼ਿਸ਼ਾਂ: %1\$d"
    override val ownerMasterControlTitle = "ਮਾਲਕ ਮਾਸਟਰ ਕੰਟਰੋਲ"
    override val ownerMasterSubtitle = "ਸਿਰਫ਼ ਮਾਲਕ ਸੁਪਰ ਐਡਮਿਨ · ਸਰਵਰ PIN + OTP + ਆਡਿਟ ਲੌਗ"
    override val ownerSessionLockedNote = "ਮਾਲਕ ਸੈਸ਼ਨ ਲੌਕ ਹੈ। ਮਾਸਟਰ ਕੰਟਰੋਲ ਖੋਲ੍ਹਣ ਲਈ ਸਰਵਰ-ਪ੍ਰਮਾਣਿਤ 4-ਅੰਕੀ PIN ਲੋੜੀਂਦਾ ਹੈ।"
    override val verifyOwnerPinBtn = "ਮਾਲਕ 4-ਅੰਕੀ PIN ਜਾਂਚੋ"
    override val ownerProfileLineFormat = "ਮਾਲਕ ਪ੍ਰੋਫਾਈਲ · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "ਰਜਿਸਟਰਡ ਮੋਬਾਈਲ: %1\$s · ਇਕਲੌਤਾ ਮਾਲਕ ਖਾਤਾ (%2\$s)"
    override val activeSessionFormat = "ਸਰਗਰਮ ਮਾਲਕ ਸੈਸ਼ਨ · %1\$dm %2\$02ds ਵਿੱਚ ਲੌਗਆਉਟ"
    override val serverAuthorityNote = "ਸੈਸ਼ਨ ਟੋਕਨ ਪ੍ਰਮਾਣਿਤ (ਸਰਵਰ ਅਧਿਕਾਰ)"
    override val lockAndExitBtn = "ਲੌਕ ਅਤੇ ਬਾਹਰ ਨਿਕਲੋ"
    override val mandatoryProtectionTitle = "ਲਾਜ਼ਮੀ ਸੁਰੱਖਿਆ ਅਤੇ ਵਿੱਤੀ ਜ਼ਿੰਮੇਵਾਰੀ ਸੁਰੱਖਿਆ"
    override val mandatoryProtectionBody = "ਸਹੂਲਤਾਂ ਬੰਦ ਕਰਨ ਜਾਂ ਮੈਂਟੇਨੈਂਸ ਮੋਡ ਨਾਲ ਮੌਜੂਦਾ ਵਿੱਤੀ ਜ਼ਿੰਮੇਵਾਰੀਆਂ, ਰਿਫੰਡ ਜਾਂ 112 ਐਮਰਜੈਂਸੀ ਸੇਵਾ ਰੱਦ ਨਹੀਂ ਹੁੰਦੀ।"
    override val changePinTitle = "ਐਡਮਿਨ PIN ਬਦਲੋ (OTP ਜਾਂਚ ਲਾਜ਼ਮੀ)"
    override val changePinSubtitle = "ਸਿਰਫ਼ ਮਾਲਕ ਲਈ। ਮੌਜੂਦਾ PIN ਕਦੇ ਨਹੀਂ ਦਿਖਾਇਆ ਜਾਂਦਾ। ਰਜਿਸਟਰਡ ਮੋਬਾਈਲ OTP ਲਾਜ਼ਮੀ।"
    override val otpToRegisteredMobileNote = "OTP ਸਿਰਫ਼ ਦਰਜ ਮਾਲਕ ਦੇ ਮੋਬਾਈਲ 'ਤੇ ਭੇਜਿਆ ਜਾਵੇਗਾ: %1\$s"
    override val sendPinChangeOtpBtn = "ਰਜਿਸਟਰਡ ਮਾਲਕ ਮੋਬਾਈਲ 'ਤੇ OTP ਭੇਜੋ"
    override val otpDispatchedNote = "ਮਾਲਕ ਦੇ ਮੋਬਾਈਲ (%1\$s) 'ਤੇ OTP ਭੇਜਿਆ ਗਿਆ।"
    override val enterServerOtpLabel = "ਸਰਵਰ OTP ਕੋਡ ਦਰਜ ਕਰੋ"
    override val verifyOtpServerBtn = "ਸਰਵਰ 'ਤੇ OTP ਜਾਂਚੋ"
    override val otpVerifiedNewPinNote = "OTP ਪ੍ਰਮਾਣਿਤ। ਹੁਣ ਨਵਾਂ 4-ਅੰਕੀ ਮਾਲਕ PIN ਭਰੋ ਅਤੇ ਪੁਸ਼ਟੀ ਕਰੋ।"
    override val newPinLabel = "ਨਵਾਂ 4-ਅੰਕੀ PIN"
    override val confirmNewPinLabel = "ਨਵੇਂ 4-ਅੰਕੀ PIN ਦੀ ਪੁਸ਼ਟੀ"
    override val saveNewPinBtn = "ਪੁਸ਼ਟੀ ਕਰਕੇ ਐਡਮਿਨ PIN ਅਪਡੇਟ ਕਰੋ"
    override val confirmPinChangeTitle = "ਐਡਮਿਨ PIN ਬਦਲਾਅ ਦੀ ਪੁਸ਼ਟੀ ਕਰੋ"
    override val confirmPinChangeDesc = "ਸਰਵਰ 'ਤੇ 4-ਅੰਕੀ ਮਾਲਕ PIN ਬਦਲਣਾ ਹੈ? ਸੈਸ਼ਨ ਚਾਲੂ ਰਹੇਗਾ ਅਤੇ ਆਡਿਟ ਲੌਗ ਦਰਜ ਹੋਵੇਗਾ।"
    override val pinUpdatedNote = "ਨਵਾਂ 4-ਅੰਕੀ ਮਾਲਕ PIN ਸਰਵਰ 'ਤੇ ਅਪਡੇਟ ਹੋ ਗਿਆ।"
    override val completeMasterControlTitle = "ਸੰਪੂਰਨ ਮਾਲਕ ਮਾਸਟਰ ਕੰਟਰੋਲ (25 ਮਾਡਿਊਲ)"
    override val masterControlScopeSubtitle = "ਖੇਤਰ ਜਾਂ ਭੂਮਿਕਾ ਅਨੁਸਾਰ ਤੁਰੰਤ ON/OFF ਕੰਟਰੋਲ।"
    override val scopeOptions = listOf(
        "ਗਲੋਬਲ · ਭਾਰਤ (ਸਾਰੇ ਰਾਜ)",
        "ਸਿਰਫ਼ ਤੇਲੰਗਾਨਾ",
        "ਸਿਰਫ਼ ਤਮਿਲਨਾਡੂ",
        "ਸਿਰਫ਼ ਮਜ਼ਦੂਰ",
        "ਸਿਰਫ਼ ਰੁਜ਼ਗਾਰਦਾਤਾ"
    )
    override val masterControlNames = listOf(
        "1. ਪੂਰਾ ਐਪ ਅਤੇ ਮੈਂਟੇਨੈਂਸ ਮੋਡ",
        "2. ਮਜ਼ਦੂਰ ਰਜਿਸਟ੍ਰੇਸ਼ਨ",
        "3. ਰੁਜ਼ਗਾਰਦਾਤਾ ਰਜਿਸਟ੍ਰੇਸ਼ਨ",
        "4. ਕੰਮ ਪੋਸਟ ਕਰਨਾ",
        "5. ਕੰਮ ਖੋਜ",
        "6. ਦਿਹਾੜੀਦਾਰ ਕੰਮ",
        "7. ਮਹੀਨਾਵਾਰ ਤਨਖਾਹ ਵਾਲੇ ਕੰਮ",
        "8. ਸਿੱਕਾ ਖਰੀਦਦਾਰੀ",
        "9. ਵਾਲਿਟ ਕਢਵਾਉਣਾ",
        "10. ਜੌਬ ਫੀਸ ਅਤੇ ਸਿੱਕਾ ਕੀਮਤ",
        "11. ਆਫਰ ਅਤੇ ਪ੍ਰਚਾਰ",
        "12. ਰੈਫਰਲ ਇਨਾਮ",
        "13. ਸੂਚਨਾਵਾਂ ਅਤੇ ਐਲਾਨ",
        "14. ਮਜ਼ਦੂਰ ਅਤੇ ਰੁਜ਼ਗਾਰਦਾਤਾ ਖਾਤਾ ਕੰਟਰੋਲ",
        "15. ਕੰਮ ਸ਼੍ਰੇਣੀਆਂ ਅਤੇ ਉਪ-ਸ਼੍ਰੇਣੀਆਂ",
        "16. ਰੇਟਿੰਗ ਅਤੇ ਆਟੋਮੈਟਿਕ ਬੈਜ",
        "17. ਸੀਨੀਆਰਤਾ ਅਤੇ ਵਫ਼ਾਦਾਰੀ ਸਹਾਇਤਾ",
        "18. ਐਮਰਜੈਂਸੀ ਅਤੇ ਮਜ਼ਦੂਰ ਸੁਰੱਖਿਆ ਸਿਸਟਮ",
        "19. SMS ਅਲਰਟ",
        "20. IVR ਸੇਵਾਵਾਂ",
        "21. ਭਾਸ਼ਾ ਸੈਟਿੰਗਾਂ (12 ਭਾਸ਼ਾਵਾਂ)",
        "22. ਦੇਸ਼, ਰਾਜ ਅਤੇ ਸ਼ਹਿਰ ਉਪਲਬਧਤਾ",
        "23. VIP ID ਰਾਖਵਾਂਕਰਨ ਅਤੇ ਪ੍ਰਬੰਧਨ",
        "24. ਰਿਪੋਰਟਾਂ, ਸ਼ਿਕਾਇਤਾਂ ਅਤੇ ਕੰਟਰੋਲ",
        "25. ਪੇਮੈਂਟ ਗੇਟਵੇ ਏਕੀਕਰਨ"
    )
    override val publishNoticeTitle = "ਲਾਲ LOBORO ਐਡਮਿਨ ਸੂਚਨਾ ਪ੍ਰਕਾਸ਼ਿਤ ਕਰੋ"
    override val announcementMessageLabel = "ਐਲਾਨ ਸੁਨੇਹਾ"
    override val announcementPlaceholder = "ਜਿਵੇਂ: ਹੋਰ ਰਾਜਾਂ ਦੇ ਮਜ਼ਦੂਰਾਂ ਲਈ ਨਵੀਂ ਸੁਰੱਖਿਆ ਹੈਲਪਲਾਈਨ"
    override val actionLinkLabel = "ਬਟਨ ਨਾਮ"
    override val scopeFieldLabel = "ਖੇਤਰ / ਰਾਜ ਸੀਮਾ"
    override val audienceOptions = listOf("ਸਾਰੇ ਵਰਤੋਂਕਾਰ", "ਮਜ਼ਦੂਰ", "ਰੁਜ਼ਗਾਰਦਾਤਾ")
    override val broadcastNoticeBtn = "ਲਾਲ ਐਡਮਿਨ ਸੂਚਨਾ ਭੇਜੋ"
    override val confirmBroadcastTitle = "ਲਾਲ LOBORO ਐਡਮਿਨ ਸੂਚਨਾ ਪ੍ਰਸਾਰਿਤ ਕਰਨੀ ਹੈ?"
    override val confirmBroadcastDescFormat = "ਸੁਨੇਹਾ: %1\$s\nਵਰਤੋਂਕਾਰ: %2\$s · ਖੇਤਰ: %3\$s"
    override val coinPricingTitle = "ਸਿੱਕਾ ਕੀਮਤ ਅਤੇ ਫੀਸ ਕੰਟਰੋਲ"
    override val coinPricingSummaryFormat = "1 ਸਿੱਕਾ = ₹%1\$d · ਰੋਜ਼ਾਨਾ = %2\$d ਸਿੱਕੇ · ਖਾਸ = %3\$d ਸਿੱਕੇ · ਮਹੀਨਾਵਾਰ = %4\$d ਸਿੱਕੇ · ਸਮਾਂ: %5\$s"
    override val dailyBtnFormat = "ਰੋਜ਼ਾਨਾ +1 (%1\$d)"
    override val masonBtnFormat = "ਖਾਸ +1 (%1\$d)"
    override val monthlyBtnFormat = "ਮਹੀਨਾਵਾਰ +5 (%1\$d)"
    override val protectedVipIdsTitle = "ਸੁਰੱਖਿਅਤ VIP ਅਤੇ ਮਾਲਕ ID (ਆਪਣੇ ਆਪ ਕਦੇ ਨਹੀਂ ਦਿੱਤੇ ਜਾਂਦੇ)"
    override val protectedVipIdsNote = "ਆਮ ਵਰਤੋਂਕਾਰਾਂ ਨੂੰ ਹਮੇਸ਼ਾ LB2000+ ਮਿਲਦਾ ਹੈ। ਖਾਸ ਨੰਬਰ ਸਿਰਫ਼ ਮਾਲਕ ਵੰਡ ਲਈ ਰਾਖਵੇਂ ਹਨ।"
    override val safetyInvestigationTitle = "ਸੁਰੱਖਿਆ ਮਾਮਲੇ ਅਤੇ ਸ਼ਿਕਾਇਤ ਜਾਂਚ ਡੈਸਕ"
    override val manageCategoriesTitle = "24 ਕੰਮ ਸ਼੍ਰੇਣੀਆਂ ਪ੍ਰਬੰਧਨ (ਤੁਰੰਤ ON/OFF)"
    override val showAll24Label = "ਸਾਰੀਆਂ 24 ਦਿਖਾਓ"
    override val showLessLabel = "ਘੱਟ ਦਿਖਾਓ"
    override val auditLogTitle = "ਮਾਲਕ ਕਾਰਵਾਈ ਆਡਿਟ ਲੌਗ"
    override val confirmToggleTitleFormat = "%1\$s ਦੀ ਪੁਸ਼ਟੀ ਕਰੋ"
    override val confirmToggleDescFormat = "%3\$s ਲਈ \"%1\$s\" ਨੂੰ %2\$s ਕਰਨਾ ਹੈ? ਮੌਜੂਦਾ ਵਿੱਤੀ ਜ਼ਿੰਮੇਵਾਰੀਆਂ ਅਤੇ 112 ਸੁਰੱਖਿਆ ਸੇਵਾਵਾਂ ਸੁਰੱਖਿਅਤ ਰਹਿਣਗੀਆਂ।"

    override val categories = mapOf(
        JobCategoryId.MASON to "ਰਾਜਮਿਸਤਰੀ / ਮਿਸਤਰੀ",
        JobCategoryId.CONSTRUCTION_LABOUR to "ਉਸਾਰੀ ਮਜ਼ਦੂਰ",
        JobCategoryId.GENERAL_LABOUR to "ਆਮ ਮਜ਼ਦੂਰ",
        JobCategoryId.PLUMBER to "ਪਲੰਬਰ",
        JobCategoryId.ELECTRICIAN to "ਇਲੈਕਟ੍ਰੀਸ਼ੀਅਨ",
        JobCategoryId.PAINTER to "ਪੇਂਟਰ",
        JobCategoryId.TILE_WORKER to "ਟਾਈਲ ਮਿਸਤਰੀ",
        JobCategoryId.CARPENTER to "ਤਰਖਾਣ / ਕਾਰਪੇਂਟਰ",
        JobCategoryId.WELDER to "ਵੈਲਡਰ",
        JobCategoryId.HOTEL_STAFF to "ਹੋਟਲ ਸਟਾਫ",
        JobCategoryId.COOK to "ਰਸੋਈਆ / ਕੁੱਕ",
        JobCategoryId.WAITER to "ਵੇਟਰ",
        JobCategoryId.HOUSEKEEPING to "ਹਾਊਸਕੀਪਿੰਗ",
        JobCategoryId.SECURITY_GUARD to "ਸੁਰੱਖਿਆ ਗਾਰਡ",
        JobCategoryId.DRIVER to "ਡਰਾਈਵਰ",
        JobCategoryId.DELIVERY_WORKER to "ਡਿਲੀਵਰੀ ਕਰਮੀ",
        JobCategoryId.FACTORY_WORKER to "ਫੈਕਟਰੀ ਮਜ਼ਦੂਰ",
        JobCategoryId.PACKING_WORKER to "ਪੈਕਿੰਗ ਕਰਮੀ",
        JobCategoryId.MACHINE_OPERATOR to "ਮਸ਼ੀਨ ਆਪਰੇਟਰ",
        JobCategoryId.AGRICULTURE_WORKER to "ਖੇਤੀਬਾੜੀ ਮਜ਼ਦੂਰ",
        JobCategoryId.OFFICE_ASSISTANT to "ਦਫ਼ਤਰ ਸਹਾਇਕ",
        JobCategoryId.SHOP_STAFF to "ਦੁਕਾਨ ਸਟਾਫ",
        JobCategoryId.DOMESTIC_WORKER to "ਘਰੇਲੂ ਸਹਾਇਕ",
        JobCategoryId.OTHER_JOBS to "ਹੋਰ ਕੰਮ"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "ਮਜ਼ਦੂਰ",
        UserRole.EMPLOYER to "ਰੁਜ਼ਗਾਰਦਾਤਾ",
        UserRole.OWNER_SUPER_ADMIN to "ਮਾਲਕ / ਸੁਪਰ ਐਡਮਿਨ"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "ਅਰਜ਼ੀ ਦਿੱਤੀ",
        ApplicationStatus.UNDER_REVIEW to "ਸਮੀਖਿਆ ਅਧੀਨ",
        ApplicationStatus.SHORTLISTED to "ਸ਼ਾਰਟਲਿਸਟ",
        ApplicationStatus.ACCEPTED to "ਮਨਜ਼ੂਰ",
        ApplicationStatus.REJECTED to "ਨਾਮਨਜ਼ੂਰ",
        ApplicationStatus.WITHDRAWN to "ਵਾਪਸ ਲਈ",
        ApplicationStatus.COMPLETED to "ਮੁਕੰਮਲ"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "ਬਕਾਇਆ",
        TransactionStatus.SUCCESSFUL to "ਸਫ਼ਲ",
        TransactionStatus.FAILED to "ਅਸਫ਼ਲ",
        TransactionStatus.REFUNDED to "ਵਾਪਸ ਮਿਲਿਆ"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "ਸਿੱਕਾ ਖਰੀਦ",
        TransactionType.GIFT to "ਤੋਹਫ਼ਾ ਕ੍ਰੈਡਿਟ",
        TransactionType.PROMO to "ਪ੍ਰੋਮੋ ਕ੍ਰੈਡਿਟ",
        TransactionType.REFERRAL to "ਰੈਫਰਲ ਬੋਨਸ",
        TransactionType.BADGE_REWARD to "ਬੈਜ ਇਨਾਮ",
        TransactionType.LOYALTY_SUPPORT to "ਵਫ਼ਾਦਾਰੀ ਮਦਦ",
        TransactionType.JOB_FEE to "ਜੌਬ ਫੀਸ",
        TransactionType.WITHDRAWAL to "ਨਿਕਾਸੀ"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "ਬਕਾਇਆ ਦਿਹਾੜੀ",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "ਸਰੀਰਕ ਹਿੰਸਾ",
        SafetyComplaintCategory.HARASSMENT to "ਪ੍ਰੇਸ਼ਾਨੀ",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "ਖਾਣਾ / ਰਿਹਾਇਸ਼ ਸਮੱਸਿਆ",
        SafetyComplaintCategory.FRAUD to "ਨੌਕਰੀ ਧੋਖਾਧੜੀ",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "ਅਸੁਰੱਖਿਅਤ ਕੰਮ ਥਾਂ",
        SafetyComplaintCategory.OTHER_EMERGENCY to "ਹੋਰ ਐਮਰਜੈਂਸੀ"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "ਨਵਾਂ",
        SafetyCaseStatus.IN_REVIEW to "ਜਾਂਚ ਅਧੀਨ",
        SafetyCaseStatus.ADMIN_VERIFIED to "ਐਡਮਿਨ ਪ੍ਰਮਾਣਿਤ",
        SafetyCaseStatus.ACTION_TAKEN to "ਕਾਰਵਾਈ ਹੋਈ",
        SafetyCaseStatus.REFERRED to "ਅੱਗੇ ਭੇਜਿਆ",
        SafetyCaseStatus.CLOSED to "ਬੰਦ"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "ਸ਼ੁਰੂਆਤੀ",
        BadgeLevel.SILVER to "ਸਿਲਵਰ",
        BadgeLevel.GOLD to "ਗੋਲਡ",
        BadgeLevel.DIAMOND to "ਡਾਇਮੰਡ",
        BadgeLevel.PLATINUM to "ਪਲੈਟੀਨਮ"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "ਕੰਮ ਪੋਸਟ ਕਰਨ ਵੇਲੇ",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "ਪ੍ਰਮਾਣਿਤ ਸੰਪਰਕ 'ਤੇ",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "ਅਰਜ਼ੀ ਮਨਜ਼ੂਰੀ 'ਤੇ"
    )
    override val indianStates = mapOf(
        "All States" to "ਸਾਰੇ ਰਾਜ",
        "Telangana" to "ਤੇਲੰਗਾਨਾ",
        "Andhra Pradesh" to "ਆਂਧਰਾ ਪ੍ਰਦੇਸ਼",
        "Tamil Nadu" to "ਤਮਿਲਨਾਡੂ",
        "Karnataka" to "ਕਰਨਾਟਕ",
        "Maharashtra" to "ਮਹਾਰਾਸ਼ਟਰ",
        "Gujarat" to "ਗੁਜਰਾਤ",
        "Assam" to "ਅਸਾਮ",
        "Bihar" to "ਬਿਹਾਰ",
        "Uttar Pradesh" to "ਉੱਤਰ ਪ੍ਰਦੇਸ਼",
        "West Bengal" to "ਪੱਛਮੀ ਬੰਗਾਲ",
        "Odisha" to "ਉੜੀਸਾ",
        "Kerala" to "ਕੇਰਲ",
        "Punjab" to "ਪੰਜਾਬ"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "ਕਲਾਉਡ ਡਾਟਾਬੇਸ ਅਤੇ ਸੁਰੱਖਿਆ",
        "otp_sms" to "OTP ਅਤੇ SMS ਸੇਵਾ",
        "payment_gateway" to "UPI ਅਤੇ ਸਿੱਕਾ ਪੇਮੈਂਟ ਗੇਟਵੇ",
        "face_liveness" to "ਚਿਹਰਾ ਮਿਲਾਣ ਅਤੇ ਲਾਈਵਨੈੱਸ ਜਾਂਚ",
        "translation" to "ਲਾਈਵ 12-ਭਾਸ਼ਾ ਕੰਮ ਅਨੁਵਾਦ",
        "telecom_ivr" to "ਕੀਪੈਡ ਫੋਨ ਮਿਸਡ-ਕਾਲ ਅਤੇ IVR",
        "owner_pin_auth" to "ਮਾਲਕ ਬੂਟਸਟ੍ਰੈਪ ਅਤੇ 4-ਅੰਕੀ PIN ਸਰਵਰ"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "ਜੁੜਿਆ ਨਹੀਂ",
        IntegrationStatus.NEEDS_CREDENTIALS to "ਕੁੰਜੀਆਂ ਲੋੜੀਂਦੀਆਂ",
        IntegrationStatus.CONNECTED to "ਜੁੜਿਆ ਹੋਇਆ"
    )

    override val msgOwnerPrivilegeBlocked = "ਅਣਅਧਿਕਾਰਤ: ਆਮ ਵਰਤੋਂਕਾਰ ਕਦੇ ਵੀ ਮਾਲਕ / ਸੁਪਰ ਐਡਮਿਨ ਨਹੀਂ ਬਣ ਸਕਦੇ।"
    override val msgSwitchedPreviewFormat = "ਪ੍ਰੀਵਿਊ ਖਾਤਾ %1\$s (%2\$s) ਵਿੱਚ ਬਦਲਿਆ ਗਿਆ।"
    override val msgLanguageSavedFormat = "ਭਾਸ਼ਾ %1\$s (%2\$s) ਚੁਣੀ ਗਈ"
    override val msgEnterNameBeforeOtp = "OTP ਮੰਗਣ ਤੋਂ ਪਹਿਲਾਂ ਆਪਣਾ ਪੂਰਾ ਨਾਮ ਦਰਜ ਕਰੋ।"
    override val msgEnterValidMobile = "ਕਿਰਪਾ ਕਰਕੇ ਸਹੀ 10-ਅੰਕੀ ਮੋਬਾਈਲ ਨੰਬਰ ਭਰੋ।"
    override val msgOtpDispatchedFormat = "ਸਰਵਰ OTP %1\$s 'ਤੇ ਭੇਜਿਆ ਗਿਆ। ਫੋਨ 'ਤੇ ਆਇਆ ਕੋਡ ਭਰੋ।"
    override val msgUnableSendOtp = "OTP ਭੇਜਿਆ ਨਹੀਂ ਜਾ ਸਕਿਆ। ਬੈਕਐਂਡ URL ਜਾਂ ਨੈੱਟਵਰਕ ਜਾਂਚੋ।"
    override val msgSendOtpAndEnterCode = "ਪਹਿਲਾਂ OTP ਭੇਜੋ ਅਤੇ 4–6 ਅੰਕਾਂ ਦਾ ਕੋਡ ਦਰਜ ਕਰੋ।"
    override val msgOtpVerifiedCreateFormat = "ਮੋਬਾਈਲ OTP ਪ੍ਰਮਾਣਿਤ! ਵੇਰਵੇ ਭਰੋ ਅਤੇ %1\$s ਪ੍ਰੋਫਾਈਲ ਬਣਾਓ ਦਬਾਓ।"
    override val msgIncorrectOtp = "ਗਲਤ ਜਾਂ ਮਿਆਦ ਪੁੱਗਿਆ OTP। ਨਵਾਂ OTP ਮੰਗਵਾਓ।"
    override val msgServerOtpUnavailable = "ਸਰਵਰ OTP ਸੇਵਾ ਉਪਲਬਧ ਨਹੀਂ। ਲਾਈਵ ਬੈਕਐਂਡ ਜੋੜੋ।"
    override val msgEnterFullName = "ਪੂਰਾ ਨਾਮ ਲਾਜ਼ਮੀ ਹੈ।"
    override val msgVerifyMobileOtpFirst = "ਕਿਰਪਾ ਕਰਕੇ ਪਹਿਲਾਂ ਮੋਬਾਈਲ OTP ਜਾਂਚੋ।"
    override val msgAccountCreatedFormat = "ਜੀ ਆਇਆਂ ਨੂੰ %1\$s! %2\$s ਖਾਤਾ ਬਣ ਗਿਆ (%3\$s)।"
    override val msgLoggedInFormat = "%1\$s (%2\$s) ਵਜੋਂ ਲੌਗ ਇਨ ਹੋ ਗਏ"
    override val msgSignedOut = "ਵਰਤੋਂਕਾਰ ਖਾਤੇ ਤੋਂ ਸਾਈਨ ਆਉਟ ਹੋ ਗਏ।"
    override val msgDuplicateOwnerBlocked = "ਸੁਰੱਖਿਆ ਰੋਕ: ਮਾਲਕ ਖਾਤਾ ਪਹਿਲਾਂ ਹੀ ਮੌਜੂਦ ਹੈ। ਦੂਜਾ ਮਾਲਕ ਨਹੀਂ ਬਣ ਸਕਦਾ।"
    override val msgBootstrapRequired = "ਸਰਵਰ ਬੂਟਸਟ੍ਰੈਪ ਅਧਿਕਾਰ ਕੋਡ ਦਰਜ ਕਰੋ।"
    override val msgEnterPasswords = "ਮਾਲਕ ਲੌਗ ਇਨ ਪਾਸਵਰਡ ਭਰੋ ਅਤੇ ਪੁਸ਼ਟੀ ਕਰੋ।"
    override val msgPasswordsDoNotMatch = "ਪਾਸਵਰਡ ਮੇਲ ਨਹੀਂ ਖਾਂਦੇ।"
    override val msgPasswordTooShort = "ਪਾਸਵਰਡ ਘੱਟੋ-ਘੱਟ 8 ਅੱਖਰਾਂ ਦਾ ਹੋਣਾ ਚਾਹੀਦਾ ਹੈ।"
    override val msgPinFourDigits = "ਐਡਮਿਨ PIN ਠੀਕ 4 ਅੰਕਾਂ ਦਾ ਹੋਣਾ ਚਾਹੀਦਾ ਹੈ।"
    override val msgPinsDoNotMatch = "4-ਅੰਕੀ PIN ਪੁਸ਼ਟੀ ਮੇਲ ਨਹੀਂ ਖਾਂਦੀ।"
    override val msgOwnerCreatedFormat = "%1\$s ਲਈ ਮਾਲਕ ਪ੍ਰੋਫਾਈਲ ਬਣ ਗਈ। ਹੁਣ ਨਵੀਂ ਮਾਲਕ ਰਜਿਸਟ੍ਰੇਸ਼ਨ ਪੱਕੇ ਤੌਰ 'ਤੇ ਬੰਦ ਹੈ।"
    override val msgOwnerLockedSession = "ਮਾਲਕ ਸੈਸ਼ਨ ਲੌਕ ਹੋ ਗਿਆ।"
    override val msgOwnerTimedOut = "5 ਮਿੰਟ ਨਿਸ਼ਕਿਰਿਆ ਰਹਿਣ ਕਾਰਨ ਮਾਲਕ ਸੈਸ਼ਨ ਖਤਮ ਹੋਇਆ। ਮੁੜ PIN ਭਰੋ।"
    override val msgOwnerUnlocked = "ਮਾਲਕ ਮਾਸਟਰ ਕੰਟਰੋਲ ਖੁੱਲ੍ਹ ਗਿਆ।"
    override val msgInvalidPinAttemptsFormat = "ਗਲਤ 4-ਅੰਕੀ ਮਾਲਕ PIN। %1\$d ਕੋਸ਼ਿਸ਼ ਬਾਕੀ।"
    override val msgTooManyPinAttemptsFormat = "ਬਹੁਤ ਗਲਤ ਕੋਸ਼ਿਸ਼ਾਂ। %1\$d ਸਕਿੰਟਾਂ ਲਈ ਲੌਕ।"
    override val msgOwnerSessionRequired = "ਸਰਗਰਮ ਮਾਲਕ ਸੈਸ਼ਨ ਲੋੜੀਂਦਾ ਹੈ।"
    override val msgVerifyOtpBeforePinChange = "ਪਹਿਲਾਂ ਰਜਿਸਟਰਡ ਮੋਬਾਈਲ 'ਤੇ ਆਇਆ OTP ਜਾਂਚੋ।"
    override val msgPinUpdatedSuccess = "ਨਵਾਂ ਐਡਮਿਨ PIN ਸਰਵਰ 'ਤੇ ਸੁਰੱਖਿਅਤ ਅਪਡੇਟ ਹੋ ਗਿਆ।"
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) ਲਈ ਡੈਮੋ ਪ੍ਰੋਫਾਈਲ ਅਪਡੇਟ ਹੋਈ"
    override val msgJobPostedFormat = "%1\$s ਵਿੱਚ ਡੈਮੋ ਕੰਮ ਪੋਸਟ ਹੋਇਆ! ਫੀਸ: %2\$d ਸਿੱਕੇ।"
    override val msgAlreadyAppliedFormat = "%1\$s ਲਈ ਪਹਿਲਾਂ ਹੀ ਅਰਜ਼ੀ ਦਿੱਤੀ ਜਾ ਚੁੱਕੀ ਹੈ"
    override val msgApplicationSentFormat = "%1\$s ਲਈ ਅਰਜ਼ੀ ਭੇਜੀ ਗਈ"
    override val msgApplicationWithdrawnFormat = "ਅਰਜ਼ੀ %1\$s ਵਾਪਸ ਲਈ ਗਈ"
    override val msgApplicationUpdatedFormat = "ਅਰਜ਼ੀ %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "ਹਫ਼ਤਾਵਾਰੀ ਜਾਂਚ ਦਰਜ: 1 · ਮੈਂ ਸੁਰੱਖਿਅਤ ਹਾਂ।"
    override val msgCheckInProblemRecorded = "ਚੇਤਾਵਨੀ ਦਰਜ (2 · ਮੁਸ਼ਕਲ)। ਸੁਰੱਖਿਆ ਡੈਸਕ ਨੂੰ ਸੂਚਿਤ ਕੀਤਾ ਗਿਆ।"
    override val msgCheckInAdminRequested = "ਐਮਰਜੈਂਸੀ ਐਡਮਿਨ ਕਾਲਬੈਕ ਬੇਨਤੀ (3)। ਪਰਿਵਾਰ ਅਲਰਟ ਕਤਾਰ ਵਿੱਚ ਹੈ।"
    override val msgSafetyComplaintSubmittedFormat = "ਸੁਰੱਖਿਆ ਮਾਮਲਾ %1\$s ਦਰਜ ਹੋ ਗਿਆ।"
    override val msgWithdrawalsFrozen = "ਐਮਰਜੈਂਸੀ ਰੋਕ ਚਾਲੂ: ਸਾਰੇ ਪੈਸੇ ਕਢਵਾਉਣੇ ਤੁਰੰਤ ਬੰਦ ਕੀਤੇ ਗਏ।"
    override val msgWithdrawalsUnfrozen = "ਜਾਂਚ ਤੋਂ ਬਾਅਦ ਪੈਸੇ ਕਢਵਾਉਣਾ ਅਨਲੌਕ ਹੋਇਆ।"
    override val msgOwnerNoticePublished = "ਲਾਲ LOBORO ਐਡਮਿਨ ਸੂਚਨਾ ਪ੍ਰਸਾਰਿਤ ਹੋ ਗਈ।"
}
