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

object GujaratiStrings : AppStrings {
    override val appName = "LOBORO"
    override val tagline = "ગ્લોબલ જોબ અને સેવા"
    override val demoPreviewBanner = "ડેમો પૂર્વાવલોકન ડેટા · લાઇવ સિસ્ટમ માટે સેટિંગ્સમાં બેકએન્ડ API ઉમેરો"
    override val verifiedNormalAccountBanner = "ચકાસાયેલ વપરાશકર્તા ખાતું · LOBORO ID %1\$s (%2\$s)"
    override val adminNoticeHeading = "LOBORO એડમિન સૂચના"
    override val maintenanceModeBanner = "મેન્ટેનન્સ મોડ ચાલુ છે · ભરતી અને વોલેટ અસ્થાયી બંધ છે. કટોકટી 112 અને સુરક્ષા ડેસ્ક ચાલુ છે."
    override val navHome = "હોમ"
    override val navSearchJobs = "કામ શોધો"
    override val navPostJob = "કામ મૂકો"
    override val navWallet = "વોલેટ"
    override val navMyApplications = "મારી અરજીઓ"
    override val navMyJobs = "મારા કામ"
    override val navNotifications = "સૂચનાઓ"
    override val navHelpSafety = "મદદ અને સુરક્ષા"
    override val navProfile = "પ્રોફાઇલ"
    override val navSettings = "સેટિંગ્સ"
    override val navAdmin = "માલિક નિયંત્રણ"
    override val navBadgesLoyalty = "બેજ અને લોયલ્ટી"
    override val navIvrKeypad = "કીપેડ અને IVR"
    override val backLabel = "પાછળ"
    override val homeLabel = "હોમ"
    override val languageLabel = "ભાષા"
    override val languageSelectorTitle = "12 ભાષાઓ"
    override val activeBadgeLabel = "સક્રિય"
    override val closeLabel = "બંધ કરો"
    override val okLabel = "બરાબર"
    override val understoodLabel = "સમજાયું"
    override val cancelLabel = "રદ કરો"
    override val doneLabel = "પૂર્ણ"
    override val confirmActionLabel = "પુષ્ટિ કરો"
    override val resetLabel = "રીસેટ"
    override val sendLabel = "મોકલો"

    override val shareAppTitle = "LOBORO એપ શેર કરો"
    override val shareAppCta = "મિત્રોને શેર કરો અને ઈનામ મેળવો"
    override val yourReferralLinkLabel = "તમારી રેફરલ લિંક"
    override val loboroLinkLabel = "LOBORO લિંક"
    override val shareMenuButton = "શેર મેનૂ"
    override val copyLinkButton = "લિંક કોપી કરો"
    override val referralCopiedToast = "રેફરલ સંદેશ કોપી થયો"
    override val openingShareMenuToast = "શેર મેનૂ ખૂલી રહ્યું છે"
    override val shareMessageTemplate = "LOBORO ગ્લોબલ જોબ અને સેવામાં જોડાઓ! ભારતભરમાં દૈનિક કે માસિક પગારનું કામ મેળવો. મારો રેફરલ ID %1\$s વાપરો: %2\$s"

    override val registerWorkerEmployerCta = "કામદાર / નોકરીદાતા તરીકે નોંધણી કરો"
    override val logInLabel = "લોગ ઇન"
    override val signOutLabel = "સાઇન આઉટ"
    override val voiceSearchHint = "કામ કે શહેર બોલો અથવા લખો (દા.ત. હૈદરાબાદમાં કડિયો)"
    override val tapMicToSpeak = "બોલીને કામ શોધવા માઇક દબાવો"
    override val listeningStatus = "સાંભળી રહ્યા છીએ... તમારું કામ બોલો"
    override val stopListening = "સાંભળવું બંધ કરો"
    override val searchAction = "શોધો"
    override val retryVoice = "ફરીથી બોલો"
    override val voiceMicPermissionNeeded = "માઇકની પરવાનગી ફક્ત તમે માઇક બટન દબાવો ત્યારે જ માંગવામાં આવે છે."
    override val voiceUnavailableHonest = "આ ઉપકરણમાં વોઇસ ઓળખ સેવા ઇન્સ્ટોલ નથી. ક્લાઉડ વોઇસ સેવા ઉમેરો અથવા નીચેનો વિકલ્પ પસંદ કરો."
    override val voiceNoMatchError = "અવાજ સ્પષ્ટ મળ્યો નહીં. સ્પષ્ટ બોલો અથવા નીચેનું ઉદાહરણ પસંદ કરો."
    override val voiceNetworkError = "નેટવર્ક ભૂલ. ઇન્ટરનેટ તપાસો અથવા કામ લખો."
    override val voiceStoppedError = "વોઇસ ઇનપુટ અટકી ગયું (કોડ %1\$d). ટાઇપ કરો અથવા ફરી પ્રયાસ કરો."
    override val voicePrivacyHint = "ગોપનીયતા: માઇક સામાન્ય રીતે બંધ રહે છે અને ફક્ત બટન દબાવવાથી જ ચાલુ થાય છે."
    override val clearSearchDesc = "શોધ સાફ કરો"
    override val spokenSamples = listOf(
        "હૈદરાબાદમાં કડિયો" to "Mason",
        "પુણેમાં ઇલેક્ટ્રિશિયન" to "Electrician",
        "ચેન્નાઈ હોટેલ રસોઈયો" to "Cook",
        "વિજયવાડા ડ્રાઈવર" to "Driver",
        "સુરત પેકિંગ કામ" to "Packing"
    )
    override val dailyJobsTitle = "રોજનું કામ (Daily)"
    override val dailyJobsSubtitle = "દૈનિક મજૂરી · માસિક કામથી અલગ યાદી"
    override val monthlyJobsTitle = "મહિનાના પગારનું કામ"
    override val monthlyJobsSubtitle = "નક્કી માસિક પગાર · રજા અને રહેવાની વિગતો"
    override val jobsCountFormat = "%1\$d"
    override val activeCategoriesFormat = "%1\$d"
    override val categoriesHeading = "કામની શ્રેણીઓ (24)"
    override val walletStripSummaryFormat = "%1\$d કોઇન (₹%2\$d) · 100%% ઉપાડી શકાય તેવા"

