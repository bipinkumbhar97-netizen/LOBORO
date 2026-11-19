package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AdminPanelSettings
import androidx.compose.material.icons.filled.HealthAndSafety
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Key
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.domain.model.FeeChargePoint
import com.example.domain.model.FeeConfig
import com.example.domain.model.JobCategoryId
import com.example.domain.model.LoboroIdRegistry
import com.example.domain.model.MasterFeatureControls
import com.example.domain.model.OwnerPinChangeState
import com.example.domain.model.PinChangeStep
import com.example.domain.model.SafetyCaseStatus
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedSoft
import com.example.ui.theme.LoboroRedText
import com.example.ui.theme.LoboroRoyalBorder
import com.example.ui.theme.LoboroRoyalCard
import com.example.ui.theme.LoboroRoyalDark
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroRoyalElevated
import com.example.ui.theme.LoboroScreenGradient
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow
import com.example.ui.viewmodel.LoboroUiState

private data class PendingSensitiveAction(
    val title: String,
    val description: String,
    val onConfirm: () -> Unit
)

@Composable
fun AdminMasterScreen(
    state: LoboroUiState,
    onTouchActivity: () -> Unit,
    onLockSession: () -> Unit,
    onOpenPinEntry: () -> Unit,
    onUpdateMasterControls: (String, (MasterFeatureControls) -> MasterFeatureControls) -> Unit,
    onUpdateFeeConfig: ((FeeConfig) -> FeeConfig) -> Unit,
    onPublishAdminNotice: (String, String, String, String) -> Unit,
    onToggleCategory: (JobCategoryId) -> Unit,
    onAdvanceSafetyStatus: (String, SafetyCaseStatus) -> Unit,
    onUpdatePinChangeFields: ((OwnerPinChangeState) -> OwnerPinChangeState) -> Unit,
    onRequestPinChangeOtp: () -> Unit,
    onVerifyPinChangeOtp: () -> Unit,
    onCommitNewPin: () -> Unit
) {
    val strings = LocalAppStrings.current
    val isAuthenticatedOwner = state.ownerSession.isAuthenticated

    var noticeMessage by remember { mutableStateOf("") }
    var noticeActionLabel by remember { mutableStateOf("VIEW NOW") }
    var noticeAudience by remember { mutableStateOf("All Users") }
    var noticeScope by remember { mutableStateOf("India (All States)") }
    var showAllCategories by remember { mutableStateOf(false) }
    var pendingConfirmation by remember { mutableStateOf<PendingSensitiveAction?>(null) }

    val remainingSessionSeconds = if (isAuthenticatedOwner && state.ownerSession.lastActivityEpochMs > 0L) {
        val elapsed = (state.currentEpochMs - state.ownerSession.lastActivityEpochMs).coerceAtLeast(0L)
        ((state.ownerSession.sessionTimeoutMs - elapsed) / 1000L).coerceAtLeast(0L)
    } else 0L

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
            // Header + Session Guard
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
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                modifier = Modifier.weight(1f),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Icon(Icons.Filled.AdminPanelSettings, contentDescription = null, tint = LoboroYellow)
                                Column {
                                    Text(
                                        text = strings.ownerMasterControlTitle,
                                        style = MaterialTheme.typography.titleLarge,
                                        color = LoboroYellow
                                    )
                                    Text(
                                        text = strings.ownerMasterSubtitle,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = LoboroWhite.copy(alpha = 0.88f)
                                    )
                                }
                            }
                        }

                        if (!isAuthenticatedOwner) {
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = LoboroRedSoft,
                                border = BorderStroke(1.dp, LoboroRed)
                            ) {
                                Column(
                                    modifier = Modifier.padding(12.dp),
                                    verticalArrangement = Arrangement.spacedBy(8.dp)
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                                    ) {
                                        Icon(Icons.Filled.Lock, contentDescription = null, tint = LoboroRedText)
                                        Text(
                                            text = strings.ownerSessionLockedNote,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroWhite
                                        )
                                    }
                                    Button(
                                        onClick = onOpenPinEntry,
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = LoboroYellow,
                                            contentColor = LoboroRoyalDeep
                                        ),
                                        modifier = Modifier.testTag("open_owner_pin_entry_button")
                                    ) {
                                        Text(strings.verifyOwnerPinBtn, fontWeight = FontWeight.Bold)
                                    }
                                }
                            }
                        } else {
                            val profile = state.ownerSession.ownerProfile
                            if (profile != null) {
                                Surface(
                                    shape = RoundedCornerShape(14.dp),
                                    color = LoboroRoyalCard,
                                    border = BorderStroke(1.dp, LoboroYellow.copy(alpha = 0.75f))
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(12.dp),
                                        verticalArrangement = Arrangement.spacedBy(2.dp)
                                    ) {
                                        Text(
                                            text = Translations.fmt(
                                                strings.ownerProfileLineFormat,
                                                profile.fullName,
                                                profile.loboroId
                                            ),
                                            style = MaterialTheme.typography.labelLarge,
                                            fontWeight = FontWeight.Bold,
                                            color = LoboroYellow
                                        )
                                        Text(
                                            text = Translations.fmt(
                                                strings.registeredMobileLineFormat,
                                                profile.maskedMobile,
                                                profile.initializedAtLabel
                                            ),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroWhite
                                        )
                                    }
                                }
                            }

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    val mins = remainingSessionSeconds / 60L
                                    val secs = remainingSessionSeconds % 60L
                                    val countdown = "${mins}m ${secs.toString().padStart(2, '0')}s"
                                    Text(
                                        text = Translations.fmt(strings.activeSessionFormat, countdown),
                                        style = MaterialTheme.typography.labelMedium,
                                        color = LoboroYellow
                                    )
                                    Text(
                                        text = strings.serverAuthorityNote,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = LoboroWhite.copy(alpha = 0.78f)
                                    )
                                }
                                Button(
                                    onClick = onLockSession,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = LoboroRed,
                                        contentColor = LoboroWhite
                                    ),
                                    modifier = Modifier.testTag("owner_lock_exit_button")
                                ) {
                                    Icon(Icons.Filled.Lock, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(Modifier.width(6.dp))
                                    Text(strings.lockAndExitBtn)
                                }
                            }
                        }
                    }
                }
            }

            if (isAuthenticatedOwner) {
                // Important Safety & Financial Guarantee Banner
                item {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.5.dp, LoboroYellow)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp),
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Icon(
                                imageVector = Icons.Filled.HealthAndSafety,
                                contentDescription = null,
                                tint = LoboroRedText
                            )
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Text(
                                    text = strings.mandatoryProtectionTitle,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = LoboroYellow,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = strings.mandatoryProtectionBody,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroWhite
                                )
                            }
                        }
                    }
                }

                // Change Admin PIN — Strict OTP Verification Required
                item {
                    val pcs = state.pinChangeState
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.5.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(Icons.Filled.Key, contentDescription = null, tint = LoboroYellow)
                                Column {
                                    Text(
                                        text = strings.changePinTitle,
                                        style = MaterialTheme.typography.titleMedium,
                                        color = LoboroYellow
                                    )
                                    Text(
                                        text = strings.changePinSubtitle,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = LoboroTextMutedLight
                                    )
                                }
                            }

                            if (pcs.statusMessage != null) {
                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = if (pcs.isError) LoboroRedSoft else LoboroRoyalCard,
                                    border = BorderStroke(1.dp, if (pcs.isError) LoboroRed else LoboroYellow)
                                ) {
                                    Text(
                                        text = pcs.statusMessage,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = if (pcs.isError) LoboroRedText else LoboroYellow,
                                        modifier = Modifier.padding(10.dp)
                                    )
                                }
                            }

                            val maskedMob = state.ownerSession.ownerProfile?.maskedMobile ?: strings.registeredMobileLabel
                            when (pcs.step) {
                                PinChangeStep.SEND_OTP_TO_REGISTERED_MOBILE -> {
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = LoboroRoyalDeep
                                    ) {
                                        Text(
                                            text = Translations.fmt(strings.otpToRegisteredMobileNote, maskedMob),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroWhite,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(10.dp)
                                        )
                                    }
                                    Button(
                                        onClick = onRequestPinChangeOtp,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .testTag("send_owner_pin_otp_button"),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = LoboroYellow,
                                            contentColor = LoboroRoyalDeep
                                        )
                                    ) {
                                        Text(strings.sendPinChangeOtpBtn, fontWeight = FontWeight.Bold)
                                    }
                                }

                                PinChangeStep.ENTER_OTP -> {
                                    Text(
                                        text = Translations.fmt(strings.otpDispatchedNote, maskedMob),
                                        style = MaterialTheme.typography.bodySmall,
                                        color = LoboroWhite
                                    )
                                    OutlinedTextField(
                                        value = pcs.otpCodeInput,
                                        onValueChange = { input ->
                                            onTouchActivity()
                                            val digitsOnly = input.filter { it.isDigit() }.take(6)
                                            onUpdatePinChangeFields { it.copy(otpCodeInput = digitsOnly) }
                                        },
                                        label = { Text(strings.enterServerOtpLabel) },
                                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                                        singleLine = true,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .testTag("owner_pin_change_otp_input")
                                    )
                                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                        OutlinedButton(
                                            onClick = {
                                                onTouchActivity()
                                                onUpdatePinChangeFields { OwnerPinChangeState() }
                                            },
                                            border = BorderStroke(1.dp, LoboroYellow),
                                            modifier = Modifier.weight(1f)
                                        ) {
                                            Text(strings.cancelLabel, color = LoboroYellow)
                                        }
                                        Button(
                                            onClick = onVerifyPinChangeOtp,
                                            modifier = Modifier
                                                .weight(1.4f)
                                                .testTag("verify_owner_pin_otp_button"),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = LoboroYellow,
                                                contentColor = LoboroRoyalDeep
                                            )
                                        ) {
                                            Text(strings.verifyOtpServerBtn, fontWeight = FontWeight.Bold)
                                        }
                                    }
                                }

                                PinChangeStep.ENTER_NEW_PIN -> {
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = LoboroRoyalCard,
                                        border = BorderStroke(1.dp, LoboroYellow)
                                    ) {
                                        Row(
                                            modifier = Modifier.padding(10.dp),
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                                        ) {
                                            Icon(Icons.Filled.VerifiedUser, contentDescription = null, tint = LoboroYellow)
                                            Text(
                                                text = strings.otpVerifiedNewPinNote,
                                                style = MaterialTheme.typography.bodySmall,
                                                color = LoboroYellow
                                            )
                                        }
                                    }
                                    OutlinedTextField(
                                        value = pcs.newPinInput,
                                        onValueChange = { input ->
                                            onTouchActivity()
                                            val digits = input.filter { it.isDigit() }.take(4)
                                            onUpdatePinChangeFields { it.copy(newPinInput = digits) }
                                        },
                                        label = { Text(strings.newPinLabel) },
                                        visualTransformation = PasswordVisualTransformation(),
                                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                                        singleLine = true,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .testTag("owner_new_pin_input")
                                    )
                                    OutlinedTextField(
                                        value = pcs.confirmPinInput,
                                        onValueChange = { input ->
                                            onTouchActivity()
                                            val digits = input.filter { it.isDigit() }.take(4)
                                            onUpdatePinChangeFields { it.copy(confirmPinInput = digits) }
                                        },
                                        label = { Text(strings.confirmNewPinLabel) },
                                        visualTransformation = PasswordVisualTransformation(),
                                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                                        singleLine = true,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .testTag("owner_confirm_pin_input")
                                    )
                                    Button(
                                        onClick = {
                                            onTouchActivity()
                                            pendingConfirmation = PendingSensitiveAction(
                                                title = strings.confirmPinChangeTitle,
                                                description = strings.confirmPinChangeDesc,
                                                onConfirm = onCommitNewPin
                                            )
                                        },
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .testTag("save_new_owner_pin_button"),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = LoboroYellow,
                                            contentColor = LoboroRoyalDeep
                                        )
                                    ) {
                                        Text(strings.saveNewPinBtn, fontWeight = FontWeight.Bold)
                                    }
                                }

                                PinChangeStep.COMPLETED -> {
                                    Text(
                                        text = strings.pinUpdatedNote,
                                        style = MaterialTheme.typography.titleSmall,
                                        color = LoboroYellow
                                    )
                                    OutlinedButton(
                                        onClick = {
                                            onTouchActivity()
                                            onUpdatePinChangeFields { OwnerPinChangeState() }
                                        },
                                        border = BorderStroke(1.dp, LoboroYellow),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Text(strings.doneLabel, color = LoboroYellow)
                                    }
                                }
                            }
                        }
                    }
                }

                // Complete Owner Master Control: All 25 Independent ON/OFF Controls
                val canonicalScopes = listOf(
                    "Global · India (All States)",
                    "Telangana Only",
                    "Tamil Nadu Only",
                    "Workers Only",
                    "Employers Only"
                )
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
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(Icons.Filled.Security, contentDescription = null, tint = LoboroYellow)
                                Text(
                                    text = strings.completeMasterControlTitle,
                                    style = MaterialTheme.typography.titleMedium,
                                    color = LoboroYellow
                                )
                            }
                            Text(
                                text = strings.masterControlScopeSubtitle,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroTextMutedLight
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                canonicalScopes.forEachIndexed { idx, canonicalScope ->
                                    val localizedScope = strings.scopeOptions.getOrNull(idx) ?: canonicalScope
                                    FilterChip(
                                        selected = state.masterControls.activeScopeLabel == canonicalScope,
                                        onClick = {
                                            onTouchActivity()
                                            onUpdateMasterControls("SCOPE_CHANGED") { it.copy(activeScopeLabel = canonicalScope) }
                                        },
                                        label = { Text(localizedScope) },
                                        colors = FilterChipDefaults.filterChipColors(
                                            selectedContainerColor = LoboroYellow,
                                            selectedLabelColor = LoboroRoyalDeep,
                                            containerColor = LoboroRoyalCard,
                                            labelColor = LoboroWhite
                                        )
                                    )
                                }
                            }

                            val mc = state.masterControls
                            val activeScopeIdx = canonicalScopes.indexOf(mc.activeScopeLabel)
                            val activeScopeDisplay = if (activeScopeIdx >= 0) {
                                strings.scopeOptions.getOrNull(activeScopeIdx) ?: mc.activeScopeLabel
                            } else mc.activeScopeLabel

                            fun mName(index: Int, fallback: String): String =
                                strings.masterControlNames.getOrNull(index) ?: fallback

                            fun confirmSensitiveToggle(
                                actionName: String,
                                humanTitle: String,
                                nextValue: Boolean,
                                transform: (MasterFeatureControls) -> MasterFeatureControls
                            ) {
                                onTouchActivity()
                                pendingConfirmation = PendingSensitiveAction(
                                    title = Translations.fmt(strings.confirmToggleTitleFormat, humanTitle),
                                    description = Translations.fmt(
                                        strings.confirmToggleDescFormat,
                                        humanTitle,
                                        if (nextValue) "ON" else "OFF",
                                        activeScopeDisplay
                                    ),
                                    onConfirm = { onUpdateMasterControls(actionName, transform) }
                                )
                            }

                            val lbl0 = mName(0, "1. Entire App & Maintenance Mode")
                            MasterToggleRow(lbl0, mc.appMaintenanceMode, isWarning = true) { v ->
                                confirmSensitiveToggle("TOGGLE_MAINTENANCE_MODE", lbl0, v) {
                                    it.copy(appMaintenanceMode = v)
                                }
                            }
                            val lbl1 = mName(1, "2. Worker Registration")
                            MasterToggleRow(lbl1, mc.workerRegistration) { v ->
                                confirmSensitiveToggle("TOGGLE_WORKER_REG", lbl1, v) {
                                    it.copy(workerRegistration = v)
                                }
                            }
                            val lbl2 = mName(2, "3. Employer Registration")
                            MasterToggleRow(lbl2, mc.employerRegistration) { v ->
                                confirmSensitiveToggle("TOGGLE_EMPLOYER_REG", lbl2, v) {
                                    it.copy(employerRegistration = v)
                                }
                            }
                            MasterToggleRow(mName(3, "4. Job Posting"), mc.jobPosting) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_JOB_POSTING") { it.copy(jobPosting = v) }
                            }
                            MasterToggleRow(mName(4, "5. Job Searching"), mc.jobSearching) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_JOB_SEARCHING") { it.copy(jobSearching = v) }
                            }
                            MasterToggleRow(mName(5, "6. Daily Jobs"), mc.dailyJobs) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_DAILY_JOBS") { it.copy(dailyJobs = v) }
                            }
                            MasterToggleRow(mName(6, "7. Monthly Salary Jobs"), mc.monthlyJobs) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_MONTHLY_JOBS") { it.copy(monthlyJobs = v) }
                            }
                            val lbl7 = mName(7, "8. Coin Purchases")
                            MasterToggleRow(lbl7, mc.coinPurchases) { v ->
                                confirmSensitiveToggle("TOGGLE_COIN_PURCHASES", lbl7, v) {
                                    it.copy(coinPurchases = v)
                                }
                            }
                            val lbl8 = mName(8, "9. Wallet Withdrawals")
                            MasterToggleRow(lbl8, mc.withdrawals) { v ->
                                confirmSensitiveToggle("TOGGLE_WITHDRAWALS", lbl8, v) {
                                    it.copy(withdrawals = v)
                                }
                            }
                            MasterToggleRow(mName(9, "10. Job Fees & Coin Pricing"), mc.jobFeesAndPricingEnabled) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_JOB_FEES") { it.copy(jobFeesAndPricingEnabled = v) }
                            }
                            MasterToggleRow(mName(10, "11. Offers & Promotions"), mc.offers) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_OFFERS") { it.copy(offers = v) }
                            }
                            MasterToggleRow(mName(11, "12. Referral Rewards"), mc.referralSystem) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_REFERRALS") { it.copy(referralSystem = v) }
                            }
                            MasterToggleRow(mName(12, "13. Notifications & Admin Announcements"), mc.notifications) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_NOTIFICATIONS") { it.copy(notifications = v) }
                            }
                            val lbl13 = mName(13, "14. Worker & Employer Account Controls")
                            MasterToggleRow(lbl13, mc.accountManagementEnabled) { v ->
                                confirmSensitiveToggle("TOGGLE_ACCOUNT_CONTROLS", lbl13, v) {
                                    it.copy(accountManagementEnabled = v)
                                }
                            }
                            MasterToggleRow(mName(14, "15. Job Categories & Subcategories"), mc.categoryManagementEnabled) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_CATEGORY_SYSTEM") { it.copy(categoryManagementEnabled = v) }
                            }
                            MasterToggleRow(mName(15, "16. Ratings & Automatic Badges"), mc.badgeSystem) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_BADGES") { it.copy(badgeSystem = v) }
                            }
                            MasterToggleRow(mName(16, "17. Seniority & Loyalty Support"), mc.loyaltySupport) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_LOYALTY_SUPPORT") { it.copy(loyaltySupport = v) }
                            }
                            val lbl17 = mName(17, "18. Emergency & Worker Safety Systems")
                            MasterToggleRow(lbl17, mc.emergencySafetySystemEnabled) { v ->
                                confirmSensitiveToggle("TOGGLE_SAFETY_SYSTEM", lbl17, v) {
                                    it.copy(emergencySafetySystemEnabled = v)
                                }
                            }
                            MasterToggleRow(mName(18, "19. SMS Alerts"), mc.smsAlerts) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_SMS_ALERTS") { it.copy(smsAlerts = v) }
                            }
                            MasterToggleRow(mName(19, "20. IVR Services"), mc.ivrSupport) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_IVR_SERVICES") { it.copy(ivrSupport = v) }
                            }
                            MasterToggleRow(mName(20, "21. Language Settings (12 Languages)"), mc.languageSettingsEnabled) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_LANGUAGE_SETTINGS") { it.copy(languageSettingsEnabled = v) }
                            }
                            MasterToggleRow(mName(21, "22. Country, State & City Availability"), mc.regionalAvailabilityEnabled) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_REGIONAL_AVAILABILITY") { it.copy(regionalAvailabilityEnabled = v) }
                            }
                            val lbl22 = mName(22, "23. VIP ID Reservations & Management")
                            MasterToggleRow(lbl22, mc.vipIdReservationsEnabled) { v ->
                                confirmSensitiveToggle("TOGGLE_VIP_ID_RESERVATIONS", lbl22, v) {
                                    it.copy(vipIdReservationsEnabled = v)
                                }
                            }
                            MasterToggleRow(mName(23, "24. Reports, Complaints & Moderation"), mc.moderationReportsEnabled) { v ->
                                onTouchActivity()
                                onUpdateMasterControls("TOGGLE_MODERATION_REPORTS") { it.copy(moderationReportsEnabled = v) }
                            }
                            val lbl24 = mName(24, "25. Payment Gateway Integration")
                            MasterToggleRow(lbl24, mc.paymentGatewayEnabled) { v ->
                                confirmSensitiveToggle("TOGGLE_PAYMENT_GATEWAY", lbl24, v) {
                                    it.copy(paymentGatewayEnabled = v)
                                }
                            }
                        }
                    }
                }

                // Red Admin Notice Composer
                val canonicalAudiences = listOf("All Users", "Workers Only", "Employers Only")
                item {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.5.dp, LoboroRed)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Text(strings.publishNoticeTitle, style = MaterialTheme.typography.titleMedium, color = LoboroRedText)
                            OutlinedTextField(
                                value = noticeMessage,
                                onValueChange = {
                                    onTouchActivity()
                                    noticeMessage = it
                                },
                                label = { Text(strings.announcementMessageLabel) },
                                placeholder = { Text(strings.announcementPlaceholder) },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("admin_notice_message_input")
                            )
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                OutlinedTextField(
                                    value = noticeActionLabel,
                                    onValueChange = {
                                        onTouchActivity()
                                        noticeActionLabel = it
                                    },
                                    label = { Text(strings.actionLinkLabel) },
                                    modifier = Modifier.weight(1f),
                                    singleLine = true
                                )
                                OutlinedTextField(
                                    value = noticeScope,
                                    onValueChange = {
                                        onTouchActivity()
                                        noticeScope = it
                                    },
                                    label = { Text(strings.scopeFieldLabel) },
                                    modifier = Modifier.weight(1f),
                                    singleLine = true
                                )
                            }
                            Row(
                                modifier = Modifier.horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                canonicalAudiences.forEachIndexed { idx, canonicalAud ->
                                    val localizedAud = strings.audienceOptions.getOrNull(idx) ?: canonicalAud
                                    FilterChip(
                                        selected = noticeAudience == canonicalAud,
                                        onClick = {
                                            onTouchActivity()
                                            noticeAudience = canonicalAud
                                        },
                                        label = { Text(localizedAud) },
                                        colors = FilterChipDefaults.filterChipColors(
                                            selectedContainerColor = LoboroRed,
                                            selectedLabelColor = LoboroWhite,
                                            containerColor = LoboroRoyalCard,
                                            labelColor = LoboroWhite
                                        )
                                    )
                                }
                            }
                            Button(
                                onClick = {
                                    onTouchActivity()
                                    val msgSnapshot = noticeMessage
                                    val actionSnapshot = noticeActionLabel
                                    val audSnapshot = noticeAudience
                                    val audIdx = canonicalAudiences.indexOf(audSnapshot)
                                    val audDisplay = strings.audienceOptions.getOrNull(audIdx) ?: audSnapshot
                                    val scopeSnapshot = noticeScope
                                    pendingConfirmation = PendingSensitiveAction(
                                        title = strings.confirmBroadcastTitle,
                                        description = Translations.fmt(
                                            strings.confirmBroadcastDescFormat,
                                            audDisplay,
                                            scopeSnapshot
                                        ),
                                        onConfirm = {
                                            onPublishAdminNotice(msgSnapshot, actionSnapshot, audSnapshot, scopeSnapshot)
                                            noticeMessage = ""
                                        }
                                    )
                                },
                                enabled = noticeMessage.isNotBlank() && state.masterControls.notifications,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("publish_admin_notice_button"),
                                colors = ButtonDefaults.buttonColors(containerColor = LoboroRed, contentColor = LoboroWhite)
                            ) {
                                Text(strings.broadcastNoticeBtn, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }

                // Dynamic Coin Price & Job Fee Configurator
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
                            Text(strings.coinPricingTitle, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                            Text(
                                text = Translations.fmt(
                                    strings.coinPricingSummaryFormat,
                                    state.feeConfig.coinPriceInr,
                                    state.feeConfig.normalDailyJobCoins,
                                    state.feeConfig.specialDailyJobCoins,
                                    state.feeConfig.monthlySalaryJobCoins
                                ),
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Button(
                                    onClick = {
                                        onTouchActivity()
                                        onUpdateFeeConfig { it.copy(normalDailyJobCoins = (it.normalDailyJobCoins % 5) + 1) }
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = LoboroYellow, contentColor = LoboroRoyalDeep),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(Translations.fmt(strings.dailyBtnFormat, state.feeConfig.normalDailyJobCoins), fontWeight = FontWeight.Bold)
                                }
                                Button(
                                    onClick = {
                                        onTouchActivity()
                                        onUpdateFeeConfig { it.copy(specialDailyJobCoins = (it.specialDailyJobCoins % 6) + 1) }
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = LoboroYellow, contentColor = LoboroRoyalDeep),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(Translations.fmt(strings.masonBtnFormat, state.feeConfig.specialDailyJobCoins), fontWeight = FontWeight.Bold)
                                }
                                Button(
                                    onClick = {
                                        onTouchActivity()
                                        onUpdateFeeConfig { it.copy(monthlySalaryJobCoins = if (it.monthlySalaryJobCoins >= 40) 20 else it.monthlySalaryJobCoins + 5) }
                                    },
                                    border = BorderStroke(1.dp, LoboroYellow),
                                    colors = ButtonDefaults.buttonColors(containerColor = LoboroRoyalCard, contentColor = LoboroYellow),
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Text(Translations.fmt(strings.monthlyBtnFormat, state.feeConfig.monthlySalaryJobCoins), fontWeight = FontWeight.Bold)
                                }
                            }
                            Row(
                                modifier = Modifier.horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                FeeChargePoint.entries.forEach { cp ->
                                    FilterChip(
                                        selected = state.feeConfig.chargePoint == cp,
                                        onClick = {
                                            onTouchActivity()
                                            onUpdateFeeConfig { it.copy(chargePoint = cp) }
                                        },
                                        label = { Text(strings.feeChargePoints[cp] ?: cp.name.replace('_', ' ')) },
                                        colors = FilterChipDefaults.filterChipColors(
                                            selectedContainerColor = LoboroYellow,
                                            selectedLabelColor = LoboroRoyalDeep,
                                            containerColor = LoboroRoyalCard,
                                            labelColor = LoboroWhite
                                        )
                                    )
                                }
                            }
                        }
                    }
                }

                // VIP Reserved ID Registry
                item {
                    Surface(
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalCard,
                        border = BorderStroke(1.5.dp, LoboroYellow)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text(strings.protectedVipIdsTitle, style = MaterialTheme.typography.titleSmall, color = LoboroYellow)
                            Text(
                                text = LoboroIdRegistry.reservedVipIds.sorted().joinToString(", "),
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                            Text(
                                text = strings.protectedVipIdsNote,
                                style = MaterialTheme.typography.labelSmall,
                                color = LoboroTextMutedLight
                            )
                        }
                    }
                }

                // Safety Case Investigation Dashboard
                item {
                    Text(strings.safetyInvestigationTitle, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                }
                items(state.safetyCases, key = { it.id }) { sc ->
                    val catLabel = strings.safetyCategories[sc.category] ?: sc.category.name
                    val statusLabel = strings.safetyStatuses[sc.status] ?: sc.status.name
                    val scDesc = sc.localizedDescriptions[state.activeLanguage] ?: sc.description
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(14.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text("${sc.id} · $catLabel (${sc.urgency.name})", style = MaterialTheme.typography.titleSmall, color = LoboroRedText)
                            Text("${sc.workerLoboroId} · ${sc.employerLoboroId} · ${sc.location}", style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                            Text(scDesc, style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                            Text("$statusLabel · ${sc.actionHistory.lastOrNull().orEmpty()}", style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                            Row(
                                modifier = Modifier.horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                SafetyCaseStatus.entries.forEach { st ->
                                    FilterChip(
                                        selected = sc.status == st,
                                        onClick = {
                                            onTouchActivity()
                                            onAdvanceSafetyStatus(sc.id, st)
                                        },
                                        label = { Text(strings.safetyStatuses[st] ?: st.name.replace('_', ' ')) },
                                        colors = FilterChipDefaults.filterChipColors(
                                            selectedContainerColor = LoboroYellow,
                                            selectedLabelColor = LoboroRoyalDeep,
                                            containerColor = LoboroRoyalCard,
                                            labelColor = LoboroWhite
                                        )
                                    )
                                }
                            }
                        }
                    }
                }

                // Category Activator (All 24 Categories)
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
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(strings.manageCategoriesTitle, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                                TextButton(onClick = {
                                    onTouchActivity()
                                    showAllCategories = !showAllCategories
                                }) {
                                    Text(if (showAllCategories) strings.showLessLabel else strings.showAll24Label, color = LoboroYellow)
                                }
                            }
                            val visibleCategories = if (showAllCategories) state.categoryConfigs else state.categoryConfigs.take(8)
                            visibleCategories.forEach { cfg ->
                                MasterToggleRow(
                                    label = strings.categories[cfg.id] ?: cfg.id.defaultName,
                                    checked = cfg.active
                                ) {
                                    onTouchActivity()
                                    onToggleCategory(cfg.id)
                                }
                            }
                        }
                    }
                }

                // Immutable Owner Audit Logs
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
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Icon(Icons.Filled.History, contentDescription = null, tint = LoboroYellow)
                                Text(strings.auditLogTitle, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                            }
                            state.ownerAuditLogs.take(12).forEach { entry ->
                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = LoboroRoyalDeep
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(10.dp),
                                        verticalArrangement = Arrangement.spacedBy(2.dp)
                                    ) {
                                        Text(
                                            text = "${entry.action} · ${entry.actorId} · ${entry.timestampLabel}",
                                            style = MaterialTheme.typography.labelMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = LoboroYellow
                                        )
                                        Text(
                                            text = entry.details,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroTextMutedLight
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    val confirmDialog = pendingConfirmation
    if (confirmDialog != null) {
        AlertDialog(
            onDismissRequest = { pendingConfirmation = null },
            containerColor = LoboroRoyalElevated,
            title = {
                Text(
                    text = confirmDialog.title,
                    style = MaterialTheme.typography.titleMedium,
                    color = LoboroYellow,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(
                    text = confirmDialog.description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = LoboroWhite
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        confirmDialog.onConfirm()
                        pendingConfirmation = null
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = LoboroYellow,
                        contentColor = LoboroRoyalDeep
                    )
                ) {
                    Text(strings.confirmActionLabel, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { pendingConfirmation = null }) {
                    Text(strings.cancelLabel, color = LoboroYellow)
                }
            }
        )
    }
}

@Composable
private fun MasterToggleRow(
    label: String,
    checked: Boolean,
    isWarning: Boolean = false,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = if (isWarning) FontWeight.Bold else FontWeight.Normal,
            color = if (isWarning && checked) LoboroRedText else LoboroWhite,
            modifier = Modifier.weight(1f).padding(end = 8.dp)
        )
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(
                checkedThumbColor = if (isWarning) LoboroWhite else LoboroRoyalDeep,
                checkedTrackColor = if (isWarning) LoboroRed else LoboroYellow,
                uncheckedThumbColor = LoboroTextMutedLight,
                uncheckedTrackColor = LoboroRoyalDark
            )
        )
    }
}
