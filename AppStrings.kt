package com.example.i18n

import androidx.compose.runtime.compositionLocalOf
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

interface AppStrings {
    // Core Brand & Shell
    val appName: String
    val tagline: String
    val demoPreviewBanner: String
    val verifiedNormalAccountBanner: String
    val adminNoticeHeading: String
    val maintenanceModeBanner: String
    val navHome: String
    val navSearchJobs: String
    val navPostJob: String
    val navWallet: String
    val navMyApplications: String
    val navMyJobs: String
    val navNotifications: String
    val navHelpSafety: String
    val navProfile: String
    val navSettings: String
    val navAdmin: String
    val navBadgesLoyalty: String
    val navIvrKeypad: String
    val backLabel: String
    val homeLabel: String
    val languageLabel: String
    val languageSelectorTitle: String
    val activeBadgeLabel: String
    val closeLabel: String
    val okLabel: String
    val understoodLabel: String
    val cancelLabel: String
    val doneLabel: String
    val confirmActionLabel: String
    val resetLabel: String
    val sendLabel: String

    // Share Sheet
    val shareAppTitle: String
    val shareAppCta: String
    val yourReferralLinkLabel: String
    val loboroLinkLabel: String
    val shareMenuButton: String
    val copyLinkButton: String
    val referralCopiedToast: String
    val openingShareMenuToast: String
    val shareMessageTemplate: String // Uses %1$s = userLoboroId, %2$s = referralUrl

    // Home & Voice Search
    val registerWorkerEmployerCta: String
    val logInLabel: String
    val signOutLabel: String
    val voiceSearchHint: String
    val tapMicToSpeak: String
    val listeningStatus: String
    val stopListening: String
    val searchAction: String
    val retryVoice: String
    val voiceMicPermissionNeeded: String
    val voiceUnavailableHonest: String
    val voiceNoMatchError: String
    val voiceNetworkError: String
    val voiceStoppedError: String // %1$d = code
    val voicePrivacyHint: String
    val clearSearchDesc: String
    val spokenSamples: List<Pair<String, String>>
    val dailyJobsTitle: String
    val dailyJobsSubtitle: String
    val monthlyJobsTitle: String
    val monthlyJobsSubtitle: String
    val jobsCountFormat: String // "%d" count
    val activeCategoriesFormat: String // "%d" count
    val categoriesHeading: String
    val walletStripSummaryFormat: String // %1$d coins, %2$d INR

    // Jobs Screen & Detail Sheet
    val outOfStateTitle: String
    val willingToRelocate: String
    val filterCountry: String
    val filterState: String
    val filterDistrict: String
    val filterCity: String
    val filterDistance: String
    val upToKmFormat: String // %d km
    val filterFoodIncluded: String
    val filterAccommodation: String
    val allCategoriesLabel: String
    val noMatchingJobsTitle: String
    val noMatchingJobsSubtitle: String
    val showAllJobsButton: String
    val dailyWageJobBadge: String
    val monthlySalaryJobBadge: String
    val demoDataTag: String
    val originalLangFormat: String // %s language native name
    val preTranslatedPreviewNote: String
    val configureTranslationApiNote: String
    val translatedToggle: String
    val originalToggle: String
    val compensationLabel: String
    val locationLabel: String
    val employerLabel: String
    val vacanciesUnit: String
    val perDayFormat: String // ₹%d / day
    val perMonthFormat: String // ₹%d / month
    val coinsCountFormat: String // %d Coins
    val foodBadge: String
    val stayBadge: String
    val shareJobButton: String
    val applyNow: String
    val saveJob: String
    val negotiateChat: String
    val reportJob: String
    val foodAvailable: String
    val accommodationAvailable: String
    val notProvided: String
    val workersNeeded: String
    val workHoursLabel: String
    val overtimeLabel: String
    val paymentFreqLabel: String
    val weeklyHolidayLabel: String
    val leavePolicyLabel: String
    val joiningDateLabel: String
    val expiryLabel: String
    val translatedBadgeLabel: String