    override val outOfStateTitle = "બીજા રાજ્યમાં અને વૈશ્વિક કામ શોધો"
    override val willingToRelocate = "બીજા રાજ્યમાં જવા તૈયાર છું"
    override val filterCountry = "દેશ"
    override val filterState = "રાજ્ય"
    override val filterDistrict = "જિલ્લો"
    override val filterCity = "શહેર"
    override val filterDistance = "અંતર"
    override val upToKmFormat = "%1\$d કિમી સુધી"
    override val filterFoodIncluded = "ભોજન સુવિધા"
    override val filterAccommodation = "રહેવાની વ્યવસ્થા"
    override val allCategoriesLabel = "બધી શ્રેણીઓ"
    override val noMatchingJobsTitle = "ફિલ્ટર મુજબ કોઈ કામ મળ્યું નથી"
    override val noMatchingJobsSubtitle = "ફિલ્ટર રીસેટ કરો અથવા 'બીજા રાજ્યમાં કામ' ચાલુ કરો."
    override val showAllJobsButton = "બધા કામ બતાવો"
    override val dailyWageJobBadge = "દૈનિક મજૂરીનું કામ"
    override val monthlySalaryJobBadge = "માસિક પગારનું કામ"
    override val demoDataTag = "ડેમો"
    override val originalLangFormat = "મૂળ ભાષા: %1\$s"
    override val preTranslatedPreviewNote = "પૂર્વ-અનુવાદિત પૂર્વાવલોકન ચાલુ છે. લાઇવ કામ માટે સેટિંગ્સમાં ટ્રાન્સલેશન API ઉમેરો."
    override val configureTranslationApiNote = "બધી 12 ભાષામાં લાઇવ અનુવાદ માટે સેટિંગ્સમાં ટ્રાન્સલેશન API કી ઉમેરો."
    override val translatedToggle = "અનુવાદિત"
    override val originalToggle = "મૂળ"
    override val compensationLabel = "મહેનતાણું / પગાર"
    override val locationLabel = "સ્થળ"
    override val employerLabel = "નોકરીદાતા"
    override val vacanciesUnit = "જગ્યાઓ"
    override val perDayFormat = "₹%1\$d / દિવસ"
    override val perMonthFormat = "₹%1\$d / મહિનો"
    override val coinsCountFormat = "%1\$d કોઇન"
    override val foodBadge = "ભોજન"
    override val stayBadge = "રહેઠાણ"
    override val shareJobButton = "કામ શેર કરો"
    override val applyNow = "અરજી કરો"
    override val saveJob = "સેવ કરો"
    override val negotiateChat = "વાતચીત / ચેટ"
    override val reportJob = "ફરિયાદ કરો"
    override val foodAvailable = "ભોજન સામેલ"
    override val accommodationAvailable = "રહેઠાણ સામેલ"
    override val notProvided = "સામેલ નથી"
    override val workersNeeded = "જરૂરી કામદારો"
    override val workHoursLabel = "કામના કલાકો"
    override val overtimeLabel = "ઓવરટાઇમ"
    override val paymentFreqLabel = "ચુકવણી"
    override val weeklyHolidayLabel = "સાપ્તાહિક રજા"
    override val leavePolicyLabel = "રજાના નિયમો"
    override val joiningDateLabel = "જોડાવાની તારીખ"
    override val expiryLabel = "સમાપ્તિ"
    override val translatedBadgeLabel = "અનુવાદિત"

    override val postingPausedFormat = "માલિક નિયંત્રણ (%1\$s) દ્વારા હાલમાં કામ મૂકવાનું બંધ છે."
    override val selectCategoryLabel = "શ્રેણી પસંદ કરો (24 શ્રેણીઓ)"
    override val jobTitleLabel = "કામનું શીર્ષક"
    override val jobTitlePlaceholder = "દા.ત. હોસ્ટેલ બાંધકામ માટે 4 કડિયા જોઈએ છે"
    override val jobDescLabel = "કામની વિગત"
    override val jobDescPlaceholder = "કામની માહિતી, સુરક્ષા સાધનો, ભોજન અને રહેઠાણની વિગત"
    override val dailyWageInrLabel = "દૈનિક મજૂરી (₹)"
    override val monthlySalaryInrLabel = "માસિક પગાર (₹)"
    override val vacanciesLabel = "ખાલી જગ્યાઓ"
    override val cityTownLabel = "શહેર / ગામ"
    override val stateLabel = "રાજ્ય"
    override val transparentJobFeeTitle = "પારદર્શક જોબ ફી: %1\$d કોઇન (₹%2\$d)"
    override val configuredByOwnerSub = "માલિક દ્વારા નક્કી · ફી સમય: %1\$s · ઉપલબ્ધ: %2\$d કોઇન"
    override val confirmAndPostJobButton = "પુષ્ટિ કરો અને કામ મૂકો (%1\$d કોઇન)"

    override val walletBalanceTitle = "LOBORO કોઇન બેલેન્સ"
    override val withdrawableValueFormat = "₹%1\$d ઉપાડી શકાય તેવું મૂલ્ય (1 કોઇન = ₹%2\$d)"
    override val withdrawableRuleTitle = "100% સમાન ઉપાડ નિયમ"
    override val withdrawableRuleBody = "ખરીદેલા, ગિફ્ટ, ઓફર, રેફરલ, બેજ કે લોયલ્ટીના દરેક કોઇનનું રોકડ મૂલ્ય સમાન છે અને 100% ઉપાડી શકાય છે. કોઈ કોઇન લોક નથી."
    override val buyCoins = "કોઇન ખરીદો"
    override val withdrawCoins = "પૈસા ઉપાડો"
    override val walletActionsPausedNote = "કેટલીક વોલેટ સેવાઓ માલિક દ્વારા બંધ છે. તમારું હાલનું બેલેન્સ અને મંજૂર રિફંડ સુરક્ષિત છે."
    override val coinPackagesTitle = "કોઇન પેકેજ (પારદર્શક મૂલ્ય)"
    override val bankSecurityTitle = "બેંક / UPI અને ચહેરા ચકાસણી સુરક્ષા"
    override val payoutDestinationLabel = "ચકાસાયેલ ચુકવણી ખાતું: %1\$s"
    override val bankSecurityStepsNote = "બેંક/UPI બદલવાની ફરજિયાત તપાસ: રજિસ્ટર્ડ મોબાઇલ OTP + લાઇવ સેલ્ફી મેચ + અસ્થાયી ચુકવણી રોક."
    override val changeBankUpiButton = "બેંક / UPI બદલો (OTP + ફેસ મેચ)"
    override val unfreezePayoutsButton = "ઉપાડ અનલોક કરો"
    override val lostPhoneFreezeButton = "ફોન ખોવાયો? ઉપાડ તરત બંધ કરો"
    override val payoutFreezeActiveNote = "ઉપાડ લોક સક્રિય છે. ઓળખની ફરી ચકાસણી ન થાય ત્યાં સુધી કોઈ ચુકવણી થશે નહીં."
    override val transactionHistory = "કોઇન વ્યવહાર ખાતાવહી"
    override val demoLedgerSuffix = "(ડેમો ખાતાવહી)"
    override val buyCoinsDialogTitleFormat = "%1\$d કોઇન ખરીદો (₹%2\$d)"
    override val paymentNotConnectedBody = "લાઇવ Razorpay / Cashfree UPI પેમેન્ટ હજુ જોડાયેલ નથી. વાસ્તવિક નાણાં સ્વીકારતા પહેલા પ્રોડક્શન કી ઉમેરો."
    override val withdrawDialogTitleFormat = "₹%1\$d ઉપાડો"
    override val withdrawDialogBodyFormat = "સંપૂર્ણ બેલેન્સ (%1\$d કોઇન) સમાન રોકડ મૂલ્ય સાથે 100%% ઉપાડી શકાય છે.\nખાતું: %2\$s\n\nઆ બિલ્ડમાં લાઇવ IMPS / UPI ગેટવે જોડાયેલ નથી."
    override val bankChangeDialogTitle = "3-તબક્કાની બેંક / UPI સુરક્ષા"
    override val bankChangeDialogBody = "ફોન ખોવાય ત્યારે રક્ષણ માટે બેંક/UPI બદલવા જરૂરી:\n1. રજિસ્ટર્ડ મોબાઇલ OTP ચકાસણી\n2. નોંધણી ફોટો સાથે લાઇવ ચહેરો મેચ\n3. ચુકવણી પહેલા સુરક્ષા રાહ સમય"
    override val receiptDialogTitle = "વ્યવહાર રસીદ"
    override val receiptIdLabel = "TX ID: %1\$s"
    override val receiptRefLabel = "સંદર્ભ: %1\$s"
    override val receiptTypeLabel = "પ્રકાર: %1\$s"
    override val receiptCoinsLabel = "કોઇન: %1\$s%2\$d (₹%3\$d)"
    override val receiptStatusLabel = "સ્થિતિ: %1\$s"
    override val receiptTimeLabel = "સમય: %1\$s"
    override val receiptWithdrawableYes = "ઉપાડ પાત્રતા: 100% હા"

