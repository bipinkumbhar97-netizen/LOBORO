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

object OdiaStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "ଗ୍ଲୋବାଲ୍ ଜବ୍ ଏବଂ ସେବା"
    override val demoPreviewBanner = "ଡେମୋ ପ୍ରିଭ୍ୟୁ ଡାଟା · ଲାଇଭ୍ ବ୍ୟବହାର ପାଇଁ ସେଟିଂସ୍‌ରେ ବ୍ୟାକଏଣ୍ଡ API ଯୋଡ଼ନ୍ତୁ"
    override val verifiedNormalAccountBanner = "ଯାଞ୍ଚ ହୋଇଥିବା ବ୍ୟବହାରକାରୀ ଖାତା · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO ଆଡମିନ୍ ସୂଚନା"
    override val maintenanceModeBanner = "ରକ୍ଷଣାବେକ୍ଷଣ ମୋଡ୍ ଚାଲୁ ଅଛି · ନିଯୁକ୍ତି ଓ ୱାଲେଟ୍ ଅସ୍ଥାୟୀ ବନ୍ଦ। ଜରୁରୀ ୧୧୨ ଓ ସୁରକ୍ଷା ସେବା ଚାଲୁ ଅଛି।"
    override val navHome = "ହୋମ୍"
    override val navSearchJobs = "କାମ ଖୋଜନ୍ତୁ"
    override val navPostJob = "କାମ ପୋଷ୍ଟ"
    override val navWallet = "ୱାଲେଟ୍"
    override val navMyApplications = "ମୋ ଆବେଦନ"
    override val navMyJobs = "ମୋ କାମ"
    override val navNotifications = "ସୂଚନା"
    override val navHelpSafety = "ସାହାଯ୍ୟ ଏବଂ ସୁରକ୍ଷା"
    override val navProfile = "ପ୍ରୋଫାଇଲ୍"
    override val navSettings = "ସେଟିଂସ୍"
    override val navAdmin = "ମାଲିକ ନିୟନ୍ତ୍ରଣ"
    override val navBadgesLoyalty = "ବ୍ୟାଜ୍ ଏବଂ ବିଶ୍ୱସ୍ତତା"
    override val navIvrKeypad = "କିପ୍ୟାଡ୍ ଏବଂ IVR"
    override val backLabel = "ପଛକୁ"
    override val homeLabel = "ହୋମ୍"
    override val languageLabel = "ଭାଷା"
    override val languageSelectorTitle = "୧୨ଟି ଭାଷା"
    override val activeBadgeLabel = "ସକ୍ରିୟ"
    override val closeLabel = "ବନ୍ଦ କରନ୍ତୁ"
    override val okLabel = "ଠିକ୍ ଅଛି"
    override val understoodLabel = "ବୁଝିଗଲି"
    override val cancelLabel = "ବାତିଲ୍ କରନ୍ତୁ"
    override val doneLabel = "ସମ୍ପୂର୍ଣ୍ଣ"
    override val confirmActionLabel = "ନିଶ୍ଚିତ କରନ୍ତୁ"
    override val resetLabel = "ରିସେଟ୍"
    override val sendLabel = "ପଠାନ୍ତୁ"

    override val shareAppTitle = "LOBORO ଆପ୍ ସେୟାର କରନ୍ତୁ"
    override val shareAppCta = "ସାଙ୍ଗମାନଙ୍କୁ ସେୟାର କରି ପୁରସ୍କାର ପାଆନ୍ତୁ"
    override val yourReferralLinkLabel = "ଆପଣଙ୍କ ରେଫରାଲ୍ ଲିଙ୍କ୍"
    override val loboroLinkLabel = "LOBORO ଲିଙ୍କ୍"
    override val shareMenuButton = "ସେୟାର ମେନୁ"
    override val copyLinkButton = "ଲିଙ୍କ୍ କପି କରନ୍ତୁ"
    override val referralCopiedToast = "ରେଫରାଲ୍ ବାର୍ତ୍ତା କପି ହେଲା"
    override val openingShareMenuToast = "ସେୟାର ମେନୁ ଖୋଲୁଛି"
    override val shareMessageTemplate = "LOBORO ଗ୍ଲୋବାଲ୍ ଜବ୍ ଓ ସେବାରେ ଯୋଗ ଦିଅନ୍ତୁ! ସାରା ଭାରତରେ ଦୈନିକ ମଜୁରୀ କିମ୍ବା ମାସିକ ଦରମା କାମ ପାଆନ୍ତୁ। ମୋର ରେଫରାଲ୍ ID %1\$s ବ୍ୟବହାର କରନ୍ତୁ: %2\$s"

    override val registerWorkerEmployerCta = "ଶ୍ରମିକ / ନିଯୁକ୍ତିଦାତା ଭାବେ ପଞ୍ଜୀକରଣ କରନ୍ତୁ"
    override val logInLabel = "ଲଗ୍ ଇନ୍"
    override val signOutLabel = "ସାଇନ୍ ଆଉଟ୍"
    override val voiceSearchHint = "କାମ କିମ୍ବା ସହର କୁହନ୍ତୁ ବା ଲେଖନ୍ତୁ (ଯେପରି: ହାଇଦ୍ରାବାଦରେ ରାଜମିସ୍ତ୍ରୀ)"
    override val tapMicToSpeak = "କହି କାମ ଖୋଜିବାକୁ ମାଇକ୍ ଦବାନ୍ତୁ"
    override val listeningStatus = "ଶୁଣୁଛୁ... ଆପଣଙ୍କ ଆବଶ୍ୟକ କାମ କୁହନ୍ତୁ"
    override val stopListening = "ଶୁଣିବା ବନ୍ଦ କରନ୍ତୁ"
    override val searchAction = "ଖୋଜନ୍ତୁ"
    override val retryVoice = "ପୁଣି କୁହନ୍ତୁ"
    override val voiceMicPermissionNeeded = "ଭଏସ୍ ସନ୍ଧାନ ପାଇଁ ଆପଣ ମାଇକ୍ ବଟନ୍ ଦବାଇଲେ ହିଁ ମାଇକ୍ ଅନୁମତି ମଗାଯାଏ।"
    override val voiceUnavailableHonest = "ଏହି ଡିଭାଇସ୍‌ରେ ଭଏସ୍ ଚିହ୍ନଟ ସେବା ଇନଷ୍ଟଲ୍ ନାହିଁ। କ୍ଲାଉଡ୍ ଭଏସ୍ ସେବା ଯୋଡ଼ନ୍ତୁ କିମ୍ବା ତଳ ବିକଳ୍ପ ଦବାନ୍ତୁ।"
    override val voiceNoMatchError = "କଥା ସ୍ପଷ୍ଟ ଶୁଣାଗଲା ନାହିଁ। ସ୍ପଷ୍ଟ କୁହନ୍ତୁ କିମ୍ବା ତଳ ନମୁନା ବାଛନ୍ତୁ।"
    override val voiceNetworkError = "ନେଟୱାର୍କ ତ୍ରୁଟି। ଇଣ୍ଟରନେଟ୍ ଯାଞ୍ଚ କରନ୍ତୁ କିମ୍ବା କାମ ଟାଇପ୍ କରନ୍ତୁ।"
    override val voiceStoppedError = "ଭଏସ୍ ଇନପୁଟ୍ ବନ୍ଦ ହେଲା (କୋଡ୍ %1\$d)। ଟାଇପ୍ କରନ୍ତୁ କିମ୍ବା ପୁଣି ଚେଷ୍ଟା କରନ୍ତୁ।"
    override val voicePrivacyHint = "ଗୋପନୀୟତା: ମାଇକ୍ ସାଧାରଣତଃ ବନ୍ଦ ଥାଏ ଏବଂ ଆପଣ ଦବାଇଲେ ହିଁ ଚାଲୁ ହୁଏ।"
    override val clearSearchDesc = "ସନ୍ଧାନ ସଫା କରନ୍ତୁ"
    override val spokenSamples = listOf(
        "ହାଇଦ୍ରାବାଦରେ ରାଜମିସ୍ତ୍ରୀ" to "Mason",
        "ପୁଣେ ଇଲେକ୍ଟ୍ରିସିଆନ୍" to "Electrician",
        "ଚେନ୍ନାଇ ହୋଟେଲ୍ ରୋଷେୟା" to "Cook",
        "ବିଜୟୱାଡ଼ା ଡ୍ରାଇଭର୍" to "Driver",
        "ସୁରଟ ପ୍ୟାକିଂ କାମ" to "Packing"
    )
    override val dailyJobsTitle = "ଦୈନିକ କାମ (Daily)"
    override val dailyJobsSubtitle = "ଦୈନିକ ମଜୁରୀ · ମାସିକ କାମଠାରୁ ପୃଥକ୍ ତାଲିକା"
    override val monthlyJobsTitle = "ମାସିକ ଦରମା କାମ"
    override val monthlyJobsSubtitle = "ନିର୍ଦ୍ଧାରିତ ମାସିକ ଦରମା · ଛୁଟି ଓ ରହିବା ସୂଚନା"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "କାମର ଶ୍ରେଣୀ (୨୪ଟି)"
    override val walletStripSummaryFormat = "%1\$d କଏନ୍ (₹%2\$d) · ୧୦୦%% ଉଠାଣଯୋଗ୍ୟ"

    override val outOfStateTitle = "ଅନ୍ୟ ରାଜ୍ୟ ଓ ବିଶ୍ୱସ୍ତରୀୟ କାମ ଖୋଜନ୍ତୁ"
    override val willingToRelocate = "ଅନ୍ୟ ରାଜ୍ୟକୁ ଯାଇ କାମ କରିବାକୁ ଇଚ୍ଛୁକ"
    override val filterCountry = "ଦେଶ"
    override val filterState = "ରାଜ୍ୟ"
    override val filterDistrict = "ଜିଲ୍ଲା"
    override val filterCity = "ସହର"
    override val filterDistance = "ଦୂରତା"
    override val upToKmFormat = "%1\$d କି.ମି. ପର୍ଯ୍ୟନ୍ତ"
    override val filterFoodIncluded = "ଖାଦ୍ୟ ବ୍ୟବସ୍ଥା"
    override val filterAccommodation = "ରହିବା ଘର / ଆବାସ"
    override val allCategoriesLabel = "ସମସ୍ତ ଶ୍ରେଣୀ"
    override val noMatchingJobsTitle = "ଫିଲ୍ଟର୍ ଅନୁଯାୟୀ କୌଣସି କାମ ମିଳିଲା ନାହିଁ"
    override val noMatchingJobsSubtitle = "ଫିଲ୍ଟର୍ ରିସେଟ୍ କରନ୍ତୁ କିମ୍ବା 'ଅନ୍ୟ ରାଜ୍ୟ କାମ' ଚାଲୁ କରନ୍ତୁ।"
    override val showAllJobsButton = "ସବୁ କାମ ଦେଖାନ୍ତୁ"
    override val dailyWageJobBadge = "ଦୈନିକ ମଜୁରୀ କାମ"
    override val monthlySalaryJobBadge = "ମାସିକ ଦରମା କାମ"
    override val demoDataTag = "ଡେମୋ"
    override val originalLangFormat = "ମୂଳ ଭାଷା: %1\$s"
    override val preTranslatedPreviewNote = "ପୂର୍ବ-ଅନୁବାଦିତ ପ୍ରିଭ୍ୟୁ ସକ୍ରିୟ ଅଛି। ଲାଇଭ୍ କାମ ପାଇଁ ସେଟିଂସ୍‌ରେ ଅନୁବାଦ API କି ଯୋଡ଼ନ୍ତୁ।"
    override val configureTranslationApiNote = "ସମସ୍ତ ୧୨ଟି ଭାଷାରେ ଲାଇଭ୍ ଅନୁବାଦ ପାଇଁ ସେଟିଂସ୍‌ରେ ଅନୁବାଦ API କି ଯୋଡ଼ନ୍ତୁ।"
    override val translatedToggle = "ଅନୁବାଦିତ"
    override val originalToggle = "ମୂଳ"
    override val compensationLabel = "ମଜୁରୀ / ଦରମା"
    override val locationLabel = "ସ୍ଥାନ"
    override val employerLabel = "ନିଯୁକ୍ତିଦାତା"
    override val vacanciesUnit = "ପଦବୀ"
    override val perDayFormat = "₹%1\$d / ଦିନ"
    override val perMonthFormat = "₹%1\$d / ମାସ"
    override val coinsCountFormat = "%1\$d କଏନ୍"
    override val foodBadge = "ଖାଦ୍ୟ"
    override val stayBadge = "ରହିବା"
    override val shareJobButton = "କାମ ସେୟାର"
    override val applyNow = "ଆବେଦନ କରନ୍ତୁ"
    override val saveJob = "ସେଭ୍"
    override val negotiateChat = "କଥାବାର୍ତ୍ତା / ଚାଟ୍"
    override val reportJob = "ଅଭିଯୋଗ କରନ୍ତୁ"
    override val foodAvailable = "ଖାଦ୍ୟ ଅନ୍ତର୍ଭୁକ୍ତ"
    override val accommodationAvailable = "ରହିବା ସୁବିଧା ଅନ୍ତର୍ଭୁକ୍ତ"
    override val notProvided = "ଅନ୍ତର୍ଭୁକ୍ତ ନୁହେଁ"
    override val workersNeeded = "ଆବଶ୍ୟକ ଶ୍ରମିକ"
    override val workHoursLabel = "କାମ ସମୟ"
    override val overtimeLabel = "ଓଭରଟାଇମ୍"
    override val paymentFreqLabel = "ପେମେଣ୍ଟ"
    override val weeklyHolidayLabel = "ସାପ୍ତାହିକ ଛୁଟି"
    override val leavePolicyLabel = "ଛୁଟି ନିୟମ"
    override val joiningDateLabel = "ଯୋଗଦାନ ତାରିଖ"
    override val expiryLabel = "ସମାପ୍ତି"
    override val translatedBadgeLabel = "ଅନୁବାଦିତ"

    override val postingPausedFormat = "କାମ ପୋଷ୍ଟ କରିବା ବର୍ତ୍ତମାନ ମାଲିକ ନିୟନ୍ତ୍ରଣ (%1\$s) ଦ୍ୱାରା ବନ୍ଦ ଅଛି।"
    override val selectCategoryLabel = "ଶ୍ରେଣୀ ବାଛନ୍ତୁ (୨୪ଟି ଶ୍ରେଣୀ)"
    override val jobTitleLabel = "କାମର ଶୀର୍ଷକ"
    override val jobTitlePlaceholder = "ଯେପରି: ହଷ୍ଟେଲ୍ ନିର୍ମାଣ ପାଇଁ ୪ ଜଣ ରାଜମିସ୍ତ୍ରୀ ଆବଶ୍ୟକ"
    override val jobDescLabel = "କାମର ବିବରଣୀ"
    override val jobDescPlaceholder = "କାମ ତଥ୍ୟ, ସୁରକ୍ଷା ଉପକରଣ, ଖାଦ୍ୟ ଓ ରହିବା ବ୍ୟବସ୍ଥା"
    override val dailyWageInrLabel = "ଦୈନିକ ମଜୁରୀ (₹)"
    override val monthlySalaryInrLabel = "ମାସିକ ଦରମା (₹)"
    override val vacanciesLabel = "ଖାଲି ପଦବୀ"
    override val cityTownLabel = "ସହର / ଟାଉନ୍"
    override val stateLabel = "ରାଜ୍ୟ"
    override val transparentJobFeeTitle = "ସ୍ୱଚ୍ଛ ଜବ୍ ଫି: %1\$d କଏନ୍ (₹%2\$d)"
    override val configuredByOwnerSub = "ମାଲିକଙ୍କ ଦ୍ୱାରା ନିର୍ଦ୍ଧାରିତ · ଫି ସମୟ: %1\$s · ଉପଲବ୍ଧ: %2\$d କଏନ୍"
    override val confirmAndPostJobButton = "ନିଶ୍ଚିତ କରି କାମ ପୋଷ୍ଟ କରନ୍ତୁ (%1\$d କଏନ୍)"

    override val walletBalanceTitle = "LOBORO କଏନ୍ ବାଲାନ୍ସ"
    override val withdrawableValueFormat = "₹%1\$d ଉଠାଣଯୋଗ୍ୟ ମୂଲ୍ୟ (୧ କଏନ୍ = ₹%2\$d)"
    override val withdrawableRuleTitle = "୧୦୦% ସମାନ ଉଠାଣ ନିୟମ"
    override val withdrawableRuleBody = "କିଣାଯାଇଥିବା, ଉପହାର, ଅଫର୍, ରେଫରାଲ୍, ବ୍ୟାଜ୍ କିମ୍ବା ବିଶ୍ୱସ୍ତତାର ପ୍ରତ୍ୟେକ କଏନ୍‌ର ନଗଦ ମୂଲ୍ୟ ସମାନ ଓ ୧୦୦% ଉଠାଣଯୋଗ୍ୟ।"
    override val buyCoins = "କଏନ୍ କିଣନ୍ତୁ"
    override val withdrawCoins = "ଟଙ୍କା ଉଠାନ୍ତୁ"
    override val walletActionsPausedNote = "କିଛି ୱାଲେଟ୍ ସେବା ମାଲିକଙ୍କ ଦ୍ୱାରା ସ୍ଥଗିତ ଅଛି। ଆପଣଙ୍କ ବାଲାନ୍ସ ଓ ଅନୁମୋଦିତ ରିଫଣ୍ଡ ସୁରକ୍ଷିତ ଅଛି।"
    override val coinPackagesTitle = "କଏନ୍ ପ୍ୟାକେଜ୍ (ସ୍ୱଚ୍ଛ ମୂଲ୍ୟ)"
    override val bankSecurityTitle = "ବ୍ୟାଙ୍କ / UPI ଓ ମୁହଁ ଯାଞ୍ଚ ସୁରକ୍ଷା"
    override val payoutDestinationLabel = "ଯାଞ୍ଚ ହୋଇଥିବା ଖାତା: %1\$s"
    override val bankSecurityStepsNote = "ବ୍ୟାଙ୍କ/UPI ବଦଳାଇବାକୁ ବାଧ୍ୟତାମୂଳକ ଯାଞ୍ଚ: ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍ OTP + ଲାଇଭ୍ ସେଲଫି ମେଳ + ଅସ୍ଥାୟୀ ପେମେଣ୍ଟ ରୋକ।"
    override val changeBankUpiButton = "ବ୍ୟାଙ୍କ / UPI ବଦଳାନ୍ତୁ (OTP + ମୁହଁ ଯାଞ୍ଚ)"
    override val unfreezePayoutsButton = "ଉଠାଣ ଅନଲକ୍ କରନ୍ତୁ"
    override val lostPhoneFreezeButton = "ଫୋନ୍ ହଜିଗଲା? ଟଙ୍କା ଉଠାଣ ବନ୍ଦ କରନ୍ତୁ"
    override val payoutFreezeActiveNote = "ଉଠାଣ ନିଷେଧ ସକ୍ରିୟ ଅଛି। ପରିଚୟ ପୁନଃଯାଞ୍ଚ ନହେବା ଯାଏଁ କୌଣସି ଟଙ୍କା ଉଠାଯାଇପାରିବ ନାହିଁ।"
    override val transactionHistory = "କଏନ୍ କାରବାର ଖାତା"
    override val demoLedgerSuffix = "(ଡେମୋ ଖାତା)"
    override val buyCoinsDialogTitleFormat = "%1\$d କଏନ୍ କିଣନ୍ତୁ (₹%2\$d)"
    override val paymentNotConnectedBody = "ଲାଇଭ୍ Razorpay / Cashfree UPI ପେମେଣ୍ଟ ଏପର୍ଯ୍ୟନ୍ତ ଯୋଡ଼ା ହୋଇନାହିଁ। ପ୍ରକୃତ ଟଙ୍କା ନେବା ପୂର୍ବରୁ ପ୍ରଡକ୍ସନ୍ କି ଯୋଡ଼ନ୍ତୁ।"
    override val withdrawDialogTitleFormat = "₹%1\$d ଉଠାନ୍ତୁ"
    override val withdrawDialogBodyFormat = "ସମ୍ପୂର୍ଣ୍ଣ ବାଲାନ୍ସ (%1\$d କଏନ୍) ସମାନ ନଗଦ ମୂଲ୍ୟରେ ୧୦୦%% ଉଠାଣଯୋଗ୍ୟ।\nଖାତା: %2\$s\n\nଏହି ବିଲ୍ଡରେ ଲାଇଭ୍ IMPS / UPI ଗେଟୱେ ଯୋଡ଼ା ହୋଇନାହିଁ।"
    override val bankChangeDialogTitle = "୩-ସ୍ତରୀୟ ବ୍ୟାଙ୍କ / UPI ସୁରକ୍ଷା"
    override val bankChangeDialogBody = "ଫୋନ୍ ହଜିଲେ ସୁରକ୍ଷା ପାଇଁ ବ୍ୟାଙ୍କ/UPI ବଦଳାଇବାକୁ ଆବଶ୍ୟକ:\n୧. ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍ OTP ଯାଞ୍ଚ\n୨. ପଞ୍ଜୀକରଣ ଫଟୋ ସହ ଲାଇଭ୍ ମୁହଁ ମେଳ\n୩. ମୁକ୍ତ ପୂର୍ବରୁ ସୁରକ୍ଷା ଅପେକ୍ଷା ସମୟ"
    override val receiptDialogTitle = "କାରବାର ରସିଦ୍"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "ରେଫରେନ୍ସ: %1\$s"
    override val receiptTypeLabel = "ପ୍ରକାର: %1\$s"
    override val receiptCoinsLabel = "କଏନ୍: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "ସ୍ଥିତି: %1\$s"
    override val receiptTimeLabel = "ସମୟ: %1\$s"
    override val receiptWithdrawableYes = "ଉଠାଣ ଯୋଗ୍ୟତା: ୧୦୦% ହଁ"

    override val employerAppsHeading = "ଆବେଦନ ଓ ସିଧାସଳଖ ଚାଟ୍"
    override val secureChatHeading = "ସୁରକ୍ଷିତ ଶ୍ରମିକ ↔ ନିଯୁକ୍ତିଦାତା ଚାଟ୍"
    override val secureChatSubtitle = "ଆପଣ ନିଜେ ସେୟାର ନକରିବା ପର୍ଯ୍ୟନ୍ତ ଫୋନ୍ ନମ୍ବର ଗୁପ୍ତ ରହେ। ଖୋଲିବାକୁ ବା ବ୍ଲକ୍ କରିବାକୁ ଟ୍ୟାପ୍ କରନ୍ତୁ।"
    override val chatButton = "ଚାଟ୍"
    override val workerEmployerLineFormat = "ଶ୍ରମିକ: %1\$s (%2\$s) · ନିଯୁକ୍ତିଦାତା: %3\$s"
    override val shortlistButton = "ସର୍ଟଲିଷ୍ଟ"
    override val acceptButton = "ଗ୍ରହଣ କରନ୍ତୁ"
    override val withdrawButton = "ପ୍ରତ୍ୟାହାର"
    override val phoneHiddenPrivacy = "ଗୋପନୀୟତା ସକ୍ରିୟ: ଉଭୟ ପକ୍ଷର ସମ୍ମତି ବିନା ବ୍ୟକ୍ତିଗତ ଫୋନ୍ ନମ୍ବର ଲୁଚି ରହେ।"
    override val blockUserLabel = "ବ୍ଲକ୍"
    override val userBlockedNotice = "ଆପଣ ଏହି ବାର୍ତ୍ତାଳାପକୁ ବ୍ଲକ୍ କରିଛନ୍ତି। ଆବଶ୍ୟକ ହେଲେ ସୁରକ୍ଷା ଡେସ୍କରେ ଜଣାନ୍ତୁ।"
    override val chatPlaceholder = "ଆପଣଙ୍କ ଭାଷାରେ ବାର୍ତ୍ତା ଲେଖନ୍ତୁ..."

    override val automaticBadgePrefix = "ସ୍ୱୟଂଚାଳିତ ବ୍ୟାଜ୍: %1\$s"
    override val badgeStatsFormat = "ରେଟିଂ %1\$.1f ★ · %2\$d ଯାଞ୍ଚ ହୋଇଥିବା କାର୍ଯ୍ୟଦିବସ · %3\$d ସମ୍ପୂର୍ଣ୍ଣ କାମ"
    override val progressToFormat = "%1\$s ବ୍ୟାଜ୍ ପ୍ରଗତି: %2\$d / %3\$d ଦିନ"
    override val badgeAntiAbuseNote = "ବ୍ୟାଜ୍ କେବଳ ପ୍ରକୃତ ସମ୍ପୂର୍ଣ୍ଣ କାମ, ଯାଞ୍ଚ ଉପସ୍ଥିତି ଓ ନିରପେକ୍ଷ ରେଟିଂରୁ ସ୍ୱୟଂଚାଳିତ ଭାବେ ମିଳେ — କିଣାଯାଏ ନାହିଁ।"
    override val badgeTiersTitle = "୫ଟି ସ୍ୱୟଂଚାଳିତ ବ୍ୟାଜ୍ ସ୍ତର"
    override val minWorkdaysFormat = "ସର୍ବନିମ୍ନ %1\$d କାର୍ଯ୍ୟଦିବସ · ସର୍ବନିମ୍ନ %2\$.1f★ ରେଟିଂ"
    override val badgeAppealsNote = "ନ୍ୟାୟ ସୁରକ୍ଷା: ହଠାତ୍ ସନ୍ଦେହଜନକ ୧-ଷ୍ଟାର୍ ରେଟିଂ ଅପିଲ୍ ମାଧ୍ୟମରେ ସମୀକ୍ଷା ହୁଏ।"
    override val loyaltyTitle = "ବରିଷ୍ଠତା ଓ ବିଶ୍ୱସ୍ତତା ଆର୍ଥିକ ସହାୟତା"
    override val loyaltySubtitle = "ସ୍ୱଚ୍ଛ ତ୍ରୈମାସିକ କଲ୍ୟାଣ ଓ ମାଇଲଖୁଣ୍ଟ ବୋନସ୍"
    override val loyaltyDisclaimer = "ବାଧ୍ୟତାମୂଳକ ସୂଚନା: ଏହା ବୀମା ନୁହେଁ କିମ୍ବା ନିଶ୍ଚିତ ମାସିକ ପେନସନ୍ ନୁହେଁ। ଯୋଗ୍ୟତା, କାର୍ଯ୍ୟଦିବସ, ବଜେଟ୍ ଓ ଅନୁମୋଦନ ଉପରେ ନିର୍ଭରଶୀଳ।"
    override val loyaltyMinMembershipFormat = "ସର୍ବନିମ୍ନ ସଦସ୍ୟତା: %1\$d ମାସ"
    override val loyaltyWorkdaysFormat = "ଯାଞ୍ଚ ହୋଇଥିବା କାର୍ଯ୍ୟଦିବସ: %1\$d+ ଦିନ"
    override val loyaltyRequiredBadgeFormat = "ଆବଶ୍ୟକ ବ୍ୟାଜ୍: %1\$s+"
    override val loyaltyRequiredRatingFormat = "ସର୍ବନିମ୍ନ ରେଟିଂ: %1\$.1f★"
    override val loyaltyBudgetFormat = "ଅନୁମୋଦିତ ସହାୟତା: ₹%1\$d · ବଜେଟ୍: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "ଶ୍ରମିକ ସୁରକ୍ଷା ଓ ଜରୁରୀକାଳୀନ ସହାୟତା"
    override val callEmergency112 = "ଜରୁରୀ ୧୧୨ କୁ କଲ୍ କରନ୍ତୁ"
    override val weeklyCheckInTitle = "ସାପ୍ତାହିକ ସୁରକ୍ଷା ଯାଞ୍ଚ"
    override val weeklyCheckInQuestion = "ଆପଣ ସୁରକ୍ଷିତ ଅଛନ୍ତି କି?"
    override val checkInOpt1 = "୧ · ମୁଁ ସୁରକ୍ଷିତ ଅଛି"
    override val checkInOpt2 = "୨ · ମୋର ଅସୁବିଧା ଅଛି"
    override val checkInOpt3 = "୩ · LOBORO ଆଡମିନ୍ ସହ କଥା ହୁଅନ୍ତୁ"
    override val reportSafetyIssue = "ସୁରକ୍ଷା / ମଜୁରୀ ଅଭିଯୋଗ ଦିଅନ୍ତୁ"
    override val safetyOperationalNote = "କାମ ପୋଷ୍ଟ ବା ପେମେଣ୍ଟ ବନ୍ଦ ଥିଲେ ମଧ୍ୟ ସୁରକ୍ଷା ସେବା ସର୍ବଦା ଚାଲୁ ରହେ।"
    override val safetyDisclaimerNote = "ତତ୍କାଳ ବିପଦରେ ସିଧା ୧୧୨ କୁ କଲ୍ କରନ୍ତୁ। ନିରପେକ୍ଷ ମଧ୍ୟସ୍ଥତା ପାଇଁ LOBORO ଅଭିଯୋଗ ଲିପିବଦ୍ଧ କରେ।"
    override val everyDaysFormat = "ପ୍ରତି %1\$d ଦିନରେ"
    override val lastStatusFormat = "ଶେଷ ଯାଞ୍ଚ: %1\$s"
    override val checkInNoResponseNote = "ଲଗାତାର ୨ଟି ଯାଞ୍ଚ ଛାଡ଼ିଲେ କିମ୍ବା ଅସୁବିଧା ବାଛିଲେ LOBORO SMS, ଆଡମିନ୍ ଯାଞ୍ଚ ଓ ସମ୍ମତିରେ ପରିବାରକୁ ଜଣାଏ।"
    override val consentEmergencyTitle = "ସମ୍ମତିଭିତ୍ତିକ ଜରୁରୀ ଅବସ୍ଥାନ ଓ ପରିବାର ଯୋଗାଯୋଗ"
    override val workerIdLabel = "ଶ୍ରମିକ ID: %1\$s"
    override val homeOriginLabel = "ମୂଳ ଠିକଣା: %1\$s, %2\$s"
    override val currentJobCityLabel = "ବର୍ତ୍ତମାନ କାମ ସହର: %1\$s"
    override val emergencyContactLabel = "ଜରୁରୀ ଯୋଗାଯୋଗ: %1\$s (%2\$s)"
    override val consentGranted = "ସମ୍ମତି ପ୍ରଦତ୍ତ"
    override val consentPending = "ସମ୍ମତି ବାକି"
    override val employerLoboroIdInput = "ନିଯୁକ୍ତିଦାତା LOBORO ID (ଯେପରି LB819)"
    override val currentSiteInput = "ବର୍ତ୍ତମାନ କାମ ସହର / ସ୍ଥାନ"
    override val describeIssueInput = "ସୁରକ୍ଷା କିମ୍ବା ମଜୁରୀ ସମସ୍ୟା ଲେଖନ୍ତୁ"
    override val submitSafetyDeskButton = "ସୁରକ୍ଷା ଡେସ୍କକୁ ପଠାନ୍ତୁ"
    override val safetyCasesHeading = "ସାମ୍ପ୍ରତିକ ସୁରକ୍ଷା ମାମଲା (ଅଡିଟ୍ ଯୋଗ୍ୟ)"
    override val ivrTitle = "କିପ୍ୟାଡ୍ ଫୋନ୍ ମିସ୍ଡ-କଲ୍ ଓ IVR ମେନୁ"
    override val ivrSubtitle = "ସ୍ମାର୍ଟଫୋନ୍ ବିନା ଟୋଲ୍-ଫ୍ରି / ମିସ୍ଡ-କଲ୍ କଲବ୍ୟାକ୍ ମାଧ୍ୟମରେ କାମ କରେ"
    override val ivrArchNote = "ଲାଇଭ୍ ସିଷ୍ଟମ୍ Exotel / Knowlarity / Twilio Voice ସହ ଯୋଡ଼େ। ୧୨-ଭାଷା ଭଏସ୍ ମେନୁ ପରୀକ୍ଷା କରିବାକୁ ଦବାନ୍ତୁ।"
    override val ivrMenuTitle = "LOBORO ଭଏସ୍ IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO କୁ ସ୍ୱାଗତ! ଭଏସ୍ ମେନୁ ଶୁଣିବାକୁ କିପ୍ୟାଡ୍ ନମ୍ବର ଦବାନ୍ତୁ।"
    override val pressKeyFormat = "%1\$s ଦବାନ୍ତୁ → %2\$s"
    override val ivrSelectedSummaryFormat = "ବଚ୍ଛିତ [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "ଆଜିର ଦୈନିକ ମଜୁରୀ କାମ",
        "2" to "ମାସିକ ଦରମା କାମ",
        "3" to "ସାପ୍ତାହିକ ସୁରକ୍ଷା ଯାଞ୍ଚ ('ଆପଣ ସୁରକ୍ଷିତ କି?')",
        "4" to "ୱାଲେଟ୍ କଏନ୍ ଓ ନୂଆ ସ୍ଥିତି ଶୁଣନ୍ତୁ",
        "5" to "ଜରୁରୀ ଆଡମିନ୍ କଲବ୍ୟାକ୍",
        "6" to "ଆବେଦନ ସ୍ଥିତି ଯାଞ୍ଚ କରନ୍ତୁ",
        "0" to "ପସନ୍ଦର ଭଏସ୍ ଭାଷା ବଦଳାନ୍ତୁ"
    )

    override val userRegTitle = "ଶ୍ରମିକ ଓ ନିଯୁକ୍ତିଦାତା ପଞ୍ଜୀକରଣ"
    override val userLoginTitle = "ଶ୍ରମିକ ଓ ନିଯୁକ୍ତିଦାତା ଲଗ୍ ଇନ୍"
    override val userAuthSubtitle = "OTP-ଯାଞ୍ଚ ହୋଇଥିବା ସାଧାରଣ ଖାତା · ଗୁପ୍ତ ମାଲିକ ବ୍ୟବସ୍ଥାଠାରୁ ସମ୍ପୂର୍ଣ୍ଣ ଅଲଗା"
    override val registerTab = "ପଞ୍ଜୀକରଣ"
    override val loginTab = "ଲଗ୍ ଇନ୍"
    override val dbOtpNotConnectedTitle = "ବ୍ୟାକଏଣ୍ଡ ଡାଟାବେସ୍ / OTP ସଂଯୁକ୍ତ ନୁହେଁ"
    override val dbOtpNotConnectedBody = "ପ୍ରକୃତ ଶ୍ରମିକ ଓ ନିଯୁକ୍ତିଦାତା ଖାତା ସଞ୍ଚୟ କରିବାକୁ LOBORO_BACKEND_URL ଯୋଡ଼ନ୍ତୁ।"
    override val selectAccountTypeStep = "୧. ଖାତା ପ୍ରକାର ବାଛନ୍ତୁ"
    override val workerAccountLabel = "ଶ୍ରମିକ"
    override val employerAccountLabel = "ନିଯୁକ୍ତିଦାତା"
    override val regPausedForRoleFormat = "%1\$s ପଞ୍ଜୀକରଣ ବର୍ତ୍ତମାନ ମାଲିକଙ୍କ ଦ୍ୱାରା ସ୍ଥଗିତ ଅଛି।"
    override val preferredLanguageLabel = "ପସନ୍ଦର ଆପ୍ ଭାଷା (୧୨ଟି ଭାଷା)"
    override val fullNameStepLabel = "୨. ସମ୍ପୂର୍ଣ୍ଣ ନାମ *"
    override val businessNameStepLabel = "୨. ବ୍ୟବସାୟ / ଠିକାଦାରଙ୍କ ସମ୍ପୂର୍ଣ୍ଣ ନାମ *"
    override val mobileStepLabel = "୩. ମୋବାଇଲ୍ ନମ୍ବର (୧୦ ଅଙ୍କ) *"
    override val sendRegOtpButton = "OTP ପଠାନ୍ତୁ"
    override val resendMobileOtpButton = "ପୁଣି OTP ପଠାନ୍ତୁ"
    override val enterOtpStepLabel = "୪. ମୋବାଇଲ୍ OTP ଦିଅନ୍ତୁ *"
    override val verifyOtpButton = "OTP ଯାଞ୍ଚ କରନ୍ତୁ"
    override val verifiedLabel = "ଯାଞ୍ଚ ହୋଇଛି"
    override val mobileVerifiedNote = "ସର୍ଭରରେ ମୋବାଇଲ୍ ଯାଞ୍ଚ ହେଲା"
    override val homeStateLabel = "ମୂଳ ରାଜ୍ୟ"
    override val homeDistrictLabel = "ମୂଳ ଜିଲ୍ଲା"
    override val stateShortLabel = "ରାଜ୍ୟ"
    override val cityShortLabel = "ସହର"
    override val workCityStateLabel = "ବର୍ତ୍ତମାନ କାମ ସହର ଓ ରାଜ୍ୟ"
    override val businessLocationLabel = "ବ୍ୟବସାୟ ସହର ଓ ରାଜ୍ୟ"
    override val skillsCategoriesLabel = "ଦକ୍ଷତା / କାମ (ଯେପରି ରାଜମିସ୍ତ୍ରୀ, ଇଲେକ୍ଟ୍ରିସିଆନ୍)"
    override val hiringCategoriesLabel = "ନିଯୁକ୍ତି ଶ୍ରେଣୀ"
    override val emergencyContactNameLabel = "ଜରୁରୀ ପରିବାର ଯୋଗାଯୋଗ ନାମ"
    override val emergencyContactPhoneLabel = "ଜରୁରୀ ଯୋଗାଯୋଗ ଫୋନ୍"
    override val uniqueLbIdNotice = "ସମ୍ପୂର୍ଣ୍ଣ ହେଲେ ସର୍ଭର ସ୍ଥାୟୀ LB ID (LB2000+) ଦେବ। VIP ଓ ମାଲିକ ନମ୍ବର ସୁରକ୍ଷିତ ରହେ।"
    override val creatingProfileLabel = "ପ୍ରୋଫାଇଲ୍ ତିଆରି ହେଉଛି..."
    override val createProfileButton = "ଶ୍ରମିକ / ନିଯୁକ୍ତିଦାତା ପ୍ରୋଫାଇଲ୍ ତିଆରି କରନ୍ତୁ"
    override val loginHeading = "ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍ OTP ଦ୍ୱାରା ଲଗ୍ ଇନ୍ କରନ୍ତୁ"
    override val loginSubtitle = "ଶ୍ରମିକ ବା ନିଯୁକ୍ତିଦାତା ଭାବେ ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍ ନମ୍ବର ଦିଅନ୍ତୁ।"
    override val registeredMobileLabel = "ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍ ନମ୍ବର"
    override val sendLoginOtpButton = "ଲଗ୍ ଇନ୍ OTP ପଠାନ୍ତୁ"
    override val resendLoginOtpButton = "OTP ପୁଣି ପଠାନ୍ତୁ"
    override val enterLoginOtpLabel = "ଲଗ୍ ଇନ୍ OTP ଦିଅନ୍ତୁ"
    override val verifyingOtpLabel = "ଯାଞ୍ଚ ହେଉଛି..."
    override val verifyOtpOpenHomeButton = "OTP ଯାଞ୍ଚ କରି ହୋମ୍ ଖୋଲନ୍ତୁ"
    override val backToHomepageButton = "ହୋମପେଜକୁ ଫେରନ୍ତୁ"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "ଭୂମିକା"
    override val offlinePreviewHeading = "ଅଫଲାଇନ୍ ପ୍ରୋଫାଇଲ୍ ଓ ଫଟୋ ପ୍ରିଭ୍ୟୁ"
    override val offlinePreviewCardTitle = "ପ୍ରୋଫାଇଲ୍ ତିଆରି / ସମ୍ପାଦନ (ଅଫଲାଇନ୍ ପ୍ରିଭ୍ୟୁ)"
    override val offlinePreviewCardSubtitle = "ଲାଇଭ୍ ଡାଟାବେସ୍ ଯୋଡ଼ା ହେବା ପର୍ଯ୍ୟନ୍ତ ସ୍ଥାନୀୟ ପ୍ରିଭ୍ୟୁ ଭାବେ ସଞ୍ଚିତ ହୁଏ।"
    override val workLocationLabel = "କାମ ସ୍ଥାନ (ସହର, ରାଜ୍ୟ)"
    override val businessAddressLabel = "ବ୍ୟବସାୟ ସହର, ରାଜ୍ୟ"
    override val skillsExpLabel = "ଦକ୍ଷତା / କାମ ପ୍ରକାର"
    override val businessCatLabel = "ବ୍ୟବସାୟ ପ୍ରକାର / ନିଯୁକ୍ତି ଶ୍ରେଣୀ"
    override val aadhaarPrivacyNote = "ତଥ୍ୟ ସୁରକ୍ଷା: LOBORO ଡିଭାଇସ୍‌ରେ ଆଧାର ଚିତ୍ର ରଖେ ନାହିଁ — କେବଳ ଯାଞ୍ଚ ହ୍ୟାସ୍ ଓ ସମ୍ମତି ରଖେ।"
    override val selectProfilePhotoBtn = "ପ୍ରୋଫାଇଲ୍ ଫଟୋ ବାଛନ୍ତୁ (ଫଟୋ ପିକର୍)"
    override val photoSelectedBtn = "ଫଟୋ ବଛାଗଲା ✓"
    override val offlineConsentCheck = "ସୁରକ୍ଷା ଯାଞ୍ଚ ଓ ଯୋଗାଯୋଗ ନହେଲେ ପରିବାରକୁ ଜରୁରୀ ଖବର ପଠାଇବାକୁ ମୁଁ ସମ୍ମତି ଦେଉଛି।"
    override val previewProfileBtn = "ପ୍ରିଭ୍ୟୁ ପ୍ରୋଫାଇଲ୍ ସେଭ୍ କରନ୍ତୁ"
    override val audienceScopeFormat = "ବ୍ୟବହାରକାରୀ: %1\$s · ଅଞ୍ଚଳ: %2\$s · %3\$s"
    override val settingsHeading = "ସେଟିଂସ୍ ଓ ପ୍ଲାଟଫର୍ମ ସୂଚନା"
    override val languageSectionTitle = "ଆପ୍ ଭାଷା (ସମସ୍ତ ୧୨ଟି ଭାରତୀୟ ଭାଷା)"
    override val languageSectionSubtitle = "ଆପଣଙ୍କ ସକ୍ରିୟ ଖାତା ପାଇଁ ଅଲଗା ସଞ୍ଚିତ ହୁଏ। ଅନ୍ୟ ଖାତାର ଭାଷା ବଦଳେ ନାହିଁ।"
    override val languagePausedByOwner = "ମାଲିକ ନିୟନ୍ତ୍ରଣ ଦ୍ୱାରା ଭାଷା ପରିବର୍ତ୍ତନ ଅସ୍ଥାୟୀ ବନ୍ଦ ଅଛି।"
    override val lowDataTitle = "ଲୋ-ଡାଟା ମୋଡ୍"
    override val lowDataSubtitle = "୨ଜି/୩ଜି ଗ୍ରାମୀଣ ନେଟୱାର୍କରେ ମୋବାଇଲ୍ ଡାଟା ବଞ୍ଚାଏ"
    override val reducedMotionTitle = "କମ୍ ଆନିମେସନ୍ ଓ ସ୍ପଷ୍ଟ ଦୃଶ୍ୟ"
    override val reducedMotionSubtitle = "ସ୍ପଷ୍ଟ ଅକ୍ଷର ଓ ସରଳ ସ୍କ୍ରିନ୍ ଗତି"
    override val privacyPolicyTitle = "ଗୋପନୀୟତା ନୀତି ଓ ତଥ୍ୟ ସୁରକ୍ଷା"
    override val privacyPolicyBody = "• ଆପଣଙ୍କ ଅନୁମତି ବିନା ଚାଟ୍‌ରେ ଫୋନ୍ ନମ୍ବର ଗୁପ୍ତ ରହେ।\n• ଭଏସ୍ ସନ୍ଧାନ ବଟନ୍ ଦବାଇଲେ ହିଁ ମାଇକ୍ ଚାଲୁ ହୁଏ।\n• ଫଟୋ ବାଛିବାକୁ ସୁରକ୍ଷିତ ଆଣ୍ଡ୍ରଏଡ୍ ଫଟୋ ପିକର୍ ବ୍ୟବହୃତ ହୁଏ।\n• କେବଳ ଆପଣଙ୍କ ସମ୍ମତିରେ ପରିବାରକୁ ଜରୁରୀ ଅବସ୍ଥାନ ପଠାଯାଏ।"
    override val termsOfServiceTitle = "ସେବା ସର୍ତ୍ତାବଳୀ ଓ ନ୍ୟାୟ ନିୟମ"
    override val termsOfServiceBody = "• ଦୈନିକ ମଜୁରୀ ଓ ମାସିକ ଦରମା କାମ ପୃଥକ୍ ରଖାଯାଇଛି।\n• ପ୍ରତ୍ୟେକ LOBORO କଏନ୍ ୧୦୦% ସମାନ ନଗଦ ମୂଲ୍ୟ ଓ ଉଠାଣଯୋଗ୍ୟ।\n• ବ୍ୟାଜ୍ କେବଳ ପ୍ରକୃତ କାର୍ଯ୍ୟଦିବସ ଓ ନ୍ୟାୟ ରେଟିଂ ଦ୍ୱାରା ମିଳେ।\n• VIP ID (LB1–LB1999) କେବଳ ମାଲିକଙ୍କ ପାଇଁ ସଂରକ୍ଷିତ।"
    override val helpSupportTitle = "ସାହାଯ୍ୟ, ସହାୟତା ଓ ସୁରକ୍ଷା ଡେସ୍କ"
    override val helpSupportBody = "• ତତ୍କାଳ ବିପଦରେ ୧୧୨ କୁ କଲ୍ କରନ୍ତୁ (ଲଗ୍ ଇନ୍ ବିନା ମଧ୍ୟ ୨୪x୭)।\n• ମଜୁରୀ କିମ୍ବା ରହିବା ସମସ୍ୟା ପାଇଁ ସାହାଯ୍ୟ ଓ ସୁରକ୍ଷା ଡେସ୍କରେ ମାମଲା ଦିଅନ୍ତୁ।\n• କିପ୍ୟାଡ୍ ଫୋନ୍‌ରେ ଟୋଲ୍-ଫ୍ରି କଲବ୍ୟାକ୍ ପାଇଁ କିପ୍ୟାଡ୍ ଓ IVR ଖୋଲନ୍ତୁ।"
    override val backendChecklistTitle = "ବ୍ୟାକଏଣ୍ଡ ଓ API ସଂଯୋଗ ସ୍ଥିତି"
    override val providersLabel = "ପ୍ରଦାନକାରୀ: %1\$s"
    override val secretsLabel = "ସିକ୍ରେଟ୍ କି: %1\$s"

    override val ownerSetupTitle = "ଥରେ ମାତ୍ର ମାଲିକ / ସୁପର ଆଡମିନ୍ ସେଟଅପ୍"
    override val ownerSetupSubtitle = "କେବଳ LOBORO ନିର୍ମାତାଙ୍କ ପାଇଁ। ଥରେ ପଞ୍ଜୀକରଣ ପରେ ଚିରଦିନ ପାଇଁ ଲକ୍ ହୋଇଯାଏ।"
    override val ownerSetupLockNote = "ସୁରକ୍ଷା ଲକ୍: କେବଳ ଗୋଟିଏ ମାଲିକ ଖାତା ସୃଷ୍ଟି ହୋଇପାରିବ। କୌଣସି ଶ୍ରମିକ ବା ନିଯୁକ୍ତିଦାତା ଏହା ବ୍ୟବହାର କରିପାରିବେ ନାହିଁ।"
    override val ownerBackendReqTitle = "ମାଲିକ ସର୍ଭର ସଂଯୁକ୍ତ ନୁହେଁ"
    override val ownerBackendReqBody = "ପାସୱାର୍ଡ ଓ ୪-ଅଙ୍କ PIN ସର୍ଭରରେ ସୁରକ୍ଷିତ ରଖିବାକୁ LOBORO_BACKEND_URL ସେଟ୍ କରନ୍ତୁ।"
    override val serverSetupAuthHeading = "୧. ସର୍ଭର ସେଟଅପ୍ ଅନୁମତି"
    override val bootstrapSecretLabel = "ୱାନ୍-ଟାଇମ୍ ସର୍ଭର ବୁଟଷ୍ଟ୍ରାପ୍ କୋଡ୍ *"
    override val bootstrapSecretPlaceholder = "ଆପଣଙ୍କ ସର୍ଭର OWNER_BOOTSTRAP_SECRET ରୁ"
    override val ownerIdentityHeading = "୨. ମାଲିକ ପରିଚୟ ଓ ମୋବାଇଲ୍ OTP"
    override val ownerNameField = "ମାଲିକଙ୍କ ସମ୍ପୂର୍ଣ୍ଣ ନାମ *"
    override val ownerMobileField = "ମାଲିକଙ୍କ ବ୍ୟକ୍ତିଗତ ମୋବାଇଲ୍ ନମ୍ବର *"
    override val ownerSendOtpBtn = "ମାଲିକ OTP ପଠାନ୍ତୁ"
    override val ownerMobileVerifiedNote = "ମାଲିକ ମୋବାଇଲ୍ OTP ଯାଞ୍ଚ ହେଲା"
    override val credentialsHeading = "୩. ପାସୱାର୍ଡ ଓ ୪-ଅଙ୍କ ଆଡମିନ୍ PIN"
    override val createPasswordLabel = "ଲଗ୍ ଇନ୍ ପାସୱାର୍ଡ ତିଆରି କରନ୍ତୁ (୮+ ଅକ୍ଷର) *"
    override val confirmPasswordLabel = "ଲଗ୍ ଇନ୍ ପାସୱାର୍ଡ ନିଶ୍ଚିତ କରନ୍ତୁ *"
    override val passwordsMismatchError = "ପାସୱାର୍ଡ ମେଳ ଖାଉନାହିଁ"
    override val createPinLabel = "୪-ଅଙ୍କ ଆଡମିନ୍ PIN ତିଆରି କରନ୍ତୁ *"
    override val confirmPinLabel = "୪-ଅଙ୍କ ଆଡମିନ୍ PIN ନିଶ୍ଚିତ କରନ୍ତୁ *"
    override val pinsMismatchError = "PIN ମେଳ ଖାଉନାହିଁ"
    override val credentialsHashNote = "ସର୍ଭର Argon2id ଦ୍ୱାରା ପାସୱାର୍ଡ ଓ PIN ସୁରକ୍ଷିତ କରେ। ଆପ୍‌ରେ ସଞ୍ଚିତ ହୁଏ ନାହିଁ।"
    override val registeringOwnerLabel = "ମାଲିକ ଖାତା ତିଆରି ହେଉଛି..."
    override val completeOwnerRegButton = "ମାଲିକ ପଞ୍ଜୀକରଣ ସମ୍ପୂର୍ଣ୍ଣ କରି ଡ୍ୟାସବୋର୍ଡ ଖୋଲନ୍ତୁ"
    override val returnToAppButton = "LOBORO ଆପ୍‌କୁ ଫେରନ୍ତୁ"
    override val adminPinHeader = "ମାଲିକ ନିୟନ୍ତ୍ରଣ · ୪-ଅଙ୍କ PIN ଆବଶ୍ୟକ"
    override val adminPinPrompt = "ଆପଣଙ୍କ ୪-ଅଙ୍କ ମାଲିକ ଆଡମିନ୍ PIN ଦିଅନ୍ତୁ। ସର୍ଭରରେ ସୀମା ସହ ଯାଞ୍ଚ ହୁଏ।"
    override val pinLockoutFormat = "ଅଧିକ ଭୁଲ୍ ଚେଷ୍ଟା। %1\$d ସେକେଣ୍ଡ ପରେ ପୁଣି ଚେଷ୍ଟା କରନ୍ତୁ।"
    override val clrKeyLabel = "ସଫା"
    override val verifyPinServerBtn = "ସର୍ଭରରେ ୪-ଅଙ୍କ PIN ଯାଞ୍ଚ କରନ୍ତୁ"
    override val pinSecurityPolicyFormat = "୫ଟି ଭୁଲ୍ ଚେଷ୍ଟାରେ ଲକ୍ · ୫ ମିନିଟ୍ ନିଷ୍କ୍ରିୟତାରେ ଲଗଆଉଟ୍ · ବାକି ଚେଷ୍ଟା: %1\$d"
    override val ownerMasterControlTitle = "ମାଲିକ ମାଷ୍ଟର କଣ୍ଟ୍ରୋଲ୍"
    override val ownerMasterSubtitle = "କେବଳ ମାଲିକ ସୁପର ଆଡମିନ୍ · ସର୍ଭର PIN + OTP + ଅଡିଟ୍ ଲଗ୍"
    override val ownerSessionLockedNote = "ମାଲିକ ସେସନ୍ ଲକ୍ ଅଛି। ମାଷ୍ଟର କଣ୍ଟ୍ରୋଲ୍ ଖୋଲିବାକୁ ସର୍ଭର-ଯାଞ୍ଚ ୪-ଅଙ୍କ PIN ଆବଶ୍ୟକ।"
    override val verifyOwnerPinBtn = "ମାଲିକ ୪-ଅଙ୍କ PIN ଯାଞ୍ଚ କରନ୍ତୁ"
    override val ownerProfileLineFormat = "ମାଲିକ ପ୍ରୋଫାଇଲ୍ · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍: %1\$s · ଏକମାତ୍ର ମାଲିକ ଖାତା (%2\$s)"
    override val activeSessionFormat = "ସକ୍ରିୟ ମାଲିକ ସେସନ୍ · %1\$dm %2\$02ds ରେ ଲଗଆଉଟ୍"
    override val serverAuthorityNote = "ସେସନ୍ ଟୋକେନ୍ ଯାଞ୍ଚ ହୋଇଛି (ସର୍ଭର ଅଧିକାର)"
    override val lockAndExitBtn = "ଲକ୍ କରି ବାହାରନ୍ତୁ"
    override val mandatoryProtectionTitle = "ବାଧ୍ୟତାମୂଳକ ସୁରକ୍ଷା ଓ ଆର୍ଥିକ ଦାୟିତ୍ୱ ସୁରକ୍ଷା"
    override val mandatoryProtectionBody = "ସୁବିଧା ବନ୍ଦ କଲେ ବା ରକ୍ଷଣାବେକ୍ଷଣ ମୋଡ୍ ଲଗାଇଲେ ଚାଲୁଥିବା ଆର୍ଥିକ ଦାୟିତ୍ୱ, ରିଫଣ୍ଡ ଓ ୧୧୨ ଜରୁରୀ ସେବା ବାତିଲ୍ ହୁଏ ନାହିଁ।"
    override val changePinTitle = "ଆଡମିନ୍ PIN ବଦଳାନ୍ତୁ (OTP ଯାଞ୍ଚ ବାଧ୍ୟତାମୂଳକ)"
    override val changePinSubtitle = "କେବଳ ମାଲିକଙ୍କ ପାଇଁ। ବର୍ତ୍ତମାନ PIN କେବେ ଦେଖାଯାଏ ନାହିଁ। ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍ OTP ବାଧ୍ୟତାମୂଳକ।"
    override val otpToRegisteredMobileNote = "OTP କେବଳ ପଞ୍ଜୀକୃତ ମାଲିକ ମୋବାଇଲ୍‌କୁ ପଠାଯିବ: %1\$s"
    override val sendPinChangeOtpBtn = "ପଞ୍ଜୀକୃତ ମାଲିକ ମୋବାଇଲ୍‌କୁ OTP ପଠାନ୍ତୁ"
    override val otpDispatchedNote = "ମାଲିକଙ୍କ ମୋବାଇଲ୍ (%1\$s) କୁ OTP ପଠାଗଲା।"
    override val enterServerOtpLabel = "ସର୍ଭର OTP କୋଡ୍ ଦିଅନ୍ତୁ"
    override val verifyOtpServerBtn = "ସର୍ଭରରେ OTP ଯାଞ୍ଚ କରନ୍ତୁ"
    override val otpVerifiedNewPinNote = "OTP ଯାଞ୍ଚ ହେଲା। ଏବେ ନୂଆ ୪-ଅଙ୍କ ମାଲିକ PIN ଦିଅନ୍ତୁ ଓ ନିଶ୍ଚିତ କରନ୍ତୁ।"
    override val newPinLabel = "ନୂଆ ୪-ଅଙ୍କ PIN"
    override val confirmNewPinLabel = "ନୂଆ ୪-ଅଙ୍କ PIN ନିଶ୍ଚିତ କରନ୍ତୁ"
    override val saveNewPinBtn = "ନିଶ୍ଚିତ କରି ଆଡମିନ୍ PIN ଅପଡେଟ୍ କରନ୍ତୁ"
    override val confirmPinChangeTitle = "ଆଡମିନ୍ PIN ପରିବର୍ତ୍ତନ ନିଶ୍ଚିତ କରନ୍ତୁ"
    override val confirmPinChangeDesc = "ସର୍ଭରରେ ୪-ଅଙ୍କ ମାଲିକ PIN ବଦଳାଇବେ କି? ସେସନ୍ ଚାଲୁ ରହିବ ଓ ଅଡିଟ୍ ଲଗ୍ ଲିପିବଦ୍ଧ ହେବ।"
    override val pinUpdatedNote = "ନୂଆ ୪-ଅଙ୍କ ମାଲିକ PIN ସର୍ଭରରେ ଅପଡେଟ୍ ହେଲା।"
    override val completeMasterControlTitle = "ସମ୍ପୂର୍ଣ୍ଣ ମାଲିକ ମାଷ୍ଟର କଣ୍ଟ୍ରୋଲ୍ (୨୫ଟି ମଡ୍ୟୁଲ୍)"
    override val masterControlScopeSubtitle = "ଅଞ୍ଚଳ କିମ୍ବା ବ୍ୟବହାରକାରୀ ଭୂମିକା ଅନୁସାରେ ତତ୍କାଳ ON/OFF ନିୟନ୍ତ୍ରଣ।"
    override val scopeOptions = listOf(
        "ବିଶ୍ୱସ୍ତରୀୟ · ଭାରତ (ସମସ୍ତ ରାଜ୍ୟ)",
        "କେବଳ ତେଲେଙ୍ଗାନା",
        "କେବଳ ତାମିଲନାଡୁ",
        "କେବଳ ଶ୍ରମିକ",
        "କେବଳ ନିଯୁକ୍ତିଦାତା"
    )
    override val masterControlNames = listOf(
        "୧. ସମ୍ପୂର୍ଣ୍ଣ ଆପ୍ ଓ ରକ୍ଷଣାବେକ୍ଷଣ ମୋଡ୍",
        "୨. ଶ୍ରମିକ ପଞ୍ଜୀକରଣ",
        "୩. ନିଯୁକ୍ତିଦାତା ପଞ୍ଜୀକରଣ",
        "୪. କାମ ପୋଷ୍ଟ କରିବା",
        "୫. କାମ ଖୋଜ",
        "୬. ଦୈନିକ ମଜୁରୀ କାମ",
        "୭. ମାସିକ ଦରମା କାମ",
        "୮. କଏନ୍ କିଣାକିଣି",
        "୯. ୱାଲେଟ୍ ଟଙ୍କା ଉଠାଣ",
        "୧୦. ଜବ୍ ଫି ଓ କଏନ୍ ମୂଲ୍ୟ",
        "୧୧. ଅଫର୍ ଓ ପ୍ରମୋସନ୍",
        "୧୨. ରେଫରାଲ୍ ପୁରସ୍କାର",
        "୧୩. ସୂଚନା ଓ ଘୋଷଣା",
        "୧୪. ଶ୍ରମିକ ଓ ନିଯୁକ୍ତିଦାତା ଖାତା ନିୟନ୍ତ୍ରଣ",
        "୧୫. କାମ ଶ୍ରେଣୀ ଓ ଉପଶ୍ରେଣୀ",
        "୧୬. ରେଟିଂ ଓ ସ୍ୱୟଂଚାଳିତ ବ୍ୟାଜ୍",
        "୧୭. ବରିଷ୍ଠତା ଓ ବିଶ୍ୱସ୍ତତା ସହାୟତା",
        "୧୮. ଜରୁରୀ ଓ ଶ୍ରମିକ ସୁରକ୍ଷା ବ୍ୟବସ୍ଥା",
        "୧୯. SMS ସତର୍କତା",
        "୨୦. IVR ସେବା",
        "୨୧. ଭାଷା ସେଟିଂସ୍ (୧୨ଟି ଭାଷା)",
        "୨୨. ଦେଶ, ରାଜ୍ୟ ଓ ସହର ଉପଲବ୍ଧତା",
        "୨୩. VIP ID ସଂରକ୍ଷଣ ଓ ପରିଚାଳନା",
        "୨୪. ରିପୋର୍ଟ, ଅଭିଯୋଗ ଓ ନିୟନ୍ତ୍ରଣ",
        "୨୫. ପେମେଣ୍ଟ ଗେଟୱେ ସଂଯୋଗ"
    )
    override val publishNoticeTitle = "ଲାଲ୍ LOBORO ଆଡମିନ୍ ସୂଚନା ପ୍ରକାଶ କରନ୍ତୁ"
    override val announcementMessageLabel = "ଘୋଷଣା ବାର୍ତ୍ତା"
    override val announcementPlaceholder = "ଯେପରି: ଅନ୍ୟ ରାଜ୍ୟ ଶ୍ରମିକଙ୍କ ପାଇଁ ନୂଆ ସୁରକ୍ଷା ହେଲ୍ପଲାଇନ୍"
    override val actionLinkLabel = "ବଟନ୍ ନାମ"
    override val scopeFieldLabel = "ଅଞ୍ଚଳ / ରାଜ୍ୟ ପରିସୀମା"
    override val audienceOptions = listOf("ସମସ୍ତ ବ୍ୟବହାରକାରୀ", "ଶ୍ରମିକ", "ନିଯୁକ୍ତିଦାତା")
    override val broadcastNoticeBtn = "ଲାଲ୍ ଆଡମିନ୍ ସୂଚନା ପ୍ରସାରଣ କରନ୍ତୁ"
    override val confirmBroadcastTitle = "ଲାଲ୍ LOBORO ଆଡମିନ୍ ସୂଚନା ପଠାଇବେ କି?"
    override val confirmBroadcastDescFormat = "ବାର୍ତ୍ତା: %1\$s\nବ୍ୟବହାରକାରୀ: %2\$s · ଅଞ୍ଚଳ: %3\$s"
    override val coinPricingTitle = "କଏନ୍ ମୂଲ୍ୟ ଓ ଫି ନିୟନ୍ତ୍ରଣ"
    override val coinPricingSummaryFormat = "୧ କଏନ୍ = ₹%1\$d · ଦୈନିକ = %2\$d କଏନ୍ · ବିଶେଷ = %3\$d କଏନ୍ · ମାସିକ = %4\$d କଏନ୍ · ସମୟ: %5\$s"
    override val dailyBtnFormat = "ଦୈନିକ +୧ (%1\$d)"
    override val masonBtnFormat = "ବିଶେଷ +୧ (%1\$d)"
    override val monthlyBtnFormat = "ମାସିକ +୫ (%1\$d)"
    override val protectedVipIdsTitle = "ସୁରକ୍ଷିତ VIP ଓ ମାଲିକ ID (ସ୍ୱୟଂଚାଳିତ କେବେ ଦିଆଯାଏ ନାହିଁ)"
    override val protectedVipIdsNote = "ସାଧାରଣ ବ୍ୟବହାରକାରୀଙ୍କୁ ସର୍ବଦା LB2000+ ମିଳେ। ବିଶେଷ ନମ୍ବର କେବଳ ମାଲିକ ଆବଣ୍ଟନ ପାଇଁ ସଂରକ୍ଷିତ।"
    override val safetyInvestigationTitle = "ସୁରକ୍ଷା ମାମଲା ଓ ଅଭିଯୋଗ ତଦନ୍ତ ଡେସ୍କ"
    override val manageCategoriesTitle = "୨୪ଟି କାମ ଶ୍ରେଣୀ ପରିଚାଳନା (ତତ୍କାଳ ON/OFF)"
    override val showAll24Label = "ସମସ୍ତ ୨୪ ଦେଖାନ୍ତୁ"
    override val showLessLabel = "କମ୍ ଦେଖାନ୍ତୁ"
    override val auditLogTitle = "ମାଲିକ କାର୍ଯ୍ୟ ଅଡିଟ୍ ଲଗ୍"
    override val confirmToggleTitleFormat = "%1\$s ନିଶ୍ଚିତ କରନ୍ତୁ"
    override val confirmToggleDescFormat = "%3\$s ପାଇଁ \"%1\$s\" କୁ %2\$s କରିବେ କି? ଚାଲୁଥିବା ଆର୍ଥିକ ଦାୟିତ୍ୱ ଓ ୧୧୨ ସୁରକ୍ଷା ସେବା ସୁରକ୍ଷିତ ରହିବ।"

    override val categories = mapOf(
        JobCategoryId.MASON to "ରାଜମିସ୍ତ୍ରୀ / ମେସନ୍",
        JobCategoryId.CONSTRUCTION_LABOUR to "ନିର୍ମାଣ ଶ୍ରମିକ",
        JobCategoryId.GENERAL_LABOUR to "ସାଧାରଣ ଶ୍ରମିକ",
        JobCategoryId.PLUMBER to "ପ୍ଲମ୍ବର୍",
        JobCategoryId.ELECTRICIAN to "ଇଲେକ୍ଟ୍ରିସିଆନ୍",
        JobCategoryId.PAINTER to "ପେଣ୍ଟର୍ / ରଙ୍ଗମିସ୍ତ୍ରୀ",
        JobCategoryId.TILE_WORKER to "ଟାଇଲ୍ ମିସ୍ତ୍ରୀ",
        JobCategoryId.CARPENTER to "ବଢ଼େଇ / କାର୍ପେଣ୍ଟର୍",
        JobCategoryId.WELDER to "ୱେଲ୍ଡର୍",
        JobCategoryId.HOTEL_STAFF to "ହୋଟେଲ୍ କର୍ମଚାରୀ",
        JobCategoryId.COOK to "ରୋଷେୟା / କୁକ୍",
        JobCategoryId.WAITER to "ୱେଟର୍",
        JobCategoryId.HOUSEKEEPING to "ହାଉସକିପିଂ",
        JobCategoryId.SECURITY_GUARD to "ସୁରକ୍ଷା ରକ୍ଷୀ",
        JobCategoryId.DRIVER to "ଡ୍ରାଇଭର୍",
        JobCategoryId.DELIVERY_WORKER to "ଡେଲିଭରି କର୍ମଚାରୀ",
        JobCategoryId.FACTORY_WORKER to "କାରଖାନା ଶ୍ରମିକ",
        JobCategoryId.PACKING_WORKER to "ପ୍ୟାକିଂ କର୍ମଚାରୀ",
        JobCategoryId.MACHINE_OPERATOR to "ମେସିନ୍ ଅପରେଟର୍",
        JobCategoryId.AGRICULTURE_WORKER to "କୃଷି ଶ୍ରମିକ",
        JobCategoryId.OFFICE_ASSISTANT to "ଅଫିସ୍ ସହାୟକ",
        JobCategoryId.SHOP_STAFF to "ଦୋକାନ କର୍ମଚାରୀ",
        JobCategoryId.DOMESTIC_WORKER to "ଘରୋଇ ସହାୟକ",
        JobCategoryId.OTHER_JOBS to "ଅନ୍ୟାନ୍ୟ କାମ"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "ଶ୍ରମିକ",
        UserRole.EMPLOYER to "ନିଯୁକ୍ତିଦାତା",
        UserRole.OWNER_SUPER_ADMIN to "ମାଲିକ / ସୁପର ଆଡମିନ୍"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "ଆବେଦନ ହୋଇଛି",
        ApplicationStatus.UNDER_REVIEW to "ସମୀକ୍ଷାଧୀନ",
        ApplicationStatus.SHORTLISTED to "ତାଲିକାଭୁକ୍ତ",
        ApplicationStatus.ACCEPTED to "ଗୃହୀତ",
        ApplicationStatus.REJECTED to "ପ୍ରତ୍ୟାଖ୍ୟାତ",
        ApplicationStatus.WITHDRAWN to "ପ୍ରତ୍ୟାହାର",
        ApplicationStatus.COMPLETED to "ସମ୍ପୂର୍ଣ୍ଣ"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "ବାକି",
        TransactionStatus.SUCCESSFUL to "ସଫଳ",
        TransactionStatus.FAILED to "ବିଫଳ",
        TransactionStatus.REFUNDED to "ଫେରସ୍ତ"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "କଏନ୍ କ୍ରୟ",
        TransactionType.GIFT to "ଉପହାର କ୍ରେଡିଟ୍",
        TransactionType.PROMO to "ପ୍ରମୋ କ୍ରେଡିଟ୍",
        TransactionType.REFERRAL to "ରେଫରାଲ୍ ବୋନସ୍",
        TransactionType.BADGE_REWARD to "ବ୍ୟାଜ୍ ପୁରସ୍କାର",
        TransactionType.LOYALTY_SUPPORT to "ବିଶ୍ୱସ୍ତତା ସହାୟତା",
        TransactionType.JOB_FEE to "ଜବ୍ ଫି",
        TransactionType.WITHDRAWAL to "ଟଙ୍କା ଉଠାଣ"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "ବାକି ମଜୁରୀ",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "ଶାରୀରିକ ନିର୍ଯାତନା",
        SafetyComplaintCategory.HARASSMENT to "ହଇରାଣ",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "ଖାଦ୍ୟ / ରହିବା ସମସ୍ୟା",
        SafetyComplaintCategory.FRAUD to "କାମ ଠକେଇ",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "ଅସୁରକ୍ଷିତ କାର୍ଯ୍ୟସ୍ଥଳ",
        SafetyComplaintCategory.OTHER_EMERGENCY to "ଅନ୍ୟାନ୍ୟ ଜରୁରୀ"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "ନୂଆ",
        SafetyCaseStatus.IN_REVIEW to "ତଦନ୍ତାଧୀନ",
        SafetyCaseStatus.ADMIN_VERIFIED to "ଆଡମିନ୍ ଯାଞ୍ଚିତ",
        SafetyCaseStatus.ACTION_TAKEN to "କାର୍ଯ୍ୟାନୁଷ୍ଠାନ ଗ୍ରହଣ",
        SafetyCaseStatus.REFERRED to "ପ୍ରେରିତ",
        SafetyCaseStatus.CLOSED to "ବନ୍ଦ"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "ପ୍ରାରମ୍ଭିକ",
        BadgeLevel.SILVER to "ସିଲଭର୍",
        BadgeLevel.GOLD to "ଗୋଲ୍ଡ",
        BadgeLevel.DIAMOND to "ଡାଇମଣ୍ଡ",
        BadgeLevel.PLATINUM to "ପ୍ଲାଟିନମ୍"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "କାମ ପୋଷ୍ଟ ସମୟରେ",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "ଯାଞ୍ଚ ହୋଇଥିବା ସଂଯୋଗରେ",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "ଆବେଦନ ଗ୍ରହଣ ସମୟରେ"
    )
    override val indianStates = mapOf(
        "All States" to "ସମସ୍ତ ରାଜ୍ୟ",
        "Telangana" to "ତେଲେଙ୍ଗାନା",
        "Andhra Pradesh" to "ଆନ୍ଧ୍ର ପ୍ରଦେଶ",
        "Tamil Nadu" to "ତାମିଲନାଡୁ",
        "Karnataka" to "କର୍ଣ୍ଣାଟକ",
        "Maharashtra" to "ମହାରାଷ୍ଟ୍ର",
        "Gujarat" to "ଗୁଜରାଟ",
        "Assam" to "ଆସାମ",
        "Bihar" to "ବିହାର",
        "Uttar Pradesh" to "ଉତ୍ତର ପ୍ରଦେଶ",
        "West Bengal" to "ପଶ୍ଚିମବଙ୍ଗ",
        "Odisha" to "ଓଡ଼ିଶା",
        "Kerala" to "କେରଳ",
        "Punjab" to "ପଞ୍ଜାବ"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "କ୍ଲାଉଡ୍ ଡାଟାବେସ୍ ଓ ସୁରକ୍ଷା",
        "otp_sms" to "OTP ଓ SMS ସେବା",
        "payment_gateway" to "UPI ଓ କଏନ୍ ପେମେଣ୍ଟ ଗେଟୱେ",
        "face_liveness" to "ମୁହଁ ମେଳ ଓ ଜୀବନ୍ତ ଯାଞ୍ଚ",
        "translation" to "ଲାଇଭ୍ ୧୨-ଭାଷା କାମ ଅନୁବାଦ",
        "telecom_ivr" to "କିପ୍ୟାଡ୍ ଫୋନ୍ ମିସ୍ଡ-କଲ୍ ଓ IVR",
        "owner_pin_auth" to "ମାଲିକ ବୁଟଷ୍ଟ୍ରାପ୍ ଓ ୪-ଅଙ୍କ PIN ସର୍ଭର"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "ସଂଯୁକ୍ତ ନୁହେଁ",
        IntegrationStatus.NEEDS_CREDENTIALS to "କି ଆବଶ୍ୟକ",
        IntegrationStatus.CONNECTED to "ସଂଯୁକ୍ତ"
    )

    override val msgOwnerPrivilegeBlocked = "ଅନଧିକୃତ: ସାଧାରଣ ବ୍ୟବହାରକାରୀ କେବେହେଲେ ମାଲିକ / ସୁପର ଆଡମିନ୍ ହୋଇପାରିବେ ନାହିଁ।"
    override val msgSwitchedPreviewFormat = "ପ୍ରିଭ୍ୟୁ ଖାତା %1\$s (%2\$s) କୁ ବଦଳାଗଲା।"
    override val msgLanguageSavedFormat = "ଭାଷା %1\$s (%2\$s) ସେଟ୍ ହେଲା"
    override val msgEnterNameBeforeOtp = "OTP ମାଗିବା ପୂର୍ବରୁ ଆପଣଙ୍କ ସମ୍ପୂର୍ଣ୍ଣ ନାମ ଲେଖନ୍ତୁ।"
    override val msgEnterValidMobile = "ଦୟାକରି ସଠିକ୍ ୧୦-ଅଙ୍କ ମୋବାଇଲ୍ ନମ୍ବର ଦିଅନ୍ତୁ।"
    override val msgOtpDispatchedFormat = "ସର୍ଭର OTP %1\$s କୁ ପଠାଗଲା। ଫୋନ୍‌ରେ ଆସିଥିବା କୋଡ୍ ଦିଅନ୍ତୁ।"
    override val msgUnableSendOtp = "OTP ପଠାଯାଇପାରିଲା ନାହିଁ। ବ୍ୟାକଏଣ୍ଡ URL କିମ୍ବା ନେଟୱାର୍କ ଯାଞ୍ଚ କରନ୍ତୁ।"
    override val msgSendOtpAndEnterCode = "ପ୍ରଥମେ OTP ପଠାନ୍ତୁ ଏବଂ ୪–୬ ଅଙ୍କ କୋଡ୍ ଦିଅନ୍ତୁ।"
    override val msgOtpVerifiedCreateFormat = "ମୋବାଇଲ୍ OTP ଯାଞ୍ଚ ହେଲା! ବିବରଣୀ ପୂରଣ କରି %1\$s ପ୍ରୋଫାଇଲ୍ ତିଆରି କରନ୍ତୁ ଦବାନ୍ତୁ।"
    override val msgIncorrectOtp = "ଭୁଲ୍ କିମ୍ବା ସମୟସୀମା ଶେଷ OTP। ନୂଆ OTP ମାଗନ୍ତୁ।"
    override val msgServerOtpUnavailable = "ସର୍ଭର OTP ସେବା ଉପଲବ୍ଧ ନୁହେଁ। ଲାଇଭ୍ ବ୍ୟାକଏଣ୍ଡ ଯୋଡ଼ନ୍ତୁ।"
    override val msgEnterFullName = "ସମ୍ପୂର୍ଣ୍ଣ ନାମ ଆବଶ୍ୟକ।"
    override val msgVerifyMobileOtpFirst = "ଦୟାକରି ପ୍ରଥମେ ମୋବାଇଲ୍ OTP ଯାଞ୍ଚ କରନ୍ତୁ।"
    override val msgAccountCreatedFormat = "ସ୍ୱାଗତ %1\$s! %2\$s ଖାତା ତିଆରି ହେଲା (%3\$s)।"
    override val msgLoggedInFormat = "%1\$s (%2\$s) ଭାବେ ଲଗ୍ ଇନ୍ ହେଲେ"
    override val msgSignedOut = "ବ୍ୟବହାରକାରୀ ଖାତାରୁ ସାଇନ୍ ଆଉଟ୍ ହେଲେ।"
    override val msgDuplicateOwnerBlocked = "ସୁରକ୍ଷା ପ୍ରତିବନ୍ଧକ: ମାଲିକ ଖାତା ପୂର୍ବରୁ ଅଛି। ଦ୍ୱିତୀୟ ମାଲିକ ତିଆରି ହୋଇପାରିବ ନାହିଁ।"
    override val msgBootstrapRequired = "ସର୍ଭର ବୁଟଷ୍ଟ୍ରାପ୍ ଅନୁମତି କୋଡ୍ ଦିଅନ୍ତୁ।"
    override val msgEnterPasswords = "ମାଲିକ ଲଗ୍ ଇନ୍ ପାସୱାର୍ଡ ଦିଅନ୍ତୁ ଓ ନିଶ୍ଚିତ କରନ୍ତୁ।"
    override val msgPasswordsDoNotMatch = "ପାସୱାର୍ଡ ଦୁଇଟି ମେଳ ଖାଉନାହିଁ।"
    override val msgPasswordTooShort = "ପାସୱାର୍ଡ ଅତି କମରେ ୮ ଅକ୍ଷରର ହେବା ଆବଶ୍ୟକ।"
    override val msgPinFourDigits = "ଆଡମିନ୍ PIN ଠିକ୍ ୪ ଅଙ୍କର ହେବା ଆବଶ୍ୟକ।"
    override val msgPinsDoNotMatch = "୪-ଅଙ୍କ PIN ନିଶ୍ଚିତକରଣ ମେଳ ଖାଉନାହିଁ।"
    override val msgOwnerCreatedFormat = "%1\$s ଙ୍କ ପାଇଁ ମାଲିକ ପ୍ରୋଫାଇଲ୍ ତିଆରି ହେଲା। ନୂଆ ମାଲିକ ପଞ୍ଜୀକରଣ ଚିରଦିନ ପାଇଁ ବନ୍ଦ ହେଲା।"
    override val msgOwnerLockedSession = "ମାଲିକ ସେସନ୍ ଲକ୍ ହେଲା।"
    override val msgOwnerTimedOut = "୫ ମିନିଟ୍ ନିଷ୍କ୍ରିୟତା ଯୋଗୁଁ ମାଲିକ ସେସନ୍ ସମାପ୍ତ ହେଲା। ପୁଣି PIN ଦିଅନ୍ତୁ।"
    override val msgOwnerUnlocked = "ମାଲିକ ମାଷ୍ଟର କଣ୍ଟ୍ରୋଲ୍ ଖୋଲିଲା।"
    override val msgInvalidPinAttemptsFormat = "ଭୁଲ୍ ୪-ଅଙ୍କ ମାଲିକ PIN। ଆଉ %1\$d ଚେଷ୍ଟା ବାକି ଅଛି।"
    override val msgTooManyPinAttemptsFormat = "ଅତ୍ୟଧିକ ଭୁଲ୍ ଚେଷ୍ଟା। %1\$d ସେକେଣ୍ଡ ପାଇଁ ଲକ୍ ହେଲା।"
    override val msgOwnerSessionRequired = "ସକ୍ରିୟ ମାଲିକ ସେସନ୍ ଆବଶ୍ୟକ।"
    override val msgVerifyOtpBeforePinChange = "ପ୍ରଥମେ ପଞ୍ଜୀକୃତ ମୋବାଇଲ୍‌କୁ ଆସିଥିବା OTP ଯାଞ୍ଚ କରନ୍ତୁ।"
    override val msgPinUpdatedSuccess = "ନୂଆ ଆଡମିନ୍ PIN ସର୍ଭରରେ ସୁରକ୍ଷିତ ଭାବେ ଅପଡେଟ୍ ହେଲା।"
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) ଙ୍କ ପାଇଁ ଡେମୋ ପ୍ରୋଫାଇଲ୍ ଅପଡେଟ୍ ହେଲା"
    override val msgJobPostedFormat = "%1\$s ରେ ଡେମୋ କାମ ପୋଷ୍ଟ ହେଲା! ଫି: %2\$d କଏନ୍।"
    override val msgAlreadyAppliedFormat = "%1\$s ପାଇଁ ପୂର୍ବରୁ ଆବେଦନ ସରିଛି"
    override val msgApplicationSentFormat = "%1\$s ପାଇଁ ଆବେଦନ ପଠାଗଲା"
    override val msgApplicationWithdrawnFormat = "ଆବେଦନ %1\$s ପ୍ରତ୍ୟାହାର ହେଲା"
    override val msgApplicationUpdatedFormat = "ଆବେଦନ %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "ସାପ୍ତାହିକ ଯାଞ୍ଚ ଲିପିବଦ୍ଧ: ୧ · ମୁଁ ସୁରକ୍ଷିତ ଅଛି।"
    override val msgCheckInProblemRecorded = "ସତର୍କତା ଲିପିବଦ୍ଧ (୨ · ଅସୁବିଧା)। ସୁରକ୍ଷା ଡେସ୍କକୁ ଜଣାଗଲା।"
    override val msgCheckInAdminRequested = "ଜରୁରୀ ଆଡମିନ୍ କଲବ୍ୟାକ୍ ଅନୁରୋଧ (୩)। ପରିବାର ସତର୍କତା ଧାଡ଼ିରେ ଅଛି।"
    override val msgSafetyComplaintSubmittedFormat = "ସୁରକ୍ଷା ମାମଲା %1\$s ଲିପିବଦ୍ଧ ହେଲା।"
    override val msgWithdrawalsFrozen = "ଜରୁରୀ ରୋକ ଚାଲୁ: ସମସ୍ତ ଟଙ୍କା ଉଠାଣ ତତ୍କାଳ ଲକ୍ ହେଲା।"
    override val msgWithdrawalsUnfrozen = "ଯାଞ୍ଚ ପରେ ଟଙ୍କା ଉଠାଣ ଅନଲକ୍ ହେଲା।"
    override val msgOwnerNoticePublished = "ଲାଲ୍ LOBORO ଆଡମିନ୍ ସୂଚନା ପ୍ରସାରିତ ହେଲା।"
}
