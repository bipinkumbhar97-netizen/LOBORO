package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AdminPanelSettings
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Sms
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material.icons.filled.Warning
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.example.domain.model.OwnerRegistrationFormState
import com.example.domain.model.SupportedLanguage
import com.example.i18n.LocalAppStrings
import com.example.ui.components.LoboroLogoEmblem
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedSoft
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
fun OwnerRegistrationScreen(
    state: LoboroUiState,
    onSelectLanguage: (SupportedLanguage) -> Unit,
    onUpdateForm: ((OwnerRegistrationFormState) -> OwnerRegistrationFormState) -> Unit,
    onRequestOtp: () -> Unit,
    onVerifyOtp: () -> Unit,
    onSubmitRegistration: () -> Unit,
    onCancelBack: () -> Unit
) {
    val strings = LocalAppStrings.current
    val form = state.ownerRegistrationForm
    val passwordsMismatch = form.confirmLoginPassword.isNotEmpty() && form.loginPassword != form.confirmLoginPassword
    val pinsMismatch = form.confirmAdminPin.isNotEmpty() && form.adminPin != form.confirmAdminPin

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LoboroScreenGradient),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 560.dp)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Header Banner
            Surface(
                shape = RoundedCornerShape(22.dp),
                color = LoboroRoyalDeep,
                border = BorderStroke(1.5.dp, LoboroYellow),
                shadowElevation = 4.dp
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        LoboroLogoEmblem(size = 46.dp)
                        Column {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.AdminPanelSettings,
                                    contentDescription = null,
                                    tint = LoboroYellow,
                                    modifier = Modifier.size(18.dp)
                                )
                                Text(
                                    text = strings.ownerSetupTitle,
                                    style = MaterialTheme.typography.titleLarge,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = LoboroYellow
                                )
                            }
                            Text(
                                text = strings.ownerSetupSubtitle,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite.copy(alpha = 0.88f)
                            )
                        }
                    }

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = LoboroRoyalCard,
                        border = BorderStroke(1.dp, LoboroYellow.copy(alpha = 0.7f))
                    ) {
                        Row(
                            modifier = Modifier.padding(10.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.Top
                        ) {
                            Icon(Icons.Filled.Lock, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(18.dp))
                            Text(
                                text = strings.ownerSetupLockNote,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                        }
                    }
                }
            }

            // Honest Backend Integration Status Banner
            if (!state.ownerBackendConfigured) {
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = LoboroRedSoft,
                    border = BorderStroke(1.5.dp, LoboroRed)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(Icons.Filled.Warning, contentDescription = null, tint = LoboroRedText)
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text(
                                text = strings.ownerBackendReqTitle,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = LoboroRedText
                            )
                            Text(
                                text = strings.ownerBackendReqBody,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                        }
                    }
                }
            }

            if (form.statusMessage != null) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = if (form.isError) LoboroRedSoft else LoboroRoyalCard,
                    border = BorderStroke(1.dp, if (form.isError) LoboroRed else LoboroYellow)
                ) {
                    Text(
                        text = form.statusMessage,
                        style = MaterialTheme.typography.bodySmall,
                        color = if (form.isError) LoboroRedText else LoboroYellow,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                    )
                }
            }

            // Registration Card
            Surface(
                shape = RoundedCornerShape(20.dp),
                color = LoboroRoyalElevated,
                border = BorderStroke(1.dp, LoboroRoyalBorder)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = strings.preferredLanguageLabel,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = LoboroYellow
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        SupportedLanguage.entries.forEach { lang ->
                            FilterChip(
                                selected = form.preferredLanguage == lang,
                                onClick = {
                                    onUpdateForm { it.copy(preferredLanguage = lang) }
                                    onSelectLanguage(lang)
                                },
                                label = { Text(lang.nativeName) },
                                modifier = Modifier.testTag("owner_reg_lang_${lang.code}"),
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = LoboroYellow,
                                    selectedLabelColor = LoboroRoyalDeep,
                                    containerColor = LoboroRoyalCard,
                                    labelColor = LoboroWhite
                                )
                            )
                        }
                    }

                    Text(
                        text = strings.serverSetupAuthHeading,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = LoboroYellow
                    )
                    OutlinedTextField(
                        value = form.setupAuthorizationCode,
                        onValueChange = { v -> onUpdateForm { it.copy(setupAuthorizationCode = v) } },
                        label = { Text(strings.bootstrapSecretLabel) },
                        placeholder = { Text(strings.bootstrapSecretPlaceholder) },
                        visualTransformation = PasswordVisualTransformation(),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_bootstrap_input")
                    )

                    Text(
                        text = strings.ownerIdentityHeading,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = LoboroYellow
                    )
                    // 1. Full Name
                    OutlinedTextField(
                        value = form.fullName,
                        onValueChange = { v -> onUpdateForm { it.copy(fullName = v) } },
                        label = { Text(strings.ownerNameField) },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_name_input")
                    )

                    // 2. Owner's own mobile number
                    OutlinedTextField(
                        value = form.mobileNumber,
                        onValueChange = { v ->
                            onUpdateForm {
                                it.copy(
                                    mobileNumber = v,
                                    otpSent = false,
                                    otpVerifiedOnServer = false,
                                    otpSessionId = null
                                )
                            }
                        },
                        label = { Text(strings.ownerMobileField) },
                        placeholder = { Text("+91 9XXXXXXXXX") },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_mobile_input")
                    )

                    // 3. OTP Verification
                    Button(
                        onClick = onRequestOtp,
                        enabled = !form.isSubmitting,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_send_otp_button"),
                        border = BorderStroke(1.5.dp, LoboroYellow),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LoboroRoyalCard,
                            contentColor = LoboroYellow
                        )
                    ) {
                        Icon(Icons.Filled.Sms, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text(if (form.otpSent) strings.resendMobileOtpButton else strings.ownerSendOtpBtn, fontWeight = FontWeight.Bold)
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = form.otpCodeInput,
                            onValueChange = { input ->
                                val digits = input.filter { it.isDigit() }.take(6)
                                onUpdateForm { it.copy(otpCodeInput = digits) }
                            },
                            label = { Text(strings.enterOtpStepLabel) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                            singleLine = true,
                            modifier = Modifier
                                .weight(1f)
                                .testTag("owner_reg_otp_input")
                        )
                        Button(
                            onClick = onVerifyOtp,
                            enabled = !form.isSubmitting && !form.otpVerifiedOnServer,
                            modifier = Modifier.testTag("owner_reg_verify_otp_button"),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = LoboroYellow,
                                contentColor = LoboroRoyalDeep
                            )
                        ) {
                            Text(if (form.otpVerifiedOnServer) strings.verifiedLabel else strings.verifyOtpButton, fontWeight = FontWeight.Bold)
                        }
                    }

                    if (form.otpVerifiedOnServer) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = LoboroRoyalCard,
                            border = BorderStroke(1.dp, LoboroYellow)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Icon(Icons.Filled.VerifiedUser, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(18.dp))
                                Text(
                                    text = strings.ownerMobileVerifiedNote,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroYellow
                                )
                            }
                        }
                    }

                    Text(
                        text = strings.credentialsHeading,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = LoboroYellow
                    )
                    // 4. Create Login Password
                    OutlinedTextField(
                        value = form.loginPassword,
                        onValueChange = { v -> onUpdateForm { it.copy(loginPassword = v) } },
                        label = { Text(strings.createPasswordLabel) },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_password_input")
                    )

                    // 5. Confirm Login Password
                    OutlinedTextField(
                        value = form.confirmLoginPassword,
                        onValueChange = { v -> onUpdateForm { it.copy(confirmLoginPassword = v) } },
                        label = { Text(strings.confirmPasswordLabel) },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        isError = passwordsMismatch,
                        supportingText = if (passwordsMismatch) {
                            { Text(strings.passwordsMismatchError, color = LoboroRedText) }
                        } else null,
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_confirm_password_input")
                    )

                    // 6. Create 4-digit Admin PIN
                    OutlinedTextField(
                        value = form.adminPin,
                        onValueChange = { input ->
                            val digits = input.filter { it.isDigit() }.take(4)
                            onUpdateForm { it.copy(adminPin = digits) }
                        },
                        label = { Text(strings.createPinLabel) },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_pin_input")
                    )

                    // 7. Confirm 4-digit Admin PIN
                    OutlinedTextField(
                        value = form.confirmAdminPin,
                        onValueChange = { input ->
                            val digits = input.filter { it.isDigit() }.take(4)
                            onUpdateForm { it.copy(confirmAdminPin = digits) }
                        },
                        label = { Text(strings.confirmPinLabel) },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                        isError = pinsMismatch,
                        supportingText = if (pinsMismatch) {
                            { Text(strings.pinsMismatchError, color = LoboroRedText) }
                        } else null,
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_confirm_pin_input")
                    )

                    Text(
                        text = strings.credentialsHashNote,
                        style = MaterialTheme.typography.bodySmall,
                        color = LoboroTextMutedLight
                    )

                    Button(
                        onClick = onSubmitRegistration,
                        enabled = !form.isSubmitting,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("owner_reg_submit_button"),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LoboroYellow,
                            contentColor = LoboroRoyalDeep
                        )
                    ) {
                        Icon(Icons.Filled.Security, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text(
                            text = if (form.isSubmitting) strings.registeringOwnerLabel else strings.completeOwnerRegButton,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }
            }

            OutlinedButton(
                onClick = onCancelBack,
                border = BorderStroke(1.5.dp, LoboroYellow),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(strings.returnToAppButton, color = LoboroYellow, fontWeight = FontWeight.Bold)
            }
        }
    }
}