    // Post Job Screen
    val postingPausedFormat: String // %s scope
    val selectCategoryLabel: String
    val jobTitleLabel: String
    val jobTitlePlaceholder: String
    val jobDescLabel: String
    val jobDescPlaceholder: String
    val dailyWageInrLabel: String
    val monthlySalaryInrLabel: String
    val vacanciesLabel: String
    val cityTownLabel: String
    val stateLabel: String
    val transparentJobFeeTitle: String // %1$d coins, %2$d INR
    val configuredByOwnerSub: String // %1$s charge point, %2$d available coins
    val confirmAndPostJobButton: String // %d coins

    // Wallet Screen
    val walletBalanceTitle: String
    val withdrawableValueFormat: String // %1$d balance INR, %2$d coin price INR
    val withdrawableRuleTitle: String
    val withdrawableRuleBody: String
    val buyCoins: String
    val withdrawCoins: String
    val walletActionsPausedNote: String
    val coinPackagesTitle: String
    val bankSecurityTitle: String
    val payoutDestinationLabel: String
    val bankSecurityStepsNote: String
    val changeBankUpiButton: String
    val unfreezePayoutsButton: String
    val lostPhoneFreezeButton: String
    val payoutFreezeActiveNote: String
    val transactionHistory: String
    val demoLedgerSuffix: String
    val buyCoinsDialogTitleFormat: String // %1$d coins, %2$d INR
    val paymentNotConnectedBody: String
    val withdrawDialogTitleFormat: String // %d INR
    val withdrawDialogBodyFormat: String // %1$d coins, %2$s destination
    val bankChangeDialogTitle: String
    val bankChangeDialogBody: String
    val receiptDialogTitle: String
    val receiptIdLabel: String
    val receiptRefLabel: String
    val receiptTypeLabel: String
    val receiptCoinsLabel: String
    val receiptStatusLabel: String
    val receiptTimeLabel: String
    val receiptWithdrawableYes: String

    // Applications & Chat
    val employerAppsHeading: String
    val secureChatHeading: String
    val secureChatSubtitle: String
    val chatButton: String
    val workerEmployerLineFormat: String
    val shortlistButton: String
    val acceptButton: String
    val withdrawButton: String
    val phoneHiddenPrivacy: String
    val blockUserLabel: String
    val userBlockedNotice: String
    val chatPlaceholder: String

    // Badges & Loyalty
    val automaticBadgePrefix: String
    val badgeStatsFormat: String // %1$.1f rating, %2$d days, %3$d jobs
    val progressToFormat: String // %1$s badge, %2$d done, %3$d min
    val badgeAntiAbuseNote: String
    val badgeTiersTitle: String
    val minWorkdaysFormat: String // %1$d days, %2$.1f rating
    val badgeAppealsNote: String
    val loyaltyTitle: String
    val loyaltySubtitle: String
    val loyaltyDisclaimer: String
    val loyaltyMinMembershipFormat: String
    val loyaltyWorkdaysFormat: String
    val loyaltyRequiredBadgeFormat: String
    val loyaltyRequiredRatingFormat: String
    val loyaltyBudgetFormat: String

    // Safety & IVR
    val safetyEmergencyTitle: String
    val callEmergency112: String
    val weeklyCheckInTitle: String
    val weeklyCheckInQuestion: String
    val checkInOpt1: String
    val checkInOpt2: String
    val checkInOpt3: String
    val reportSafetyIssue: String
    val safetyOperationalNote: String
    val safetyDisclaimerNote: String
    val everyDaysFormat: String
    val lastStatusFormat: String
    val checkInNoResponseNote: String
    val consentEmergencyTitle: String
    val workerIdLabel: String
    val homeOriginLabel: String
    val currentJobCityLabel: String
    val emergencyContactLabel: String
    val consentGranted: String
    val consentPending: String
    val employerLoboroIdInput: String
    val currentSiteInput: String
    val describeIssueInput: String
    val submitSafetyDeskButton: String
    val safetyCasesHeading: String
    val ivrTitle: String
    val ivrSubtitle: String
    val ivrArchNote: String
    val ivrMenuTitle: String
    val ivrInitialPrompt: String
    val pressKeyFormat: String
    val ivrSelectedSummaryFormat: String
    val ivrOptionLabels: List<Pair<String, String>>

