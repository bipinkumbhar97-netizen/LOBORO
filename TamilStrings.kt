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

object TamilStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "உலகளாவிய வேலை & சேவை"
    override val demoPreviewBanner = "டெமோ முன்னோட்ட தரவு · நேரலைக்கு அமைப்புகளில் API சேர்க்கவும்"
    override val verifiedNormalAccountBanner = "சரிபார்க்கப்பட்ட பயனர் கணக்கு · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO நிர்வாக அறிவிப்பு"
    override val maintenanceModeBanner = "பராமரிப்பு முறை செயலில் உள்ளது · வேலை மற்றும் வாலட் தற்காலிகமாக நிறுத்தப்பட்டுள்ளன. அவசர 112 மற்றும் பாதுகாப்பு சேவை இயங்கும்."
    override val navHome = "முகப்பு"
    override val navSearchJobs = "வேலை தேடு"
    override val navPostJob = "வேலை பதிவிடு"
    override val navWallet = "வாலட்"
    override val navMyApplications = "என் விண்ணப்பங்கள்"
    override val navMyJobs = "என் வேலைகள்"
    override val navNotifications = "அறிவிப்புகள்"
    override val navHelpSafety = "உதவி & பாதுகாப்பு"
    override val navProfile = "சுயவிவரம்"
    override val navSettings = "அமைப்புகள்"
    override val navAdmin = "உரிமையாளர் கட்டுப்பாடு"
    override val navBadgesLoyalty = "பேட்ஜ் & விசுவாசம்"
    override val navIvrKeypad = "கீபேட் & IVR"
    override val backLabel = "பின்செல்"
    override val homeLabel = "முகப்பு"
    override val languageLabel = "மொழி"
    override val languageSelectorTitle = "12 மொழிகள்"
    override val activeBadgeLabel = "செயலில்"
    override val closeLabel = "மூடு"
    override val okLabel = "சரி"
    override val understoodLabel = "புரிந்தது"
    override val cancelLabel = "ரத்து செய்"
    override val doneLabel = "முடிந்தது"
    override val confirmActionLabel = "உறுதி செய்"
    override val resetLabel = "மீட்டமை"
    override val sendLabel = "அனுப்பு"

    override val shareAppTitle = "LOBORO செயலியை பகிரவும்"
    override val shareAppCta = "நண்பர்களுக்கு பகிர்ந்து பரிசு பெறுங்கள்"
    override val yourReferralLinkLabel = "உங்கள் பரிந்துரை இணைப்பு"
    override val loboroLinkLabel = "LOBORO இணைப்பு"
    override val shareMenuButton = "பகிர் மெனு"
    override val copyLinkButton = "இணைப்பை நகலெடு"
    override val referralCopiedToast = "பரிந்துரை செய்தி நகலெடுக்கப்பட்டது"
    override val openingShareMenuToast = "பகிர் மெனு திறக்கிறது"
    override val shareMessageTemplate = "LOBORO உலகளாவிய வேலை & சேவையில் இணையுங்கள்! இந்தியா முழுவதும் தினக்கூலி அல்லது மாத சம்பள வேலை பெறுங்கள். என் பரிந்துரை ID %1\$s: %2\$s"

    override val registerWorkerEmployerCta = "தொழிலாளி / முதலாளியாக பதிவு செய்க"
    override val logInLabel = "உள்நுழை"
    override val signOutLabel = "வெளியேறு"
    override val voiceSearchHint = "வேலை அல்லது நகரத்தை பேசுங்கள் அல்லது தட்டச்சு செய்க (எ.கா. ஹைதராபாத்தில் கொத்தனார்)"
    override val tapMicToSpeak = "பேசி வேலை தேட மைக் அழுத்தவும்"
    override val listeningStatus = "கேட்கிறது... உங்கள் வேலையை சொல்லுங்கள்"
    override val stopListening = "கேட்பதை நிறுத்து"
    override val searchAction = "தேடு"
    override val retryVoice = "மீண்டும் பேசுங்கள்"
    override val voiceMicPermissionNeeded = "குரல் தேடலுக்கு மைக் பொத்தானை அழுத்தும்போது மட்டுமே மைக் அனுமதி கேட்கப்படும்."
    override val voiceUnavailableHonest = "இந்த சாதனத்தில் குரல் அறிதல் சேவை இல்லை. கிளவுட் குரல் சேவையை இணைக்கவும் அல்லது கீழே உள்ளதைத் தட்டவும்."
    override val voiceNoMatchError = "குரல் தெளிவாகப் புரியவில்லை. தெளிவாகப் பேசவும் அல்லது கீழே உள்ள மாதிரியைத் தேர்ந்தெடுக்கவும்."
    override val voiceNetworkError = "நெட்வொர்க் பிழை. இணையத்தைச் சரிபார்த்து வேலைப் பெயரைத் தட்டச்சு செய்க."
    override val voiceStoppedError = "குரல் உள்ளீடு நின்றது (குறியீடு %1\$d). தட்டச்சு செய்க அல்லது மீண்டும் முயல்க."
    override val voicePrivacyHint = "தனியுரிமை: மைக் இயல்பாக அணைந்திருக்கும், நீங்கள் அழுத்தும்போது மட்டுமே இயங்கும்."
    override val clearSearchDesc = "தேடலை அழி"
    override val spokenSamples = listOf(
        "ஹைதராபாத்தில் கொத்தனார்" to "Mason",
        "புனே எலக்ட்ரீஷியன்" to "Electrician",
        "சென்னை ஹோட்டல் சமையல்காரர்" to "Cook",
        "விஜயவாடா ஓட்டுநர்" to "Driver",
        "சூரத் பேக்கிங் வேலை" to "Packing"
    )
    override val dailyJobsTitle = "தினசரி வேலைகள் (Daily)"
    override val dailyJobsSubtitle = "தினக்கூலி · மாத வேலைகளிலிருந்து தனிப் பட்டியல்"
    override val monthlyJobsTitle = "மாத சம்பள வேலைகள்"
    override val monthlyJobsSubtitle = "நிலையான மாத சம்பளம் · விடுப்பு & தங்குமிட விவரம்"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "வேலை வகைகள் (24)"
    override val walletStripSummaryFormat = "%1\$d நாணயங்கள் (₹%2\$d) · 100%% எடுக்கக்கூடியது"

    override val outOfStateTitle = "வெளிமாநில & உலகளாவிய வேலை தேடல்"
    override val willingToRelocate = "மற்ற மாநிலத்திற்கு செல்ல சம்மதம்"
    override val filterCountry = "நாடு"
    override val filterState = "மாநிலம்"
    override val filterDistrict = "மாவட்டம்"
    override val filterCity = "நகரம்"
    override val filterDistance = "தூரம்"
    override val upToKmFormat = "%1\$d கி.மீ வரை"
    override val filterFoodIncluded = "உணவு உண்டு"
    override val filterAccommodation = "அறை / தங்குமிடம்"
    override val allCategoriesLabel = "அனைத்து வகைகளும்"
    override val noMatchingJobsTitle = "வடிகட்டிக்கு பொருந்தும் வேலைகள் இல்லை"
    override val noMatchingJobsSubtitle = "வடிகட்டிகளை மீட்டமைக்கவும் அல்லது 'வெளிமாநில வேலை' இயக்கவும்."
    override val showAllJobsButton = "அனைத்து வேலைகளையும் காட்டு"
    override val dailyWageJobBadge = "தினக்கூலி வேலை"
    override val monthlySalaryJobBadge = "மாத சம்பள வேலை"
    override val demoDataTag = "டெமோ"
    override val originalLangFormat = "மூல மொழி: %1\$s"
    override val preTranslatedPreviewNote = "முன்-மொழிபெயர்க்கப்பட்ட முன்னோட்டம் இயங்குகிறது. நேரடி வேலைகளுக்கு அமைப்புகளில் மொழிபெயர்ப்பு API சேர்க்கவும்."
    override val configureTranslationApiNote = "அனைத்து 12 மொழிகளிலும் நேரடி மொழிபெயர்ப்புக்கு அமைப்புகளில் மொழிபெயர்ப்பு API சேர்க்கவும்."
    override val translatedToggle = "மொழிபெயர்ப்பு"
    override val originalToggle = "மூலம்"
    override val compensationLabel = "ஊதியம் / சம்பளம்"
    override val locationLabel = "இடம்"
    override val employerLabel = "முதலாளி"
    override val vacanciesUnit = "காலியிடங்கள்"
    override val perDayFormat = "₹%1\$d / நாள்"
    override val perMonthFormat = "₹%1\$d / மாதம்"
    override val coinsCountFormat = "%1\$d நாணயங்கள்"
    override val foodBadge = "உணவு"
    override val stayBadge = "தங்குமிடம்"
    override val shareJobButton = "வேலையை பகிர்"
    override val applyNow = "விண்ணப்பிக்கவும்"
    override val saveJob = "சேமி"
    override val negotiateChat = "உரையாடு / சாட்"
    override val reportJob = "புகார் செய்"
    override val foodAvailable = "உணவு உண்டு"
    override val accommodationAvailable = "தங்குமிடம் உண்டு"
    override val notProvided = "சேர்க்கப்படவில்லை"
    override val workersNeeded = "தேவையான தொழிலாளர்கள்"
    override val workHoursLabel = "வேலை நேரம்"
    override val overtimeLabel = "கூடுதல் நேரம்"
    override val paymentFreqLabel = "ஊதியம்"
    override val weeklyHolidayLabel = "வார விடுமுறை"
    override val leavePolicyLabel = "விடுப்பு விதி"
    override val joiningDateLabel = "சேரும் தேதி"
    override val expiryLabel = "காலாவதி"
    override val translatedBadgeLabel = "மொழிபெயர்க்கப்பட்டது"

    override val postingPausedFormat = "வேலை பதிவிடுதல் தற்போது உரிமையாளர் கட்டுப்பாட்டால் (%1\$s) நிறுத்தப்பட்டுள்ளது."
    override val selectCategoryLabel = "வேலை வகையைத் தேர்ந்தெடுக்கவும் (24 வகைகள்)"
    override val jobTitleLabel = "வேலை தலைப்பு"
    override val jobTitlePlaceholder = "எ.கா. விடுதி கட்டிடத்திற்கு 4 கொத்தனார்கள் தேவை"
    override val jobDescLabel = "வேலை விவரம்"
    override val jobDescPlaceholder = "வேலை விவரங்கள், பாதுகாப்பு உபகரணங்கள், உணவு & தங்குமிட வசதி"
    override val dailyWageInrLabel = "தினக்கூலி (₹)"
    override val monthlySalaryInrLabel = "மாத சம்பளம் (₹)"
    override val vacanciesLabel = "காலியிடங்கள்"
    override val cityTownLabel = "நகரம் / ஊர்"
    override val stateLabel = "மாநிலம்"
    override val transparentJobFeeTitle = "வெளிப்படையான வேலை கட்டணம்: %1\$d நாணயம் (₹%2\$d)"
    override val configuredByOwnerSub = "உரிமையாளர் அமைத்தது · கட்டண நேரம்: %1\$s · இருப்பு: %2\$d நாணயங்கள்"
    override val confirmAndPostJobButton = "உறுதி செய்து வேலை பதிவிடு (%1\$d நாணயங்கள்)"

    override val walletBalanceTitle = "LOBORO நாணய இருப்பு"
    override val withdrawableValueFormat = "₹%1\$d எடுக்கக்கூடிய மதிப்பு (1 நாணயம் = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% சம பணம் எடுக்கும் விதி"
    override val withdrawableRuleBody = "வாங்கிய, பரிசு, சலுகை, பரிந்துரை, பேட்ஜ் அல்லது விசுவாச நாணயங்கள் அனைத்தும் சம ரொக்க மதிப்பு மற்றும் 100% எடுக்கும் தகுதி கொண்டவை. பூட்டிய நாணயங்கள் இல்லை."
    override val buyCoins = "நாணயம் வாங்கு"
    override val withdrawCoins = "பணம் எடு"
    override val walletActionsPausedNote = "சில வாலட் சேவைகள் உரிமையாளரால் நிறுத்தப்பட்டுள்ளன. உங்கள் இருப்பு மற்றும் அங்கீகரிக்கப்பட்ட பணம் பாதுகாப்பாக உள்ளன."
    override val coinPackagesTitle = "நாணய தொகுப்புகள் (வெளிப்படையான மதிப்பு)"
    override val bankSecurityTitle = "வங்கி / UPI & முக சரிபார்ப்பு பாதுகாப்பு"
    override val payoutDestinationLabel = "சரிபார்க்கப்பட்ட வங்கி கணக்கு: %1\$s"
    override val bankSecurityStepsNote = "வங்கி/UPI மாற்ற கட்டாய சோதனைகள்: பதிவு மொபைல் OTP + நேரடி செல்ஃபி பொருத்தம் + தற்காலிக பணத் தடை."
    override val changeBankUpiButton = "வங்கி / UPI மாற்று (OTP + முக சோதனை)"
    override val unfreezePayoutsButton = "பணம் எடுத்தலைத் திற"
    override val lostPhoneFreezeButton = "போன் தொலைந்ததா? பணம் எடுப்பதை நிறுத்து"
    override val payoutFreezeActiveNote = "பணம் எடுக்கும் தடை செயலில் உள்ளது. அடையாள மறுசரிபார்ப்பு வரை பணம் எடுக்க முடியாது."
    override val transactionHistory = "நாணய பரிவர்த்தனை பதிவேடு"
    override val demoLedgerSuffix = "(டெமோ பதிவேடு)"
    override val buyCoinsDialogTitleFormat = "%1\$d நாணயங்கள் வாங்கு (₹%2\$d)"
    override val paymentNotConnectedBody = "நேரடி Razorpay / Cashfree UPI இன்னும் இணைக்கப்படவில்லை. உண்மையான பணம் பெறும் முன் தயாரிப்பு சாவிகளை இணைக்கவும்."
    override val withdrawDialogTitleFormat = "₹%1\$d பணம் எடு"
    override val withdrawDialogBodyFormat = "முழு இருப்பும் (%1\$d நாணயங்கள்) சம மதிப்பில் 100%% எடுக்கலாம்.\nகணக்கு: %2\$s\n\nஇந்த பதிப்பில் நேரடி IMPS / UPI இணைக்கப்படவில்லை."
    override val bankChangeDialogTitle = "3-படி வங்கி / UPI மாற்ற பாதுகாப்பு"
    override val bankChangeDialogBody = "போன் தொலைந்தாலும் பாதுகாக்க வங்கி/UPI மாற்ற இவை தேவை:\n1. பதிவு மொபைல் OTP சரிபார்ப்பு\n2. பதிவு புகைப்படத்துடன் நேரடி முகப் பொருத்தம்\n3. வெளியீட்டிற்கு முன் பாதுகாப்பு காத்திருப்பு"
    override val receiptDialogTitle = "பரிவர்த்தனை ரசீது"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "குறிப்பு: %1\$s"
    override val receiptTypeLabel = "வகை: %1\$s"
    override val receiptCoinsLabel = "நாணயங்கள்: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "நிலை: %1\$s"
    override val receiptTimeLabel = "நேரம்: %1\$s"
    override val receiptWithdrawableYes = "பணம் எடுக்கும் தகுதி: 100% ஆம்"

    override val employerAppsHeading = "விண்ணப்பங்கள் & நேரடி உரையாடல்"
    override val secureChatHeading = "பாதுகாப்பான தொழிலாளி ↔ முதலாளி சாட்"
    override val secureChatSubtitle = "நீங்கள் பகிரும் வரை தொலைபேசி எண் மறைந்திருக்கும். திறக்க அல்லது தடுக்க தட்டவும்."
    override val chatButton = "சாட்"
    override val workerEmployerLineFormat = "தொழிலாளி: %1\$s (%2\$s) · முதலாளி: %3\$s"
    override val shortlistButton = "பட்டியலிடு"
    override val acceptButton = "ஏற்றுக்கொள்"
    override val withdrawButton = "திரும்பப் பெறு"
    override val phoneHiddenPrivacy = "தனியுரிமை செயலில்: இருவரும் சம்மதிக்கும் வரை தொலைபேசி எண் மறைந்திருக்கும்."
    override val blockUserLabel = "தடு"
    override val userBlockedNotice = "இந்த உரையாடலை நீங்கள் தடுத்துள்ளீர்கள். தேவைப்பட்டால் பாதுகாப்பு மையத்தில் புகார் செய்க."
    override val chatPlaceholder = "உங்கள் மொழியில் செய்தி தட்டச்சு செய்க..."

    override val automaticBadgePrefix = "தானியங்கி பேட்ஜ்: %1\$s"
    override val badgeStatsFormat = "மதிப்பீடு %1\$.1f ★ · %2\$d சரிபார்க்கப்பட்ட வேலை நாட்கள் · %3\$d முடிந்த வேலைகள்"
    override val progressToFormat = "%1\$s பேட்ஜ் முன்னேற்றம்: %2\$d / %3\$d நாட்கள்"
    override val badgeAntiAbuseNote = "பேட்ஜ்கள் உண்மையில் முடித்த வேலைகள், சரிபார்க்கப்பட்ட வருகை மற்றும் நியாயமான மதிப்பீட்டின் அடிப்படையில் மட்டுமே வழங்கப்படும்."
    override val badgeTiersTitle = "5 தானியங்கி பேட்ஜ் நிலைகள்"
    override val minWorkdaysFormat = "குறைந்தபட்சம் %1\$d வேலை நாட்கள் · %2\$.1f★ மதிப்பீடு"
    override val badgeAppealsNote = "நியாயப் பாதுகாப்பு: திடீர் சந்தேகத்திற்குரிய 1-நட்சத்திர மதிப்பீடுகள் மேல்முறையீட்டில் பரிசீலிக்கப்படும்."
    override val loyaltyTitle = "மூப்பு & விசுவாச நிதி உதவி"
    override val loyaltySubtitle = "வெளிப்படையான காலாண்டு நலன் & மைல்கல் போனஸ்"
    override val loyaltyDisclaimer = "முக்கிய அறிவிப்பு: இது காப்பீடு அல்ல, உறுதியான மாத ஓய்வூதியமும் அல்ல. தகுதி, வேலை நாட்கள், நிதி மற்றும் நிர்வாக ஒப்புதலுக்கு உட்பட்டது."
    override val loyaltyMinMembershipFormat = "குறைந்தபட்ச உறுப்பினர் காலம்: %1\$d மாதங்கள்"
    override val loyaltyWorkdaysFormat = "சரிபார்க்கப்பட்ட வேலை நாட்கள்: %1\$d+ நாட்கள்"
    override val loyaltyRequiredBadgeFormat = "தேவையான பேட்ஜ்: %1\$s+"
    override val loyaltyRequiredRatingFormat = "குறைந்தபட்ச மதிப்பீடு: %1\$.1f★"
    override val loyaltyBudgetFormat = "அனுமதிக்கப்பட்ட உதவி: ₹%1\$d · நிதி தொகுப்பு: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "தொழிலாளர் பாதுகாப்பு & அவசர உதவி"
    override val callEmergency112 = "அவசர 112 அழைக்கவும்"
    override val weeklyCheckInTitle = "வாராந்திர பாதுகாப்பு சோதனை"
    override val weeklyCheckInQuestion = "நீங்கள் பாதுகாப்பாக உள்ளீர்களா?"
    override val checkInOpt1 = "1 · நான் பாதுகாப்பாக உள்ளேன்"
    override val checkInOpt2 = "2 · எனக்கு பிரச்சனை உள்ளது"
    override val checkInOpt3 = "3 · LOBORO நிர்வாகத்துடன் பேசவும்"
    override val reportSafetyIssue = "பாதுகாப்பு / சம்பள புகார் அளிக்கவும்"
    override val safetyOperationalNote = "வேலை பதிவிடுதல் அல்லது பணம் செலுத்துதல் நிறுத்தப்பட்டாலும் பாதுகாப்பு உதவி எப்போதும் இயங்கும்."
    override val safetyDisclaimerNote = "உடனடி ஆபத்தில் நேரடியாக 112 அழைக்கவும். நியாயமான தீர்வுக்காக LOBORO புகார்களைப் பதிவு செய்கிறது."
    override val everyDaysFormat = "ஒவ்வொரு %1\$d நாட்களுக்கும்"
    override val lastStatusFormat = "கடைசி சோதனை: %1\$s"
    override val checkInNoResponseNote = "தொடர்ந்து 2 சோதனைகள் தவறினால் அல்லது பிரச்சனை எனத் தேர்வு செய்தால் LOBORO SMS, நிர்வாக ஆய்வு மற்றும் குடும்பத்திற்கு தகவல் அனுப்பும்."
    override val consentEmergencyTitle = "சம்மதத்துடன் அவசர இருப்பிடம் & குடும்ப தொடர்பு"
    override val workerIdLabel = "தொழிலாளி ID: %1\$s"
    override val homeOriginLabel = "சொந்த ஊர்: %1\$s, %2\$s"
    override val currentJobCityLabel = "தற்போதைய வேலை நகரம்: %1\$s"
    override val emergencyContactLabel = "அவசர தொடர்பு: %1\$s (%2\$s)"
    override val consentGranted = "சம்மதம் வழங்கப்பட்டது"
    override val consentPending = "சம்மதம் நிலுவையில்"
    override val employerLoboroIdInput = "முதலாளி LOBORO ID (எ.கா. LB819)"
    override val currentSiteInput = "தற்போதைய வேலை நகரம் / தளம்"
    override val describeIssueInput = "பாதுகாப்பு அல்லது கூலி பிரச்சனையை எழுதுங்கள்"
    override val submitSafetyDeskButton = "பாதுகாப்பு மையத்திற்கு அனுப்பு"
    override val safetyCasesHeading = "சமீபத்திய பாதுகாப்பு வழக்குகள் (தணிக்கை செய்யக்கூடியது)"
    override val ivrTitle = "கீபேட் போன் மிஸ்டு-கால் & IVR மெனு"
    override val ivrSubtitle = "ஸ்மார்ட்போன் இல்லாமல் கட்டணமில்லா அழைப்பு மூலம் இயங்கும்"
    override val ivrArchNote = "நேரலை அமைப்பு Exotel / Knowlarity / Twilio Voice உடன் இணையும். 12-மொழி குரல் மெனுவை சோதிக்க பொத்தான்களை அழுத்தவும்."
    override val ivrMenuTitle = "LOBORO குரல் IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO க்கு வரவேற்கிறோம்! குரல் மெனுவைக் கேட்க கீபேட் எண்ணை அழுத்தவும்."
    override val pressKeyFormat = "%1\$s அழுத்தவும் → %2\$s"
    override val ivrSelectedSummaryFormat = "தேர்ந்தெடுத்தது [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "இன்றைய தினக்கூலி வேலைகள்",
        "2" to "மாத சம்பள வேலைகள்",
        "3" to "வாராந்திர பாதுகாப்பு சோதனை ('பாதுகாப்பாக உள்ளீர்களா?')",
        "4" to "வாலட் நாணயம் & சமீபத்திய நிலை கேட்க",
        "5" to "அவசர நிர்வாகி திரும்ப அழைப்பு",
        "6" to "விண்ணப்ப நிலையைச் சரிபார்க்க",
        "0" to "குரல் மொழியை மாற்ற"
    )

    override val userRegTitle = "தொழிலாளி & முதலாளி பதிவு"
    override val userLoginTitle = "தொழிலாளி & முதலாளி உள்நுழைவு"
    override val userAuthSubtitle = "OTP சரிபார்க்கப்பட்ட சாதாரண பயனர் கணக்கு · இரகசிய உரிமையாளர் அமைப்பிலிருந்து தனி"
    override val registerTab = "பதிவு"
    override val loginTab = "உள்நுழைவு"
    override val dbOtpNotConnectedTitle = "பின்தள தரவுத்தளம் / OTP இணைக்கப்படவில்லை"
    override val dbOtpNotConnectedBody = "உண்மையான தொழிலாளி & முதலாளி கணக்குகளை சேமிக்க LOBORO_BACKEND_URL அமைக்கவும்."
    override val selectAccountTypeStep = "1. கணக்கு வகையைத் தேர்ந்தெடுக்கவும்"
    override val workerAccountLabel = "தொழிலாளி"
    override val employerAccountLabel = "முதலாளி"
    override val regPausedForRoleFormat = "%1\$s பதிவு தற்போது உரிமையாளரால் நிறுத்தி வைக்கப்பட்டுள்ளது."
    override val preferredLanguageLabel = "விரும்பும் செயலி மொழி (12 மொழிகள்)"
    override val fullNameStepLabel = "2. முழுப் பெயர் *"
    override val businessNameStepLabel = "2. வணிகம் / ஒப்பந்ததாரர் முழுப் பெயர் *"
    override val mobileStepLabel = "3. மொபைல் எண் (10 இலக்கங்கள்) *"
    override val sendRegOtpButton = "OTP அனுப்பு"
    override val resendMobileOtpButton = "OTP மீண்டும் அனுப்பு"
    override val enterOtpStepLabel = "4. மொபைல் OTP உள்ளிடவும் *"
    override val verifyOtpButton = "OTP சரிபார்"
    override val verifiedLabel = "சரிபார்க்கப்பட்டது"
    override val mobileVerifiedNote = "சர்வரில் மொபைல் சரிபார்க்கப்பட்டது"
    override val homeStateLabel = "சொந்த மாநிலம்"
    override val homeDistrictLabel = "சொந்த மாவட்டம்"
    override val stateShortLabel = "மாநிலம்"
    override val cityShortLabel = "நகரம்"
    override val workCityStateLabel = "தற்போதைய வேலை நகரம் & மாநிலம்"
    override val businessLocationLabel = "வணிக நகரம் & மாநிலம்"
    override val skillsCategoriesLabel = "திறன்கள் / வேலை (எ.கா. கொத்தனார், எலக்ட்ரீஷியன்)"
    override val hiringCategoriesLabel = "ஆட்சேர்ப்பு வகைகள்"
    override val emergencyContactNameLabel = "அவசர குடும்ப தொடர்பு பெயர்"
    override val emergencyContactPhoneLabel = "அவசர தொடர்பு எண்"
    override val uniqueLbIdNotice = "பதிவு முடிந்ததும் சர்வர் நிரந்தர LB ID (LB2000+) வழங்கும். VIP & உரிமையாளர் எண்கள் பாதுகாக்கப்படுகின்றன."
    override val creatingProfileLabel = "சுயவிவரம் உருவாகிறது..."
    override val createProfileButton = "தொழிலாளி / முதலாளி சுயவிவரம் உருவாக்கு"
    override val loginHeading = "பதிவுசெய்த மொபைல் OTP மூலம் உள்நுழையவும்"
    override val loginSubtitle = "தொழிலாளி அல்லது முதலாளியாக பதிவு செய்த மொபைல் எண்ணை உள்ளிடவும்."
    override val registeredMobileLabel = "பதிவுசெய்த மொபைல் எண்"
    override val sendLoginOtpButton = "உள்நுழைவு OTP அனுப்பு"
    override val resendLoginOtpButton = "OTP மீண்டும் அனுப்பு"
    override val enterLoginOtpLabel = "உள்நுழைவு OTP உள்ளிடவும்"
    override val verifyingOtpLabel = "சரிபார்க்கிறது..."
    override val verifyOtpOpenHomeButton = "OTP சரிபார்த்து முகப்பைத் திற"
    override val backToHomepageButton = "முகப்புப் பக்கத்திற்குச் செல்"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "பங்கு"
    override val offlinePreviewHeading = "ஆஃப்லைன் சுயவிவரம் & புகைப்பட முன்னோட்டம்"
    override val offlinePreviewCardTitle = "சுயவிவரம் உருவாக்கு / திருத்து (ஆஃப்லைன் முன்னோட்டம்)"
    override val offlinePreviewCardSubtitle = "நேரலை தரவுத்தளம் இணையும் வரை உள்ளூர் முன்னோட்டமாக சேமிக்கப்படும்."
    override val workLocationLabel = "வேலை இடம் (நகரம், மாநிலம்)"
    override val businessAddressLabel = "வணிக நகரம், மாநிலம்"
    override val skillsExpLabel = "திறன்கள் / வேலை வகை"
    override val businessCatLabel = "வணிக வகை / ஆட்சேர்ப்பு பிரிவுகள்"
    override val aadhaarPrivacyNote = "தரவு பாதுகாப்பு: LOBORO சாதனத்தில் ஆதார் படங்களை சேமிக்காது — சரிபார்க்கப்பட்ட ஹாஷ் & சம்மதம் மட்டுமே சேமிக்கும்."
    override val selectProfilePhotoBtn = "சுயவிவரப் படம் தேர்ந்தெடு (ஃபோட்டோ பிக்கர்)"
    override val photoSelectedBtn = "படம் தேர்ந்தெடுக்கப்பட்டது ✓"
    override val offlineConsentCheck = "பாதுகாப்பு சோதனை மற்றும் தொடர்பு கொள்ள முடியாவிட்டால் குடும்பத்திற்கு தெரிவிக்க சம்மதிக்கிறேன்."
    override val previewProfileBtn = "முன்னோட்ட சுயவிவரத்தை சேமி"
    override val audienceScopeFormat = "பயனர்கள்: %1\$s · பகுதி: %2\$s · %3\$s"
    override val settingsHeading = "அமைப்புகள் & தளத் தகவல்"
    override val languageSectionTitle = "செயலி மொழி (அனைத்து 12 இந்திய மொழிகள்)"
    override val languageSectionSubtitle = "உங்கள் செயலில் உள்ள கணக்கிற்குத் தனியாக சேமிக்கப்படும். மற்ற கணக்குகளின் மொழி மாறாது."
    override val languagePausedByOwner = "உரிமையாளர் கட்டுப்பாட்டால் மொழி மாற்றம் தற்காலிகமாக நிறுத்தப்பட்டுள்ளது."
    override val lowDataTitle = "குறைந்த டேட்டா முறை"
    override val lowDataSubtitle = "2G/3G கிராமப்புற நெட்வொர்க்குகளில் டேட்டாவை மிச்சப்படுத்தும்"
    override val reducedMotionTitle = "குறைந்த அசைவு & தெளிவான தோற்றம்"
    override val reducedMotionSubtitle = "தெளிவான எழுத்துக்கள் மற்றும் எளிய திரை இயக்கம்"
    override val privacyPolicyTitle = "தனியுரிமைக் கொள்கை & தரவு பாதுகாப்பு"
    override val privacyPolicyBody = "• உங்கள் அனுமதியின்றி சாட்டில் தொலைபேசி எண் காட்டப்படாது.\n• குரல் தேடல் பொத்தானை அழுத்தும்போது மட்டுமே மைக் இயங்கும்.\n• பாதுகாப்பான ஆண்ட்ராய்டு போட்டோ பிக்கர் பயன்படுத்தப்படுகிறது.\n• உங்கள் சம்மதத்துடன் மட்டுமே குடும்பத்திற்கு அவசர தகவல் அனுப்பப்படும்."
    override val termsOfServiceTitle = "சேவை விதிமுறைகள் & நியாய விதிகள்"
    override val termsOfServiceBody = "• தினக்கூலி மற்றும் மாத சம்பள வேலைகள் தனித்தனியாக வைக்கப்பட்டுள்ளன.\n• ஒவ்வொரு LOBORO நாணயமும் 100% சம மதிப்பு மற்றும் பணம் எடுக்கும் தகுதி கொண்டது.\n• பேட்ஜ்கள் உண்மையான வேலை நாட்கள் & நியாய மதிப்பீட்டால் மட்டுமே கிடைக்கும்.\n• VIP IDகள் (LB1–LB1999) உரிமையாளருக்கு மட்டுமே ஒதுக்கப்பட்டுள்ளன."
    override val helpSupportTitle = "உதவி, ஆதரவு & பாதுகாப்பு மையம்"
    override val helpSupportBody = "• உடனடி ஆபத்தில் 112 அழைக்கவும் (உள்நுழையாமலும் 24x7).\n• சம்பள அல்லது தங்குமிட புகார்களுக்கு உதவி & பாதுகாப்பு மையத்தில் பதிவு செய்யவும்.\n• கீபேட் போன்களுக்கு கட்டணமில்லா அழைப்புக்கு கீபேட் & IVR திறக்கவும்."
    override val backendChecklistTitle = "பின்தள & API இணைப்பு நிலை"
    override val providersLabel = "சேவை வழங்குநர்கள்: %1\$s"
    override val secretsLabel = "ரகசிய சாவிகள்: %1\$s"

    override val ownerSetupTitle = "ஒருமுறை உரிமையாளர் / சூப்பர் அட்மின் அமைப்பு"
    override val ownerSetupSubtitle = "LOBORO உருவாக்கியவருக்கு மட்டுமே. ஒருமுறை பதிவு செய்ததும் நிரந்தரமாக பூட்டப்படும்."
    override val ownerSetupLockNote = "பாதுகாப்பு பூட்டு: ஒரே ஒரு உரிமையாளர் கணக்கு மட்டுமே இருக்க முடியும். தொழிலாளியோ முதலாளியோ பயன்படுத்த முடியாது."
    override val ownerBackendReqTitle = "உரிமையாளர் சர்வர் இணைக்கப்படவில்லை"
    override val ownerBackendReqBody = "கடவுச்சொல் & 4-இலக்க PIN ஐ சர்வரில் பாதுகாக்க LOBORO_BACKEND_URL அமைக்கவும்."
    override val serverSetupAuthHeading = "1. சர்வர் அமைப்பு அங்கீகாரம்"
    override val bootstrapSecretLabel = "ஒருமுறை சர்வர் பூட்ஸ்ட்ராப் குறியீடு *"
    override val bootstrapSecretPlaceholder = "உங்கள் சர்வர் OWNER_BOOTSTRAP_SECRET இலிருந்து"
    override val ownerIdentityHeading = "2. உரிமையாளர் அடையாளம் & மொபைல் OTP"
    override val ownerNameField = "உரிமையாளர் முழுப் பெயர் *"
    override val ownerMobileField = "உரிமையாளர் தனிப்பட்ட மொபைல் எண் *"
    override val ownerSendOtpBtn = "உரிமையாளர் OTP அனுப்பு"
    override val ownerMobileVerifiedNote = "உரிமையாளர் மொபைல் OTP சரிபார்க்கப்பட்டது"
    override val credentialsHeading = "3. கடவுச்சொல் & 4-இலக்க அட்மின் PIN"
    override val createPasswordLabel = "உள்நுழைவு கடவுச்சொல் உருவாக்கு (8+ எழுத்துக்கள்) *"
    override val confirmPasswordLabel = "கடவுச்சொல்லை உறுதி செய்க *"
    override val passwordsMismatchError = "கடவுச்சொற்கள் பொருந்தவில்லை"
    override val createPinLabel = "4-இலக்க அட்மின் PIN உருவாக்கு *"
    override val confirmPinLabel = "4-இலக்க அட்மின் PIN உறுதி செய்க *"
    override val pinsMismatchError = "PINகள் பொருந்தவில்லை"
    override val credentialsHashNote = "சர்வர் கடவுச்சொல் & PIN ஐ Argon2id மூலம் பாதுகாக்கிறது. செயலியில் சேமிக்கப்படாது."
    override val registeringOwnerLabel = "உரிமையாளர் கணக்கு உருவாகிறது..."
    override val completeOwnerRegButton = "உரிமையாளர் பதிவை முடித்து டாஷ்போர்டைத் திற"
    override val returnToAppButton = "LOBORO செயலிக்குத் திரும்பு"
    override val adminPinHeader = "உரிமையாளர் கட்டுப்பாடு · 4-இலக்க PIN தேவை"
    override val adminPinPrompt = "உங்கள் 4-இலக்க உரிமையாளர் அட்மின் PIN ஐ உள்ளிடவும். சர்வரில் வரம்புடன் சரிபார்க்கப்படும்."
    override val pinLockoutFormat = "அதிக தவறான முயற்சிகள். %1\$d வினாடிகளில் மீண்டும் முயல்க."
    override val clrKeyLabel = "அழி"
    override val verifyPinServerBtn = "சர்வரில் 4-இலக்க PIN சரிபார்"
    override val pinSecurityPolicyFormat = "5 தவறான முயற்சிகளுக்குப் பின் பூட்டு · 5 நிமிடம் செயலற்றால் வெளியேறும் · மீதமுள்ள முயற்சிகள்: %1\$d"
    override val ownerMasterControlTitle = "உரிமையாளர் மாஸ்டர் கட்டுப்பாடு"
    override val ownerMasterSubtitle = "உரிமையாளர் சூப்பர் அட்மின் மட்டும் · சர்வர் PIN + OTP + தணிக்கை பதிவு"
    override val ownerSessionLockedNote = "உரிமையாளர் அமர்வு பூட்டப்பட்டுள்ளது. சர்வர் சரிபார்த்த 4-இலக்க PIN தேவை."
    override val verifyOwnerPinBtn = "உரிமையாளர் 4-இலக்க PIN சரிபார்"
    override val ownerProfileLineFormat = "உரிமையாளர் சுயவிவரம் · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "பதிவுசெய்த மொபைல்: %1\$s · ஒரே உரிமையாளர் கணக்கு (%2\$s)"
    override val activeSessionFormat = "செயலில் உள்ள அமர்வு · %1\$dm %2\$02ds இல் வெளியேறும்"
    override val serverAuthorityNote = "அமர்வு டோக்கன் சரிபார்க்கப்பட்டது (சர்வர் அதிகாரம்)"
    override val lockAndExitBtn = "பூட்டி வெளியேறு"
    override val mandatoryProtectionTitle = "கட்டாய பாதுகாப்பு & நிதி பொறுப்பு பாதுகாப்பு"
    override val mandatoryProtectionBody = "அம்சங்களை அணைத்தாலும் பராமரிப்பு முறையை இயக்கினாலும் நிலுவை நிதிப் பொறுப்புகள், ரீஃபண்டுகள் மற்றும் 112 அவசர சேவைகள் ரத்து ஆகாது."
    override val changePinTitle = "அட்மின் PIN மாற்று (OTP சரிபார்ப்பு கட்டாயம்)"
    override val changePinSubtitle = "உரிமையாளருக்கு மட்டும். தற்போதைய PIN காட்டப்படாது. பதிவு மொபைல் OTP கட்டாயம்."
    override val otpToRegisteredMobileNote = "பதிவுசெய்யப்பட்ட உரிமையாளர் மொபைலுக்கு மட்டுமே OTP அனுப்பப்படும்: %1\$s"
    override val sendPinChangeOtpBtn = "பதிவுசெய்த உரிமையாளர் மொபைலுக்கு OTP அனுப்பு"
    override val otpDispatchedNote = "உரிமையாளர் மொபைலுக்கு (%1\$s) OTP அனுப்பப்பட்டது."
    override val enterServerOtpLabel = "சர்வர் OTP குறியீடு உள்ளிடவும்"
    override val verifyOtpServerBtn = "சர்வரில் OTP சரிபார்"
    override val otpVerifiedNewPinNote = "OTP சரிபார்க்கப்பட்டது. புதிய 4-இலக்க உரிமையாளர் PIN ஐ உள்ளிட்டு உறுதி செய்க."
    override val newPinLabel = "புதிய 4-இலக்க PIN"
    override val confirmNewPinLabel = "புதிய 4-இலக்க PIN உறுதி செய்க"
    override val saveNewPinBtn = "உறுதி செய்து அட்மின் PIN மாற்று"
    override val confirmPinChangeTitle = "அட்மின் PIN மாற்றத்தை உறுதி செய்க"
    override val confirmPinChangeDesc = "சர்வரில் 4-இலக்க உரிமையாளர் PIN ஐ மாற்றவா? அமர்வு தொடரும், தணிக்கை பதிவு செய்யப்படும்."
    override val pinUpdatedNote = "புதிய 4-இலக்க உரிமையாளர் PIN சர்வரில் புதுப்பிக்கப்பட்டது."
    override val completeMasterControlTitle = "முழு உரிமையாளர் மாஸ்டர் கட்டுப்பாடு (25 பிரிவுகள்)"
    override val masterControlScopeSubtitle = "பகுதி அல்லது பயனர் வகைப்படி உடனடி ON/OFF கட்டுப்பாடுகள்."
    override val scopeOptions = listOf(
        "உலகளாவிய · இந்தியா (அனைத்து மாநிலங்கள்)",
        "தமிழ்நாடு மட்டும்",
        "தெலுங்கானா மட்டும்",
        "தொழிலாளர்கள் மட்டும்",
        "முதலாளிகள் மட்டும்"
    )
    override val masterControlNames = listOf(
        "1. முழு செயலி & பராமரிப்பு முறை",
        "2. தொழிலாளர் பதிவு",
        "3. முதலாளி பதிவு",
        "4. வேலை பதிவிடுதல்",
        "5. வேலை தேடல்",
        "6. தினக்கூலி வேலைகள்",
        "7. மாத சம்பள வேலைகள்",
        "8. நாணயம் வாங்குதல்",
        "9. வாலட் பணம் எடுத்தல்",
        "10. வேலை கட்டணம் & நாணய விலை",
        "11. சலுகைகள் & விளம்பரங்கள்",
        "12. பரிந்துரை வெகுமதிகள்",
        "13. அறிவிப்புகள் & நிர்வாகச் செய்திகள்",
        "14. தொழிலாளர் & முதலாளி கணக்கு கட்டுப்பாடு",
        "15. வேலை வகைகள் & துணை வகைகள்",
        "16. மதிப்பீடு & தானியங்கி பேட்ஜ்கள்",
        "17. மூப்பு & விசுவாச உதவி",
        "18. அவசர & தொழிலாளர் பாதுகாப்பு அமைப்பு",
        "19. SMS எச்சரிக்கைகள்",
        "20. IVR சேவைகள்",
        "21. மொழி அமைப்புகள் (12 மொழிகள்)",
        "22. நாடு, மாநிலம் & நகர கிடைப்பு",
        "23. VIP ID முன்பதிவு & மேலாண்மை",
        "24. அறிக்கைகள், புகார்கள் & கட்டுப்பாடு",
        "25. பணம் செலுத்தும் நுழைவாயில் இணைப்பு"
    )
    override val publishNoticeTitle = "சிவப்பு LOBORO நிர்வாக அறிவிப்பு வெளியிடு"
    override val announcementMessageLabel = "அறிவிப்பு செய்தி"
    override val announcementPlaceholder = "எ.கா. வெளிமாநில தொழிலாளர்களுக்கான புதிய பாதுகாப்பு உதவி எண்"
    override val actionLinkLabel = "பொத்தான் பெயர்"
    override val scopeFieldLabel = "பகுதி / மாநில வரம்பு"
    override val audienceOptions = listOf("அனைத்து பயனர்கள்", "தொழிலாளர்கள்", "முதலாளிகள்")
    override val broadcastNoticeBtn = "சிவப்பு நிர்வாக அறிவிப்பு அனுப்பு"
    override val confirmBroadcastTitle = "சிவப்பு LOBORO நிர்வாக அறிவிப்பு அனுப்பவா?"
    override val confirmBroadcastDescFormat = "செய்தி: %1\$s\nபயனர்கள்: %2\$s · பகுதி: %3\$s"
    override val coinPricingTitle = "நாணய விலை & கட்டண கட்டுப்பாடுகள்"
    override val coinPricingSummaryFormat = "1 நாணயம் = ₹%1\$d · தினசரி = %2\$d நாணயம் · சிறப்பு = %3\$d நாணயங்கள் · மாதாந்திர = %4\$d நாணயங்கள் · நேரம்: %5\$s"
    override val dailyBtnFormat = "தினசரி +1 (%1\$d)"
    override val masonBtnFormat = "சிறப்பு +1 (%1\$d)"
    override val monthlyBtnFormat = "மாதாந்திர +5 (%1\$d)"
    override val protectedVipIdsTitle = "பாதுகாக்கப்பட்ட VIP & உரிமையாளர் IDகள் (தானாக வழங்கப்படாது)"
    override val protectedVipIdsNote = "சாதாரண பயனர்களுக்கு எப்போதும் LB2000+ வழங்கப்படும். சிறப்பு எண்கள் உரிமையாளருக்கு மட்டுமே."
    override val safetyInvestigationTitle = "பாதுகாப்பு வழக்கு & புகார் விசாரணை மையம்"
    override val manageCategoriesTitle = "24 வேலை வகைகள் மேலாண்மை (உடனடி ON/OFF)"
    override val showAll24Label = "அனைத்து 24 காட்டு"
    override val showLessLabel = "குறைவாகக் காட்டு"
    override val auditLogTitle = "உரிமையாளர் செயல் தணிக்கை பதிவு"
    override val confirmToggleTitleFormat = "%1\$s உறுதி செய்க"
    override val confirmToggleDescFormat = "%3\$s க்கு \"%1\$s\" ஐ %2\$s செய்யவா? நிதிப் பொறுப்புகள் மற்றும் 112 பாதுகாப்பு சேவைகள் பாதுகாக்கப்படும்."

    override val categories = mapOf(
        JobCategoryId.MASON to "கொத்தனார் / மேஸ்திரி",
        JobCategoryId.CONSTRUCTION_LABOUR to "கட்டுமான தொழிலாளர்",
        JobCategoryId.GENERAL_LABOUR to "பொதுத் தொழிலாளர்",
        JobCategoryId.PLUMBER to "பிளம்பர்",
        JobCategoryId.ELECTRICIAN to "எலக்ட்ரீஷியன்",
        JobCategoryId.PAINTER to "பெயிண்டர்",
        JobCategoryId.TILE_WORKER to "டைல்ஸ் தொழிலாளி",
        JobCategoryId.CARPENTER to "தச்சர் / கார்பெண்டர்",
        JobCategoryId.WELDER to "வெல்டர்",
        JobCategoryId.HOTEL_STAFF to "ஹோட்டல் ஊழியர்",
        JobCategoryId.COOK to "சமையல்காரர்",
        JobCategoryId.WAITER to "பரிமாறுபவர் / வெயிட்டர்",
        JobCategoryId.HOUSEKEEPING to "ஹவுஸ்கீப்பிங்",
        JobCategoryId.SECURITY_GUARD to "பாதுகாப்பு காவலர்",
        JobCategoryId.DRIVER to "ஓட்டுநர்",
        JobCategoryId.DELIVERY_WORKER to "டெலிவரி ஊழியர்",
        JobCategoryId.FACTORY_WORKER to "தொழிற்சாலை தொழிலாளி",
        JobCategoryId.PACKING_WORKER to "பேக்கிங் தொழிலாளி",
        JobCategoryId.MACHINE_OPERATOR to "இயந்திர ஆபரேட்டர்",
        JobCategoryId.AGRICULTURE_WORKER to "விவசாயத் தொழிலாளி",
        JobCategoryId.OFFICE_ASSISTANT to "அலுவலக உதவியாளர்",
        JobCategoryId.SHOP_STAFF to "கடை ஊழியர்",
        JobCategoryId.DOMESTIC_WORKER to "வீட்டு வேலை உதவியாளர்",
        JobCategoryId.OTHER_JOBS to "மற்ற வேலைகள்"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "தொழிலாளி",
        UserRole.EMPLOYER to "முதலாளி",
        UserRole.OWNER_SUPER_ADMIN to "உரிமையாளர் / சூப்பர் அட்மின்"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "விண்ணப்பித்தது",
        ApplicationStatus.UNDER_REVIEW to "பரிசீலனையில்",
        ApplicationStatus.SHORTLISTED to "தேர்வுப் பட்டியலில்",
        ApplicationStatus.ACCEPTED to "ஏற்கப்பட்டது",
        ApplicationStatus.REJECTED to "நிராகரிக்கப்பட்டது",
        ApplicationStatus.WITHDRAWN to "திரும்பப் பெறப்பட்டது",
        ApplicationStatus.COMPLETED to "முடிந்தது"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "நிலுவையில்",
        TransactionStatus.SUCCESSFUL to "வெற்றி",
        TransactionStatus.FAILED to "தோல்வி",
        TransactionStatus.REFUNDED to "திரும்பப் பெற்றது"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "நாணயம் வாங்குதல்",
        TransactionType.GIFT to "பரிசு வரவு",
        TransactionType.PROMO to "சலுகை வரவு",
        TransactionType.REFERRAL to "பரிந்துரை போனஸ்",
        TransactionType.BADGE_REWARD to "பேட்ஜ் வெகுமதி",
        TransactionType.LOYALTY_SUPPORT to "விசுவாச உதவி",
        TransactionType.JOB_FEE to "வேலை கட்டணம்",
        TransactionType.WITHDRAWAL to "பணம் எடுத்தல்"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "நிலுவை சம்பளம் / கூலி",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "உடல் ரீதியான துன்புறுத்தல்",
        SafetyComplaintCategory.HARASSMENT to "தொந்தரவு",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "உணவு / தங்குமிட பிரச்சனை",
        SafetyComplaintCategory.FRAUD to "வேலை மோசடி",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "பாதுகாப்பற்ற பணியிடம்",
        SafetyComplaintCategory.OTHER_EMERGENCY to "பிற அவசர நிலை"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "புதியது",
        SafetyCaseStatus.IN_REVIEW to "ஆய்வில்",
        SafetyCaseStatus.ADMIN_VERIFIED to "நிர்வாகம் சரிபார்த்தது",
        SafetyCaseStatus.ACTION_TAKEN to "நடவடிக்கை எடுக்கப்பட்டது",
        SafetyCaseStatus.REFERRED to "பரிந்துரைக்கப்பட்டது",
        SafetyCaseStatus.CLOSED to "மூடப்பட்டது"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "தொடக்க நிலை",
        BadgeLevel.SILVER to "வெள்ளி (Silver)",
        BadgeLevel.GOLD to "தங்கம் (Gold)",
        BadgeLevel.DIAMOND to "வைரம் (Diamond)",
        BadgeLevel.PLATINUM to "பிளாட்டினம்"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "வேலை பதிவிடும்போது",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "சரிபார்க்கப்பட்ட தொடர்பில்",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "விண்ணப்பம் ஏற்கும்போது"
    )
    override val indianStates = mapOf(
        "All States" to "அனைத்து மாநிலங்களும்",
        "Telangana" to "தெலுங்கானா",
        "Andhra Pradesh" to "ஆந்திரப் பிரதேசம்",
        "Tamil Nadu" to "தமிழ்நாடு",
        "Karnataka" to "கர்நாடகா",
        "Maharashtra" to "மகாராஷ்டிரா",
        "Gujarat" to "குஜராத்",
        "Assam" to "அசாம்",
        "Bihar" to "பீகார்",
        "Uttar Pradesh" to "உத்தரப் பிரதேசம்",
        "West Bengal" to "மேற்கு வங்காளம்",
        "Odisha" to "ஒடிசா",
        "Kerala" to "கேரளா",
        "Punjab" to "பஞ்சாப்"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "கிளவுட் தரவுத்தளம் & பாதுகாப்பு விதிகள்",
        "otp_sms" to "OTP & SMS சேவை",
        "payment_gateway" to "UPI & நாணய கட்டண நுழைவாயில்",
        "face_liveness" to "முகப் பொருத்தம் & உயிர்ப்பு சோதனை",
        "translation" to "நேரடி 12-மொழி வேலை மொழிபெயர்ப்பு",
        "telecom_ivr" to "கீபேட் போன் மிஸ்டு-கால் & IVR",
        "owner_pin_auth" to "உரிமையாளர் பூட்ஸ்ட்ராப் & 4-இலக்க PIN சர்வர்"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "இணைக்கப்படவில்லை",
        IntegrationStatus.NEEDS_CREDENTIALS to "சாவிகள் தேவை",
        IntegrationStatus.CONNECTED to "இணைக்கப்பட்டது"
    )

    override val msgOwnerPrivilegeBlocked = "அனுமதி இல்லை: பொதுப் பயனர்கள் ஒருபோதும் உரிமையாளர் / சூப்பர் அட்மின் ஆக முடியாது."
    override val msgSwitchedPreviewFormat = "முன்னோட்ட கணக்கு %1\$s (%2\$s) ஆக மாற்றப்பட்டது."
    override val msgLanguageSavedFormat = "மொழி %1\$s (%2\$s) ஆக அமைக்கப்பட்டது"
    override val msgEnterNameBeforeOtp = "OTP கோரும் முன் உங்கள் முழுப் பெயரை உள்ளிடவும்."
    override val msgEnterValidMobile = "சரியான 10-இலக்க இந்திய மொபைல் எண்ணை உள்ளிடவும்."
    override val msgOtpDispatchedFormat = "சர்வர் OTP %1\$s க்கு அனுப்பப்பட்டது. உங்கள் போனில் வந்த குறியீட்டை உள்ளிடவும்."
    override val msgUnableSendOtp = "OTP அனுப்ப முடியவில்லை. பின்தள URL அல்லது இணையத்தைச் சரிபார்க்கவும்."
    override val msgSendOtpAndEnterCode = "முதலில் OTP அனுப்பி 4–6 இலக்க குறியீட்டை உள்ளிடவும்."
    override val msgOtpVerifiedCreateFormat = "மொபைல் OTP சரிபார்க்கப்பட்டது! விவரங்களை நிரப்பி %1\$s சுயவிவரம் உருவாக்கு அழுத்தவும்."
    override val msgIncorrectOtp = "தவறான அல்லது காலாவதியான OTP. புதிய OTP கோரவும்."
    override val msgServerOtpUnavailable = "சர்வர் OTP சேவை இல்லை. நேரடி பின்தளத்தை இணைக்கவும்."
    override val msgEnterFullName = "முழுப் பெயர் கட்டாயம்."
    override val msgVerifyMobileOtpFirst = "முதலில் உங்கள் மொபைல் எண்ணை OTP மூலம் சரிபார்க்கவும்."
    override val msgAccountCreatedFormat = "நல்வரவு %1\$s! %2\$s கணக்கு உருவாக்கப்பட்டது (%3\$s)."
    override val msgLoggedInFormat = "%1\$s (%2\$s) ஆக உள்நுழைந்துள்ளீர்கள்"
    override val msgSignedOut = "பயனர் கணக்கிலிருந்து வெளியேறினீர்கள்."
    override val msgDuplicateOwnerBlocked = "பாதுகாப்புத் தடை: உரிமையாளர் கணக்கு ஏற்கனவே உள்ளது. புதிய உரிமையாளர் உருவாக்க முடியாது."
    override val msgBootstrapRequired = "சர்வர் பூட்ஸ்ட்ராப் அங்கீகாரக் குறியீட்டை உள்ளிடவும்."
    override val msgEnterPasswords = "உரிமையாளர் கடவுச்சொல்லை உள்ளிட்டு உறுதி செய்யவும்."
    override val msgPasswordsDoNotMatch = "கடவுச்சொற்கள் பொருந்தவில்லை."
    override val msgPasswordTooShort = "கடவுச்சொல் குறைந்தது 8 எழுத்துக்கள் இருக்க வேண்டும்."
    override val msgPinFourDigits = "அட்மின் PIN சரியாக 4 இலக்கங்கள் இருக்க வேண்டும்."
    override val msgPinsDoNotMatch = "4-இலக்க PIN உறுதிப்படுத்தல் பொருந்தவில்லை."
    override val msgOwnerCreatedFormat = "%1\$s க்கான உரிமையாளர் சுயவிவரம் உருவாக்கப்பட்டது. இனி புதிய உரிமையாளர் பதிவு நிரந்தரமாக மூடப்பட்டது."
    override val msgOwnerLockedSession = "உரிமையாளர் அமர்வு பூட்டப்பட்டது."
    override val msgOwnerTimedOut = "5 நிமிட செயலற்றதால் உரிமையாளர் அமர்வு முடிந்தது. மீண்டும் PIN உள்ளிடவும்."
    override val msgOwnerUnlocked = "உரிமையாளர் மாஸ்டர் கட்டுப்பாடு திறக்கப்பட்டது."
    override val msgInvalidPinAttemptsFormat = "தவறான 4-இலக்க உரிமையாளர் PIN. இன்னும் %1\$d முயற்சி(கள்)."
    override val msgTooManyPinAttemptsFormat = "பல தவறான முயற்சிகள். %1\$d வினாடிகளுக்கு பூட்டப்பட்டது."
    override val msgOwnerSessionRequired = "செயலில் உள்ள உரிமையாளர் அமர்வு தேவை."
    override val msgVerifyOtpBeforePinChange = "முதலில் பதிவுசெய்யப்பட்ட மொபைலுக்கு வந்த OTP ஐ சரிபார்க்கவும்."
    override val msgPinUpdatedSuccess = "புதிய அட்மின் PIN சர்வரில் பாதுகாப்பாக புதுப்பிக்கப்பட்டது."
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) க்கான டெமோ சுயவிவரம் புதுப்பிக்கப்பட்டது"
    override val msgJobPostedFormat = "%1\$s இல் டெமோ வேலை பதிவிடப்பட்டது! கட்டணம்: %2\$d நாணயம்."
    override val msgAlreadyAppliedFormat = "%1\$s க்கு ஏற்கனவே விண்ணப்பித்துள்ளீர்கள்"
    override val msgApplicationSentFormat = "%1\$s க்கு விண்ணப்பம் அனுப்பப்பட்டது"
    override val msgApplicationWithdrawnFormat = "விண்ணப்பம் %1\$s திரும்பப் பெறப்பட்டது"
    override val msgApplicationUpdatedFormat = "விண்ணப்பம் %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "வாராந்திர சோதனை பதிவு: 1 · நான் பாதுகாப்பாக உள்ளேன்."
    override val msgCheckInProblemRecorded = "எச்சரிக்கை பதிவு (2 · பிரச்சனை). பாதுகாப்பு மையத்திற்கு தெரிவிக்கப்பட்டது."
    override val msgCheckInAdminRequested = "அவசர நிர்வாகி திரும்ப அழைப்பு கோரப்பட்டது (3). குடும்ப எச்சரிக்கை வரிசையில் உள்ளது."
    override val msgSafetyComplaintSubmittedFormat = "பாதுகாப்பு வழக்கு %1\$s பதிவு செய்யப்பட்டது."
    override val msgWithdrawalsFrozen = "அவசர தடை செயலில்: அனைத்து பணம் எடுப்புகளும் உடனடியாக பூட்டப்பட்டன."
    override val msgWithdrawalsUnfrozen = "சரிபார்ப்பிற்குப் பிறகு பணம் எடுப்பு திறக்கப்பட்டது."
    override val msgOwnerNoticePublished = "சிவப்பு LOBORO நிர்வாக அறிவிப்பு வெளியிடப்பட்டது."
}
