package com.example.domain.model

enum class UserRole {
    WORKER,
    EMPLOYER,
    OWNER_SUPER_ADMIN
}

/**
 * Normal public users can ONLY ever hold WORKER or EMPLOYER roles.
 * OWNER_SUPER_ADMIN is structurally absent from normal user registration/login models.
 */
enum class NormalAccountRole {
    WORKER,
    EMPLOYER;

    fun toUserRole(): UserRole = when (this) {
        WORKER -> UserRole.WORKER
        EMPLOYER -> UserRole.EMPLOYER
    }
}

enum class SupportedLanguage(
    val code: String,
    val bcp47: String,
    val englishName: String,
    val nativeName: String
) {
    HINDI("hi", "hi-IN", "Hindi", "हिन्दी"),
    ENGLISH("en", "en-IN", "English", "English"),
    GUJARATI("gu", "gu-IN", "Gujarati", "ગુજરાતી"),
    MARATHI("mr", "mr-IN", "Marathi", "मराठी"),
    TELUGU("te", "te-IN", "Telugu", "తెలుగు"),
    TAMIL("ta", "ta-IN", "Tamil", "தமிழ்"),
    BENGALI("bn", "bn-IN", "Bengali", "বাংলা"),
    ASSAMESE("as", "as-IN", "Assamese", "অসমীয়া"),
    KANNADA("kn", "kn-IN", "Kannada", "ಕನ್ನಡ"),
    MALAYALAM("ml", "ml-IN", "Malayalam", "മലയാളം"),
    PUNJABI("pa", "pa-IN", "Punjabi", "ਪੰਜਾਬੀ"),
    ODIA("or", "or-IN", "Odia", "ଓଡ଼ିଆ")
}

enum class JobCategoryId(
    val iconKey: String,
    val defaultName: String,
    val isSpecialSkill: Boolean = false
) {
    MASON("construction", "Mason / Rajmistri", isSpecialSkill = true),
    CONSTRUCTION_LABOUR("engineering", "Construction Labour"),
    GENERAL_LABOUR("work", "General Labour"),
    PLUMBER("plumbing", "Plumber", isSpecialSkill = true),
    ELECTRICIAN("electrical_services", "Electrician", isSpecialSkill = true),
    PAINTER("format_paint", "Painter"),
    TILE_WORKER("grid_view", "Tile Worker", isSpecialSkill = true),
    CARPENTER("carpenter", "Carpenter", isSpecialSkill = true),
    WELDER("whatshot", "Welder", isSpecialSkill = true),
    HOTEL_STAFF("hotel", "Hotel Staff"),
    COOK("restaurant", "Cook", isSpecialSkill = true),
    WAITER("room_service", "Waiter"),
    HOUSEKEEPING("cleaning_services", "Housekeeping"),
    SECURITY_GUARD("security", "Security Guard"),
    DRIVER("directions_car", "Driver", isSpecialSkill = true),
    DELIVERY_WORKER("delivery_dining", "Delivery Worker"),
    FACTORY_WORKER("factory", "Factory Worker"),
    PACKING_WORKER("inventory_2", "Packing Worker"),
    MACHINE_OPERATOR("precision_manufacturing", "Machine Operator", isSpecialSkill = true),
    AGRICULTURE_WORKER("agriculture", "Agriculture Worker"),
    OFFICE_ASSISTANT("badge", "Office Assistant"),
    SHOP_STAFF("storefront", "Shop Staff"),
    DOMESTIC_WORKER("home", "Domestic Worker"),
    OTHER_JOBS("more_horiz", "Other Jobs")
}

data class JobCategoryConfig(
    val id: JobCategoryId,
    val active: Boolean = true,
    val displayOrder: Int = id.ordinal,
    val customCoinFeeOverride: Int? = null
)

enum class JobType {
    DAILY,
    MONTHLY
}

enum class BadgeLevel(val label: String, val minDays: Int, val minRating: Double) {
    NONE("Starter", 0, 0.0),
    SILVER("Silver", 15, 4.0),
    GOLD("Gold", 45, 4.3),
    DIAMOND("Diamond", 120, 4.6),
    PLATINUM("Platinum", 250, 4.8)
}

