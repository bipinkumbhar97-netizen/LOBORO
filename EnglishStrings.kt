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

object EnglishStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "Global Job & Service"
    override val demoPreviewBanner = "DEMO PREVIEW DATA · Connect backend APIs in Settings for live production"
    override val verifiedNormalAccountBanner = "VERIFIED USER ACCOUNT · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO ADMIN NOTICE"
    override val maintenanceModeBanner = "MAINTENANCE MODE ACTIVE · Core hiring & wallet temporarily paused. Emergency 112 & Safety Desk remain ON."
    override val navHome = "Home"
    override val navSearchJobs = "Search Jobs"
    override val navPostJob = "Post a Job"
    override val navWallet = "Wallet"
    override val navMyApplications = "My Applications"
    override val navMyJobs = "My Jobs"
    override val navNotifications = "Notifications"
    override val navHelpSafety = "Help & Safety"
    override val navProfile = "Profile"
    override val navSettings = "Settings"
    override val navAdmin = "Owner Control"
    override val navBadgesLoyalty = "Badges & Loyalty"
    override val navIvrKeypad = "Keypad & IVR"
    override val backLabel = "Back"
    override val homeLabel = "Home"
    override val languageLabel = "Language"
    override val languageSelectorTitle = "12 Languages"
    override val activeBadgeLabel = "ACTIVE"
    override val closeLabel = "Close"
    override val okLabel = "OK"
    override val understoodLabel = "Understood"
    override val cancelLabel = "Cancel"
    override val doneLabel = "Done"
    override val confirmActionLabel = "Confirm Action"
    override val resetLabel = "Reset"
    override val sendLabel = "Send"

    override val shareAppTitle = "Share LOBORO App"
    override val shareAppCta = "Share with Friends & Earn Rewards"
    override val yourReferralLinkLabel = "Your Referral Link"
    override val loboroLinkLabel = "LOBORO Link"
    override val shareMenuButton = "Share Menu"
    override val copyLinkButton = "Copy Link"
    override val referralCopiedToast = "Referral message copied"
    override val openingShareMenuToast = "Opening system share menu"
    override val shareMessageTemplate = "Join LOBORO Global Job & Service! Find Daily Wage or Monthly Salary work across India. Use my Referral ID %1\$s: %2\$s"

    override val registerWorkerEmployerCta = "Register as Worker / Employer"
    override val logInLabel = "Log In"
    override val signOutLabel = "Sign Out"
    override val voiceSearchHint = "Speak or type job, city (e.g. Mason in Hyderabad)"
    override val tapMicToSpeak = "Tap Mic to Speak"
    override val listeningStatus = "Listening... Speak your job need"
    override val stopListening = "Stop Listening"
    override val searchAction = "Search"
    override val retryVoice = "Try Voice Again"
    override val voiceMicPermissionNeeded = "Microphone permission is needed only when you tap the mic for voice search."
    override val voiceUnavailableHonest = "Device speech recognition is not installed here. Configure a cloud Speech-to-Text provider or tap a quick phrase below."
    override val voiceNoMatchError = "No speech matched. Speak clearly or tap a sample phrase below."
    override val voiceNetworkError = "Speech recognition network error. Check internet or type your job."
    override val voiceStoppedError = "Voice input stopped (code %1\$d). Type your job or try again."
    override val voicePrivacyHint = "Privacy: Microphone is off by default and activates only when you tap this mic button."
    override val clearSearchDesc = "Clear search"
    override val spokenSamples = listOf(
        "Mason in Hyderabad" to "Mason",
        "Electrician in Pune" to "Electrician",
        "Hotel Cook Chennai" to "Cook",
        "Driver Vijayawada" to "Driver",
        "Surat Packing Job" to "Packing"
    )
    override val dailyJobsTitle = "Daily Jobs"
    override val dailyJobsSubtitle = "Paid daily · Separate from monthly jobs"
    override val monthlyJobsTitle = "Monthly Salary Jobs"
    override val monthlyJobsSubtitle = "Fixed monthly salary · Leave & holiday details"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "Job Categories (24)"
    override val walletStripSummaryFormat = "%1\$d Coins (₹%2\$d) · 100%% Withdrawable"

    override val outOfStateTitle = "Out-of-State & Global Job Search"
    override val willingToRelocate = "Willing to relocate to another state"
    override val filterCountry = "Country"
    override val filterState = "State"
    override val filterDistrict = "District"
    override val filterCity = "City"
    override val filterDistance = "Distance"
    override val upToKmFormat = "Up to %1\$d km"
    override val filterFoodIncluded = "Food Provided"
    override val filterAccommodation = "Room / Stay"
    override val allCategoriesLabel = "All Categories"
    override val noMatchingJobsTitle = "No jobs match your filters"
    override val noMatchingJobsSubtitle = "Try clearing filters or enabling 'Out-of-state' search."
    override val showAllJobsButton = "Show All Jobs"
    override val dailyWageJobBadge = "DAILY WAGE JOB"
    override val monthlySalaryJobBadge = "MONTHLY SALARY JOB"
    override val demoDataTag = "DEMO"
    override val originalLangFormat = "Original: %1\$s"
    override val preTranslatedPreviewNote = "Pre-translated preview active. For user-typed live jobs in production, configure Translation API key in Settings."
    override val configureTranslationApiNote = "Configure Translation API key in Settings to auto-translate live user posts across all 12 languages."
    override val translatedToggle = "Translated"
    override val originalToggle = "Original"
    override val compensationLabel = "Compensation"
    override val locationLabel = "Location"
    override val employerLabel = "Employer"
    override val vacanciesUnit = "vacancies"
    override val perDayFormat = "₹%1\$d / day"
    override val perMonthFormat = "₹%1\$d / month"
    override val coinsCountFormat = "%1\$d Coins"
    override val foodBadge = "Food"
    override val stayBadge = "Stay"
    override val shareJobButton = "Share Job"
    override val applyNow = "Apply Now"
    override val saveJob = "Save"
    override val negotiateChat = "Chat / Negotiate"
    override val reportJob = "Report Job"
    override val foodAvailable = "Food Included"
    override val accommodationAvailable = "Stay Included"
    override val notProvided = "Not Included"
    override val workersNeeded = "Workers Needed"
    override val workHoursLabel = "Work Hours"
    override val overtimeLabel = "Overtime"
    override val paymentFreqLabel = "Payment"
    override val weeklyHolidayLabel = "Weekly Holiday"
    override val leavePolicyLabel = "Leave Policy"
    override val joiningDateLabel = "Joining Date"
    override val expiryLabel = "Expires"
    override val translatedBadgeLabel = "Translated"

    override val postingPausedFormat = "Job posting is currently paused by Owner Master Control (%1\$s)."
    override val selectCategoryLabel = "Select Category (24 Categories)"
    override val jobTitleLabel = "Job Title"
    override val jobTitlePlaceholder = "e.g., 4 Masons Needed for Hostel Building"
    override val jobDescLabel = "Job Description"
    override val jobDescPlaceholder = "Work details, safety gear, food & stay availability"
    override val dailyWageInrLabel = "Daily Wage (₹)"
    override val monthlySalaryInrLabel = "Monthly Salary (₹)"
    override val vacanciesLabel = "Vacancies"
    override val cityTownLabel = "City / Town"
    override val stateLabel = "State"
    override val transparentJobFeeTitle = "Transparent Job Fee: %1\$d Coin(s) (₹%2\$d)"
    override val configuredByOwnerSub = "Configured by Owner · Charge point: %1\$s · Available: %2\$d Coins"
    override val confirmAndPostJobButton = "Confirm & Post Job (%1\$d Coins)"

    override val walletBalanceTitle = "LOBORO Coin Balance"
    override val withdrawableValueFormat = "₹%1\$d Withdrawable Value (1 Coin = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% Equal Withdrawal Rule"
    override val withdrawableRuleBody = "Every LOBORO Coin (purchased, gift, promo, referral, badge, or loyalty credit) has equal cash value and full withdrawal eligibility. Zero locked coins."
    override val buyCoins = "Buy Coins"
    override val withdrawCoins = "Withdraw"
    override val walletActionsPausedNote = "Some wallet actions are paused by Owner Master Control. All existing balances and approved refunds remain protected."
    override val coinPackagesTitle = "Coin Packages (Transparent Value)"
    override val bankSecurityTitle = "Bank / UPI & Face Verification Lock"
    override val payoutDestinationLabel = "Verified Payout Destination: %1\$s"
    override val bankSecurityStepsNote = "Mandatory checks to change Bank/UPI: Registered Mobile OTP + Selfie/Liveness Face Match vs Registration Photo + Temporary Payout Freeze."
    override val changeBankUpiButton = "Change Bank / UPI (OTP + Face Match)"
    override val unfreezePayoutsButton = "Unfreeze Payouts"
    override val lostPhoneFreezeButton = "Lost Phone? Freeze Payouts"
    override val payoutFreezeActiveNote = "Payout freeze is ACTIVE. Any withdrawal attempt is blocked until identity re-verification."
    override val transactionHistory = "Auditable Coin Ledger"
    override val demoLedgerSuffix = "(Demo Ledger)"
    override val buyCoinsDialogTitleFormat = "Buy %1\$d Coins (₹%2\$d)"
    override val paymentNotConnectedBody = "Live Razorpay / Cashfree UPI checkout is NOT CONNECTED yet. Connect RAZORPAY_KEY_ID and server webhook verification in production before accepting real money. Zero fake payment will be simulated."
    override val withdrawDialogTitleFormat = "Withdraw ₹%1\$d"
    override val withdrawDialogBodyFormat = "Full balance (%1\$d Coins) is 100%% withdrawable with equal cash value.\nDestination: %2\$s\n\nLive IMPS / UPI payout gateway is not configured yet in this build."
    override val bankChangeDialogTitle = "3-Step Bank / UPI Change Protection"
    override val bankChangeDialogBody = "To protect workers if a phone is lost or stolen, changing payout Bank/UPI requires:\n1. Registered Mobile OTP verification\n2. Live Face Match vs registration selfie\n3. Automatic cooling lock before release\n\nConfigure Face Verification & OTP secrets for live verification."
    override val receiptDialogTitle = "Transaction Receipt"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "Reference: %1\$s"
    override val receiptTypeLabel = "Type: %1\$s"
    override val receiptCoinsLabel = "Coins: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "Status: %1\$s"
    override val receiptTimeLabel = "Time: %1\$s"
    override val receiptWithdrawableYes = "Withdrawable Eligibility: 100% YES"

    override val employerAppsHeading = "Applications & Direct Worker Chat"
    override val secureChatHeading = "Secure Worker ↔ Employer Chat"
    override val secureChatSubtitle = "Phone numbers stay hidden until you explicitly choose to share. Tap any thread to open or block."
    override val chatButton = "Chat"
    override val workerEmployerLineFormat = "Worker: %1\$s (%2\$s) · Employer: %3\$s"
    override val shortlistButton = "Shortlist"
    override val acceptButton = "Accept"
    override val withdrawButton = "Withdraw"
    override val phoneHiddenPrivacy = "Privacy active: Private phone numbers stay hidden unless both sides choose to share."
    override val blockUserLabel = "Block"
    override val userBlockedNotice = "You blocked this conversation. Report issues via Safety Desk if needed."
    override val chatPlaceholder = "Type message in your language..."

    override val automaticBadgePrefix = "Automatic Badge: %1\$s"
    override val badgeStatsFormat = "Rating %1\$.1f ★ · %2\$d Verified Workdays · %3\$d Completed Jobs"
    override val progressToFormat = "Progress to %1\$s: %2\$d / %3\$d days"
    override val badgeAntiAbuseNote = "Badges are calculated automatically from real completed jobs, verified attendance, and unbiased ratings — never sold or manually bought."
    override val badgeTiersTitle = "5 Automatic Badge Tiers"
    override val minWorkdaysFormat = "Min %1\$d Verified Workdays · Min %2\$.1f★ Rating"
    override val badgeAppealsNote = "Fair-play protection: Sudden suspicious 1-star ratings are reviewed via complaint appeals."
    override val loyaltyTitle = "Seniority & Loyalty Financial Support"
    override val loyaltySubtitle = "Transparent quarterly welfare & milestone bonus"
    override val loyaltyDisclaimer = "MANDATORY HONEST DISCLOSURE: This is NOT insurance, NOT guaranteed monthly pension, and subject to eligibility, verified workdays, budget availability, and management approval."
    override val loyaltyMinMembershipFormat = "Min Membership: %1\$d months"
    override val loyaltyWorkdaysFormat = "Verified Workdays: %1\$d+ days"
    override val loyaltyRequiredBadgeFormat = "Required Badge: %1\$s+"
    override val loyaltyRequiredRatingFormat = "Min Rating: %1\$.1f★"
    override val loyaltyBudgetFormat = "Approved Support: ₹%1\$d · Budget Pool: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "Worker Safety & Emergency Support"
    override val callEmergency112 = "Call India Emergency 112"
    override val weeklyCheckInTitle = "Weekly Safety Check-In"
    override val weeklyCheckInQuestion = "Are you safe?"
    override val checkInOpt1 = "1 · I am safe"
    override val checkInOpt2 = "2 · I have a problem"
    override val checkInOpt3 = "3 · Speak to LOBORO Admin"
    override val reportSafetyIssue = "Report Safety / Wage Issue"
    override val safetyOperationalNote = "Safety support stays operational even if job posting or payments are switched off."
    override val safetyDisclaimerNote = "Direct 112 dialer for immediate danger. LOBORO records safety & wage complaints for neutral mediation."
    override val everyDaysFormat = "Every %1\$d days"
    override val lastStatusFormat = "Last check-in: %1\$s"
    override val checkInNoResponseNote = "If a worker misses 2 consecutive check-ins or selects problem/admin, LOBORO sends SMS + Admin review + consented family alert."
    override val consentEmergencyTitle = "Consented Emergency Location & Family Contact"
    override val workerIdLabel = "Worker ID: %1\$s"
    override val homeOriginLabel = "Home Origin: %1\$s, %2\$s"
    override val currentJobCityLabel = "Current Work City: %1\$s"
    override val emergencyContactLabel = "Emergency Contact: %1\$s (%2\$s)"
    override val consentGranted = "CONSENT GRANTED"
    override val consentPending = "CONSENT PENDING"
    override val employerLoboroIdInput = "Employer LOBORO ID (e.g. LB819)"
    override val currentSiteInput = "Current Work City / Site"
    override val describeIssueInput = "Describe safety or wage issue"
    override val submitSafetyDeskButton = "Submit to Safety Desk"
    override val safetyCasesHeading = "Recent Safety Cases (Auditable)"
    override val ivrTitle = "Keypad Phone Missed-Call & IVR Menu"
    override val ivrSubtitle = "Works without smartphones via dedicated toll-free / missed-call callback"
    override val ivrArchNote = "Production connects Exotel / Knowlarity / Twilio Voice. Tap keys below to test the exact 12-language voice menu flow."
    override val ivrMenuTitle = "LOBORO Voice IVR · %1\$s"
    override val ivrInitialPrompt = "Welcome to LOBORO! Press a keypad digit to test the voice prompt."
    override val pressKeyFormat = "Press %1\$s → %2\$s"
    override val ivrSelectedSummaryFormat = "Selected [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "Daily Wage Jobs Today",
        "2" to "Monthly Salary Jobs",
        "3" to "Weekly Safety Check-In ('Are you safe?')",
        "4" to "Hear Wallet Coins & Latest Status",
        "5" to "Emergency Urgent Admin Callback",
        "6" to "Check Job Application Status",
        "0" to "Change Preferred Voice Language"
    )

    override val userRegTitle = "Worker & Employer Registration"
    override val userLoginTitle = "Worker & Employer Login"
    override val userAuthSubtitle = "OTP-verified normal user account · Separate from hidden Owner system"
    override val registerTab = "Register"
    override val loginTab = "Log In"
    override val dbOtpNotConnectedTitle = "Backend User Database / OTP Not Connected"
    override val dbOtpNotConnectedBody = "Configure LOBORO_BACKEND_URL with live /users/auth OTP endpoints to save real Worker & Employer accounts in production."
    override val selectAccountTypeStep = "1. Select Account Type"
    override val workerAccountLabel = "Worker"
    override val employerAccountLabel = "Employer"
    override val regPausedForRoleFormat = "Registration for %1\$s is currently paused by Owner Master Control."
    override val preferredLanguageLabel = "Preferred App Language (12 Languages)"
    override val fullNameStepLabel = "2. Full Name *"
    override val businessNameStepLabel = "2. Business / Contractor Full Name *"
    override val mobileStepLabel = "3. Mobile Number (10 digits) *"
    override val sendRegOtpButton = "Send OTP"
    override val resendMobileOtpButton = "Resend OTP"
    override val enterOtpStepLabel = "4. Enter Mobile OTP *"
    override val verifyOtpButton = "Verify OTP"
    override val verifiedLabel = "VERIFIED"
    override val mobileVerifiedNote = "Mobile verified on server"
    override val homeStateLabel = "Home State"
    override val homeDistrictLabel = "Home District"
    override val stateShortLabel = "State"
    override val cityShortLabel = "City"
    override val workCityStateLabel = "Current Work City & State"
    override val businessLocationLabel = "Business City & State"
    override val skillsCategoriesLabel = "Skills / Trade (e.g. Mason, Electrician)"
    override val hiringCategoriesLabel = "Hiring Categories"
    override val emergencyContactNameLabel = "Emergency Family Contact Name"
    override val emergencyContactPhoneLabel = "Emergency Contact Phone"
    override val uniqueLbIdNotice = "On completion, the server assigns a unique permanent LB ID (LB2000+). VIP and Owner numbers are strictly protected."
    override val creatingProfileLabel = "Creating Profile..."
    override val createProfileButton = "Create Worker / Employer Profile"
    override val loginHeading = "Log In with Registered Mobile OTP"
    override val loginSubtitle = "Enter the mobile number you registered with as a Worker or Employer."
    override val registeredMobileLabel = "Registered Mobile Number"
    override val sendLoginOtpButton = "Send Login OTP"
    override val resendLoginOtpButton = "Resend Login OTP"
    override val enterLoginOtpLabel = "Enter Login OTP"
    override val verifyingOtpLabel = "Verifying..."
    override val verifyOtpOpenHomeButton = "Verify OTP & Open Home"
    override val backToHomepageButton = "Back to Homepage"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "Role"
    override val offlinePreviewHeading = "Offline Profile & Face Photo Preview"
    override val offlinePreviewCardTitle = "Register / Edit Profile (Offline Preview)"
    override val offlinePreviewCardSubtitle = "Saves locally as preview until live User Database & Aadhaar-minimal KYB/KYC are connected."
    override val workLocationLabel = "Work Location (City, State)"
    override val businessAddressLabel = "Business City, State"
    override val skillsExpLabel = "Skills / Work Type"
    override val businessCatLabel = "Business Type / Hiring Categories"
    override val aadhaarPrivacyNote = "Data minimization: LOBORO never stores raw Aadhaar images on client devices — only verified hash + consent flag."
    override val selectProfilePhotoBtn = "Select Profile Photo (Android Photo Picker)"
    override val photoSelectedBtn = "Photo Selected ✓"
    override val offlineConsentCheck = "I consent to verified safety check-in & emergency family alert if unreachable."
    override val previewProfileBtn = "Save Preview Profile"
    override val audienceScopeFormat = "Audience: %1\$s · Scope: %2\$s · %3\$s"
    override val settingsHeading = "Settings & Platform Information"
    override val languageSectionTitle = "App Language (All 12 Indian Languages)"
    override val languageSectionSubtitle = "Saved separately for your active account. Switching users preserves each user's chosen language."
    override val languagePausedByOwner = "Language switching is paused by Owner Master Control."
    override val lowDataTitle = "Low-Data Mode"
    override val lowDataSubtitle = "Saves mobile data on 2G/3G rural networks"
    override val reducedMotionTitle = "Reduced Motion & High Contrast"
    override val reducedMotionSubtitle = "Clear typography and zero heavy animations"
    override val privacyPolicyTitle = "Privacy Policy & Data Protection"
    override val privacyPolicyBody = "• Phone numbers remain hidden in job chats unless you explicitly share them.\n• Microphone permission is requested strictly when you press Voice Search.\n• Photo selection uses zero-permission Android Photo Picker.\n• Emergency contact location alert operates strictly with your explicit consent."
    override val termsOfServiceTitle = "Terms of Service & Fairness"
    override val termsOfServiceBody = "• Daily Wage Jobs and Monthly Salary Jobs are strictly separated.\n• Every LOBORO Coin has equal cash value and 100% withdrawal eligibility.\n• Badges are earned strictly by verified workdays & fair ratings.\n• Owner VIP IDs (LB1–LB1999) are reserved exclusively."
    override val helpSupportTitle = "Help, Support & Emergency Desk"
    override val helpSupportBody = "• Immediate danger: Call 112 (available 24x7 even without login).\n• Wage or stay disputes: Open Help & Safety Desk to log an auditable case.\n• Keypad / Basic phone users: Open Keypad & IVR menu for toll-free callback options."
    override val backendChecklistTitle = "Backend & API Integration Status"
    override val providersLabel = "Providers: %1\$s"
    override val secretsLabel = "Secrets: %1\$s"

    override val ownerSetupTitle = "One-Time Owner / Super Admin Setup"
    override val ownerSetupSubtitle = "Exclusive initialization for LOBORO creator. Permanently locks after single Owner registration."
    override val ownerSetupLockNote = "Security lock: Only ONE Owner account can ever exist. No Worker, Employer, or Admin can use this form."
    override val ownerBackendReqTitle = "Owner Server Not Connected"
    override val ownerBackendReqBody = "Configure LOBORO_BACKEND_URL with live /owner/bootstrap endpoints so password & 4-digit PIN are hashed and enforced on your server."
    override val serverSetupAuthHeading = "1. Server Setup Authorization"
    override val bootstrapSecretLabel = "One-Time Server Bootstrap Code *"
    override val bootstrapSecretPlaceholder = "From your server OWNER_BOOTSTRAP_SECRET"
    override val ownerIdentityHeading = "2. Owner Identity & Mobile OTP"
    override val ownerNameField = "Owner Full Name *"
    override val ownerMobileField = "Owner Personal Mobile Number *"
    override val ownerSendOtpBtn = "Send Owner OTP"
    override val ownerMobileVerifiedNote = "Owner mobile OTP verified"
    override val credentialsHeading = "3. Password & 4-Digit Admin PIN"
    override val createPasswordLabel = "Create Login Password (8+ chars) *"
    override val confirmPasswordLabel = "Confirm Login Password *"
    override val passwordsMismatchError = "Passwords do not match"
    override val createPinLabel = "Create 4-Digit Admin PIN *"
    override val confirmPinLabel = "Confirm 4-Digit Admin PIN *"
    override val pinsMismatchError = "PINs do not match"
    override val credentialsHashNote = "Server hashes password & PIN with Argon2id + pepper. Never stored in plaintext or APK."
    override val registeringOwnerLabel = "Initializing Owner..."
    override val completeOwnerRegButton = "Complete Owner Registration & Open Dashboard"
    override val returnToAppButton = "Return to LOBORO App"
    override val adminPinHeader = "Owner Master Control · PIN Required"
    override val adminPinPrompt = "Enter your 4-digit Owner Admin PIN. Verified strictly on server with rate limiting."
    override val pinLockoutFormat = "Too many wrong attempts. Try again in %1\$d seconds."
    override val clrKeyLabel = "CLR"
    override val verifyPinServerBtn = "Verify 4-Digit PIN on Server"
    override val pinSecurityPolicyFormat = "Server lockout after 5 wrong tries · Auto-logout after 5 min inactivity · Remaining attempts: %1\$d"
    override val ownerMasterControlTitle = "Owner Master Control"
    override val ownerMasterSubtitle = "Owner-only Super Admin · Server PIN + OTP + Immutable Audit Log"
    override val ownerSessionLockedNote = "Owner session locked. Server-verified 4-digit Owner PIN required. Ordinary users and Admins cannot access Master Control."
    override val verifyOwnerPinBtn = "Verify Owner 4-Digit PIN"
    override val ownerProfileLineFormat = "OWNER PROFILE · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "Registered Mobile: %1\$s · Single Owner Account (%2\$s)"
    override val activeSessionFormat = "Active Owner Session · Auto-logout in %1\$dm %2\$02ds"
    override val serverAuthorityNote = "Session token verified (server authority)"
    override val lockAndExitBtn = "Lock & Exit"
    override val mandatoryProtectionTitle = "Mandatory Safety & Financial Obligation Protection"
    override val mandatoryProtectionBody = "Switching OFF features or enabling maintenance mode never cancels existing financial obligations, approved refunds, or Emergency 112 / safety support."
    override val changePinTitle = "Change Admin PIN (OTP Verification Required)"
    override val changePinSubtitle = "Owner-only. Never reveals current PIN. Requires registered mobile OTP verified on server."
    override val otpToRegisteredMobileNote = "OTP will be sent strictly to Owner's registered mobile on file: %1\$s"
    override val sendPinChangeOtpBtn = "Send OTP to Registered Owner Mobile"
    override val otpDispatchedNote = "OTP dispatched to Owner's registered mobile (%1\$s)."
    override val enterServerOtpLabel = "Enter Server OTP Code"
    override val verifyOtpServerBtn = "Verify OTP on Server"
    override val otpVerifiedNewPinNote = "Mobile OTP verified. Enter and confirm your new 4-digit Owner PIN."
    override val newPinLabel = "New 4-Digit PIN"
    override val confirmNewPinLabel = "Confirm New 4-Digit PIN"
    override val saveNewPinBtn = "Confirm & Update Admin PIN"
    override val confirmPinChangeTitle = "Confirm Admin PIN Update"
    override val confirmPinChangeDesc = "Replace your 4-digit Owner PIN on server? Current session remains active; an audit entry will be logged."
    override val pinUpdatedNote = "4-digit Owner PIN updated on server and logged in audit history."
    override val completeMasterControlTitle = "Complete Owner Master Control (25 Modules)"
    override val masterControlScopeSubtitle = "Independent real-time ON/OFF switches scoped by region or user role."
    override val scopeOptions = listOf(
        "Global · India (All States)",
        "Telangana Only",
        "Tamil Nadu Only",
        "Workers Only",
        "Employers Only"
    )
    override val masterControlNames = listOf(
        "1. Entire App & Maintenance Mode",
        "2. Worker Registration",
        "3. Employer Registration",
        "4. Job Posting",
        "5. Job Searching",
        "6. Daily Jobs",
        "7. Monthly Salary Jobs",
        "8. Coin Purchases",
        "9. Wallet Withdrawals",
        "10. Job Fees & Coin Pricing",
        "11. Offers & Promotions",
        "12. Referral Rewards",
        "13. Notifications & Announcements",
        "14. Worker & Employer Account Controls",
        "15. Job Categories & Subcategories",
        "16. Ratings & Automatic Badges",
        "17. Seniority & Loyalty Support",
        "18. Emergency & Worker Safety Systems",
        "19. SMS Alerts",
        "20. IVR Services",
        "21. Language Settings (12 Languages)",
        "22. Country, State & City Availability",
        "23. VIP ID Reservations & Management",
        "24. Reports, Complaints & Moderation",
        "25. Payment Gateway Integration"
    )
    override val publishNoticeTitle = "Publish Red LOBORO ADMIN NOTICE"
    override val announcementMessageLabel = "Announcement Message"
    override val announcementPlaceholder = "e.g., New safety helpline update for out-of-state workers"
    override val actionLinkLabel = "Action Button Label"
    override val scopeFieldLabel = "Region / State Scope"
    override val audienceOptions = listOf("All Users", "Workers", "Employers")
    override val broadcastNoticeBtn = "Broadcast Red Admin Notice"
    override val confirmBroadcastTitle = "Broadcast Red LOBORO Admin Notice?"
    override val confirmBroadcastDescFormat = "Message: %1\$s\nAudience: %2\$s · Scope: %3\$s"
    override val coinPricingTitle = "Coin Pricing & Fee Controls"
    override val coinPricingSummaryFormat = "1 Coin = ₹%1\$d · Daily = %2\$d Coin · Special = %3\$d Coins · Monthly = %4\$d Coins · Point: %5\$s"
    override val dailyBtnFormat = "Daily +1 (%1\$d)"
    override val masonBtnFormat = "Special +1 (%1\$d)"
    override val monthlyBtnFormat = "Monthly +5 (%1\$d)"
    override val protectedVipIdsTitle = "Protected VIP & Owner IDs (Never Auto-Assigned)"
    override val protectedVipIdsNote = "Standard users always receive LB2000+. VIP/special combinations remain reserved exclusively for Owner allocation."
    override val safetyInvestigationTitle = "Safety Case & Complaint Investigation Desk"
    override val manageCategoriesTitle = "Manage 24 Job Categories (Instant ON/OFF)"
    override val showAll24Label = "Show All 24"
    override val showLessLabel = "Show Less"
    override val auditLogTitle = "Immutable Owner Action Audit Log"
    override val confirmToggleTitleFormat = "Confirm %1\$s"
    override val confirmToggleDescFormat = "Set \"%1\$s\" to %2\$s for %3\$s? Existing financial obligations, approved refunds, and emergency 112 safety services stay protected."

    override val categories = mapOf(
        JobCategoryId.MASON to "Mason / Rajmistri",
        JobCategoryId.CONSTRUCTION_LABOUR to "Construction Labour",
        JobCategoryId.GENERAL_LABOUR to "General Labour",
        JobCategoryId.PLUMBER to "Plumber",
        JobCategoryId.ELECTRICIAN to "Electrician",
        JobCategoryId.PAINTER to "Painter",
        JobCategoryId.TILE_WORKER to "Tile Worker",
        JobCategoryId.CARPENTER to "Carpenter",
        JobCategoryId.WELDER to "Welder",
        JobCategoryId.HOTEL_STAFF to "Hotel Staff",
        JobCategoryId.COOK to "Cook",
        JobCategoryId.WAITER to "Waiter",
        JobCategoryId.HOUSEKEEPING to "Housekeeping",
        JobCategoryId.SECURITY_GUARD to "Security Guard",
        JobCategoryId.DRIVER to "Driver",
        JobCategoryId.DELIVERY_WORKER to "Delivery Worker",
        JobCategoryId.FACTORY_WORKER to "Factory Worker",
        JobCategoryId.PACKING_WORKER to "Packing Worker",
        JobCategoryId.MACHINE_OPERATOR to "Machine Operator",
        JobCategoryId.AGRICULTURE_WORKER to "Agriculture Worker",
        JobCategoryId.OFFICE_ASSISTANT to "Office Assistant",
        JobCategoryId.SHOP_STAFF to "Shop Staff",
        JobCategoryId.DOMESTIC_WORKER to "Domestic Worker",
        JobCategoryId.OTHER_JOBS to "Other Jobs"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "Worker",
        UserRole.EMPLOYER to "Employer",
        UserRole.OWNER_SUPER_ADMIN to "Owner / Super Admin"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "Applied",
        ApplicationStatus.UNDER_REVIEW to "Under Review",
        ApplicationStatus.SHORTLISTED to "Shortlisted",
        ApplicationStatus.ACCEPTED to "Accepted",
        ApplicationStatus.REJECTED to "Rejected",
        ApplicationStatus.WITHDRAWN to "Withdrawn",
        ApplicationStatus.COMPLETED to "Completed"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "Pending",
        TransactionStatus.SUCCESSFUL to "Successful",
        TransactionStatus.FAILED to "Failed",
        TransactionStatus.REFUNDED to "Refunded"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "Coin Purchase",
        TransactionType.GIFT to "Gift Credit",
        TransactionType.PROMO to "Promo Credit",
        TransactionType.REFERRAL to "Referral Bonus",
        TransactionType.BADGE_REWARD to "Badge Reward",
        TransactionType.LOYALTY_SUPPORT to "Loyalty Support",
        TransactionType.JOB_FEE to "Job Connection Fee",
        TransactionType.WITHDRAWAL to "Withdrawal"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "Unpaid Wages",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "Physical Abuse",
        SafetyComplaintCategory.HARASSMENT to "Harassment",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "Food / Stay Issue",
        SafetyComplaintCategory.FRAUD to "Job Fraud",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "Unsafe Site",
        SafetyComplaintCategory.OTHER_EMERGENCY to "Other Emergency"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "New",
        SafetyCaseStatus.IN_REVIEW to "In Review",
        SafetyCaseStatus.ADMIN_VERIFIED to "Admin Verified",
        SafetyCaseStatus.ACTION_TAKEN to "Action Taken",
        SafetyCaseStatus.REFERRED to "Referred",
        SafetyCaseStatus.CLOSED to "Closed"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "Starter",
        BadgeLevel.SILVER to "Silver",
        BadgeLevel.GOLD to "Gold",
        BadgeLevel.DIAMOND to "Diamond",
        BadgeLevel.PLATINUM to "Platinum"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "On Job Posting",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "On Verified Connection",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "On Application Accept"
    )
    override val indianStates = mapOf(
        "All States" to "All States",
        "Telangana" to "Telangana",
        "Andhra Pradesh" to "Andhra Pradesh",
        "Tamil Nadu" to "Tamil Nadu",
        "Karnataka" to "Karnataka",
        "Maharashtra" to "Maharashtra",
        "Gujarat" to "Gujarat",
        "Assam" to "Assam",
        "Bihar" to "Bihar",
        "Uttar Pradesh" to "Uttar Pradesh",
        "West Bengal" to "West Bengal",
        "Odisha" to "Odisha",
        "Kerala" to "Kerala",
        "Punjab" to "Punjab"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "Cloud Database & Row-Level Security",
        "otp_sms" to "OTP & Transactional SMS",
        "payment_gateway" to "UPI & Coin Payment Gateway",
        "face_liveness" to "Face Match & Liveness Verification",
        "translation" to "Live 12-Language Job Translation",
        "telecom_ivr" to "Keypad Phone Missed-Call & IVR",
        "owner_pin_auth" to "Owner Bootstrap, 4-Digit PIN & MFA Server"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "NOT CONFIGURED",
        IntegrationStatus.NEEDS_CREDENTIALS to "NEEDS CREDENTIALS",
        IntegrationStatus.CONNECTED to "CONNECTED"
    )

    override val msgOwnerPrivilegeBlocked = "Unauthorized: Public users can never register or switch into Owner / Super Admin."
    override val msgSwitchedPreviewFormat = "Switched preview account to %1\$s (%2\$s)."
    override val msgLanguageSavedFormat = "Language set to %1\$s (%2\$s)"
    override val msgEnterNameBeforeOtp = "Enter your full name before requesting OTP."
    override val msgEnterValidMobile = "Enter a valid 10-digit Indian mobile number."
    override val msgOtpDispatchedFormat = "Server OTP dispatched to %1\$s. Enter the code received on your phone."
    override val msgUnableSendOtp = "Unable to dispatch OTP. Configure live backend URL or verify your connection."
    override val msgSendOtpAndEnterCode = "Send an OTP first and enter the 4–6 digit code."
    override val msgOtpVerifiedCreateFormat = "Mobile OTP verified! Complete your details and tap Create %1\$s Profile."
    override val msgIncorrectOtp = "Incorrect or expired OTP. Please request a fresh OTP."
    override val msgServerOtpUnavailable = "Server OTP verification unavailable. Configure live backend."
    override val msgEnterFullName = "Full Name is required."
    override val msgVerifyMobileOtpFirst = "Verify your mobile number via OTP first."
    override val msgAccountCreatedFormat = "Welcome %1\$s! %2\$s account created (%3\$s)."
    override val msgLoggedInFormat = "Logged in as %1\$s (%2\$s)"
    override val msgSignedOut = "Signed out from user account. Returning to demo preview."
    override val msgDuplicateOwnerBlocked = "Security block: Owner already exists. Duplicate Owner creation is permanently disabled."
    override val msgBootstrapRequired = "Enter the Server Bootstrap Authorization Code."
    override val msgEnterPasswords = "Enter and confirm your Owner login password."
    override val msgPasswordsDoNotMatch = "Login passwords do not match."
    override val msgPasswordTooShort = "Password must be at least 8 characters."
    override val msgPinFourDigits = "Admin PIN must be exactly 4 digits."
    override val msgPinsDoNotMatch = "4-digit PIN confirmation does not match."
    override val msgOwnerCreatedFormat = "Owner profile created for %1\$s. Single-Owner registration is now permanently locked."
    override val msgOwnerLockedSession = "Owner session locked."
    override val msgOwnerTimedOut = "Owner session expired due to 5 minutes of inactivity. Enter PIN again."
    override val msgOwnerUnlocked = "Owner Master Control unlocked via server."
    override val msgInvalidPinAttemptsFormat = "Incorrect 4-digit Owner PIN. %1\$d attempt(s) remaining."
    override val msgTooManyPinAttemptsFormat = "Too many wrong PIN attempts. Locked for %1\$d seconds."
    override val msgOwnerSessionRequired = "Active Owner session required."
    override val msgVerifyOtpBeforePinChange = "Verify the server OTP sent to your registered mobile first."
    override val msgPinUpdatedSuccess = "Admin PIN updated securely on server and logged in audit history."
    override val msgDemoProfileUpdatedFormat = "Demo preview profile updated for %1\$s (%2\$s)"
    override val msgJobPostedFormat = "Demo job posted in %1\$s! Fee: %2\$d Coin(s)."
    override val msgAlreadyAppliedFormat = "Already applied to %1\$s"
    override val msgApplicationSentFormat = "Application sent for %1\$s"
    override val msgApplicationWithdrawnFormat = "Application %1\$s withdrawn"
    override val msgApplicationUpdatedFormat = "Application %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "Weekly Check-In recorded: 1 · I am safe."
    override val msgCheckInProblemRecorded = "Alert recorded (2 · Problem). Safety Desk notified for follow-up."
    override val msgCheckInAdminRequested = "Urgent callback requested (3 · Speak to Admin). Consented family alert queued."
    override val msgSafetyComplaintSubmittedFormat = "Safety case %1\$s logged for audit review."
    override val msgWithdrawalsFrozen = "URGENT FREEZE ENABLED: All payouts locked immediately."
    override val msgWithdrawalsUnfrozen = "Payouts unfrozen after verification check."
    override val msgOwnerNoticePublished = "Red LOBORO ADMIN NOTICE broadcast live."
}
