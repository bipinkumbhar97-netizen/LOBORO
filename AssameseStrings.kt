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

object AssameseStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "গ্লোবেল চাকৰি আৰু সেৱা"
    override val demoPreviewBanner = "ডেমো পূৰ্বদৰ্শন ডেটা · লাইভ ব্যৱহাৰৰ বাবে ছেটিংছত বেকএণ্ড API সংযোগ কৰক"
    override val verifiedNormalAccountBanner = "প্ৰমাণিত ব্যৱহাৰকাৰী একাউণ্ট · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO এডমিন জাননী"
    override val maintenanceModeBanner = "মেইণ্টেনেন্স ম'ড চলি আছে · চাকৰি আৰু ৱালেট সাময়িকভাৱে বন্ধ। জৰুৰী ১১২ আৰু সুৰক্ষা সেৱা খোলা আছে।"
    override val navHome = "হোম"
    override val navSearchJobs = "কাম বিচাৰক"
    override val navPostJob = "কাম পষ্ট কৰক"
    override val navWallet = "ৱালেট"
    override val navMyApplications = "মোৰ আবেদন"
    override val navMyJobs = "মোৰ কাম"
    override val navNotifications = "জাননী"
    override val navHelpSafety = "সহায় আৰু সুৰক্ষা"
    override val navProfile = "প্ৰফাইল"
    override val navSettings = "ছেটিংছ"
    override val navAdmin = "মালিক নিয়ন্ত্ৰণ"
    override val navBadgesLoyalty = "বেজ আৰু আনুগত্য"
    override val navIvrKeypad = "কিপেড আৰু IVR"
    override val backLabel = "পিছলৈ"
    override val homeLabel = "হোম"
    override val languageLabel = "ভাষা"
    override val languageSelectorTitle = "১২টা ভাষা"
    override val activeBadgeLabel = "সক্ৰিয়"
    override val closeLabel = "বন্ধ কৰক"
    override val okLabel = "ঠিক আছে"
    override val understoodLabel = "বুজিলোঁ"
    override val cancelLabel = "বাতিল কৰক"
    override val doneLabel = "সম্পূৰ্ণ"
    override val confirmActionLabel = "নিশ্চিত কৰক"
    override val resetLabel = "ৰিছেট"
    override val sendLabel = "পঠিয়াওক"

    override val shareAppTitle = "LOBORO এপ্ শ্বেয়াৰ কৰক"
    override val shareAppCta = "বন্ধুসকলক শ্বেয়াৰ কৰক আৰু পুৰস্কাৰ লাভ কৰক"
    override val yourReferralLinkLabel = "আপোনাৰ ৰেফাৰেল লিংক"
    override val loboroLinkLabel = "LOBORO লিংক"
    override val shareMenuButton = "শ্বেয়াৰ মেনু"
    override val copyLinkButton = "লিংক কপি কৰক"
    override val referralCopiedToast = "ৰেফাৰেল বাৰ্তা কপি হ'ল"
    override val openingShareMenuToast = "শ্বেয়াৰ মেনু খোল খাইছে"
    override val shareMessageTemplate = "LOBORO গ্লোবেল চাকৰি আৰু সেৱাত যোগদান কৰক! সমগ্ৰ ভাৰতত দৈনিক বা মাহিলী দৰমহাৰ কাম বিচাৰক। মোৰ ৰেফাৰেল ID %1\$s ব্যৱহাৰ কৰক: %2\$s"

    override val registerWorkerEmployerCta = "শ্ৰমিক / নিয়োগকৰ্তা হিচাপে পঞ্জীয়ন কৰক"
    override val logInLabel = "লগ ইন"
    override val signOutLabel = "ছাইন আউট"
    override val voiceSearchHint = "কাম বা চহৰ কওক বা লিখক (যেনে: হায়দৰাবাদত ৰাজমিস্ত্ৰী)"
    override val tapMicToSpeak = "কথা কৈ কাম বিচাৰিবলৈ মাইক টিপক"
    override val listeningStatus = "শুনি আছোঁ... আপোনাৰ কামৰ বিষয়ে কওক"
    override val stopListening = "শুনা বন্ধ কৰক"
    override val searchAction = "বিচাৰক"
    override val retryVoice = "পুনৰ কওক"
    override val voiceMicPermissionNeeded = "ভয়েচ সন্ধানৰ বাবে আপুনি মাইক বুটাম টিপিলেহে মাইক অনুমতি বিচৰা হয়।"
    override val voiceUnavailableHonest = "এই ডিভাইচত ভয়েচ চিনাক্তকৰণ সেৱা ইনষ্টল কৰা নাই। ক্লাউড ভয়েচ সেৱা যোগ কৰক বা তলৰ নমুনা টিপক।"
    override val voiceNoMatchError = "কথা স্পষ্টভাৱে বুজা নগ'ল। স্পষ্টকৈ কওক বা তলৰ উদাহৰণ বাছক।"
    override val voiceNetworkError = "নেটৱৰ্ক ত্ৰুটি। ইণ্টাৰনেট পৰীক্ষা কৰক বা কাম লিখক।"
    override val voiceStoppedError = "ভয়েচ ইনপুট বন্ধ হ'ল (ক'ড %1\$d)। টাইপ কৰক বা পুনৰ চেষ্টা কৰক।"
    override val voicePrivacyHint = "গোপনীয়তা: মাইক সাধাৰণতে বন্ধ থাকে আৰু আপুনি বুটাম টিপিলেহে সক্ৰিয় হয়।"
    override val clearSearchDesc = "সন্ধান মচক"
    override val spokenSamples = listOf(
        "হায়দৰাবাদত ৰাজমিস্ত্ৰী" to "Mason",
        "পুনেত ইলেক্ট্ৰিচিয়ান" to "Electrician",
        "চেন্নাই হোটেল ৰান্ধনী" to "Cook",
        "বিজয়ৱাড়া ড্ৰাইভাৰ" to "Driver",
        "চুৰাট পেকিং কাম" to "Packing"
    )
    override val dailyJobsTitle = "দৈনিক কাম (Daily)"
    override val dailyJobsSubtitle = "দৈনিক হাজিৰা · মাহিলী কামৰ পৰা পৃথক তালিকা"
    override val monthlyJobsTitle = "মাহিলী দৰমহাৰ কাম"
    override val monthlyJobsSubtitle = "নিশ্চিত মাহিলী দৰমহা · ছুটি আৰু থকাৰ বিৱৰণ"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "কামৰ শ্ৰেণীসমূহ (২৪টা)"
    override val walletStripSummaryFormat = "%1\$d কইন (₹%2\$d) · ১০০%% উলিয়াব পৰা"

    override val outOfStateTitle = "আন ৰাজ্যত আৰু বিশ্বব্যাপী কাম বিচাৰক"
    override val willingToRelocate = "আন ৰাজ্যলৈ গৈ কাম কৰিবলৈ ইচ্ছুক"
    override val filterCountry = "দেশ"
    override val filterState = "ৰাজ্য"
    override val filterDistrict = "জিলা"
    override val filterCity = "চহৰ"
    override val filterDistance = "দূৰত্ব"
    override val upToKmFormat = "%1\$d কি.মি. পৰ্যন্ত"
    override val filterFoodIncluded = "খাদ্যৰ ব্যৱস্থা"
    override val filterAccommodation = "থকা কোঠা / আৱাস"
    override val allCategoriesLabel = "সকলো শ্ৰেণী"
    override val noMatchingJobsTitle = "ফিল্টাৰ অনুসৰি কোনো কাম পোৱা নগ'ল"
    override val noMatchingJobsSubtitle = "ফিল্টাৰ ৰিছেট কৰক বা 'আন ৰাজ্যত কাম' সক্ৰিয় কৰক।"
    override val showAllJobsButton = "সকলো কাম দেখুৱাওক"
    override val dailyWageJobBadge = "দৈনিক হাজিৰা কাম"
    override val monthlySalaryJobBadge = "মাহিলী দৰমহাৰ কাম"
    override val demoDataTag = "ডেমো"
    override val originalLangFormat = "মূল ভাষা: %1\$s"
    override val preTranslatedPreviewNote = "পূৰ্ব-অনূদিত পূৰ্বদৰ্শন সক্ৰিয় আছে। লাইভ কামৰ বাবে ছেটিংছত অনুবাদ API ক'ড যোগ কৰক।"
    override val configureTranslationApiNote = "১২টা ভাষাত লাইভ অনুবাদৰ বাবে ছেটিংছত অনুবাদ API ক'ড যোগ কৰক।"
    override val translatedToggle = "অনূদিত"
    override val originalToggle = "মূল"
    override val compensationLabel = "হাজিৰা / দৰমহা"
    override val locationLabel = "স্থান"
    override val employerLabel = "নিয়োগকৰ্তা"
    override val vacanciesUnit = "খালী পদ"
    override val perDayFormat = "₹%1\$d / দিন"
    override val perMonthFormat = "₹%1\$d / মাহ"
    override val coinsCountFormat = "%1\$d কইন"
    override val foodBadge = "খাদ্য"
    override val stayBadge = "থকা ঠাই"
    override val shareJobButton = "কাম শ্বেয়াৰ কৰক"
    override val applyNow = "আবেদন কৰক"
    override val saveJob = "সংৰক্ষণ"
    override val negotiateChat = "কথা পাতক / চেট"
    override val reportJob = "অভিযোগ কৰক"
    override val foodAvailable = "খাদ্য অন্তৰ্ভুক্ত"
    override val accommodationAvailable = "থকা ঠাই অন্তৰ্ভুক্ত"
    override val notProvided = "অন্তৰ্ভুক্ত নহয়"
    override val workersNeeded = "প্ৰয়োজনীয় শ্ৰমিক"
    override val workHoursLabel = "কামৰ সময়"
    override val overtimeLabel = "অভাৰটাইম"
    override val paymentFreqLabel = "পেমেণ্ট"
    override val weeklyHolidayLabel = "সাপ্তাহিক ছুটি"
    override val leavePolicyLabel = "ছুটিৰ নিয়ম"
    override val joiningDateLabel = "যোগদানৰ তাৰিখ"
    override val expiryLabel = "ম্যাদ শেষ"
    override val translatedBadgeLabel = "অনূদিত"

    override val postingPausedFormat = "কাম পষ্ট কৰাটো বৰ্তমান মালিক নিয়ন্ত্ৰণ (%1\$s) দ্বাৰা বন্ধ ৰখা হৈছে।"
    override val selectCategoryLabel = "শ্ৰেণী বাছনি কৰক (২৪টা শ্ৰেণী)"
    override val jobTitleLabel = "কামৰ শিৰোনাম"
    override val jobTitlePlaceholder = "যেনে: হোষ্টেল ভৱনৰ বাবে ৪ জন ৰাজমিস্ত্ৰী লাগে"
    override val jobDescLabel = "কামৰ বিৱৰণ"
    override val jobDescPlaceholder = "কামৰ বিৱৰণ, সুৰক্ষা সঁজুলি, খাদ্য আৰু থকাৰ ব্যৱস্থা"
    override val dailyWageInrLabel = "দৈনিক হাজিৰা (₹)"
    override val monthlySalaryInrLabel = "মাহিলী দৰমহা (₹)"
    override val vacanciesLabel = "খালী পদ"
    override val cityTownLabel = "চহৰ / নগৰ"
    override val stateLabel = "ৰাজ্য"
    override val transparentJobFeeTitle = "স্বচ্ছ চাকৰি মাচুল: %1\$d কইন (₹%2\$d)"
    override val configuredByOwnerSub = "মালিকে নিৰ্ধাৰণ কৰা · মাচুল সময়: %1\$s · উপলব্ধ: %2\$d কইন"
    override val confirmAndPostJobButton = "নিশ্চিত কৰি কাম পষ্ট কৰক (%1\$d কইন)"

    override val walletBalanceTitle = "LOBORO কইন বেলেঞ্চ"
    override val withdrawableValueFormat = "₹%1\$d উলিয়াব পৰা মূল্য (১ কইন = ₹%2\$d)"
    override val withdrawableRuleTitle = "১০০% সমান টকা উলিওৱাৰ নিয়ম"
    override val withdrawableRuleBody = "ক্ৰয় কৰা, উপহাৰ, অফাৰ, ৰেফাৰেল, বেজ বা আনুগত্যৰ সকলো কইনৰ নগদ মূল্য সমান আৰু ১০০% উলিয়াব পাৰি। কোনো লক কইন নাই।"
    override val buyCoins = "কইন কিনক"
    override val withdrawCoins = "টকা উলিয়াওক"
    override val walletActionsPausedNote = "কিছুমান ৱালেট সেৱা মালিকে বন্ধ কৰিছে। আপোনাৰ বৰ্তমান বেলেঞ্চ আৰু অনুমোদিত ৰিফাণ্ড সুৰক্ষিত আছে।"
    override val coinPackagesTitle = "কইন পেকেজ (স্বচ্ছ মূল্য)"
    override val bankSecurityTitle = "বেংক / UPI আৰু মুখ পৰীক্ষাৰ সুৰক্ষা"
    override val payoutDestinationLabel = "প্ৰমাণিত বেংক একাউণ্ট: %1\$s"
    override val bankSecurityStepsNote = "বেংক/UPI সলনিৰ বাধ্যতামূলক পৰীক্ষা: পঞ্জীয়িত মোবাইল OTP + লাইভ চেলফি মিল + অস্থায়ী পেমেণ্ট বিৰতি।"
    override val changeBankUpiButton = "বেংক / UPI সলনি কৰক (OTP + মুখ পৰীক্ষা)"
    override val unfreezePayoutsButton = "উলিওৱা আনলক কৰক"
    override val lostPhoneFreezeButton = "ফোন হেৰাল? টকা উলিওৱা বন্ধ কৰক"
    override val payoutFreezeActiveNote = "উলিওৱা নিষেধাজ্ঞা সক্ৰিয় আছে। পৰিচয় পুনৰ প্ৰমাণ নোহোৱালৈকে টকা উলিয়াব নোৱাৰিব।"
    override val transactionHistory = "কইন লেনদেনৰ খতিয়ান"
    override val demoLedgerSuffix = "(ডেমো খতিয়ান)"
    override val buyCoinsDialogTitleFormat = "%1\$d কইন কিনক (₹%2\$d)"
    override val paymentNotConnectedBody = "লাইভ Razorpay / Cashfree UPI পেমেণ্ট এতিয়াও সংযোগ হোৱা নাই। প্ৰকৃত টকা লোৱাৰ আগতে প্ৰডাকচন ক'ড সংযোগ কৰক।"
    override val withdrawDialogTitleFormat = "₹%1\$d উলিয়াওক"
    override val withdrawDialogBodyFormat = "সম্পূৰ্ণ বেলেঞ্চ (%1\$d কইন) সমান নগদ মূল্যত ১০০%% উলিয়াব পাৰি।\nএকাউণ্ট: %2\$s\n\nএই বিল্ডত লাইভ IMPS / UPI গেটৱে সংযোগ নাই।"
    override val bankChangeDialogTitle = "৩-স্তৰীয় বেংক / UPI সুৰক্ষা"
    override val bankChangeDialogBody = "ফোন হেৰালেও সুৰক্ষাৰ বাবে বেংক/UPI সলনি কৰিবলৈ লাগিব:\n১. পঞ্জীয়িত মোবাইল OTP পৰীক্ষা\n২. পঞ্জীয়ন ফটোৰ সৈতে লাইভ মুখ মিল\n৩. মুকলিৰ আগতে সুৰক্ষা অপেক্ষা সময়"
    override val receiptDialogTitle = "লেনদেন ৰচিদ"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "প্ৰসংগ: %1\$s"
    override val receiptTypeLabel = "ধৰণ: %1\$s"
    override val receiptCoinsLabel = "কইন: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "অৱস্থা: %1\$s"
    override val receiptTimeLabel = "সময়: %1\$s"
    override val receiptWithdrawableYes = "উলিওৱাৰ যোগ্যতা: ১০০% হয়"

    override val employerAppsHeading = "আবেদন আৰু পোনপটীয়া বাৰ্তালাপ"
    override val secureChatHeading = "সুৰক্ষিত শ্ৰমিক ↔ নিয়োগকৰ্তা চেট"
    override val secureChatSubtitle = "আপুনি নিজে শ্বেয়াৰ নকৰালৈকে ফোন নম্বৰ লুকুৱাই থাকে। খুলিবলৈ বা ব্লক কৰিবলৈ টিপক।"
    override val chatButton = "চেট"
    override val workerEmployerLineFormat = "শ্ৰমিক: %1\$s (%2\$s) · নিয়োগকৰ্তা: %3\$s"
    override val shortlistButton = "শ্বৰ্টলিষ্ট"
    override val acceptButton = "গ্ৰহণ কৰক"
    override val withdrawButton = "প্ৰত্যাহাৰ"
    override val phoneHiddenPrivacy = "গোপনীয়তা সক্ৰিয়: দুয়োপক্ষৰ সন্মতি অবিহনে ফোন নম্বৰ গোপনে থাকে।"
    override val blockUserLabel = "ব্লক"
    override val userBlockedNotice = "আপুনি এই বাৰ্তালাপ ব্লক কৰিছে। প্ৰয়োজন হ'লে সুৰক্ষা ডেস্কত জনাওক।"
    override val chatPlaceholder = "আপোনাৰ ভাষাত বাৰ্তা লিখক..."

    override val automaticBadgePrefix = "স্বয়ংক্ৰিয় বেজ: %1\$s"
    override val badgeStatsFormat = "ৰেটিং %1\$.1f ★ · %2\$d প্ৰমাণিত কৰ্মদিন · %3\$d সম্পূৰ্ণ কাম"
    override val progressToFormat = "%1\$s বেজৰ অগ্ৰগতি: %2\$d / %3\$d দিন"
    override val badgeAntiAbuseNote = "বেজ কেৱল প্ৰকৃত সম্পূৰ্ণ কাম, প্ৰমাণিত উপস্থিতি আৰু নিৰপেক্ষ ৰেটিঙৰ দ্বাৰা স্বয়ংক্ৰিয়ভাৱে পোৱা যায় — কিনা নাযায়।"
    override val badgeTiersTitle = "৫টা স্বয়ংক্ৰিয় বেজ স্তৰ"
    override val minWorkdaysFormat = "ন্যূনতম %1\$d কৰ্মদিন · ন্যূনতম %2\$.1f★ ৰেটিং"
    override val badgeAppealsNote = "ন্যায় সংৰক্ষণ: হঠাতে অহা সন্দেহজনক ১-ষ্টাৰ ৰেটিং অভিযোগৰ জৰিয়তে পৰ্যালোচনা কৰা হয়।"
    override val loyaltyTitle = "জ্যেষ্ঠতা আৰু আনুগত্য আৰ্থিক সহায়"
    override val loyaltySubtitle = "স্বচ্ছ তিনিমহীয়া কল্যাণ আৰু মাইলৰ খুঁটি বোনাছ"
    override val loyaltyDisclaimer = "বাধ্যতামূলক জাননী: এইটো বীমা নহয় আৰু নিশ্চিত মাহিলী পেঞ্চনো নহয়। যোগ্যতা, কৰ্মদিন, বাজেট আৰু অনুমোদনৰ ওপৰত নিৰ্ভৰশীল।"
    override val loyaltyMinMembershipFormat = "ন্যূনতম সদস্যপদ: %1\$d মাহ"
    override val loyaltyWorkdaysFormat = "প্ৰমাণিত কৰ্মদিন: %1\$d+ দিন"
    override val loyaltyRequiredBadgeFormat = "প্ৰয়োজনীয় বেজ: %1\$s+"
    override val loyaltyRequiredRatingFormat = "ন্যূনতম ৰেটিং: %1\$.1f★"
    override val loyaltyBudgetFormat = "অনুমোদিত সহায়: ₹%1\$d · বাজেট পুঁজি: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "শ্ৰমিক সুৰক্ষা আৰু জৰুৰীকালীন সহায়"
    override val callEmergency112 = "জৰুৰী ১১২ ত কল কৰক"
    override val weeklyCheckInTitle = "সাপ্তাহিক সুৰক্ষা পৰীক্ষা"
    override val weeklyCheckInQuestion = "আপুনি সুৰক্ষিত নে?"
    override val checkInOpt1 = "১ · মই সুৰক্ষিত আছোঁ"
    override val checkInOpt2 = "২ · মোৰ সমস্যা হৈছে"
    override val checkInOpt3 = "৩ · LOBORO এডমিনৰ সৈতে কথা পাতক"
    override val reportSafetyIssue = "সুৰক্ষা / হাজিৰা অভিযোগ দিয়ক"
    override val safetyOperationalNote = "কাম পষ্ট বা পেমেণ্ট বন্ধ থাকিলেও সুৰক্ষা সেৱা সদায় চলি থাকে।"
    override val safetyDisclaimerNote = "তাৎক্ষণিক বিপদত পোনপটীয়াকৈ ১১২ ত কল কৰক। নিৰপেক্ষ মধ্যস্থতাৰ বাবে LOBORO ই অভিযোগ নথিভুক্ত কৰে।"
    override val everyDaysFormat = "প্ৰতি %1\$d দিনত"
    override val lastStatusFormat = "শেষ পৰীক্ষা: %1\$s"
    override val checkInNoResponseNote = "একেলগে ২টা পৰীক্ষা বাদ পৰিলে বা সমস্যা বাছনি কৰিলে LOBORO ই SMS, এডমিন পৰ্যালোচনা আৰু সন্মতিত পৰিয়ালক জনায়।"
    override val consentEmergencyTitle = "সন্মতিভিত্তিক জৰুৰী অৱস্থান আৰু পৰিয়ালৰ যোগাযোগ"
    override val workerIdLabel = "শ্ৰমিক ID: %1\$s"
    override val homeOriginLabel = "মূল ঘৰ: %1\$s, %2\$s"
    override val currentJobCityLabel = "বৰ্তমান কামৰ চহৰ: %1\$s"
    override val emergencyContactLabel = "জৰুৰী যোগাযোগ: %1\$s (%2\$s)"
    override val consentGranted = "সন্মতি প্ৰাপ্ত"
    override val consentPending = "সন্মতি বাকী"
    override val employerLoboroIdInput = "নিয়োগকৰ্তা LOBORO ID (যেনে LB819)"
    override val currentSiteInput = "বৰ্তমান কামৰ চহৰ / স্থান"
    override val describeIssueInput = "সুৰক্ষা বা হাজিৰাৰ সমস্যা লিখক"
    override val submitSafetyDeskButton = "সুৰক্ষা ডেস্কলৈ পঠিয়াওক"
    override val safetyCasesHeading = "শেহতীয়া সুৰক্ষা গোচৰ (অডিটযোগ্য)"
    override val ivrTitle = "কিপেড ফোন মিছড-কল আৰু IVR মেনু"
    override val ivrSubtitle = "স্মাৰ্টফোন নোহোৱাকৈ ট'ল-ফ্ৰী / মিছড-কল কলবেকৰ জৰিয়তে কাম কৰে"
    override val ivrArchNote = "লাইভ ছিষ্টেম Exotel / Knowlarity / Twilio Voice ৰ সৈতে সংযুক্ত হয়। ১২-ভাষাৰ ভয়েচ মেনু পৰীক্ষা কৰিবলৈ বুটাম টিপক।"
    override val ivrMenuTitle = "LOBORO ভয়েচ IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO লৈ স্বাগতম! ভয়েচ মেনু শুনিবলৈ কিপেড নম্বৰ টিপক।"
    override val pressKeyFormat = "%1\$s টিপক → %2\$s"
    override val ivrSelectedSummaryFormat = "বাছনি কৰা [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "আজিৰ দৈনিক হাজিৰা কাম",
        "2" to "মাহিলী দৰমহাৰ কাম",
        "3" to "সাপ্তাহিক সুৰক্ষা পৰীক্ষা ('আপুনি সুৰক্ষিত নে?')",
        "4" to "ৱালেট কইন আৰু শেহতীয়া স্থিতি শুনক",
        "5" to "জৰুৰী এডমিন কলবেক",
        "6" to "আবেদনৰ স্থিতি পৰীক্ষা কৰক",
        "0" to "পছন্দৰ ভয়েচ ভাষা সলনি কৰক"
    )

    override val userRegTitle = "শ্ৰমিক আৰু নিয়োগকৰ্তা পঞ্জীয়ন"
    override val userLoginTitle = "শ্ৰমিক আৰু নিয়োগকৰ্তা লগ ইন"
    override val userAuthSubtitle = "OTP-প্ৰমাণিত সাধাৰণ ব্যৱহাৰকাৰী একাউণ্ট · গোপন মালিক ব্যৱস্থাৰ পৰা সম্পূৰ্ণ পৃথক"
    override val registerTab = "পঞ্জীয়ন"
    override val loginTab = "লগ ইন"
    override val dbOtpNotConnectedTitle = "বেকএণ্ড ডাটাবেছ / OTP সংযোগ নাই"
    override val dbOtpNotConnectedBody = "প্ৰকৃত শ্ৰমিক আৰু নিয়োগকৰ্তা একাউণ্ট সংৰক্ষণ কৰিবলৈ LOBORO_BACKEND_URL সংযোগ কৰক।"
    override val selectAccountTypeStep = "১. একাউণ্টৰ ধৰণ বাছক"
    override val workerAccountLabel = "শ্ৰমিক"
    override val employerAccountLabel = "নিয়োগকৰ্তা"
    override val regPausedForRoleFormat = "%1\$s পঞ্জীয়ন বৰ্তমান মালিকে সাময়িকভাৱে বন্ধ ৰাখিছে।"
    override val preferredLanguageLabel = "পছন্দৰ এপ্ ভাষা (১২টা ভাষা)"
    override val fullNameStepLabel = "২. সম্পূৰ্ণ নাম *"
    override val businessNameStepLabel = "২. ব্যৱসায় / ঠিকাদাৰৰ সম্পূৰ্ণ নাম *"
    override val mobileStepLabel = "৩. মোবাইল নম্বৰ (১০টা সংখ্যা) *"
    override val sendRegOtpButton = "OTP পঠিয়াওক"
    override val resendMobileOtpButton = "পুনৰ OTP পঠিয়াওক"
    override val enterOtpStepLabel = "৪. মোবাইল OTP দিয়ক *"
    override val verifyOtpButton = "OTP পৰীক্ষা কৰক"
    override val verifiedLabel = "প্ৰমাণিত"
    override val mobileVerifiedNote = "চাৰ্ভাৰত মোবাইল প্ৰমাণিত হ'ল"
    override val homeStateLabel = "নিজ ৰাজ্য"
    override val homeDistrictLabel = "নিজ জিলা"
    override val stateShortLabel = "ৰাজ্য"
    override val cityShortLabel = "চহৰ"
    override val workCityStateLabel = "বৰ্তমান কামৰ চহৰ আৰু ৰাজ্য"
    override val businessLocationLabel = "ব্যৱসায়ৰ চহৰ আৰু ৰাজ্য"
    override val skillsCategoriesLabel = "দক্ষতা / কাম (যেনে ৰাজমিস্ত্ৰী, ইলেক্ট্ৰিচিয়ান)"
    override val hiringCategoriesLabel = "নিয়োগ শ্ৰেণীসমূহ"
    override val emergencyContactNameLabel = "জৰুৰী পৰিয়াল যোগাযোগৰ নাম"
    override val emergencyContactPhoneLabel = "জৰুৰী যোগাযোগ নম্বৰ"
    override val uniqueLbIdNotice = "সম্পূৰ্ণ হ'লে চাৰ্ভাৰে স্থায়ী LB ID (LB2000+) দিব। VIP আৰু মালিক নম্বৰ সুৰক্ষিত থাকে।"
    override val creatingProfileLabel = "প্ৰফাইল তৈয়াৰ হৈ আছে..."
    override val createProfileButton = "শ্ৰমিক / নিয়োগকৰ্তা প্ৰফাইল বনাওক"
    override val loginHeading = "পঞ্জীয়িত মোবাইল OTP ৰে লগ ইন কৰক"
    override val loginSubtitle = "শ্ৰমিক বা নিয়োগকৰ্তা হিচাপে পঞ্জীয়ন কৰা মোবাইল নম্বৰ দিয়ক।"
    override val registeredMobileLabel = "পঞ্জীয়িত মোবাইল নম্বৰ"
    override val sendLoginOtpButton = "লগ ইন OTP পঠিয়াওক"
    override val resendLoginOtpButton = "OTP পুনৰ পঠিয়াওক"
    override val enterLoginOtpLabel = "লগ ইন OTP দিয়ক"
    override val verifyingOtpLabel = "পৰীক্ষা চলি আছে..."
    override val verifyOtpOpenHomeButton = "OTP পৰীক্ষা কৰি হোম খোলক"
    override val backToHomepageButton = "হোমপেজলৈ ঘূৰি যাওক"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "ভূমিকা"
    override val offlinePreviewHeading = "অফলাইন প্ৰফাইল আৰু ফটো পূৰ্বদৰ্শন"
    override val offlinePreviewCardTitle = "প্ৰফাইল বনাওক / সম্পাদনা কৰক (অফলাইন পূৰ্বদৰ্শন)"
    override val offlinePreviewCardSubtitle = "লাইভ ডাটাবেছ সংযোগ নোহোৱালৈকে স্থানীয় পূৰ্বদৰ্শন হিচাপে সংৰক্ষণ হয়।"
    override val workLocationLabel = "কামৰ স্থান (চহৰ, ৰাজ্য)"
    override val businessAddressLabel = "ব্যৱসায়ৰ চহৰ, ৰাজ্য"
    override val skillsExpLabel = "দক্ষতা / কামৰ ধৰণ"
    override val businessCatLabel = "ব্যৱসায়ৰ ধৰণ / নিয়োগ শ্ৰেণী"
    override val aadhaarPrivacyNote = "তথ্য সুৰক্ষা: LOBORO ই ডিভাইচত আধাৰ ফটো ৰাখিব নোৱাৰে — কেৱল প্ৰমাণিত হেশ্ব আৰু সন্মতি সংৰক্ষণ কৰে।"
    override val selectProfilePhotoBtn = "প্ৰফাইল ফটো বাছক (ফটো পিকাৰ)"
    override val photoSelectedBtn = "ফটো নিৰ্বাচিত ✓"
    override val offlineConsentCheck = "সুৰক্ষা পৰীক্ষা আৰু যোগাযোগ নাপালে পৰিয়ালক জৰুৰী খবৰ পঠিয়াবলৈ মই সন্মতি দিছোঁ।"
    override val previewProfileBtn = "পূৰ্বদৰ্শন প্ৰফাইল সংৰক্ষণ কৰক"
    override val audienceScopeFormat = "লক্ষ্য: %1\$s · অঞ্চল: %2\$s · %3\$s"
    override val settingsHeading = "ছেটিংছ আৰু প্লেটফৰ্ম তথ্য"
    override val languageSectionTitle = "এপৰ ভাষা (সকলো ১২টা ভাৰতীয় ভাষা)"
    override val languageSectionSubtitle = "আপোনাৰ সক্ৰিয় একাউণ্টৰ বাবে পৃথককৈ সংৰক্ষণ হয়। আন ব্যৱহাৰকাৰীৰ ভাষা সলনি নহয়।"
    override val languagePausedByOwner = "মালিক নিয়ন্ত্ৰণ দ্বাৰা ভাষা সলনি সাময়িকভাৱে বন্ধ আছে।"
    override val lowDataTitle = "কম-ডেটা ম'ড"
    override val lowDataSubtitle = "২জি/৩জি গ্ৰাম্য নেটৱৰ্কত মোবাইল ডেটা ৰাহি কৰে"
    override val reducedMotionTitle = "কম এনিমেচন আৰু স্পষ্ট দৃশ্য"
    override val reducedMotionSubtitle = "স্পষ্ট আখৰ আৰু সহজ স্ক্ৰীণ গতি"
    override val privacyPolicyTitle = "গোপনীয়তা নীতি আৰু তথ্য সুৰক্ষা"
    override val privacyPolicyBody = "• আপোনাৰ অনুমতি অবিহনে চেটত ফোন নম্বৰ গোপনে থাকে।\n• ভয়েচ সন্ধান বুটাম টিপিলেহে মাইক সক্ৰিয় হয়।\n• ফটো বাছনিৰ বাবে সুৰক্ষিত ফটো পিকাৰ ব্যৱহাৰ কৰা হয়।\n• কেৱল আপোনাৰ সন্মতিৰে পৰিয়ালক জৰুৰী অৱস্থান পঠিওৱা হয়।"
    override val termsOfServiceTitle = "সেৱাৰ চৰ্তসমূহ আৰু ন্যায্য নিয়ম"
    override val termsOfServiceBody = "• দৈনিক হাজিৰা আৰু মাহিলী দৰমহাৰ কাম পৃথক ৰখা হৈছে।\n• প্ৰতিটো LOBORO কইন ১০০% সমান নগদ মূল্য আৰু উলিয়াব পৰা।\n• বেজ কেৱল প্ৰকৃত কৰ্মদিন আৰু ন্যায্য ৰেটিঙৰ জৰিয়তে পোৱা যায়।\n• VIP ID (LB1–LB1999) কেৱল মালিকৰ বাবে সংৰক্ষিত।"
    override val helpSupportTitle = "সহায়, সমৰ্থন আৰু সুৰক্ষা ডেস্ক"
    override val helpSupportBody = "• তাৎক্ষণিক বিপদত ১১২ ত কল কৰক (লগ ইন নোহোৱাকৈ ২৪x৭)।\n• হাজিৰা বা থকা সমস্যাৰ বাবে সহায় আৰু সুৰক্ষা ডেস্কত গোচৰ দিয়ক।\n• কিপেড ফোনত ট'ল-ফ্ৰী কলবেকৰ বাবে কিপেড আৰু IVR খোলক।"
    override val backendChecklistTitle = "বেকএণ্ড আৰু API সংযোগ স্থিতি"
    override val providersLabel = "সেৱা প্ৰদানকাৰী: %1\$s"
    override val secretsLabel = "গোপন ক'ড: %1\$s"

    override val ownerSetupTitle = "এককালীন মালিক / চুপাৰ এডমিন ছেটআপ"
    override val ownerSetupSubtitle = "কেৱল LOBORO সৃষ্টিকৰ্তাৰ বাবে। এবাৰ পঞ্জীয়ন হ'লে চিৰদিনৰ বাবে লক হয়।"
    override val ownerSetupLockNote = "সুৰক্ষা লক: কেৱল এটা মালিক একাউণ্টহে সৃষ্টি হ'ব পাৰে। কোনো শ্ৰমিক বা নিয়োগকৰ্তাই ব্যৱহাৰ কৰিব নোৱাৰে।"
    override val ownerBackendReqTitle = "মালিক চাৰ্ভাৰ সংযোগ হোৱা নাই"
    override val ownerBackendReqBody = "পাছৱৰ্ড আৰু ৪-অংকৰ PIN চাৰ্ভাৰত সুৰক্ষিত ৰাখিবলৈ LOBORO_BACKEND_URL ছেট কৰক।"
    override val serverSetupAuthHeading = "১. চাৰ্ভাৰ ছেটআপ অনুমোদন"
    override val bootstrapSecretLabel = "ৱান-টাইম চাৰ্ভাৰ বুটষ্ট্ৰেপ ক'ড *"
    override val bootstrapSecretPlaceholder = "আপোনাৰ চাৰ্ভাৰ OWNER_BOOTSTRAP_SECRET ৰ পৰা"
    override val ownerIdentityHeading = "২. মালিক পৰিচয় আৰু মোবাইল OTP"
    override val ownerNameField = "মালিকৰ সম্পূৰ্ণ নাম *"
    override val ownerMobileField = "মালিকৰ ব্যক্তিগত মোবাইল নম্বৰ *"
    override val ownerSendOtpBtn = "মালিক OTP পঠিয়াওক"
    override val ownerMobileVerifiedNote = "মালিক মোবাইল OTP প্ৰমাণিত হ'ল"
    override val credentialsHeading = "৩. পাছৱৰ্ড আৰু ৪-অংকৰ এডমিন PIN"
    override val createPasswordLabel = "লগ ইন পাছৱৰ্ড বনাওক (৮+ আখৰ) *"
    override val confirmPasswordLabel = "লগ ইন পাছৱৰ্ড নিশ্চিত কৰক *"
    override val passwordsMismatchError = "পাছৱৰ্ড মিলা নাই"
    override val createPinLabel = "৪-অংকৰ এডমিন PIN বনাওক *"
    override val confirmPinLabel = "৪-অংকৰ এডমিন PIN নিশ্চিত কৰক *"
    override val pinsMismatchError = "PIN মিলা নাই"
    override val credentialsHashNote = "চাৰ্ভাৰে পাছৱৰ্ড আৰু PIN Argon2id ৰে সুৰক্ষিত কৰে। এপত সংৰক্ষণ নহয়।"
    override val registeringOwnerLabel = "মালিক একাউণ্ট তৈয়াৰ হৈ আছে..."
    override val completeOwnerRegButton = "মালিক পঞ্জীয়ন সম্পূৰ্ণ কৰি ডেশ্বব'ৰ্ড খোলক"
    override val returnToAppButton = "LOBORO এপলৈ ঘূৰি যাওক"
    override val adminPinHeader = "মালিক নিয়ন্ত্ৰণ · ৪-অংকৰ PIN প্ৰয়োজন"
    override val adminPinPrompt = "আপোনাৰ ৪-অংকৰ মালিক এডমিন PIN দিয়ক। চাৰ্ভাৰত সীমাসহ পৰীক্ষা কৰা হয়।"
    override val pinLockoutFormat = "অধিক ভুল চেষ্টা। %1\$d ছেকেণ্ড পিছত পুনৰ চেষ্টা কৰক।"
    override val clrKeyLabel = "মচক"
    override val verifyPinServerBtn = "চাৰ্ভাৰত ৪-অংকৰ PIN পৰীক্ষা কৰক"
    override val pinSecurityPolicyFormat = "৫টা ভুল চেষ্টাত লক · ৫ মিনিট নিষ্ক্ৰিয়তাত লগআউট · বাকী চেষ্টা: %1\$d"
    override val ownerMasterControlTitle = "মালিক মাষ্টাৰ কণ্ট্ৰ'ল"
    override val ownerMasterSubtitle = "কেৱল মালিক চুপাৰ এডমিন · চাৰ্ভাৰ PIN + OTP + অডিট লগ"
    override val ownerSessionLockedNote = "মালিক ছেছন লক আছে। মাষ্টাৰ কণ্ট্ৰ'লৰ বাবে চাৰ্ভাৰ-প্ৰমাণিত ৪-অংকৰ PIN লাগিব।"
    override val verifyOwnerPinBtn = "মালিক ৪-অংকৰ PIN পৰীক্ষা কৰক"
    override val ownerProfileLineFormat = "মালিক প্ৰফাইল · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "পঞ্জীয়িত মোবাইল: %1\$s · একক মালিক একাউণ্ট (%2\$s)"
    override val activeSessionFormat = "সক্ৰিয় মালিক ছেছন · %1\$dm %2\$02ds ত লগআউট"
    override val serverAuthorityNote = "ছেছন টোকেন প্ৰমাণিত (চাৰ্ভাৰ কৰ্তৃত্ব)"
    override val lockAndExitBtn = "লক কৰি ওলাই যাওক"
    override val mandatoryProtectionTitle = "বাধ্যতামূলক সুৰক্ষা আৰু আৰ্থিক দায়বদ্ধতা ৰক্ষা"
    override val mandatoryProtectionBody = "বৈশিষ্ট্য বন্ধ কৰিলে বা মেইণ্টেনেন্স ম'ড দিলে চলি থকা আৰ্থিক দায়বদ্ধতা, ৰিফাণ্ড আৰু ১১২ জৰুৰী সেৱা বাতিল নহয়।"
    override val changePinTitle = "এডমিন PIN সলনি কৰক (OTP পৰীক্ষা বাধ্যতামূলক)"
    override val changePinSubtitle = "কেৱল মালিকৰ বাবে। বৰ্তমান PIN কেতিয়াও নেদেখুৱায়। পঞ্জীয়িত মোবাইল OTP বাধ্যতামূলক।"
    override val otpToRegisteredMobileNote = "OTP কেৱল পঞ্জীয়িত মালিকৰ মোবাইললৈহে পঠিওৱা হ'ব: %1\$s"
    override val sendPinChangeOtpBtn = "পঞ্জীয়িত মালিক মোবাইললৈ OTP পঠিয়াওক"
    override val otpDispatchedNote = "মালিকৰ পঞ্জীয়িত মোবাইললৈ (%1\$s) OTP পঠিওৱা হ'ল।"
    override val enterServerOtpLabel = "চাৰ্ভাৰ OTP ক'ড দিয়ক"
    override val verifyOtpServerBtn = "চাৰ্ভাৰত OTP পৰীক্ষা কৰক"
    override val otpVerifiedNewPinNote = "OTP প্ৰমাণিত। এতিয়া নতুন ৪-অংকৰ মালিক PIN দিয়ক আৰু নিশ্চিত কৰক।"
    override val newPinLabel = "নতুন ৪-অংকৰ PIN"
    override val confirmNewPinLabel = "নতুন ৪-অংকৰ PIN নিশ্চিত কৰক"
    override val saveNewPinBtn = "নিশ্চিত কৰি এডমিন PIN আপডেট কৰক"
    override val confirmPinChangeTitle = "এডমিন PIN সলনি নিশ্চিত কৰক"
    override val confirmPinChangeDesc = "চাৰ্ভাৰত ৪-অংকৰ মালিক PIN সলনি কৰিবনে? ছেছন চলি থাকিব আৰু অডিট লগ ৰখা হ'ব।"
    override val pinUpdatedNote = "নতুন ৪-অংকৰ মালিক PIN চাৰ্ভাৰত আপডেট হ'ল।"
    override val completeMasterControlTitle = "সম্পূৰ্ণ মালিক মাষ্টাৰ কণ্ট্ৰ'ল (২৫টা মডিউল)"
    override val masterControlScopeSubtitle = "অঞ্চল বা ব্যৱহাৰকাৰী ভূমিকা অনুসৰি তৎক্ষণাত ON/OFF নিয়ন্ত্ৰণ।"
    override val scopeOptions = listOf(
        "বিশ্বব্যাপী · ভাৰত (সকলো ৰাজ্য)",
        "কেৱল তেলেংগানা",
        "কেৱল তামিলনাডু",
        "কেৱল শ্ৰমিক",
        "কেৱল নিয়োগকৰ্তা"
    )
    override val masterControlNames = listOf(
        "১. সম্পূৰ্ণ এপ্ আৰু মেইণ্টেনেন্স ম'ড",
        "২. শ্ৰমিক পঞ্জীয়ন",
        "৩. নিয়োগকৰ্তা পঞ্জীয়ন",
        "৪. কাম পষ্ট কৰা",
        "৫. কাম বিচৰা",
        "৬. দৈনিক হাজিৰা কাম",
        "৭. মাহিলী দৰমহাৰ কাম",
        "৮. কইন ক্ৰয়",
        "৯. ৱালেট টকা উলিওৱা",
        "১০. চাকৰি মাচুল আৰু কইন মূল্য",
        "১১. অফাৰ আৰু প্ৰমোচন",
        "১২. ৰেফাৰেল পুৰস্কাৰ",
        "১৩. জাননী আৰু ঘোষণা",
        "১৪. শ্ৰমিক আৰু নিয়োগকৰ্তা একাউণ্ট নিয়ন্ত্ৰণ",
        "১৫. কামৰ শ্ৰেণী আৰু উপশ্ৰেণী",
        "১৬. ৰেটিং আৰু স্বয়ংক্ৰিয় বেজ",
        "১৭. জ্যেষ্ঠতা আৰু আনুগত্য সহায়",
        "১৮. জৰুৰী আৰু শ্ৰমিক সুৰক্ষা ব্যৱস্থা",
        "১৯. SMS সতৰ্কতা",
        "২০. IVR সেৱা",
        "২১. ভাষা ছেটিংছ (১২টা ভাষা)",
        "২২. দেশ, ৰাজ্য আৰু চহৰ উপলব্ধতা",
        "২৩. VIP ID সংৰক্ষণ আৰু পৰিচালনা",
        "২৪. প্ৰতিবেদন, অভিযোগ আৰু নিয়ন্ত্ৰণ",
        "২৫. পেমেণ্ট গেটৱে সংযোগ"
    )
    override val publishNoticeTitle = "ৰঙা LOBORO এডমিন জাননী প্ৰকাশ কৰক"
    override val announcementMessageLabel = "ঘোষণা বাৰ্তা"
    override val announcementPlaceholder = "যেনে: আন ৰাজ্যৰ শ্ৰমিকসকলৰ বাবে নতুন সুৰক্ষা হেল্পলাইন"
    override val actionLinkLabel = "বুটামৰ নাম"
    override val scopeFieldLabel = "অঞ্চল / ৰাজ্য পৰিসৰ"
    override val audienceOptions = listOf("সকলো ব্যৱহাৰকাৰী", "শ্ৰমিক", "নিয়োগকৰ্তা")
    override val broadcastNoticeBtn = "ৰঙা এডমিন জাননী প্ৰচাৰ কৰক"
    override val confirmBroadcastTitle = "ৰঙা LOBORO এডমিন জাননী প্ৰচাৰ কৰিবনে?"
    override val confirmBroadcastDescFormat = "বাৰ্তা: %1\$s\nশ্ৰোতা: %2\$s · অঞ্চল: %3\$s"
    override val coinPricingTitle = "কইন মূল্য আৰু মাচুল নিয়ন্ত্ৰণ"
    override val coinPricingSummaryFormat = "১ কইন = ₹%1\$d · দৈনিক = %2\$d কইন · বিশেষ = %3\$d কইন · মাহিলী = %4\$d কইন · সময়: %5\$s"
    override val dailyBtnFormat = "দৈনিক +১ (%1\$d)"
    override val masonBtnFormat = "বিশেষ +১ (%1\$d)"
    override val monthlyBtnFormat = "মাহিলী +৫ (%1\$d)"
    override val protectedVipIdsTitle = "সুৰক্ষিত VIP আৰু মালিক ID (কেতিয়াও স্বয়ংক্ৰিয়ভাৱে দিয়া নহয়)"
    override val protectedVipIdsNote = "সাধাৰণ ব্যৱহাৰকাৰীয়ে সদায় LB2000+ লাভ কৰে। বিশেষ নম্বৰ কেৱল মালিকৰ আবণ্টনৰ বাবে সংৰক্ষিত।"
    override val safetyInvestigationTitle = "সুৰক্ষা গোচৰ আৰু অভিযোগ তদন্ত ডেস্ক"
    override val manageCategoriesTitle = "২৪টা কামৰ শ্ৰেণী পৰিচালনা (তৎক্ষণাত ON/OFF)"
    override val showAll24Label = "সকলো ২৪টা দেখুৱাওক"
    override val showLessLabel = "কম দেখুৱাওক"
    override val auditLogTitle = "মালিক কাৰ্য অডিট লগ"
    override val confirmToggleTitleFormat = "%1\$s নিশ্চিত কৰক"
    override val confirmToggleDescFormat = "%3\$s ৰ বাবে \"%1\$s\" ক %2\$s কৰিবনে? বৰ্তমান আৰ্থিক দায়বদ্ধতা আৰু ১১২ সুৰক্ষা সেৱা সুৰক্ষিত থাকিব।"

    override val categories = mapOf(
        JobCategoryId.MASON to "ৰাজমিস্ত্ৰী / মেছন",
        JobCategoryId.CONSTRUCTION_LABOUR to "নিৰ্মাণ শ্ৰমিক",
        JobCategoryId.GENERAL_LABOUR to "সাধাৰণ শ্ৰমিক",
        JobCategoryId.PLUMBER to "প্লাম্বাৰ",
        JobCategoryId.ELECTRICIAN to "ইলেক্ট্ৰিচিয়ান",
        JobCategoryId.PAINTER to "পেইণ্টাৰ / ৰংমিস্ত্ৰী",
        JobCategoryId.TILE_WORKER to "টাইলছ মিস্ত্ৰী",
        JobCategoryId.CARPENTER to "কাঠমিস্ত্ৰী / কাৰ্পেণ্টাৰ",
        JobCategoryId.WELDER to "ৱেল্ডাৰ",
        JobCategoryId.HOTEL_STAFF to "হোটেল কৰ্মচাৰী",
        JobCategoryId.COOK to "ৰান্ধনী / কুক",
        JobCategoryId.WAITER to "ৱেইটাৰ",
        JobCategoryId.HOUSEKEEPING to "হাউচকিপিং",
        JobCategoryId.SECURITY_GUARD to "সুৰক্ষাৰক্ষী",
        JobCategoryId.DRIVER to "ড্ৰাইভাৰ",
        JobCategoryId.DELIVERY_WORKER to "ডেলিভাৰী কৰ্মী",
        JobCategoryId.FACTORY_WORKER to "কাৰখানা শ্ৰমিক",
        JobCategoryId.PACKING_WORKER to "পেকিং কৰ্মী",
        JobCategoryId.MACHINE_OPERATOR to "মেচিন অপাৰেটৰ",
        JobCategoryId.AGRICULTURE_WORKER to "কৃষি শ্ৰমিক",
        JobCategoryId.OFFICE_ASSISTANT to "অফিচ সহায়ক",
        JobCategoryId.SHOP_STAFF to "দোকানৰ কৰ্মচাৰী",
        JobCategoryId.DOMESTIC_WORKER to "ঘৰুৱা সহায়ক",
        JobCategoryId.OTHER_JOBS to "অন্যান্য কাম"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "শ্ৰমিক",
        UserRole.EMPLOYER to "নিয়োগকৰ্তা",
        UserRole.OWNER_SUPER_ADMIN to "মালিক / চুপাৰ এডমিন"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "আবেদন কৰা হ'ল",
        ApplicationStatus.UNDER_REVIEW to "পৰ্যালোচনাধীন",
        ApplicationStatus.SHORTLISTED to "তালিকাভুক্ত",
        ApplicationStatus.ACCEPTED to "গৃহীত",
        ApplicationStatus.REJECTED to "প্ৰত্যাখ্যাত",
        ApplicationStatus.WITHDRAWN to "প্ৰত্যাহাৰ",
        ApplicationStatus.COMPLETED to "সম্পূৰ্ণ"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "বাকী",
        TransactionStatus.SUCCESSFUL to "সফল",
        TransactionStatus.FAILED to "বিফল",
        TransactionStatus.REFUNDED to "ঘূৰাই দিয়া হ'ল"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "কইন ক্ৰয়",
        TransactionType.GIFT to "উপহাৰ ক্ৰেডিট",
        TransactionType.PROMO to "প্ৰমো ক্ৰেডিট",
        TransactionType.REFERRAL to "ৰেফাৰেল বোনাছ",
        TransactionType.BADGE_REWARD to "বেজ পুৰস্কাৰ",
        TransactionType.LOYALTY_SUPPORT to "আনুগত্য সহায়",
        TransactionType.JOB_FEE to "চাকৰি মাচুল",
        TransactionType.WITHDRAWAL to "উলিওৱা"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "বাকী থকা হাজিৰা",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "শাৰীৰিক আতিশয্য",
        SafetyComplaintCategory.HARASSMENT to "নিৰ্যাতন",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "খাদ্য / থকাৰ সমস্যা",
        SafetyComplaintCategory.FRAUD to "চাকৰি প্ৰবঞ্চনা",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "অসুৰক্ষিত কৰ্মস্থল",
        SafetyComplaintCategory.OTHER_EMERGENCY to "অন্যান্য জৰুৰী"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "নতুন",
        SafetyCaseStatus.IN_REVIEW to "তদন্তাধীন",
        SafetyCaseStatus.ADMIN_VERIFIED to "এডমিন প্ৰমাণিত",
        SafetyCaseStatus.ACTION_TAKEN to "ব্যৱস্থা গ্ৰহণ",
        SafetyCaseStatus.REFERRED to "প্ৰেৰিত",
        SafetyCaseStatus.CLOSED to "বন্ধ"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "প্ৰাথমিক",
        BadgeLevel.SILVER to "ছিলভাৰ",
        BadgeLevel.GOLD to "গোল্ড",
        BadgeLevel.DIAMOND to "ডাইমণ্ড",
        BadgeLevel.PLATINUM to "প্লেটিনাম"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "কাম পষ্ট কৰোঁতে",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "প্ৰমাণিত সংযোগত",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "আবেদন গ্ৰহণত"
    )
    override val indianStates = mapOf(
        "All States" to "সকলো ৰাজ্য",
        "Telangana" to "তেলেংগানা",
        "Andhra Pradesh" to "অন্ধ্ৰ প্ৰদেশ",
        "Tamil Nadu" to "তামিলনাডু",
        "Karnataka" to "কৰ্ণাটক",
        "Maharashtra" to "মহাৰাষ্ট্ৰ",
        "Gujarat" to "গুজৰাট",
        "Assam" to "অসম",
        "Bihar" to "বিহাৰ",
        "Uttar Pradesh" to "উত্তৰ প্ৰদেশ",
        "West Bengal" to "পশ্চিমবংগ",
        "Odisha" to "ওড়িশা",
        "Kerala" to "কেৰালা",
        "Punjab" to "পঞ্জাৱ"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "ক্লাউড ডাটাবেছ আৰু সুৰক্ষা নিয়ম",
        "otp_sms" to "OTP আৰু SMS সেৱা",
        "payment_gateway" to "UPI আৰু কইন পেমেণ্ট গেটৱে",
        "face_liveness" to "মুখ মিল আৰু জীৱন্ত পৰীক্ষা",
        "translation" to "লাইভ ১২-ভাষা কাম অনুবাদ",
        "telecom_ivr" to "কিপেড ফোন মিছড-কল আৰু IVR",
        "owner_pin_auth" to "মালিক বুটষ্ট্ৰেপ আৰু ৪-অংকৰ PIN চাৰ্ভাৰ"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "সংযুক্ত নহয়",
        IntegrationStatus.NEEDS_CREDENTIALS to "ক'ড প্ৰয়োজন",
        IntegrationStatus.CONNECTED to "সংযুক্ত"
    )

    override val msgOwnerPrivilegeBlocked = "অননুমোদিত: সাধাৰণ ব্যৱহাৰকাৰী কেতিয়াও মালিক / চুপাৰ এডমিন হ'ব নোৱাৰে।"
    override val msgSwitchedPreviewFormat = "পূৰ্বদৰ্শন একাউণ্ট %1\$s (%2\$s) লৈ সলনি কৰা হ'ল।"
    override val msgLanguageSavedFormat = "ভাষা %1\$s (%2\$s) নিৰ্ধাৰণ কৰা হ'ল"
    override val msgEnterNameBeforeOtp = "OTP বিচৰাৰ আগতে আপোনাৰ সম্পূৰ্ণ নাম লিখক।"
    override val msgEnterValidMobile = "অনুগ্ৰহ কৰি সঠিক ১০-অংকৰ মোবাইল নম্বৰ দিয়ক।"
    override val msgOtpDispatchedFormat = "চাৰ্ভাৰ OTP %1\$s লৈ পঠিওৱা হ'ল। ফোনত পোৱা ক'ড দিয়ক।"
    override val msgUnableSendOtp = "OTP পঠিয়াব পৰা নগ'ল। বেকএণ্ড URL বা নেটৱৰ্ক পৰীক্ষা কৰক।"
    override val msgSendOtpAndEnterCode = "প্ৰথমে OTP পঠিয়াওক আৰু ৪–৬ অংকৰ ক'ড দিয়ক।"
    override val msgOtpVerifiedCreateFormat = "মোবাইল OTP প্ৰমাণিত হ'ল! বিৱৰণ পূৰাই %1\$s প্ৰফাইল বনাওক টিপক।"
    override val msgIncorrectOtp = "ভুল বা ম্যাদ উকলি যোৱা OTP। নতুন OTP অনুৰোধ কৰক।"
    override val msgServerOtpUnavailable = "চাৰ্ভাৰ OTP সেৱা উপলব্ধ নহয়। লাইভ বেকএণ্ড সংযোগ কৰক।"
    override val msgEnterFullName = "সম্পূৰ্ণ নাম আৱশ্যক।"
    override val msgVerifyMobileOtpFirst = "অনুগ্ৰহ কৰি প্ৰথমে মোবাইল OTP পৰীক্ষা কৰক।"
    override val msgAccountCreatedFormat = "স্বাগতম %1\$s! %2\$s একাউণ্ট তৈয়াৰ হ'ল (%3\$s)।"
    override val msgLoggedInFormat = "%1\$s (%2\$s) হিচাপে লগ ইন হ'ল"
    override val msgSignedOut = "ব্যৱহাৰকাৰী একাউণ্টৰ পৰা ছাইন আউট হ'ল।"
    override val msgDuplicateOwnerBlocked = "সুৰক্ষা বাধা: মালিক একাউণ্ট আগতেই আছে। দ্বিতীয় মালিক তৈয়াৰ কৰিব নোৱাৰি।"
    override val msgBootstrapRequired = "চাৰ্ভাৰ বুটষ্ট্ৰেপ অনুমোদন ক'ড দিয়ক।"
    override val msgEnterPasswords = "মালিক লগ ইন পাছৱৰ্ড দিয়ক আৰু নিশ্চিত কৰক।"
    override val msgPasswordsDoNotMatch = "পাছৱৰ্ড দুটা মিলা নাই।"
    override val msgPasswordTooShort = "পাছৱৰ্ড কমেও ৮টা আখৰৰ হ'ব লাগিব।"
    override val msgPinFourDigits = "এডমিন PIN ঠিক ৪টা সংখ্যাৰ হ'ব লাগিব।"
    override val msgPinsDoNotMatch = "৪-অংকৰ PIN নিশ্চিতকৰণ মিলা নাই।"
    override val msgOwnerCreatedFormat = "%1\$s ৰ বাবে মালিক প্ৰফাইল তৈয়াৰ হ'ল। একক মালিক পঞ্জীয়ন চিৰদিনৰ বাবে বন্ধ হ'ল।"
    override val msgOwnerLockedSession = "মালিক ছেছন লক হ'ল।"
    override val msgOwnerTimedOut = "৫ মিনিট নিষ্ক্ৰিয়তাৰ বাবে মালিক ছেছন শেষ হ'ল। পুনৰ PIN দিয়ক।"
    override val msgOwnerUnlocked = "মালিক মাষ্টাৰ কণ্ট্ৰ'ল খোলা হ'ল।"
    override val msgInvalidPinAttemptsFormat = "ভুল ৪-অংকৰ মালিক PIN। %1\$d টা চেষ্টা বাকী আছে।"
    override val msgTooManyPinAttemptsFormat = "অতি বেছি ভুল চেষ্টা। %1\$d ছেকেণ্ডৰ বাবে লক হ'ল।"
    override val msgOwnerSessionRequired = "সক্ৰিয় মালিক ছেছন প্ৰয়োজন।"
    override val msgVerifyOtpBeforePinChange = "প্ৰথমে পঞ্জীয়িত মোবাইললৈ অহা OTP পৰীক্ষা কৰক।"
    override val msgPinUpdatedSuccess = "নতুন এডমিন PIN চাৰ্ভাৰত সুৰক্ষিতভাৱে আপডেট হ'ল।"
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) ৰ বাবে ডেমো প্ৰফাইল আপডেট হ'ল"
    override val msgJobPostedFormat = "%1\$s ত ডেমো কাম পষ্ট হ'ল! মাচুল: %2\$d কইন।"
    override val msgAlreadyAppliedFormat = "%1\$s লৈ আগতেই আবেদন কৰা হৈছে"
    override val msgApplicationSentFormat = "%1\$s লৈ আবেদন পঠিওৱা হ'ল"
    override val msgApplicationWithdrawnFormat = "আবেদন %1\$s প্ৰত্যাহাৰ কৰা হ'ল"
    override val msgApplicationUpdatedFormat = "আবেদন %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "সাপ্তাহিক পৰীক্ষা নথিভুক্ত: ১ · মই সুৰক্ষিত আছোঁ।"
    override val msgCheckInProblemRecorded = "সতৰ্কবাণী নথিভুক্ত (২ · সমস্যা)। সুৰক্ষা ডেস্কক জনোৱা হ'ল।"
    override val msgCheckInAdminRequested = "জৰুৰী এডমিন কলবেক অনুৰোধ (৩)। পৰিয়াল সতৰ্কতা শাৰীত আছে।"
    override val msgSafetyComplaintSubmittedFormat = "সুৰক্ষা গোচৰ %1\$s নথিভুক্ত কৰা হ'ল।"
    override val msgWithdrawalsFrozen = "জৰুৰী নিষেধাজ্ঞা সক্ৰিয়: সকলো টকা উলিওৱা তৎক্ষণাত লক হ'ল।"
    override val msgWithdrawalsUnfrozen = "পৰীক্ষাৰ পিছত টকা উলিওৱা আনলক হ'ল।"
    override val msgOwnerNoticePublished = "ৰঙা LOBORO এডমিন জাননী প্ৰচাৰ হ'ল।"
}