    override val employerAppsHeading = "અરજીઓ અને સીધી વાતચીત"
    override val secureChatHeading = "સુરક્ષિત કામદાર ↔ નોકરીદાતા ચેટ"
    override val secureChatSubtitle = "તમે જાતે શેર ન કરો ત્યાં સુધી ફોન નંબર છુપાયેલો રહે છે. ખોલવા કે બ્લોક કરવા ટેપ કરો."
    override val chatButton = "ચેટ"
    override val workerEmployerLineFormat = "કામદાર: %1\$s (%2\$s) · નોકરીદાતા: %3\$s"
    override val shortlistButton = "શોર્ટલિસ્ટ"
    override val acceptButton = "સ્વીકારો"
    override val withdrawButton = "પાછું ખેંચો"
    override val phoneHiddenPrivacy = "ગોપનીયતા ચાલુ: બંને પક્ષોની સંમતિ વિના ખાનગી ફોન નંબર છુપાયેલો રહે છે."
    override val blockUserLabel = "બ્લોક"
    override val userBlockedNotice = "તમે આ વાતચીત બ્લોક કરી છે. જરૂર પડે તો સુરક્ષા ડેસ્ક પર ફરિયાદ કરો."
    override val chatPlaceholder = "તમારી ભાષામાં સંદેશ લખો..."

    override val automaticBadgePrefix = "ઓટોમેટિક બેજ: %1\$s"
    override val badgeStatsFormat = "રેટિંગ %1\$.1f ★ · %2\$d ચકાસાયેલ કામના દિવસો · %3\$d પૂર્ણ કામ"
    override val progressToFormat = "%1\$s બેજ તરફ પ્રગતિ: %2\$d / %3\$d દિવસ"
    override val badgeAntiAbuseNote = "બેજ ફક્ત વાસ્તવિક પૂર્ણ કામ, ચકાસાયેલ હાજરી અને નિષ્પક્ષ રેટિંગથી મળે છે — વેચાતા નથી."
    override val badgeTiersTitle = "5 ઓટોમેટિક બેજ સ્તર"
    override val minWorkdaysFormat = "ઓછામાં ઓછા %1\$d કામના દિવસો · %2\$.1f★ રેટિંગ"
    override val badgeAppealsNote = "ન્યાયી રક્ષણ: અચાનક શંકાસ્પદ 1-સ્ટાર રેટિંગની અપીલ પર સમીક્ષા થાય છે."
    override val loyaltyTitle = "વરિષ્ઠતા અને લોયલ્ટી નાણાકીય સહાય"
    override val loyaltySubtitle = "પારદર્શક ત્રિમાસિક કલ્યાણ અને માઇલસ્ટોન બોનસ"
    override val loyaltyDisclaimer = "ફરજિયાત જાહેરાત: આ વીમો નથી અને નિશ્ચિત માસિક પેન્શન પણ નથી. તે પાત્રતા, કામના દિવસો, બજેટ અને મંજૂરીને આધીન છે."
    override val loyaltyMinMembershipFormat = "ઓછામાં ઓછું સભ્યપદ: %1\$d મહિના"
    override val loyaltyWorkdaysFormat = "ચકાસાયેલ કામના દિવસો: %1\$d+ દિવસ"
    override val loyaltyRequiredBadgeFormat = "જરૂરી બેજ: %1\$s+"
    override val loyaltyRequiredRatingFormat = "ઓછામાં ઓછું રેટિંગ: %1\$.1f★"
    override val loyaltyBudgetFormat = "મંજૂર સહાય: ₹%1\$d · બજેટ પૂલ: ₹%2\$d (%3\$s)"

    override val safetyEmergencyTitle = "કામદાર સુરક્ષા અને કટોકટી મદદ"
    override val callEmergency112 = "કટોકટી 112 પર કૉલ કરો"
    override val weeklyCheckInTitle = "સાપ્તાહિક સુરક્ષા તપાસ"
    override val weeklyCheckInQuestion = "શું તમે સુરક્ષિત છો?"
    override val checkInOpt1 = "1 · હું સુરક્ષિત છું"
    override val checkInOpt2 = "2 · મને સમસ્યા છે"
    override val checkInOpt3 = "3 · LOBORO એડમિન સાથે વાત કરો"
    override val reportSafetyIssue = "સુરક્ષા / પગાર ફરિયાદ નોંધાવો"
    override val safetyOperationalNote = "ચુકવણી કે કામ મૂકવું બંધ હોય ત્યારે પણ સુરક્ષા સેવા હંમેશા ચાલુ રહે છે."
    override val safetyDisclaimerNote = "તાત્કાલિક જોખમમાં સીધા 112 પર કૉલ કરો. નિષ્પક્ષ મધ્યસ્થી માટે LOBORO ફરિયાદ નોંધે છે."
    override val everyDaysFormat = "દર %1\$d દિવસે"
    override val lastStatusFormat = "છેલ્લી તપાસ: %1\$s"
    override val checkInNoResponseNote = "સતત 2 તપાસ ચૂકી જવાય અથવા સમસ્યા પસંદ થાય તો LOBORO SMS, એડમિન તપાસ અને સંમતિથી પરિવારને જાણ કરે છે."
    override val consentEmergencyTitle = "સંમતિ સાથે કટોકટી લોકેશન અને પરિવાર સંપર્ક"
    override val workerIdLabel = "કામદાર ID: %1\$s"
    override val homeOriginLabel = "મૂળ વતન: %1\$s, %2\$s"
    override val currentJobCityLabel = "હાલનું કામનું શહેર: %1\$s"
    override val emergencyContactLabel = "કટોકટી સંપર્ક: %1\$s (%2\$s)"
    override val consentGranted = "સંમતિ આપેલ"
    override val consentPending = "સંમતિ બાકી"
    override val employerLoboroIdInput = "નોકરીદાતા LOBORO ID (દા.ત. LB819)"
    override val currentSiteInput = "હાલનું કામનું શહેર / સાઇટ"
    override val describeIssueInput = "સુરક્ષા કે મજૂરીની સમસ્યા લખો"
    override val submitSafetyDeskButton = "સુરક્ષા ડેસ્ક પર મોકલો"
    override val safetyCasesHeading = "તાજેતરના સુરક્ષા કેસ (ઓડિટ યોગ્ય)"
    override val ivrTitle = "કીપેડ ફોન મિસ્ડ-કૉલ અને IVR મેનૂ"
    override val ivrSubtitle = "સ્માર્ટફોન વિના ટોલ-ફ્રી / મિસ્ડ-કૉલ કોલબેક દ્વારા કામ કરે છે"
    override val ivrArchNote = "લાઇવ સિસ્ટમ Exotel / Knowlarity / Twilio Voice સાથે જોડાય છે. 12-ભાષા વોઇસ મેનૂ તપાસવા બટન દબાવો."
    override val ivrMenuTitle = "LOBORO વોઇસ IVR · %1\$s"
    override val ivrInitialPrompt = "LOBORO માં સ્વાગત છે! વોઇસ મેનૂ સાંભળવા કીપેડ નંબર દબાવો."
    override val pressKeyFormat = "%1\$s દબાવો → %2\$s"
    override val ivrSelectedSummaryFormat = "પસંદ કરેલ [%1\$s] (%2\$s): %3\$s"
    override val ivrOptionLabels = listOf(
        "1" to "આજના દૈનિક મજૂરીના કામ",
        "2" to "મહિનાના પગારના કામ",
        "3" to "સાપ્તાહિક સુરક્ષા તપાસ ('શું તમે સુરક્ષિત છો?')",
        "4" to "વોલેટ કોઇન અને છેલ્લી સ્થિતિ સાંભળો",
        "5" to "તાત્કાલિક એડમિન કોલબેક",
        "6" to "અરજીની સ્થિતિ તપાસો",
        "0" to "પસંદગીની વોઇસ ભાષા બદલો"
    )

