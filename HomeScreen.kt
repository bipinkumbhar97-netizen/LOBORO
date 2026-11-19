package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Assignment
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Dialpad
import androidx.compose.material.icons.filled.HealthAndSafety
import androidx.compose.material.icons.filled.MilitaryTech
import androidx.compose.material.icons.filled.PhoneInTalk
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Today
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material.icons.filled.WorkHistory
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.domain.model.JobCategoryId
import com.example.domain.model.JobType
import com.example.domain.model.UserRole
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.components.LoboroCoin
import com.example.ui.components.RedAdminNoticeBanner
import com.example.ui.components.VoiceSearchBar
import com.example.ui.components.categoryIcon
import com.example.ui.theme.LoboroHeroGradient
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedSoft
import com.example.ui.theme.LoboroRoyalBorder
import com.example.ui.theme.LoboroRoyalCard
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroRoyalElevated
import com.example.ui.theme.LoboroScreenGradient
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow
import com.example.ui.viewmodel.LoboroUiState

@Composable
fun HomeScreen(
    state: LoboroUiState,
    onSearchQueryChange: (String) -> Unit,
    onSearchSubmit: (String) -> Unit,
    onOpenDailyJobs: () -> Unit,
    onOpenMonthlyJobs: () -> Unit,
    onSelectCategory: (JobCategoryId) -> Unit,
    onOpenWallet: () -> Unit,
    onOpenPostJob: () -> Unit,
    onOpenApplications: () -> Unit,
    onOpenMyJobs: () -> Unit,
    onOpenSafety: () -> Unit,
    onOpenIvr: () -> Unit,
    onOpenBadgesLoyalty: () -> Unit,
    onOpenProfile: () -> Unit,
    onOpenUserAuth: (Int) -> Unit,
    onShareApp: () -> Unit,
    onCallEmergency112: () -> Unit,
    onDismissNotice: (String) -> Unit,
    onNoticeAction: (String) -> Unit
) {
    val strings = LocalAppStrings.current
    val activeNotice = remember(state.adminNotices, state.dismissedNoticeIds) {
        state.adminNotices.firstOrNull { it.isActive && it.id !in state.dismissedNoticeIds }
    }
    val activeCategories = remember(state.categoryConfigs) {
        state.categoryConfigs.filter { it.active }.map { it.id }
    }
    val chunkedCategories = remember(activeCategories) {
        activeCategories.chunked(3)
    }
    val dailyJobCount = remember(state.jobs) {
        state.jobs.count { it.jobType == JobType.DAILY }
    }
    val monthlyJobCount = remember(state.jobs) {
        state.jobs.count { it.jobType == JobType.MONTHLY }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LoboroScreenGradient),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .widthIn(max = 760.dp),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Maintenance notice if Owner toggled maintenance mode
            if (state.masterControls.appMaintenanceMode) {
                item {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = LoboroRed
                    ) {
                        Text(
                            text = strings.maintenanceModeBanner,
                            style = MaterialTheme.typography.titleSmall,
                            color = LoboroWhite,
                            modifier = Modifier.padding(14.dp)
                        )
                    }
                }
            }

            // Active Account / Normal User Registration & Login Banner
            item {
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = LoboroRoyalElevated,
                    border = BorderStroke(1.dp, LoboroYellow)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable(onClick = onOpenProfile),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "${state.activeProfile.fullName} · ${state.activeProfile.loboroId}",
                                    style = MaterialTheme.typography.labelLarge,
                                    color = LoboroYellow
                                )
                                Text(
                                    text = if (state.normalUserSession.isSignedIn) {
                                        Translations.fmt(
                                            strings.verifiedNormalAccountBanner,
                                            state.activeProfile.loboroId,
                                            strings.userRoles[state.activeRole] ?: state.activeRole.name
                                        )
                                    } else {
                                        strings.demoPreviewBanner
                                    },
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                            }
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = LoboroYellow
                            ) {
                                Text(
                                    text = (strings.userRoles[state.activeRole] ?: state.activeRole.name).uppercase(),
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = LoboroRoyalDeep,
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                                )
                            }
                        }

                        if (!state.normalUserSession.isSignedIn) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Button(
                                    onClick = { onOpenUserAuth(0) },
                                    modifier = Modifier
                                        .weight(1f)
                                        .testTag("home_register_normal_user_button"),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = LoboroYellow,
                                        contentColor = LoboroRoyalDeep
                                    )
                                ) {
                                    Text(strings.registerWorkerEmployerCta, fontWeight = FontWeight.Bold, maxLines = 1, overflow = TextOverflow.Ellipsis, style = MaterialTheme.typography.labelMedium)
                                }
                                Button(
                                    onClick = { onOpenUserAuth(1) },
                                    modifier = Modifier
                                        .weight(0.75f)
                                        .testTag("home_login_normal_user_button"),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = LoboroRoyalCard,
                                        contentColor = LoboroYellow
                                    ),
                                    border = BorderStroke(1.5.dp, LoboroYellow)
                                ) {
                                    Text(strings.logInLabel, fontWeight = FontWeight.Bold, maxLines = 1, overflow = TextOverflow.Ellipsis, style = MaterialTheme.typography.labelMedium)
                                }
                            }
                        }
                    }
                }
            }

            // Red LOBORO ADMIN NOTICE Banner
            if (activeNotice != null) {
                item {
                    RedAdminNoticeBanner(
                        notice = activeNotice,
                        activeLanguage = state.activeLanguage,
                        onActionClick = onNoticeAction,
                        onDismiss = onDismissNotice
                    )
                }
            }

            // Hero Royal Blue Search & Voice Accessibility Card
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    color = LoboroRoyalDeep,
                    border = BorderStroke(1.5.dp, LoboroYellow.copy(alpha = 0.7f)),
                    shadowElevation = 6.dp
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(LoboroHeroGradient)
                            .padding(18.dp)
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = strings.tapMicToSpeak,
                                        style = MaterialTheme.typography.headlineSmall,
                                        color = LoboroYellow
                                    )
                                    Text(
                                        text = "${strings.outOfStateTitle} · ${state.activeProfile.currentCityState}",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = LoboroTextMutedLight
                                    )
                                }
                            }

                            VoiceSearchBar(
                                query = state.filters.query,
                                activeLanguage = state.activeLanguage,
                                onQueryChange = onSearchQueryChange,
                                onSearchSubmit = onSearchSubmit
                            )
                        }
                    }
                }
            }

            // Two Separate Job Types: DAILY vs MONTHLY (Big tactile cards)
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    JobTypeHeroCard(
                        title = strings.dailyJobsTitle,
                        subtitle = strings.dailyJobsSubtitle,
                        countLabel = Translations.fmt(
                            strings.jobsCountFormat,
                            dailyJobCount
                        ),
                        icon = Icons.Filled.Today,
                        isPrimaryYellow = true,
                        modifier = Modifier
                            .weight(1f)
                            .testTag("home_daily_jobs_card"),
                        onClick = onOpenDailyJobs
                    )

                    JobTypeHeroCard(
                        title = strings.monthlyJobsTitle,
                        subtitle = strings.monthlyJobsSubtitle,
                        countLabel = Translations.fmt(
                            strings.jobsCountFormat,
                            monthlyJobCount
                        ),
                        icon = Icons.Filled.CalendarMonth,
                        isPrimaryYellow = false,
                        modifier = Modifier
                            .weight(1f)
                            .testTag("home_monthly_jobs_card"),
                        onClick = onOpenMonthlyJobs
                    )
                }
            }

            // Golden Animated LOBORO Coin Wallet Strip
            item {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .clickable(onClick = onOpenWallet)
                        .testTag("home_wallet_card"),
                    shape = RoundedCornerShape(20.dp),
                    color = LoboroRoyalDeep,
                    border = BorderStroke(1.5.dp, LoboroYellow)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            LoboroCoin(
                                size = 48.dp,
                                reducedMotionOverride = state.reducedMotion || state.lowDataMode
                            )
                            Column {
                                Text(
                                    text = Translations.fmt(
                                        strings.walletStripSummaryFormat,
                                        state.wallet.availableCoins,
                                        state.wallet.withdrawableBalanceInr
                                    ),
                                    style = MaterialTheme.typography.titleMedium,
                                    color = LoboroYellow
                                )
                                Text(
                                    text = strings.withdrawableRuleTitle,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                            }
                        }
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LoboroYellow
                        ) {
                            Text(
                                text = strings.navWallet,
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = LoboroRoyalDeep,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                            )
                        }
                    }
                }
            }

            // Quick Action Hub covering Post Job, Applications, My Jobs, Badges/Loyalty, IVR, Owner Control
            item {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        QuickModuleTile(
                            title = strings.navPostJob,
                            icon = Icons.Filled.AddCircle,
                            modifier = Modifier.weight(1f),
                            onClick = onOpenPostJob
                        )
                        QuickModuleTile(
                            title = strings.navMyApplications,
                            icon = Icons.Filled.Assignment,
                            modifier = Modifier.weight(1f),
                            onClick = onOpenApplications
                        )
                        QuickModuleTile(
                            title = strings.navMyJobs,
                            icon = Icons.Filled.WorkHistory,
                            modifier = Modifier.weight(1f),
                            onClick = onOpenMyJobs
                        )
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        QuickModuleTile(
                            title = strings.navBadgesLoyalty,
                            icon = Icons.Filled.MilitaryTech,
                            modifier = Modifier.weight(1f),
                            onClick = onOpenBadgesLoyalty
                        )
                        QuickModuleTile(
                            title = strings.navIvrKeypad,
                            icon = Icons.Filled.Dialpad,
                            modifier = Modifier.weight(1f),
                            onClick = onOpenIvr
                        )
                        QuickModuleTile(
                            title = strings.navSearchJobs,
                            icon = Icons.Filled.Search,
                            modifier = Modifier.weight(1f),
                            onClick = { onSearchSubmit("") }
                        )
                    }
                }
            }

            // 24 Job Categories Visual Grid (Low-literacy friendly, lazily composed row-by-row)
            item(key = "categories_header") {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = strings.categoriesHeading,
                        style = MaterialTheme.typography.titleLarge,
                        color = LoboroYellow
                    )
                    Text(
                        text = Translations.fmt(strings.activeCategoriesFormat, activeCategories.size),
                        style = MaterialTheme.typography.labelMedium,
                        color = LoboroTextMutedLight
                    )
                }
            }

            items(
                items = chunkedCategories,
                key = { row -> "category_row_${row.first().name}" }
            ) { rowCategories ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    rowCategories.forEach { categoryId ->
                        val label = strings.categories[categoryId] ?: categoryId.defaultName
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(16.dp))
                                .clickable { onSelectCategory(categoryId) }
                                .testTag("category_tile_${categoryId.name}"),
                            shape = RoundedCornerShape(16.dp),
                            color = LoboroRoyalElevated,
                            border = BorderStroke(1.dp, LoboroRoyalBorder),
                            shadowElevation = 2.dp
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 8.dp, vertical = 12.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(44.dp)
                                        .background(LoboroRoyalDeep, CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = categoryIcon(categoryId),
                                        contentDescription = label,
                                        tint = LoboroYellow,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                                Text(
                                    text = label,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = LoboroWhite,
                                    textAlign = TextAlign.Center,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }
                    }
                    repeat(3 - rowCategories.size) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }

            // Worker Safety & Emergency 112 Strip
            item {
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = LoboroRedSoft,
                    border = BorderStroke(1.5.dp, LoboroRed)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.HealthAndSafety,
                                contentDescription = strings.safetyEmergencyTitle,
                                tint = LoboroRed,
                                modifier = Modifier.size(28.dp)
                            )
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = strings.safetyEmergencyTitle,
                                    style = MaterialTheme.typography.titleMedium,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = strings.safetyOperationalNote,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Button(
                                onClick = onCallEmergency112,
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("home_call_112_button"),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroRed,
                                    contentColor = LoboroWhite
                                )
                            ) {
                                Icon(Icons.Filled.PhoneInTalk, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(6.dp))
                                Text("112", fontWeight = FontWeight.ExtraBold)
                            }
                            Button(
                                onClick = onOpenSafety,
                                modifier = Modifier
                                    .weight(1.4f)
                                    .testTag("home_open_safety_button"),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroYellow,
                                    contentColor = LoboroRoyalDeep
                                )
                            ) {
                                Icon(Icons.Filled.VerifiedUser, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.navHelpSafety, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }

            // Prominent Share LOBORO App Banner
            item {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .clickable(onClick = onShareApp)
                        .testTag("home_share_banner"),
                    shape = RoundedCornerShape(20.dp),
                    color = LoboroRoyalCard,
                    border = BorderStroke(1.dp, LoboroYellow.copy(alpha = 0.65f))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(44.dp)
                                    .background(LoboroYellow, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Share,
                                    contentDescription = strings.shareAppTitle,
                                    tint = LoboroRoyalDeep
                                )
                            }
                            Column {
                                Text(
                                    text = strings.shareAppTitle,
                                    style = MaterialTheme.typography.titleMedium,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = strings.shareAppCta,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroYellow
                                )
                            }
                        }
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            tint = LoboroYellow
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun JobTypeHeroCard(
    title: String,
    subtitle: String,
    countLabel: String,
    icon: ImageVector,
    isPrimaryYellow: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(20.dp),
        color = if (isPrimaryYellow) LoboroYellow else LoboroRoyalCard,
        border = BorderStroke(1.5.dp, LoboroYellow),
        shadowElevation = 3.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(if (isPrimaryYellow) LoboroRoyalDeep else LoboroYellow, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = title,
                        tint = if (isPrimaryYellow) LoboroYellow else LoboroRoyalDeep
                    )
                }
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    color = LoboroRoyalDeep
                ) {
                    Text(
                        text = countLabel,
                        style = MaterialTheme.typography.labelSmall,
                        color = LoboroYellow,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = if (isPrimaryYellow) LoboroRoyalDeep else LoboroWhite
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = if (isPrimaryYellow) LoboroRoyalDeep.copy(alpha = 0.82f) else LoboroTextMutedLight,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun QuickModuleTile(
    title: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    highlightYellow: Boolean = false,
    onClick: () -> Unit
) {
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp),
        color = if (highlightYellow) LoboroYellow else LoboroRoyalElevated,
        border = BorderStroke(1.dp, if (highlightYellow) LoboroYellow else LoboroRoyalBorder)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = if (highlightYellow) LoboroRoyalDeep else LoboroYellow,
                modifier = Modifier.size(26.dp)
            )
            Text(
                text = title,
                style = MaterialTheme.typography.labelMedium,
                color = if (highlightYellow) LoboroRoyalDeep else LoboroWhite,
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
