package com.example.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.HealthAndSafety
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.domain.model.JobType
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.components.LoboroTopHeader
import com.example.ui.components.ShareLoboroBottomSheet
import com.example.ui.screens.AdminMasterScreen
import com.example.ui.screens.AdminPinScreen
import com.example.ui.screens.ApplicationsAndJobsScreen
import com.example.ui.screens.AuthProfileSettingsScreen
import com.example.ui.screens.BadgesAndLoyaltyScreen
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.JobsScreen
import com.example.ui.screens.OwnerRegistrationScreen
import com.example.ui.screens.PostJobScreen
import com.example.ui.screens.SafetyAndIvrScreen
import com.example.ui.screens.UserAuthScreen
import com.example.ui.screens.WalletScreen
import com.example.ui.theme.LoboroRoyalBlue
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroTheme
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow
import com.example.ui.viewmodel.LoboroViewModel

object LoboroRoutes {
    const val HOME = "home"
    const val SEARCH = "search"
    const val POST_JOB = "post_job"
    const val WALLET = "wallet"
    const val APPLICATIONS = "applications"
    const val MY_JOBS = "my_jobs"
    const val NOTIFICATIONS = "notifications"
    const val SAFETY = "safety"
    const val IVR = "ivr"
    const val BADGES_LOYALTY = "badges_loyalty"
    const val USER_AUTH_REGISTER = "user_auth_register"
    const val USER_AUTH_LOGIN = "user_auth_login"
    const val OWNER_REGISTER = "owner_register"
    const val ADMIN_PIN = "admin_pin"
    const val ADMIN = "admin"
    const val PROFILE = "profile"
    const val SETTINGS = "settings"
}

private data class PrimaryNavItem(
    val route: String,
    val label: String,
    val icon: ImageVector,
    val testTag: String
)

