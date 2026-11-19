package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Dialpad
import androidx.compose.material.icons.filled.HealthAndSafety
import androidx.compose.material.icons.filled.PhoneCallback
import androidx.compose.material.icons.filled.ReportProblem
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.domain.model.SafetyComplaintCategory
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedText
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
fun SafetyAndIvrScreen(
    state: LoboroUiState,
    initialShowIvrTab: Boolean = false,
    onCallEmergency112: () -> Unit,
    onWeeklyCheckInResponse: (Int) -> Unit,
    onSubmitComplaint: (SafetyComplaintCategory, String, String, String) -> Unit
) {
    val strings = LocalAppStrings.current
    var activeTab by remember(initialShowIvrTab) { mutableIntStateOf(if (initialShowIvrTab) 1 else 0) }
    var selectedCategory by remember { mutableStateOf(SafetyComplaintCategory.UNPAID_WAGES) }
    var employerIdInput by remember { mutableStateOf("LB3232") }
    var locationInput by remember { mutableStateOf(state.activeProfile.currentCityState) }
    var complaintDesc by remember { mutableStateOf("") }

    // IVR blueprint state
    var ivrStep by remember { mutableIntStateOf(0) }
    var ivrSummary by remember(strings) { mutableStateOf(strings.ivrInitialPrompt) }

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
            // Switch between Help & Safety and Keypad / IVR Support
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(14.dp))
                            .clickable { activeTab = 0 }
                            .testTag("safety_tab_button"),
                        shape = RoundedCornerShape(14.dp),
                        color = if (activeTab == 0) LoboroYellow else LoboroRoyalElevated,
                        border = BorderStroke(1.5.dp, if (activeTab == 0) LoboroYellow else LoboroRoyalBorder)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Filled.HealthAndSafety, contentDescription = null, tint = if (activeTab == 0) LoboroRoyalDeep else LoboroYellow)
                            Spacer(Modifier.width(6.dp))
                            Text(strings.navHelpSafety, style = MaterialTheme.typography.titleSmall, color = if (activeTab == 0) LoboroRoyalDeep else LoboroWhite, fontWeight = FontWeight.Bold)
                        }
                    }
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(14.dp))
                            .clickable { activeTab = 1 }
                            .testTag("ivr_tab_button"),
                        shape = RoundedCornerShape(14.dp),
                        color = if (activeTab == 1) LoboroYellow else LoboroRoyalElevated,
                        border = BorderStroke(1.5.dp, if (activeTab == 1) LoboroYellow else LoboroRoyalBorder)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(Icons.Filled.Dialpad, contentDescription = null, tint = if (activeTab == 1) LoboroRoyalDeep else LoboroYellow)
                            Spacer(Modifier.width(6.dp))
                            Text(strings.navIvrKeypad, style = MaterialTheme.typography.titleSmall, color = if (activeTab == 1) LoboroRoyalDeep else LoboroWhite, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }

            if (activeTab == 0) {
                // Emergency 112 Hero Card
                item {
                    Surface(
                        shape = RoundedCornerShape(22.dp),
                        color = LoboroRed,
                        shadowElevation = 4.dp
                    ) {
                        Column(
                            modifier = Modifier.padding(18.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Text(
                                text = strings.safetyEmergencyTitle,
                                style = MaterialTheme.typography.titleLarge,
                                color = LoboroWhite
                            )
                            Text(
                                text = "${strings.safetyOperationalNote} ${strings.safetyDisclaimerNote}",
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite.copy(alpha = 0.94f)
                            )
                            Button(
                                onClick = onCallEmergency112,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("safety_call_112_button"),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroYellow,
                                    contentColor = LoboroRoyalDeep
                                )
                            ) {
                                Icon(Icons.Filled.Call, contentDescription = null)
                                Spacer(Modifier.width(8.dp))
                                Text(strings.callEmergency112, fontWeight = FontWeight.ExtraBold)
                            }
                        }
                    }
                }

                // Weekly Safety Check-In ("Are you safe?" 1/2/3)
                item {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalDeep,
                        border = BorderStroke(1.5.dp, LoboroYellow)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Text(
                                text = "${strings.weeklyCheckInTitle} (${Translations.fmt(strings.everyDaysFormat, state.weeklyCheckIn.frequencyDays)})",
                                style = MaterialTheme.typography.titleMedium,
                                color = LoboroYellow
                            )
                            Text(
                                text = strings.weeklyCheckInQuestion,
                                style = MaterialTheme.typography.headlineSmall,
                                color = LoboroWhite
                            )
                            Text(
                                text = "${Translations.fmt(strings.lastStatusFormat, state.weeklyCheckIn.lastCheckInLabel)} ${strings.checkInNoResponseNote}",
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite.copy(alpha = 0.88f)
                            )

                            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                Button(
                                    onClick = { onWeeklyCheckInResponse(1) },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("checkin_option_1"),
                                    colors = ButtonDefaults.buttonColors(containerColor = LoboroYellow, contentColor = LoboroRoyalDeep)
                                ) {
                                    Text(strings.checkInOpt1, fontWeight = FontWeight.Bold)
                                }
                                Button(
                                    onClick = { onWeeklyCheckInResponse(2) },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("checkin_option_2"),
                                    colors = ButtonDefaults.buttonColors(containerColor = LoboroRed, contentColor = LoboroWhite)
                                ) {
                                    Text(strings.checkInOpt2, fontWeight = FontWeight.Bold)
                                }
                                OutlinedButton(
                                    onClick = { onWeeklyCheckInResponse(3) },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("checkin_option_3"),
                                    border = BorderStroke(1.dp, LoboroYellow)
                                ) {
                                    Text(strings.checkInOpt3, color = LoboroYellow)
                                }
                            }
                        }
                    }
                }

                // Emergency Profile with Consent
                item {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Icon(Icons.Filled.Shield, contentDescription = null, tint = LoboroYellow)
                                Text(strings.consentEmergencyTitle, style = MaterialTheme.typography.titleSmall, color = LoboroYellow)
                            }
                            val localizedHomeState = strings.indianStates[state.activeProfile.homeState] ?: state.activeProfile.homeState
                            Text(Translations.fmt(strings.workerIdLabel, state.activeProfile.loboroId), style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                            Text(Translations.fmt(strings.homeOriginLabel, state.activeProfile.homeDistrict, localizedHomeState), style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                            Text(Translations.fmt(strings.currentJobCityLabel, state.activeProfile.currentCityState), style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                            Text(
                                Translations.fmt(
                                    strings.emergencyContactLabel,
                                    state.activeProfile.emergencyContactName,
                                    state.activeProfile.emergencyContactPhoneMasked
                                ),
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                            Text(
                                text = if (state.activeProfile.emergencyConsentGiven) strings.consentGranted else strings.consentPending,
                                style = MaterialTheme.typography.labelSmall,
                                color = LoboroTextMutedLight
                            )
                        }
                    }
                }

                // Report a Safety / Wage / Abuse Complaint (7 Categories)
                item {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Icon(Icons.Filled.ReportProblem, contentDescription = null, tint = LoboroRedText)
                                Text(strings.reportSafetyIssue, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                SafetyComplaintCategory.entries.forEach { cat ->
                                    FilterChip(
                                        selected = selectedCategory == cat,
                                        onClick = { selectedCategory = cat },
                                        label = { Text(strings.safetyCategories[cat] ?: cat.name.replace('_', ' ')) },
                                        colors = FilterChipDefaults.filterChipColors(
                                            selectedContainerColor = LoboroRed,
                                            selectedLabelColor = LoboroWhite,
                                            containerColor = LoboroRoyalCard,
                                            labelColor = LoboroWhite
                                        )
                                    )
                                }
                            }

                            OutlinedTextField(
                                value = employerIdInput,
                                onValueChange = { employerIdInput = it },
                                label = { Text(strings.employerLoboroIdInput) },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = true
                            )
                            OutlinedTextField(
                                value = locationInput,
                                onValueChange = { locationInput = it },
                                label = { Text(strings.currentSiteInput) },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = true
                            )
                            OutlinedTextField(
                                value = complaintDesc,
                                onValueChange = { complaintDesc = it },
                                label = { Text(strings.describeIssueInput) },
                                modifier = Modifier.fillMaxWidth(),
                                minLines = 2
                            )

                            Button(
                                onClick = {
                                    onSubmitComplaint(selectedCategory, employerIdInput, locationInput, complaintDesc)
                                    complaintDesc = ""
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("submit_safety_complaint_button"),
                                colors = ButtonDefaults.buttonColors(containerColor = LoboroYellow, contentColor = LoboroRoyalDeep)
                            ) {
                                Text(strings.submitSafetyDeskButton, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }

                // Active Safety Cases (Demo)
                item {
                    Text(
                        text = strings.safetyCasesHeading,
                        style = MaterialTheme.typography.titleMedium,
                        color = LoboroYellow
                    )
                }
                items(state.safetyCases, key = { it.id }) { sc ->
                    val catLabel = strings.safetyCategories[sc.category] ?: sc.category.name.replace('_', ' ')
                    val statusLabel = strings.safetyStatuses[sc.status] ?: sc.status.name.replace('_', ' ')
                    val scDesc = sc.localizedDescriptions[state.activeLanguage] ?: sc.description
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(14.dp),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("${sc.id} · $catLabel", style = MaterialTheme.typography.titleSmall, color = LoboroWhite)
                                Surface(shape = RoundedCornerShape(8.dp), color = LoboroRed) {
                                    Text(
                                        text = statusLabel,
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = LoboroWhite,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                    )
                                }
                            }
                            Text("${sc.workerLoboroId} · ${sc.employerLoboroId} · ${sc.location}", style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                            Text(scDesc, style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                        }
                    }
                }
            } else {
                // Keypad Phone & Missed-Call IVR Architecture
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
                            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                                Icon(Icons.Filled.PhoneCallback, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(28.dp))
                                Column {
                                    Text(strings.ivrTitle, style = MaterialTheme.typography.titleLarge, color = LoboroYellow)
                                    Text(strings.ivrSubtitle, style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                                }
                            }
                            Text(
                                text = strings.ivrArchNote,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite.copy(alpha = 0.88f)
                            )
                        }
                    }
                }

                // Interactive Keypad Flow Preview
                item {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            Text(
                                text = Translations.fmt(strings.ivrMenuTitle, state.activeLanguage.nativeName),
                                style = MaterialTheme.typography.titleMedium,
                                color = LoboroYellow
                            )
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = LoboroRoyalCard,
                                border = BorderStroke(1.dp, LoboroYellow)
                            ) {
                                Text(
                                    text = ivrSummary,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.SemiBold,
                                    color = LoboroYellow,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(12.dp)
                                )
                            }

                            strings.ivrOptionLabels.forEach { (key, label) ->
                                OutlinedButton(
                                    onClick = {
                                        ivrStep++
                                        ivrSummary = Translations.fmt(strings.ivrSelectedSummaryFormat, key, label)
                                    },
                                    modifier = Modifier.fillMaxWidth(),
                                    border = BorderStroke(1.dp, LoboroYellow)
                                ) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(Translations.fmt(strings.pressKeyFormat, key), fontWeight = FontWeight.ExtraBold, color = LoboroYellow)
                                        Text(label, color = LoboroWhite)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