    // Normal User Auth (Worker & Employer)
    val userRegTitle: String
    val userLoginTitle: String
    val userAuthSubtitle: String
    val registerTab: String
    val loginTab: String
    val dbOtpNotConnectedTitle: String
    val dbOtpNotConnectedBody: String
    val selectAccountTypeStep: String
    val workerAccountLabel: String
    val employerAccountLabel: String
    val regPausedForRoleFormat: String
    val preferredLanguageLabel: String
    val fullNameStepLabel: String
    val businessNameStepLabel: String
    val mobileStepLabel: String
    val sendRegOtpButton: String
    val resendMobileOtpButton: String
    val enterOtpStepLabel: String
    val verifyOtpButton: String
    val verifiedLabel: String
    val mobileVerifiedNote: String
    val homeStateLabel: String
    val homeDistrictLabel: String
    val stateShortLabel: String
    val cityShortLabel: String
    val workCityStateLabel: String
    val businessLocationLabel: String
    val skillsCategoriesLabel: String
    val hiringCategoriesLabel: String
    val emergencyContactNameLabel: String
    val emergencyContactPhoneLabel: String
    val uniqueLbIdNotice: String
    val creatingProfileLabel: String
    val createProfileButton: String
    val loginHeading: String
    val loginSubtitle: String
    val registeredMobileLabel: String
    val sendLoginOtpButton: String
    val resendLoginOtpButton: String
    val enterLoginOtpLabel: String
    val verifyingOtpLabel: String
    val verifyOtpOpenHomeButton: String
    val backToHomepageButton: String

    // Profile, Notifications, Settings, Privacy, Terms & Support
    val loboroIdLabel: String
    val roleLabel: String
    val offlinePreviewHeading: String
    val offlinePreviewCardTitle: String
    val offlinePreviewCardSubtitle: String
    val workLocationLabel: String
    val businessAddressLabel: String
    val skillsExpLabel: String
    val businessCatLabel: String
    val aadhaarPrivacyNote: String
    val selectProfilePhotoBtn: String
    val photoSelectedBtn: String
    val offlineConsentCheck: String
    val previewProfileBtn: String
    val audienceScopeFormat: String
    val settingsHeading: String
    val languageSectionTitle: String
    val languageSectionSubtitle: String
    val languagePausedByOwner: String
    val lowDataTitle: String
    val lowDataSubtitle: String
    val reducedMotionTitle: String
    val reducedMotionSubtitle: String
    val privacyPolicyTitle: String
    val privacyPolicyBody: String
    val termsOfServiceTitle: String
    val termsOfServiceBody: String
    val helpSupportTitle: String
    val helpSupportBody: String
    val backendChecklistTitle: String
    val providersLabel: String
    val secretsLabel: String

    // Owner Setup, PIN & Admin Master Control
    val ownerSetupTitle: String
    val ownerSetupSubtitle: String
    val ownerSetupLockNote: String
    val ownerBackendReqTitle: String
    val ownerBackendReqBody: String
    val serverSetupAuthHeading: String
    val bootstrapSecretLabel: String
    val bootstrapSecretPlaceholder: String
    val ownerIdentityHeading: String
    val ownerNameField: String
    val ownerMobileField: String
    val ownerSendOtpBtn: String
    val ownerMobileVerifiedNote: String
    val credentialsHeading: String
    val createPasswordLabel: String
    val confirmPasswordLabel: String
    val passwordsMismatchError: String
    val createPinLabel: String
    val confirmPinLabel: String
    val pinsMismatchError: String
    val credentialsHashNote: String
    val registeringOwnerLabel: String
    val completeOwnerRegButton: String
    val returnToAppButton: String
    val adminPinHeader: String
    val adminPinPrompt: String
    val pinLockoutFormat: String
    val clrKeyLabel: String
    val verifyPinServerBtn: String
    val pinSecurityPolicyFormat: String
    val ownerMasterControlTitle: String
    val ownerMasterSubtitle: String
    val ownerSessionLockedNote: String
    val verifyOwnerPinBtn: String
    val ownerProfileLineFormat: String
    val registeredMobileLineFormat: String
    val activeSessionFormat: String
    val serverAuthorityNote: String
    val lockAndExitBtn: String
    val mandatoryProtectionTitle: String
    val mandatoryProtectionBody: String
    val changePinTitle: String
    val changePinSubtitle: String
    val otpToRegisteredMobileNote: String
    val sendPinChangeOtpBtn: String
    val otpDispatchedNote: String
    val enterServerOtpLabel: String
    val verifyOtpServerBtn: String
    val otpVerifiedNewPinNote: String
    val newPinLabel: String
    val confirmNewPinLabel: String
    val saveNewPinBtn: String
    val confirmPinChangeTitle: String
    val confirmPinChangeDesc: String
    val pinUpdatedNote: String
    val completeMasterControlTitle: String
    val masterControlScopeSubtitle: String
    val scopeOptions: List<String>
    val masterControlNames: List<String>
    val publishNoticeTitle: String
    val announcementMessageLabel: String
    val announcementPlaceholder: String
    val actionLinkLabel: String
    val scopeFieldLabel: String
    val audienceOptions: List<String>
    val broadcastNoticeBtn: String
    val confirmBroadcastTitle: String
    val confirmBroadcastDescFormat: String
    val coinPricingTitle: String
    val coinPricingSummaryFormat: String
    val dailyBtnFormat: String
    val masonBtnFormat: String
    val monthlyBtnFormat: String
    val protectedVipIdsTitle: String
    val protectedVipIdsNote: String
    val safetyInvestigationTitle: String
    val manageCategoriesTitle: String
    val showAll24Label: String
    val showLessLabel: String
    val auditLogTitle: String
    val confirmToggleTitleFormat: String
    val confirmToggleDescFormat: String