@Composable
fun LoboroApp(
    viewModel: LoboroViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val strings = remember(state.activeLanguage) { Translations.forLanguage(state.activeLanguage) }
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route ?: LoboroRoutes.HOME
    val context = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }
    var showShareSheet by remember { mutableStateOf(false) }

    LaunchedEffect(state.feedbackBannerMessage) {
        val msg = state.feedbackBannerMessage
        if (msg != null) {
            snackbarHostState.showSnackbar(msg)
            viewModel.clearFeedbackBanner()
        }
    }

    LaunchedEffect(state.ownerSession.isAuthenticated, currentRoute) {
        if (state.ownerSession.isAuthenticated &&
            (currentRoute == LoboroRoutes.ADMIN_PIN || currentRoute == LoboroRoutes.OWNER_REGISTER)
        ) {
            navController.navigate(LoboroRoutes.ADMIN) {
                popUpTo(currentRoute) { inclusive = true }
                launchSingleTop = true
            }
        } else if (!state.ownerSession.isAuthenticated && currentRoute == LoboroRoutes.ADMIN) {
            navController.navigate(LoboroRoutes.HOME) {
                popUpTo(LoboroRoutes.ADMIN) { inclusive = true }
                launchSingleTop = true
            }
        }
    }

    LaunchedEffect(state.normalUserSession.isSignedIn, currentRoute) {
        if (state.normalUserSession.isSignedIn &&
            (currentRoute == LoboroRoutes.USER_AUTH_REGISTER || currentRoute == LoboroRoutes.USER_AUTH_LOGIN)
        ) {
            navController.navigate(LoboroRoutes.HOME) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = false
                }
                launchSingleTop = true
            }
        }
    }

    val navigateToTopLevel: (String) -> Unit = remember(navController) {
        { route: String ->
            navController.navigate(route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    }

    val dialEmergency112: () -> Unit = remember(context) {
        {
            val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:112"))
            context.startActivity(dialIntent)
        }
    }

    val navItems = remember(strings) {
        listOf(
            PrimaryNavItem(LoboroRoutes.HOME, strings.navHome, Icons.Filled.Home, "nav_home"),
            PrimaryNavItem(LoboroRoutes.SEARCH, strings.navSearchJobs, Icons.Filled.Search, "nav_search"),
            PrimaryNavItem(LoboroRoutes.WALLET, strings.navWallet, Icons.Filled.AccountBalanceWallet, "nav_wallet"),
            PrimaryNavItem(LoboroRoutes.SAFETY, strings.navHelpSafety, Icons.Filled.HealthAndSafety, "nav_safety"),
            PrimaryNavItem(LoboroRoutes.PROFILE, strings.navProfile, Icons.Filled.Person, "nav_profile")
        )
    }

    val unreadNotices = remember(state.adminNotices, state.dismissedNoticeIds) {
        state.adminNotices.count { it.isActive && it.id !in state.dismissedNoticeIds }
    }

    LoboroTheme(language = state.activeLanguage) {
        CompositionLocalProvider(LocalAppStrings provides strings) {
            BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                val useNavigationRail = maxWidth >= 600.dp

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = LoboroRoyalBlue,
                    contentWindowInsets = WindowInsets.navigationBars,
                    snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
                    topBar = {
                        LoboroTopHeader(
                            activeLanguage = state.activeLanguage,
                            canNavigateBack = currentRoute != LoboroRoutes.HOME,
                            unreadNoticeCount = unreadNotices,
                            onBackClick = { navController.popBackStack() },
                            onHomeClick = { navigateToTopLevel(LoboroRoutes.HOME) },
                            onEmblemTap = {
                                if (viewModel.onLoboroEmblemTap()) {
                                    viewModel.refreshOwnerBootstrapStatus()
                                    val targetRoute = when {
                                        state.ownerSession.isAuthenticated -> LoboroRoutes.ADMIN
                                        state.ownerSession.isOwnerInitialized -> LoboroRoutes.ADMIN_PIN
                                        else -> LoboroRoutes.OWNER_REGISTER
                                    }
                                    navController.navigate(targetRoute) {
                                        launchSingleTop = true
                                    }
                                }
                            },
                            onLanguageSelected = viewModel::selectLanguage,
                            onShareClick = { showShareSheet = true },
                            onNotificationsClick = { navController.navigate(LoboroRoutes.NOTIFICATIONS) }
                        )
                    },
                    bottomBar = {
                        if (!useNavigationRail) {
                            NavigationBar(
                                containerColor = LoboroRoyalDeep,
                                contentColor = LoboroWhite,
                                windowInsets = WindowInsets.navigationBars
                            ) {
                                navItems.forEach { item ->
                                    val selected = currentRoute == item.route ||
                                        (item.route == LoboroRoutes.PROFILE && (currentRoute == LoboroRoutes.SETTINGS || currentRoute == LoboroRoutes.NOTIFICATIONS)) ||
                                        (item.route == LoboroRoutes.SAFETY && currentRoute == LoboroRoutes.IVR)
                                    NavigationBarItem(
                                        selected = selected,
                                        onClick = { navigateToTopLevel(item.route) },
                                        modifier = Modifier.testTag(item.testTag),
                                        icon = {
                                            Icon(
                                                imageVector = item.icon,
                                                contentDescription = item.label
                                            )
                                        },
                                        label = {
                                            Text(
                                                text = item.label,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis
                                            )
                                        },
                                        colors = NavigationBarItemDefaults.colors(
                                            selectedIconColor = LoboroRoyalDeep,
                                            selectedTextColor = LoboroYellow,
                                            indicatorColor = LoboroYellow,
                                            unselectedIconColor = LoboroTextMutedLight,
                                            unselectedTextColor = LoboroTextMutedLight
                                        )
                                    )
                                }
                            }
                        }
                    }
                ) { innerPadding ->
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        if (useNavigationRail) {
                            NavigationRail(
                                containerColor = LoboroRoyalDeep,
                                contentColor = LoboroWhite
                            ) {
                                navItems.forEach { item ->
                                    val selected = currentRoute == item.route
                                    NavigationRailItem(
                                        selected = selected,
                                        onClick = { navigateToTopLevel(item.route) },
                                        icon = { Icon(item.icon, contentDescription = item.label) },
                                        label = { Text(item.label, maxLines = 1) },
                                        colors = NavigationRailItemDefaults.colors(
                                            selectedIconColor = LoboroRoyalDeep,
                                            selectedTextColor = LoboroYellow,
                                            indicatorColor = LoboroYellow,
                                            unselectedIconColor = LoboroTextMutedLight,
                                            unselectedTextColor = LoboroTextMutedLight
                                        )
                                    )
                                }
                            }
                        }

                        Column(modifier = Modifier.weight(1f)) {
                            NavHost(
                                navController = navController,
                                startDestination = LoboroRoutes.HOME
                            ) {
                                composable(LoboroRoutes.HOME) {
                                    HomeScreen(
                                        state = state,
                                        onSearchQueryChange = viewModel::updateSearchQuery,
                                        onSearchSubmit = { query ->
                                            viewModel.updateSearchQuery(query)
                                            navigateToTopLevel(LoboroRoutes.SEARCH)
                                        },
                                        onOpenDailyJobs = {
                                            viewModel.selectJobTypeTab(JobType.DAILY)
                                            navigateToTopLevel(LoboroRoutes.SEARCH)
                                        },
                                        onOpenMonthlyJobs = {
                                            viewModel.selectJobTypeTab(JobType.MONTHLY)
                                            navigateToTopLevel(LoboroRoutes.SEARCH)
                                        },
                                        onSelectCategory = { cat ->
                                            viewModel.updateFilters { it.copy(selectedCategory = cat) }
                                            navigateToTopLevel(LoboroRoutes.SEARCH)
                                        },
                                        onOpenWallet = { navigateToTopLevel(LoboroRoutes.WALLET) },
                                        onOpenPostJob = { navController.navigate(LoboroRoutes.POST_JOB) },
                                        onOpenApplications = { navController.navigate(LoboroRoutes.APPLICATIONS) },
                                        onOpenMyJobs = { navController.navigate(LoboroRoutes.MY_JOBS) },
                                        onOpenSafety = { navigateToTopLevel(LoboroRoutes.SAFETY) },
                                        onOpenIvr = { navController.navigate(LoboroRoutes.IVR) },
                                        onOpenBadgesLoyalty = { navController.navigate(LoboroRoutes.BADGES_LOYALTY) },
                                        onOpenProfile = { navigateToTopLevel(LoboroRoutes.PROFILE) },
                                        onOpenUserAuth = { mode ->
                                            navController.navigate(
                                                if (mode == 1) LoboroRoutes.USER_AUTH_LOGIN else LoboroRoutes.USER_AUTH_REGISTER
                                            )
                                        },
                                        onShareApp = { showShareSheet = true },
                                        onCallEmergency112 = dialEmergency112,
                                        onDismissNotice = viewModel::dismissNotice,
                                        onNoticeAction = { target ->
                                            when (target) {
                                                "safety" -> navigateToTopLevel(LoboroRoutes.SAFETY)
                                                "wallet" -> navigateToTopLevel(LoboroRoutes.WALLET)
                                                else -> navigateToTopLevel(LoboroRoutes.SEARCH)
                                            }
                                        }
                                    )
                                }

                                composable(LoboroRoutes.SEARCH) {
                                    JobsScreen(
                                        state = state,
                                        onSelectJobType = viewModel::selectJobTypeTab,
                                        onSearchQueryChange = viewModel::updateSearchQuery,
                                        onUpdateFilters = viewModel::updateFilters,
                                        onClearFilters = viewModel::clearFilters,
                                        onToggleFavorite = viewModel::toggleFavoriteJob,
                                        onApplyJob = viewModel::applyToJob,
                                        onOpenChat = { navController.navigate(LoboroRoutes.APPLICATIONS) },
                                        onReportSuspiciousJob = { job ->
                                            val jobTitle = job.localizedTitles[state.activeLanguage] ?: job.title
                                            viewModel.submitSafetyComplaint(
                                                com.example.domain.model.SafetyComplaintCategory.FRAUD,
                                                job.employerLoboroId,
                                                "${job.city}, ${job.state}",
                                                "${strings.reportJob}: $jobTitle (${job.id})"
                                            )
                                            navigateToTopLevel(LoboroRoutes.SAFETY)
                                        }
                                    )
                                }

                                composable(LoboroRoutes.POST_JOB) {
                                    PostJobScreen(
                                        state = state,
                                        calculateFeeCoins = { type, cat ->
                                            viewModel.calculateJobFeeCoins(type, cat, state.feeConfig)
                                        },
                                        onPostJobSubmit = { title, desc, type, cat, wage, st, city, workers, hours, food, stay, ot, holiday, leave, join ->
                                            viewModel.postJobPreview(
                                                title, desc, type, cat, wage, st, city, workers, hours, food, stay, ot, holiday, leave, join
                                            )
                                            navigateToTopLevel(LoboroRoutes.SEARCH)
                                        }
                                    )
                                }

                                composable(LoboroRoutes.WALLET) {
                                    WalletScreen(
                                        state = state,
                                        onToggleFreezeWithdrawals = viewModel::toggleWithdrawalsFreeze
                                    )
                                }

                                composable(LoboroRoutes.APPLICATIONS) {
                                    ApplicationsAndJobsScreen(
                                        state = state,
                                        showEmployerManageMode = false,
                                        onWithdrawApplication = viewModel::withdrawApplication,
                                        onUpdateApplicationStatus = viewModel::updateApplicationStatus,
                                        onSendChatMessage = viewModel::sendChatMessage,
                                        onToggleBlockChat = viewModel::toggleBlockChat
                                    )
                                }

                                composable(LoboroRoutes.MY_JOBS) {
                                    ApplicationsAndJobsScreen(
                                        state = state,
                                        showEmployerManageMode = true,
                                        onWithdrawApplication = viewModel::withdrawApplication,
                                        onUpdateApplicationStatus = viewModel::updateApplicationStatus,
                                        onSendChatMessage = viewModel::sendChatMessage,
                                        onToggleBlockChat = viewModel::toggleBlockChat
                                    )
                                }

                                composable(LoboroRoutes.SAFETY) {
                                    SafetyAndIvrScreen(
                                        state = state,
                                        initialShowIvrTab = false,
                                        onCallEmergency112 = dialEmergency112,
                                        onWeeklyCheckInResponse = viewModel::respondWeeklyCheckIn,
                                        onSubmitComplaint = viewModel::submitSafetyComplaint
                                    )
                                }

                                composable(LoboroRoutes.IVR) {
                                    SafetyAndIvrScreen(
                                        state = state,
                                        initialShowIvrTab = true,
                                        onCallEmergency112 = dialEmergency112,
                                        onWeeklyCheckInResponse = viewModel::respondWeeklyCheckIn,
                                        onSubmitComplaint = viewModel::submitSafetyComplaint
                                    )
                                }

                                composable(LoboroRoutes.BADGES_LOYALTY) {
                                    BadgesAndLoyaltyScreen(state = state)
                                }

                                composable(LoboroRoutes.USER_AUTH_REGISTER) {
                                    UserAuthScreen(
                                        state = state,
                                        initialMode = 0,
                                        onSelectLanguage = viewModel::selectLanguage,
                                        onUpdateRegForm = viewModel::updateNormalUserRegForm,
                                        onRequestRegOtp = viewModel::requestNormalUserRegistrationOtp,
                                        onVerifyRegOtp = viewModel::verifyNormalUserRegistrationOtp,
                                        onSubmitReg = viewModel::submitNormalUserRegistration,
                                        onUpdateLoginForm = viewModel::updateNormalUserLoginForm,
                                        onRequestLoginOtp = viewModel::requestNormalUserLoginOtp,
                                        onVerifyLoginOtp = viewModel::verifyNormalUserLoginOtp,
                                        onCancelBack = { navController.popBackStack() }
                                    )
                                }

                                composable(LoboroRoutes.USER_AUTH_LOGIN) {
                                    UserAuthScreen(
                                        state = state,
                                        initialMode = 1,
                                        onSelectLanguage = viewModel::selectLanguage,
                                        onUpdateRegForm = viewModel::updateNormalUserRegForm,
                                        onRequestRegOtp = viewModel::requestNormalUserRegistrationOtp,
                                        onVerifyRegOtp = viewModel::verifyNormalUserRegistrationOtp,
                                        onSubmitReg = viewModel::submitNormalUserRegistration,
                                        onUpdateLoginForm = viewModel::updateNormalUserLoginForm,
                                        onRequestLoginOtp = viewModel::requestNormalUserLoginOtp,
                                        onVerifyLoginOtp = viewModel::verifyNormalUserLoginOtp,
                                        onCancelBack = { navController.popBackStack() }
                                    )
                                }

                                composable(LoboroRoutes.OWNER_REGISTER) {
                                    if (state.ownerSession.isOwnerInitialized) {
                                        AdminPinScreen(
                                            state = state,
                                            onSubmitPin = viewModel::submitOwnerPin,
                                            onCancelBack = { navController.popBackStack() }
                                        )
                                    } else {
                                        OwnerRegistrationScreen(
                                            state = state,
                                            onSelectLanguage = viewModel::selectLanguage,
                                            onUpdateForm = viewModel::updateOwnerRegistrationForm,
                                            onRequestOtp = viewModel::requestFirstOwnerOtp,
                                            onVerifyOtp = viewModel::verifyFirstOwnerOtp,
                                            onSubmitRegistration = viewModel::submitFirstOwnerRegistration,
                                            onCancelBack = { navController.popBackStack() }
                                        )
                                    }
                                }

                                composable(LoboroRoutes.ADMIN_PIN) {
                                    if (!state.ownerSession.isOwnerInitialized) {
                                        OwnerRegistrationScreen(
                                            state = state,
                                            onSelectLanguage = viewModel::selectLanguage,
                                            onUpdateForm = viewModel::updateOwnerRegistrationForm,
                                            onRequestOtp = viewModel::requestFirstOwnerOtp,
                                            onVerifyOtp = viewModel::verifyFirstOwnerOtp,
                                            onSubmitRegistration = viewModel::submitFirstOwnerRegistration,
                                            onCancelBack = { navController.popBackStack() }
                                        )
                                    } else {
                                        AdminPinScreen(
                                            state = state,
                                            onSubmitPin = viewModel::submitOwnerPin,
                                            onCancelBack = { navController.popBackStack() }
                                        )
                                    }
                                }

                                composable(LoboroRoutes.ADMIN) {
                                    if (state.ownerSession.isAuthenticated) {
                                        AdminMasterScreen(
                                            state = state,
                                            onTouchActivity = viewModel::touchOwnerSessionActivity,
                                            onLockSession = {
                                                viewModel.logoutOwnerSession()
                                                navigateToTopLevel(LoboroRoutes.HOME)
                                            },
                                            onOpenPinEntry = {
                                                navController.navigate(LoboroRoutes.ADMIN_PIN) {
                                                    launchSingleTop = true
                                                }
                                            },
                                            onUpdateMasterControls = viewModel::updateMasterControls,
                                            onUpdateFeeConfig = viewModel::updateFeeConfig,
                                            onPublishAdminNotice = viewModel::publishAdminNotice,
                                            onToggleCategory = viewModel::toggleCategoryActive,
                                            onAdvanceSafetyStatus = viewModel::advanceSafetyCaseStatus,
                                            onUpdatePinChangeFields = viewModel::updatePinChangeFields,
                                            onRequestPinChangeOtp = viewModel::requestOwnerPinChangeOtp,
                                            onVerifyPinChangeOtp = viewModel::verifyOwnerPinChangeOtp,
                                            onCommitNewPin = viewModel::commitNewOwnerPin
                                        )
                                    } else if (!state.ownerSession.isOwnerInitialized) {
                                        OwnerRegistrationScreen(
                                            state = state,
                                            onSelectLanguage = viewModel::selectLanguage,
                                            onUpdateForm = viewModel::updateOwnerRegistrationForm,
                                            onRequestOtp = viewModel::requestFirstOwnerOtp,
                                            onVerifyOtp = viewModel::verifyFirstOwnerOtp,
                                            onSubmitRegistration = viewModel::submitFirstOwnerRegistration,
                                            onCancelBack = { navigateToTopLevel(LoboroRoutes.HOME) }
                                        )
                                    } else {
                                        AdminPinScreen(
                                            state = state,
                                            onSubmitPin = viewModel::submitOwnerPin,
                                            onCancelBack = { navigateToTopLevel(LoboroRoutes.HOME) }
                                        )
                                    }
                                }

                                composable(LoboroRoutes.PROFILE) {
                                    AuthProfileSettingsScreen(
                                        state = state,
                                        initialTab = 0,
                                        onSelectLanguage = viewModel::selectLanguage,
                                        onSwitchRolePreview = viewModel::switchRolePreview,
                                        onRegisterProfile = viewModel::registerPreviewProfile,
                                        onSetLowDataMode = viewModel::setLowDataMode,
                                        onSetReducedMotion = viewModel::setReducedMotion,
                                        onOpenNoticeRoute = { route ->
                                            when (route) {
                                                "safety" -> navigateToTopLevel(LoboroRoutes.SAFETY)
                                                "wallet" -> navigateToTopLevel(LoboroRoutes.WALLET)
                                                else -> navigateToTopLevel(LoboroRoutes.SEARCH)
                                            }
                                        },
                                        onOpenUserAuth = { mode ->
                                            navController.navigate(
                                                if (mode == 1) LoboroRoutes.USER_AUTH_LOGIN else LoboroRoutes.USER_AUTH_REGISTER
                                            )
                                        },
                                        onLogoutNormalUser = viewModel::logoutNormalUser
                                    )
                                }

                                composable(LoboroRoutes.NOTIFICATIONS) {
                                    AuthProfileSettingsScreen(
                                        state = state,
                                        initialTab = 1,
                                        onSelectLanguage = viewModel::selectLanguage,
                                        onSwitchRolePreview = viewModel::switchRolePreview,
                                        onRegisterProfile = viewModel::registerPreviewProfile,
                                        onSetLowDataMode = viewModel::setLowDataMode,
                                        onSetReducedMotion = viewModel::setReducedMotion,
                                        onOpenNoticeRoute = { route ->
                                            when (route) {
                                                "safety" -> navigateToTopLevel(LoboroRoutes.SAFETY)
                                                "wallet" -> navigateToTopLevel(LoboroRoutes.WALLET)
                                                else -> navigateToTopLevel(LoboroRoutes.SEARCH)
                                            }
                                        },
                                        onOpenUserAuth = { mode ->
                                            navController.navigate(
                                                if (mode == 1) LoboroRoutes.USER_AUTH_LOGIN else LoboroRoutes.USER_AUTH_REGISTER
                                            )
                                        },
                                        onLogoutNormalUser = viewModel::logoutNormalUser
                                    )
                                }

                                composable(LoboroRoutes.SETTINGS) {
                                    AuthProfileSettingsScreen(
                                        state = state,
                                        initialTab = 2,
                                        onSelectLanguage = viewModel::selectLanguage,
                                        onSwitchRolePreview = viewModel::switchRolePreview,
                                        onRegisterProfile = viewModel::registerPreviewProfile,
                                        onSetLowDataMode = viewModel::setLowDataMode,
                                        onSetReducedMotion = viewModel::setReducedMotion,
                                        onOpenNoticeRoute = { route ->
                                            when (route) {
                                                "safety" -> navigateToTopLevel(LoboroRoutes.SAFETY)
                                                "wallet" -> navigateToTopLevel(LoboroRoutes.WALLET)
                                                else -> navigateToTopLevel(LoboroRoutes.SEARCH)
                                            }
                                        },
                                        onOpenUserAuth = { mode ->
                                            navController.navigate(
                                                if (mode == 1) LoboroRoutes.USER_AUTH_LOGIN else LoboroRoutes.USER_AUTH_REGISTER
                                            )
                                        },
                                        onLogoutNormalUser = viewModel::logoutNormalUser
                                    )
                                }
                            }
                        }
                    }
                }
            }

            if (showShareSheet) {
                ShareLoboroBottomSheet(
                    userLoboroId = state.activeProfile.loboroId,
                    referralEnabled = state.masterControls.referralSystem,
                    onDismiss = { showShareSheet = false }
                )
            }
        }
    }
}