data class JobListing(
    val id: String,
    val title: String,
    val originalLanguage: SupportedLanguage,
    val localizedTitles: Map<SupportedLanguage, String> = emptyMap(),
    val description: String,
    val localizedDescriptions: Map<SupportedLanguage, String> = emptyMap(),
    val jobType: JobType,
    val category: JobCategoryId,
    val wageOrSalaryInr: Int,
    val country: String = "India",
    val state: String,
    val district: String,
    val city: String,
    val distanceKm: Int,
    val workHours: String,
    val workersRequired: Int,
    val foodProvided: Boolean,
    val accommodationProvided: Boolean,
    val overtimeDetails: String,
    val paymentFrequency: String, // e.g., "Same-day evening" for Daily
    val weeklyHoliday: String = "", // Monthly only
    val leavePolicy: String = "", // Monthly only
    val joiningDate: String = "", // Monthly only
    val requiredSkills: List<String> = emptyList(),
    val employerLoboroId: String,
    val employerName: String,
    val employerBadge: BadgeLevel,
    val employerRating: Double,
    val expiryLabel: String,
    val isExpired: Boolean = false,
    val isDemoData: Boolean = true
)

enum class ApplicationStatus {
    APPLIED,
    UNDER_REVIEW,
    SHORTLISTED,
    ACCEPTED,
    REJECTED,
    WITHDRAWN,
    COMPLETED
}

data class JobApplication(
    val id: String,
    val jobId: String,
    val jobTitle: String,
    val jobType: JobType,
    val cityState: String,
    val wageLabel: String,
    val workerLoboroId: String,
    val workerName: String,
    val employerLoboroId: String,
    val employerName: String,
    val status: ApplicationStatus,
    val appliedAtLabel: String,
    val isDemoData: Boolean = true,
    val localizedTitles: Map<SupportedLanguage, String> = emptyMap()
)

enum class TransactionType {
    PURCHASE,
    GIFT,
    PROMO,
    REFERRAL,
    BADGE_REWARD,
    LOYALTY_SUPPORT,
    JOB_FEE,
    WITHDRAWAL
}

enum class TransactionStatus {
    PENDING,
    SUCCESSFUL,
    FAILED,
    REFUNDED
}

data class WalletTransaction(
    val id: String,
    val referenceId: String,
    val type: TransactionType,
    val coins: Int, // positive = credit, negative = debit
    val inrValue: Int,
    val status: TransactionStatus,
    val title: String,
    val timestampLabel: String,
    val withdrawableCredit: Boolean = true, // MANDATORY: all credits are 100% withdrawable
    val isDemoData: Boolean = true,
    val localizedTitles: Map<SupportedLanguage, String> = emptyMap()
)

data class WalletAccount(
    val ownerLoboroId: String,
    val availableCoins: Int,
    val coinValueInr: Int,
    val withdrawableBalanceInr: Int,
    val payoutDestinationMasked: String,
    val hasWalletPinSet: Boolean,
    val hasFaceEnrollment: Boolean,
    val withdrawalsFrozenByUser: Boolean,
    val transactions: List<WalletTransaction>
)

enum class FeeChargePoint {
    ON_JOB_POSTING,
    ON_VERIFIED_CONNECTION,
    ON_APPLICATION_ACCEPT
}

data class FeeConfig(
    val coinPriceInr: Int = 10,
    val normalDailyJobCoins: Int = 1,
    val specialDailyJobCoins: Int = 2,
    val monthlySalaryJobCoins: Int = 30,
    val chargePoint: FeeChargePoint = FeeChargePoint.ON_JOB_POSTING
)

enum class SafetyComplaintCategory {
    UNPAID_WAGES,
    PHYSICAL_ABUSE,
    HARASSMENT,
    FOOD_ACCOMMODATION,
    FRAUD,
    UNSAFE_WORKPLACE,
    OTHER_EMERGENCY
}

enum class SafetyCaseStatus {
    NEW,
    IN_REVIEW,
    ADMIN_VERIFIED,
    ACTION_TAKEN,
    REFERRED,
    CLOSED
}

enum class SafetyUrgency {
    HIGH,
    CRITICAL,
    MEDIUM
}

data class SafetyCase(
    val id: String,
    val workerLoboroId: String,
    val employerLoboroId: String,
    val jobTitle: String,
    val location: String,
    val category: SafetyComplaintCategory,
    val description: String,
    val timestampLabel: String,
    val urgency: SafetyUrgency,
    val status: SafetyCaseStatus,
    val actionHistory: List<String>,
    val isDemoData: Boolean = true,
    val localizedDescriptions: Map<SupportedLanguage, String> = emptyMap(),
    val localizedJobTitles: Map<SupportedLanguage, String> = emptyMap()
)