    override val userRegTitle = "કામદાર અને નોકરીદાતા નોંધણી"
    override val userLoginTitle = "કામદાર અને નોકરીદાતા લોગ ઇન"
    override val userAuthSubtitle = "OTP-ચકાસાયેલ સામાન્ય વપરાશકર્તા ખાતું · ગુપ્ત માલિક સિસ્ટમથી અલગ"
    override val registerTab = "નોંધણી"
    override val loginTab = "લોગ ઇન"
    override val dbOtpNotConnectedTitle = "બેકએન્ડ ડેટાબેઝ / OTP જોડાયેલ નથી"
    override val dbOtpNotConnectedBody = "લાઇવ કામદાર અને નોકરીદાતા ખાતા સાચવવા LOBORO_BACKEND_URL ઉમેરો."
    override val selectAccountTypeStep = "1. ખાતાનો પ્રકાર પસંદ કરો"
    override val workerAccountLabel = "કામદાર"
    override val employerAccountLabel = "નોકરીદાતા"
    override val regPausedForRoleFormat = "%1\$s નોંધણી હાલમાં માલિક દ્વારા બંધ છે."
    override val preferredLanguageLabel = "પસંદગીની એપ ભાષા (12 ભાષાઓ)"
    override val fullNameStepLabel = "2. પૂરું નામ *"
    override val businessNameStepLabel = "2. વ્યવસાય / કોન્ટ્રાક્ટરનું પૂરું નામ *"
    override val mobileStepLabel = "3. મોબાઇલ નંબર (10 અંક) *"
    override val sendRegOtpButton = "OTP મોકલો"
    override val resendMobileOtpButton = "ફરી OTP મોકલો"
    override val enterOtpStepLabel = "4. મોબાઇલ OTP દાખલ કરો *"
    override val verifyOtpButton = "OTP ચકાસો"
    override val verifiedLabel = "ચકાસાયેલ"
    override val mobileVerifiedNote = "સર્વર પર મોબાઇલ ચકાસાયો"
    override val homeStateLabel = "મૂળ રાજ્ય"
    override val homeDistrictLabel = "મૂળ જિલ્લો"
    override val stateShortLabel = "રાજ્ય"
    override val cityShortLabel = "શહેર"
    override val workCityStateLabel = "હાલનું કામનું શહેર અને રાજ્ય"
    override val businessLocationLabel = "વ્યવસાય શહેર અને રાજ્ય"
    override val skillsCategoriesLabel = "કૌશલ્ય / કામ (દા.ત. કડિયો, ઇલેક્ટ્રિશિયન)"
    override val hiringCategoriesLabel = "ભરતી શ્રેણીઓ"
    override val emergencyContactNameLabel = "કટોકટી પરિવાર સંપર્ક નામ"
    override val emergencyContactPhoneLabel = "કટોકટી સંપર્ક ફોન"
    override val uniqueLbIdNotice = "પૂર્ણ થતા સર્વર કાયમી LB ID (LB2000+) આપશે. VIP અને માલિક નંબર સુરક્ષિત છે."
    override val creatingProfileLabel = "પ્રોફાઇલ બની રહી છે..."
    override val createProfileButton = "કામદાર / નોકરીદાતા પ્રોફાઇલ બનાવો"
    override val loginHeading = "રજિસ્ટર્ડ મોબાઇલ OTP થી લોગ ઇન કરો"
    override val loginSubtitle = "કામદાર કે નોકરીદાતા તરીકે નોંધાયેલ મોબાઇલ નંબર દાખલ કરો."
    override val registeredMobileLabel = "રજિસ્ટર્ડ મોબાઇલ નંબર"
    override val sendLoginOtpButton = "લોગ ઇન OTP મોકલો"
    override val resendLoginOtpButton = "OTP ફરી મોકલો"
    override val enterLoginOtpLabel = "લોગ ઇન OTP દાખલ કરો"
    override val verifyingOtpLabel = "ચકાસી રહ્યા છીએ..."
    override val verifyOtpOpenHomeButton = "OTP ચકાસો અને હોમ ખોલો"
    override val backToHomepageButton = "હોમપેજ પર પાછા જાઓ"