    // Enum & Taxonomy Translation Maps
    val categories: Map<JobCategoryId, String>
    val userRoles: Map<UserRole, String>
    val applicationStatuses: Map<ApplicationStatus, String>
    val transactionStatuses: Map<TransactionStatus, String>
    val transactionTypes: Map<TransactionType, String>
    val safetyCategories: Map<SafetyComplaintCategory, String>
    val safetyStatuses: Map<SafetyCaseStatus, String>
    val badgeLevels: Map<BadgeLevel, String>
    val feeChargePoints: Map<FeeChargePoint, String>
    val indianStates: Map<String, String>
    val backendServiceNames: Map<String, String>
    val integrationStatuses: Map<IntegrationStatus, String>

    // ViewModel Dynamic Feedback & Validation Messages
    val msgOwnerPrivilegeBlocked: String
    val msgSwitchedPreviewFormat: String
    val msgLanguageSavedFormat: String
    val msgEnterNameBeforeOtp: String
    val msgEnterValidMobile: String
    val msgOtpDispatchedFormat: String
    val msgUnableSendOtp: String
    val msgSendOtpAndEnterCode: String
    val msgOtpVerifiedCreateFormat: String
    val msgIncorrectOtp: String
    val msgServerOtpUnavailable: String
    val msgEnterFullName: String
    val msgVerifyMobileOtpFirst: String
    val msgAccountCreatedFormat: String
    val msgLoggedInFormat: String
    val msgSignedOut: String
    val msgDuplicateOwnerBlocked: String
    val msgBootstrapRequired: String
    val msgEnterPasswords: String
    val msgPasswordsDoNotMatch: String
    val msgPasswordTooShort: String
    val msgPinFourDigits: String
    val msgPinsDoNotMatch: String
    val msgOwnerCreatedFormat: String
    val msgOwnerLockedSession: String
    val msgOwnerTimedOut: String
    val msgOwnerUnlocked: String
    val msgInvalidPinAttemptsFormat: String
    val msgTooManyPinAttemptsFormat: String
    val msgOwnerSessionRequired: String
    val msgVerifyOtpBeforePinChange: String
    val msgPinUpdatedSuccess: String
    val msgDemoProfileUpdatedFormat: String
    val msgJobPostedFormat: String
    val msgAlreadyAppliedFormat: String
    val msgApplicationSentFormat: String
    val msgApplicationWithdrawnFormat: String
    val msgApplicationUpdatedFormat: String
    val msgCheckInSafeRecorded: String
    val msgCheckInProblemRecorded: String
    val msgCheckInAdminRequested: String
    val msgSafetyComplaintSubmittedFormat: String
    val msgWithdrawalsFrozen: String
    val msgWithdrawalsUnfrozen: String
    val msgOwnerNoticePublished: String
}

val LocalAppStrings = compositionLocalOf<AppStrings> {
    error("LocalAppStrings not provided")
}
