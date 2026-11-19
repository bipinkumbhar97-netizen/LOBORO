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

object HindiStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "ग्लोबल जॉब और सेवा"
    override val demoPreviewBanner = "डेमो प्रीव्यू डेटा · लाइव उपयोग के लिए सेटिंग्स में बैकएंड API जोड़ें"
    override val verifiedNormalAccountBanner = "सत्यापित उपयोगकर्ता खाता · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO एडमिन सूचना"
    override val maintenanceModeBanner = "मेंटेनेंस मोड चालू है · काम और वॉलेट अस्थायी रूप से रुके हैं। आपातकालीन 112 और सुरक्षा सेवा चालू है।"
    override val navHome = "होम"
    override val navSearchJobs = "काम खोजें"
    override val navPostJob = "काम डालें"
    override val navWallet = "वॉलेट"
    override val navMyApplications = "मेरे आवेदन"
    override val navMyJobs = "मेरे काम"
    override val navNotifications = "सूचनाएं"
    override val navHelpSafety = "मदद और सुरक्षा"
    override val navProfile = "प्रोफ़ाइल"
    override val navSettings = "सेटिंग्स"
    override val navAdmin = "मालिक नियंत्रण"
    override val navBadgesLoyalty = "बैज और लॉयल्टी"
    override val navIvrKeypad = "कीपैड व कॉल"
    override val backLabel = "पीछे"
    override val homeLabel = "होम"
    override val languageLabel = "भाषा"
    override val languageSelectorTitle = "12 भाषाएं"
    override val activeBadgeLabel = "सक्रिय"
    override val closeLabel = "बंद करें"
    override val okLabel = "ठीक है"
    override val understoodLabel = "समझ गया"
    override val cancelLabel = "रद्द करें"
    override val doneLabel = "हो गया"
    override val confirmActionLabel = "पुष्टि करें"
    override val resetLabel = "रीसेट"
    override val sendLabel = "भेजें"

    override val shareAppTitle = "LOBORO ऐप शेयर करें"
    override val shareAppCta = "दोस्तों को शेयर करें और इनाम पाएं"
    override val yourReferralLinkLabel = "आपका रेफरल लिंक"
    override val loboroLinkLabel = "LOBORO लिंक"
    override val shareMenuButton = "शेयर मेनू"
    override val copyLinkButton = "लिंक कॉपी करें"
    override val referralCopiedToast = "रेफरल संदेश कॉपी हो गया"
    override val openingShareMenuToast = "शेयर मेनू खुल रहा है"
    override val shareMessageTemplate = "LOBORO ग्लोबल जॉब और सेवा से जुड़ें! पूरे भारत में दैनिक मजदूरी या मासिक सैलरी का काम पाएं। मेरा रेफरल ID %1\$s उपयोग करें: %2\$s"

    override val registerWorkerEmployerCta = "मज़दूर / नियोक्ता के रूप में पंजीकरण करें"
    override val logInLabel = "लॉग इन"
    override val signOutLabel = "साइन आउट"
    override val voiceSearchHint = "काम या शहर बोलें या लिखें (जैसे: हैदराबाद में राजमिस्त्री)"
    override val tapMicToSpeak = "बोलकर काम खोजने के लिए माइक दबाएं"
    override val listeningStatus = "सुन रहे हैं... अपना काम बोलें"
    override val stopListening = "सुनना बंद करें"
    override val searchAction = "खोजें"
    override val retryVoice = "फिर से बोलें"
    override val voiceMicPermissionNeeded = "माइक अनुमति केवल आपके माइक बटन दबाने पर ही माँगी जाती है।"
    override val voiceUnavailableHonest = "इस डिवाइस में स्पीच पहचान सेवा उपलब्ध नहीं है। क्लाउड स्पीच सेवा जोड़ें या नीचे दिए विकल्प चुनें।"
    override val voiceNoMatchError = "आवाज़ स्पष्ट नहीं मिली। कृपया साफ बोलें या नीचे दिए नमूने चुनें।"
    override val voiceNetworkError = "नेटवर्क त्रुटि। इंटरनेट जांचें या काम का नाम लिखें।"
    override val voiceStoppedError = "वॉइस इनपुट रुक गया (कोड %1\$d)। टाइप करें या फिर प्रयास करें।"
    override val voicePrivacyHint = "गोपनीयता: माइक सामान्यतः बंद रहता है और केवल आपके बटन दबाने पर ही चालू होता है।"
    override val clearSearchDesc = "खोज साफ करें"
    override val spokenSamples = listOf(
        "हैदराबाद में राजमिस्त्री" to "Mason",
        "पुणे में इलेक्ट्रीशियन" to "Electrician",
        "चेन्नई होटल कुक" to "Cook",
        "विजयवाड़ा ड्राइवर" to "Driver",
        "सूरत पैकिंग काम" to "Packing"
    )
    override val dailyJobsTitle = "रोज़ का काम (Daily)"
    override val dailyJobsSubtitle = "दैनिक मजदूरी · मासिक काम से अलग सूची"
    override val monthlyJobsTitle = "महीने की सैलरी वाला काम"
    override val monthlyJobsSubtitle = "निश्चित मासिक वेतन · छुट्टी व रहने की जानकारी"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "काम की श्रेणियाँ (24)"
    override val walletStripSummaryFormat = "%1\$d कॉइन (₹%2\$d) · 100%% निकासी योग्य"

    override val outOfStateTitle = "दूसरे राज्य में काम खोजें"
    override val willingToRelocate = "दूसरे राज्य में जाने के लिए तैयार"
    override val filterCountry = "देश"
    override val filterState = "राज्य"
    override val filterDistrict = "जिला"
    override val filterCity = "शहर"
    override val filterDistance = "दूरी"
    override val upToKmFormat = "%1\$d किमी तक"
    override val filterFoodIncluded = "खाना मिलेगा"
    override val filterAccommodation = "रहने की जगह"
    override val allCategoriesLabel = "सभी श्रेणियाँ"
    override val noMatchingJobsTitle = "फ़िल्टर के अनुसार कोई काम नहीं मिला"
    override val noMatchingJobsSubtitle = "फ़िल्टर रीसेट करें या 'दूसरे राज्य में काम' चालू करें।"
    override val showAllJobsButton = "सभी काम दिखाएं"
    override val dailyWageJobBadge = "दैनिक मजदूरी का काम"
    override val monthlySalaryJobBadge = "मासिक वेतन का काम"
    override val demoDataTag = "डेमो"
    override val originalLangFormat = "मूल भाषा: %1\$s"
    override val preTranslatedPreviewNote = "प्री-ट्रांसलेटेड प्रीव्यू सक्रिय है। लाइव उपयोग के लिए सेटिंग्स में ट्रांसलेशन API की जोड़ें।"
    override val configureTranslationApiNote = "सभी 12 भाषाओं में लाइव काम अनुवाद के लिए सेटिंग्स में ट्रांसलेशन API की जोड़ें।"
    override val translatedToggle = "अनुवादित"
    override val originalToggle = "मूल"
    override val compensationLabel = "वेतन / मजदूरी"
    override val locationLabel = "स्थान"
    override val employerLabel = "नियोक्ता"
    override val vacanciesUnit = "पद"
    override val perDayFormat = "₹%1\$d / दिन"
    override val perMonthFormat = "₹%1\$d / माह"
    override val coinsCountFormat = "%1\$d कॉइन"
    override val foodBadge = "खाना"
    override val stayBadge = "कमरा"
    override val shareJobButton = "काम शेयर करें"
    override val applyNow = "आवेदन करें"
    override val saveJob = "सेव करें"
    override val negotiateChat = "बातचीत / चैट"
    override val reportJob = "शिकायत करें"
    override val foodAvailable = "खाना शामिल"
    override val accommodationAvailable = "रहना शामिल"
    override val notProvided = "शामिल नहीं"
    override val workersNeeded = "जरूरी मज़दूर"
    override val workHoursLabel = "काम के घंटे"
    override val overtimeLabel = "ओवरटाइम"
    override val paymentFreqLabel = "भुगतान"
    override val weeklyHolidayLabel = "साप्ताहिक छुट्टी"
    override val leavePolicyLabel = "छुट्टी नियम"
    override val joiningDateLabel = "जॉइनिंग तिथि"
    override val expiryLabel = "समाप्ति"
    override val translatedBadgeLabel = "अनुवादित"

    override val postingPausedFormat = "काम पोस्ट करना वर्तमान में मालिक नियंत्रण (%1\$s) द्वारा रोका गया है।"
    override val selectCategoryLabel = "श्रेणी चुनें (24 श्रेणियाँ)"
    override val jobTitleLabel = "काम का शीर्षक"
    override val jobTitlePlaceholder = "जैसे: हॉस्टल निर्माण के लिए 4 राजमिस्त्री चाहिए"
    override val jobDescLabel = "काम का विवरण"
    override val jobDescPlaceholder = "काम की जानकारी, सुरक्षा उपकरण, खाना व रहने की सुविधा"
    override val dailyWageInrLabel = "दैनिक मजदूरी (₹)"
    override val monthlySalaryInrLabel = "मासिक वेतन (₹)"
    override val vacanciesLabel = "कुल पद"
    override val cityTownLabel = "शहर / कस्बा"
    override val stateLabel = "राज्य"
    override val transparentJobFeeTitle = "पारदर्शी जॉब शुल्क: %1\$d कॉइन (₹%2\$d)"
    override val configuredByOwnerSub = "मालिक द्वारा तय · शुल्क समय: %1\$s · उपलब्ध: %2\$d कॉइन"
    override val confirmAndPostJobButton = "पुष्टि करें और काम डालें (%1\$d कॉइन)"

    override val walletBalanceTitle = "LOBORO कॉइन बैलेंस"
    override val withdrawableValueFormat = "₹%1\$d निकासी मूल्य (1 कॉइन = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% समान निकासी नियम"
    override val withdrawableRuleBody = "खरीदे गए, गिफ्ट, ऑफर, रेफरल, बैज या लॉयल्टी के सभी कॉइन समान नकद मूल्य और पूर्ण निकासी के योग्य हैं। कोई लॉक कॉइन नहीं।"
    override val buyCoins = "कॉइन खरीदें"
    override val withdrawCoins = "निकासी करें"
    override val walletActionsPausedNote = "कुछ वॉलेट सेवाएं मालिक द्वारा रोकी गई हैं। आपका मौजूदा बैलेंस और स्वीकृत रिफंड सुरक्षित हैं।"
    override val coinPackagesTitle = "कॉइन पैकेज (पारदर्शी मूल्य)"
    override val bankSecurityTitle = "बैंक / UPI और फेस वेरिफिकेशन सुरक्षा"
    override val payoutDestinationLabel = "सत्यापित भुगतान खाता: %1\$s"
    override val bankSecurityStepsNote = "बैंक/UPI बदलने की अनिवार्य जांच: पंजीकृत मोबाइल OTP + लाइव सेल्फी मिलान + अस्थायी भुगतान रोक।"
    override val changeBankUpiButton = "बैंक / UPI बदलें (OTP + फेस जांच)"
    override val unfreezePayoutsButton = "निकासी अनलॉक करें"
    override val lostPhoneFreezeButton = "फोन खो गया? निकासी तुरंत रोकें"
    override val payoutFreezeActiveNote = "निकासी लॉक सक्रिय है। पहचान सत्यापन तक कोई भी भुगतान नहीं होगा।"
    override val transactionHistory = "कॉइन लेनदेन रिकॉर्ड"
    override val demoLedgerSuffix = "(डेमो खाता बही)"
    override val buyCoinsDialogTitleFormat = "%1\$d कॉइन खरीदें (₹%2\$d)"
    override val paymentNotConnectedBody = "लाइव Razorpay / Cashfree UPI भुगतान अभी जुड़ा नहीं है। असली लेनदेन से पहले प्रोडक्शन की और वेबहुक सत्यापन जोड़ें।"
    override val withdrawDialogTitleFormat = "₹%1\$d निकासी"
    override val withdrawDialogBodyFormat = "पूरा बैलेंस (%1\$d कॉइन) समान नकद मूल्य के साथ 100%% निकासी योग्य है।\nखाता: %2\$s\n\nइस बिल्ड में लाइव IMPS / UPI गेटवे जुड़ा नहीं है।"
    override val bankChangeDialogTitle = "3-चरणीय बैंक / UPI बदलाव सुरक्षा"
    override val bankChangeDialogBody = "फोन चोरी या खोने पर सुरक्षा के लिए बैंक/UPI बदलने हेतु जरूरी है:\n1. पंजीकृत मोबाइल OTP जांच\n2. पंजीकरण फोटो से लाइव चेहरा मिलान\n3. भुगतान से पहले सुरक्षा प्रतीक्षा समय"
    override val receiptDialogTitle = "लेनदेन रसीद"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "संदर्भ: %1\$s"
    override val receiptTypeLabel = "प्रकार: %1\$s"
    override val receiptCoinsLabel = "कॉइन: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "स्थिति: %1\$s"
    override val receiptTimeLabel = "समय: %1\$s"
    override val receiptWithdrawableYes = "निकासी पात्रता: 100% हाँ"

    override val employerAppsHeading = "आवेदन और सीधी बातचीत"
    override val secureChatHeading = "सुरक्षित मज़दूर ↔ नियोक्ता चैट"
    override val secureChatSubtitle = "जब तक आप स्वयं न चुनें, मोबाइल नंबर छिपा रहता है। खोलने या ब्लॉक करने के लिए चैट पर टैप करें।"
    override val chatButton = "चैट"
    override val workerEmployerLineFormat = "मज़दूर: %1\$s (%2\$s) · नियोक्ता: %3\$s"
    override val shortlistButton = "शॉर्टलिस्ट"
    override val acceptButton = "स्वीकार करें"
    override val withdrawButton = "वापस लें"
    override val phoneHiddenPrivacy = "गोपनीयता सक्रिय: दोनों पक्षों की सहमति के बिना फोन नंबर छिपा रहेगा।"
    override val blockUserLabel = "ब्लॉक"
    override val userBlockedNotice = "आपने यह चैट ब्लॉक की है। समस्या होने पर सुरक्षा डेस्क पर शिकायत करें।"
    override val chatPlaceholder = "अपनी भाषा में संदेश लिखें..."

    override val automaticBadgePrefix = "ऑटोमैटिक बैज: %1\$s"
    override val badgeStatsFormat = "रेटिंग %1\$.1f ★ · %2\$d सत्यापित कार्यदिवस · %3\$d पूर्ण काम"
    override val progressToFormat = "%1\$s बैज की प्रगति: %2\$d / %3\$d दिन"
    override val badgeAntiAbuseNote = "बैज केवल वास्तविक पूर्ण काम, सत्यापित उपस्थिति और निष्पक्ष रेटिंग से मिलते हैं — इन्हें खरीदा नहीं जा सकता।"
    override val badgeTiersTitle = "5 ऑटोमैटिक बैज स्तर"
    override val minWorkdaysFormat = "न्यूनतम %1\$d कार्यदिवस · न्यूनतम %2\$.1f★ रेटिंग"
    override val badgeAppealsNote = "निष्पक्ष सुरक्षा: अचानक संदिग्ध 1-स्टार रेटिंग की शिकायत पर समीक्षा की जाती है।"
    override val loyaltyTitle = "वरिष्ठता और लॉयल्टी वित्तीय सहायता"
    override val loyaltySubtitle = "पारदर्शी त्रैमासिक कल्याण एवं माइलस्टोन बोनस"
    override val loyaltyDisclaimer = "अनिवार्य सूचना: यह बीमा नहीं है और न ही निश्चित मासिक पेंशन है। यह पात्रता, सत्यापित कार्यदिवस, बजट और प्रबंधन स्वीकृति पर निर्भर है।"
    override val loyaltyMinMembershipFormat = "न्यूनतम सदस्यता: %1\$d माह"
    override val loyaltyWorkdaysFormat = "सत्यापित कार्यदिवस: %1\$d+ दिन"
    override val loyaltyRequiredBadgeFormat = "आवश्यक बैज: %1\$s+"
    override val loyaltyRequiredRatingFormat = "न्यूनतम रेटिंग: %1\$.1f★"
    override val loyaltyBudgetFormat = "स्वीकृत सहायता: ₹%1\$d · बजट पूल: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "मज़दूर सुरक्षा और आपातकालीन मदद"
    override val callEmergency112 = "आपातकालीन 112 पर कॉल करें"
    override val weeklyCheckInTitle = "साप्ताहिक सुरक्षा जांच"
    override val weeklyCheckInQuestion = "क्या आप सुरक्षित हैं?"
    override val checkInOpt1 = "1 · मैं सुरक्षित हूँ"
    override val checkInOpt2 = "2 · मुझे समस्या है"
    override val checkInOpt3 = "3 · LOBORO एडमिन से बात करें"
    override val reportSafetyIssue = "सुरक्षा / वेतन शिकायत दर्ज करें"
    override val safetyOperationalNote = "भुगतान या जॉब पोस्टिंग बंद होने पर भी सुरक्षा सेवा हमेशा चालू रहती है।"
    override val safetyDisclaimerNote = "तत्काल खतरे में सीधे 112 पर कॉल करें। LOBORO निष्पक्ष मध्यस्थता के लिए सुरक्षा व वेतन शिकायतें दर्ज करता है।"
    override val everyDaysFormat = "हर %1\$d दिन में"
    override val lastStatusFormat = "पिछली जांच: %1\$s"
    override val checkInNoResponseNote = "लगातार 2 जांच छूटने या समस्या चुनने पर LOBORO एसएमएस, एडमिन समीक्षा और सहमति से परिवार को सूचना भेजता है।"
    override val consentEmergencyTitle = "सहमति-आधारित आपातकालीन लोकेशन व परिवार संपर्क"
    override val workerIdLabel = "मज़दूर ID: %1\$s"
    override val homeOriginLabel = "मूल निवास: %1\$s, %2\$s"
    override val currentJobCityLabel = "वर्तमान कार्य शहर: %1\$s"
    override val emergencyContactLabel = "आपातकालीन संपर्क: %1\$s (%2\$s)"
    override val consentGranted = "सहमति प्राप्त"
    override val consentPending = "सहमति लंबित"
    override val employerLoboroIdInput = "नियोक्ता LOBORO ID (जैसे LB819)"
    override val currentSiteInput = "वर्तमान कार्य शहर / साइट"
    override val describeIssueInput = "सुरक्षा या मजदूरी की समस्या लिखें"
    override val submitSafetyDeskButton = "सुरक्षा डेस्क को भेजें"
    override val safetyCasesHeading = "हालिया सुरक्षा मामले (ऑडिट योग्य)"
    override val ivrTitle = "कीपैड फोन मिस्ड-कॉल व IVR मेनू"
    override val ivrSubtitle = "बिना स्मार्टफोन के टोल-फ्री / मिस्ड-कॉल कॉलबैक से काम करता है"
    override val ivrArchNote = "लाइव सिस्टम Exotel / Knowlarity / Twilio Voice से जुड़ता है। 12-भाषा वॉइस मेनू जांचने के लिए बटन दबाएं।"
    override val ivrMenuTitle = "LOBORO वॉइस IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO में आपका स्वागत है! वॉइस मेनू सुनने के लिए कीपैड नंबर दबाएं।"
    override val pressKeyFormat = "%1\$s दबाएं → %2\$s"
    override val ivrSelectedSummaryFormat = "चुना गया [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "आज के दैनिक मजदूरी काम",
        "2" to "महीने की सैलरी वाले काम",
        "3" to "साप्ताहिक सुरक्षा जांच ('क्या आप सुरक्षित हैं?')",
        "4" to "वॉलेट कॉइन और अंतिम स्थिति सुनें",
        "5" to "आपातकालीन एडमिन कॉलबैक",
        "6" to "आवेदन की स्थिति जांचें",
        "0" to "पसंदीदा वॉइस भाषा बदलें"
    )

    override val userRegTitle = "मज़दूर व नियोक्ता पंजीकरण"
    override val userLoginTitle = "मज़दूर व नियोक्ता लॉग इन"
    override val userAuthSubtitle = "OTP-सत्यापित सामान्य उपयोगकर्ता खाता · गुप्त मालिक प्रणाली से पूर्णतः अलग"
    override val registerTab = "पंजीकरण"
    override val loginTab = "लॉग इन"
    override val dbOtpNotConnectedTitle = "बैकएंड डेटाबेस / OTP जुड़ा नहीं है"
    override val dbOtpNotConnectedBody = "लाइव मज़दूर व नियोक्ता खाते सहेजने के लिए सेटिंग्स में LOBORO_BACKEND_URL जोड़ें।"
    override val selectAccountTypeStep = "1. खाता प्रकार चुनें"
    override val workerAccountLabel = "मज़दूर"
    override val employerAccountLabel = "नियोक्ता"
    override val regPausedForRoleFormat = "%1\$s पंजीकरण वर्तमान में मालिक द्वारा रोका गया है।"
    override val preferredLanguageLabel = "पसंदीदा ऐप भाषा (12 भाषाएं)"
    override val fullNameStepLabel = "2. पूरा नाम *"
    override val businessNameStepLabel = "2. व्यवसाय / ठेकेदार का पूरा नाम *"
    override val mobileStepLabel = "3. मोबाइल नंबर (10 अंक) *"
    override val sendRegOtpButton = "OTP भेजें"
    override val resendMobileOtpButton = "OTP फिर भेजें"
    override val enterOtpStepLabel = "4. मोबाइल OTP दर्ज करें *"
    override val verifyOtpButton = "OTP सत्यापित करें"
    override val verifiedLabel = "सत्यापित"
    override val mobileVerifiedNote = "सर्वर पर मोबाइल सत्यापित"
    override val homeStateLabel = "मूल राज्य"
    override val homeDistrictLabel = "मूल जिला"
    override val stateShortLabel = "राज्य"
    override val cityShortLabel = "शहर"
    override val workCityStateLabel = "वर्तमान कार्य शहर व राज्य"
    override val businessLocationLabel = "व्यवसाय शहर व राज्य"
    override val skillsCategoriesLabel = "कौशल / काम (जैसे राजमिस्त्री, इलेक्ट्रीशियन)"
    override val hiringCategoriesLabel = "भर्ती श्रेणियाँ"
    override val emergencyContactNameLabel = "आपातकालीन परिवार संपर्क नाम"
    override val emergencyContactPhoneLabel = "आपातकालीन संपर्क नंबर"
    override val uniqueLbIdNotice = "पंजीकरण पूरा होने पर सर्वर स्थायी LB ID (LB2000+) देगा। VIP व मालिक नंबर सुरक्षित रहते हैं।"
    override val creatingProfileLabel = "प्रोफ़ाइल बन रही है..."
    override val createProfileButton = "मज़दूर / नियोक्ता प्रोफ़ाइल बनाएं"
    override val loginHeading = "पंजीकृत मोबाइल OTP से लॉग इन करें"
    override val loginSubtitle = "मज़दूर या नियोक्ता के रूप में पंजीकृत मोबाइल नंबर दर्ज करें।"
    override val registeredMobileLabel = "पंजीकृत मोबाइल नंबर"
    override val sendLoginOtpButton = "लॉग इन OTP भेजें"
    override val resendLoginOtpButton = "OTP पुनः भेजें"
    override val enterLoginOtpLabel = "लॉग इन OTP दर्ज करें"
    override val verifyingOtpLabel = "सत्यापन हो रहा है..."
    override val verifyOtpOpenHomeButton = "OTP सत्यापित करें और होम खोलें"
    override val backToHomepageButton = "होमपेज पर वापस जाएं"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "भूमिका"
    override val offlinePreviewHeading = "ऑफलाइन प्रोफ़ाइल व फोटो प्रीव्यू"
    override val offlinePreviewCardTitle = "प्रोफ़ाइल बनाएं / बदलें (ऑफलाइन प्रीव्यू)"
    override val offlinePreviewCardSubtitle = "लाइव डेटाबेस जुड़ने तक स्थानीय प्रीव्यू के रूप में सहेजा जाता है।"
    override val workLocationLabel = "कार्य स्थान (शहर, राज्य)"
    override val businessAddressLabel = "व्यवसाय शहर, राज्य"
    override val skillsExpLabel = "कौशल / कार्य प्रकार"
    override val businessCatLabel = "व्यवसाय प्रकार / भर्ती श्रेणियाँ"
    override val aadhaarPrivacyNote = "डेटा गोपनीयता: LOBORO डिवाइस पर कच्चे आधार चित्र नहीं रखता — केवल सत्यापित हैश और सहमति सहेजता है।"
    override val selectProfilePhotoBtn = "प्रोफ़ाइल फोटो चुनें (फोटो पिकर)"
    override val photoSelectedBtn = "फोटो चुनी गई ✓"
    override val offlineConsentCheck = "मैं सुरक्षा जांच और संपर्क न होने पर परिवार को आपात सूचना भेजने की सहमति देता हूँ।"
    override val previewProfileBtn = "प्रीव्यू प्रोफ़ाइल सहेजें"
    override val audienceScopeFormat = "दर्शक: %1\$s · क्षेत्र: %2\$s · %3\$s"
    override val settingsHeading = "सेटिंग्स और प्लेटफॉर्म जानकारी"
    override val languageSectionTitle = "ऐप की भाषा (सभी 12 भारतीय भाषाएं)"
    override val languageSectionSubtitle = "आपके सक्रिय खाते के लिए अलग से सहेजी जाती है। अन्य खातों की भाषा नहीं बदलती।"
    override val languagePausedByOwner = "भाषा परिवर्तन मालिक नियंत्रण द्वारा अस्थायी रूप से बंद है।"
    override val lowDataTitle = "लो-डेटा मोड"
    override val lowDataSubtitle = "2G/3G ग्रामीण नेटवर्क पर इंटरनेट डेटा बचाता है"
    override val reducedMotionTitle = "कम एनिमेशन व उच्च कंट्रास्ट"
    override val reducedMotionSubtitle = "स्पष्ट अक्षर और सरल स्क्रीन गति"
    override val privacyPolicyTitle = "गोपनीयता नीति और डेटा सुरक्षा"
    override val privacyPolicyBody = "• चैट में आपकी अनुमति के बिना मोबाइल नंबर छिपा रहता है।\n• माइक्रोफोन केवल बोलकर खोजने के बटन पर ही उपयोग होता है।\n• फोटो चुनने के लिए सुरक्षित फोटो पिकर उपयोग होता है।\n• परिवार को आपात लोकेशन केवल आपकी सहमति से भेजी जाती है।"
    override val termsOfServiceTitle = "सेवा की शर्तें और निष्पक्ष नियम"
    override val termsOfServiceBody = "• दैनिक मजदूरी और मासिक सैलरी के काम अलग-अलग रखे गए हैं।\n• हर LOBORO कॉइन 100% समान नकद मूल्य और निकासी के योग्य है।\n• बैज केवल वास्तविक कार्यदिवसों व निष्पक्ष रेटिंग से मिलते हैं।\n• VIP ID (LB1–LB1999) केवल मालिक आवंटन के लिए सुरक्षित हैं।"
    override val helpSupportTitle = "सहायता, समर्थन और सुरक्षा डेस्क"
    override val helpSupportBody = "• तत्काल खतरे में 112 पर कॉल करें (लॉग इन के बिना भी 24x7 उपलब्ध)।\n• मजदूरी या रहने की समस्या के लिए मदद और सुरक्षा डेस्क में केस दर्ज करें।\n• कीपैड फोन उपयोगकर्ता टोल-फ्री कॉलबैक के लिए कीपैड व IVR देखें।"
    override val backendChecklistTitle = "बैकएंड और API एकीकरण स्थिति"
    override val providersLabel = "प्रदाता: %1\$s"
    override val secretsLabel = "सीक्रेट की: %1\$s"

    override val ownerSetupTitle = "एक-बार मालिक / सुपर एडमिन सेटअप"
    override val ownerSetupSubtitle = "केवल LOBORO निर्माता के लिए। एक बार पंजीकरण के बाद हमेशा के लिए लॉक हो जाता है।"
    override val ownerSetupLockNote = "सुरक्षा लॉक: केवल एक ही मालिक खाता बन सकता है। कोई भी मज़दूर या नियोक्ता इसका उपयोग नहीं कर सकता।"
    override val ownerBackendReqTitle = "मालिक सर्वर जुड़ा नहीं है"
    override val ownerBackendReqBody = "पासवर्ड व 4-अंकीय पिन को सर्वर पर सुरक्षित रखने हेतु LOBORO_BACKEND_URL कॉन्फ़िगर करें।"
    override val serverSetupAuthHeading = "1. सर्वर सेटअप प्राधिकरण"
    override val bootstrapSecretLabel = "वन-टाइम सर्वर बूटस्ट्रैप कोड *"
    override val bootstrapSecretPlaceholder = "आपके सर्वर OWNER_BOOTSTRAP_SECRET से"
    override val ownerIdentityHeading = "2. मालिक पहचान और मोबाइल OTP"
    override val ownerNameField = "मालिक का पूरा नाम *"
    override val ownerMobileField = "मालिक का व्यक्तिगत मोबाइल नंबर *"
    override val ownerSendOtpBtn = "मालिक OTP भेजें"
    override val ownerMobileVerifiedNote = "मालिक मोबाइल OTP सत्यापित"
    override val credentialsHeading = "3. पासवर्ड और 4-अंकीय एडमिन पिन"
    override val createPasswordLabel = "लॉग इन पासवर्ड बनाएं (8+ अक्षर) *"
    override val confirmPasswordLabel = "लॉग इन पासवर्ड पुष्टि करें *"
    override val passwordsMismatchError = "पासवर्ड मेल नहीं खाते"
    override val createPinLabel = "4-अंकीय एडमिन पिन बनाएं *"
    override val confirmPinLabel = "4-अंकीय एडमिन पिन पुष्टि करें *"
    override val pinsMismatchError = "पिन मेल नहीं खाते"
    override val credentialsHashNote = "सर्वर पासवर्ड व पिन को Argon2id से हैश करता है। ऐप कोड में कुछ भी सेव नहीं होता।"
    override val registeringOwnerLabel = "मालिक खाता बन रहा है..."
    override val completeOwnerRegButton = "मालिक पंजीकरण पूरा करें और डैशबोर्ड खोलें"
    override val returnToAppButton = "LOBORO ऐप पर लौटें"
    override val adminPinHeader = "मालिक नियंत्रण · 4-अंकीय पिन आवश्यक"
    override val adminPinPrompt = "अपना 4-अंकीय मालिक एडमिन पिन दर्ज करें। सर्वर पर दर-सीमा के साथ सत्यापित।"
    override val pinLockoutFormat = "अधिक गलत प्रयास। %1\$d सेकंड बाद पुनः प्रयास करें।"
    override val clrKeyLabel = "साफ़"
    override val verifyPinServerBtn = "सर्वर पर 4-अंकीय पिन जांचें"
    override val pinSecurityPolicyFormat = "5 गलत प्रयासों पर लॉक · 5 मिनट निष्क्रियता पर लॉगआउट · शेष प्रयास: %1\$d"
    override val ownerMasterControlTitle = "मालिक मास्टर कंट्रोल"
    override val ownerMasterSubtitle = "केवल मालिक सुपर एडमिन · सर्वर पिन + OTP + ऑडिट लॉग"
    override val ownerSessionLockedNote = "मालिक सत्र लॉक है। मास्टर कंट्रोल खोलने के लिए सर्वर-सत्यापित 4-अंकीय पिन आवश्यक है।"
    override val verifyOwnerPinBtn = "मालिक 4-अंकीय पिन जांचें"
    override val ownerProfileLineFormat = "मालिक प्रोफ़ाइल · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "पंजीकृत मोबाइल: %1\$s · एकल मालिक खाता (%2\$s)"
    override val activeSessionFormat = "सक्रिय मालिक सत्र · स्वतः लॉगआउट %1\$dm %2\$02ds में"
    override val serverAuthorityNote = "सत्र टोकन सत्यापित (सर्वर अधिकार)"
    override val lockAndExitBtn = "लॉक और बाहर जाएं"
    override val mandatoryProtectionTitle = "अनिवार्य सुरक्षा और वित्तीय दायित्व संरक्षण"
    override val mandatoryProtectionBody = "सुविधाएं बंद करने या मेंटेनेंस मोड से मौजूदा भुगतान दायित्व, रिफंड या आपातकालीन 112 सुरक्षा सेवा रद्द नहीं होती।"
    override val changePinTitle = "एडमिन पिन बदलें (OTP सत्यापन अनिवार्य)"
    override val changePinSubtitle = "केवल मालिक। वर्तमान पिन कभी नहीं दिखता। पंजीकृत मोबाइल पर सर्वर OTP अनिवार्य है।"
    override val otpToRegisteredMobileNote = "OTP केवल रिकॉर्ड किए गए मालिक के मोबाइल पर भेजा जाएगा: %1\$s"
    override val sendPinChangeOtpBtn = "पंजीकृत मालिक मोबाइल पर OTP भेजें"
    override val otpDispatchedNote = "मालिक के पंजीकृत मोबाइल (%1\$s) पर OTP भेजा गया।"
    override val enterServerOtpLabel = "सर्वर OTP कोड दर्ज करें"
    override val verifyOtpServerBtn = "सर्वर पर OTP सत्यापित करें"
    override val otpVerifiedNewPinNote = "OTP सत्यापित। अब नया 4-अंकीय मालिक पिन दर्ज और पुष्टि करें।"
    override val newPinLabel = "नया 4-अंकीय पिन"
    override val confirmNewPinLabel = "नए 4-अंकीय पिन की पुष्टि"
    override val saveNewPinBtn = "पुष्टि करें और एडमिन पिन बदलें"
    override val confirmPinChangeTitle = "एडमिन पिन बदलाव की पुष्टि करें"
    override val confirmPinChangeDesc = "सर्वर पर अपना 4-अंकीय मालिक पिन बदलें? सत्र सक्रिय रहेगा और ऑडिट लॉग दर्ज होगा।"
    override val pinUpdatedNote = "नया 4-अंकीय मालिक पिन सर्वर पर सहेजा गया।"
    override val completeMasterControlTitle = "पूर्ण मालिक मास्टर कंट्रोल (25 मॉड्यूल)"
    override val masterControlScopeSubtitle = "क्षेत्र या उपयोगकर्ता भूमिका के अनुसार तुरंत ON/OFF नियंत्रण।"
    override val scopeOptions = listOf(
        "ग्लोबल · भारत (सभी राज्य)",
        "केवल तेलंगाना",
        "केवल तमिलनाडु",
        "केवल मज़दूर",
        "केवल नियोक्ता"
    )
    override val masterControlNames = listOf(
        "1. संपूर्ण ऐप व मेंटेनेंस मोड",
        "2. मज़दूर पंजीकरण",
        "3. नियोक्ता पंजीकरण",
        "4. काम पोस्ट करना",
        "5. काम खोजना",
        "6. दैनिक मजदूरी काम",
        "7. मासिक वेतन काम",
        "8. कॉइन खरीद",
        "9. वॉलेट निकासी",
        "10. काम शुल्क व कॉइन मूल्य",
        "11. ऑफर और प्रमोशन",
        "12. रेफरल इनाम",
        "13. सूचनाएं और एडमिन संदेश",
        "14. मज़दूर व नियोक्ता खाता नियंत्रण",
        "15. काम श्रेणियाँ व उप-श्रेणियाँ",
        "16. रेटिंग और ऑटोमैटिक बैज",
        "17. वरिष्ठता व लॉयल्टी सहायता",
        "18. आपातकालीन व मज़दूर सुरक्षा प्रणाली",
        "19. SMS अलर्ट",
        "20. IVR सेवाएं",
        "21. भाषा सेटिंग्स (12 भाषाएं)",
        "22. देश, राज्य व शहर उपलब्धता",
        "23. VIP ID आरक्षण व प्रबंधन",
        "24. रिपोर्ट, शिकायत व मॉडरेशन",
        "25. पेमेंट गेटवे एकीकरण"
    )
    override val publishNoticeTitle = "लाल LOBORO एडमिन सूचना जारी करें"
    override val announcementMessageLabel = "घोषणा संदेश"
    override val announcementPlaceholder = "जैसे: दूसरे राज्य के मज़दूरों के लिए नया सुरक्षा हेल्पलाइन अपडेट"
    override val actionLinkLabel = "बटन नाम"
    override val scopeFieldLabel = "क्षेत्र / राज्य दायरा"
    override val audienceOptions = listOf("सभी उपयोगकर्ता", "मज़दूर", "नियोक्ता")
    override val broadcastNoticeBtn = "लाल एडमिन सूचना प्रसारित करें"
    override val confirmBroadcastTitle = "लाल LOBORO एडमिन सूचना प्रसारित करें?"
    override val confirmBroadcastDescFormat = "संदेश: %1\$s\nदर्शक: %2\$s · क्षेत्र: %3\$s"
    override val coinPricingTitle = "कॉइन मूल्य और शुल्क नियंत्रण"
    override val coinPricingSummaryFormat = "1 कॉइन = ₹%1\$d · दैनिक = %2\$d कॉइन · विशेष = %3\$d कॉइन · मासिक = %4\$d कॉइन · समय: %5\$s"
    override val dailyBtnFormat = "दैनिक +1 (%1\$d)"
    override val masonBtnFormat = "विशेष +1 (%1\$d)"
    override val monthlyBtnFormat = "मासिक +5 (%1\$d)"
    override val protectedVipIdsTitle = "सुरक्षित VIP व मालिक ID (स्वतः कभी नहीं दी जाती)"
    override val protectedVipIdsNote = "सामान्य उपयोगकर्ताओं को हमेशा LB2000+ मिलता है। विशेष नंबर केवल मालिक आवंटन के लिए सुरक्षित हैं।"
    override val safetyInvestigationTitle = "सुरक्षा मामला व शिकायत जांच डेस्क"
    override val manageCategoriesTitle = "24 काम श्रेणियाँ प्रबंधित करें (तुरंत ON/OFF)"
    override val showAll24Label = "सभी 24 दिखाएं"
    override val showLessLabel = "कम दिखाएं"
    override val auditLogTitle = "मालिक कार्य ऑडिट लॉग"
    override val confirmToggleTitleFormat = "%1\$s की पुष्टि करें"
    override val confirmToggleDescFormat = "क्या %3\$s के लिए \"%1\$s\" को %2\$s करना है? मौजूदा भुगतान दायित्व और 112 सुरक्षा सेवाएं सुरक्षित रहेंगी।"

    override val categories = mapOf(
        JobCategoryId.MASON to "राजमिस्त्री / मेसन",
        JobCategoryId.CONSTRUCTION_LABOUR to "निर्माण मज़दूर",
        JobCategoryId.GENERAL_LABOUR to "सामान्य मज़दूर",
        JobCategoryId.PLUMBER to "प्लम्बर",
        JobCategoryId.ELECTRICIAN to "इलेक्ट्रीशियन",
        JobCategoryId.PAINTER to "पेंटर",
        JobCategoryId.TILE_WORKER to "टाइल कारीगर",
        JobCategoryId.CARPENTER to "बढ़ई / कारपेंटर",
        JobCategoryId.WELDER to "वेल्डर",
        JobCategoryId.HOTEL_STAFF to "होटल स्टाफ",
        JobCategoryId.COOK to "रसोइया / कुक",
        JobCategoryId.WAITER to "वेटर",
        JobCategoryId.HOUSEKEEPING to "हाउसकीपिंग",
        JobCategoryId.SECURITY_GUARD to "सुरक्षा गार्ड",
        JobCategoryId.DRIVER to "ड्राइवर",
        JobCategoryId.DELIVERY_WORKER to "डिलीवरी कर्मी",
        JobCategoryId.FACTORY_WORKER to "फैक्ट्री मज़दूर",
        JobCategoryId.PACKING_WORKER to "पैकिंग कर्मी",
        JobCategoryId.MACHINE_OPERATOR to "मशीन ऑपरेटर",
        JobCategoryId.AGRICULTURE_WORKER to "कृषि मज़दूर",
        JobCategoryId.OFFICE_ASSISTANT to "ऑफिस सहायक",
        JobCategoryId.SHOP_STAFF to "दुकान स्टाफ",
        JobCategoryId.DOMESTIC_WORKER to "घरेलू सहायक",
        JobCategoryId.OTHER_JOBS to "अन्य काम"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "मज़दूर",
        UserRole.EMPLOYER to "नियोक्ता",
        UserRole.OWNER_SUPER_ADMIN to "मालिक / सुपर एडमिन"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "आवेदन किया",
        ApplicationStatus.UNDER_REVIEW to "समीक्षाधीन",
        ApplicationStatus.SHORTLISTED to "शॉर्टलिस्टेड",
        ApplicationStatus.ACCEPTED to "स्वीकृत",
        ApplicationStatus.REJECTED to "अस्वीकृत",
        ApplicationStatus.WITHDRAWN to "वापस लिया",
        ApplicationStatus.COMPLETED to "पूर्ण"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "लंबित",
        TransactionStatus.SUCCESSFUL to "सफल",
        TransactionStatus.FAILED to "विफल",
        TransactionStatus.REFUNDED to "रिफंडेड"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "कॉइन खरीद",
        TransactionType.GIFT to "गिफ्ट क्रेडिट",
        TransactionType.PROMO to "प्रोमो क्रेडिट",
        TransactionType.REFERRAL to "रेफरल बोनस",
        TransactionType.BADGE_REWARD to "बैज इनाम",
        TransactionType.LOYALTY_SUPPORT to "लॉयल्टी सहायता",
        TransactionType.JOB_FEE to "जॉब शुल्क",
        TransactionType.WITHDRAWAL to "निकासी"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "बकाया मजदूरी",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "शारीरिक दुर्व्यवहार",
        SafetyComplaintCategory.HARASSMENT to "उत्पीड़न",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "खाना / रहने की समस्या",
        SafetyComplaintCategory.FRAUD to "नौकरी धोखाधड़ी",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "असुरक्षित कार्यस्थल",
        SafetyComplaintCategory.OTHER_EMERGENCY to "अन्य आपात स्थिति"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "नया",
        SafetyCaseStatus.IN_REVIEW to "जांच में",
        SafetyCaseStatus.ADMIN_VERIFIED to "एडमिन सत्यापित",
        SafetyCaseStatus.ACTION_TAKEN to "कार्रवाई हुई",
        SafetyCaseStatus.REFERRED to "अग्रसारित",
        SafetyCaseStatus.CLOSED to "बंद"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "शुरुआती",
        BadgeLevel.SILVER to "सिल्वर",
        BadgeLevel.GOLD to "गोल्ड",
        BadgeLevel.DIAMOND to "डायमंड",
        BadgeLevel.PLATINUM to "प्लैटिनम"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "काम डालते समय",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "सत्यापित संपर्क पर",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "आवेदन स्वीकृति पर"
    )
    override val indianStates = mapOf(
        "All States" to "सभी राज्य",
        "Telangana" to "तेलंगाना",
        "Andhra Pradesh" to "आंध्र प्रदेश",
        "Tamil Nadu" to "तमिलनाडु",
        "Karnataka" to "कर्नाटक",
        "Maharashtra" to "महाराष्ट्र",
        "Gujarat" to "गुजरात",
        "Assam" to "असम",
        "Bihar" to "बिहार",
        "Uttar Pradesh" to "उत्तर प्रदेश",
        "West Bengal" to "पश्चिम बंगाल",
        "Odisha" to "ओडिशा",
        "Kerala" to "केरल",
        "Punjab" to "पंजाब"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "क्लाउड डेटाबेस और सुरक्षा नियम",
        "otp_sms" to "OTP व SMS सेवा",
        "payment_gateway" to "UPI व कॉइन पेमेंट गेटवे",
        "face_liveness" to "चेहरा मिलान व जीवंतता जांच",
        "translation" to "लाइव 12-भाषा काम अनुवाद",
        "telecom_ivr" to "कीपैड फोन मिस्ड-कॉल व IVR",
        "owner_pin_auth" to "मालिक बूटस्ट्रैप व 4-अंकीय पिन सर्वर"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "जुड़ा नहीं",
        IntegrationStatus.NEEDS_CREDENTIALS to "की आवश्यक",
        IntegrationStatus.CONNECTED to "जुड़ा हुआ"
    )

    override val msgOwnerPrivilegeBlocked = "अनधिकृत: सामान्य उपयोगकर्ता कभी मालिक / सुपर एडमिन नहीं बन सकते।"
    override val msgSwitchedPreviewFormat = "प्रीव्यू खाता बदलकर %1\$s (%2\$s) किया गया।"
    override val msgLanguageSavedFormat = "भाषा बदलकर %1\$s (%2\$s) की गई"
    override val msgEnterNameBeforeOtp = "OTP मांगने से पहले अपना पूरा नाम लिखें।"
    override val msgEnterValidMobile = "कृपया सही 10-अंकीय मोबाइल नंबर दर्ज करें।"
    override val msgOtpDispatchedFormat = "सर्वर OTP %1\$s पर भेजा गया। प्राप्त कोड दर्ज करें।"
    override val msgUnableSendOtp = "OTP भेजा नहीं जा सका। बैकएंड URL या नेटवर्क जांचें।"
    override val msgSendOtpAndEnterCode = "पहले OTP भेजें और 4–6 अंकों का कोड दर्ज करें।"
    override val msgOtpVerifiedCreateFormat = "मोबाइल OTP सत्यापित! विवरण भरें और %1\$s प्रोफ़ाइल बनाएं दबाएं।"
    override val msgIncorrectOtp = "गलत या समाप्त OTP। नया OTP मंगवाएं।"
    override val msgServerOtpUnavailable = "सर्वर OTP सेवा उपलब्ध नहीं। लाइव बैकएंड जोड़ें।"
    override val msgEnterFullName = "पूरा नाम आवश्यक है।"
    override val msgVerifyMobileOtpFirst = "कृपया पहले मोबाइल OTP सत्यापित करें।"
    override val msgAccountCreatedFormat = "स्वागत है %1\$s! %2\$s खाता बन गया (%3\$s)।"
    override val msgLoggedInFormat = "%1\$s (%2\$s) के रूप में लॉग इन हो गए"
    override val msgSignedOut = "उपयोगकर्ता खाते से साइन आउट हो गए।"
    override val msgDuplicateOwnerBlocked = "सुरक्षा रोक: मालिक खाता पहले से मौजूद है। नया मालिक नहीं बन सकता।"
    override val msgBootstrapRequired = "सर्वर बूटस्ट्रैप प्राधिकरण कोड दर्ज करें।"
    override val msgEnterPasswords = "मालिक लॉग इन पासवर्ड दर्ज और पुष्टि करें।"
    override val msgPasswordsDoNotMatch = "दोनों पासवर्ड मेल नहीं खाते।"
    override val msgPasswordTooShort = "पासवर्ड कम से कम 8 अक्षरों का होना चाहिए।"
    override val msgPinFourDigits = "एडमिन पिन ठीक 4 अंकों का होना चाहिए।"
    override val msgPinsDoNotMatch = "4-अंकीय पिन की पुष्टि मेल नहीं खाती।"
    override val msgOwnerCreatedFormat = "%1\$s के लिए मालिक प्रोफ़ाइल बन गई। अब नया मालिक पंजीकरण बंद है।"
    override val msgOwnerLockedSession = "मालिक सत्र लॉक हो गया।"
    override val msgOwnerTimedOut = "5 मिनट निष्क्रियता के कारण मालिक सत्र समाप्त हुआ। पिन फिर दर्ज करें।"
    override val msgOwnerUnlocked = "मालिक मास्टर कंट्रोल खुल गया।"
    override val msgInvalidPinAttemptsFormat = "गलत 4-अंकीय मालिक पिन। %1\$d प्रयास शेष।"
    override val msgTooManyPinAttemptsFormat = "बहुत अधिक गलत प्रयास। %1\$d सेकंड के लिए लॉक।"
    override val msgOwnerSessionRequired = "सक्रिय मालिक सत्र आवश्यक है।"
    override val msgVerifyOtpBeforePinChange = "पहले पंजीकृत मोबाइल पर आया OTP सत्यापित करें।"
    override val msgPinUpdatedSuccess = "नया एडमिन पिन सर्वर पर सुरक्षित रूप से अपडेट हो गया।"
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) के लिए डेमो प्रोफ़ाइल अपडेट हुई"
    override val msgJobPostedFormat = "%1\$s में डेमो काम पोस्ट हुआ! शुल्क: %2\$d कॉइन।"
    override val msgAlreadyAppliedFormat = "%1\$s के लिए पहले से आवेदन किया गया है"
    override val msgApplicationSentFormat = "%1\$s के लिए आवेदन भेजा गया"
    override val msgApplicationWithdrawnFormat = "आवेदन %1\$s वापस लिया गया"
    override val msgApplicationUpdatedFormat = "आवेदन %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "साप्ताहिक जांच दर्ज: 1 · मैं सुरक्षित हूँ।"
    override val msgCheckInProblemRecorded = "चेतावनी दर्ज (2 · समस्या)। सुरक्षा डेस्क को सूचित किया गया।"
    override val msgCheckInAdminRequested = "तत्काल एडमिन कॉलबैक अनुरोधित (3)। परिवार अलर्ट कतार में।"
    override val msgSafetyComplaintSubmittedFormat = "सुरक्षा मामला %1\$s दर्ज कर लिया गया।"
    override val msgWithdrawalsFrozen = "तत्काल रोक चालू: सभी निकासी तुरंत लॉक कर दी गई हैं।"
    override val msgWithdrawalsUnfrozen = "सत्यापन के बाद निकासी अनलॉक हो गई।"
    override val msgOwnerNoticePublished = "लाल LOBORO एडमिन सूचना प्रसारित हो गई।"
}