    override val loboroIdLabel = "LOBORO ID"
    override val roleLabel = "ભૂમિકા"
    override val offlinePreviewHeading = "ઓફલાઇન પ્રોફાઇલ અને ફોટો પૂર્વાવલોકન"
    override val offlinePreviewCardTitle = "પ્રોફાઇલ બનાવો / સુધારો (ઓફલાઇન પૂર્વાવલોકન)"
    override val offlinePreviewCardSubtitle = "લાઇવ ડેટાબેઝ જોડાય ત્યાં સુધી સ્થાનિક પૂર્વાવલોકન તરીકે સાચવે છે."
    override val workLocationLabel = "કામનું સ્થળ (શહેર, રાજ્ય)"
    override val businessAddressLabel = "વ્યવસાય શહેર, રાજ્ય"
    override val skillsExpLabel = "કૌશલ્ય / કામનો પ્રકાર"
    override val businessCatLabel = "વ્યવસાય પ્રકાર / ભરતી શ્રેણીઓ"
    override val aadhaarPrivacyNote = "ડેટા સુરક્ષા: LOBORO ઉપકરણ પર મૂળ આધાર ફોટો રાખતું નથી — ફક્ત ચકાસાયેલ હેશ અને સંમતિ રાખે છે."
    override val selectProfilePhotoBtn = "પ્રોફાઇલ ફોટો પસંદ કરો (ફોટો પિકર)"
    override val photoSelectedBtn = "ફોટો પસંદ થયો ✓"
    override val offlineConsentCheck = "હું સુરક્ષા તપાસ અને સંપર્ક ન થાય ત્યારે પરિવારને જાણ કરવાની સંમતિ આપું છું."
    override val previewProfileBtn = "પૂર્વાવલોકન પ્રોફાઇલ સાચવો"
    override val audienceScopeFormat = "વર્ગ: %1\$s · વિસ્તાર: %2\$s · %3\$s"
    override val settingsHeading = "સેટિંગ્સ અને પ્લેટફોર્મ માહિતી"
    override val languageSectionTitle = "એપની ભાષા (બધી 12 ભારતીય ભાષાઓ)"
    override val languageSectionSubtitle = "તમારા સક્રિય ખાતા માટે અલગ સાચવવામાં આવે છે. બીજા ખાતાની ભાષા બદલાતી નથી."
    override val languagePausedByOwner = "માલિક નિયંત્રણ દ્વારા ભાષા બદલવી હાલમાં બંધ છે."
    override val lowDataTitle = "લો-ડેટા મોડ"
    override val lowDataSubtitle = "2G/3G ગ્રામીણ નેટવર્ક પર મોબાઇલ ડેટા બચાવે છે"
    override val reducedMotionTitle = "ઓછું એનિમેશન અને હાઇ કોન્ટ્રાસ્ટ"
    override val reducedMotionSubtitle = "સ્પષ્ટ અક્ષરો અને સરળ સ્ક્રીન ગતિ"
    override val privacyPolicyTitle = "ગોપનીયતા નીતિ અને ડેટા રક્ષણ"
    override val privacyPolicyBody = "• ચેટમાં તમારી પરવાનગી વિના ફોન નંબર છુપાયેલો રહે છે.\n• માઇક્રોફોન ફક્ત વોઇસ સર્ચ બટન દબાવવાથી જ ચાલુ થાય છે.\n• ફોટો પસંદગી માટે સુરક્ષિત ફોટો પિકર વપરાય છે.\n• પરિવારને કટોકટી લોકેશન ફક્ત તમારી સંમતિથી જ મોકલાય છે."
    override val termsOfServiceTitle = "સેવાની શરતો અને ન્યાયી નિયમો"
    override val termsOfServiceBody = "• દૈનિક મજૂરી અને માસિક પગારના કામ અલગ રાખવામાં આવ્યા છે.\n• દરેક LOBORO કોઇન 100% સમાન રોકડ મૂલ્ય અને ઉપાડ માટે પાત્ર છે.\n• બેજ ફક્ત સાચા કામના દિવસો અને ન્યાયી રેટિંગથી મળે છે.\n• VIP ID (LB1–LB1999) ફક્ત માલિક ફાળવણી માટે અનામત છે."
    override val helpSupportTitle = "મદદ, સહાય અને સુરક્ષા ડેસ્ક"
    override val helpSupportBody = "• તાત્કાલિક જોખમમાં 112 પર કૉલ કરો (લોગ ઇન વિના પણ 24x7).\n• પગાર કે રહેઠાણની ફરિયાદ માટે મદદ અને સુરક્ષા ડેસ્ક ખોલો.\n• કીપેડ ફોન માટે ટોલ-ફ્રી કોલબેક હેતુ કીપેડ અને IVR ખોલો."
    override val backendChecklistTitle = "બેકએન્ડ અને API સંકલન સ્થિતિ"
    override val providersLabel = "સેવા પ્રદાતા: %1\$s"
    override val secretsLabel = "સિક્રેટ કી: %1\$s"

