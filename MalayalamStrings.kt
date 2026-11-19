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

object MalayalamStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "ഗ്ലോബൽ ജോബ് & സർവീസ്"
    override val demoPreviewBanner = "ഡെമോ പ്രിവ്യൂ ഡാറ്റ · ലൈവ് ഉപയോഗത്തിന് സെറ്റിംഗ്സിൽ ബാക്കെൻഡ് API ചേർക്കുക"
    override val verifiedNormalAccountBanner = "പരിശോധിച്ച ഉപയോക്തൃ അക്കൗണ്ട് · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO അഡ്മിൻ അറിയിപ്പ്"
    override val maintenanceModeBanner = "അറ്റകുറ്റപ്പണി മോഡ് സജീവമാണ് · നിയമനവും വാലറ്റും താൽക്കാലികമായി നിർത്തിയിരിക്കുന്നു. അടിയന്തര 112 സുരക്ഷാ സേവനം ലഭ്യമാണ്."
    override val navHome = "ഹോം"
    override val navSearchJobs = "ജോലി തിരയുക"
    override val navPostJob = "ജോലി പോസ്റ്റ്"
    override val navWallet = "വാലറ്റ്"
    override val navMyApplications = "എന്റെ അപേക്ഷകൾ"
    override val navMyJobs = "എന്റെ ജോലികൾ"
    override val navNotifications = "അറിയിപ്പുകൾ"
    override val navHelpSafety = "സഹായവും സുരക്ഷയും"
    override val navProfile = "പ്രൊഫൈൽ"
    override val navSettings = "സെറ്റിംഗ്സ്"
    override val navAdmin = "ഉടമ നിയന്ത്രണം"
    override val navBadgesLoyalty = "ബാഡ്ജും ലോയൽറ്റിയും"
    override val navIvrKeypad = "കീപാഡും IVR-ഉം"
    override val backLabel = "തിരികെ"
    override val homeLabel = "ഹോം"
    override val languageLabel = "ഭാഷ"
    override val languageSelectorTitle = "12 ഭാഷകൾ"
    override val activeBadgeLabel = "സജീവം"
    override val closeLabel = "അടയ്ക്കുക"
    override val okLabel = "ശരി"
    override val understoodLabel = "മനസ്സിലായി"
    override val cancelLabel = "റദ്ദാക്കുക"
    override val doneLabel = "പൂർത്തിയായി"
    override val confirmActionLabel = "ഉറപ്പാക്കുക"
    override val resetLabel = "റീസെറ്റ്"
    override val sendLabel = "അയയ്ക്കുക"

    override val shareAppTitle = "LOBORO ആപ്പ് ഷെയർ ചെയ്യുക"
    override val shareAppCta = "സുഹൃത്തുക്കൾക്ക് ഷെയർ ചെയ്ത് സമ്മാനം നേടുക"
    override val yourReferralLinkLabel = "നിങ്ങളുടെ റഫറൽ ലിങ്ക്"
    override val loboroLinkLabel = "LOBORO ലിങ്ക്"
    override val shareMenuButton = "ഷെയർ മെനു"
    override val copyLinkButton = "ലിങ്ക് പകർത്തുക"
    override val referralCopiedToast = "റഫറൽ സന്ദേശം പകർത്തി"
    override val openingShareMenuToast = "ഷെയർ മെനു തുറക്കുന്നു"
    override val shareMessageTemplate = "LOBORO ഗ്ലോബൽ ജോബ് & സർവീസിൽ ചേരൂ! ഇന്ത്യയിലുടനീളം ദിവസക്കൂലിയോ മാസശമ്പളമോ ഉള്ള ജോലികൾ നേടൂ. എന്റെ റഫറൽ ID %1\$s ഉപയോഗിക്കുക: %2\$s"

    override val registerWorkerEmployerCta = "തൊഴിലാളി / തൊഴിലുടമയായി രജിസ്റ്റർ ചെയ്യുക"
    override val logInLabel = "ലോഗിൻ"
    override val signOutLabel = "സൈൻ ഔട്ട്"
    override val voiceSearchHint = "ജോലിയോ നഗരമോ പറയുക അല്ലെങ്കിൽ ടൈപ്പ് ചെയ്യുക (ഉദാ. ഹൈദരാബാദിൽ മേസ്തിരി)"
    override val tapMicToSpeak = "സംസാരിച്ച് ജോലി തിരയാൻ മൈക്ക് അമർത്തുക"
    override val listeningStatus = "കേൾക്കുന്നു... നിങ്ങൾക്ക് ആവശ്യമുള്ള ജോലി പറയുക"
    override val stopListening = "കേൾക്കുന്നത് നിർത്തുക"
    override val searchAction = "തിരയുക"
    override val retryVoice = "വീണ്ടും പറയുക"
    override val voiceMicPermissionNeeded = "വോയ്സ് തിരയലിനായി നിങ്ങൾ മൈക്ക് ബട്ടൺ അമർത്തുമ്പോൾ മാത്രമാണ് മൈക്ക് അനുമതി ചോദിക്കുക."
    override val voiceUnavailableHonest = "ഈ ഉപകരണത്തിൽ വോയ്സ് തിരിച്ചറിയൽ സേവനം ഇല്ല. ക്ലൗഡ് വോയ്സ് സേവനം ചേർക്കുക അല്ലെങ്കിൽ താഴെയുള്ളവ അമർത്തുക."
    override val voiceNoMatchError = "സംസാരം വ്യക്തമായില്ല. വ്യക്തമായി പറയുക അല്ലെങ്കിൽ താഴെയുള്ള ഉദാഹരണം തിരഞ്ഞെടുക്കുക."
    override val voiceNetworkError = "നെറ്റ്‌വർക്ക് പിശക്. ഇന്റർനെറ്റ് പരിശോധിക്കുക അല്ലെങ്കിൽ ജോലി ടൈപ്പ് ചെയ്യുക."
    override val voiceStoppedError = "വോയ്സ് ഇൻപുട്ട് നിന്നു (കോഡ് %1\$d). ടൈപ്പ് ചെയ്യുക അല്ലെങ്കിൽ വീണ്ടും ശ്രമിക്കുക."
    override val voicePrivacyHint = "സ്വകാര്യത: മൈക്ക് സാധാരണയായി ഓഫ് ആണ്, നിങ്ങൾ അമർത്തുമ്പോൾ മാത്രമേ പ്രവർത്തിക്കൂ."
    override val clearSearchDesc = "തിരയൽ മായ്ക്കുക"
    override val spokenSamples = listOf(
        "ഹൈദരാബാദിൽ മേസ്തിരി" to "Mason",
        "പൂനെ ഇലക്ട്രീഷ്യൻ" to "Electrician",
        "ചെന്നൈ ഹോട്ടൽ പാചകക്കാരൻ" to "Cook",
        "വിജയവാഡ ഡ്രൈവർ" to "Driver",
        "സൂറത്ത് പാക്കിംഗ് ജോലി" to "Packing"
    )
    override val dailyJobsTitle = "ദിവസവേതന ജോലികൾ (Daily)"
    override val dailyJobsSubtitle = "ദിവസക്കൂലി · മാസശമ്പള ജോലികളിൽ നിന്ന് വേറിട്ട പട്ടിക"
    override val monthlyJobsTitle = "മാസശമ്പള ജോലികൾ"
    override val monthlyJobsSubtitle = "സ്ഥിര മാസശമ്പളം · അവധിയും താമസ സൗകര്യ വിവരവും"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "തൊഴിൽ വിഭാഗങ്ങൾ (24)"
    override val walletStripSummaryFormat = "%1\$d കോയിനുകൾ (₹%2\$d) · 100%% പിൻവലിക്കാം"

    override val outOfStateTitle = "അന്യസംസ്ഥാന & ആഗോള ജോലി തിരയൽ"
    override val willingToRelocate = "മറ്റൊരു സംസ്ഥാനത്തേക്ക് മാറാൻ തയ്യാറാണ്"
    override val filterCountry = "രാജ്യം"
    override val filterState = "സംസ്ഥാനം"
    override val filterDistrict = "ജില്ല"
    override val filterCity = "നഗരം"
    override val filterDistance = "ദൂരം"
    override val upToKmFormat = "%1\$d കി.മീ വരെ"
    override val filterFoodIncluded = "ഭക്ഷണം ലഭ്യം"
    override val filterAccommodation = "മുറി / താമസം"
    override val allCategoriesLabel = "എല്ലാ വിഭാഗങ്ങളും"
    override val noMatchingJobsTitle = "ഫിൽട്ടറിന് അനുയോജ്യമായ ജോലികൾ ഇല്ല"
    override val noMatchingJobsSubtitle = "ഫിൽട്ടറുകൾ റീസെറ്റ് ചെയ്യുക അല്ലെങ്കിൽ 'അന്യസംസ്ഥാന ജോലി' ഓൺ ആക്കുക."
    override val showAllJobsButton = "എല്ലാ ജോലികളും കാണിക്കുക"
    override val dailyWageJobBadge = "ദിവസക്കൂലി ജോലി"
    override val monthlySalaryJobBadge = "മാസശമ്പള ജോലി"
    override val demoDataTag = "ഡെമോ"
    override val originalLangFormat = "യഥാർത്ഥ ഭാഷ: %1\$s"
    override val preTranslatedPreviewNote = "പ്രീ-ട്രാൻസ്ലേറ്റഡ് പ്രിവ്യൂ സജീവമാണ്. ലൈവ് ജോലികൾക്കായി സെറ്റിംഗ്സിൽ ട്രാൻസ്ലേഷൻ API കീ ചേർക്കുക."
    override val configureTranslationApiNote = "12 ഭാഷകളിലും തത്സമയ വിവർത്തനത്തിന് സെറ്റിംഗ്സിൽ ട്രാൻസ്ലേഷൻ API കീ ചേർക്കുക."
    override val translatedToggle = "വിവർത്തനം"
    override val originalToggle = "യഥാർത്ഥം"
    override val compensationLabel = "വേതനം / ശമ്പളം"
    override val locationLabel = "സ്ഥലം"
    override val employerLabel = "തൊഴിലുടമ"
    override val vacanciesUnit = "ഒഴിവുകൾ"
    override val perDayFormat = "₹%1\$d / ദിവസം"
    override val perMonthFormat = "₹%1\$d / മാസം"
    override val coinsCountFormat = "%1\$d കോയിനുകൾ"
    override val foodBadge = "ഭക്ഷണം"
    override val stayBadge = "താമസം"
    override val shareJobButton = "ജോലി ഷെയർ"
    override val applyNow = "അപേക്ഷിക്കുക"
    override val saveJob = "സേവ്"
    override val negotiateChat = "ചാറ്റ് / സംസാരിക്കുക"
    override val reportJob = "പരാതിപ്പെടുക"
    override val foodAvailable = "ഭക്ഷണം ഉൾപ്പെടുന്നു"
    override val accommodationAvailable = "താമസം ഉൾപ്പെടുന്നു"
    override val notProvided = "ഉൾപ്പെടുത്തിയിട്ടില്ല"
    override val workersNeeded = "ആവശ്യമുള്ള തൊഴിലാളികൾ"
    override val workHoursLabel = "ജോലി സമയം"
    override val overtimeLabel = "ഓവർടൈം"
    override val paymentFreqLabel = "പേയ്‌മെന്റ്"
    override val weeklyHolidayLabel = "പ്രതിവാര അവധി"
    override val leavePolicyLabel = "അവധി നിയമം"
    override val joiningDateLabel = "ചേരുന്ന തീയതി"
    override val expiryLabel = "കാലാവധി"
    override val translatedBadgeLabel = "വിവർത്തനം ചെയ്തത്"

    override val postingPausedFormat = "ഉടമ നിയന്ത്രണം (%1\$s) വഴി ജോലി പോസ്റ്റിംഗ് താൽക്കാലികമായി നിർത്തിയിരിക്കുകയാണ്."
    override val selectCategoryLabel = "വിഭാഗം തിരഞ്ഞെടുക്കുക (24 വിഭാഗങ്ങൾ)"
    override val jobTitleLabel = "ജോലി തലക്കെട്ട്"
    override val jobTitlePlaceholder = "ഉദാ. ഹോസ്റ്റൽ കെട്ടിടത്തിന് 4 മേസ്തിരിമാരെ ആവശ്യമുണ്ട്"
    override val jobDescLabel = "ജോലി വിവരണം"
    override val jobDescPlaceholder = "ജോലി വിവരങ്ങൾ, സുരക്ഷാ ഉപകരണങ്ങൾ, ഭക്ഷണ താമസ സൗകര്യങ്ങൾ"
    override val dailyWageInrLabel = "ദിവസക്കൂലി (₹)"
    override val monthlySalaryInrLabel = "മാസശമ്പളം (₹)"
    override val vacanciesLabel = "ഒഴിവുകൾ"
    override val cityTownLabel = "നഗരം / പട്ടണം"
    override val stateLabel = "സംസ്ഥാനം"
    override val transparentJobFeeTitle = "സുതാര്യമായ ജോബ് ഫീസ്: %1\$d കോയിൻ (₹%2\$d)"
    override val configuredByOwnerSub = "ഉടമ നിശ്ചയിച്ചത് · ഫീസ് സമയം: %1\$s · ലഭ്യം: %2\$d കോയിനുകൾ"
    override val confirmAndPostJobButton = "ഉറപ്പാക്കി ജോലി പോസ്റ്റ് ചെയ്യുക (%1\$d കോയിനുകൾ)"

    override val walletBalanceTitle = "LOBORO കോയിൻ ബാലൻസ്"
    override val withdrawableValueFormat = "₹%1\$d പിൻവലിക്കാവുന്ന മൂല്യം (1 കോയിൻ = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% തുല്യ പിൻവലിക്കൽ നിയമം"
    override val withdrawableRuleBody = "വാങ്ങിയതും സമ്മാനം, ഓഫർ, റഫറൽ, ബാഡ്ജ് അല്ലെങ്കിൽ ലോയൽറ്റി വഴി ലഭിച്ചതുമായ എല്ലാ കോയിനുകൾക്കും തുല്യ പണമൂല്യവും 100% പിൻവലിക്കൽ യോഗ്യതയും ഉണ്ട്."
    override val buyCoins = "കോയിൻ വാങ്ങുക"
    override val withdrawCoins = "പണം പിൻവലിക്കുക"
    override val walletActionsPausedNote = "ചില വാലറ്റ് സേവനങ്ങൾ ഉടമ നിർത്തിയിരിക്കുകയാണ്. നിങ്ങളുടെ ബാലൻസും അംഗീകരിച്ച റീഫണ്ടുകളും സുരക്ഷിതമാണ്."
    override val coinPackagesTitle = "കോയിൻ പാക്കേജുകൾ (സുതാര്യമായ വില)"
    override val bankSecurityTitle = "ബാങ്ക് / UPI & മുഖ പരിശോധന സുരക്ഷ"
    override val payoutDestinationLabel = "പരിശോധിച്ച അക്കൗണ്ട്: %1\$s"
    override val bankSecurityStepsNote = "ബാങ്ക്/UPI മാറ്റാൻ നിർബന്ധിത പരിശോധന: രജിസ്റ്റർ ചെയ്ത മൊബൈൽ OTP + തത്സമയ സെൽഫി പൊരുത്തം + താൽക്കാലിക തുക തടയൽ."
    override val changeBankUpiButton = "ബാങ്ക് / UPI മാറ്റുക (OTP + ഫേസ് മാച്ച്)"
    override val unfreezePayoutsButton = "പിൻവലിക്കൽ അൺലോക്ക്"
    override val lostPhoneFreezeButton = "ഫോൺ നഷ്ടപ്പെട്ടോ? പിൻവലിക്കൽ നിർത്തുക"
    override val payoutFreezeActiveNote = "പിൻവലിക്കൽ നിരോധനം സജീവമാണ്. തിരിച്ചറിയൽ വീണ്ടും പരിശോധിക്കുന്നതുവരെ പണം പിൻവലിക്കാനാകില്ല."
    override val transactionHistory = "കോയിൻ ഇടപാട് രേഖ"
    override val demoLedgerSuffix = "(ഡെമോ രേഖ)"
    override val buyCoinsDialogTitleFormat = "%1\$d കോയിനുകൾ വാങ്ങുക (₹%2\$d)"
    override val paymentNotConnectedBody = "തത്സമയ Razorpay / Cashfree UPI പേയ്‌മെന്റ് ഇതുവരെ ബന്ധിപ്പിച്ചിട്ടില്ല. യഥാർത്ഥ പണം സ്വീകരിക്കുന്നതിന് മുമ്പ് പ്രൊഡക്ഷൻ കീകൾ ചേർക്കുക."
    override val withdrawDialogTitleFormat = "₹%1\$d പിൻവലിക്കുക"
    override val withdrawDialogBodyFormat = "മുഴുവൻ ബാലൻസും (%1\$d കോയിനുകൾ) തുല്യ മൂല്യത്തോടെ 100%% പിൻവലിക്കാം.\nഅക്കൗണ്ട്: %2\$s\n\nഈ പതിപ്പിൽ ലൈവ് IMPS / UPI ഗേറ്റ്‌വേ ബന്ധിപ്പിച്ചിട്ടില്ല."
    override val bankChangeDialogTitle = "3-ഘട്ട ബാങ്ക് / UPI മാറ്റ സുരക്ഷ"
    override val bankChangeDialogBody = "ഫോൺ നഷ്ടപ്പെട്ടാൽ സംരക്ഷിക്കാൻ ബാങ്ക്/UPI മാറ്റത്തിന് ഇവ ആവശ്യമാണ്:\n1. രജിസ്റ്റർ ചെയ്ത മൊബൈൽ OTP പരിശോധന\n2. രജിസ്ട്രേഷൻ ഫോട്ടോയുമായി ലൈവ് മുഖം പൊരുത്തം\n3. പണം നൽകുന്നതിന് മുമ്പുള്ള സുരക്ഷാ കാത്തിരിപ്പ്"
    override val receiptDialogTitle = "ഇടപാട് രസീത്"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "റഫറൻസ്: %1\$s"
    override val receiptTypeLabel = "തരം: %1\$s"
    override val receiptCoinsLabel = "കോയിനുകൾ: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "നില: %1\$s"
    override val receiptTimeLabel = "സമയം: %1\$s"
    override val receiptWithdrawableYes = "പിൻവലിക്കൽ യോഗ്യത: 100% അതെ"

    override val employerAppsHeading = "അപേക്ഷകളും നേരിട്ടുള്ള ചാറ്റും"
    override val secureChatHeading = "സുരക്ഷിത തൊഴിലാളി ↔ തൊഴിലുടമ ചാറ്റ്"
    override val secureChatSubtitle = "നിങ്ങൾ സ്വയം പങ്കിടുന്നതുവരെ ഫോൺ നമ്പറുകൾ മറഞ്ഞിരിക്കും. തുറക്കാനോ ബ്ലോക്ക് ചെയ്യാനോ ടാപ്പ് ചെയ്യുക."
    override val chatButton = "ചാറ്റ്"
    override val workerEmployerLineFormat = "തൊഴിലാളി: %1\$s (%2\$s) · തൊഴിലുടമ: %3\$s"
    override val shortlistButton = "ഷോർട്ട്‌ലിസ്റ്റ്"
    override val acceptButton = "അംഗീകരിക്കുക"
    override val withdrawButton = "പിൻവലിക്കുക"
    override val phoneHiddenPrivacy = "സ്വകാര്യത സജീവം: ഇരുവരും സമ്മതിക്കാതെ സ്വകാര്യ ഫോൺ നമ്പർ കാണില്ല."
    override val blockUserLabel = "ബ്ലോക്ക്"
    override val userBlockedNotice = "നിങ്ങൾ ഈ ചാറ്റ് ബ്ലോക്ക് ചെയ്തു. ആവശ്യമെങ്കിൽ സുരക്ഷാ വിഭാഗത്തിൽ റിപ്പോർട്ട് ചെയ്യുക."
    override val chatPlaceholder = "നിങ്ങളുടെ ഭാഷയിൽ സന്ദേശം ടൈപ്പ് ചെയ്യുക..."

    override val automaticBadgePrefix = "ഓട്ടോമാറ്റിക് ബാഡ്ജ്: %1\$s"
    override val badgeStatsFormat = "റേറ്റിംഗ് %1\$.1f ★ · %2\$d പരിശോധിച്ച പ്രവൃത്തിദിനങ്ങൾ · %3\$d പൂർത്തിയാക്കിയ ജോലികൾ"
    override val progressToFormat = "%1\$s ബാഡ്ജിലേക്കുള്ള പുരോഗതി: %2\$d / %3\$d ദിവസം"
    override val badgeAntiAbuseNote = "യഥാർത്ഥത്തിൽ പൂർത്തിയാക്കിയ ജോലികൾ, പരിശോധിച്ച ഹാജർ, നിഷ്പക്ഷ റേറ്റിംഗ് എന്നിവയിലൂടെ മാത്രമാണ് ബാഡ്ജുകൾ ലഭിക്കുന്നത്."
    override val badgeTiersTitle = "5 ഓട്ടോമാറ്റിക് ബാഡ്ജ് തലങ്ങൾ"
    override val minWorkdaysFormat = "കുറഞ്ഞത് %1\$d പ്രവൃത്തിദിനം · കുറഞ്ഞത് %2\$.1f★ റേറ്റിംഗ്"
    override val badgeAppealsNote = "നീതി സംരക്ഷണം: പെട്ടെന്നുള്ള സംശയാസ്പദമായ 1-സ്റ്റാർ റേറ്റിംഗുകൾ അപ്പീലിലൂടെ അവലോകനം ചെയ്യും."
    override val loyaltyTitle = "സീനിയോറിറ്റി & ലോയൽറ്റി സാമ്പത്തിക സഹായം"
    override val loyaltySubtitle = "സുതാര്യമായ ത്രൈമാസിക ക്ഷേമ & നാഴികക്കല്ല് ബോണസ്"
    override val loyaltyDisclaimer = "നിർബന്ധിത അറിയിപ്പ്: ഇത് ഇൻഷുറൻസോ ഉറപ്പായ പ്രതിമാസ പെൻഷനോ അല്ല. യോഗ്യത, പ്രവൃത്തിദിനങ്ങൾ, ബജറ്റ്, അംഗീകാരം എന്നിവയ്ക്ക് വിധേയമാണ്."
    override val loyaltyMinMembershipFormat = "കുറഞ്ഞ അംഗത്വം: %1\$d മാസം"
    override val loyaltyWorkdaysFormat = "പരിശോധിച്ച പ്രവൃത്തിദിനങ്ങൾ: %1\$d+ ദിവസം"
    override val loyaltyRequiredBadgeFormat = "ആവശ്യമായ ബാഡ്ജ്: %1\$s+"
    override val loyaltyRequiredRatingFormat = "കുറഞ്ഞ റേറ്റിംഗ്: %1\$.1f★"
    override val loyaltyBudgetFormat = "അംഗീകരിച്ച സഹായം: ₹%1\$d · ബജറ്റ്: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "തൊഴിലാളി സുരക്ഷയും അടിയന്തര സഹായവും"
    override val callEmergency112 = "അടിയന്തര 112 വിളിക്കുക"
    override val weeklyCheckInTitle = "പ്രതിവാര സുരക്ഷാ പരിശോധന"
    override val weeklyCheckInQuestion = "നിങ്ങൾ സുരക്ഷിതനാണോ?"
    override val checkInOpt1 = "1 · ഞാൻ സുരക്ഷിതനാണ്"
    override val checkInOpt2 = "2 · എനിക്ക് പ്രശ്നമുണ്ട്"
    override val checkInOpt3 = "3 · LOBORO അഡ്മിനുമായി സംസാരിക്കുക"
    override val reportSafetyIssue = "സുരക്ഷാ / വേതന പരാതി നൽകുക"
    override val safetyOperationalNote = "ജോലി പോസ്റ്റിംഗോ പേയ്‌മെന്റോ നിർത്തിയാലും സുരക്ഷാ സേവനം എപ്പോഴും പ്രവർത്തിക്കും."
    override val safetyDisclaimerNote = "അടിയന്തര അപകടത്തിൽ നേരിട്ട് 112 വിളിക്കുക. നിഷ്പക്ഷ മധ്യസ്ഥതയ്ക്കായി LOBORO പരാതികൾ രേഖപ്പെടുത്തുന്നു."
    override val everyDaysFormat = "ഓരോ %1\$d ദിവസത്തിലും"
    override val lastStatusFormat = "അവസാന പരിശോധന: %1\$s"
    override val checkInNoResponseNote = "തുടർച്ചയായി 2 പരിശോധനകൾ നഷ്ടപ്പെട്ടാൽ അല്ലെങ്കിൽ പ്രശ്നം തിരഞ്ഞെടുത്താൽ LOBORO SMS, അഡ്മിൻ അവലോകനം, സമ്മതത്തോടെ കുടുംബ അറിയിപ്പ് എന്നിവ അയയ്ക്കും."
    override val consentEmergencyTitle = "സമ്മതത്തോടെ അടിയന്തര ലൊക്കേഷനും കുടുംബ ബന്ധവും"
    override val workerIdLabel = "തൊഴിലാളി ID: %1\$s"
    override val homeOriginLabel = "സ്വദേശം: %1\$s, %2\$s"
    override val currentJobCityLabel = "നിലവിലെ ജോലി നഗരം: %1\$s"
    override val emergencyContactLabel = "അടിയന്തര ബന്ധം: %1\$s (%2\$s)"
    override val consentGranted = "സമ്മതം നൽകി"
    override val consentPending = "സമ്മതം ബാക്കി"
    override val employerLoboroIdInput = "തൊഴിലുടമ LOBORO ID (ഉദാ. LB819)"
    override val currentSiteInput = "നിലവിലെ ജോലി നഗരം / സ്ഥലം"
    override val describeIssueInput = "സുരക്ഷാ അല്ലെങ്കിൽ കൂലി പ്രശ്നം വിവരിക്കുക"
    override val submitSafetyDeskButton = "സുരക്ഷാ വിഭാഗത്തിലേക്ക് അയയ്ക്കുക"
    override val safetyCasesHeading = "സമീപകാല സുരക്ഷാ കേസുകൾ (ഓഡിറ്റ് ചെയ്യാവുന്നത്)"
    override val ivrTitle = "കീപാഡ് ഫോൺ മിസ്ഡ്-കോൾ & IVR മെനു"
    override val ivrSubtitle = "സ്മാർട്ട്‌ഫോൺ ഇല്ലാതെ ടോൾ-ഫ്രീ / മിസ്ഡ്-കോൾ കോൾബാക്ക് വഴി പ്രവർത്തിക്കുന്നു"
    override val ivrArchNote = "ലൈവ് സിസ്റ്റം Exotel / Knowlarity / Twilio Voice-മായി ബന്ധിപ്പിക്കുന്നു. 12-ഭാഷാ വോയ്സ് മെനു പരിശോധിക്കാൻ ബട്ടൺ അമർത്തുക."
    override val ivrMenuTitle = "LOBORO വോയ്സ് IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO-യിലേക്ക് സ്വാഗതം! വോയ്സ് മെനു കേൾക്കാൻ കീപാഡ് നമ്പർ അമർത്തുക."
    override val pressKeyFormat = "%1\$s അമർത്തുക → %2\$s"
    override val ivrSelectedSummaryFormat = "തിരഞ്ഞെടുത്തത് [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "ഇന്നത്തെ ദിവസക്കൂലി ജോലികൾ",
        "2" to "മാസശമ്പള ജോലികൾ",
        "3" to "പ്രതിവാര സുരക്ഷാ പരിശോധന ('സുരക്ഷിതനാണോ?')",
        "4" to "വാലറ്റ് കോയിനും പുതിയ നിലയും കേൾക്കുക",
        "5" to "അടിയന്തര അഡ്മിൻ കോൾബാക്ക്",
        "6" to "അപേക്ഷാ നില പരിശോധിക്കുക",
        "0" to "ശബ്ദ ഭാഷ മാറ്റുക"
    )

    override val userRegTitle = "തൊഴിലാളി & തൊഴിലുടമ രജിസ്ട്രേഷൻ"
    override val userLoginTitle = "തൊഴിലാളി & തൊഴിലുടമ ലോഗിൻ"
    override val userAuthSubtitle = "OTP-പരിശോധിച്ച സാധാരണ ഉപയോക്തൃ അക്കൗണ്ട് · രഹസ്യ ഉടമ സിസ്റ്റത്തിൽ നിന്ന് വേറിട്ടത്"
    override val registerTab = "രജിസ്റ്റർ"
    override val loginTab = "ലോഗിൻ"
    override val dbOtpNotConnectedTitle = "ബാക്കെൻഡ് ഡാറ്റാബേസ് / OTP ബന്ധിപ്പിച്ചിട്ടില്ല"
    override val dbOtpNotConnectedBody = "യഥാർത്ഥ തൊഴിലാളി & തൊഴിലുടമ അക്കൗണ്ടുകൾ സേവ് ചെയ്യാൻ LOBORO_BACKEND_URL ചേർക്കുക."
    override val selectAccountTypeStep = "1. അക്കൗണ്ട് തരം തിരഞ്ഞെടുക്കുക"
    override val workerAccountLabel = "തൊഴിലാളി"
    override val employerAccountLabel = "തൊഴിലുടമ"
    override val regPausedForRoleFormat = "%1\$s രജിസ്ട്രേഷൻ നിലവിൽ ഉടമ നിർത്തിവെച്ചിരിക്കുകയാണ്."
    override val preferredLanguageLabel = "ഇഷ്ടപ്പെട്ട ആപ്പ് ഭാഷ (12 ഭാഷകൾ)"
    override val fullNameStepLabel = "2. മുഴുവൻ പേര് *"
    override val businessNameStepLabel = "2. ബിസിനസ്സ് / കരാറുകാരന്റെ മുഴുവൻ പേര് *"
    override val mobileStepLabel = "3. മൊബൈൽ നമ്പർ (10 അക്കം) *"
    override val sendRegOtpButton = "OTP അയയ്ക്കുക"
    override val resendMobileOtpButton = "വീണ്ടും OTP അയയ്ക്കുക"
    override val enterOtpStepLabel = "4. മൊബൈൽ OTP നൽകുക *"
    override val verifyOtpButton = "OTP പരിശോധിക്കുക"
    override val verifiedLabel = "പരിശോധിച്ചു"
    override val mobileVerifiedNote = "സെർവറിൽ മൊബൈൽ പരിശോധിച്ചു"
    override val homeStateLabel = "സ്വന്തം സംസ്ഥാനം"
    override val homeDistrictLabel = "സ്വന്തം ജില്ല"
    override val stateShortLabel = "സംസ്ഥാനം"
    override val cityShortLabel = "നഗരം"
    override val workCityStateLabel = "നിലവിലെ ജോലി നഗരവും സംസ്ഥാനവും"
    override val businessLocationLabel = "ബിസിനസ്സ് നഗരവും സംസ്ഥാനവും"
    override val skillsCategoriesLabel = "കഴിവുകൾ / തൊഴിൽ (ഉദാ. മേസ്തിരി, ഇലക്ട്രീഷ്യൻ)"
    override val hiringCategoriesLabel = "നിയമന വിഭാഗങ്ങൾ"
    override val emergencyContactNameLabel = "അടിയന്തര കുടുംബ ബന്ധത്തിന്റെ പേര്"
    override val emergencyContactPhoneLabel = "അടിയന്തര ഫോൺ നമ്പർ"
    override val uniqueLbIdNotice = "രജിസ്ട്രേഷൻ പൂർത്തിയാകുമ്പോൾ സെർവർ സ്ഥിരമായ LB ID (LB2000+) നൽകും. VIP, ഉടമ നമ്പറുകൾ സുരക്ഷിതമാണ്."
    override val creatingProfileLabel = "പ്രൊഫൈൽ നിർമ്മിക്കുന്നു..."
    override val createProfileButton = "തൊഴിലാളി / തൊഴിലുടമ പ്രൊഫൈൽ സൃഷ്ടിക്കുക"
    override val loginHeading = "രജിസ്റ്റർ ചെയ്ത മൊബൈൽ OTP വഴി ലോഗിൻ ചെയ്യുക"
    override val loginSubtitle = "തൊഴിലാളിയോ തൊഴിലുടമയോ ആയി രജിസ്റ്റർ ചെയ്ത മൊബൈൽ നമ്പർ നൽകുക."
    override val registeredMobileLabel = "രജിസ്റ്റർ ചെയ്ത മൊബൈൽ നമ്പർ"
    override val sendLoginOtpButton = "ലോഗിൻ OTP അയയ്ക്കുക"
    override val resendLoginOtpButton = "OTP വീണ്ടും അയയ്ക്കുക"
    override val enterLoginOtpLabel = "ലോഗിൻ OTP നൽകുക"
    override val verifyingOtpLabel = "പരിശോധിക്കുന്നു..."
    override val verifyOtpOpenHomeButton = "OTP പരിശോധിച്ച് ഹോം തുറക്കുക"
    override val backToHomepageButton = "ഹോംപേജിലേക്ക് മടങ്ങുക"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "പദവി"
    override val offlinePreviewHeading = "ഓഫ്‌ലൈൻ പ്രൊഫൈലും ഫോട്ടോ പ്രിവ്യൂവും"
    override val offlinePreviewCardTitle = "പ്രൊഫൈൽ സൃഷ്ടിക്കുക / മാറ്റുക (ഓഫ്‌ലൈൻ പ്രിവ്യൂ)"
    override val offlinePreviewCardSubtitle = "ലൈവ് ഡാറ്റാബേസ് ബന്ധിപ്പിക്കുന്നതുവരെ ലോക്കൽ പ്രിവ്യൂ ആയി സംരക്ഷിക്കുന്നു."
    override val workLocationLabel = "ജോലി സ്ഥലം (നഗരം, സംസ്ഥാനം)"
    override val businessAddressLabel = "ബിസിനസ്സ് നഗരം, സംസ്ഥാനം"
    override val skillsExpLabel = "കഴിവുകൾ / ജോലി തരം"
    override val businessCatLabel = "ബിസിനസ്സ് തരം / നിയമന വിഭാഗങ്ങൾ"
    override val aadhaarPrivacyNote = "ഡാറ്റ സുരക്ഷ: LOBORO ഉപകരണത്തിൽ ആധാർ ചിത്രങ്ങൾ സൂക്ഷിക്കില്ല — പരിശോധിച്ച ഹാഷും സമ്മതവും മാത്രം സൂക്ഷിക്കും."
    override val selectProfilePhotoBtn = "പ്രൊഫൈൽ ഫോട്ടോ തിരഞ്ഞെടുക്കുക (ഫോട്ടോ പിക്കർ)"
    override val photoSelectedBtn = "ഫോട്ടോ തിരഞ്ഞെടുത്തു ✓"
    override val offlineConsentCheck = "സുരക്ഷാ പരിശോധനയ്ക്കും ബന്ധപ്പെടാൻ കഴിയാതെ വന്നാൽ കുടുംബത്തെ അറിയിക്കാനും ഞാൻ സമ്മതിക്കുന്നു."
    override val previewProfileBtn = "പ്രിവ്യൂ പ്രൊഫൈൽ സംരക്ഷിക്കുക"
    override val audienceScopeFormat = "ലക്ഷ്യം: %1\$s · മേഖല: %2\$s · %3\$s"
    override val settingsHeading = "സെറ്റിംഗ്സും പ്ലാറ്റ്‌ഫോം വിവരങ്ങളും"
    override val languageSectionTitle = "ആപ്പ് ഭാഷ (എല്ലാ 12 ഇന്ത്യൻ ഭാഷകളും)"
    override val languageSectionSubtitle = "നിങ്ങളുടെ സജീവ അക്കൗണ്ടിനായി പ്രത്യേകം സംരക്ഷിക്കുന്നു. മറ്റു അക്കൗണ്ടുകളുടെ ഭാഷ മാറില്ല."
    override val languagePausedByOwner = "ഉടമ നിയന്ത്രണം വഴി ഭാഷ മാറ്റം താൽക്കാലികമായി നിർത്തിയിരിക്കുന്നു."
    override val lowDataTitle = "ലോ-ഡാറ്റ മോഡ്"
    override val lowDataSubtitle = "2G/3G ഗ്രാമീണ നെറ്റ്‌വർക്കുകളിൽ മൊബൈൽ ഡാറ്റ ലാഭിക്കുന്നു"
    override val reducedMotionTitle = "കുറഞ്ഞ ആനിമേഷനും വ്യക്തമായ കാഴ്ചയും"
    override val reducedMotionSubtitle = "വ്യക്തമായ അക്ഷരങ്ങളും ലളിതമായ സ്ക്രീൻ ചലനവും"
    override val privacyPolicyTitle = "സ്വകാര്യതാ നയവും ഡാറ്റ സംരക്ഷണവും"
    override val privacyPolicyBody = "• നിങ്ങളുടെ അനുവാദമില്ലാതെ ചാറ്റിൽ ഫോൺ നമ്പർ കാണിക്കില്ല.\n• വോയ്സ് തിരയൽ അമർത്തുമ്പോൾ മാത്രമാണ് മൈക്രോഫോൺ പ്രവർത്തിക്കുക.\n• ഫോട്ടോ തിരഞ്ഞെടുക്കാൻ സുരക്ഷിത ആൻഡ്രോയിഡ് ഫോട്ടോ പിക്കർ ഉപയോഗിക്കുന്നു.\n• നിങ്ങളുടെ സമ്മതത്തോടെ മാത്രം കുടുംബത്തിന് അടിയന്തര ലൊക്കേഷൻ അയയ്ക്കും."
    override val termsOfServiceTitle = "സേവന നിബന്ധനകളും നീതി നിയമങ്ങളും"
    override val termsOfServiceBody = "• ദിവസക്കൂലി ജോലികളും മാസശമ്പള ജോലികളും വേറിട്ട് നിർത്തിയിരിക്കുന്നു.\n• എല്ലാ LOBORO കോയിനുകൾക്കും 100% തുല്യ മൂല്യവും പിൻവലിക്കൽ യോഗ്യതയുമുണ്ട്.\n• യഥാർത്ഥ പ്രവൃത്തിദിനങ്ങളും നീതിയുക്ത റേറ്റിംഗും വഴി മാത്രമാണ് ബാഡ്ജ് ലഭിക്കുക.\n• VIP ID-കൾ (LB1–LB1999) ഉടമയ്ക്ക് മാത്രം നീക്കിവെച്ചിരിക്കുന്നു."
    override val helpSupportTitle = "സഹായം, പിന്തുണ & സുരക്ഷാ വിഭാഗം"
    override val helpSupportBody = "• അടിയന്തര അപകടത്തിൽ 112 വിളിക്കുക (ലോഗിൻ ഇല്ലാതെയും 24x7).\n• വേതന അല്ലെങ്കിൽ താമസ പരാതികൾക്കായി സഹായവും സുരക്ഷയും വിഭാഗത്തിൽ കേസ് നൽകുക.\n• കീപാഡ് ഫോണുകളിൽ ടോൾ-ഫ്രീ കോൾബാക്കിനായി കീപാഡും IVR-ഉം തുറക്കുക."
    override val backendChecklistTitle = "ബാക്കെൻഡ് & API സംയോജന നില"
    override val providersLabel = "ദാതാക്കൾ: %1\$s"
    override val secretsLabel = "രഹസ്യ കീകൾ: %1\$s"

    override val ownerSetupTitle = "ഒറ്റത്തവണ ഉടമ / സൂപ്പർ അഡ്മിൻ സജ്ജീകരണം"
    override val ownerSetupSubtitle = "LOBORO നിർമ്മാതാവിന് മാത്രം. ഒരിക്കൽ രജിസ്റ്റർ ചെയ്താൽ സ്ഥിരമായി ലോക്ക് ആകും."
    override val ownerSetupLockNote = "സുരക്ഷാ ലോക്ക്: ഒരൊറ്റ ഉടമ അക്കൗണ്ട് മാത്രമേ ഉണ്ടാകാൻ കഴിയൂ. തൊഴിലാളികൾക്കോ തൊഴിലുടമകൾക്കോ ഇത് ഉപയോഗിക്കാനാവില്ല."
    override val ownerBackendReqTitle = "ഉടമ സെർവർ ബന്ധിപ്പിച്ചിട്ടില്ല"
    override val ownerBackendReqBody = "പാസ്‌വേഡും 4-അക്ക PIN-ഉം സെർവറിൽ സുരക്ഷിതമാക്കാൻ LOBORO_BACKEND_URL സജ്ജമാക്കുക."
    override val serverSetupAuthHeading = "1. സെർവർ സജ്ജീകരണ അനുമതി"
    override val bootstrapSecretLabel = "വൺ-ടൈം സെർവർ ബൂട്ട്‌സ്‌ട്രാപ്പ് കോഡ് *"
    override val bootstrapSecretPlaceholder = "നിങ്ങളുടെ സെർവർ OWNER_BOOTSTRAP_SECRET-ൽ നിന്ന്"
    override val ownerIdentityHeading = "2. ഉടമ തിരിച്ചറിയലും മൊബൈൽ OTP-യും"
    override val ownerNameField = "ഉടമയുടെ മുഴുവൻ പേര് *"
    override val ownerMobileField = "ഉടമയുടെ സ്വകാര്യ മൊബൈൽ നമ്പർ *"
    override val ownerSendOtpBtn = "ഉടമ OTP അയയ്ക്കുക"
    override val ownerMobileVerifiedNote = "ഉടമ മൊബൈൽ OTP പരിശോധിച്ചു"
    override val credentialsHeading = "3. പാസ്‌വേഡും 4-അക്ക അഡ്മിൻ PIN-ഉം"
    override val createPasswordLabel = "ലോഗിൻ പാസ്‌വേഡ് സൃഷ്ടിക്കുക (8+ അക്ഷരം) *"
    override val confirmPasswordLabel = "ലോഗിൻ പാസ്‌വേഡ് ഉറപ്പാക്കുക *"
    override val passwordsMismatchError = "പാസ്‌വേഡുകൾ പൊരുത്തപ്പെടുന്നില്ല"
    override val createPinLabel = "4-അക്ക അഡ್ಮിൻ PIN സൃഷ്ടിക്കുക *"
    override val confirmPinLabel = "4-അക്ക അഡ್ಮಿൻ PIN ഉറപ്പാക്കുക *"
    override val pinsMismatchError = "PIN-കൾ പൊരുത്തപ്പെടുന്നില്ല"
    override val credentialsHashNote = "സെർവർ Argon2id ഉപയോഗിച്ച് പാസ്‌വേഡും PIN-ഉം ഹാഷ് ചെയ്യുന്നു. ആപ്പിൽ സൂക്ഷിക്കില്ല."
    override val registeringOwnerLabel = "ഉടമ അക്കൗണ്ട് നിർമ്മിക്കുന്നു..."
    override val completeOwnerRegButton = "ഉടമ രജിസ്ട്രേഷൻ പൂർത്തിയാക്കി ഡാഷ്‌ബോർഡ് തുറക്കുക"
    override val returnToAppButton = "LOBORO ആപ്പിലേക്ക് മടങ്ങുക"
    override val adminPinHeader = "ഉടമ നിയന്ത്രണം · 4-അക്ക PIN ആവശ്യമാണ്"
    override val adminPinPrompt = "നിങ്ങളുടെ 4-അക്ക ഉടമ അഡ്മിൻ PIN നൽകുക. സെർവറിൽ പരിധിയോടെ പരിശോധിക്കുന്നു."
    override val pinLockoutFormat = "അധികം തെറ്റായ ശ്രമങ്ങൾ. %1\$d സെക്കൻഡിനു ശേഷം വീണ്ടും ശ്രമിക്കുക."
    override val clrKeyLabel = "മായ്ക്കുക"
    override val verifyPinServerBtn = "സെർവറിൽ 4-അക്ക PIN പരിശോധിക്കുക"
    override val pinSecurityPolicyFormat = "5 തെറ്റായ ശ്രമങ്ങൾക്ക് ലോക്ക് · 5 മിനിറ്റ് നിഷ്ക്രിയമായാൽ ലോഗൗട്ട് · ബാക്കി ശ്രമങ്ങൾ: %1\$d"
    override val ownerMasterControlTitle = "ഉടമ മാസ്റ്റർ കൺട്രോൾ"
    override val ownerMasterSubtitle = "ഉടമ സൂപ്പർ അഡ്മിൻ മാത്രം · സെർവർ PIN + OTP + ഓഡിറ്റ് ലോഗ്"
    override val ownerSessionLockedNote = "ഉടമ സെഷൻ ലോക്ക് ആണ്. മാസ്റ്റർ കൺട്രോൾ തുറക്കാൻ സെർവർ പരിശോധിച്ച 4-അക്ക PIN ആവശ്യമാണ്."
    override val verifyOwnerPinBtn = "ഉടമ 4-അക്ക PIN പരിശോധിക്കുക"
    override val ownerProfileLineFormat = "ഉടമ പ്രൊഫൈൽ · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "രജിസ്റ്റർ ചെയ്ത മൊബൈൽ: %1\$s · ഏക ഉടമ അക്കൗണ്ട് (%2\$s)"
    override val activeSessionFormat = "സജീവ ഉടമ സെഷൻ · %1\$dm %2\$02ds-ൽ ലോഗൗട്ട്"
    override val serverAuthorityNote = "സെഷൻ ടോക്കൺ പരിശോധിച്ചു (സെർവർ അധികാരം)"
    override val lockAndExitBtn = "ലോക്ക് ചെയ്ത് പുറത്തുകടക്കുക"
    override val mandatoryProtectionTitle = "നിർബന്ധിത സുരക്ഷയും സാമ്പത്തിക ബാധ്യത സംരക്ഷണവും"
    override val mandatoryProtectionBody = "ഫീച്ചറുകൾ ഓഫ് ആക്കിയാലും അറ്റകുറ്റപ്പണി മോഡ് ആക്കിയാലും നിലവിലുള്ള സാമ്പത്തിക ബാധ്യതകളും റീഫണ്ടുകളും 112 സുരക്ഷയും റദ്ദാകില്ല."
    override val changePinTitle = "അഡ്മിൻ PIN മാറ്റുക (OTP പരിശോധന നിർബന്ധം)"
    override val changePinSubtitle = "ഉടമയ്ക്ക് മാത്രം. നിലവിലെ PIN കാണിക്കില്ല. രജിസ്റ്റർ ചെയ്ത മൊബൈൽ OTP നിർബന്ധം."
    override val otpToRegisteredMobileNote = "രജിസ്റ്റർ ചെയ്ത ഉടമ മൊബൈലിലേക്ക് മാത്രമേ OTP അയയ്ക്കൂ: %1\$s"
    override val sendPinChangeOtpBtn = "രജിസ്റ്റർ ചെയ്ത ഉടമ മൊബൈലിലേക്ക് OTP അയയ്ക്കുക"
    override val otpDispatchedNote = "ഉടമയുടെ മൊബൈലിലേക്ക് (%1\$s) OTP അയച്ചു."
    override val enterServerOtpLabel = "സെർവർ OTP കോഡ് നൽകുക"
    override val verifyOtpServerBtn = "സെർവറിൽ OTP പരിശോധിക്കുക"
    override val otpVerifiedNewPinNote = "OTP പരിശോധിച്ചു. ഇനി പുതിയ 4-അക്ക ഉടമ PIN നൽകി ഉറപ്പാക്കുക."
    override val newPinLabel = "പുതിയ 4-അക്ക PIN"
    override val confirmNewPinLabel = "പുതിയ 4-അക്ക PIN ഉറപ്പാക്കുക"
    override val saveNewPinBtn = "ഉറപ്പാക്കി അഡ്മിൻ PIN അപ്‌ഡേറ്റ് ചെയ്യുക"
    override val confirmPinChangeTitle = "അഡ്മിൻ PIN മാറ്റം ഉറപ്പാക്കുക"
    override val confirmPinChangeDesc = "സെർവറിലെ 4-അക്ക ഉടമ PIN മാറ്റണോ? സെഷൻ തുടരും, ഓഡിറ്റ് ലോഗ് രേഖപ്പെടുത്തും."
    override val pinUpdatedNote = "പുതിയ 4-അക്ക ഉടമ PIN സെർവറിൽ അപ്‌ഡേറ്റ് ചെയ്തു."
    override val completeMasterControlTitle = "സമ്പൂർണ്ണ ഉടമ മാസ്റ്റർ കൺട്രോൾ (25 ഘടകങ്ങൾ)"
    override val masterControlScopeSubtitle = "പ്രദേശം അല്ലെങ്കിൽ ഉപയോക്തൃ പങ്ക് അനുസരിച്ച് തത്സമയ ON/OFF നിയന്ത്രണം."
    override val scopeOptions = listOf(
        "ഗ്ലോബൽ · ഇന്ത്യ (എല്ലാ സംസ്ഥാനങ്ങളും)",
        "തെലങ്കാന മാത്രം",
        "തമിഴ്‌നാട് മാത്രം",
        "തൊഴിലാളികൾ മാത്രം",
        "തൊഴിലുടമകൾ മാത്രം"
    )
    override val masterControlNames = listOf(
        "1. മുഴുവൻ ആപ്പും അറ്റകുറ്റപ്പണി മോഡും",
        "2. തൊഴിലാളി രജിസ്ട്രേഷൻ",
        "3. തൊഴിലുടമ രജിസ്ട്രേഷൻ",
        "4. ജോലി പോസ്റ്റിംഗ്",
        "5. ജോലി തിരയൽ",
        "6. ദിവസക്കൂലി ജോലികൾ",
        "7. മാസശമ്പള ജോലികൾ",
        "8. കോയിൻ വാങ്ങലുകൾ",
        "9. വാലറ്റ് പിൻവലിക്കലുകൾ",
        "10. ജോബ് ഫീസും കോയിൻ വിലയും",
        "11. ഓഫറുകളും പ്രമോഷനുകളും",
        "12. റഫറൽ സമ്മാനങ്ങൾ",
        "13. അറിയിപ്പുകളും പ്രഖ്യാപനങ്ങളും",
        "14. തൊഴിലാളി & തൊഴിലുടമ അക്കൗണ്ട് നിയന്ത്രണം",
        "15. ജോലി വിഭാഗങ്ങളും ഉപവിഭാഗങ്ങളും",
        "16. റേറ്റിംഗും ഓട്ടോമാറ്റിക് ബാഡ്ജുകളും",
        "17. സീനിയോറിറ്റി & ലോയൽറ്റി സഹായം",
        "18. അടിയന്തര & തൊഴിലാളി സുരക്ഷാ സംവിധാനം",
        "19. SMS അലേർട്ടുകൾ",
        "20. IVR സേവനങ്ങൾ",
        "21. ഭാഷാ ക്രമീകരണങ്ങൾ (12 ഭാഷകൾ)",
        "22. രാജ്യം, സംസ്ഥാനം & നഗര ലഭ്യത",
        "23. VIP ID റിസർവേഷനും മാനേജ്‌മെന്റും",
        "24. റിപ്പോർട്ടുകൾ, പരാതികൾ & നിയന്ത്രണം",
        "25. പേയ്‌മെന്റ് ഗേറ്റ്‌വേ സംയോജനം"
    )
    override val publishNoticeTitle = "ചുവപ്പ് LOBORO അഡ്മിൻ അറിയിപ്പ് പ്രസിദ്ധീകരിക്കുക"
    override val announcementMessageLabel = "പ്രഖ്യാപന സന്ദേശം"
    override val announcementPlaceholder = "ഉദാ. അന്യസംസ്ഥാന തൊഴിലാളികൾക്കായി പുതിയ സുരക്ഷാ ഹെൽപ്പ്‌ലൈൻ"
    override val actionLinkLabel = "ബട്ടൺ പേര്"
    override val scopeFieldLabel = "മേഖല / സംസ്ഥാന പരിധി"
    override val audienceOptions = listOf("എല്ലാ ഉപയോക്താക്കളും", "തൊഴിലാളികൾ", "തൊഴിലുടമകൾ")
    override val broadcastNoticeBtn = "ചുവപ്പ് അഡ്മിൻ അറിയിപ്പ് അയയ്ക്കുക"
    override val confirmBroadcastTitle = "ചുവപ്പ് LOBORO അഡ്മിൻ അറിയിപ്പ് അയയ്ക്കണോ?"
    override val confirmBroadcastDescFormat = "സന്ദേശം: %1\$s\nഉപയോക്താക്കൾ: %2\$s · മേഖല: %3\$s"
    override val coinPricingTitle = "കോയിൻ വിലയും ഫീസ് നിയന്ത്രണവും"
    override val coinPricingSummaryFormat = "1 കോയിൻ = ₹%1\$d · ദിവസക്കൂലി = %2\$d കോയിൻ · പ്രത്യേക = %3\$d കോയിനുകൾ · മാസശമ്പളം = %4\$d കോയിനുകൾ · സമയം: %5\$s"
    override val dailyBtnFormat = "ദിവസം +1 (%1\$d)"
    override val masonBtnFormat = "പ്രത്യേകം +1 (%1\$d)"
    override val monthlyBtnFormat = "മാസം +5 (%1\$d)"
    override val protectedVipIdsTitle = "സംരക്ഷിത VIP & ഉടമ ID-കൾ (സ്വമേധയാ നൽകില്ല)"
    override val protectedVipIdsNote = "സാധാരണ ഉപയോക്താക്കൾക്ക് എപ്പോഴും LB2000+ ലഭിക്കും. പ്രത്യേക നമ്പറുകൾ ഉടമയുടെ വിതരണത്തിന് മാത്രമാണ്."
    override val safetyInvestigationTitle = "സുരക്ഷാ കേസും പരാതി അന്വേഷണ ഡെസ്കും"
    override val manageCategoriesTitle = "24 തൊഴിൽ വിഭാഗങ്ങൾ നിയന്ത്രിക്കുക (ഉടൻ ON/OFF)"
    override val showAll24Label = "എല്ലാ 24-ഉം കാണിക്കുക"
    override val showLessLabel = "കുറച്ച് കാണിക്കുക"
    override val auditLogTitle = "ഉടമ പ്രവർത്തന ഓഡിറ്റ് ലോഗ്"
    override val confirmToggleTitleFormat = "%1\$s ഉറപ്പാക്കുക"
    override val confirmToggleDescFormat = "%3\$s-നായി \"%1\$s\" %2\$s ആക്കണോ? നിലവിലുള്ള സാമ്പത്തിക ബാധ്യതകളും 112 സുരക്ഷാ സേവനവും സംരക്ഷിക്കപ്പെടും."

    override val categories = mapOf(
        JobCategoryId.MASON to "മേസ്തിരി / കൽപ്പണിക്കാരൻ",
        JobCategoryId.CONSTRUCTION_LABOUR to "നിർമ്മാണ തൊഴിലാളി",
        JobCategoryId.GENERAL_LABOUR to "സാധാരണ തൊഴിലാളി",
        JobCategoryId.PLUMBER to "പ്ലംബർ",
        JobCategoryId.ELECTRICIAN to "ഇലക്ട്രീഷ്യൻ",
        JobCategoryId.PAINTER to "പെയിന്റർ",
        JobCategoryId.TILE_WORKER to "ടൈൽസ് പണിക്കാരൻ",
        JobCategoryId.CARPENTER to "ആശാരി / കാർപെന്റർ",
        JobCategoryId.WELDER to "വെൽഡർ",
        JobCategoryId.HOTEL_STAFF to "ഹോട്ടൽ ജീവനക്കാർ",
        JobCategoryId.COOK to "പാചകക്കാരൻ / കുക്ക്",
        JobCategoryId.WAITER to "വെയ്റ്റർ",
        JobCategoryId.HOUSEKEEPING to "ഹൗസ്‌കീപ്പിംഗ്",
        JobCategoryId.SECURITY_GUARD to "സെക്യൂരിറ്റി ഗാർഡ്",
        JobCategoryId.DRIVER to "ഡ്രൈവർ",
        JobCategoryId.DELIVERY_WORKER to "ഡെലിവറി ജീവനക്കാരൻ",
        JobCategoryId.FACTORY_WORKER to "ഫാക്ടറി തൊഴിലാളി",
        JobCategoryId.PACKING_WORKER to "പാക്കിംഗ് തൊഴിലാളി",
        JobCategoryId.MACHINE_OPERATOR to "മെഷീൻ ഓപ്പറേറ്റർ",
        JobCategoryId.AGRICULTURE_WORKER to "കാർഷിക തൊഴിലാളി",
        JobCategoryId.OFFICE_ASSISTANT to "ഓഫീസ് സഹായി",
        JobCategoryId.SHOP_STAFF to "കട ജീവനക്കാർ",
        JobCategoryId.DOMESTIC_WORKER to "വീട്ടുജോലി സഹായി",
        JobCategoryId.OTHER_JOBS to "മറ്റു ജോലികൾ"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "തൊഴിലാളി",
        UserRole.EMPLOYER to "തൊഴിലുടമ",
        UserRole.OWNER_SUPER_ADMIN to "ഉടമ / സൂപ്പർ അഡ്മിൻ"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "അപേക്ഷിച്ചു",
        ApplicationStatus.UNDER_REVIEW to "പരിശോധനയിൽ",
        ApplicationStatus.SHORTLISTED to "ഷോർട്ട്‌ലിസ്റ്റ്",
        ApplicationStatus.ACCEPTED to "അംഗീകരിച്ചു",
        ApplicationStatus.REJECTED to "നിരസിച്ചു",
        ApplicationStatus.WITHDRAWN to "പിൻവലിച്ചു",
        ApplicationStatus.COMPLETED to "പൂർത്തിയായി"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "തീർപ്പാകാത്തത്",
        TransactionStatus.SUCCESSFUL to "വിജയകരം",
        TransactionStatus.FAILED to "പരാജയപ്പെട്ടു",
        TransactionStatus.REFUNDED to "തിരികെ ലഭിച്ചു"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "കോയിൻ വാങ്ങൽ",
        TransactionType.GIFT to "സമ്മാന ക്രെഡിറ്റ്",
        TransactionType.PROMO to "പ്രോമോ ക്രെഡിറ്റ്",
        TransactionType.REFERRAL to "റഫറൽ ബോണസ്",
        TransactionType.BADGE_REWARD to "ബാഡ്ജ് സമ്മാനം",
        TransactionType.LOYALTY_SUPPORT to "ലോയൽറ്റി സഹായം",
        TransactionType.JOB_FEE to "ജോബ് ഫീസ്",
        TransactionType.WITHDRAWAL to "പിൻവലിക്കൽ"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "കുടിശ്ശിക വേതനം",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "ശാരീരിക ഉപദ്രവം",
        SafetyComplaintCategory.HARASSMENT to "പീഡനം",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "ഭക്ഷണ / താമസ പ്രശ്നം",
        SafetyComplaintCategory.FRAUD to "തൊഴിൽ തട്ടിപ്പ്",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "സുരക്ഷിതമല്ലാത്ത തൊഴിലിടം",
        SafetyComplaintCategory.OTHER_EMERGENCY to "മറ്റ് അടിയന്തരം"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "പുതിയത്",
        SafetyCaseStatus.IN_REVIEW to "പരിശോധനയിൽ",
        SafetyCaseStatus.ADMIN_VERIFIED to "അഡ്മിൻ പരിശോധിച്ചു",
        SafetyCaseStatus.ACTION_TAKEN to "നടപടിയെടുത്തു",
        SafetyCaseStatus.REFERRED to "കൈമാറി",
        SafetyCaseStatus.CLOSED to "അടച്ചു"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "പ്രാരംഭം",
        BadgeLevel.SILVER to "സിൽവർ",
        BadgeLevel.GOLD to "ഗോൾഡ്",
        BadgeLevel.DIAMOND to "ഡയമണ്ട്",
        BadgeLevel.PLATINUM to "പ്ലാറ്റിനം"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "ജോലി പോസ്റ്റ് ചെയ്യുമ്പോൾ",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "പരിശോധിച്ച ബന്ധത്തിൽ",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "അപേക്ഷ അംഗീകരിക്കുമ്പോൾ"
    )
    override val indianStates = mapOf(
        "All States" to "എല്ലാ സംസ്ഥാനങ്ങളും",
        "Telangana" to "തെലങ്കാന",
        "Andhra Pradesh" to "ആന്ധ്രാപ്രദേശ്",
        "Tamil Nadu" to "തമിഴ്‌നാട്",
        "Karnataka" to "കർണാടക",
        "Maharashtra" to "മഹാരാഷ്ട്ര",
        "Gujarat" to "ഗുജറാത്ത്",
        "Assam" to "അസം",
        "Bihar" to "ബിഹാർ",
        "Uttar Pradesh" to "ഉത്തർപ്രദേശ്",
        "West Bengal" to "പശ്ചിമ ബംഗാൾ",
        "Odisha" to "ഒഡീഷ",
        "Kerala" to "കേരളം",
        "Punjab" to "പഞ്ചാബ്"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "ക്ലൗഡ് ഡാറ്റാബേസും സുരക്ഷയും",
        "otp_sms" to "OTP & SMS സേവനം",
        "payment_gateway" to "UPI & കോയിൻ പേയ്‌മെന്റ് ഗേറ്റ്‌വേ",
        "face_liveness" to "മുഖ പൊരുത്തവും ലൈവ്‌നെസ് പരിശോധനയും",
        "translation" to "തത്സമയ 12-ഭാഷാ ജോലി വിവർത്തനം",
        "telecom_ivr" to "കീപാഡ് ഫോൺ മിസ്ഡ്-കോൾ & IVR",
        "owner_pin_auth" to "ഉടമ ബൂട്ട്‌സ്‌ട്രാപ്പും 4-അക്ക PIN സെർവറും"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "ബന്ധിപ്പിച്ചിട്ടില്ല",
        IntegrationStatus.NEEDS_CREDENTIALS to "കീകൾ ആവശ്യമാണ്",
        IntegrationStatus.CONNECTED to "ബന്ധിപ്പിച്ചു"
    )

    override val msgOwnerPrivilegeBlocked = "അനുമതിയില്ല: സാധാരണ ഉപയോക്താക്കൾക്ക് ഒരിക്കലും ഉടമ / സൂപ്പർ അഡ്മിൻ ആകാൻ കഴിയില്ല."
    override val msgSwitchedPreviewFormat = "പ്രിവ്യൂ അക്കൗണ്ട് %1\$s (%2\$s) ആയി മാറ്റി."
    override val msgLanguageSavedFormat = "ഭാഷ %1\$s (%2\$s) ആയി സജ്ജമാക്കി"
    override val msgEnterNameBeforeOtp = "OTP ആവശ്യപ്പെടുന്നതിന് മുമ്പ് നിങ്ങളുടെ മുഴുവൻ പേര് നൽകുക."
    override val msgEnterValidMobile = "ദയവായി ശരിയായ 10-അക്ക മൊബൈൽ നമ്പർ നൽകുക."
    override val msgOtpDispatchedFormat = "%1\$s എന്ന നമ്പറിലേക്ക് സെർവർ OTP അയച്ചു. ഫോണിൽ ലഭിച്ച കോഡ് നൽകുക."
    override val msgUnableSendOtp = "OTP അയയ്ക്കാനായില്ല. ബാക്കെൻഡ് URL അല്ലെങ്കിൽ ഇന്റർനെറ്റ് പരിശോധിക്കുക."
    override val msgSendOtpAndEnterCode = "ആദ്യം OTP അയച്ച് 4–6 അക്ക കോഡ് നൽകുക."
    override val msgOtpVerifiedCreateFormat = "മൊബൈൽ OTP പരിശോധിച്ചു! വിവരങ്ങൾ നൽകി %1\$s പ്രൊഫൈൽ സൃഷ്ടിക്കുക അമർത്തുക."
    override val msgIncorrectOtp = "തെറ്റായ അല്ലെങ്കിൽ കാലാവധി കഴിഞ്ഞ OTP. പുതിയ OTP ആവശ്യപ്പെടുക."
    override val msgServerOtpUnavailable = "സെർവർ OTP സേവനം ലഭ്യമല്ല. ലൈവ് ബാക്കെൻഡ് ബന്ധിപ്പിക്കുക."
    override val msgEnterFullName = "മുഴുവൻ പേര് ആവശ്യമാണ്."
    override val msgVerifyMobileOtpFirst = "ദയവായി ആദ്യം മൊബൈൽ OTP പരിശോധിക്കുക."
    override val msgAccountCreatedFormat = "സ്വാഗതം %1\$s! %2\$s അക്കൗണ്ട് സൃഷ്ടിച്ചു (%3\$s)."
    override val msgLoggedInFormat = "%1\$s (%2\$s) ആയി ലോഗിൻ ചെയ്തു"
    override val msgSignedOut = "ഉപയോക്തൃ അക്കൗണ്ടിൽ നിന്ന് സൈൻ ഔട്ട് ചെയ്തു."
    override val msgDuplicateOwnerBlocked = "സുരക്ഷാ തടസ്സം: ഉടമ അക്കൗണ്ട് ഇതിനകം നിലവിലുണ്ട്. രണ്ടാമതൊരു ഉടമയെ സൃഷ്ടിക്കാനാവില്ല."
    override val msgBootstrapRequired = "സെർവർ ബൂട്ട്‌സ്‌ട്രാപ്പ് അനുമതി കോഡ് നൽകുക."
    override val msgEnterPasswords = "ഉടമ ലോഗിൻ പാസ്‌വേഡ് നൽകി ഉറപ്പാക്കുക."
    override val msgPasswordsDoNotMatch = "പാസ്‌വേഡുകൾ പൊരുത്തപ്പെടുന്നില്ല."
    override val msgPasswordTooShort = "പാസ്‌വേഡിന് കുറഞ്ഞത് 8 അക്ഷരങ്ങൾ വേണം."
    override val msgPinFourDigits = "അഡ്മിൻ PIN കൃത്യമായി 4 അക്കമായിരിക്കണം."
    override val msgPinsDoNotMatch = "4-അക്ക PIN സ്ഥിരീകരണം പൊരുത്തപ്പെടുന്നില്ല."
    override val msgOwnerCreatedFormat = "%1\$s-നായി ഉടമ പ്രൊഫൈൽ സൃഷ്ടിച്ചു. പുതിയ ഉടമ രജിസ്ട്രേഷൻ സ്ഥിരമായി അടച്ചു."
    override val msgOwnerLockedSession = "ഉടമ സെഷൻ ലോക്ക് ചെയ്തു."
    override val msgOwnerTimedOut = "5 മിനിറ്റ് നിഷ്ക്രിയമായതിനാൽ ഉടമ സെഷൻ അവസാനിച്ചു. വീണ്ടും PIN നൽകുക."
    override val msgOwnerUnlocked = "ഉടമ മാസ്റ്റർ കൺട്രോൾ തുറന്നു."
    override val msgInvalidPinAttemptsFormat = "തെറ്റായ 4-അക്ക ഉടമ PIN. %1\$d ശ്രമം കൂടി ബാക്കി."
    override val msgTooManyPinAttemptsFormat = "അധികം തെറ്റായ ശ്രമങ്ങൾ. %1\$d സെക്കൻഡ് ലോക്ക് ചെയ്തു."
    override val msgOwnerSessionRequired = "സജീവ ഉടമ സെഷൻ ആവശ്യമാണ്."
    override val msgVerifyOtpBeforePinChange = "ആദ്യം രജിസ്റ്റർ ചെയ്ത മൊബൈലിലേക്ക് വന്ന OTP പരിശോധിക്കുക."
    override val msgPinUpdatedSuccess = "പുതിയ അഡ്മിൻ PIN സെർവറിൽ സുരക്ഷിതമായി അപ്‌ഡേറ്റ് ചെയ്തു."
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s)-നുള്ള ഡെമോ പ്രൊഫൈൽ അപ്‌ഡേറ്റ് ചെയ്തു"
    override val msgJobPostedFormat = "%1\$s-ൽ ഡെമോ ജോലി പോസ്റ്റ് ചെയ്തു! ഫീസ്: %2\$d കോയിൻ."
    override val msgAlreadyAppliedFormat = "%1\$s-ന് ഇതിനകം അപേക്ഷിച്ചു"
    override val msgApplicationSentFormat = "%1\$s-ലേക്ക് അപേക്ഷ അയച്ചു"
    override val msgApplicationWithdrawnFormat = "അപേക്ഷ %1\$s പിൻവലിച്ചു"
    override val msgApplicationUpdatedFormat = "അപേക്ഷ %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "പ്രതിവാര പരിശോധന രേഖപ്പെടുത്തി: 1 · ഞാൻ സുരക്ഷിതനാണ്."
    override val msgCheckInProblemRecorded = "മുന്നറിയിപ്പ് രേഖപ്പെടുത്തി (2 · പ്രശ്നം). സുരക്ഷാ വിഭാഗത്തെ അറിയിച്ചു."
    override val msgCheckInAdminRequested = "അടിയന്തര അഡ്മിൻ കോൾബാക്ക് അഭ്യർത്ഥിച്ചു (3). കുടുംബ അലേർട്ട് നിരയിലാണ്."
    override val msgSafetyComplaintSubmittedFormat = "സുരക്ഷാ കേസ് %1\$s രേഖപ്പെടുത്തി."
    override val msgWithdrawalsFrozen = "അടിയന്തര നിരോധനം സജീവം: എല്ലാ പിൻവലിക്കലുകളും ഉടൻ ലോക്ക് ചെയ്തു."
    override val msgWithdrawalsUnfrozen = "പരിശോധനയ്ക്ക് ശേഷം പിൻവലിക്കൽ അൺലോക്ക് ചെയ്തു."
    override val msgOwnerNoticePublished = "ചുവപ്പ് LOBORO അഡ്മിൻ അറിയിപ്പ് പ്രസിദ്ധീകരിച്ചു."
}
