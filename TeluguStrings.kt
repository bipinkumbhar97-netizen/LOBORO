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

object TeluguStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "గ్లోబల్ జాబ్ & సర్వీస్"
    override val demoPreviewBanner = "డెమో ప్రివ్యూ డేటా · లైవ్ కోసం సెట్టింగ్స్‌లో బ్యాకెండ్ API కలపండి"
    override val verifiedNormalAccountBanner = "ధృవీకరించబడిన వినియోగదారు ఖాతా · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO అడ్మిన్ ప్రకటన"
    override val maintenanceModeBanner = "నిర్వహణ మోడ్ అమల్లో ఉంది · నియామకాలు, వాలెట్ తాత్కాలికంగా ఆపివేయబడ్డాయి. అత్యవసర 112 మరియు భద్రతా సేవలు కొనసాగుతాయి."
    override val navHome = "హోమ్"
    override val navSearchJobs = "పని వెతకండి"
    override val navPostJob = "పని పోస్ట్"
    override val navWallet = "వాలెట్"
    override val navMyApplications = "నా దరఖాస్తులు"
    override val navMyJobs = "నా పనులు"
    override val navNotifications = "నోటిఫికేషన్లు"
    override val navHelpSafety = "సహాయం & భద్రత"
    override val navProfile = "ప్రొఫైల్"
    override val navSettings = "సెట్టింగ్స్"
    override val navAdmin = "యజమాని నియంత్రణ"
    override val navBadgesLoyalty = "బ్యాడ్జీలు & లాయల్టీ"
    override val navIvrKeypad = "కీప్యాడ్ & IVR"
    override val backLabel = "వెనుకకు"
    override val homeLabel = "హోమ్"
    override val languageLabel = "భాష"
    override val languageSelectorTitle = "12 భాషలు"
    override val activeBadgeLabel = "సక్రియం"
    override val closeLabel = "మూసివేయండి"
    override val okLabel = "సరే"
    override val understoodLabel = "అర్థమైంది"
    override val cancelLabel = "రద్దు చేయండి"
    override val doneLabel = "పూర్తయింది"
    override val confirmActionLabel = "నిర్ధారించండి"
    override val resetLabel = "రీసెట్"
    override val sendLabel = "పంపండి"

    override val shareAppTitle = "LOBORO యాప్ షేర్ చేయండి"
    override val shareAppCta = "మిత్రులకు షేర్ చేసి బహుమతులు పొందండి"
    override val yourReferralLinkLabel = "మీ రిఫరల్ లింక్"
    override val loboroLinkLabel = "LOBORO లింక్"
    override val shareMenuButton = "షేర్ మెనూ"
    override val copyLinkButton = "లింక్ కాపీ చేయండి"
    override val referralCopiedToast = "రిఫరల్ సందేశం కాపీ అయింది"
    override val openingShareMenuToast = "షేర్ మెనూ తెరుచుకుంటోంది"
    override val shareMessageTemplate = "LOBORO గ్లోబల్ జాబ్ & సర్వీస్‌లో చేరండి! భారతదేశమంతటా రోజువారీ కూలీ లేదా నెలవారీ జీతం పనులు పొందండి. నా రిఫరల్ ID %1\$s వాడండి: %2\$s"

    override val registerWorkerEmployerCta = "కార్మికుడు / యజమానిగా నమోదు చేసుకోండి"
    override val logInLabel = "లాగిన్"
    override val signOutLabel = "సైన్ అవుట్"
    override val voiceSearchHint = "పని లేదా నగరం మాట్లాడండి లేదా టైప్ చేయండి (ఉదా. హైదరాబాద్‌లో మేస్త్రీ)"
    override val tapMicToSpeak = "మాట్లాడి పని వెతకడానికి మైక్ నొక్కండి"
    override val listeningStatus = "వింటున్నాం... మీకు కావలసిన పనిని చెప్పండి"
    override val stopListening = "వినడం ఆపండి"
    override val searchAction = "వెతకండి"
    override val retryVoice = "మళ్ళీ మాట్లాడండి"
    override val voiceMicPermissionNeeded = "మీరు వాయిస్ శోధన కోసం మైక్ నొక్కినప్పుడు మాత్రమే మైక్ అనుమతి అడుగుతుంది."
    override val voiceUnavailableHonest = "ఈ పరికరంలో వాయిస్ గుర్తింపు సేవ ఇన్‌స్టాల్ కాలేదు. క్లౌడ్ వాయిస్ సేవను జోడించండి లేదా క్రింది ఎంపికను నొక్కండి."
    override val voiceNoMatchError = "మాట స్పష్టంగా గుర్తించలేదు. దయచేసి స్పష్టంగా మాట్లాడండి లేదా క్రింది నమూనా నొక్కండి."
    override val voiceNetworkError = "నెట్‌వర్క్ లోపం. ఇంటర్నెట్ తనిఖీ చేయండి లేదా టైప్ చేయండి."
    override val voiceStoppedError = "వాయిస్ ఇన్‌పుట్ ఆగిపోయింది (కోడ్ %1\$d). టైప్ చేయండి లేదా మళ్ళీ ప్రయత్నించండి."
    override val voicePrivacyHint = "గోప్యత: మైక్ సాధారణంగా ఆఫ్‌లో ఉంటుంది, మీరు నొక్కినప్పుడే ఆన్ అవుతుంది."
    override val clearSearchDesc = "శోధన క్లియర్ చేయండి"
    override val spokenSamples = listOf(
        "హైదరాబాద్‌లో మేస్త్రీ" to "Mason",
        "పుణెలో ఎలక్ట్రీషియన్" to "Electrician",
        "చెన్నై హోటల్ వంటవారు" to "Cook",
        "విజయవాడ డ్రైవర్" to "Driver",
        "సూరత్ ప్యాకింగ్ పని" to "Packing"
    )
    override val dailyJobsTitle = "రోజువారీ పనులు (Daily)"
    override val dailyJobsSubtitle = "రోజువారీ కూలీ · నెలవారీ పనుల నుండి వేరుగా"
    override val monthlyJobsTitle = "నెలవారీ జీతం పనులు"
    override val monthlyJobsSubtitle = "స్థిర నెలవారీ జీతం · సెలవు & వసతి వివరాలు"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "పని విభాగాలు (24)"
    override val walletStripSummaryFormat = "%1\$d కాయిన్లు (₹%2\$d) · 100%% విత్‌డ్రా అర్హత"

    override val outOfStateTitle = "ఇతర రాష్ట్రాలు & గ్లోబల్ పని శోధన"
    override val willingToRelocate = "వేరే రాష్ట్రానికి వెళ్లడానికి సిద్ధంగా ఉన్నాను"
    override val filterCountry = "దేశం"
    override val filterState = "రాష్ట్రం"
    override val filterDistrict = "జిల్లా"
    override val filterCity = "నగరం"
    override val filterDistance = "దూరం"
    override val upToKmFormat = "%1\$d కి.మీ వరకు"
    override val filterFoodIncluded = "భోజనం ఉచితం"
    override val filterAccommodation = "గది / వసతి"
    override val allCategoriesLabel = "అన్ని విభాగాలు"
    override val noMatchingJobsTitle = "మీ ఫిల్టర్లకు తగిన పనులు లేవు"
    override val noMatchingJobsSubtitle = "ఫిల్టర్లను రీసెట్ చేయండి లేదా 'ఇతర రాష్ట్ర పని' ఆన్ చేయండి."
    override val showAllJobsButton = "అన్ని పనులు చూపించు"
    override val dailyWageJobBadge = "రోజువారీ కూలీ పని"
    override val monthlySalaryJobBadge = "నెలవారీ జీతం పని"
    override val demoDataTag = "డెమో"
    override val originalLangFormat = "అసలు భాష: %1\$s"
    override val preTranslatedPreviewNote = "ముందుగా అనువదించిన ప్రివ్యూ సక్రియంగా ఉంది. లైవ్ పనుల కోసం సెట్టింగ్స్‌లో ట్రాన్స్‌లేషన్ API కీ కలపండి."
    override val configureTranslationApiNote = "అన్ని 12 భాషల్లో లైవ్ అనువాదం కోసం సెట్టింగ్స్‌లో ట్రాన్స్‌లేషన్ API కీ కలపండి."
    override val translatedToggle = "అనువాదం"
    override val originalToggle = "అసలు"
    override val compensationLabel = "వేతనం / జీతం"
    override val locationLabel = "ప్రాంతం"
    override val employerLabel = "యజమాని"
    override val vacanciesUnit = "ఖాళీలు"
    override val perDayFormat = "₹%1\$d / రోజు"
    override val perMonthFormat = "₹%1\$d / నెల"
    override val coinsCountFormat = "%1\$d కాయిన్లు"
    override val foodBadge = "భోజనం"
    override val stayBadge = "వసతి"
    override val shareJobButton = "పని షేర్ చేయండి"
    override val applyNow = "దరఖాస్తు చేయండి"
    override val saveJob = "సేవ్ చేయండి"
    override val negotiateChat = "మాట్లాడండి / చాట్"
    override val reportJob = "ఫిర్యాదు చేయండి"
    override val foodAvailable = "భోజనం ఉంది"
    override val accommodationAvailable = "వసతి ఉంది"
    override val notProvided = "చేర్చబడలేదు"
    override val workersNeeded = "కావాల్సిన కార్మికులు"
    override val workHoursLabel = "పని గంటలు"
    override val overtimeLabel = "ఓవర్‌టైమ్"
    override val paymentFreqLabel = "చెల్లింపు"
    override val weeklyHolidayLabel = "వారాంతపు సెలవు"
    override val leavePolicyLabel = "సెలవు నియమాలు"
    override val joiningDateLabel = "చేరే తేదీ"
    override val expiryLabel = "గడువు"
    override val translatedBadgeLabel = "అనువదించినది"

    override val postingPausedFormat = "పని పోస్ట్ చేయడం ప్రస్తుతం యజమాని నియంత్రణ (%1\$s) ద్వారా నిలిపివేయబడింది."
    override val selectCategoryLabel = "విభాగం ఎంచుకోండి (24 విభాగాలు)"
    override val jobTitleLabel = "పని శీర్షిక"
    override val jobTitlePlaceholder = "ఉదా. హాస్టల్ భవనానికి 4 మేస్త్రీలు కావాలి"
    override val jobDescLabel = "పని వివరాలు"
    override val jobDescPlaceholder = "పని వివరాలు, భద్రతా పరికరాలు, భోజనం & వసతి సమాచారం"
    override val dailyWageInrLabel = "రోజువారీ కూలీ (₹)"
    override val monthlySalaryInrLabel = "నెలవారీ జీతం (₹)"
    override val vacanciesLabel = "ఖాళీల సంఖ్య"
    override val cityTownLabel = "నగరం / పట్టణం"
    override val stateLabel = "రాష్ట్రం"
    override val transparentJobFeeTitle = "పారదర్శక జాబ్ ఫీజు: %1\$d కాయిన్లు (₹%2\$d)"
    override val configuredByOwnerSub = "యజమాని నిర్ణయించినది · ఛార్జ్ సమయం: %1\$s · అందుబాటు: %2\$d కాయిన్లు"
    override val confirmAndPostJobButton = "నిర్ధారించి పని పోస్ట్ చేయండి (%1\$d కాయిన్లు)"

    override val walletBalanceTitle = "LOBORO కాయిన్ బ్యాలెన్స్"
    override val withdrawableValueFormat = "₹%1\$d విత్‌డ్రా విలువ (1 కాయిన్ = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% సమాన విత్‌డ్రా నియమం"
    override val withdrawableRuleBody = "కొన్న, గిఫ్ట్, ఆఫర్, రిఫరల్, బ్యాడ్జ్ లేదా లాయల్టీ కాయిన్లన్నీ సమాన నగదు విలువ మరియు 100% విత్‌డ్రా అర్హత కలిగి ఉంటాయి. లాక్ చేసిన కాయిన్లు ఉండవు."
    override val buyCoins = "కాయిన్లు కొనండి"
    override val withdrawCoins = "డబ్బు తీయండి"
    override val walletActionsPausedNote = "కొన్ని వాలెట్ సేవలు యజమాని ద్వారా ఆపబడ్డాయి. మీ బ్యాలెన్స్ మరియు ఆమోదించిన రిఫండ్‌లు సురక్షితంగా ఉంటాయి."
    override val coinPackagesTitle = "కాయిన్ ప్యాకేజీలు (పారదర్శక ధర)"
    override val bankSecurityTitle = "బ్యాంక్ / UPI & ముఖ ధృవీకరణ భద్రత"
    override val payoutDestinationLabel = "ధృవీకరించిన ఖాతా: %1\$s"
    override val bankSecurityStepsNote = "బ్యాంక్/UPI మార్చడానికి తప్పనిసరి తనిఖీలు: రిజిస్టర్డ్ మొబైల్ OTP + లైవ్ సెల్ఫీ పోలిక + తాత్కాలిక చెల్లింపు నిలుపుదల."
    override val changeBankUpiButton = "బ్యాంక్ / UPI మార్చండి (OTP + ఫేస్ మ్యాచ్)"
    override val unfreezePayoutsButton = "విత్‌డ్రా అన్‌లాక్ చేయండి"
    override val lostPhoneFreezeButton = "ఫోన్ పోయిందా? విత్‌డ్రా ఆపండి"
    override val payoutFreezeActiveNote = "విత్‌డ్రా నిలుపుదల సక్రియంగా ఉంది. గుర్తింపు ధృవీకరణ వరకు డబ్బు తీయడం ఆపబడుతుంది."
    override val transactionHistory = "కాయిన్ లావాదేవీల పట్టిక"
    override val demoLedgerSuffix = "(డెమో పట్టిక)"
    override val buyCoinsDialogTitleFormat = "%1\$d కాయిన్లు కొనండి (₹%2\$d)"
    override val paymentNotConnectedBody = "లైవ్ Razorpay / Cashfree UPI పేమెంట్ ఇంకా కనెక్ట్ కాలేదు. నిజమైన డబ్బు తీసుకునే ముందు ప్రొడక్షన్ కీలు కలపండి."
    override val withdrawDialogTitleFormat = "₹%1\$d విత్‌డ్రా చేయండి"
    override val withdrawDialogBodyFormat = "పూర్తి బ్యాలెన్స్ (%1\$d కాయిన్లు) సమాన విలువతో 100%% విత్‌డ్రా చేయవచ్చు.\nఖాతా: %2\$s\n\nఈ బిల్డ్‌లో లైవ్ IMPS / UPI గేట్‌వే కనెక్ట్ కాలేదు."
    override val bankChangeDialogTitle = "3-దశల బ్యాంక్ / UPI మార్పు రక్షణ"
    override val bankChangeDialogBody = "ఫోన్ పోయినా కార్మికులను రక్షించడానికి బ్యాంక్/UPI మార్చడానికి ఇవి అవసరం:\n1. రిజిస్టర్డ్ మొబైల్ OTP తనిఖీ\n2. రిజిస్ట్రేషన్ ఫోటోతో లైవ్ ముఖం పోలిక\n3. విడుదలకు ముందు భద్రతా వేచి ఉండే సమయం"
    override val receiptDialogTitle = "లావాదేవీ రసీదు"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "రిఫరెన్స్: %1\$s"
    override val receiptTypeLabel = "రకం: %1\$s"
    override val receiptCoinsLabel = "కాయిన్లు: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "స్థితి: %1\$s"
    override val receiptTimeLabel = "సమయం: %1\$s"
    override val receiptWithdrawableYes = "విత్‌డ్రా అర్హత: 100% అవును"

    override val employerAppsHeading = "దరఖాస్తులు & నేరుగా చాట్"
    override val secureChatHeading = "సురక్షిత కార్మికుడు ↔ యజమాని చాట్"
    override val secureChatSubtitle = "మీరు స్వయంగా పంచుకునే వరకు ఫోన్ నంబర్లు దాచబడతాయి. తెరవడానికి లేదా బ్లాక్ చేయడానికి నొక్కండి."
    override val chatButton = "చాట్"
    override val workerEmployerLineFormat = "కార్మికుడు: %1\$s (%2\$s) · యజమాని: %3\$s"
    override val shortlistButton = "షార్ట్‌లిస్ట్"
    override val acceptButton = "ఆమోదించండి"
    override val withdrawButton = "వెనక్కి తీసుకోండి"
    override val phoneHiddenPrivacy = "గోప్యత సక్రియం: ఇరువైపులా అంగీకరించే వరకు వ్యక్తిగత ఫోన్ నంబర్లు కనిపించవు."
    override val blockUserLabel = "బ్లాక్"
    override val userBlockedNotice = "మీరు ఈ చాట్‌ను బ్లాక్ చేశారు. అవసరమైతే భద్రతా విభాగంలో ఫిర్యాదు చేయండి."
    override val chatPlaceholder = "మీ భాషలో సందేశం టైప్ చేయండి..."

    override val automaticBadgePrefix = "ఆటోమేటిక్ బ్యాడ్జ్: %1\$s"
    override val badgeStatsFormat = "రేటింగ్ %1\$.1f ★ · %2\$d ధృవీకరించిన పని దినాలు · %3\$d పూర్తయిన పనులు"
    override val progressToFormat = "%1\$s బ్యాడ్జ్ పురోగతి: %2\$d / %3\$d రోజులు"
    override val badgeAntiAbuseNote = "బ్యాడ్జీలు పూర్తయిన పనులు, ధృవీకరించిన హాజరు మరియు నిష్పక్షపాత రేటింగ్‌ల ద్వారా మాత్రమే వస్తాయి — కొనుగోలు చేయలేరు."
    override val badgeTiersTitle = "5 ఆటోమేటిక్ బ్యాడ్జ్ స్థాయిలు"
    override val minWorkdaysFormat = "కనీసం %1\$d పని దినాలు · కనీసం %2\$.1f★ రేటింగ్"
    override val badgeAppealsNote = "న్యాయమైన రక్షణ: అకస్మాత్తుగా వచ్చే అనుమానాస్పద 1-స్టార్ రేటింగ్‌లు అప్పీల్ ద్వారా సమీక్షించబడతాయి."
    override val loyaltyTitle = "సీనియారిటీ & లాయల్టీ ఆర్థిక సహాయం"
    override val loyaltySubtitle = "పారదర్శక త్రైమాసిక సంక్షేమ & మైలురాయి బోనస్"
    override val loyaltyDisclaimer = "ముఖ్యమైన ప్రకటన: ఇది బీమా కాదు, హామీ ఇవ్వబడిన నెలవారీ పెన్షన్ కాదు. అర్హత, పని దినాలు, బడ్జెట్ మరియు ఆమోదంపై ఆధారపడి ఉంటుంది."
    override val loyaltyMinMembershipFormat = "కనీస సభ్యత్వం: %1\$d నెలలు"
    override val loyaltyWorkdaysFormat = "ధృవీకరించిన పని దినాలు: %1\$d+ రోజులు"
    override val loyaltyRequiredBadgeFormat = "అవసరమైన బ్యాడ్జ్: %1\$s+"
    override val loyaltyRequiredRatingFormat = "కనీస రేటింగ్: %1\$.1f★"
    override val loyaltyBudgetFormat = "ఆమోదించిన సహాయం: ₹%1\$d · బడ్జెట్: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "కార్మికుల భద్రత & అత్యవసర సహాయం"
    override val callEmergency112 = "అత్యవసర 112 కు కాల్ చేయండి"
    override val weeklyCheckInTitle = "వారపు భద్రతా తనిఖీ"
    override val weeklyCheckInQuestion = "మీరు సురక్షితంగా ఉన్నారా?"
    override val checkInOpt1 = "1 · నేను సురక్షితంగా ఉన్నాను"
    override val checkInOpt2 = "2 · నాకు సమస్య ఉంది"
    override val checkInOpt3 = "3 · LOBORO అడ్మిన్‌తో మాట్లాడాలి"
    override val reportSafetyIssue = "భద్రత / జీతం ఫిర్యాదు చేయండి"
    override val safetyOperationalNote = "పని పోస్టింగ్ లేదా చెల్లింపులు ఆపినా భద్రతా సహాయం ఎల్లప్పుడూ పనిచేస్తుంది."
    override val safetyDisclaimerNote = "తక్షణ ప్రమాదంలో నేరుగా 112 కు కాల్ చేయండి. నిష్పక్షపాత మధ్యవర్తిత్వం కోసం LOBORO ఫిర్యాదులను నమోదు చేస్తుంది."
    override val everyDaysFormat = "ప్రతి %1\$d రోజులకు"
    override val lastStatusFormat = "చివరి తనిఖీ: %1\$s"
    override val checkInNoResponseNote = "వరుసగా 2 తనిఖీలు తప్పిపోతే లేదా సమస్యను ఎంచుకుంటే LOBORO SMS, అడ్మిన్ పరిశీలన మరియు కుటుంబ సమాచారం పంపుతుంది."
    override val consentEmergencyTitle = "సమ్మతితో అత్యవసర లొకేషన్ & కుటుంబ సంప్రదింపు"
    override val workerIdLabel = "కార్మికుడి ID: %1\$s"
    override val homeOriginLabel = "స్వస్థలం: %1\$s, %2\$s"
    override val currentJobCityLabel = "ప్రస్తుత పని నగరం: %1\$s"
    override val emergencyContactLabel = "అత్యవసర సంప్రదింపు: %1\$s (%2\$s)"
    override val consentGranted = "సమ్మతి ఉంది"
    override val consentPending = "సమ్మతి పెండింగ్"
    override val employerLoboroIdInput = "యజమాని LOBORO ID (ఉదా. LB819)"
    override val currentSiteInput = "ప్రస్తుత పని నగరం / స్థలం"
    override val describeIssueInput = "భద్రత లేదా కూలీ సమస్యను వివరించండి"
    override val submitSafetyDeskButton = "భద్రతా విభాగానికి పంపండి"
    override val safetyCasesHeading = "ఇటీవలి భద్రతా కేసులు (ఆడిట్ చేయదగినవి)"
    override val ivrTitle = "కీప్యాడ్ ఫోన్ మిస్డ్-కాల్ & IVR మెనూ"
    override val ivrSubtitle = "స్మార్ట్‌ఫోన్ లేకుండా టోల్-ఫ్రీ / మిస్డ్-కాల్ ద్వారా పనిచేస్తుంది"
    override val ivrArchNote = "లైవ్ సిస్టమ్ Exotel / Knowlarity / Twilio Voice తో కలుస్తుంది. 12-భాషల వాయిస్ మెనూ పరీక్షించడానికి కీలను నొక్కండి."
    override val ivrMenuTitle = "LOBORO వాయిస్ IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO కి స్వాగతం! వాయిస్ మెనూ వినడానికి కీప్యాడ్ నంబర్ నొక్కండి."
    override val pressKeyFormat = "%1\$s నొక్కండి → %2\$s"
    override val ivrSelectedSummaryFormat = "ఎంచుకున్నది [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "నేటి రోజువారీ కూలీ పనులు",
        "2" to "నెలవారీ జీతం పనులు",
        "3" to "వారపు భద్రతా తనిఖీ ('మీరు సురక్షితంగా ఉన్నారా?')",
        "4" to "వాలెట్ కాయిన్లు & తాజా స్థితి వినండి",
        "5" to "అత్యవసర అడ్మిన్ కాల్‌బ్యాక్",
        "6" to "దరఖాస్తు స్థితి తనిఖీ",
        "0" to "వాయిస్ భాష మార్చండి"
    )

    override val userRegTitle = "కార్మికుడు & యజమాని నమోదు"
    override val userLoginTitle = "కార్మికుడు & యజమాని లాగిన్"
    override val userAuthSubtitle = "OTP-ధృవీకరించిన సాధారణ ఖాతా · రహస్య యజమాని వ్యవస్థ నుండి పూర్తిగా వేరు"
    override val registerTab = "నమోదు"
    override val loginTab = "లాగిన్"
    override val dbOtpNotConnectedTitle = "బ్యాకెండ్ డేటాబేస్ / OTP కనెక్ట్ కాలేదు"
    override val dbOtpNotConnectedBody = "అసలైన కార్మికుడు & యజమాని ఖాతాలను సేవ్ చేయడానికి LOBORO_BACKEND_URL కలపండి."
    override val selectAccountTypeStep = "1. ఖాతా రకం ఎంచుకోండి"
    override val workerAccountLabel = "కార్మికుడు"
    override val employerAccountLabel = "యజమాని"
    override val regPausedForRoleFormat = "%1\$s నమోదు ప్రస్తుతం యజమాని ద్వారా నిలిపివేయబడింది."
    override val preferredLanguageLabel = "ఇష్టమైన యాప్ భాష (12 భాషలు)"
    override val fullNameStepLabel = "2. పూర్తి పేరు *"
    override val businessNameStepLabel = "2. వ్యాపారం / కాంట్రాక్టర్ పూర్తి పేరు *"
    override val mobileStepLabel = "3. మొబైల్ నంబర్ (10 అంకెలు) *"
    override val sendRegOtpButton = "OTP పంపండి"
    override val resendMobileOtpButton = "మళ్ళీ OTP పంపండి"
    override val enterOtpStepLabel = "4. మొబైల్ OTP నమోదు చేయండి *"
    override val verifyOtpButton = "OTP ధృవీకరించండి"
    override val verifiedLabel = "ధృవీకరించబడింది"
    override val mobileVerifiedNote = "సర్వర్‌లో మొబైల్ ధృవీకరించబడింది"
    override val homeStateLabel = "స్వరాష్ట్రం"
    override val homeDistrictLabel = "స్వజిల్లా"
    override val stateShortLabel = "రాష్ట్రం"
    override val cityShortLabel = "నగరం"
    override val workCityStateLabel = "ప్రస్తుత పని నగరం & రాష్ట్రం"
    override val businessLocationLabel = "వ్యాపార నగరం & రాష్ట్రం"
    override val skillsCategoriesLabel = "నైపుణ్యాలు / పని (ఉదా. మేస్త్రీ, ఎలక్ట్రీషియన్)"
    override val hiringCategoriesLabel = "నియామక విభాగాలు"
    override val emergencyContactNameLabel = "అత్యవసర కుటుంబ సంప్రదింపు పేరు"
    override val emergencyContactPhoneLabel = "అత్యవసర సంప్రదింపు ఫోన్"
    override val uniqueLbIdNotice = "నమోదు పూర్తయ్యాక సర్వర్ శాశ్వత LB ID (LB2000+) ఇస్తుంది. VIP & యజమాని నంబర్లు సురక్షితం."
    override val creatingProfileLabel = "ప్రొఫైల్ సృష్టించబడుతోంది..."
    override val createProfileButton = "కార్మికుడు / యజమాని ప్రొఫైల్ సృష్టించండి"
    override val loginHeading = "రిజిస్టర్డ్ మొబైల్ OTP తో లాగిన్ చేయండి"
    override val loginSubtitle = "కార్మికుడు లేదా యజమానిగా నమోదు చేసిన మొబైల్ నంబర్ ఇవ్వండి."
    override val registeredMobileLabel = "నమోదిత మొబైల్ నంబర్"
    override val sendLoginOtpButton = "లాగిన్ OTP పంపండి"
    override val resendLoginOtpButton = "OTP మళ్ళీ పంపండి"
    override val enterLoginOtpLabel = "లాగిన్ OTP నమోదు చేయండి"
    override val verifyingOtpLabel = "ధృవీకరిస్తోంది..."
    override val verifyOtpOpenHomeButton = "OTP ధృవీకరించి హోమ్ తెరవండి"
    override val backToHomepageButton = "హోమ్‌పేజీకి తిరిగి వెళ్ళండి"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "పాత్ర"
    override val offlinePreviewHeading = "ఆఫ్‌లైన్ ప్రొఫైల్ & ఫోటో ప్రివ్యూ"
    override val offlinePreviewCardTitle = "ప్రొఫైల్ నమోదు / మార్పు (ఆఫ్‌లైన్ ప్రివ్యూ)"
    override val offlinePreviewCardSubtitle = "లైవ్ డేటాబేస్ కలిపే వరకు స్థానిక ప్రివ్యూగా సేవ్ అవుతుంది."
    override val workLocationLabel = "పని స్థలం (నగరం, రాష్ట్రం)"
    override val businessAddressLabel = "వ్యాపార నగరం, రాష్ట్రం"
    override val skillsExpLabel = "నైపుణ్యాలు / పని రకం"
    override val businessCatLabel = "వ్యాపార రకం / నియామక విభాగాలు"
    override val aadhaarPrivacyNote = "డేటా భద్రత: LOBORO పరికరంలో ఆధార్ చిత్రాలను నిల్వ చేయదు — ధృవీకరించిన హాష్ మరియు సమ్మతి మాత్రమే ఉంచుతుంది."
    override val selectProfilePhotoBtn = "ప్రొఫైల్ ఫోటో ఎంచుకోండి (ఫోటో పికర్)"
    override val photoSelectedBtn = "ఫోటో ఎంచుకోబడింది ✓"
    override val offlineConsentCheck = "భద్రతా తనిఖీ మరియు అందుబాటులో లేనప్పుడు కుటుంబానికి సమాచారం ఇవ్వడానికి నా సమ్మతి ఉంది."
    override val previewProfileBtn = "ప్రివ్యూ ప్రొఫైల్ సేవ్ చేయండి"
    override val audienceScopeFormat = "వినియోగదారులు: %1\$s · ప్రాంతం: %2\$s · %3\$s"
    override val settingsHeading = "సెట్టింగ్స్ & ప్లాట్‌ఫారమ్ సమాచారం"
    override val languageSectionTitle = "యాప్ భాష (మొత్తం 12 భారతీయ భాషలు)"
    override val languageSectionSubtitle = "మీ ఖాతాకు విడిగా సేవ్ చేయబడుతుంది. ఇతర ఖాతాల భాష మారదు."
    override val languagePausedByOwner = "యజమాని నియంత్రణ ద్వారా భాష మార్పు తాత్కాలికంగా ఆపబడింది."
    override val lowDataTitle = "లో-డేటా మోడ్"
    override val lowDataSubtitle = "2G/3G గ్రామీణ నెట్‌వర్క్‌లలో డేటా ఆదా చేస్తుంది"
    override val reducedMotionTitle = "తక్కువ యానిమేషన్ & స్పష్టమైన అక్షరాలు"
    override val reducedMotionSubtitle = "స్పష్టమైన టెక్స్ట్ మరియు సులభమైన స్క్రీన్"
    override val privacyPolicyTitle = "గోప్యతా విధానం & డేటా రక్షణ"
    override val privacyPolicyBody = "• చాట్‌లో మీ అనుమతి లేకుండా ఫోన్ నంబర్లు కనిపించవు.\n• మీరు వాయిస్ శోధన నొక్కినప్పుడే మైక్ ఆన్ అవుతుంది.\n• ఫోటో ఎంపిక కోసం సురక్షిత ఫోటో పికర్ వాడబడుతుంది.\n• మీ సమ్మతితోనే కుటుంబానికి అత్యవసర లొకేషన్ పంపబడుతుంది."
    override val termsOfServiceTitle = "సేవా నిబంధనలు & న్యాయ నియమాలు"
    override val termsOfServiceBody = "• రోజువారీ కూలీ మరియు నెలవారీ జీతం పనులు విడివిడిగా ఉంటాయి.\n• ప్రతి LOBORO కాయిన్ 100% సమాన విలువ మరియు విత్‌డ్రా అర్హత కలిగి ఉంటుంది.\n• బ్యాడ్జీలు నిజమైన పని దినాలు & న్యాయమైన రేటింగ్ ద్వారా మాత్రమే వస్తాయి.\n• VIP IDలు (LB1–LB1999) యజమానికి మాత్రమే ప్రత్యేకించబడ్డాయి."
    override val helpSupportTitle = "సహాయం, మద్దతు & భద్రతా విభాగం"
    override val helpSupportBody = "• తక్షణ ప్రమాదంలో 112 కు కాల్ చేయండి (లాగిన్ లేకున్నా 24x7).\n• కూలీ లేదా వసతి ఫిర్యాదుల కోసం సహాయం & భద్రత విభాగంలో కేసు నమోదు చేయండి.\n• కీప్యాడ్ ఫోన్లకు టోల్-ఫ్రీ కాల్‌బ్యాక్ కోసం కీప్యాడ్ & IVR తెరవండి."
    override val backendChecklistTitle = "బ్యాకెండ్ & API అనుసంధాన స్థితి"
    override val providersLabel = "ప్రొవైడర్లు: %1\$s"
    override val secretsLabel = "సీక్రెట్ కీలు: %1\$s"

    override val ownerSetupTitle = "ఒక్కసారి మాత్రమే యజమాని / సూపర్ అడ్మిన్ సెటప్"
    override val ownerSetupSubtitle = "LOBORO నిర్మాతకు మాత్రమే ప్రత్యేకం. ఒక్కసారి నమోదు తర్వాత శాశ్వతంగా లాక్ అవుతుంది."
    override val ownerSetupLockNote = "భద్రతా లాక్: ఒక్క యజమాని ఖాతా మాత్రమే ఉంటుంది. కార్మికులు లేదా యజమానులు దీన్ని వాడలేరు."
    override val ownerBackendReqTitle = "యజమాని సర్వర్ కనెక్ట్ కాలేదు"
    override val ownerBackendReqBody = "పాస్‌వర్డ్ & 4-అంకెల PIN ను సర్వర్‌లో సురక్షితంగా ఉంచడానికి LOBORO_BACKEND_URL కలపండి."
    override val serverSetupAuthHeading = "1. సర్వర్ సెటప్ అనుమతి"
    override val bootstrapSecretLabel = "వన్-టైమ్ సర్వర్ బూట్‌స్ట్రాప్ కోడ్ *"
    override val bootstrapSecretPlaceholder = "మీ సర్వర్ OWNER_BOOTSTRAP_SECRET నుండి"
    override val ownerIdentityHeading = "2. యజమాని గుర్తింపు & మొబైల్ OTP"
    override val ownerNameField = "యజమాని పూర్తి పేరు *"
    override val ownerMobileField = "యజమాని వ్యక్తిగత మొబైల్ నంబర్ *"
    override val ownerSendOtpBtn = "యజమాని OTP పంపండి"
    override val ownerMobileVerifiedNote = "యజమాని మొబైల్ OTP ధృవీకరించబడింది"
    override val credentialsHeading = "3. పాస్‌వర్డ్ & 4-అంకెల అడ్మిన్ PIN"
    override val createPasswordLabel = "లాగిన్ పాస్‌వర్డ్ సృష్టించండి (8+ అక్షరాలు) *"
    override val confirmPasswordLabel = "లాగిన్ పాస్‌వర్డ్ నిర్ధారించండి *"
    override val passwordsMismatchError = "పాస్‌వర్డ్లు సరిపోలడం లేదు"
    override val createPinLabel = "4-అంకెల అడ్మిన్ PIN సృష్టించండి *"
    override val confirmPinLabel = "4-అంకెల అడ్మిన్ PIN నిర్ధారించండి *"
    override val pinsMismatchError = "PINలు సరిపోలడం లేదు"
    override val credentialsHashNote = "సర్వర్ పాస్‌వర్డ్ & PIN ను Argon2id తో భద్రపరుస్తుంది. యాప్‌లో సేవ్ చేయదు."
    override val registeringOwnerLabel = "యజమాని ఖాతా సృష్టిస్తోంది..."
    override val completeOwnerRegButton = "యజమాని నమోదు పూర్తి చేసి డాష్‌బోర్డ్ తెరవండి"
    override val returnToAppButton = "LOBORO యాప్‌కు తిరిగి వెళ్ళండి"
    override val adminPinHeader = "యజమాని నియంత్రణ · 4-అంకెల PIN అవసరం"
    override val adminPinPrompt = "మీ 4-అంకెల యజమాని అడ్మిన్ PIN ఇవ్వండి. సర్వర్‌లో పరిమితితో తనిఖీ చేయబడుతుంది."
    override val pinLockoutFormat = "ఎక్కువ తప్పు ప్రయత్నాలు. %1\$d సెకన్ల తర్వాత ప్రయత్నించండి."
    override val clrKeyLabel = "క్లియర్"
    override val verifyPinServerBtn = "సర్వర్‌లో 4-అంకెల PIN తనిఖీ చేయండి"
    override val pinSecurityPolicyFormat = "5 తప్పు ప్రయత్నాలకు లాక్ · 5 నిమిషాలు నిష్క్రియమైతే లాగౌట్ · మిగిలిన ప్రయత్నాలు: %1\$d"
    override val ownerMasterControlTitle = "యజమాని మాస్టర్ కంట్రోల్"
    override val ownerMasterSubtitle = "యజమాని సూపర్ అడ్మిన్ మాత్రమే · సర్వర్ PIN + OTP + ఆడిట్ లాగ్"
    override val ownerSessionLockedNote = "యజమాని సెషన్ లాక్ అయింది. మాస్టర్ కంట్రోల్ కోసం సర్వర్ ధృవీకరించిన 4-అంకెల PIN అవసరం."
    override val verifyOwnerPinBtn = "యజమాని 4-అంకెల PIN తనిఖీ చేయండి"
    override val ownerProfileLineFormat = "యజమాని ప్రొఫైల్ · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "నమోదిత మొబైల్: %1\$s · ఏకైక యజమాని ఖాతా (%2\$s)"
    override val activeSessionFormat = "సక్రియ యజమాని సెషన్ · %1\$dm %2\$02ds లో లాగౌట్"
    override val serverAuthorityNote = "సెషన్ టోకెన్ ధృవీకరించబడింది (సర్వర్ అధికారం)"
    override val lockAndExitBtn = "లాక్ చేసి నిష్క్రమించండి"
    override val mandatoryProtectionTitle = "తప్పనిసరి భద్రత & ఆర్థిక బాధ్యత రక్షణ"
    override val mandatoryProtectionBody = "ఫీచర్లు ఆపినా లేదా మెయింటెనెన్స్ మోడ్ ఆన్ చేసినా ఉన్న ఆర్థిక బాధ్యతలు, రిఫండ్‌లు మరియు 112 అత్యవసర సేవలు రద్దు కావు."
    override val changePinTitle = "అడ్మిన్ PIN మార్చండి (OTP ధృవీకరణ తప్పనిసరి)"
    override val changePinSubtitle = "యజమానికి మాత్రమే. ప్రస్తుత PIN కనిపించదు. నమోదిత మొబైల్ OTP తప్పనిసరి."
    override val otpToRegisteredMobileNote = "నమోదిత యజమాని మొబైల్‌కు మాత్రమే OTP పంపబడుతుంది: %1\$s"
    override val sendPinChangeOtpBtn = "నమోదిత యజమాని మొబైల్‌కు OTP పంపండి"
    override val otpDispatchedNote = "యజమాని మొబైల్ (%1\$s) కు OTP పంపబడింది."
    override val enterServerOtpLabel = "సర్వర్ OTP కోడ్ ఇవ్వండి"
    override val verifyOtpServerBtn = "సర్వర్‌లో OTP తనిఖీ చేయండి"
    override val otpVerifiedNewPinNote = "OTP ధృవీకరించబడింది. కొత్త 4-అంకెల యజమాని PIN ఇచ్చి నిర్ధారించండి."
    override val newPinLabel = "కొత్త 4-అంకెల PIN"
    override val confirmNewPinLabel = "కొత్త 4-అంకెల PIN నిర్ధారించండి"
    override val saveNewPinBtn = "నిర్ధారించి అడ్మిన్ PIN మార్చండి"
    override val confirmPinChangeTitle = "అడ్మిన్ PIN మార్పును నిర్ధారించండి"
    override val confirmPinChangeDesc = "సర్వర్‌లో 4-అంకెల యజమాని PIN మార్చాలా? సెషన్ కొనసాగుతుంది మరియు ఆడిట్ లాగ్ నమోదవుతుంది."
    override val pinUpdatedNote = "కొత్త 4-అంకెల యజమాని PIN సర్వర్‌లో అప్‌డేట్ అయింది."
    override val completeMasterControlTitle = "పూర్తి యజమాని మాస్టర్ కంట్రోల్ (25 మాడ్యూల్స్)"
    override val masterControlScopeSubtitle = "ప్రాంతం లేదా పాత్ర ప్రకారం తక్షణ ON/OFF నియంత్రణలు."
    override val scopeOptions = listOf(
        "గ్లోబల్ · భారతదేశం (అన్ని రాష్ట్రాలు)",
        "తెలంగాణ మాత్రమే",
        "తమిళనాడు మాత్రమే",
        "కార్మికులు మాత్రమే",
        "యజమానులు మాత్రమే"
    )
    override val masterControlNames = listOf(
        "1. పూర్తి యాప్ & మెయింటెనెన్స్ మోడ్",
        "2. కార్మికుల నమోదు",
        "3. యజమానుల నమోదు",
        "4. పని పోస్టింగ్",
        "5. పని శోధన",
        "6. రోజువారీ కూలీ పనులు",
        "7. నెలవారీ జీతం పనులు",
        "8. కాయిన్ కొనుగోళ్లు",
        "9. వాలెట్ విత్‌డ్రాలు",
        "10. జాబ్ ఫీజు & కాయిన్ ధర",
        "11. ఆఫర్లు & ప్రమోషన్లు",
        "12. రిఫరల్ బహుమతులు",
        "13. నోటిఫికేషన్లు & ప్రకటనలు",
        "14. కార్మికుడు & యజమాని ఖాతా నియంత్రణ",
        "15. పని విభాగాలు & ఉపవిభాగాలు",
        "16. రేటింగ్ & ఆటోమేటిక్ బ్యాడ్జీలు",
        "17. సీనియారిటీ & లాయల్టీ సహాయం",
        "18. అత్యవసర & కార్మిక భద్రతా వ్యవస్థ",
        "19. SMS హెచ్చరికలు",
        "20. IVR సేవలు",
        "21. భాష సెట్టింగ్స్ (12 భాషలు)",
        "22. దేశం, రాష్ట్రం & నగర లభ్యత",
        "23. VIP ID రిజర్వేషన్లు & నిర్వహణ",
        "24. నివేదికలు, ఫిర్యాదులు & మోడరేషన్",
        "25. పేమెంట్ గేట్‌వే ఇంటిగ్రేషన్"
    )
    override val publishNoticeTitle = "ఎరుపు LOBORO అడ్మిన్ ప్రకటన ప్రచురించండి"
    override val announcementMessageLabel = "ప్రకటన సందేశం"
    override val announcementPlaceholder = "ఉదా. ఇతర రాష్ట్ర కార్మికులకు కొత్త భద్రతా హెల్ప్‌లైన్"
    override val actionLinkLabel = "బటన్ పేరు"
    override val scopeFieldLabel = "ప్రాంతం / రాష్ట్ర పరిధి"
    override val audienceOptions = listOf("అందరు వినియోగదారులు", "కార్మికులు", "యజమానులు")
    override val broadcastNoticeBtn = "ఎరుపు అడ్మిన్ ప్రకటన పంపండి"
    override val confirmBroadcastTitle = "ఎరుపు LOBORO అడ్మిన్ ప్రకటన పంపాలా?"
    override val confirmBroadcastDescFormat = "సందేశం: %1\$s\nవినియోగదారులు: %2\$s · ప్రాంతం: %3\$s"
    override val coinPricingTitle = "కాయిన్ ధర & ఫీజు నియంత్రణలు"
    override val coinPricingSummaryFormat = "1 కాయిన్ = ₹%1\$d · రోజువారీ = %2\$d కాయిన్ · ప్రత్యేక = %3\$d కాయిన్లు · నెలవారీ = %4\$d కాయిన్లు · సమయం: %5\$s"
    override val dailyBtnFormat = "రోజువారీ +1 (%1\$d)"
    override val masonBtnFormat = "ప్రత్యేక +1 (%1\$d)"
    override val monthlyBtnFormat = "నెలవారీ +5 (%1\$d)"
    override val protectedVipIdsTitle = "రక్షిత VIP & యజమాని IDలు (ఎప్పటికీ ఆటోమేటిక్‌గా ఇవ్వబడవు)"
    override val protectedVipIdsNote = "సాధారణ వినియోగదారులకు ఎల్లప్పుడూ LB2000+ ఇస్తారు. ప్రత్యేక సంఖ్యలు యజమాని కేటాయింపుకు మాత్రమే."
    override val safetyInvestigationTitle = "భద్రతా కేసులు & ఫిర్యాదుల విచారణ విభాగం"
    override val manageCategoriesTitle = "24 పని విభాగాల నిర్వహణ (తక్షణ ON/OFF)"
    override val showAll24Label = "అన్ని 24 చూపించు"
    override val showLessLabel = "తక్కువ చూపించు"
    override val auditLogTitle = "యజమాని చర్యల ఆడిట్ లాగ్"
    override val confirmToggleTitleFormat = "%1\$s నిర్ధారించండి"
    override val confirmToggleDescFormat = "%3\$s కోసం \"%1\$s\" ను %2\$s చేయాలా? ఆర్థిక బాధ్యతలు మరియు 112 భద్రతా సేవలు రక్షితంగా ఉంటాయి."

    override val categories = mapOf(
        JobCategoryId.MASON to "మేస్త్రీ / రాజ్‌మిస్త్రీ",
        JobCategoryId.CONSTRUCTION_LABOUR to "నిర్మాణ కార్మికుడు",
        JobCategoryId.GENERAL_LABOUR to "సాధారణ కూలీ",
        JobCategoryId.PLUMBER to "ప్లంబర్",
        JobCategoryId.ELECTRICIAN to "ఎలక్ట్రీషియన్",
        JobCategoryId.PAINTER to "పెయింటర్",
        JobCategoryId.TILE_WORKER to "టైల్స్ పనివారు",
        JobCategoryId.CARPENTER to "వడ్రంగి / కార్పెంటర్",
        JobCategoryId.WELDER to "వెల్డర్",
        JobCategoryId.HOTEL_STAFF to "హోటల్ సిబ్బంది",
        JobCategoryId.COOK to "వంటవారు / కుక్",
        JobCategoryId.WAITER to "వెయిటర్",
        JobCategoryId.HOUSEKEEPING to "హౌస్‌కీపింగ్",
        JobCategoryId.SECURITY_GUARD to "సెక్యూరిటీ గార్డ్",
        JobCategoryId.DRIVER to "డ్రైవర్",
        JobCategoryId.DELIVERY_WORKER to "డెలివరీ కార్మికుడు",
        JobCategoryId.FACTORY_WORKER to "ఫ్యాక్టరీ కార్మికుడు",
        JobCategoryId.PACKING_WORKER to "ప్యాకింగ్ కార్మికుడు",
        JobCategoryId.MACHINE_OPERATOR to "మెషిన్ ఆపరేటర్",
        JobCategoryId.AGRICULTURE_WORKER to "వ్యవసాయ కార్మికుడు",
        JobCategoryId.OFFICE_ASSISTANT to "ఆఫీసు సహాయకుడు",
        JobCategoryId.SHOP_STAFF to "దుకాణ సిబ్బంది",
        JobCategoryId.DOMESTIC_WORKER to "ఇంటి పనివారు",
        JobCategoryId.OTHER_JOBS to "ఇతర పనులు"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "కార్మికుడు",
        UserRole.EMPLOYER to "యజమాని",
        UserRole.OWNER_SUPER_ADMIN to "యజమాని / సూపర్ అడ్మిన్"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "దరఖాస్తు అయింది",
        ApplicationStatus.UNDER_REVIEW to "పరిశీలనలో ఉంది",
        ApplicationStatus.SHORTLISTED to "షార్ట్‌లిస్ట్",
        ApplicationStatus.ACCEPTED to "ఆమోదించబడింది",
        ApplicationStatus.REJECTED to "తిరస్కరించబడింది",
        ApplicationStatus.WITHDRAWN to "వెనక్కి తీసుకున్నారు",
        ApplicationStatus.COMPLETED to "పూర్తయింది"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "పెండింగ్",
        TransactionStatus.SUCCESSFUL to "విజయవంతం",
        TransactionStatus.FAILED to "విఫలం",
        TransactionStatus.REFUNDED to "రిఫండ్ అయింది"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "కాయిన్ కొనుగోలు",
        TransactionType.GIFT to "బహుమతి క్రెడిట్",
        TransactionType.PROMO to "ప్రోమో క్రెడిట్",
        TransactionType.REFERRAL to "రిఫరల్ బోనస్",
        TransactionType.BADGE_REWARD to "బ్యాడ్జ్ బహుమతి",
        TransactionType.LOYALTY_SUPPORT to "లాయల్టీ సహాయం",
        TransactionType.JOB_FEE to "జాబ్ ఫీజు",
        TransactionType.WITHDRAWAL to "విత్‌డ్రా"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "జీతం / కూలీ బకాయి",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "శారీరక వేధింపు",
        SafetyComplaintCategory.HARASSMENT to "వేధింపులు",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "భోజనం / వసతి సమస్య",
        SafetyComplaintCategory.FRAUD to "ఉద్యోగ మోసం",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "అసురక్షిత పని ప్రదేశం",
        SafetyComplaintCategory.OTHER_EMERGENCY to "ఇతర అత్యవసరం"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "కొత్తది",
        SafetyCaseStatus.IN_REVIEW to "పరిశీలనలో",
        SafetyCaseStatus.ADMIN_VERIFIED to "అడ్మిన్ ధృవీకరించినది",
        SafetyCaseStatus.ACTION_TAKEN to "చర్య తీసుకున్నారు",
        SafetyCaseStatus.REFERRED to "బదిలీ అయింది",
        SafetyCaseStatus.CLOSED to "మూసివేయబడింది"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "ప్రారంభ స్థాయి",
        BadgeLevel.SILVER to "సిల్వర్",
        BadgeLevel.GOLD to "గోల్డ్",
        BadgeLevel.DIAMOND to "డైమండ్",
        BadgeLevel.PLATINUM to "ప్లాటినం"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "పని పోస్ట్ చేసేటప్పుడు",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "ధృవీకరించిన కనెక్షన్‌పై",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "దరఖాస్తు ఆమోదంపై"
    )
    override val indianStates = mapOf(
        "All States" to "అన్ని రాష్ట్రాలు",
        "Telangana" to "తెలంగాణ",
        "Andhra Pradesh" to "ఆంధ్రప్రదేశ్",
        "Tamil Nadu" to "తమిళనాడు",
        "Karnataka" to "కర్ణాటక",
        "Maharashtra" to "మహారాష్ట్ర",
        "Gujarat" to "గుజరాత్",
        "Assam" to "అస్సాం",
        "Bihar" to "బీహార్",
        "Uttar Pradesh" to "ఉత్తర ప్రదేశ్",
        "West Bengal" to "పశ్చిమ బెంగాల్",
        "Odisha" to "ఒడిశా",
        "Kerala" to "కేరళ",
        "Punjab" to "పంజాబ్"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "క్లౌడ్ డేటాబేస్ & భద్రతా నియమాలు",
        "otp_sms" to "OTP & SMS సేవ",
        "payment_gateway" to "UPI & కాయిన్ పేమెంట్ గేట్‌వే",
        "face_liveness" to "ముఖం పోలిక & లైవ్‌నెస్ తనిఖీ",
        "translation" to "లైవ్ 12-భాషల పని అనువాదం",
        "telecom_ivr" to "కీప్యాడ్ ఫోన్ మిస్డ్-కాల్ & IVR",
        "owner_pin_auth" to "యజమాని బూట్‌స్ట్రాప్ & 4-అంకెల PIN సర్వర్"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "కనెక్ట్ కాలేదు",
        IntegrationStatus.NEEDS_CREDENTIALS to "కీలు అవసరం",
        IntegrationStatus.CONNECTED to "కనెక్ట్ అయింది"
    )

    override val msgOwnerPrivilegeBlocked = "అనుమతి లేదు: సాధారణ వినియోగదారులు ఎప్పటికీ యజమాని / సూపర్ అడ్మిన్ కాలేరు."
    override val msgSwitchedPreviewFormat = "ప్రివ్యూ ఖాతాను %1\$s (%2\$s) కు మార్చబడింది."
    override val msgLanguageSavedFormat = "భాష %1\$s (%2\$s) కు మార్చబడింది"
    override val msgEnterNameBeforeOtp = "OTP కోరే ముందు మీ పూర్తి పేరును ఇవ్వండి."
    override val msgEnterValidMobile = "దయచేసి సరైన 10-అంకెల మొబైల్ నంబర్ ఇవ్వండి."
    override val msgOtpDispatchedFormat = "సర్వర్ OTP %1\$s కు పంపబడింది. మీ ఫోన్‌కు వచ్చిన కోడ్ ఇవ్వండి."
    override val msgUnableSendOtp = "OTP పంపలేకపోయాము. బ్యాకెండ్ URL లేదా ఇంటర్నెట్ తనిఖీ చేయండి."
    override val msgSendOtpAndEnterCode = "ముందు OTP పంపి 4–6 అంకెల కోడ్ నమోదు చేయండి."
    override val msgOtpVerifiedCreateFormat = "మొబైల్ OTP ధృవీకరించబడింది! వివరాలు నింపి %1\$s ప్రొఫైల్ సృష్టించండి నొక్కండి."
    override val msgIncorrectOtp = "తప్పు లేదా గడువు ముగిసిన OTP. కొత్త OTP కోరండి."
    override val msgServerOtpUnavailable = "సర్వర్ OTP అందుబాటులో లేదు. లైవ్ బ్యాకెండ్ కలపండి."
    override val msgEnterFullName = "పూర్తి పేరు అవసరం."
    override val msgVerifyMobileOtpFirst = "దయచేసి ముందు మొబైల్ OTP ధృవీకరించండి."
    override val msgAccountCreatedFormat = "స్వాగతం %1\$s! %2\$s ఖాతా సృష్టించబడింది (%3\$s)."
    override val msgLoggedInFormat = "%1\$s (%2\$s) గా లాగిన్ అయ్యారు"
    override val msgSignedOut = "వినియోగదారు ఖాతా నుండి సైన్ అవుట్ అయ్యారు."
    override val msgDuplicateOwnerBlocked = "భద్రతా నిరోధం: యజమాని ఖాతా ఇప్పటికే ఉంది. రెండవ యజమాని సృష్టించబడదు."
    override val msgBootstrapRequired = "సర్వర్ బూట్‌స్ట్రాప్ అధికారం కోడ్ నమోదు చేయండి."
    override val msgEnterPasswords = "యజమాని లాగిన్ పాస్‌వర్డ్ ఇచ్చి నిర్ధారించండి."
    override val msgPasswordsDoNotMatch = "పాస్‌వర్డ్లు సరిపోలడం లేదు."
    override val msgPasswordTooShort = "పాస్‌వర్డ్ కనీసం 8 అక్షరాలు ఉండాలి."
    override val msgPinFourDigits = "అడ్మిన్ PIN ఖచ్చితంగా 4 అంకెలు ఉండాలి."
    override val msgPinsDoNotMatch = "4-అంకెల PIN నిర్ధారణ సరిపోలడం లేదు."
    override val msgOwnerCreatedFormat = "%1\$s కోసం యజమాని ప్రొఫైల్ సృష్టించబడింది. కొత్త యజమాని నమోదు శాశ్వతంగా మూసివేయబడింది."
    override val msgOwnerLockedSession = "యజమాని సెషన్ లాక్ అయింది."
    override val msgOwnerTimedOut = "5 నిమిషాలు నిష్క్రియత వల్ల యజమాని సెషన్ ముగిసింది. మళ్ళీ PIN ఇవ్వండి."
    override val msgOwnerUnlocked = "యజమాని మాస్టర్ కంట్రోల్ తెరవబడింది."
    override val msgInvalidPinAttemptsFormat = "తప్పు 4-అంకెల యజమాని PIN. ఇంకా %1\$d ప్రయత్నాలు మిగిలాయి."
    override val msgTooManyPinAttemptsFormat = "ఎక్కువ తప్పు ప్రయత్నాలు. %1\$d సెకన్ల వరకు లాక్ చేయబడింది."
    override val msgOwnerSessionRequired = "సక్రియ యజమాని సెషన్ అవసరం."
    override val msgVerifyOtpBeforePinChange = "ముందు నమోదిత మొబైల్ OTP ను ధృవీకరించండి."
    override val msgPinUpdatedSuccess = "కొత్త అడ్మిన్ PIN సర్వర్‌లో సురక్షితంగా అప్‌డేట్ అయింది."
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) కోసం డెమో ప్రొఫైల్ నవీకరించబడింది"
    override val msgJobPostedFormat = "%1\$s లో డెమో పని పోస్ట్ అయింది! ఫీజు: %2\$d కాయిన్లు."
    override val msgAlreadyAppliedFormat = "%1\$s కు ఇప్పటికే దరఖాస్తు చేశారు"
    override val msgApplicationSentFormat = "%1\$s కు దరఖాస్తు పంపబడింది"
    override val msgApplicationWithdrawnFormat = "దరఖాస్తు %1\$s వెనక్కి తీసుకోబడింది"
    override val msgApplicationUpdatedFormat = "దరఖాస్తు %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "వారపు తనిఖీ నమోదైంది: 1 · నేను సురక్షితంగా ఉన్నాను."
    override val msgCheckInProblemRecorded = "హెచ్చరిక నమోదైంది (2 · సమస్య). భద్రతా విభాగానికి సమాచారం ఇవ్వబడింది."
    override val msgCheckInAdminRequested = "అత్యవసర అడ్మిన్ కాల్‌బ్యాక్ కోరబడింది (3). కుటుంబ అలర్ట్ క్యూలో ఉంది."
    override val msgSafetyComplaintSubmittedFormat = "భద్రతా కేసు %1\$s నమోదు చేయబడింది."
    override val msgWithdrawalsFrozen = "అత్యవసర నిలుపుదల ఆన్ అయింది: అన్ని విత్‌డ్రాలు వెంటనే లాక్ చేయబడ్డాయి."
    override val msgWithdrawalsUnfrozen = "ధృవీకరణ తర్వాత విత్‌డ్రాలు అన్‌లాక్ అయ్యాయి."
    override val msgOwnerNoticePublished = "ఎరుపు LOBORO అడ్మిన్ ప్రకటన ప్రచురించబడింది."
}