data class WeeklyCheckInState(
    val enabledWithConsent: Boolean = true,
    val frequencyDays: Int = 7,
    val lastCheckInLabel: String = "Demo: 5 days ago (Response: 1 - Safe)",
    val pendingPrompt: Boolean = true
)

data class AdminNotice(
    val id: String,
    val message: String,
    val actionLabel: String,
    val targetRoute: String,
    val targetAudience: String, // All Users / Workers / Employers / Region
    val regionScope: String,
    val expiryLabel: String,
    val isRead: Boolean = false,
    val timestampLabel: String,
    val isActive: Boolean = true,
    val localizedMessages: Map<SupportedLanguage, String> = emptyMap()
)

data class MasterFeatureControls(
    val appMaintenanceMode: Boolean = false,
    val workerRegistration: Boolean = true,
    val employerRegistration: Boolean = true,
    val jobPosting: Boolean = true,
    val jobSearching: Boolean = true,
    val dailyJobs: Boolean = true,
    val monthlyJobs: Boolean = true,
    val coinPurchases: Boolean = true,
    val withdrawals: Boolean = true,
    val jobFeesAndPricingEnabled: Boolean = true,
    val offers: Boolean = true,
    val referralSystem: Boolean = true,
    val notifications: Boolean = true,
    val accountManagementEnabled: Boolean = true,
    val categoryManagementEnabled: Boolean = true,
    val badgeSystem: Boolean = true,
    val loyaltySupport: Boolean = true,
    val emergencySafetySystemEnabled: Boolean = true,
    val ivrSupport: Boolean = true,
    val smsAlerts: Boolean = true,
    val languageSettingsEnabled: Boolean = true,
    val regionalAvailabilityEnabled: Boolean = true,
    val vipIdReservationsEnabled: Boolean = true,
    val moderationReportsEnabled: Boolean = true,
    val paymentGatewayEnabled: Boolean = true,
    val activeScopeLabel: String = "Global · India (All States)"
)

data class OwnerProfileSummary(
    val loboroId: String,
    val fullName: String,
    val maskedMobile: String,
    val initializedAtLabel: String,
    val preferredLanguage: SupportedLanguage = SupportedLanguage.ENGLISH
)

data class OwnerSessionState(
    val isOwnerInitialized: Boolean = false,
    val ownerProfile: OwnerProfileSummary? = null,
    val isAuthenticated: Boolean = false,
    val sessionToken: String? = null,
    val lastActivityEpochMs: Long = 0L,
    val sessionTimeoutMs: Long = 5 * 60 * 1000L, // 5-minute inactivity auto-logout
    val failedPinAttempts: Int = 0,
    val lockoutUntilEpochMs: Long = 0L,
    val pinStatusMessage: String? = null
)

data class OwnerRegistrationFormState(
    val setupAuthorizationCode: String = "",
    val fullName: String = "",
    val mobileNumber: String = "",
    val otpSessionId: String? = null,
    val otpSent: Boolean = false,
    val otpCodeInput: String = "",
    val otpVerifiedOnServer: Boolean = false,
    val loginPassword: String = "",
    val confirmLoginPassword: String = "",
    val adminPin: String = "",
    val confirmAdminPin: String = "",
    val preferredLanguage: SupportedLanguage = SupportedLanguage.ENGLISH,
    val isSubmitting: Boolean = false,
    val statusMessage: String? = null,
    val isError: Boolean = false
)

enum class PinChangeStep {
    SEND_OTP_TO_REGISTERED_MOBILE,
    ENTER_OTP,
    ENTER_NEW_PIN,
    COMPLETED
}

data class OwnerPinChangeState(
    val step: PinChangeStep = PinChangeStep.SEND_OTP_TO_REGISTERED_MOBILE,
    val otpSessionId: String? = null,
    val otpCodeInput: String = "",
    val otpVerifiedOnServer: Boolean = false,
    val newPinInput: String = "",
    val confirmPinInput: String = "",
    val statusMessage: String? = null,
    val isError: Boolean = false
)