    override val ownerSetupTitle = "એક વખત માલિક / સુપર એડમિન સેટઅપ"
    override val ownerSetupSubtitle = "માત્ર LOBORO નિર્માતા માટે. એક નોંધણી પછી કાયમ માટે લોક થઈ જાય છે."
    override val ownerSetupLockNote = "સુરક્ષા લોક: ફક્ત એક જ માલિક ખાતું બની શકે છે. કોઈ કામદાર કે નોકરીદાતા તેનો ઉપયોગ કરી શકે નહીં."
    override val ownerBackendReqTitle = "માલિક સર્વર જોડાયેલ નથી"
    override val ownerBackendReqBody = "પાસવર્ડ અને 4-અંકનો પિન સર્વર પર સુરક્ષિત રાખવા LOBORO_BACKEND_URL સેટ કરો."
    override val serverSetupAuthHeading = "1. સર્વર સેટઅપ અધિકૃતતા"
    override val bootstrapSecretLabel = "વન-ટાઇમ સર્વર બૂટસ્ટ્રેપ કોડ *"
    override val bootstrapSecretPlaceholder = "તમારા સર્વર OWNER_BOOTSTRAP_SECRET માંથી"
    override val ownerIdentityHeading = "2. માલિકની ઓળખ અને મોબાઇલ OTP"
    override val ownerNameField = "માલિકનું પૂરું નામ *"
    override val ownerMobileField = "માલિકનો અંગત મોબાઇલ નંબર *"
    override val ownerSendOtpBtn = "માલિક OTP મોકલો"
    override val ownerMobileVerifiedNote = "માલિક મોબાઇલ OTP ચકાસાયો"
    override val credentialsHeading = "3. પાસવર્ડ અને 4-અંકનો એડમિન પિન"
    override val createPasswordLabel = "લોગ ઇન પાસવર્ડ બનાવો (8+ અક્ષર) *"
    override val confirmPasswordLabel = "લોગ ઇન પાસવર્ડ પુષ્ટિ કરો *"
    override val passwordsMismatchError = "પાસવર્ડ મળતા નથી"
    override val createPinLabel = "4-અંકનો એડમિન પિન બનાવો *"
    override val confirmPinLabel = "4-અંકનો એડમિન પિન પુષ્ટિ કરો *"
    override val pinsMismatchError = "પિન મળતા નથી"
    override val credentialsHashNote = "સર્વર પાસવર્ડ અને પિનને Argon2id થી સુરક્ષિત કરે છે. એપમાં સાચવવામાં આવતું નથી."
    override val registeringOwnerLabel = "માલિક ખાતું બની રહ્યું છે..."
    override val completeOwnerRegButton = "માલિક નોંધણી પૂર્ણ કરો અને ડેશબોર્ડ ખોલો"
    override val returnToAppButton = "LOBORO એપ પર પાછા જાઓ"
    override val adminPinHeader = "માલિક નિયંત્રણ · 4-અંકનો પિન જરૂરી"
    override val adminPinPrompt = "તમારો 4-અંકનો માલિક એડમિન પિન દાખલ કરો. સર્વર પર મર્યાદા સાથે ચકાસાય છે."
    override val pinLockoutFormat = "ઘણા ખોટા પ્રયાસો. %1\$d સેકન્ડ પછી ફરી પ્રયાસ કરો."
    override val clrKeyLabel = "સાફ"
    override val verifyPinServerBtn = "સર્વર પર 4-અંકનો પિન ચકાસો"
    override val pinSecurityPolicyFormat = "5 ખોટા પ્રયાસ પર લોક · 5 મિનિટ નિષ્ક્રિયતા પર લોગઆઉટ · બાકી પ્રયાસો: %1\$d"
    override val ownerMasterControlTitle = "માલિક માસ્ટર કંટ્રોલ"
    override val ownerMasterSubtitle = "માત્ર માલિક સુપર એડમિન · સર્વર પિન + OTP + ઓડિટ લોગ"
    override val ownerSessionLockedNote = "માલિક સત્ર લોક છે. માસ્ટર કંટ્રોલ ખોલવા સર્વર-ચકાસાયેલ 4-અંકનો પિન જરૂરી છે."
    override val verifyOwnerPinBtn = "માલિક 4-અંકનો પિન ચકાસો"
    override val ownerProfileLineFormat = "માલિક પ્રોફાઇલ · %1\$s (%2\$s)"
    override val registeredMobileLineFormat = "રજિસ્ટર્ડ મોબાઇલ: %1\$s · એકલ માલિક ખાતું (%2\$s)"
    override val activeSessionFormat = "સક્રિય માલિક સત્ર · %1\$dm %2\$02ds માં લોગઆઉટ"
    override val serverAuthorityNote = "સત્ર ટોકન ચકાસાયેલ (સર્વર સત્તા)"
    override val lockAndExitBtn = "લોક અને બહાર જાઓ"
    override val mandatoryProtectionTitle = "ફરજિયાત સુરક્ષા અને નાણાકીય જવાબદારી રક્ષણ"
    override val mandatoryProtectionBody = "સુવિધા બંધ કરવાથી કે મેન્ટેનન્સ મોડથી ચાલુ નાણાકીય જવાબદારીઓ, રિફંડ કે કટોકટી 112 સેવા રદ થતી નથી."
    override val changePinTitle = "એડમિન પિન બદલો (OTP ચકાસણી જરૂરી)"
    override val changePinSubtitle = "માત્ર માલિક માટે. વર્તમાન પિન ક્યારેય દેખાતો નથી. રજિસ્ટર્ડ મોબાઇલ OTP ફરજિયાત."
    override val otpToRegisteredMobileNote = "OTP ફક્ત નોંધાયેલા માલિકના મોબાઇલ પર મોકલાશે: %1\$s"
    override val sendPinChangeOtpBtn = "નોંધાયેલા માલિક મોબાઇલ પર OTP મોકલો"
    override val otpDispatchedNote = "માલિકના નોંધાયેલા મોબાઇલ (%1\$s) પર OTP મોકલ્યો."
    override val enterServerOtpLabel = "સર્વર OTP કોડ દાખલ કરો"
    override val verifyOtpServerBtn = "સર્વર પર OTP ચકાસો"
    override val otpVerifiedNewPinNote = "OTP ચકાસાયો. હવે નવો 4-અંકનો માલિક પિન દાખલ કરો."
    override val newPinLabel = "નવો 4-અંકનો પિન"
    override val confirmNewPinLabel = "નવો 4-અંકનો પિન પુષ્ટિ કરો"
    override val saveNewPinBtn = "પુષ્ટિ કરો અને એડમિન પિન બદલો"
    override val confirmPinChangeTitle = "એડમિન પિન બદલવાની પુષ્ટિ કરો"
    override val confirmPinChangeDesc = "સર્વર પર 4-અંકનો માલિક પિન બદલવો છે? સત્ર ચાલુ રહેશે અને ઓડિટ લોગ નોંધાશે."
    override val pinUpdatedNote = "નવો 4-અંકનો માલિક પિન સર્વર પર અપડેટ થયો."
    override val completeMasterControlTitle = "સંપૂર્ણ માલિક માસ્ટર કંટ્રોલ (25 મોડ્યુલ)"
    override val masterControlScopeSubtitle = "વિસ્તાર કે વપરાશકર્તા ભૂમિકા મુજબ તરત ON/OFF નિયંત્રણ."
    override val scopeOptions = listOf(
        "વૈશ્વિક · ભારત (બધા રાજ્યો)",
        "ફક્ત તેલંગાણા",
        "ફક્ત તમિલનાડુ",
        "ફક્ત કામદારો",
        "ફક્ત નોકરીદાતાઓ"
    )
    override val masterControlNames = listOf(
        "1. સંપૂર્ણ એપ અને મેન્ટેનન્સ મોડ",
        "2. કામદાર નોંધણી",
        "3. નોકરીદાતા નોંધણી",
        "4. કામ મૂકવું",
        "5. કામ શોધવું",
        "6. દૈનિક મજૂરી કામ",
        "7. માસિક પગાર કામ",
        "8. કોઇન ખરીદી",
        "9. વોલેટ ઉપાડ",
        "10. જોબ ફી અને કોઇન ભાવ",
        "11. ઓફર અને પ્રમોશન",
        "12. રેફરલ ઈનામ",
        "13. સૂચનાઓ અને જાહેરાતો",
        "14. કામદાર અને નોકરીદાતા ખાતા નિયંત્રણ",
        "15. કામની શ્રેણીઓ અને પેટા-શ્રેણીઓ",
        "16. રેટિંગ અને ઓટોમેટિક બેજ",
        "17. વરિષ્ઠતા અને લોયલ્ટી સહાય",
        "18. કટોકટી અને કામદાર સુરક્ષા સિસ્ટમ",
        "19. SMS એલર્ટ",
        "20. IVR સેવાઓ",
        "21. ભાષા સેટિંગ્સ (12 ભાષાઓ)",
        "22. દેશ, રાજ્ય અને શહેર ઉપલબ્ધતા",
        "23. VIP ID આરક્ષણ અને સંચાલન",
        "24. રિપોર્ટ, ફરિયાદ અને મોડરેશન",
        "25. પેમેન્ટ ગેટવે સંકલન"
    )
    override val publishNoticeTitle = "લાલ LOBORO એડમિન સૂચના પ્રકાશિત કરો"
    override val announcementMessageLabel = "જાહેરાત સંદેશ"
    override val announcementPlaceholder = "દા.ત. બીજા રાજ્યના કામદારો માટે નવી સુરક્ષા હેલ્પલાઇન"
    override val actionLinkLabel = "બટન લેબલ"
    override val scopeFieldLabel = "વિસ્તાર / રાજ્ય મર્યાદા"
    override val audienceOptions = listOf("બધા વપરાશકર્તાઓ", "કામદારો", "નોકરીદાતાઓ")
    override val broadcastNoticeBtn = "લાલ એડમિન સૂચના મોકલો"
    override val confirmBroadcastTitle = "લાલ LOBORO એડમિન સૂચના મોકલવી?"
    override val confirmBroadcastDescFormat = "સંદેશ: %1\$s\nવર્ગ: %2\$s · વિસ્તાર: %3\$s"
    override val coinPricingTitle = "કોઇન કિંમત અને ફી નિયંત્રણ"
    override val coinPricingSummaryFormat = "1 કોઇન = ₹%1\$d · દૈનિક = %2\$d કોઇન · ખાસ = %3\$d કોઇન · માસિક = %4\$d કોઇન · સમય: %5\$s"
    override val dailyBtnFormat = "દૈનિક +1 (%1\$d)"
    override val masonBtnFormat = "ખાસ +1 (%1\$d)"
    override val monthlyBtnFormat = "માસિક +5 (%1\$d)"
    override val protectedVipIdsTitle = "સુરક્ષિત VIP અને માલિક ID (ક્યારેય આપોઆપ નહીં અપાય)"
    override val protectedVipIdsNote = "સામાન્ય વપરાશકર્તાને હંમેશા LB2000+ મળે છે. ખાસ નંબરો ફક્ત માલિક ફાળવણી માટે અનામત છે."
    override val safetyInvestigationTitle = "સુરક્ષા કેસ અને ફરિયાદ તપાસ ડેસ્ક"
    override val manageCategoriesTitle = "24 કામ શ્રેણીઓ સંચાલિત કરો (તરત ON/OFF)"
    override val showAll24Label = "બધી 24 બતાવો"
    override val showLessLabel = "ઓછી બતાવો"
    override val auditLogTitle = "માલિક કાર્ય ઓડિટ લોગ"
    override val confirmToggleTitleFormat = "%1\$s ની પુષ્ટિ કરો"
    override val confirmToggleDescFormat = "%3\$s માટે \"%1\$s\" ને %2\$s કરવું છે? ચાલુ નાણાકીય જવાબદારીઓ અને 112 સુરક્ષા સેવા સુરક્ષિત રહેશે."

