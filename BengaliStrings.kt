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

object BengaliStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "গ্লোবাল জব ও সার্ভিস"
    override val demoPreviewBanner = "ডেমো প্রিভিউ ডেটা · লাইভ ব্যবহারের জন্য সেটিংসে ব্যাকএন্ড API যুক্ত করুন"
    override val verifiedNormalAccountBanner = "যাচাইকৃত ব্যবহারকারী অ্যাকাউন্ট · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO অ্যাডমিন বিজ্ঞপ্তি"
    override val maintenanceModeBanner = "রক্ষণাবেক্ষণ মোড চালু আছে · নিয়োগ ও ওয়ালেট সাময়িকভাবে বন্ধ। জরুরি ১১২ এবং সুরক্ষা ডেস্ক চালু থাকবে।"
    override val navHome = "হোম"
    override val navSearchJobs = "কাজ খুঁজুন"
    override val navPostJob = "কাজ দিন"
    override val navWallet = "ওয়ালেট"
    override val navMyApplications = "আমার আবেদন"
    override val navMyJobs = "আমার কাজ"
    override val navNotifications = "বিজ্ঞপ্তি"
    override val navHelpSafety = "সাহায্য ও সুরক্ষা"
    override val navProfile = "প্রোফাইল"
    override val navSettings = "সেটিংস"
    override val navAdmin = "মালিক নিয়ন্ত্রণ"
    override val navBadgesLoyalty = "ব্যাজ ও আনুগত্য"
    override val navIvrKeypad = "কিপ্যাড ও IVR"
    override val backLabel = "পিছনে"
    override val homeLabel = "হোম"
    override val languageLabel = "ভাষা"
    override val languageSelectorTitle = "১২টি ভাষা"
    override val activeBadgeLabel = "সক্রিয়"
    override val closeLabel = "বন্ধ করুন"
    override val okLabel = "ঠিক আছে"
    override val understoodLabel = "বুঝেছি"
    override val cancelLabel = "বাতিল করুন"
    override val doneLabel = "সম্পন্ন"
    override val confirmActionLabel = "নিশ্চিত করুন"
    override val resetLabel = "রিসেট"
    override val sendLabel = "পাঠান"

    override val shareAppTitle = "LOBORO অ্যাপ শেয়ার করুন"
    override val shareAppCta = "বন্ধুদের শেয়ার করুন ও পুরস্কার জিতুন"
    override val yourReferralLinkLabel = "আপনার রেফারেল লিংক"
    override val loboroLinkLabel = "LOBORO লিংক"
    override val shareMenuButton = "শেয়ার মেনু"
    override val copyLinkButton = "লিংক কপি করুন"
    override val referralCopiedToast = "রেফারেল বার্তা কপি হয়েছে"
    override val openingShareMenuToast = "শেয়ার মেনু খোলা হচ্ছে"
    override val shareMessageTemplate = "LOBORO গ্লোবাল জব ও সার্ভিসে যোগ দিন! সারা ভারতে দৈনিক মজুরি বা মাসিক বেতনের কাজ খুঁজুন। আমার রেফারেল ID %1\$s ব্যবহার করুন: %2\$s"

    override val registerWorkerEmployerCta = "কর্মী / নিয়োগকর্তা হিসেবে নিবন্ধন করুন"
    override val logInLabel = "লগ ইন"
    override val signOutLabel = "সাইন আউট"
    override val voiceSearchHint = "কাজ বা শহর বলুন বা লিখুন (যেমন: হায়দরাবাদে রাজমিস্ত্রি)"
    override val tapMicToSpeak = "বলে কাজ খুঁজতে মাইক চাপুন"
    override val listeningStatus = "শুনছি... আপনার কাজের প্রয়োজন বলুন"
    override val stopListening = "শোনা বন্ধ করুন"
    override val searchAction = "খুঁজুন"
    override val retryVoice = "আবার বলুন"
    override val voiceMicPermissionNeeded = "ভয়েস সার্চের জন্য কেবল আপনি মাইক বোতাম চাপলেই মাইক্রোফোন অনুমতি চাওয়া হয়।"
    override val voiceUnavailableHonest = "এই ডিভাইসে ভয়েস শনাক্তকরণ ইনস্টল করা নেই। ক্লাউড স্পিচ প্রোভাইডার যুক্ত করুন অথবা নিচের নমুনা বেছে নিন।"
    override val voiceNoMatchError = "কথা স্পষ্ট বোঝা যায়নি। স্পষ্টভাবে বলুন বা নিচের নমুনা চাপুন।"
    override val voiceNetworkError = "নেটওয়ার্ক ত্রুটি। ইন্টারনেট পরীক্ষা করুন অথবা কাজ লিখুন।"
    override val voiceStoppedError = "ভয়েস ইনপুট বন্ধ হয়েছে (কোড %1\$d)। টাইপ করুন বা আবার চেষ্টা করুন।"
    override val voicePrivacyHint = "গোপনীয়তা: মাইক্রোফোন সাধারণত বন্ধ থাকে এবং কেবল আপনি চাপলেই চালু হয়।"
    override val clearSearchDesc = "অনুসন্ধান মুছুন"
    override val spokenSamples = listOf(
        "হায়দরাবাদে রাজমিস্ত্রি" to "Mason",
        "পুনেতে ইলেকট্রিশিয়ান" to "Electrician",
        "চেন্নাই হোটেল রাঁধুনি" to "Cook",
        "বিজয়ওয়াড়া ড্রাইভার" to "Driver",
        "সুরাত প্যাকিং কাজ" to "Packing"
    )
    override val dailyJobsTitle = "দৈনিক কাজ (Daily)"
    override val dailyJobsSubtitle = "দৈনিক মজুরি · মাসিক কাজ থেকে আলাদা তালিকা"
    override val monthlyJobsTitle = "মাসিক বেতনের কাজ"
    override val monthlyJobsSubtitle = "নির্দিষ্ট মাসিক বেতন · ছুটি ও থাকার তথ্য"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "কাজের বিভাগ (২৪টি)"
    override val walletStripSummaryFormat = "%1\$d কয়েন (₹%2\$d) · ১০০%% উত্তোলনযোগ্য"

    override val outOfStateTitle = "অন্য রাজ্যে ও বৈশ্বিক কাজ খুঁজুন"
    override val willingToRelocate = "অন্য রাজ্যে গিয়ে কাজ করতে ইচ্ছুক"
    override val filterCountry = "দেশ"
    override val filterState = "রাজ্য"
    override val filterDistrict = "জেলা"
    override val filterCity = "শহর"
    override val filterDistance = "দূরত্ব"
    override val upToKmFormat = "%1\$d কিমি পর্যন্ত"
    override val filterFoodIncluded = "খাবারের ব্যবস্থা"
    override val filterAccommodation = "থাকার ঘর / আবাসন"
    override val allCategoriesLabel = "সব বিভাগ"
    override val noMatchingJobsTitle = "ফিল্টার অনুযায়ী কোনো কাজ পাওয়া যায়নি"
    override val noMatchingJobsSubtitle = "ফিল্টার রিসেট করুন অথবা 'অন্য রাজ্যে কাজ' চালু করুন।"
    override val showAllJobsButton = "সব কাজ দেখান"
    override val dailyWageJobBadge = "দৈনিক মজুরির কাজ"
    override val monthlySalaryJobBadge = "মাসিক বেতনের কাজ"
    override val demoDataTag = "ডেমো"
    override val originalLangFormat = "মূল ভাষা: %1\$s"
    override val preTranslatedPreviewNote = "পূর্ব-অনূদিত প্রিভিউ চালু আছে। লাইভ কাজের জন্য সেটিংসে ট্রান্সলেশন API কী যুক্ত করুন।"
    override val configureTranslationApiNote = "১২টি ভাষায় লাইভ অনুবাদের জন্য সেটিংসে ট্রান্সলেশন API কী যুক্ত করুন।"
    override val translatedToggle = "অনূদিত"
    override val originalToggle = "মূল"
    override val compensationLabel = "মজুরি / বেতন"
    override val locationLabel = "অবস্থান"
    override val employerLabel = "নিয়োগকর্তা"
    override val vacanciesUnit = "শূন্যপদ"
    override val perDayFormat = "₹%1\$d / দিন"
    override val perMonthFormat = "₹%1\$d / মাস"
    override val coinsCountFormat = "%1\$d কয়েন"
    override val foodBadge = "খাবার"
    override val stayBadge = "থাকা"
    override val shareJobButton = "কাজ শেয়ার করুন"
    override val applyNow = "আবেদন করুন"
    override val saveJob = "সংরক্ষণ"
    override val negotiateChat = "কথা বলুন / চ্যাট"
    override val reportJob = "অভিযোগ করুন"
    override val foodAvailable = "খাবার অন্তর্ভুক্ত"
    override val accommodationAvailable = "থাকা অন্তর্ভুক্ত"
    override val notProvided = "অন্তর্ভুক্ত নয়"
    override val workersNeeded = "প্রয়োজনীয় কর্মী"
    override val workHoursLabel = "কাজের সময়"
    override val overtimeLabel = "ওভারটাইম"
    override val paymentFreqLabel = "পেমেন্ট"
    override val weeklyHolidayLabel = "সাপ্তাহিক ছুটি"
    override val leavePolicyLabel = "ছুটির নিয়ম"
    override val joiningDateLabel = "যোগদানের তারিখ"
    override val expiryLabel = "মেয়াদ শেষ"
    override val translatedBadgeLabel = "অনূদিত"

    override val postingPausedFormat = "কাজ পোস্ট করা বর্তমানে মালিক নিয়ন্ত্রণ (%1\$s) দ্বারা স্থগিত আছে।"
    override val selectCategoryLabel = "বিভাগ নির্বাচন করুন (২৪টি বিভাগ)"
    override val jobTitleLabel = "কাজের শিরোনাম"
    override val jobTitlePlaceholder = "যেমন: হোস্টেল ভবনের জন্য ৪ জন রাজমিস্ত্রি প্রয়োজন"
    override val jobDescLabel = "কাজের বিবরণ"
    override val jobDescPlaceholder = "কাজের তথ্য, সুরক্ষা সরঞ্জাম, খাবার ও থাকার সুবিধা"
    override val dailyWageInrLabel = "দৈনিক মজুরি (₹)"
    override val monthlySalaryInrLabel = "মাসিক বেতন (₹)"
    override val vacanciesLabel = "শূন্যপদ সংখ্যা"
    override val cityTownLabel = "শহর / এলাকা"
    override val stateLabel = "রাজ্য"
    override val transparentJobFeeTitle = "স্বচ্ছ জব ফি: %1\$d কয়েন (₹%2\$d)"
    override val configuredByOwnerSub = "মালিক নির্ধারিত · ফি সময়: %1\$s · উপলব্ধ: %2\$d কয়েন"
    override val confirmAndPostJobButton = "নিশ্চিত করে কাজ পোস্ট করুন (%1\$d কয়েন)"

    override val walletBalanceTitle = "LOBORO কয়েন ব্যালেন্স"
    override val withdrawableValueFormat = "₹%1\$d উত্তোলনযোগ্য মূল্য (১ কয়েন = ₹%2\$d)"
    override val withdrawableRuleTitle = "১০০% সমান উত্তোলন নিয়ম"
    override val withdrawableRuleBody = "কেনা, উপহার, প্রোমো, রেফারেল, ব্যাজ বা আনুগত্যের প্রতিটি কয়েন সমান নগদ মূল্য এবং ১০০% উত্তোলনযোগ্য। কোনো লক কয়েন নেই।"
    override val buyCoins = "কয়েন কিনুন"
    override val withdrawCoins = "টাকা তুলুন"
    override val walletActionsPausedNote = "কিছু ওয়ালেট সেবা মালিক দ্বারা স্থগিত আছে। আপনার ব্যালেন্স ও অনুমোদিত রিফান্ড সুরক্ষিত থাকবে।"
    override val coinPackagesTitle = "কয়েন প্যাকেজ (স্বচ্ছ মূল্য)"
    override val bankSecurityTitle = "ব্যাংক / UPI ও মুখ যাচাই সুরক্ষা"
    override val payoutDestinationLabel = "যাচাইকৃত ব্যাংক অ্যাকাউন্ট: %1\$s"
    override val bankSecurityStepsNote = "ব্যাংক/UPI পরিবর্তনে বাধ্যতামূলক পরীক্ষা: নিবন্ধিত মোবাইল OTP + লাইভ সেলফি মিল + সাময়িক পেমেন্ট বিরতি।"
    override val changeBankUpiButton = "ব্যাংক / UPI পরিবর্তন (OTP + মুখ যাচাই)"
    override val unfreezePayoutsButton = "উত্তোলন আনলক করুন"
    override val lostPhoneFreezeButton = "ফোন হারিয়েছে? উত্তোলন বন্ধ করুন"
    override val payoutFreezeActiveNote = "উত্তোলন স্থগিতাদেশ সক্রিয় আছে। পরিচয় পুনঃযাচাই না হওয়া পর্যন্ত কোনো টাকা তোলা যাবে না।"
    override val transactionHistory = "কয়েন লেনদেনের খাতা"
    override val demoLedgerSuffix = "(ডেমো খাতা)"
    override val buyCoinsDialogTitleFormat = "%1\$d কয়েন কিনুন (₹%2\$d)"
    override val paymentNotConnectedBody = "লাইভ Razorpay / Cashfree UPI পেমেন্ট এখনো যুক্ত হয়নি। প্রকৃত টাকা গ্রহণের আগে প্রোডাকশন কী যুক্ত করুন।"
    override val withdrawDialogTitleFormat = "₹%1\$d উত্তোলন করুন"
    override val withdrawDialogBodyFormat = "সম্পূর্ণ ব্যালেন্স (%1\$d কয়েন) সমান নগদ মূল্যে ১০০%% উত্তোলনযোগ্য।\nঅ্যাকাউন্ট: %2\$s\n\nএই বিল্ডে লাইভ IMPS / UPI গেটওয়ে যুক্ত নেই।"
    override val bankChangeDialogTitle = "৩-ধাপের ব্যাংক / UPI সুরক্ষা"
    override val bankChangeDialogBody = "ফোন হারালেও সুরক্ষার জন্য ব্যাংক/UPI পরিবর্তনে প্রয়োজন:\n১. নিবন্ধিত মোবাইল OTP যাচাই\n২. নিবন্ধন ছবির সাথে লাইভ মুখের মিল\n৩. ছাড়ের আগে সুরক্ষা অপেক্ষা সময়"
    override val receiptDialogTitle = "লেনদেন রসিদ"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "রেফারেন্স: %1\$s"
    override val receiptTypeLabel = "ধরন: %1\$s"
    override val receiptCoinsLabel = "কয়েন: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "অবস্থা: %1\$s"
    override val receiptTimeLabel = "সময়: %1\$s"
    override val receiptWithdrawableYes = "উত্তোলন যোগ্যতা: ১০০% হ্যাঁ"

    override val employerAppsHeading = "আবেদন ও সরাসরি চ্যাট"
    override val secureChatHeading = "সুরক্ষিত কর্মী ↔ নিয়োগকর্তা চ্যাট"
    override val secureChatSubtitle = "আপনি নিজে শেয়ার না করা পর্যন্ত ফোন নম্বর গোপন থাকে। খুলতে বা ব্লক করতে ট্যাপ করুন।"
    override val chatButton = "চ্যাট"
    override val workerEmployerLineFormat = "কর্মী: %1\$s (%2\$s) · নিয়োগকর্তা: %3\$s"
    override val shortlistButton = "শর্টলিস্ট"
    override val acceptButton = "গ্রহণ করুন"
    override val withdrawButton = "প্রত্যাহার করুন"
    override val phoneHiddenPrivacy = "গোপনীয়তা চালু: উভয়ের সম্মতি ছাড়া ব্যক্তিগত ফোন নম্বর গোপন থাকে।"
    override val blockUserLabel = "ব্লক"
    override val userBlockedNotice = "আপনি এই কথোপকথন ব্লক করেছেন। প্রয়োজনে সুরক্ষা ডেস্কে জানান।"
    override val chatPlaceholder = "আপনার ভাষায় বার্তা লিখুন..."

    override val automaticBadgePrefix = "স্বয়ংক্রিয় ব্যাজ: %1\$s"
    override val badgeStatsFormat = "রেটিং %1\$.1f ★ · %2\$d যাচাইকৃত কর্মদিবস · %3\$d সম্পূর্ণ কাজ"
    override val progressToFormat = "%1\$s ব্যাজের অগ্রগতি: %2\$d / %3\$d দিন"
    override val badgeAntiAbuseNote = "ব্যাজ কেবল প্রকৃত সম্পন্ন কাজ, যাচাইকৃত উপস্থিতি এবং নিরপেক্ষ রেটিং থেকে স্বয়ংক্রিয়ভাবে অর্জিত হয়।"
    override val badgeTiersTitle = "৫টি স্বয়ংক্রিয় ব্যাজ স্তর"
    override val minWorkdaysFormat = "ন্যূনতম %1\$d কর্মদিবস · ন্যূনতম %2\$.1f★ রেটিং"
    override val badgeAppealsNote = "ন্যায্য সুরক্ষা: হঠাৎ সন্দেহজনক ১-স্টার রেটিং অভিযোগ আপিলের মাধ্যমে পর্যালোচনা করা হয়।"
    override val loyaltyTitle = "জ্যেষ্ঠতা ও আনুগত্য আর্থিক সহায়তা"
    override val loyaltySubtitle = "স্বচ্ছ ত্রৈমাসিক কল্যাণ ও মাইলফলক বোনাস"
    override val loyaltyDisclaimer = "বাধ্যতামূলক তথ্য: এটি বীমা নয় এবং নিশ্চিত মাসিক পেনশনও নয়। যোগ্যতা, কর্মদিবস, বাজেট ও অনুমোদনের ওপর নির্ভরশীল।"
    override val loyaltyMinMembershipFormat = "ন্যূনতম সদস্যপদ: %1\$d মাস"
    override val loyaltyWorkdaysFormat = "যাচাইকৃত কর্মদিবস: %1\$d+ দিন"
    override val loyaltyRequiredBadgeFormat = "প্রয়োজনীয় ব্যাজ: %1\$s+"
    override val loyaltyRequiredRatingFormat = "ন্যূনতম রেটিং: %1\$.1f★"
    override val loyaltyBudgetFormat = "অনুমোদিত সহায়তা: ₹%1\$d · বাজেট তহবিল: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "কর্মী সুরক্ষা ও জরুরি সহায়তা"
    override val callEmergency112 = "জরুরি ১১২ নম্বরে কল করুন"
    override val weeklyCheckInTitle = "সাপ্তাহিক সুরক্ষা যাচাই"
    override val weeklyCheckInQuestion = "আপনি কি নিরাপদে আছেন?"
    override val checkInOpt1 = "১ · আমি নিরাপদে আছি"
    override val checkInOpt2 = "২ · আমার সমস্যা হয়েছে"
    override val checkInOpt3 = "৩ · LOBORO অ্যাডমিনের সাথে কথা বলুন"
    override val reportSafetyIssue = "সুরক্ষা / মজুরি অভিযোগ জানান"
    override val safetyOperationalNote = "কাজ পোস্ট বা পেমেন্ট বন্ধ থাকলেও সুরক্ষা সেবা সর্বদা চালু থাকে।"
    override val safetyDisclaimerNote = "তাৎক্ষণিক বিপদে সরাসরি ১১২ নম্বরে কল করুন। নিরপেক্ষ মধ্যস্থতার জন্য LOBORO অভিযোগ নথিভুক্ত করে।"
    override val everyDaysFormat = "প্রতি %1\$d দিনে"
    override val lastStatusFormat = "শেষ যাচাই: %1\$s"
    override val checkInNoResponseNote = "পরপর ২টি যাচাই বাদ পড়লে বা সমস্যা বেছে নিলে LOBORO SMS, অ্যাডমিন পর্যালোচনা ও সম্মতিতে পরিবারকে জানায়।"
    override val consentEmergencyTitle = "সম্মতিভিত্তিক জরুরি অবস্থান ও পারিবারিক যোগাযোগ"
    override val workerIdLabel = "কর্মী ID: %1\$s"
    override val homeOriginLabel = "মূল ঠিকানা: %1\$s, %2\$s"
    override val currentJobCityLabel = "বর্তমান কর্মস্থল শহর: %1\$s"
    override val emergencyContactLabel = "জরুরি যোগাযোগ: %1\$s (%2\$s)"
    override val consentGranted = "সম্মতি প্রদত্ত"
    override val consentPending = "সম্মতি বাকি"
    override val employerLoboroIdInput = "নিয়োগকর্তা LOBORO ID (যেমন LB819)"
    override val currentSiteInput = "বর্তমান কাজের শহর / সাইট"
    override val describeIssueInput = "সুরক্ষা বা মজুরি সংক্রান্ত সমস্যা লিখুন"
    override val submitSafetyDeskButton = "সুরক্ষা ডেস্কে পাঠান"
    override val safetyCasesHeading = "সাম্প্রতিক সুরক্ষা মামলা (নিরীক্ষাযোগ্য)"
    override val ivrTitle = "কিপ্যাড ফোন মিসড-কল ও IVR মেনু"
    override val ivrSubtitle = "স্মার্টফোন ছাড়াই টোল-ফ্রি / মিসড-কল কলব্যাকের মাধ্যমে কাজ করে"
    override val ivrArchNote = "লাইভ সিস্টেম Exotel / Knowlarity / Twilio Voice-এর সাথে যুক্ত হয়। ১২-ভাষার ভয়েস মেনু পরীক্ষা করতে বোতাম চাপুন।"
    override val ivrMenuTitle = "LOBORO ভয়েস IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO-তে স্বাগতম! ভয়েস মেনু শুনতে কিপ্যাড নম্বর চাপুন।"
    override val pressKeyFormat = "%1\$s চাপুন → %2\$s"
    override val ivrSelectedSummaryFormat = "নির্বাচিত [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "আজকের দৈনিক মজুরির কাজ",
        "2" to "মাসিক বেতনের কাজ",
        "3" to "সাপ্তাহিক সুরক্ষা যাচাই ('নিরাপদে আছেন কি?')",
        "4" to "ওয়ালেট কয়েন ও সর্বশেষ অবস্থা শুনুন",
        "5" to "জরুরি অ্যাডমিন কলব্যাক",
        "6" to "আবেদনের অবস্থা জানুন",
        "0" to "পছন্দের ভয়েস ভাষা পরিবর্তন"
    )

    override val userRegTitle = "কর্মী ও নিয়োগকর্তা নিবন্ধন"
    override val userLoginTitle = "কর্মী ও নিয়োগকর্তা লগ ইন"
    override val userAuthSubtitle = "OTP-যাচাইকৃত সাধারণ অ্যাকাউন্ট · গোপন মালিক ব্যবস্থা থেকে সম্পূর্ণ আলাদা"
    override val registerTab = "নিবন্ধন"
    override val loginTab = "লগ ইন"
    override val dbOtpNotConnectedTitle = "ব্যাকএন্ড ডেটাবেস / OTP সংযুক্ত নয়"
    override val dbOtpNotConnectedBody = "প্রকৃত কর্মী ও নিয়োগকর্তা অ্যাকাউন্ট সংরক্ষণের জন্য LOBORO_BACKEND_URL যুক্ত করুন।"
    override val selectAccountTypeStep = "১. অ্যাকাউন্টের ধরন নির্বাচন করুন"
    override val workerAccountLabel = "কর্মী"
    override val employerAccountLabel = "নিয়োগকর্তা"
    override val regPausedForRoleFormat = "%1\$s নিবন্ধন বর্তমানে মালিক দ্বারা স্থগিত আছে।"
    override val preferredLanguageLabel = "পছন্দের অ্যাপ ভাষা (১২টি ভাষা)"
    override val fullNameStepLabel = "২. পুরো নাম *"
    override val businessNameStepLabel = "২. ব্যবসা / ঠিকাদারের পুরো নাম *"
    override val mobileStepLabel = "৩. মোবাইল নম্বর (১০ সংখ্যা) *"
    override val sendRegOtpButton = "OTP পাঠান"
    override val resendMobileOtpButton = "আবার OTP পাঠান"
    override val enterOtpStepLabel = "৪. মোবাইল OTP দিন *"
    override val verifyOtpButton = "OTP যাচাই করুন"
    override val verifiedLabel = "যাচাইকৃত"
    override val mobileVerifiedNote = "সার্ভারে মোবাইল যাচাই হয়েছে"
    override val homeStateLabel = "নিজ রাজ্য"
    override val homeDistrictLabel = "নিজ জেলা"
    override val stateShortLabel = "রাজ্য"
    override val cityShortLabel = "শহর"
    override val workCityStateLabel = "বর্তমান কাজের শহর ও রাজ্য"
    override val businessLocationLabel = "ব্যবসার শহর ও রাজ্য"
    override val skillsCategoriesLabel = "দক্ষতা / কাজ (যেমন রাজমিস্ত্রি, ইলেকট্রিশিয়ান)"
    override val hiringCategoriesLabel = "নিয়োগ বিভাগসমূহ"
    override val emergencyContactNameLabel = "জরুরি পারিবারিক যোগাযোগের নাম"
    override val emergencyContactPhoneLabel = "জরুরি যোগাযোগ নম্বর"
    override val uniqueLbIdNotice = "সম্পন্ন হলে সার্ভার স্থায়ী LB ID (LB2000+) দেবে। VIP ও মালিক নম্বর সুরক্ষিত থাকে।"
    override val creatingProfileLabel = "প্রোফাইল তৈরি হচ্ছে..."
    override val createProfileButton = "কর্মী / নিয়োগকর্তা প্রোফাইল তৈরি করুন"
    override val loginHeading = "নিবন্ধিত মোবাইল OTP দিয়ে লগ ইন করুন"
    override val loginSubtitle = "কর্মী বা নিয়োগকর্তা হিসেবে নিবন্ধিত মোবাইল নম্বর দিন।"
    override val registeredMobileLabel = "নিবন্ধিত মোবাইল নম্বর"
    override val sendLoginOtpButton = "লগ ইন OTP পাঠান"
    override val resendLoginOtpButton = "আবার OTP পাঠান"
    override val enterLoginOtpLabel = "লগ ইন OTP দিন"
    override val verifyingOtpLabel = "যাচাই হচ্ছে..."
    override val verifyOtpOpenHomeButton = "OTP যাচাই করে হোম খুলুন"
    override val backToHomepageButton = "হোমপেজে ফিরে যান"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "ভূমিকা"
    override val offlinePreviewHeading = "অফলাইন প্রোফাইল ও ছবি প্রিভিউ"
    override val offlinePreviewCardTitle = "প্রোফাইল তৈরি / সম্পাদনা (অফলাইন প্রিভিউ)"
    override val offlinePreviewCardSubtitle = "লাইভ ডেটাবেস যুক্ত না হওয়া পর্যন্ত স্থানীয় প্রিভিউ হিসেবে সংরক্ষিত থাকে।"
    override val workLocationLabel = "কাজের স্থান (শহর, রাজ্য)"
    override val businessAddressLabel = "ব্যবসার শহর, রাজ্য"
    override val skillsExpLabel = "দক্ষতা / কাজের ধরন"
    override val businessCatLabel = "ব্যবসার ধরন / নিয়োগ বিভাগ"
    override val aadhaarPrivacyNote = "তথ্য সুরক্ষা: LOBORO ডিভাইসে আধারের ছবি রাখে না — কেবল যাচাইকৃত হ্যাশ ও সম্মতি সংরক্ষণ করে।"
    override val selectProfilePhotoBtn = "প্রোফাইল ছবি বাছুন (ফটো পিকার)"
    override val photoSelectedBtn = "ছবি নির্বাচিত ✓"
    override val offlineConsentCheck = "আমি নিরাপত্তা যাচাই ও যোগাযোগ না হলে পরিবারকে জরুরি বার্তা পাঠাতে সম্মতি দিচ্ছি।"
    override val previewProfileBtn = "প্রিভিউ প্রোফাইল সংরক্ষণ করুন"
    override val audienceScopeFormat = "শ্রোতা: %1\$s · অঞ্চল: %2\$s · %3\$s"
    override val settingsHeading = "সেটিংস ও প্ল্যাটফর্ম তথ্য"
    override val languageSectionTitle = "অ্যাপের ভাষা (সকল ১২টি ভারতীয় ভাষা)"
    override val languageSectionSubtitle = "আপনার সক্রিয় অ্যাকাউন্টের জন্য আলাদাভাবে সংরক্ষিত হয়। অন্য ব্যবহারকারীর ভাষা বদলায় না।"
    override val languagePausedByOwner = "মালিক নিয়ন্ত্রণ দ্বারা ভাষা পরিবর্তন সাময়িকভাবে বন্ধ আছে।"
    override val lowDataTitle = "লো-ডেটা মোড"
    override val lowDataSubtitle = "২জি/৩জি গ্রামীণ নেটওয়ার্কে মোবাইল ডেটা সাশ্রয় করে"
    override val reducedMotionTitle = "কম অ্যানিমেশন ও স্পষ্ট দৃশ্য"
    override val reducedMotionSubtitle = "পরিষ্কার অক্ষর ও সহজ স্ক্রিন গতি"
    override val privacyPolicyTitle = "গোপনীয়তা নীতি ও তথ্য সুরক্ষা"
    override val privacyPolicyBody = "• আপনার অনুমতি ছাড়া চ্যাটে ফোন নম্বর গোপন থাকে।\n• ভয়েস সার্চ চাপলে কেবল তখনই মাইক্রোফোন চালু হয়।\n• ছবি বাছাইয়ের জন্য নিরাপদ অ্যান্ড্রয়েড ফটো পিকার ব্যবহৃত হয়।\n• কেবল আপনার সম্মতিতেই পরিবারকে জরুরি অবস্থান পাঠানো হয়।"
    override val termsOfServiceTitle = "পরিষেবার শর্তাবলী ও ন্যায্য নিয়ম"
    override val termsOfServiceBody = "• দৈনিক মজুরি ও মাসিক বেতনের কাজ সম্পূর্ণ আলাদা রাখা হয়েছে।\n• প্রতিটি LOBORO কয়েন ১০০% সমান নগদ মূল্য ও উত্তোলনযোগ্য।\n• ব্যাজ কেবল প্রকৃত কর্মদিবস ও ন্যায্য রেটিংয়েই অর্জিত হয়।\n• VIP ID (LB1–LB1999) শুধুমাত্র মালিকের জন্য সংরক্ষিত।"
    override val helpSupportTitle = "সাহায্য, সহায়তা ও সুরক্ষা ডেস্ক"
    override val helpSupportBody = "• তাৎক্ষণিক বিপদে ১১২ নম্বরে কল করুন (লগ ইন ছাড়াও ২৪x৭)।\n• মজুরি বা থাকার সমস্যায় সাহায্য ও সুরক্ষা ডেস্কে অভিযোগ জানান।\n• কিপ্যাড ফোনের টোল-ফ্রি কলব্যাকের জন্য কিপ্যাড ও IVR দেখুন।"
    override val backendChecklistTitle = "ব্যাকএন্ড ও API সংযুক্তির অবস্থা"
    override val providersLabel = "প্রোভাইডার: %1\$s"
    override val secretsLabel = "সিক্রেট কী: %1\$s"

    override val ownerSetupTitle = "এককালীন মালিক / সুপার অ্যাডমিন সেটআপ"
    override val ownerSetupSubtitle = "কেবল LOBORO নির্মাতার জন্য। একবার নিবন্ধনের পর চিরতরে লক হয়ে যায়।"
    override val ownerSetupLockNote = "সুরক্ষা লক: কেবল একটিই মালিক অ্যাকাউন্ট তৈরি হতে পারে। কোনো কর্মী বা নিয়োগকর্তা এটি ব্যবহার করতে পারবে না।"
    override val ownerBackendReqTitle = "মালিক সার্ভার সংযুক্ত নয়"
    override val ownerBackendReqBody = "পাসওয়ার্ড ও ৪-সংখ্যার PIN সার্ভারে সুরক্ষিত রাখতে LOBORO_BACKEND_URL সেট করুন।"
    override val serverSetupAuthHeading = "১. সার্ভার সেটআপ অনুমোদন"
    override val bootstrapSecretLabel = "ওয়ান-টাইম সার্ভার বুটস্ট্র্যাপ কোড *"
    override val bootstrapSecretPlaceholder = "আপনার সার্ভার OWNER_BOOTSTRAP_SECRET থেকে"
    override val ownerIdentityHeading = "২. মালিক পরিচয় ও মোবাইল OTP"
    override val ownerNameField = "মালিকের পুরো নাম *"
    override val ownerMobileField = "মালিকের ব্যক্তিগত মোবাইল নম্বর *"
    override val ownerSendOtpBtn = "মালিক OTP পাঠান"
    override val ownerMobileVerifiedNote = "মালিক মোবাইল OTP যাচাই হয়েছে"
    override val credentialsHeading = "৩. পাসওয়ার্ড ও ৪-সংখ্যার অ্যাডমিন PIN"
    override val createPasswordLabel = "লগ ইন পাসওয়ার্ড তৈরি করুন (৮+ অক্ষর) *"
    override val confirmPasswordLabel = "লগ ইন পাসওয়ার্ড নিশ্চিত করুন *"
    override val passwordsMismatchError = "পাসওয়ার্ড মিলছে না"
    override val createPinLabel = "৪-সংখ্যার অ্যাডমিন PIN তৈরি করুন *"
    override val confirmPinLabel = "৪-সংখ্যার অ্যাডমিন PIN নিশ্চিত করুন *"
    override val pinsMismatchError = "PIN মিলছে না"
    override val credentialsHashNote = "সার্ভার পাসওয়ার্ড ও PIN Argon2id দিয়ে হ্যাশ করে। অ্যাপে সংরক্ষণ করা হয় না।"
    override val registeringOwnerLabel = "মালিক অ্যাকাউন্ট তৈরি হচ্ছে..."
    override val completeOwnerRegButton = "মালিক নিবন্ধন সম্পন্ন করে ড্যাশবোর্ড খুলুন"
    override val returnToAppButton = "LOBORO অ্যাপে ফিরে যান"
    override val adminPinHeader = "মালিক নিয়ন্ত্রণ · ৪-সংখ্যার PIN প্রয়োজন"
    override val adminPinPrompt = "আপনার ৪-সংখ্যার মালিক অ্যাডমিন PIN লিখুন। সার্ভারে সীমাসহ যাচাই করা হয়।"
    override val pinLockoutFormat = "অতিরিক্ত ভুল চেষ্টা। %1\$d সেকেন্ড পর আবার চেষ্টা করুন।"
    override val clrKeyLabel = "মুছুন"
    override val verifyPinServerBtn = "সার্ভারে ৪-সংখ্যার PIN যাচাই করুন"
    override val pinSecurityPolicyFormat = "৫টি ভুল চেষ্টায় লক · ৫ মিনিট নিষ্ক্রিয়তায় লগআউট · বাকি চেষ্টা: %1\$d"
    override val ownerMasterControlTitle = "মালিক মাস্টার কন্ট্রোল"
    override val ownerMasterSubtitle = "কেবল মালিক সুপার অ্যাডমিন · সার্ভার PIN + OTP + অডিট লগ"
    override val ownerSessionLockedNote = "মালিক সেশন লক করা। মাস্টার কন্ট্রোলের জন্য সার্ভার-যাচাইকৃত ৪-সংখ্যার PIN প্রয়োজন।"
    override val verifyOwnerPinBtn = "মালিক ৪-সংখ্যার PIN যাচাই করুন"
    override val ownerProfileLineFormat = "মালিক প্রোফাইল · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "নিবন্ধিত মোবাইল: %1\$s · একক মালিক অ্যাকাউন্ট (%2\$s)"
    override val activeSessionFormat = "সক্রিয় মালিক সেশন · %1\$dm %2\$02ds পর লগআউট"
    override val serverAuthorityNote = "সেশন টোকেন যাচাইকৃত (সার্ভার কর্তৃপক্ষ)"
    override val lockAndExitBtn = "লক ও প্রস্থান"
    override val mandatoryProtectionTitle = "বাধ্যতামূলক সুরক্ষা ও আর্থিক দায়বদ্ধতা রক্ষা"
    override val mandatoryProtectionBody = "বৈশিষ্ট্য বন্ধ করলে বা রক্ষণাবেক্ষণ মোড চালু করলেও বকেয়া অর্থ, অনুমোদিত রিফান্ড ও ১১২ জরুরি সেবা বাতিল হয় না।"
    override val changePinTitle = "অ্যাডমিন PIN পরিবর্তন (OTP যাচাই বাধ্যতামূলক)"
    override val changePinSubtitle = "কেবল মালিকের জন্য। বর্তমান PIN কখনো দেখা যায় না। নিবন্ধিত মোবাইল OTP বাধ্যতামূলক।"
    override val otpToRegisteredMobileNote = "OTP কেবল নিবন্ধিত মালিকের মোবাইলে পাঠানো হবে: %1\$s"
    override val sendPinChangeOtpBtn = "নিবন্ধিত মালিক মোবাইলে OTP পাঠান"
    override val otpDispatchedNote = "মালিকের নিবন্ধিত মোবাইলে (%1\$s) OTP পাঠানো হয়েছে।"
    override val enterServerOtpLabel = "সার্ভার OTP কোড লিখুন"
    override val verifyOtpServerBtn = "সার্ভারে OTP যাচাই করুন"
    override val otpVerifiedNewPinNote = "OTP যাচাই হয়েছে। এবার নতুন ৪-সংখ্যার মালিক PIN লিখুন ও নিশ্চিত করুন।"
    override val newPinLabel = "নতুন ৪-সংখ্যার PIN"
    override val confirmNewPinLabel = "নতুন ৪-সংখ্যার PIN নিশ্চিত করুন"
    override val saveNewPinBtn = "নিশ্চিত করে অ্যাডমিন PIN আপডেট করুন"
    override val confirmPinChangeTitle = "অ্যাডমিন PIN পরিবর্তন নিশ্চিত করুন"
    override val confirmPinChangeDesc = "সার্ভারে ৪-সংখ্যার মালিক PIN বদলাবেন? সেশন চালু থাকবে এবং অডিট লগ সংরক্ষিত হবে।"
    override val pinUpdatedNote = "নতুন ৪-সংখ্যার মালিক PIN সার্ভারে আপডেট হয়েছে।"
    override val completeMasterControlTitle = "সম্পূর্ণ মালিক মাস্টার কন্ট্রোল (২৫টি মডিউল)"
    override val masterControlScopeSubtitle = "অঞ্চল বা ব্যবহারকারীর ভূমিকা অনুযায়ী তাৎক্ষণিক ON/OFF নিয়ন্ত্রণ।"
    override val scopeOptions = listOf(
        "বৈশ্বিক · ভারত (সব রাজ্য)",
        "কেবল তেলেঙ্গানা",
        "কেবল তামিলনাড়ু",
        "কেবল কর্মী",
        "কেবল নিয়োগকর্তা"
    )
    override val masterControlNames = listOf(
        "১. সম্পূর্ণ অ্যাপ ও রক্ষণাবেক্ষণ মোড",
        "২. কর্মী নিবন্ধন",
        "৩. নিয়োগকর্তা নিবন্ধন",
        "৪. কাজ পোস্ট করা",
        "৫. কাজ খোঁজা",
        "৬. দৈনিক মজুরির কাজ",
        "৭. মাসিক বেতনের কাজ",
        "৮. কয়েন কেনাকাটা",
        "৯. ওয়ালেট উত্তোলন",
        "১০. জব ফি ও কয়েন মূল্য",
        "১১. অফার ও প্রমোশন",
        "১২. রেফারেল পুরস্কার",
        "১৩. বিজ্ঞপ্তি ও ঘোষণা",
        "১৪. কর্মী ও নিয়োগকর্তা অ্যাকাউন্ট নিয়ন্ত্রণ",
        "১৫. কাজের বিভাগ ও উপবিভাগ",
        "১৬. রেটিং ও স্বয়ংক্রিয় ব্যাজ",
        "১৭. জ্যেষ্ঠতা ও আনুগত্য সহায়তা",
        "১৮. জরুরি ও কর্মী সুরক্ষা ব্যবস্থা",
        "১৯. SMS সতর্কতা",
        "২০. IVR পরিষেবা",
        "২১. ভাষা সেটিংস (১২টি ভাষা)",
        "২২. দেশ, রাজ্য ও শহরের প্রাপ্যতা",
        "২৩. VIP ID সংরক্ষণ ও পরিচালনা",
        "২৪. প্রতিবেদন, অভিযোগ ও নিয়ন্ত্রণ",
        "২৫. পেমেন্ট গেটওয়ে সংযোগ"
    )
    override val publishNoticeTitle = "লাল LOBORO অ্যাডমিন বিজ্ঞপ্তি প্রকাশ করুন"
    override val announcementMessageLabel = "ঘোষণা বার্তা"
    override val announcementPlaceholder = "যেমন: অন্য রাজ্যের কর্মীদের জন্য নতুন সুরক্ষা হেল্পলাইন"
    override val actionLinkLabel = "বোতামের নাম"
    override val scopeFieldLabel = "অঞ্চল / রাজ্য পরিধি"
    override val audienceOptions = listOf("সকল ব্যবহারকারী", "কর্মী", "নিয়োগকর্তা")
    override val broadcastNoticeBtn = "লাল অ্যাডমিন বিজ্ঞপ্তি প্রচার করুন"
    override val confirmBroadcastTitle = "লাল LOBORO অ্যাডমিন বিজ্ঞপ্তি প্রচার করবেন?"
    override val confirmBroadcastDescFormat = "বার্তা: %1\$s\nদর্শক: %2\$s · অঞ্চল: %3\$s"
    override val coinPricingTitle = "কয়েন মূল্য ও ফি নিয়ন্ত্রণ"
    override val coinPricingSummaryFormat = "১ কয়েন = ₹%1\$d · দৈনিক = %2\$d কয়েন · বিশেষ = %3\$d কয়েন · মাসিক = %4\$d কয়েন · সময়: %5\$s"
    override val dailyBtnFormat = "দৈনিক +১ (%1\$d)"
    override val masonBtnFormat = "বিশেষ +১ (%1\$d)"
    override val monthlyBtnFormat = "মাসিক +৫ (%1\$d)"
    override val protectedVipIdsTitle = "সুরক্ষিত VIP ও মালিক ID (স্বয়ংক্রিয়ভাবে কখনো দেওয়া হয় না)"
    override val protectedVipIdsNote = "সাধারণ ব্যবহারকারীরা সর্বদা LB2000+ পান। বিশেষ নম্বর কেবল মালিক বরাদ্দের জন্য সংরক্ষিত।"
    override val safetyInvestigationTitle = "সুরক্ষা মামলা ও অভিযোগ তদন্ত ডেস্ক"
    override val manageCategoriesTitle = "২৪টি কাজের বিভাগ পরিচালনা (তাৎক্ষণিক ON/OFF)"
    override val showAll24Label = "সব ২৪টি দেখান"
    override val showLessLabel = "কম দেখান"
    override val auditLogTitle = "মালিক কার্যক্রম অডিট লগ"
    override val confirmToggleTitleFormat = "%1\$s নিশ্চিত করুন"
    override val confirmToggleDescFormat = "%3\$s-এর জন্য \"%1\$s\" কি %2\$s করবেন? চলমান অর্থনৈতিক দায়বদ্ধতা এবং ১১২ সুরক্ষা সেবা সুরক্ষিত থাকবে।"

    override val categories = mapOf(
        JobCategoryId.MASON to "রাজমিস্ত্রি / মেসন",
        JobCategoryId.CONSTRUCTION_LABOUR to "নির্মাণ শ্রমিক",
        JobCategoryId.GENERAL_LABOUR to "সাধারণ শ্রমিক",
        JobCategoryId.PLUMBER to "প্লাম্বার",
        JobCategoryId.ELECTRICIAN to "ইলেকট্রিশিয়ান",
        JobCategoryId.PAINTER to "পেইন্টার / রংমিস্ত্রি",
        JobCategoryId.TILE_WORKER to "টাইলস মিস্ত্রি",
        JobCategoryId.CARPENTER to "কাঠমিস্ত্রি / কার্পেন্টার",
        JobCategoryId.WELDER to "ওয়েল্ডার",
        JobCategoryId.HOTEL_STAFF to "হোটেল কর্মী",
        JobCategoryId.COOK to "রাঁধুনি / কুক",
        JobCategoryId.WAITER to "ওয়েটার",
        JobCategoryId.HOUSEKEEPING to "হাউসকিপিং",
        JobCategoryId.SECURITY_GUARD to "নিরাপত্তা প্রহরী",
        JobCategoryId.DRIVER to "ড্রাইভার",
        JobCategoryId.DELIVERY_WORKER to "ডেলিভারি কর্মী",
        JobCategoryId.FACTORY_WORKER to "কারখানা শ্রমিক",
        JobCategoryId.PACKING_WORKER to "প্যাকিং কর্মী",
        JobCategoryId.MACHINE_OPERATOR to "মেশিন অপারেটার",
        JobCategoryId.AGRICULTURE_WORKER to "কৃষি শ্রমিক",
        JobCategoryId.OFFICE_ASSISTANT to "অফিস সহকারী",
        JobCategoryId.SHOP_STAFF to "দোকান কর্মী",
        JobCategoryId.DOMESTIC_WORKER to "গৃহকর্মী",
        JobCategoryId.OTHER_JOBS to "অন্যান্য কাজ"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "কর্মী",
        UserRole.EMPLOYER to "নিয়োগকর্তা",
        UserRole.OWNER_SUPER_ADMIN to "মালিক / সুপার অ্যাডমিন"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "আবেদন করা হয়েছে",
        ApplicationStatus.UNDER_REVIEW to "পর্যালোচনাধীন",
        ApplicationStatus.SHORTLISTED to "তালিকাভুক্ত",
        ApplicationStatus.ACCEPTED to "গৃহীত",
        ApplicationStatus.REJECTED to "প্রত্যাখ্যাত",
        ApplicationStatus.WITHDRAWN to "প্রত্যাহার",
        ApplicationStatus.COMPLETED to "সম্পন্ন"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "অপেক্ষমাণ",
        TransactionStatus.SUCCESSFUL to "সফল",
        TransactionStatus.FAILED to "ব্যর্থ",
        TransactionStatus.REFUNDED to "ফেরত"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "কয়েন ক্রয়",
        TransactionType.GIFT to "উপহার ক্রেডিট",
        TransactionType.PROMO to "প্রোমো ক্রেডিট",
        TransactionType.REFERRAL to "রেফারেল বোনাস",
        TransactionType.BADGE_REWARD to "ব্যাজ পুরস্কার",
        TransactionType.LOYALTY_SUPPORT to "আনুগত্য সহায়তা",
        TransactionType.JOB_FEE to "জব ফি",
        TransactionType.WITHDRAWAL to "উত্তোলন"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "বকেয়া মজুরি",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "শারীরিক নির্যাতন",
        SafetyComplaintCategory.HARASSMENT to "হয়রানি",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "খাবার / থাকার সমস্যা",
        SafetyComplaintCategory.FRAUD to "কাজের প্রতারণা",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "অনিরাপদ কর্মস্থল",
        SafetyComplaintCategory.OTHER_EMERGENCY to "অন্যান্য জরুরি"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "নতুন",
        SafetyCaseStatus.IN_REVIEW to "তদন্তাধীন",
        SafetyCaseStatus.ADMIN_VERIFIED to "অ্যাডমিন যাচাইকৃত",
        SafetyCaseStatus.ACTION_TAKEN to "ব্যবস্থা গৃহীত",
        SafetyCaseStatus.REFERRED to "প্রেরিত",
        SafetyCaseStatus.CLOSED to "বন্ধ"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "প্রাথমিক",
        BadgeLevel.SILVER to "সিলভার",
        BadgeLevel.GOLD to "গোল্ড",
        BadgeLevel.DIAMOND to "ডায়মন্ড",
        BadgeLevel.PLATINUM to "প্ল্যাটিনাম"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "কাজ পোস্ট করার সময়",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "যাচাইকৃত সংযোগে",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "আবেদন গ্রহণের সময়"
    )
    override val indianStates = mapOf(
        "All States" to "সব রাজ্য",
        "Telangana" to "তেলেঙ্গানা",
        "Andhra Pradesh" to "অন্ধ্র প্রদেশ",
        "Tamil Nadu" to "তামিলনাড়ু",
        "Karnataka" to "কর্ণাটক",
        "Maharashtra" to "মহারাষ্ট্র",
        "Gujarat" to "গুজরাট",
        "Assam" to "আসাম",
        "Bihar" to "বিহার",
        "Uttar Pradesh" to "উত্তর প্রদেশ",
        "West Bengal" to "পশ্চিমবঙ্গ",
        "Odisha" to "ওড়িশা",
        "Kerala" to "কেরালা",
        "Punjab" to "পাঞ্জাব"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "ক্লাউড ডেটাবেস ও নিরাপত্তা নিয়ম",
        "otp_sms" to "OTP ও SMS পরিষেবা",
        "payment_gateway" to "UPI ও কয়েন পেমেন্ট গেটওয়ে",
        "face_liveness" to "মুখ মিল ও লাইভনেস যাচাই",
        "translation" to "লাইভ ১২-ভাষা কাজ অনুবাদ",
        "telecom_ivr" to "কিপ্যাড ফোন মিসড-কল ও IVR",
        "owner_pin_auth" to "মালিক বুটস্ট্র্যাপ ও ৪-সংখ্যার PIN সার্ভার"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "সংযুক্ত নয়",
        IntegrationStatus.NEEDS_CREDENTIALS to "কী প্রয়োজন",
        IntegrationStatus.CONNECTED to "সংযুক্ত"
    )

    override val msgOwnerPrivilegeBlocked = "অননুমোদিত: সাধারণ ব্যবহারকারীরা কখনোই মালিক / সুপার অ্যাডমিন হতে পারবেন না।"
    override val msgSwitchedPreviewFormat = "প্রিভিউ অ্যাকাউন্ট %1\$s (%2\$s)-এ পরিবর্তন করা হয়েছে।"
    override val msgLanguageSavedFormat = "ভাষা %1\$s (%2\$s) সেট করা হয়েছে"
    override val msgEnterNameBeforeOtp = "OTP চাওয়ার আগে আপনার পুরো নাম লিখুন।"
    override val msgEnterValidMobile = "অনুগ্রহ করে সঠিক ১০-সংখ্যার মোবাইল নম্বর লিখুন।"
    override val msgOtpDispatchedFormat = "সার্ভার OTP %1\$s নম্বরে পাঠানো হয়েছে। ফোনে পাওয়া কোডটি দিন।"
    override val msgUnableSendOtp = "OTP পাঠানো যায়নি। ব্যাকএন্ড URL বা নেটওয়ার্ক পরীক্ষা করুন।"
    override val msgSendOtpAndEnterCode = "প্রথমে OTP পাঠান এবং ৪–৬ সংখ্যার কোড দিন।"
    override val msgOtpVerifiedCreateFormat = "মোবাইল OTP যাচাই হয়েছে! বিবরণ পূরণ করে %1\$s প্রোফাইল তৈরি করুন চাপুন।"
    override val msgIncorrectOtp = "ভুল বা মেয়াদোত্তীর্ণ OTP। নতুন OTP চান।"
    override val msgServerOtpUnavailable = "সার্ভার OTP পরিষেবা উপলব্ধ নয়। লাইভ ব্যাকএন্ড যুক্ত করুন।"
    override val msgEnterFullName = "পুরো নাম আবশ্যক।"
    override val msgVerifyMobileOtpFirst = "অনুগ্রহ করে প্রথমে মোবাইল OTP যাচাই করুন।"
    override val msgAccountCreatedFormat = "স্বাগতম %1\$s! %2\$s অ্যাকাউন্ট তৈরি হয়েছে (%3\$s)।"
    override val msgLoggedInFormat = "%1\$s (%2\$s) হিসেবে লগ ইন হয়েছে"
    override val msgSignedOut = "ব্যবহারকারী অ্যাকাউন্ট থেকে সাইন আউট হয়েছেন।"
    override val msgDuplicateOwnerBlocked = "সুরক্ষা বাধা: মালিক অ্যাকাউন্ট ইতিমধ্যেই আছে। দ্বিতীয় মালিক তৈরি করা যাবে না।"
    override val msgBootstrapRequired = "সার্ভার বুটস্ট্র্যাপ অনুমোদন কোড দিন।"
    override val msgEnterPasswords = "মালিক লগ ইন পাসওয়ার্ড দিন ও নিশ্চিত করুন।"
    override val msgPasswordsDoNotMatch = "পাসওয়ার্ড দুটি মিলছে না।"
    override val msgPasswordTooShort = "পাসওয়ার্ড কমপক্ষে ৮ অক্ষরের হতে হবে।"
    override val msgPinFourDigits = "অ্যাডমিন PIN ঠিক ৪ সংখ্যার হতে হবে।"
    override val msgPinsDoNotMatch = "৪-সংখ্যার PIN নিশ্চিতকরণ মিলছে না।"
    override val msgOwnerCreatedFormat = "%1\$s-এর জন্য মালিক প্রোফাইল তৈরি হয়েছে। একক মালিক নিবন্ধন চিরতরে লক করা হলো।"
    override val msgOwnerLockedSession = "মালিক সেশন লক করা হয়েছে।"
    override val msgOwnerTimedOut = "৫ মিনিট নিষ্ক্রিয়তার কারণে মালিক সেশন শেষ হয়েছে। আবার PIN দিন।"
    override val msgOwnerUnlocked = "মালিক মাস্টার কন্ট্রোল আনলক হয়েছে।"
    override val msgInvalidPinAttemptsFormat = "ভুল ৪-সংখ্যার মালিক PIN। আর %1\$dটি চেষ্টা বাকি।"
    override val msgTooManyPinAttemptsFormat = "অনেক ভুল চেষ্টা। %1\$d সেকেন্ডের জন্য লক।"
    override val msgOwnerSessionRequired = "সক্রিয় মালিক সেশন প্রয়োজন।"
    override val msgVerifyOtpBeforePinChange = "প্রথমে নিবন্ধিত মোবাইলে পাঠানো OTP যাচাই করুন।"
    override val msgPinUpdatedSuccess = "নতুন অ্যাডমিন PIN সার্ভারে নিরাপদে আপডেট হয়েছে।"
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s)-এর ডেমো প্রোফাইল আপডেট হয়েছে"
    override val msgJobPostedFormat = "%1\$s-এ ডেমো কাজ পোস্ট হয়েছে! ফি: %2\$d কয়েন।"
    override val msgAlreadyAppliedFormat = "%1\$s-এর জন্য আগেই আবেদন করা হয়েছে"
    override val msgApplicationSentFormat = "%1\$s-এর জন্য আবেদন পাঠানো হয়েছে"
    override val msgApplicationWithdrawnFormat = "আবেদন %1\$s প্রত্যাহার করা হয়েছে"
    override val msgApplicationUpdatedFormat = "আবেদন %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "সাপ্তাহিক যাচাই নথিভুক্ত: ১ · আমি নিরাপদে আছি।"
    override val msgCheckInProblemRecorded = "সতর্কতা নথিভুক্ত (২ · সমস্যা)। সুরক্ষা ডেস্ককে জানানো হয়েছে।"
    override val msgCheckInAdminRequested = "জরুরি অ্যাডমিন কলব্যাক অনুরোধ করা হয়েছে (৩)। পারিবারিক সতর্কতা সারিতে আছে।"
    override val msgSafetyComplaintSubmittedFormat = "সুরক্ষা মামলা %1\$s নথিভুক্ত হয়েছে।"
    override val msgWithdrawalsFrozen = "জরুরি স্থগিতাদেশ চালু: সব উত্তোলন তাৎক্ষণিক লক করা হয়েছে।"
    override val msgWithdrawalsUnfrozen = "যাচাইয়ের পর উত্তোলন আনলক হয়েছে।"
    override val msgOwnerNoticePublished = "লাল LOBORO অ্যাডমিন বিজ্ঞপ্তি প্রকাশিত হয়েছে।"
}
