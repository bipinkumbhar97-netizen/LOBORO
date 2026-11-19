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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.domain.model.ApplicationStatus
import com.example.domain.model.UserRole
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
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
fun ApplicationsAndJobsScreen(
    state: LoboroUiState,
    showEmployerManageMode: Boolean,
    onWithdrawApplication: (String) -> Unit,
    onUpdateApplicationStatus: (String, ApplicationStatus) -> Unit,
    onSendChatMessage: (String, String) -> Unit,
    onToggleBlockChat: (String) -> Unit
) {
    val strings = LocalAppStrings.current
    var activeChatThreadId by remember { mutableStateOf<String?>(null) }

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
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Text(
                    text = if (showEmployerManageMode || state.activeRole == UserRole.EMPLOYER) {
                        strings.employerAppsHeading
                    } else {
                        strings.navMyApplications
                    },
                    style = MaterialTheme.typography.headlineSmall,
                    color = LoboroYellow
                )
            }

            // Negotiation Chat Preview Card (Privacy Protected)
            item {
                val thread = state.chatThreads.firstOrNull()
                if (thread != null) {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalDeep,
                        border = BorderStroke(1.5.dp, LoboroYellow)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = Translations.fmt(strings.secureChatHeading, thread.employerName),
                                    style = MaterialTheme.typography.titleSmall,
                                    color = LoboroYellow
                                )
                                Text(
                                    text = strings.secureChatSubtitle,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroWhite.copy(alpha = 0.88f)
                                )
                            }
                            Button(
                                onClick = { activeChatThreadId = thread.id },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroYellow,
                                    contentColor = LoboroRoyalDeep
                                ),
                                modifier = Modifier.testTag("open_negotiation_chat_button")
                            ) {
                                Icon(Icons.Filled.Chat, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(4.dp))
                                Text(strings.chatButton, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }

            items(state.applications, key = { it.id }) { app ->
                Surface(
                    shape = RoundedCornerShape(18.dp),
                    color = LoboroRoyalElevated,
                    border = BorderStroke(1.dp, LoboroRoyalBorder)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.Top
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = app.localizedTitles[state.activeLanguage] ?: app.jobTitle,
                                    style = MaterialTheme.typography.titleMedium,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = "${app.cityState} · ${app.wageLabel}",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                                Text(
                                    text = Translations.fmt(
                                        strings.workerEmployerLineFormat,
                                        app.workerLoboroId,
                                        app.employerName,
                                        app.employerLoboroId
                                    ),
                                    style = MaterialTheme.typography.labelSmall,
                                    color = LoboroTextMutedLight
                                )
                            }

                            val isNegative = app.status == ApplicationStatus.REJECTED || app.status == ApplicationStatus.WITHDRAWN
                            val isPositive = app.status == ApplicationStatus.ACCEPTED ||
                                app.status == ApplicationStatus.SHORTLISTED ||
                                app.status == ApplicationStatus.COMPLETED
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = when {
                                    isNegative -> LoboroRed
                                    isPositive -> LoboroYellow
                                    else -> LoboroRoyalMutedSurface
                                }
                            ) {
                                Text(
                                    text = strings.applicationStatuses[app.status] ?: app.status.name.replace('_', ' '),
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isPositive) LoboroRoyalDeep else LoboroWhite,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            if (state.activeRole == UserRole.EMPLOYER || showEmployerManageMode) {
                                OutlinedButton(
                                    onClick = { onUpdateApplicationStatus(app.id, ApplicationStatus.SHORTLISTED) },
                                    border = BorderStroke(1.dp, LoboroYellow),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(strings.shortlistButton, color = LoboroYellow, fontWeight = FontWeight.SemiBold)
                                }
                                Button(
                                    onClick = { onUpdateApplicationStatus(app.id, ApplicationStatus.ACCEPTED) },
                                    modifier = Modifier.weight(1f),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = LoboroYellow,
                                        contentColor = LoboroRoyalDeep
                                    )
                                ) {
                                    Text(strings.acceptButton, fontWeight = FontWeight.Bold)
                                }
                            } else if (app.status != ApplicationStatus.WITHDRAWN && app.status != ApplicationStatus.COMPLETED) {
                                OutlinedButton(
                                    onClick = { onWithdrawApplication(app.id) },
                                    border = BorderStroke(1.dp, LoboroRed)
                                ) {
                                    Text(strings.withdrawButton, color = LoboroRedText, fontWeight = FontWeight.SemiBold)
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    activeChatThreadId?.let { threadId ->
        val thread = state.chatThreads.firstOrNull { it.id == threadId }
        if (thread != null) {
            var draft by remember { mutableStateOf("") }
            Dialog(onDismissRequest = { activeChatThreadId = null }) {
                Surface(
                    shape = RoundedCornerShape(22.dp),
                    color = LoboroRoyalElevated,
                    border = BorderStroke(1.5.dp, LoboroRoyalBorder)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val threadTitle = state.applications
                                .firstOrNull { it.jobTitle == thread.jobTitle }
                                ?.localizedTitles?.get(state.activeLanguage)
                                ?: thread.jobTitle
                            Column(modifier = Modifier.weight(1f)) {
                                Text(threadTitle, style = MaterialTheme.typography.titleSmall, color = LoboroYellow)
                                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    Icon(Icons.Filled.Lock, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(13.dp))
                                    Text(strings.phoneHiddenPrivacy, style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                                }
                            }
                            IconButton(onClick = { onToggleBlockChat(thread.id) }) {
                                Icon(Icons.Filled.Block, contentDescription = strings.blockUserLabel, tint = LoboroRedText)
                            }
                        }

                        if (thread.isBlocked) {
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = LoboroRedSoft,
                                border = BorderStroke(1.dp, LoboroRed)
                            ) {
                                Text(
                                    text = strings.userBlockedNotice,
                                    color = LoboroRedText,
                                    style = MaterialTheme.typography.labelMedium,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            thread.messages.forEach { msg ->
                                val isMine = msg.senderLoboroId == state.activeProfile.loboroId
                                Surface(
                                    shape = RoundedCornerShape(14.dp),
                                    color = if (isMine) LoboroRoyalCard else LoboroRoyalDeep,
                                    border = BorderStroke(
                                        1.dp,
                                        if (isMine) LoboroYellow.copy(alpha = 0.7f) else LoboroRoyalBorder
                                    )
                                ) {
                                    Column(modifier = Modifier.padding(10.dp)) {
                                        Text(
                                            text = "${msg.senderLabel} · ${msg.timestampLabel}",
                                            style = MaterialTheme.typography.labelSmall,
                                            color = if (isMine) LoboroYellow else LoboroTextMutedLight
                                        )
                                        Text(
                                            text = msg.text,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroWhite
                                        )
                                    }
                                }
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            OutlinedTextField(
                                value = draft,
                                onValueChange = { draft = it },
                                placeholder = { Text(strings.chatPlaceholder) },
                                modifier = Modifier.weight(1f),
                                enabled = !thread.isBlocked,
                                singleLine = true
                            )
                            IconButton(
                                onClick = {
                                    onSendChatMessage(thread.id, draft)
                                    draft = ""
                                },
                                enabled = !thread.isBlocked
                            ) {
                                Icon(Icons.Filled.Send, contentDescription = strings.sendLabel, tint = LoboroYellow)
                            }
                        }

                        TextButton(
                            onClick = { activeChatThreadId = null },
                            modifier = Modifier.align(Alignment.End)
                        ) {
                            Text(strings.closeLabel, color = LoboroYellow, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}

