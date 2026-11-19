package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.domain.model.SupportedLanguage
import com.example.i18n.LocalAppStrings
import com.example.ui.theme.LoboroRoyalBorder
import com.example.ui.theme.LoboroRoyalCard
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroRoyalElevated
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow

@Composable
fun LoboroTopHeader(
    activeLanguage: SupportedLanguage,
    canNavigateBack: Boolean,
    unreadNoticeCount: Int,
    onBackClick: () -> Unit,
    onHomeClick: () -> Unit,
    onEmblemTap: () -> Unit,
    onLanguageSelected: (SupportedLanguage) -> Unit,
    onShareClick: () -> Unit,
    onNotificationsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val strings = LocalAppStrings.current
    var showLanguageDialog by remember { mutableStateOf(false) }

    Surface(
        modifier = modifier.fillMaxWidth(),
        color = LoboroRoyalDeep,
        border = BorderStroke(0.5.dp, LoboroRoyalBorder.copy(alpha = 0.45f)),
        shadowElevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .displayCutoutPadding()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    if (canNavigateBack) {
                        IconButton(
                            onClick = onBackClick,
                            modifier = Modifier.testTag("top_back_button")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = strings.backLabel,
                                tint = LoboroYellow
                            )
                        }
                    }
                    Row(
                        modifier = Modifier.padding(end = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        LoboroBrandLockup(
                            tagline = strings.tagline,
                            emblemSize = 36.dp,
                            onEmblemTap = onEmblemTap,
                            onWordmarkClick = onHomeClick
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    // Clearly visible 12-Language Selector Pill near the top
                    Surface(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .clickable { showLanguageDialog = true }
                            .testTag("top_language_selector"),
                        shape = RoundedCornerShape(20.dp),
                        color = LoboroYellow,
                        shadowElevation = 2.dp
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Language,
                                contentDescription = strings.languageLabel,
                                tint = LoboroRoyalDeep,
                                modifier = Modifier.size(18.dp)
                            )
                            Text(
                                text = activeLanguage.nativeName,
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = LoboroRoyalDeep,
                                maxLines = 1
                            )
                        }
                    }

                    IconButton(
                        onClick = onShareClick,
                        modifier = Modifier.testTag("top_share_button")
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Share,
                            contentDescription = strings.shareAppTitle,
                            tint = LoboroWhite
                        )
                    }

                    Box {
                        IconButton(
                            onClick = onNotificationsClick,
                            modifier = Modifier.testTag("top_notifications_button")
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Notifications,
                                contentDescription = strings.navNotifications,
                                tint = LoboroWhite
                            )
                        }
                        if (unreadNoticeCount > 0) {
                            Surface(
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(top = 6.dp, end = 6.dp)
                                    .size(16.dp),
                                shape = RoundedCornerShape(8.dp),
                                color = LoboroYellow
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text(
                                        text = unreadNoticeCount.toString(),
                                        style = MaterialTheme.typography.labelSmall,
                                        color = LoboroRoyalDeep
                                    )
                                }
                            }
                        }
                    }

                    if (canNavigateBack) {
                        IconButton(
                            onClick = onHomeClick,
                            modifier = Modifier.testTag("top_home_button")
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Home,
                                contentDescription = strings.homeLabel,
                                tint = LoboroYellow
                            )
                        }
                    }
                }
            }
        }
    }

    if (showLanguageDialog) {
        LanguagePickerDialog(
            activeLanguage = activeLanguage,
            onSelect = {
                onLanguageSelected(it)
                showLanguageDialog = false
            },
            onDismiss = { showLanguageDialog = false }
        )
    }
}

@Composable
fun LanguagePickerDialog(
    activeLanguage: SupportedLanguage,
    onSelect: (SupportedLanguage) -> Unit,
    onDismiss: () -> Unit
) {
    val strings = LocalAppStrings.current
    AlertDialog(
        onDismissRequest = onDismiss,
        containerColor = LoboroRoyalElevated,
        title = {
            Text(
                text = "${strings.languageLabel} (${strings.languageSelectorTitle})",
                style = MaterialTheme.typography.titleLarge,
                color = LoboroYellow
            )
        },
        text = {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(SupportedLanguage.entries, key = { it.code }) { lang ->
                    val selected = lang == activeLanguage
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .clickable { onSelect(lang) }
                            .testTag("lang_option_${lang.code}"),
                        shape = RoundedCornerShape(12.dp),
                        color = if (selected) LoboroYellow else LoboroRoyalCard,
                        border = BorderStroke(
                            width = 1.dp,
                            color = if (selected) LoboroYellow else LoboroRoyalBorder
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 14.dp, vertical = 12.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = lang.nativeName,
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = if (selected) FontWeight.Bold else FontWeight.SemiBold,
                                    color = if (selected) LoboroRoyalDeep else LoboroWhite
                                )
                                Text(
                                    text = lang.englishName,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = if (selected) LoboroRoyalDeep.copy(alpha = 0.8f) else LoboroTextMutedLight
                                )
                            }
                            if (selected) {
                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = LoboroRoyalDeep
                                ) {
                                    Text(
                                        text = strings.activeBadgeLabel,
                                        style = MaterialTheme.typography.labelSmall,
                                        color = LoboroYellow,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text(strings.closeLabel, color = LoboroYellow, fontWeight = FontWeight.Bold)
            }
        }
    )
}
