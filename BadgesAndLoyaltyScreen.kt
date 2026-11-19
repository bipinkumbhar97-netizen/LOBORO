package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Gavel
import androidx.compose.material.icons.filled.MilitaryTech
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material.icons.filled.VolunteerActivism
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.domain.model.BadgeLevel
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.components.LoboroCoin
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedSoft
import com.example.ui.theme.LoboroRedText
import com.example.ui.theme.LoboroRoyalBorder
import com.example.ui.theme.LoboroRoyalCard
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroRoyalElevated
import com.example.ui.theme.LoboroRoyalMutedSurface
import com.example.ui.theme.LoboroScreenGradient
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow
import com.example.ui.viewmodel.LoboroUiState

@Composable
fun BadgesAndLoyaltyScreen(
    state: LoboroUiState
) {
    val strings = LocalAppStrings.current
    val profile = state.activeProfile
    val nextBadge = when (profile.badgeLevel) {
        BadgeLevel.NONE -> BadgeLevel.SILVER
        BadgeLevel.SILVER -> BadgeLevel.GOLD
        BadgeLevel.GOLD -> BadgeLevel.DIAMOND
        BadgeLevel.DIAMOND -> BadgeLevel.PLATINUM
        BadgeLevel.PLATINUM -> BadgeLevel.PLATINUM
    }
    val currentBadgeLabel = strings.badgeLevels[profile.badgeLevel] ?: profile.badgeLevel.label
    val nextBadgeLabel = strings.badgeLevels[nextBadge] ?: nextBadge.label
    val progress = (profile.verifiedWorkdays.toFloat() / nextBadge.minDays.coerceAtLeast(1)).coerceIn(0f, 1f)

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
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Current Automatic Badge Card
            item {
                Surface(
                    shape = RoundedCornerShape(22.dp),
                    color = LoboroRoyalDeep,
                    border = BorderStroke(1.5.dp, LoboroYellow)
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.MilitaryTech,
                                contentDescription = null,
                                tint = LoboroYellow,
                                modifier = Modifier.size(44.dp)
                            )
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = Translations.fmt(strings.automaticBadgePrefix, currentBadgeLabel.uppercase()),
                                    style = MaterialTheme.typography.titleLarge,
                                    color = LoboroYellow
                                )
                                Text(
                                    text = Translations.fmt(
                                        strings.badgeStatsFormat,
                                        profile.rating,
                                        profile.verifiedWorkdays,
                                        profile.completedJobs
                                    ),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroWhite
                                )
                            }
                        }

                        Text(
                            text = Translations.fmt(
                                strings.progressToFormat,
                                nextBadgeLabel,
                                profile.verifiedWorkdays,
                                nextBadge.minDays
                            ),
                            style = MaterialTheme.typography.labelMedium,
                            color = LoboroYellow
                        )
                        LinearProgressIndicator(
                            progress = { progress },
                            modifier = Modifier.fillMaxWidth(),
                            color = LoboroYellow,
                            trackColor = LoboroRoyalCard
                        )

                        Text(
                            text = strings.badgeAntiAbuseNote,
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroWhite.copy(alpha = 0.88f)
                        )
                    }
                }
            }

            // Badge Tiers Overview
            item {
                Surface(
                    shape = RoundedCornerShape(18.dp),
                    color = LoboroRoyalElevated,
                    border = BorderStroke(1.dp, LoboroRoyalBorder)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Icon(Icons.Filled.Verified, contentDescription = null, tint = LoboroYellow)
                            Text(strings.badgeTiersTitle, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                        }
                        BadgeLevel.entries.filter { it != BadgeLevel.NONE }.forEach { tier ->
                            val isCurrent = tier == profile.badgeLevel
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = if (isCurrent) LoboroRoyalCard else LoboroRoyalMutedSurface,
                                border = if (isCurrent) BorderStroke(1.dp, LoboroYellow) else null
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(10.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = strings.badgeLevels[tier] ?: tier.label,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isCurrent) LoboroYellow else LoboroWhite
                                    )
                                    Text(
                                        text = Translations.fmt(strings.minWorkdaysFormat, tier.minDays, tier.minRating),
                                        style = MaterialTheme.typography.bodySmall,
                                        color = if (isCurrent) LoboroWhite else LoboroTextMutedLight
                                    )
                                }
                            }
                        }
                        Row(verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Icon(Icons.Filled.Gavel, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(18.dp))
                            Text(
                                text = strings.badgeAppealsNote,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroTextMutedLight
                            )
                        }
                    }
                }
            }

            // LOBORO Seniority & Loyalty Support Program
            item {
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = LoboroRoyalElevated,
                    border = BorderStroke(1.5.dp, LoboroYellow)
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            LoboroCoin(
                                size = 38.dp,
                                reducedMotionOverride = state.reducedMotion || state.lowDataMode
                            )
                            Column {
                                Text(
                                    text = strings.loyaltyTitle,
                                    style = MaterialTheme.typography.titleMedium,
                                    color = LoboroYellow
                                )
                                Text(
                                    text = strings.loyaltySubtitle,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                            }
                        }

                        // Mandatory transparent disclaimer
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LoboroRedSoft,
                            border = BorderStroke(1.dp, LoboroRed)
                        ) {
                            Row(
                                modifier = Modifier.padding(10.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(Icons.Filled.VolunteerActivism, contentDescription = null, tint = LoboroRedText, modifier = Modifier.size(18.dp))
                                Text(
                                    text = strings.loyaltyDisclaimer,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroWhite
                                )
                            }
                        }

                        val cfg = state.loyaltyConfig
                        val reqBadgeLabel = strings.badgeLevels[cfg.minBadgeLevel] ?: cfg.minBadgeLevel.label
                        Text(
                            Translations.fmt(strings.loyaltyMinMembershipFormat, profile.memberMonths, cfg.minMembershipMonths),
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroWhite
                        )
                        Text(
                            Translations.fmt(strings.loyaltyWorkdaysFormat, profile.verifiedWorkdays, cfg.minVerifiedWorkdays),
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroWhite
                        )
                        Text(
                            Translations.fmt(strings.loyaltyRequiredBadgeFormat, reqBadgeLabel, currentBadgeLabel),
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroWhite
                        )
                        Text(
                            Translations.fmt(strings.loyaltyRequiredRatingFormat, cfg.minRating, profile.rating),
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroWhite
                        )
                        Text(
                            Translations.fmt(strings.loyaltyBudgetFormat, cfg.programBudgetInr, cfg.paymentSchedule),
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroTextMutedLight
                        )
                    }
                }
            }
        }
    }
}