    override val categories = mapOf(
        JobCategoryId.MASON to "કડિયો / રાજમિસ્ત્રી",
        JobCategoryId.CONSTRUCTION_LABOUR to "બાંધકામ મજૂર",
        JobCategoryId.GENERAL_LABOUR to "સામાન્ય મજૂર",
        JobCategoryId.PLUMBER to "પ્લમ્બર",
        JobCategoryId.ELECTRICIAN to "ઇલેક્ટ્રિશિયન",
        JobCategoryId.PAINTER to "પેઇન્ટર / રંગકામ",
        JobCategoryId.TILE_WORKER to "ટાઇલ કારીગર",
        JobCategoryId.CARPENTER to "સુથાર / કાર્પેન્ટર",
        JobCategoryId.WELDER to "વેલ્ડર",
        JobCategoryId.HOTEL_STAFF to "હોટેલ સ્ટાફ",
        JobCategoryId.COOK to "રસોઈયો / કુક",
        JobCategoryId.WAITER to "વેઇટર",
        JobCategoryId.HOUSEKEEPING to "હાઉસકીપિંગ",
        JobCategoryId.SECURITY_GUARD to "સિક્યોરિટી ગાર્ડ",
        JobCategoryId.DRIVER to "ડ્રાઈવર",
        JobCategoryId.DELIVERY_WORKER to "ડિલિવરી કર્મી",
        JobCategoryId.FACTORY_WORKER to "ફેક્ટરી કામદાર",
        JobCategoryId.PACKING_WORKER to "પેકિંગ કામદાર",
        JobCategoryId.MACHINE_OPERATOR to "મશીન ઓપરેટર",
        JobCategoryId.AGRICULTURE_WORKER to "ખેત મજૂર",
        JobCategoryId.OFFICE_ASSISTANT to "ઓફિસ સહાયક",
        JobCategoryId.SHOP_STAFF to "દુકાન સ્ટાફ",
        JobCategoryId.DOMESTIC_WORKER to "ઘરેલુ સહાયક",
        JobCategoryId.OTHER_JOBS to "અન્ય કામ"
    )
    override val userRoles = mapOf(
        UserRole.WORKER to "કામદાર",
        UserRole.EMPLOYER to "નોકરીદાતા",
        UserRole.OWNER_SUPER_ADMIN to "માલિક / સુપર એડમિન"
    )
    override val applicationStatuses = mapOf(
        ApplicationStatus.APPLIED to "અરજી કરી",
        ApplicationStatus.UNDER_REVIEW to "સમીક્ષા હેઠળ",
        ApplicationStatus.SHORTLISTED to "શોર્ટલિસ્ટ",
        ApplicationStatus.ACCEPTED to "સ્વીકૃત",
        ApplicationStatus.REJECTED to "નકારાયેલ",
        ApplicationStatus.WITHDRAWN to "પાછી ખેંચેલ",
        ApplicationStatus.COMPLETED to "પૂર્ણ"
    )
    override val transactionStatuses = mapOf(
        TransactionStatus.PENDING to "બાકી",
        TransactionStatus.SUCCESSFUL to "સફળ",
        TransactionStatus.FAILED to "નિષ્ફળ",
        TransactionStatus.REFUNDED to "રિફંડ થયેલ"
    )
    override val transactionTypes = mapOf(
        TransactionType.PURCHASE to "કોઇન ખરીદી",
        TransactionType.GIFT to "ગિફ્ટ ક્રેડિટ",
        TransactionType.PROMO to "પ્રોમો ક્રેડિટ",
        TransactionType.REFERRAL to "રેફરલ બોનસ",
        TransactionType.BADGE_REWARD to "બેજ ઈનામ",
        TransactionType.LOYALTY_SUPPORT to "લોયલ્ટી સહાય",
        TransactionType.JOB_FEE to "જોબ ફી",
        TransactionType.WITHDRAWAL to "ઉપાડ"
    )
    override val safetyCategories = mapOf(
        SafetyComplaintCategory.UNPAID_WAGES to "બાકી મજૂરી",
        SafetyComplaintCategory.PHYSICAL_ABUSE to "શારીરિક દુર્વ્યવહાર",
        SafetyComplaintCategory.HARASSMENT to "પજવણી",
        SafetyComplaintCategory.FOOD_ACCOMMODATION to "ભોજન / રહેઠાણ સમસ્યા",
        SafetyComplaintCategory.FRAUD to "નોકરી છેતરપિંડી",
        SafetyComplaintCategory.UNSAFE_WORKPLACE to "અસુરક્ષિત સ્થળ",
        SafetyComplaintCategory.OTHER_EMERGENCY to "અન્ય કટોકટી"
    )
    override val safetyStatuses = mapOf(
        SafetyCaseStatus.NEW to "નવો",
        SafetyCaseStatus.IN_REVIEW to "તપાસ હેઠળ",
        SafetyCaseStatus.ADMIN_VERIFIED to "એડમિન ચકાસાયેલ",
        SafetyCaseStatus.ACTION_TAKEN to "પગલાં લીધા",
        SafetyCaseStatus.REFERRED to "મોકલાવેલ",
        SafetyCaseStatus.CLOSED to "બંધ"
    )
    override val badgeLevels = mapOf(
        BadgeLevel.NONE to "શરૂઆતી",
        BadgeLevel.SILVER to "સિલ્વર",
        BadgeLevel.GOLD to "ગોલ્ડ",
        BadgeLevel.DIAMOND to "ડાયમંડ",
        BadgeLevel.PLATINUM to "પ્લેટિનમ"
    )
    override val feeChargePoints = mapOf(
        FeeChargePoint.ON_JOB_POSTING to "કામ મૂકતી વખતે",
        FeeChargePoint.ON_VERIFIED_CONNECTION to "ચકાસાયેલ સંપર્ક પર",
        FeeChargePoint.ON_APPLICATION_ACCEPT to "અરજી સ્વીકારવા પર"
    )
    override val indianStates = mapOf(
        "All States" to "બધા રાજ્યો",
        "Telangana" to "તેલંગાણા",
        "Andhra Pradesh" to "આંધ્ર પ્રદેશ",
        "Tamil Nadu" to "તમિલનાડુ",
        "Karnataka" to "કર્ણાટક",
        "Maharashtra" to "મહારાષ્ટ્ર",
        "Gujarat" to "ગુજરાત",
        "Assam" to "આસામ",
        "Bihar" to "બિહાર",
        "Uttar Pradesh" to "ઉત્તર પ્રદેશ",
        "West Bengal" to "પશ્ચિમ બંગાળ",
        "Odisha" to "ઓડિશા",
        "Kerala" to "કેરળ",
        "Punjab" to "પંજાબ"
    )
    override val backendServiceNames = mapOf(
        "db_auth" to "ક્લાઉડ ડેટાબેઝ અને સુરક્ષા",
        "otp_sms" to "OTP અને SMS સેવા",
        "payment_gateway" to "UPI અને કોઇન પેમેન્ટ ગેટવે",
        "face_liveness" to "ફેસ મેચ અને લાઇવનેસ તપાસ",
        "translation" to "લાઇવ 12-ભાષા કામ અનુવાદ",
        "telecom_ivr" to "કીપેડ ફોન મિસ્ડ-કૉલ અને IVR",
        "owner_pin_auth" to "માલિક બૂટસ્ટ્રેપ અને 4-અંક પિન સર્વર"
    )
    override val integrationStatuses = mapOf(
        IntegrationStatus.NOT_CONFIGURED to "જોડાયેલ નથી",
        IntegrationStatus.NEEDS_CREDENTIALS to "કી જરૂરી",
        IntegrationStatus.CONNECTED to "જોડાયેલ"
    )

