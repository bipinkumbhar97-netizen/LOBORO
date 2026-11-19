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

object MarathiStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "ग्लोबल जॉब आणि सेवा"
    override val demoPreviewBanner = "डेमो प्रिव्ह्यू डेटा · लाइव्ह प्रणालीसाठी सेटिंग्जमध्ये बॅकएंड API जोडा"
    override val verifiedNormalAccountBanner = "पडताळलेले वापरकर्ता खाते · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO अ‍ॅडमिन सूचना"
    override val maintenanceModeBanner = "मेंटेनन्स मोड सुरू आहे · भरती व वॉलेट तात्पुरते बंद आहेत. आपत्कालीन 112 व सुरक्षा कक्ष सुरू आहे."
    override val navHome = "होम"
    override val navSearchJobs = "काम शोधा"
    override val navPostJob = "काम टाका"
    override val navWallet = "वॉलेट"
    override val navMyApplications = "माझे अर्ज"
    override val navMyJobs = "माझी कामे"
    override val navNotifications = "सूचना"
    override val navHelpSafety = "मदत आणि सुरक्षा"
    override val navProfile = "प्रोफाइल"
    override val navSettings = "सेटिंग्ज"
    override val navAdmin = "मालक नियंत्रण"
    override val navBadgesLoyalty = "बॅज आणि लॉयल्टी"
    override val navIvrKeypad = "कीपॅड आणि IVR"
    override val backLabel = "मागे"
    override val homeLabel = "होम"
    override val languageLabel = "भाषा"
    override val languageSelectorTitle = "12 भाषा"
    override val activeBadgeLabel = "सक्रिय"
    override val closeLabel = "बंद करा"
    override val okLabel = "ठीक आहे"
    override val understoodLabel = "समजले"
    override val cancelLabel = "रद्द करा"
    override val doneLabel = "पूर्ण"
    override val confirmActionLabel = "पुष्टी करा"
    override val resetLabel = "रीसेट"
    override val sendLabel = "पाठवा"

    override val shareAppTitle = "LOBORO अ‍ॅप शेअर करा"
    override val shareAppCta = "मित्रांना शेअर करा आणि बक्षीस मिळवा"
    override val yourReferralLinkLabel = "तुमची रेफरल लिंक"
    override val loboroLinkLabel = "LOBORO लिंक"
    override val shareMenuButton = "शेअर मेनू"
    override val copyLinkButton = "लिंक कॉपी करा"
    override val referralCopiedToast = "रेफरल संदेश कॉपी झाला"
    override val openingShareMenuToast = "शेअर मेनू उघडत आहे"
    override val shareMessageTemplate = "LOBORO ग्लोबल जॉब आणि सेवेत सामील व्हा! भारतभरात रोजंदारी किंवा मासिक पगाराचे काम मिळवा. माझा रेफरल ID %1\$s वापरा: %2\$s"

    override val registerWorkerEmployerCta = "कामगार / नियोक्ता म्हणून नोंदणी करा"
    override val logInLabel = "लॉग इन"
    override val signOutLabel = "साइन आउट"
    override val voiceSearchHint = "काम किंवा शहर बोला किंवा टाइप करा (उदा. हैदराबादमध्ये गवंडी)"
    override val tapMicToSpeak = "बोलून काम शोधण्यासाठी माइक दाबा"
    override val listeningStatus = "ऐकत आहे... तुमचे काम बोला"
    override val stopListening = "ऐकणे थांबवा"
    override val searchAction = "शोधा"
    override val retryVoice = "पुन्हा बोला"
    override val voiceMicPermissionNeeded = "माइक परवानगी फक्त तुम्ही माइक बटण दाबाल तेव्हाच मागितली जाते."
    override val voiceUnavailableHonest = "या उपकरणात व्हॉइस ओळख सेवा नाही. क्लाउड व्हॉइस सेवा जोडा किंवा खालील पर्याय निवडा."
    override val voiceNoMatchError = "आवाज स्पष्ट ऐकू आला नाही. स्पष्ट बोला किंवा खालील नमुने निवडा."
    override val voiceNetworkError = "नेटवर्क त्रुटी. इंटरनेट तपासा किंवा काम टाइप करा."
    override val voiceStoppedError = "व्हॉइस इनपुट थांबले (कोड %1\$d). टाइप करा किंवा पुन्हा प्रयत्न करा."
    override val voicePrivacyHint = "गोपनीयता: माइक नेहमी बंद असतो आणि फक्त तुमच्या बटण दाबण्यावरच सुरू होतो."
    override val clearSearchDesc = "शोध साफ करा"
    override val spokenSamples = listOf(
        "हैदराबादमध्ये गवंडी" to "Mason",
        "पुण्यात इलेक्ट्रिशियन" to "Electrician",
        "चेन्नई हॉटेल कूक" to "Cook",
        "विजयवाडा ड्रायव्हर" to "Driver",
        "सुरत पॅकिंग काम" to "Packing"
    )
    override val dailyJobsTitle = "रोजचे काम (Daily)"
    override val dailyJobsSubtitle = "दैनिक मजुरी · मासिक कामापासून स्वतंत्र यादी"
    override val monthlyJobsTitle = "महिन्याच्या पगाराचे काम"
    override val monthlyJobsSubtitle = "निश्चित मासिक पगार · सुट्टी व निवासाची माहिती"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "कामाचे प्रकार (24)"
    override val walletStripSummaryFormat = "%1\$d कॉइन (₹%2\$d) · 100%% काढता येणारे"

    override val outOfStateTitle = "परराज्यात आणि जागतिक काम शोधा"
    override val willingToRelocate = "दुसऱ्या राज्यात जाण्यास तयार आहे"
    override val filterCountry = "देश"
    override val filterState = "राज्य"
    override val filterDistrict = "जिल्हा"
    override val filterCity = "शहर"
    override val filterDistance = "अंतर"
    override val upToKmFormat = "%1\$d किमी पर्यंत"
    override val filterFoodIncluded = "जेवण मिळेल"
    override val filterAccommodation = "राहण्याची सोय"
    override val allCategoriesLabel = "सर्व श्रेणी"
    override val noMatchingJobsTitle = "फिल्टरनुसार कोणतेही काम सापडले नाही"
    override val noMatchingJobsSubtitle = "फिल्टर रीसेट करा किंवा 'दुसऱ्या राज्यातील काम' सुरू करा."
    override val showAllJobsButton = "सर्व कामे दाखवा"
    override val dailyWageJobBadge = "दैनिक मजुरीचे काम"
    override val monthlySalaryJobBadge = "मासिक पगाराचे काम"
    override val demoDataTag = "डेमो"
    override val originalLangFormat = "मूळ भाषा: %1\$s"
    override val preTranslatedPreviewNote = "पूर्व-भाषांतरित प्रिव्ह्यू सुरू आहे. लाइव्ह कामांसाठी सेटिंग्जमध्ये ट्रान्सलेशन API जोडा."
    override val configureTranslationApiNote = "सर्व 12 भाषांमध्ये लाइव्ह भाषांतरासाठी सेटिंग्जमध्ये ट्रान्सलेशन API की जोडा."
    override val translatedToggle = "भाषांतरित"
    override val originalToggle = "मूळ"
    override val compensationLabel = "मोबदला / पगार"
    override val locationLabel = "ठिकाण"
    override val employerLabel = "नियोक्ता"
    override val vacanciesUnit = "जागा"
    override val perDayFormat = "₹%1\$d / दिवस"
    override val perMonthFormat = "₹%1\$d / महिना"
    override val coinsCountFormat = "%1\$d कॉइन"
    override val foodBadge = "जेवण"
    override val stayBadge = "निवास"
    override val shareJobButton = "काम शेअर करा"
    override val applyNow = "अर्ज करा"
    override val saveJob = "जतन करा"
    override val negotiateChat = "चर्चा / चॅट"
    override val reportJob = "तक्रार करा"
    override val foodAvailable = "जेवण समाविष्ट"
    override val accommodationAvailable = "राहण्याची सोय समाविष्ट"
    override val notProvided = "समाविष्ट नाही"
    override val workersNeeded = "लागणारे कामगार"
    override val workHoursLabel = "कामाचे तास"
    override val overtimeLabel = "ओव्हरटाइम"
    override val paymentFreqLabel = "पेमेंट"
    override val weeklyHolidayLabel = "साप्ताहिक सुट्टी"
    override val leavePolicyLabel = "रजेचे नियम"
    override val joiningDateLabel = "रुजू होण्याची तारीख"
    override val expiryLabel = "समाप्ती"
    override val translatedBadgeLabel = "भाषांतरित"

    override val postingPausedFormat = "मालक नियंत्रण (%1\$s) द्वारे काम टाकणे तात्पुरते थांबवले आहे."
    override val selectCategoryLabel = "श्रेणी निवडा (24 श्रेणी)"
    override val jobTitleLabel = "कामाचे शीर्षक"
    override val jobTitlePlaceholder = "उदा. हॉस्टेल बांधकामासाठी 4 गवंडी हवे आहेत"
    override val jobDescLabel = "कामाचे तपशील"
    override val jobDescPlaceholder = "कामाची माहिती, सुरक्षा साधने, जेवण व राहण्याची सोय"
    override val dailyWageInrLabel = "दैनिक मजुरी (₹)"
    override val monthlySalaryInrLabel = "मासिक पगार (₹)"
    override val vacanciesLabel = "एकूण जागा"
    override val cityTownLabel = "शहर / गाव"
    override val stateLabel = "राज्य"
    override val transparentJobFeeTitle = "पारदर्शक जॉब शुल्क: %1\$d कॉइन (₹%2\$d)"
    override val configuredByOwnerSub = "मालकाने ठरवलेले · शुल्क वेळ: %1\$s · उपलब्ध: %2\$d कॉइन"
    override val confirmAndPostJobButton = "पुष्टी करा आणि काम टाका (%1\$d कॉइन)"

    override val walletBalanceTitle = "LOBORO कॉइन शिल्लक"
    override val withdrawableValueFormat = "₹%1\$d काढण्यायोग्य मूल्य (1 कॉइन = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% समान पैसे काढण्याचा नियम"
    override val withdrawableRuleBody = "खरेदी केलेले, भेट, ऑफर, रेफरल, बॅज किंवा लॉयल्टीचे प्रत्येक कॉइन समान रोख मूल्याचे असून 100% काढता येतात. कोणतेही कॉइन लॉक नाहीत."
    override val buyCoins = "कॉइन खरेदी करा"
    override val withdrawCoins = "पैसे काढा"
    override val walletActionsPausedNote = "काही वॉलेट सेवा मालकाने थांबवल्या आहेत. तुमची सध्याची शिल्लक व मंजूर परतावा सुरक्षित आहे."
    override val coinPackagesTitle = "कॉइन पॅकेज (पारदर्शक दर)"
    override val bankSecurityTitle = "बँक / UPI आणि चेहरा पडताळणी सुरक्षा"
    override val payoutDestinationLabel = "पडताळलेले पेमेंट खाते: %1\$s"
    override val bankSecurityStepsNote = "बँक/UPI बदलण्यासाठी अनिवार्य तपासणी: नोंदणीकृत मोबाइल OTP + लाइव्ह सेल्फी जुळणी + तात्पुरता पेमेंट लॉक."
    override val changeBankUpiButton = "बँक / UPI बदला (OTP + चेहरा तपासणी)"
    override val unfreezePayoutsButton = "पैसे काढणे सुरू करा"
    override val lostPhoneFreezeButton = "फोन हरवला? पेमेंट लगेच थांबवा"
    override val payoutFreezeActiveNote = "पेमेंट लॉक सक्रिय आहे. ओळख पुन्हा पटवल्याशिवाय कोणतेही पैसे काढता येणार नाहीत."
    override val transactionHistory = "कॉइन व्यवहार नोंदवही"
    override val demoLedgerSuffix = "(डेमो नोंदवही)"
    override val buyCoinsDialogTitleFormat = "%1\$d कॉइन खरेदी करा (₹%2\$d)"
    override val paymentNotConnectedBody = "लाइव्ह Razorpay / Cashfree UPI पेमेंट अद्याप जोडलेले नाही. प्रत्यक्ष पैसे स्वीकारण्यापूर्वी प्रोडक्शन की जोडा."
    override val withdrawDialogTitleFormat = "₹%1\$d काढा"
    override val withdrawDialogBodyFormat = "संपूर्ण शिल्लक (%1\$d कॉइन) समान रोख मूल्यासह 100%% काढता येते.\nखाते: %2\$s\n\nया आवृत्तीत लाइव्ह IMPS / UPI गेटवे जोडलेला नाही."
    override val bankChangeDialogTitle = "3-टप्प्यांची बँक / UPI सुरक्षा"
    override val bankChangeDialogBody = "फोन हरवल्यास रक्षणासाठी बँक/UPI बदलताना आवश्यक:\n1. नोंदणीकृत मोबाइल OTP पडताळणी\n2. नोंदणी फोटोशी लाइव्ह चेहरा जुळणी\n3. पेमेंटपूर्वी सुरक्षा प्रतीक्षा कालावधी"
    override val receiptDialogTitle = "व्यवहार पावती"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "संदर्भ: %1\$s"
    override val receiptTypeLabel = "प्रकार: %1\$s"
    override val receiptCoinsLabel = "कॉइन: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "स्थिती: %1\$s"
    override val receiptTimeLabel = "वेळ: %1\$s"
    override val receiptWithdrawableYes = "पैसे काढण्याची पात्रता: 100% होय"

    override val employerAppsHeading = "अर्ज आणि थेट संवाद"
    override val secureChatHeading = "सुरक्षित कामगार ↔ नियोक्ता चॅट"
    override val secureChatSubtitle = "तुम्ही स्वतः शेअर करेपर्यंत फोन नंबर लपलेला राहतो. उघडण्यासाठी किंवा ब्लॉक करण्यासाठी टॅप करा."
    override val chatButton = "चॅट"
    override val workerEmployerLineFormat = "कामगार: %1\$s (%2\$s) · नियोक्ता: %3\$s"
    override val shortlistButton = "शॉर्टलिस्ट"
    override val acceptButton = "स्वीकारा"
    override val withdrawButton = "मागे घ्या"
    override val phoneHiddenPrivacy = "गोपनीयता सुरू: दोन्ही बाजूंच्या संमतीशिवाय फोन नंबर लपलेला राहतो."
    override val blockUserLabel = "ब्लॉक"
    override val userBlockedNotice = "तुम्ही ही चर्चा ब्लॉक केली आहे. गरज असल्यास सुरक्षा कक्षात तक्रार करा."
    override val chatPlaceholder = "तुमच्या भाषेत संदेश लिहा..."

    override val automaticBadgePrefix = "स्वयंचलित बॅज: %1\$s"
    override val badgeStatsFormat = "रेटिंग %1\$.1f ★ · %2\$d प्रमाणित कामाचे दिवस · %3\$d पूर्ण कामे"
    override val progressToFormat = "%1\$s बॅजकडे प्रगती: %2\$d / %3\$d दिवस"
    override val badgeAntiAbuseNote = "बॅज केवळ वास्तविक पूर्ण कामे, प्रमाणित उपस्थिती व निष्पक्ष रेटिंगवर मिळतात — ते विकत घेता येत नाहीत."
    override val badgeTiersTitle = "5 स्वयंचलित बॅज स्तर"
    override val minWorkdaysFormat = "किमान %1\$d कामाचे दिवस · किमान %2\$.1f★ रेटिंग"
    override val badgeAppealsNote = "न्याय्य संरक्षण: अचानक संशयास्पद 1-स्टार रेटिंगवर तक्रार अपीलाद्वारे पुनरावलोकन होते."
    override val loyaltyTitle = "ज्येष्ठता आणि लॉयल्टी आर्थिक मदत"
    override val loyaltySubtitle = "पारदर्शक त्रैमासिक कल्याण व टप्पा बोनस"
    override val loyaltyDisclaimer = "महत्त्वाची सूचना: हा विमा नाही आणि निश्चित मासिक पेन्शनही नाही. पात्रता, कामाचे दिवस, निधी आणि मंजुरीवर अवलंबून आहे."
    override val loyaltyMinMembershipFormat = "किमान सदस्यत्व: %1\$d महिने"
    override val loyaltyWorkdaysFormat = "प्रमाणित कामाचे दिवस: %1\$d+ दिवस"
    override val loyaltyRequiredBadgeFormat = "आवश्यक बॅज: %1\$s+"
    override val loyaltyRequiredRatingFormat = "किमान रेटिंग: %1\$.1f★"
    override val loyaltyBudgetFormat = "मंजूर मदत: ₹%1\$d · निधी पूल: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "कामगार सुरक्षा आणि आपत्कालीन मदत"
    override val callEmergency112 = "तातडीची मदत 112 कॉल करा"
    override val weeklyCheckInTitle = "साप्ताहिक सुरक्षा तपासणी"
    override val weeklyCheckInQuestion = "तुम्ही सुरक्षित आहात का?"
    override val checkInOpt1 = "1 · मी सुरक्षित आहे"
    override val checkInOpt2 = "2 · मला अडचण आहे"
    override val checkInOpt3 = "3 · LOBORO अ‍ॅडमिनशी बोला"
    override val reportSafetyIssue = "सुरक्षा / पगार तक्रार नोंदवा"
    override val safetyOperationalNote = "पेमेंट किंवा काम टाकणे बंद असले तरीही सुरक्षा सेवा नेहमी सुरू राहते."
    override val safetyDisclaimerNote = "तातडीच्या धोक्यात थेट 112 वर कॉल करा. निष्पक्ष मध्यस्थीसाठी LOBORO तक्रारी नोंदवते."
    override val everyDaysFormat = "दर %1\$d दिवसांनी"
    override val lastStatusFormat = "शेवटची तपासणी: %1\$s"
    override val checkInNoResponseNote = "सलग 2 तपासण्या चुकल्यास किंवा अडचण निवडल्यास LOBORO SMS, अ‍ॅडमिन तपासणी व संमतीने कुटुंबाला कळवते."
    override val consentEmergencyTitle = "संमती-आधारित आपत्कालीन लोकेशन व कुटुंब संपर्क"
    override val workerIdLabel = "कामगार ID: %1\$s"
    override val homeOriginLabel = "मूळ गाव: %1\$s, %2\$s"
    override val currentJobCityLabel = "सध्याचे कामाचे शहर: %1\$s"
    override val emergencyContactLabel = "आपत्कालीन संपर्क: %1\$s (%2\$s)"
    override val consentGranted = "संमती दिली"
    override val consentPending = "संमती प्रलंबित"
    override val employerLoboroIdInput = "नियोक्ता LOBORO ID (उदा. LB819)"
    override val currentSiteInput = "सध्याचे कामाचे शहर / ठिकाण"
    override val describeIssueInput = "सुरक्षा किंवा मजुरीची समस्या लिहा"
    override val submitSafetyDeskButton = "सुरक्षा कक्षाकडे पाठवा"
    override val safetyCasesHeading = "अलीकडील सुरक्षा प्रकरणे (ऑडिट योग्य)"
    override val ivrTitle = "कीपॅड फोन मिस्ड-कॉल व IVR मेनू"
    override val ivrSubtitle = "स्मार्टफोनशिवाय टोल-फ्री / मिस्ड-कॉल कॉलबॅकद्वारे चालते"
    override val ivrArchNote = "लाइव्ह प्रणाली Exotel / Knowlarity / Twilio Voice ला जोडते. 12-भाषा व्हॉइस मेनू तपासण्यासाठी बटणे दाबा."
    override val ivrMenuTitle = "LOBORO व्हॉइस IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO मध्ये स्वागत आहे! व्हॉइस मेनू ऐकण्यासाठी कीपॅड क्रमांक दाबा."
    override val pressKeyFormat = "%1\$s दाबा → %2\$s"
    override val ivrSelectedSummaryFormat = "निवडलेले [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "आजची दैनिक मजुरीची कामे",
        "2" to "महिन्याच्या पगाराची कामे",
        "3" to "साप्ताहिक सुरक्षा तपासणी ('तुम्ही सुरक्षित आहात का?')",
        "4" to "वॉलेट कॉइन व ताजी स्थिती ऐका",
        "5" to "तात्काळ अ‍ॅडमिन कॉलबॅक",
        "6" to "अर्जाची स्थिती तपासा",
        "0" to "पसंतीची व्हॉइस भाषा बदला"
    )

    override val userRegTitle = "कामगार आणि नियोक्ता नोंदणी"
    override val userLoginTitle = "कामगार आणि नियोक्ता लॉग इन"
    override val userAuthSubtitle = "OTP-पडताळलेले सामान्य वापरकर्ता खाते · गुप्त मालक प्रणालीपासून पूर्ण वेगळे"
    override val registerTab = "नोंदणी"
    override val loginTab = "लॉग इन"
    override val dbOtpNotConnectedTitle = "बॅकएंड डेटाबेस / OTP जोडलेला नाही"
    override val dbOtpNotConnectedBody = "प्रत्यक्ष कामगार व नियोक्ता खाती जतन करण्यासाठी LOBORO_BACKEND_URL जोडा."
    override val selectAccountTypeStep = "1. खात्याचा प्रकार निवडा"
    override val workerAccountLabel = "कामगार"
    override val employerAccountLabel = "नियोक्ता"
    override val regPausedForRoleFormat = "%1\$s नोंदणी सध्या मालकाद्वारे तात्पुरती बंद आहे."
    override val preferredLanguageLabel = "पसंतीची अ‍ॅप भाषा (12 भाषा)"
    override val fullNameStepLabel = "2. पूर्ण नाव *"
    override val businessNameStepLabel = "2. व्यवसाय / कंत्राटदाराचे पूर्ण नाव *"
    override val mobileStepLabel = "3. मोबाइल नंबर (10 अंकी) *"
    override val sendRegOtpButton = "OTP पाठवा"
    override val resendMobileOtpButton = "पुन्हा OTP पाठवा"
    override val enterOtpStepLabel = "4. मोबाइल OTP टाका *"
    override val verifyOtpButton = "OTP तपासा"
    override val verifiedLabel = "पडताळलेले"
    override val mobileVerifiedNote = "सर्व्हरवर मोबाइल पडताळला"
    override val homeStateLabel = "मूळ राज्य"
    override val homeDistrictLabel = "मूळ जिल्हा"
    override val stateShortLabel = "राज्य"
    override val cityShortLabel = "शहर"
    override val workCityStateLabel = "सध्याचे कामाचे शहर व राज्य"
    override val businessLocationLabel = "व्यवसाय शहर व राज्य"
    override val skillsCategoriesLabel = "कौशल्य / काम (उदा. गवंडी, इलेक्ट्रिशियन)"
    override val hiringCategoriesLabel = "भरती श्रेणी"
    override val emergencyContactNameLabel = "आपत्कालीन कुटुंब संपर्क नाव"
    override val emergencyContactPhoneLabel = "आपत्कालीन संपर्क नंबर"
    override val uniqueLbIdNotice = "नोंदणी पूर्ण झाल्यावर सर्व्हर कायमचा LB ID (LB2000+) देईल. VIP व मालक नंबर राखीव आहेत."
    override val creatingProfileLabel = "प्रोफाइल तयार होत आहे..."
    override val createProfileButton = "कामगार / नियोक्ता प्रोफाइल तयार करा"
    override val loginHeading = "नोंदणीकृत मोबाइल OTP ने लॉग इन करा"
    override val loginSubtitle = "कामगार किंवा नियोक्ता म्हणून नोंदवलेला मोबाइल नंबर टाका."
    override val registeredMobileLabel = "नोंदणीकृत मोबाइल नंबर"
    override val sendLoginOtpButton = "लॉग इन OTP पाठवा"
    override val resendLoginOtpButton = "OTP पुन्हा पाठवा"
    override val enterLoginOtpLabel = "लॉग इन OTP टाका"
    override val verifyingOtpLabel = "पडताळणी सुरू आहे..."
    override val verifyOtpOpenHomeButton = "OTP तपासा आणि होम उघडा"
    override val backToHomepageButton = "होमपेजवर परत जा"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "भूमिका"
    override val offlinePreviewHeading = "ऑफलाइन प्रोफाइल व फोटो प्रिव्ह्यू"
    override val offlinePreviewCardTitle = "प्रोफाइल तयार करा / बदला (ऑफलाइन प्रिव्ह्यू)"
    override val offlinePreviewCardSubtitle = "लाइव्ह डेटाबेस जोडला जाईपर्यंत स्थानिक प्रिव्ह्यू म्हणून जतन होते."
    override val workLocationLabel = "कामाचे ठिकाण (शहर, राज्य)"
    override val businessAddressLabel = "व्यवसाय शहर, राज्य"
    override val skillsExpLabel = "कौशल्य / कामाचा प्रकार"
    override val businessCatLabel = "व्यवसाय प्रकार / भरती श्रेणी"
    override val aadhaarPrivacyNote = "गोपनीयता: LOBORO डिव्हाइसवर मूळ आधार फोटो साठवत नाही — केवळ प्रमाणित हॅश व संमती जतन करते."
    override val selectProfilePhotoBtn = "प्रोफाइल फोटो निवडा (फोटो पिकर)"
    override val photoSelectedBtn = "फोटो निवडला ✓"
    override val offlineConsentCheck = "मी सुरक्षा तपासणी आणि संपर्क न झाल्यास कुटुंबाला कळवण्याची संमती देतो."
    override val previewProfileBtn = "प्रिव्ह्यू प्रोफाइल जतन करा"
    override val audienceScopeFormat = "वर्ग: %1\$s · क्षेत्र: %2\$s · %3\$s"
    override val settingsHeading = "सेटिंग्ज आणि प्लॅटफॉर्म माहिती"
    override val languageSectionTitle = "अ‍ॅपची भाषा (सर्व 12 भारतीय भाषा)"
    override val languageSectionSubtitle = "तुमच्या सक्रिय खात्यासाठी स्वतंत्रपणे जतन होते. इतर खात्यांची भाषा बदलत नाही."
    override val languagePausedByOwner = "मालक नियंत्रणाद्वारे भाषा बदलणे तात्पुरते बंद आहे."
    override val lowDataTitle = "लो-डेटा मोड"
    override val lowDataSubtitle = "2G/3G ग्रामीण नेटवर्कवर मोबाइल डेटा वाचवते"
    override val reducedMotionTitle = "कमी अ‍ॅनिमेशन आणि स्पष्ट दृश्य"
    override val reducedMotionSubtitle = "सुस्पष्ट अक्षरे आणि साधी हालचाल"
    override val privacyPolicyTitle = "गोपनीयता धोरण आणि डेटा संरक्षण"
    override val privacyPolicyBody = "• चॅटमध्ये तुमच्या परवानगीशिवाय फोन नंबर लपलेला राहतो.\n• माइक फक्त व्हॉइस सर्च बटण दाबल्यावरच वापरला जातो.\n• फोटो निवडीसाठी सुरक्षित फोटो पिकर वापरला जातो.\n• कुटुंबाला आपत्कालीन लोकेशन केवळ तुमच्या संमतीनेच पाठवले जाते."
    override val termsOfServiceTitle = "सेवा अटी आणि न्याय्य नियम"
    override val termsOfServiceBody = "• दैनिक मजुरी व मासिक पगाराची कामे स्वतंत्र आहेत.\n• प्रत्येक LOBORO कॉइन 100% समान रोख मूल्याचा व काढण्यास पात्र आहे.\n• बॅज केवळ खऱ्या कामाचे दिवस व न्याय्य रेटिंगवर मिळतात.\n• VIP ID (LB1–LB1999) केवळ मालकासाठी राखीव आहेत."
    override val helpSupportTitle = "मदत, सहाय्य आणि सुरक्षा कक्ष"
    override val helpSupportBody = "• तात्काळ धोक्यात 112 वर कॉल करा (लॉग इनशिवायही 24x7).\n• पगार किंवा राहण्याच्या तक्रारीसाठी मदत व सुरक्षा कक्षात केस नोंदवा.\n• कीपॅड फोनसाठी टोल-फ्री कॉलबॅककरिता कीपॅड व IVR पहा."
    override val backendChecklistTitle = "बॅकएंड आणि API एकत्रीकरण स्थिती"
    override val providersLabel = "सेवा प्रदाता: %1\$s"
    override val secretsLabel = "सिक्रेट की: %1\$s"

    override val ownerSetupTitle = "एकदाच मालक / सुपर अ‍ॅडमिन सेटअप"
    override val ownerSetupSubtitle = "केवळ LOBORO निर्मात्यासाठी. एकदा नोंदणी झाल्यावर कायमचे लॉक होते."
    override val ownerSetupLockNote = "सुरक्षा लॉक: फक्त एकच मालक खाते तयार होऊ शकते. कोणताही कामगार किंवा नियोक्ता हे वापरू शकत नाही."
    override val ownerBackendReqTitle = "मालक सर्व्हर जोडलेला नाही"
    override val ownerBackendReqBody = "पासवर्ड व 4-अंकी पिन सर्व्हरवर सुरक्षित ठेवण्यासाठी LOBORO_BACKEND_URL सेट करा."
    override val serverSetupAuthHeading = "1. सर्व्हर सेटअप अधिकार"
    override val bootstrapSecretLabel = "वन-टाइम सर्व्हर बूटस्ट्रॅप कोड *"
    override val bootstrapSecretPlaceholder = "तुमच्या सर्व्हर OWNER_BOOTSTRAP_SECRET मधून"
    override val ownerIdentityHeading = "2. मालक ओळख आणि मोबाइल OTP"
    override val ownerNameField = "मालकाचे पूर्ण नाव *"
    override val ownerMobileField = "मालकाचा वैयक्तिक मोबाइल नंबर *"
    override val ownerSendOtpBtn = "मालक OTP पाठवा"
    override val ownerMobileVerifiedNote = "मालक मोबाइल OTP पडताळला"
    override val credentialsHeading = "3. पासवर्ड आणि 4-अंकी अ‍ॅडमिन पिन"
    override val createPasswordLabel = "लॉग इन पासवर्ड तयार करा (8+ अक्षरे) *"
    override val confirmPasswordLabel = "लॉग इन पासवर्डची पुष्टी करा *"
    override val passwordsMismatchError = "पासवर्ड जुळत नाहीत"
    override val createPinLabel = "4-अंकी अ‍ॅडमिन पिन तयार करा *"
    override val confirmPinLabel = "4-अंकी अ‍ॅडमिन पिनची पुष्टी करा *"
    override val pinsMismatchError = "पिन जुळत नाहीत"
    override val credentialsHashNote = "सर्व्हर पासवर्ड व पिन Argon2id ने हॅश करतो. अ‍ॅपमध्ये साठवले जात नाहीत."
    override val registeringOwnerLabel = "मालक खाते तयार होत आहे..."
    override val completeOwnerRegButton = "मालक नोंदणी पूर्ण करा आणि डॅशबोर्ड उघडा"
    override val returnToAppButton = "LOBORO अ‍ॅपवर परत जा"
    override val adminPinHeader = "मालक नियंत्रण · 4-अंकी पिन आवश्यक"
    override val adminPinPrompt = "तुमचा 4-अंकी मालक अ‍ॅडमिन पिन टाका. सर्व्हरवर मर्यादेसह पडताळणी होते."
    override val pinLockoutFormat = "अनेक चुकीचे प्रयत्न. %1\$d सेकंदांनी पुन्हा प्रयत्न करा."
    override val clrKeyLabel = "साफ"
    override val verifyPinServerBtn = "सर्व्हरवर 4-अंकी पिन तपासा"
    override val pinSecurityPolicyFormat = "5 चुकीच्या प्रयत्नांनंतर लॉक · 5 मिनिटे निष्क्रियतेवर लॉगआउट · उरलेले प्रयत्न: %1\$d"
    override val ownerMasterControlTitle = "मालक मास्टर कंट्रोल"
    override val ownerMasterSubtitle = "केवळ मालक सुपर अ‍ॅडमिन · सर्व्हर पिन + OTP + ऑडिट लॉग"
    override val ownerSessionLockedNote = "मालक सत्र लॉक आहे. मास्टर कंट्रोलसाठी सर्व्हर-पडताळलेला 4-अंकी पिन आवश्यक आहे."
    override val verifyOwnerPinBtn = "मालक 4-अंकी पिन तपासा"
    override val ownerProfileLineFormat = "मालक प्रोफाइल · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "नोंदणीकृत मोबाइल: %1\$s · एकमेव मालक खाते (%2\$s)"
    override val activeSessionFormat = "सक्रिय मालक सत्र · %1\$dm %2\$02ds मध्ये लॉगआउट"
    override val serverAuthorityNote = "सत्र टोकन पडताळलेले (सर्व्हर अधिकार)"
    override val lockAndExitBtn = "लॉक आणि बाहेर पडा"
    override val mandatoryProtectionTitle = "अनिवार्य सुरक्षा आणि आर्थिक जबाबदारी संरक्षण"
    override val mandatoryProtectionBody = "सुविधा बंद केल्याने किंवा मेंटेनन्स मोडमुळे चालू देणी, परतावा किंवा 112 आपत्कालीन सेवा रद्द होत नाहीत."
    override val changePinTitle = "अ‍ॅडमिन पिन बदला (OTP पडताळणी आवश्यक)"
    override val changePinSubtitle = "केवळ मालकासाठी. सध्याचा पिन कधीही दिसत नाही. नोंदणीकृत मोबाइल OTP आवश्यक."
    override val otpToRegisteredMobileNote = "OTP केवळ नोंदवलेल्या मालकाच्या मोबाइलवर पाठवला जाईल: %1\$s"
    override val sendPinChangeOtpBtn = "नोंदणीकृत मालक मोबाइलवर OTP पाठवा"
    override val otpDispatchedNote = "मालकाच्या नोंदणीकृत मोबाइलवर (%1\$s) OTP पाठवला."
    override val enterServerOtpLabel = "सर्व्हर OTP कोड टाका"
    override val verifyOtpServerBtn = "सर्व्हरवर OTP तपासा"
    override val otpVerifiedNewPinNote = "OTP पडताळला. आता नवीन 4-अंकी मालक पिन टाका आणि पुष्टी करा."
    override val newPinLabel = "नवीन 4-अंकी पिन"
    override val confirmNewPinLabel = "नवीन 4-अंकी पिन पुष्टी"
    override val saveNewPinBtn = "पुष्टी करा आणि अ‍ॅडमिन पिन बदला"
    override val confirmPinChangeTitle = "अ‍ॅडमिन पिन बदलाची पुष्टी करा"
    override val confirmPinChangeDesc = "सर्व्हरवर 4-अंकी मालक पिन बदलायचा का? सत्र सुरू राहील आणि ऑडिट नोंद होईल."
    override val pinUpdatedNote = "नवीन 4-अंकी मालक पिन सर्व्हरवर अद्यतनित झाला."
    override val completeMasterControlTitle = "संपूर्ण मालक मास्टर कंट्रोल (25 विभाग)"
    override val masterControlScopeSubtitle = "प्रदेश किंवा वापरकर्ता भूमिकेनुसार त्वरित ON/OFF नियंत्रण."
    override val scopeOptions = listOf(
        "जागतिक · भारत (सर्व राज्ये)",
        "फक्त तेलंगणा",
        "फक्त तमिळनाडू",
        "फक्त कामगार",
        "फक्त नियोक्ते"
    )
    override val masterControlNames = listOf(
        "1. संपूर्ण अ‍ॅप आणि मेंटेनन्स मोड",
        "2. कामगार नोंदणी",
        "3. नियोक्ता नोंदणी",
        "4. काम टाकणे",
        "5. काम शोधणे",
        "6. दैनिक मजुरी कामे",
        "7. मासिक पगार कामे",
        "8. कॉइन खरेदी",
        "9. वॉलेट पैसे काढणे",
        "10. जॉब शुल्क व कॉइन दर",
        "11. ऑफर्स आणि जाहिराती",
        "12. रेफरल बक्षिसे",
        "13. सूचना आणि अ‍ॅडमिन संदेश",
        "14. कामगार व नियोक्ता खाते नियंत्रण",
        "15. कामाच्या श्रेणी व उपश्रेणी",
        "16. रेटिंग आणि स्वयंचलित बॅज",
        "17. ज्येष्ठता व लॉयल्टी मदत",
        "18. आपत्कालीन व कामगार सुरक्षा प्रणाली",
        "19. SMS अलर्ट",
        "20. IVR सेवा",
        "21. भाषा सेटिंग्ज (12 भाषा)",
        "22. देश, राज्य व शहर उपलब्धता",
        "23. VIP ID आरक्षण व व्यवस्थापन",
        "24. अहवाल, तक्रारी व नियंत्रण",
        "25. पेमेंट गेटवे एकत्रीकरण"
    )
    override val publishNoticeTitle = "लाल LOBORO अ‍ॅडमिन सूचना प्रसिद्ध करा"
    override val announcementMessageLabel = "घोषणा संदेश"
    override val announcementPlaceholder = "उदा. परराज्यातील कामगारांसाठी नवीन सुरक्षा हेल्पलाइन"
    override val actionLinkLabel = "बटण नाव"
    override val scopeFieldLabel = "क्षेत्र / राज्य व्याप्ती"
    override val audienceOptions = listOf("सर्व वापरकर्ते", "कामगार", "नियोक्ते")
    override val broadcastNoticeBtn = "लाल अ‍ॅडमिन सूचना प्रसारित करा"
    override val confirmBroadcastTitle = "लाल LOBORO अ‍ॅडमिन सूचना पाठवायची का?"
    override val confirmBroadcastDescFormat = "संदेश: %1\$s\nवर्ग: %2\$s · क्षेत्र: %3\$s"
    override val coinPricingTitle = "कॉइन दर आणि शुल्क नियंत्रण"
    override val coinPricingSummaryFormat = "1 कॉइन = ₹%1\$d · दैनिक = %2\$d कॉइन · विशेष = %3\$d कॉइन · मासिक = %4\$d कॉइन · वेळ: %5\$s"
    override val dailyBtnFormat = "दैनिक +1 (%1\$d)"
    override val masonBtnFormat = "विशेष +1 (%1\$d)"
    override val monthlyBtnFormat = "मासिक +5 (%1\$d)"
    override val protectedVipIdsTitle = "संरक्षित VIP आणि मालक ID (कधीही आपोआप दिले जात नाहीत)"
    override val protectedVipIdsNote = "सामान्य वापरकर्त्यांना नेहमी LB2000+ मिळतो. विशेष क्रमांक केवळ मालक वाटपासाठी राखीव आहेत."
    override val safetyInvestigationTitle = "सुरक्षा प्रकरणे व तक्रार तपासणी कक्ष"
    override val manageCategoriesTitle = "24 काम श्रेणी व्यवस्थापन (त्वरित ON/OFF)"
    override val showAll24Label = "सर्व 24 दाखवा"
    override val showLessLabel = "कमी दाखवा"
    override val auditLogTitle = "मालक कृती ऑडिट लॉग"
    override val confirmToggleTitleFormat = "%1\$s ची पुष्टी करा"
    override val confirmToggleDescFormat = "%3\$s साठी \"%1\$s\" हे %2\$s करायचे का? सध्याची देणी व 112 सुरक्षा सेवा सुरक्षित राहतील."

    override val categories = mapOf(
        JobCategoryId.MASON to "गवंडी / राजमिस्त्री",
        JobCategoryId.CONSTRUCTION_LABOUR to "बांधकाम कामगार",
        JobCategoryId.GENERAL_LABOUR to "सामान्य कामगार",
        JobCategoryId.PLUMBER to "प्लंबर",
        JobCategoryId.ELECTRICIAN to "इलेक्ट्रिशियन",
        JobCategoryId.PAINTER to "पेंटर / रंगारी",
        JobCategoryId.TILE_WORKER to "टाईल कारागीर",
        JobCategoryId.CARPENTER to "सुतार / कारपेंटर",
        JobCategoryId.WELDER to "वेल्डर",
        JobCategoryId.HOTEL_STAFF to "हॉटेल कर्मचारी",
        JobCategoryId.COOK to "स्वयंपाकी / कूक",
        JobCategoryId.WAITER to "वेटर",
        JobCategoryId.HOUSEKEEPING to "हाऊसकीपिंग",
        JobCategoryId.SECURITY_GUARD to "सुरक्षा रक्षक",
        JobCategoryId.DRIVER to "ड्रायव्हर",
        JobCategoryId.DELIVERY_WORKER to "डिलिव्हरी कर्मचारी",
        JobCategoryId.FACTORY_WORKER to "कारखाना कामगार",
        JobCategoryId.PACKING_WORKER to "पॅकिंग कामगार",
        JobCategoryId.MACHINE_OPERATOR to "मशीन ऑपरेटर",
        JobCategoryId.AGRICULTURE_WORKER to "शेतमजूर",
        JobCategoryId.OFFICE_ASSISTANT to "कार्यालय सहाय्यक",
        JobCategoryId.SHOP_STAFF to "दुकान कर्मचारी",
        JobCategoryId.DOMESTIC_WORKER to "घरकाम सहाय्यक",
        JobCategoryId.OTHER_JOBS to "इतर कामे"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "कामगार",
        UserRole.EMPLOYER to "नियोक्ता",
        UserRole.OWNER_SUPER_ADMIN to "मालक / सुपर अ‍ॅडमिन"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "अर्ज केला",
        ApplicationStatus.UNDER_REVIEW to "तपासणीत",
        ApplicationStatus.SHORTLISTED to "शॉर्टलिस्टेड",
        ApplicationStatus.ACCEPTED to "स्वीकारलेले",
        ApplicationStatus.REJECTED to "नाकारलेले",
        ApplicationStatus.WITHDRAWN to "मागे घेतलेले",
        ApplicationStatus.COMPLETED to "पूर्ण"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "प्रलंबित",
        TransactionStatus.SUCCESSFUL to "यशस्वी",
        TransactionStatus.FAILED to "अयशस्वी",
        TransactionStatus.REFUNDED to "परतावा"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "कॉइन खरेदी",
        TransactionType.GIFT to "भेट क्रेडिट",
        TransactionType.PROMO to "प्रोमो क्रेडिट",
        TransactionType.REFERRAL to "रेफरल बोनस",
        TransactionType.BADGE_REWARD to "बॅज बक्षीस",
        TransactionType.LOYALTY_SUPPORT to "लॉयल्टी मदत",
        TransactionType.JOB_FEE to "जॉब शुल्क",
        TransactionType.WITHDRAWAL to "पैसे काढणे"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "थकीत मजुरी",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "शारीरिक त्रास",
        SafetyComplaintCategory.HARASSMENT to "छळवणूक",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "जेवण / निवासाची समस्या",
        SafetyComplaintCategory.FRAUD to "कामाची फसवणूक",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "असुरक्षित कामाचे ठिकाण",
        SafetyComplaintCategory.OTHER_EMERGENCY to "इतर आणीबाणी"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "नवीन",
        SafetyCaseStatus.IN_REVIEW to "तपासणीत",
        SafetyCaseStatus.ADMIN_VERIFIED to "अ‍ॅडमिन पडताळलेले",
        SafetyCaseStatus.ACTION_TAKEN to "कारवाई झाली",
        SafetyCaseStatus.REFERRED to "पाठवलेले",
        SafetyCaseStatus.CLOSED to "बंद"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "सुरुवातीचे",
        BadgeLevel.SILVER to "सिल्व्हर",
        BadgeLevel.GOLD to "गोल्ड",
        BadgeLevel.DIAMOND to "डायमंड",
        BadgeLevel.PLATINUM to "प्लॅटिनम"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "काम टाकताना",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "पडताळलेल्या संपर्कावर",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "अर्ज स्वीकारताना"
    )
    override val indianStates = mapOf(
        "All States" to "सर्व राज्ये",
        "Telangana" to "तेलंगणा",
        "Andhra Pradesh" to "आंध्र प्रदेश",
        "Tamil Nadu" to "तामिळनाडू",
        "Karnataka" to "कर्नाटक",
        "Maharashtra" to "महाराष्ट्र",
        "Gujarat" to "गुजरात",
        "Assam" to "आसाम",
        "Bihar" to "बिहार",
        "Uttar Pradesh" to "उत्तर प्रदेश",
        "West Bengal" to "पश्चिम बंगाल",
        "Odisha" to "ओडिशा",
        "Kerala" to "केरळ",
        "Punjab" to "पंजाब"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "क्लाउड डेटाबेस आणि सुरक्षा नियम",
        "otp_sms" to "OTP आणि SMS सेवा",
        "payment_gateway" to "UPI आणि कॉइन पेमेंट गेटवे",
        "face_liveness" to "चेहरा जुळणी व जिवंतपणा तपासणी",
        "translation" to "लाइव्ह 12-भाषा काम भाषांतर",
        "telecom_ivr" to "कीपॅड फोन मिस्ड-कॉल आणि IVR",
        "owner_pin_auth" to "मालक बूटस्ट्रॅप आणि 4-अंकी पिन सर्व्हर"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "जोडलेले नाही",
        IntegrationStatus.NEEDS_CREDENTIALS to "की आवश्यक",
        IntegrationStatus.CONNECTED to "जोडलेले"
    )

    override val msgOwnerPrivilegeBlocked = "अनधिकृत: सामान्य वापरकर्ता कधीही मालक / सुपर अ‍ॅडमिन बनू शकत नाही."
    override val msgSwitchedPreviewFormat = "प्रिव्ह्यू खाते बदलून %1\$s (%2\$s) केले."
    override val msgLanguageSavedFormat = "भाषा %1\$s (%2\$s) निवडली गेली"
    override val msgEnterNameBeforeOtp = "OTP मागवण्यापूर्वी तुमचे पूर्ण नाव टाका."
    override val msgEnterValidMobile = "कृपया अचूक 10-अंकी मोबाइल नंबर टाका."
    override val msgOtpDispatchedFormat = "सर्व्हर OTP %1\$s वर पाठवला आहे. मिळालेला कोड टाका."
    override val msgUnableSendOtp = "OTP पाठवता आला नाही. बॅकएंड URL किंवा इंटरनेट तपासा."
    override val msgSendOtpAndEnterCode = "आधी OTP पाठवा आणि 4–6 अंकी कोड टाका."
    override val msgOtpVerifiedCreateFormat = "मोबाइल OTP पडताळला! तपशील भरा आणि %1\$s प्रोफाइल तयार करा दाबा."
    override val msgIncorrectOtp = "चुकीचा किंवा कालबाह्य OTP. नवीन OTP मागवा."
    override val msgServerOtpUnavailable = "सर्व्हर OTP सेवा उपलब्ध नाही. लाइव्ह बॅकएंड जोडा."
    override val msgEnterFullName = "पूर्ण नाव आवश्यक आहे."
    override val msgVerifyMobileOtpFirst = "कृपया आधी मोबाइल OTP पडताळा."
    override val msgAccountCreatedFormat = "स्वागत आहे %1\$s! %2\$s खाते तयार झाले (%3\$s)."
    override val msgLoggedInFormat = "%1\$s (%2\$s) म्हणून लॉग इन झाले"
    override val msgSignedOut = "वापरकर्ता खात्यातून साइन आउट झाले."
    override val msgDuplicateOwnerBlocked = "सुरक्षा बंदी: मालक खाते आधीच अस्तित्वात आहे. नवीन मालक खाते बनवता येत नाही."
    override val msgBootstrapRequired = "सर्व्हर बूटस्ट्रॅप अधिकार कोड टाका."
    override val msgEnterPasswords = "मालक लॉग इन पासवर्ड टाका आणि पुष्टी करा."
    override val msgPasswordsDoNotMatch = "दोन्ही पासवर्ड जुळत नाहीत."
    override val msgPasswordTooShort = "पासवर्ड किमान 8 अक्षरांचा असावा."
    override val msgPinFourDigits = "अ‍ॅडमिन पिन नेमका 4 अंकांचा असावा."
    override val msgPinsDoNotMatch = "4-अंकी पिन जुळत नाही."
    override val msgOwnerCreatedFormat = "%1\$s साठी मालक प्रोफाइल तयार झाली. आता नवीन मालक नोंदणी कायमची बंद आहे."
    override val msgOwnerLockedSession = "मालक सत्र लॉक झाले."
    override val msgOwnerTimedOut = "5 मिनिटे निष्क्रिय राहिल्याने मालक सत्र संपले. पुन्हा पिन टाका."
    override val msgOwnerUnlocked = "मालक मास्टर कंट्रोल उघडले."
    override val msgInvalidPinAttemptsFormat = "चुकीचा 4-अंकी मालक पिन. %1\$d प्रयत्न शिल्लक."
    override val msgTooManyPinAttemptsFormat = "खूप चुकीचे प्रयत्न. %1\$d सेकंदांसाठी लॉक."
    override val msgOwnerSessionRequired = "सक्रिय मालक सत्र आवश्यक आहे."
    override val msgVerifyOtpBeforePinChange = "आधी नोंदणीकृत मोबाइलवर आलेला OTP पडताळा."
    override val msgPinUpdatedSuccess = "नवीन अ‍ॅडमिन पिन सर्व्हरवर सुरक्षित अद्यतनित झाला."
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) साठी डेमो प्रोफाइल अद्यतनित झाली"
    override val msgJobPostedFormat = "%1\$s मध्ये डेमो काम टाकले! शुल्क: %2\$d कॉइन."
    override val msgAlreadyAppliedFormat = "%1\$s साठी आधीच अर्ज केला आहे"
    override val msgApplicationSentFormat = "%1\$s साठी अर्ज पाठवला"
    override val msgApplicationWithdrawnFormat = "अर्ज %1\$s मागे घेतला"
    override val msgApplicationUpdatedFormat = "अर्ज %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "साप्ताहिक तपासणी नोंदवली: 1 · मी सुरक्षित आहे."
    override val msgCheckInProblemRecorded = "धोका नोंदवला (2 · अडचण). सुरक्षा कक्षाला कळवले."
    override val msgCheckInAdminRequested = "तातडीचा अ‍ॅडमिन कॉलबॅक विनंती (3). कुटुंब अलर्ट रांगेत."
    override val msgSafetyComplaintSubmittedFormat = "सुरक्षा प्रकरण %1\$s नोंदवले गेले."
    override val msgWithdrawalsFrozen = "तातडीची बंदी सुरू: सर्व पैसे काढणे लगेच बंद केले."
    override val msgWithdrawalsUnfrozen = "पडताळणीनंतर पैसे काढणे सुरू झाले."
    override val msgOwnerNoticePublished = "लाल LOBORO अ‍ॅडमिन सूचना प्रसिद्ध झाली."
}