data class NormalUserRegistrationFormState(
    val selectedRole: NormalAccountRole = NormalAccountRole.WORKER,
    val fullName: String = "",
    val mobileNumber: String = "",
    val homeState: String = "Assam",
    val homeDistrict: String = "Barpeta",
    val currentCityState: String = "Hyderabad, Telangana",
    val skillsText: String = "Mason, Tile Work",
    val emergencyContactName: String = "",
    val emergencyContactPhone: String = "",
    val emergencyConsent: Boolean = true,
    val preferredLanguage: SupportedLanguage = SupportedLanguage.ENGLISH,
    val otpSessionId: String? = null,
    val otpSent: Boolean = false,
    val otpCodeInput: String = "",
    val otpVerifiedOnServer: Boolean = false,
    val isSubmitting: Boolean = false,
    val statusMessage: String? = null,
    val isError: Boolean = false
)

data class NormalUserLoginFormState(
    val mobileNumber: String = "",
    val otpSessionId: String? = null,
    val otpSent: Boolean = false,
    val otpCodeInput: String = "",
    val isSubmitting: Boolean = false,
    val statusMessage: String? = null,
    val isError: Boolean = false
)

data class NormalUserSessionState(
    val isSignedIn: Boolean = false,
    val sessionToken: String? = null,
    val signedInProfile: UserProfile? = null
)

data class OwnerAuditLogEntry(
    val id: String,
    val timestampLabel: String,
    val actorId: String,
    val action: String,
    val details: String
)

data class LoyaltyProgramConfig(
    val minMembershipMonths: Int = 12,
    val minVerifiedWorkdays: Int = 180,
    val minBadgeLevel: BadgeLevel = BadgeLevel.GOLD,
    val minRating: Double = 4.5,
    val approvedSupportAmountInr: Int = 5000,
    val programBudgetInr: Int = 2500000,
    val paymentSchedule: String = "Quarterly approved disbursement"
)

data class UserProfile(
    val loboroId: String,
    val role: UserRole,
    val fullName: String,
    val mobileMasked: String,
    val homeState: String,
    val homeDistrict: String,
    val currentCityState: String,
    val willingToRelocate: Boolean,
    val skills: List<String>,
    val experienceYears: Int,
    val jobPreference: JobType,
    val badgeLevel: BadgeLevel,
    val verifiedWorkdays: Int,
    val completedJobs: Int,
    val rating: Double,
    val memberMonths: Int,
    val emergencyContactName: String,
    val emergencyContactPhoneMasked: String,
    val emergencyConsentGiven: Boolean,
    val profilePhotoUri: String? = null,
    val faceRegistrationCaptured: Boolean = false,
    val isOwnerAccount: Boolean = false,
    val preferredLanguage: SupportedLanguage = SupportedLanguage.ENGLISH
)

data class ChatMessage(
    val id: String,
    val senderLoboroId: String,
    val senderLabel: String,
    val text: String,
    val timestampLabel: String
)

data class ChatThread(
    val id: String,
    val jobId: String,
    val jobTitle: String,
    val workerLoboroId: String,
    val employerLoboroId: String,
    val employerName: String,
    val phoneNumberShared: Boolean = false, // Privacy: private phone numbers hidden by default
    val isBlocked: Boolean = false,
    val messages: List<ChatMessage>
)

object LoboroIdRegistry {
    // VIP & special-number combinations strictly reserved for Owner allocation only; never issued to normal users.
    val reservedVipIds: Set<String> = setOf(
        "LB1", "LB2", "LB3", "LB4", "LB5", "LB7", "LB9",
        "LB10", "LB11", "LB22", "LB33", "LB44", "LB55", "LB77", "LB99",
        "LB100", "LB101", "LB111", "LB123", "LB222", "LB333", "LB444", "LB555",
        "LB666", "LB777", "LB888", "LB999", "LB1000", "LB1111", "LB1234",
        "LB2222", "LB3333", "LB7777", "LB9999", "OWNER-MASTER-01"
    )

    private val issuedIds = mutableSetOf("LB269", "LB049", "LB3232", "LB418", "LB502")

    fun isReservedVipId(id: String): Boolean {
        val normalized = id.uppercase().trim()
        if (normalized.startsWith("OWNER") || normalized.startsWith("ADMIN")) return true
        if (reservedVipIds.contains(normalized)) return true
        val numPart = normalized.removePrefix("LB").toIntOrNull()
        return numPart != null && numPart < 2000 && !issuedIds.contains(normalized)
    }

    fun generateNextStandardId(seedNumber: Int): String {
        var candidateNum = seedNumber.coerceAtLeast(2000)
        while (true) {
            val candidate = "LB$candidateNum"
            if (!isReservedVipId(candidate) && !issuedIds.contains(candidate)) {
                issuedIds.add(candidate)
                return candidate
            }
            candidateNum++
        }
    }
}