    override val msgOwnerPrivilegeBlocked = "અનધિકૃત: સામાન્ય વપરાશકર્તા ક્યારેય માલિક / સુપર એડમિન બની શકે નહીં."
    override val msgSwitchedPreviewFormat = "પૂર્વાવલોકન ખાતું બદલીને %1\$s (%2\$s) કર્યું."
    override val msgLanguageSavedFormat = "ભાષા %1\$s (%2\$s) પસંદ થઈ"
    override val msgEnterNameBeforeOtp = "OTP મંગાવતા પહેલા તમારું પૂરું નામ લખો."
    override val msgEnterValidMobile = "કૃપા કરીને સાચો 10-અંકનો મોબાઇલ નંબર દાખલ કરો."
    override val msgOtpDispatchedFormat = "સર્વર OTP %1\$s પર મોકલાયો છે. મળેલો કોડ દાખલ કરો."
    override val msgUnableSendOtp = "OTP મોકલી શકાયો નહીં. બેકએન્ડ URL અથવા નેટવર્ક તપાસો."
    override val msgSendOtpAndEnterCode = "પહેલા OTP મોકલો અને 4–6 અંકનો કોડ દાખલ કરો."
    override val msgOtpVerifiedCreateFormat = "મોબાઇલ OTP ચકાસાયો! વિગતો ભરો અને %1\$s પ્રોફાઇલ બનાવો દબાવો."
    override val msgIncorrectOtp = "ખોટો અથવા સમાપ્ત OTP. નવો OTP મંગાવો."
    override val msgServerOtpUnavailable = "સર્વર OTP સેવા ઉપલબ્ધ નથી. લાઇવ બેકએન્ડ જોડો."
    override val msgEnterFullName = "પૂરું નામ જરૂરી છે."
    override val msgVerifyMobileOtpFirst = "કૃપા કરીને પહેલા મોબાઇલ OTP ચકાસો."
    override val msgAccountCreatedFormat = "સ્વાગત છે %1\$s! %2\$s ખાતું બની ગયું (%3\$s)."
    override val msgLoggedInFormat = "%1\$s (%2\$s) તરીકે લોગ ઇન થયા"
    override val msgSignedOut = "વપરાશકર્તા ખાતામાંથી સાઇન આઉટ થયા."
    override val msgDuplicateOwnerBlocked = "સુરક્ષા રોક: માલિક ખાતું પહેલેથી છે. નવું માલિક ખાતું બની શકે નહીં."
    override val msgBootstrapRequired = "સર્વર બૂટસ્ટ્રેપ અધિકૃતતા કોડ દાખલ કરો."
    override val msgEnterPasswords = "માલિક લોગ ઇન પાસવર્ડ દાખલ અને પુષ્ટિ કરો."
    override val msgPasswordsDoNotMatch = "બંને પાસવર્ડ મળતા નથી."
    override val msgPasswordTooShort = "પાસવર્ડ ઓછામાં ઓછા 8 અક્ષરનો હોવો જોઈએ."
    override val msgPinFourDigits = "એડમિન પિન બરાબર 4 અંકનો હોવો જોઈએ."
    override val msgPinsDoNotMatch = "4-અંકનો પિન મેળ ખાતો નથી."
    override val msgOwnerCreatedFormat = "%1\$s માટે માલિક પ્રોફાઇલ બની ગઈ. હવે નવી માલિક નોંધણી બંધ છે."
    override val msgOwnerLockedSession = "માલિક સત્ર લોક થયું."
    override val msgOwnerTimedOut = "5 મિનિટ નિષ્ક્રિયતાને કારણે માલિક સત્ર સમાપ્ત થયું. ફરી પિન દાખલ કરો."
    override val msgOwnerUnlocked = "માલિક માસ્ટર કંટ્રોલ ખૂલી ગયું."
    override val msgInvalidPinAttemptsFormat = "ખોટો 4-અંકનો માલિક પિન. %1\$d પ્રયાસ બાકી."
    override val msgTooManyPinAttemptsFormat = "વધારે ખોટા પ્રયાસો. %1\$d સેકન્ડ માટે લોક."
    override val msgOwnerSessionRequired = "સક્રિય માલિક સત્ર જરૂરી છે."
    override val msgVerifyOtpBeforePinChange = "પહેલા રજિસ્ટર્ડ મોબાઇલ પર આવેલો OTP ચકાસો."
    override val msgPinUpdatedSuccess = "નવો એડમિન પિન સર્વર પર સુરક્ષિત અપડેટ થયો."
    override val msgDemoProfileUpdatedFormat = "%1\$s (%2\$s) માટે ડેમો પ્રોફાઇલ અપડેટ થઈ"
    override val msgJobPostedFormat = "%1\$s માં ડેમો કામ મૂકાયું! ફી: %2\$d કોઇન."
    override val msgAlreadyAppliedFormat = "%1\$s માટે પહેલેથી અરજી કરેલ છે"
    override val msgApplicationSentFormat = "%1\$s માટે અરજી મોકલાઈ"
    override val msgApplicationWithdrawnFormat = "અરજી %1\$s પાછી ખેંચી"
    override val msgApplicationUpdatedFormat = "અરજી %1\$s → %2\$s"
    override val msgCheckInSafeRecorded = "સાપ્તાહિક તપાસ નોંધાઈ: 1 · હું સુરક્ષિત છું."
    override val msgCheckInProblemRecorded = "ચેતવણી નોંધાઈ (2 · સમસ્યા). સુરક્ષા ડેસ્કને જાણ કરાઈ."
    override val msgCheckInAdminRequested = "તાત્કાલિક એડમિન કોલબેક વિનંતી (3). પરિવાર એલર્ટ કતારમાં."
    override val msgSafetyComplaintSubmittedFormat = "સુરક્ષા કેસ %1\$s નોંધાયો."
    override val msgWithdrawalsFrozen = "તાત્કાલિક રોક ચાલુ: બધા ઉપાડ તરત લોક કરાયા."
    override val msgWithdrawalsUnfrozen = "ચકાસણી પછી ઉપાડ અનલોક થયો."
    override val msgOwnerNoticePublished = "લાલ LOBORO એડમિન સૂચના પ્રકાશિત થઈ."
}
