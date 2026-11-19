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
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.Construction
import androidx.compose.material.icons.filled.Login
import androidx.compose.material.icons.filled.PersonAdd
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.domain.model.NormalAccountRole
import com.example.domain.model.NormalUserLoginFormState
import com.example.domain.model.NormalUserRegistrationFormState
import com.example.domain.model.SupportedLanguage
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
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
fun UserAuthScreen(
    state: LoboroUiState,
    initialMode: Int = 0, // 0 = New Worker/Employer Registration, 1 = Returning User Login
    onSelectLanguage: (SupportedLanguage) -> Unit,
    onUpdateRegForm: ((NormalUserRegistrationFormState) -> NormalUserRegistrationFormState) -> Unit,
    onRequestRegOtp: () -> Unit,
    onVerifyRegOtp: () -> Unit,
    onSubmitReg: () -> Unit,
    onUpdateLoginForm: ((NormalUserLoginFormState) -> NormalUserLoginFormState) -> Unit,
    onRequestLoginOtp: () -> Unit,
    onVerifyLoginOtp: () -> Unit,
    onCancelBack: () -> Unit
) {
    val strings = LocalAppStrings.current
    var mode by remember(initialMode) { mutableIntStateOf(initialMode) }
    val reg = state.normalUserRegForm
    val login = state.normalUserLoginForm

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LoboroScreenGradient),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 580.dp)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Header Card
            Surface(
                shape = RoundedCornerShape(22.dp),
                color = LoboroRoyalDeep,
                border = BorderStroke(1.5.dp, LoboroYellow)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = if (mode == 0) strings.userRegTitle else strings.userLoginTitle,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.ExtraBold,
                        color = LoboroYellow
                    )
                    Text(
                        text = strings.userAuthSubtitle,
                        style = MaterialTheme.typography.bodySmall,
                        color = LoboroWhite.copy(alpha = 0.88f)
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(
                            onClick = { mode = 0 },
                            modifier = Modifier
                                .weight(1f)
                                .testTag("normal_auth_tab_register"),
                            border = if (mode == 0) null else BorderStroke(1.dp, LoboroRoyalBorder),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = if (mode == 0) LoboroYellow else LoboroRoyalCard,
                                contentColor = if (mode == 0) LoboroRoyalDeep else LoboroWhite
                            )
                        ) {
                            Icon(Icons.Filled.PersonAdd, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(6.dp))
                            Text(strings.registerTab, fontWeight = FontWeight.Bold)
                        }
                        Button(
                            onClick = { mode = 1 },
                            modifier = Modifier
                                .weight(1f)
                                .testTag("normal_auth_tab_login"),
                            border = if (mode == 1) null else BorderStroke(1.dp, LoboroRoyalBorder),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = if (mode == 1) LoboroYellow else LoboroRoyalCard,
                                contentColor = if (mode == 1) LoboroRoyalDeep else LoboroWhite
                            )
                        ) {
                            Icon(Icons.Filled.Login, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(Modifier.width(6.dp))
                            Text(strings.loginTab, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }

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
                                text = strings.dbOtpNotConnectedTitle,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = LoboroRedText
                            )
                            Text(
                                text = strings.dbOtpNotConnectedBody,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                        }
                    }
                }
            }

            if (mode == 0) {
                if (reg.statusMessage != null) {
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = if (reg.isError) LoboroRedSoft else LoboroRoyalCard,
                        border = BorderStroke(1.dp, if (reg.isError) LoboroRed else LoboroYellow)
                    ) {
                        Text(
                            text = reg.statusMessage,
                            style = MaterialTheme.typography.bodySmall,
                            color = if (reg.isError) LoboroRedText else LoboroYellow,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp)
                        )
                    }
                }

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
                            text = strings.selectAccountTypeStep,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = LoboroYellow
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Button(
                                onClick = { onUpdateRegForm { it.copy(selectedRole = NormalAccountRole.WORKER) } },
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("normal_reg_role_worker"),
                                border = if (reg.selectedRole == NormalAccountRole.WORKER) null else BorderStroke(1.dp, LoboroRoyalBorder),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (reg.selectedRole == NormalAccountRole.WORKER) LoboroYellow else LoboroRoyalCard,
                                    contentColor = if (reg.selectedRole == NormalAccountRole.WORKER) LoboroRoyalDeep else LoboroWhite
                                )
                            ) {
                                Icon(Icons.Filled.Construction, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.workerAccountLabel, fontWeight = FontWeight.Bold)
                            }
                            Button(
                                onClick = { onUpdateRegForm { it.copy(selectedRole = NormalAccountRole.EMPLOYER) } },
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("normal_reg_role_employer"),
                                border = if (reg.selectedRole == NormalAccountRole.EMPLOYER) null else BorderStroke(1.dp, LoboroRoyalBorder),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (reg.selectedRole == NormalAccountRole.EMPLOYER) LoboroYellow else LoboroRoyalCard,
                                    contentColor = if (reg.selectedRole == NormalAccountRole.EMPLOYER) LoboroRoyalDeep else LoboroWhite
                                )
                            ) {
                                Icon(Icons.Filled.Business, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.employerAccountLabel, fontWeight = FontWeight.Bold)
                            }
                        }

                        // Preferred Account Language Selector (12 Languages)
                        Text(
                            text = strings.preferredLanguageLabel,
                            style = MaterialTheme.typography.labelLarge,
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
                                    selected = reg.preferredLanguage == lang,
                                    onClick = {
                                        onUpdateRegForm { it.copy(preferredLanguage = lang) }
                                        onSelectLanguage(lang)
                                    },
                                    label = { Text(lang.nativeName) },
                                    modifier = Modifier.testTag("user_reg_lang_${lang.code}"),
                                    colors = FilterChipDefaults.filterChipColors(
                                        selectedContainerColor = LoboroYellow,
                                        selectedLabelColor = LoboroRoyalDeep,
                                        containerColor = LoboroRoyalCard,
                                        labelColor = LoboroWhite
                                    )
                                )
                            }
                        }

                        val registrationPaused = state.masterControls.appMaintenanceMode ||
                            (reg.selectedRole == NormalAccountRole.WORKER && !state.masterControls.workerRegistration) ||
                            (reg.selectedRole == NormalAccountRole.EMPLOYER && !state.masterControls.employerRegistration)

                        if (registrationPaused) {
                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = LoboroRedSoft,
                                border = BorderStroke(1.dp, LoboroRed)
                            ) {
                                val roleName = if (reg.selectedRole == NormalAccountRole.WORKER) {
                                    strings.workerAccountLabel
                                } else {
                                    strings.employerAccountLabel
                                }
                                Text(
                                    text = Translations.fmt(strings.regPausedForRoleFormat, roleName),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroRedText,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }

                        OutlinedTextField(
                            value = reg.fullName,
                            onValueChange = { v -> onUpdateRegForm { it.copy(fullName = v) } },
                            label = { Text(if (reg.selectedRole == NormalAccountRole.WORKER) strings.fullNameStepLabel else strings.businessNameStepLabel) },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_reg_name_input")
                        )

                        OutlinedTextField(
                            value = reg.mobileNumber,
                            onValueChange = { v ->
                                onUpdateRegForm {
                                    it.copy(
                                        mobileNumber = v,
                                        otpSent = false,
                                        otpVerifiedOnServer = false,
                                        otpSessionId = null
                                    )
                                }
                            },
                            label = { Text(strings.mobileStepLabel) },
                            placeholder = { Text("+91 9XXXXXXXXX") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_reg_mobile_input")
                        )

                        Button(
                            onClick = onRequestRegOtp,
                            enabled = !reg.isSubmitting && !registrationPaused,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_reg_send_otp_button"),
                            border = BorderStroke(1.5.dp, LoboroYellow),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = LoboroRoyalCard,
                                contentColor = LoboroYellow
                            )
                        ) {
                            Icon(Icons.Filled.Sms, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(8.dp))
                            Text(if (reg.otpSent) strings.resendMobileOtpButton else strings.sendRegOtpButton, fontWeight = FontWeight.Bold)
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            OutlinedTextField(
                                value = reg.otpCodeInput,
                                onValueChange = { input ->
                                    val digits = input.filter { it.isDigit() }.take(6)
                                    onUpdateRegForm { it.copy(otpCodeInput = digits) }
                                },
                                label = { Text(strings.enterOtpStepLabel) },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                                singleLine = true,
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("normal_reg_otp_input")
                            )
                            Button(
                                onClick = onVerifyRegOtp,
                                enabled = !reg.isSubmitting && !reg.otpVerifiedOnServer,
                                modifier = Modifier.testTag("normal_reg_verify_otp_button"),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroYellow,
                                    contentColor = LoboroRoyalDeep
                                )
                            ) {
                                Text(if (reg.otpVerifiedOnServer) strings.verifiedLabel else strings.verifyOtpButton, fontWeight = FontWeight.Bold)
                            }
                        }

                        if (reg.otpVerifiedOnServer) {
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
                                        text = strings.mobileVerifiedNote,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = LoboroYellow
                                    )
                                }
                            }
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            OutlinedTextField(
                                value = reg.homeState,
                                onValueChange = { v -> onUpdateRegForm { it.copy(homeState = v) } },
                                label = { Text(if (reg.selectedRole == NormalAccountRole.WORKER) strings.homeStateLabel else strings.stateShortLabel) },
                                singleLine = true,
                                modifier = Modifier.weight(1f)
                            )
                            OutlinedTextField(
                                value = reg.homeDistrict,
                                onValueChange = { v -> onUpdateRegForm { it.copy(homeDistrict = v) } },
                                label = { Text(if (reg.selectedRole == NormalAccountRole.WORKER) strings.homeDistrictLabel else strings.cityShortLabel) },
                                singleLine = true,
                                modifier = Modifier.weight(1f)
                            )
                        }

                        OutlinedTextField(
                            value = reg.currentCityState,
                            onValueChange = { v -> onUpdateRegForm { it.copy(currentCityState = v) } },
                            label = { Text(if (reg.selectedRole == NormalAccountRole.WORKER) strings.workCityStateLabel else strings.businessLocationLabel) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = reg.skillsText,
                            onValueChange = { v -> onUpdateRegForm { it.copy(skillsText = v) } },
                            label = { Text(if (reg.selectedRole == NormalAccountRole.WORKER) strings.skillsCategoriesLabel else strings.hiringCategoriesLabel) },
                            singleLine = true,
                            modifier = Modifier.fillMaxWidth()
                        )

                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LoboroRoyalCard,
                            border = BorderStroke(1.dp, LoboroRoyalBorder)
                        ) {
                            Row(
                                modifier = Modifier.padding(10.dp),
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(Icons.Filled.Badge, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(18.dp))
                                Text(
                                    text = strings.uniqueLbIdNotice,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroWhite
                                )
                            }
                        }

                        Button(
                            onClick = onSubmitReg,
                            enabled = !reg.isSubmitting && !registrationPaused,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_reg_submit_button"),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = LoboroYellow,
                                contentColor = LoboroRoyalDeep
                            )
                        ) {
                            Text(
                                text = if (reg.isSubmitting) strings.creatingProfileLabel else strings.createProfileButton,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }
                    }
                }
            } else {
                if (login.statusMessage != null) {
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = if (login.isError) LoboroRedSoft else LoboroRoyalCard,
                        border = BorderStroke(1.dp, if (login.isError) LoboroRed else LoboroYellow)
                    ) {
                        Text(
                            text = login.statusMessage,
                            style = MaterialTheme.typography.bodySmall,
                            color = if (login.isError) LoboroRedText else LoboroYellow,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp)
                        )
                    }
                }

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
                            text = strings.loginHeading,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = LoboroYellow
                        )
                        Text(
                            text = strings.loginSubtitle,
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroTextMutedLight
                        )

                        OutlinedTextField(
                            value = login.mobileNumber,
                            onValueChange = { v ->
                                onUpdateLoginForm {
                                    it.copy(mobileNumber = v, otpSent = false, otpSessionId = null)
                                }
                            },
                            label = { Text(strings.registeredMobileLabel) },
                            placeholder = { Text("+91 9XXXXXXXXX") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_login_mobile_input")
                        )

                        Button(
                            onClick = onRequestLoginOtp,
                            enabled = !login.isSubmitting,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_login_send_otp_button"),
                            border = BorderStroke(1.5.dp, LoboroYellow),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = LoboroRoyalCard,
                                contentColor = LoboroYellow
                            )
                        ) {
                            Icon(Icons.Filled.Sms, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(8.dp))
                            Text(if (login.otpSent) strings.resendLoginOtpButton else strings.sendLoginOtpButton, fontWeight = FontWeight.Bold)
                        }

                        OutlinedTextField(
                            value = login.otpCodeInput,
                            onValueChange = { input ->
                                val digits = input.filter { it.isDigit() }.take(6)
                                onUpdateLoginForm { it.copy(otpCodeInput = digits) }
                            },
                            label = { Text(strings.enterLoginOtpLabel) },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_login_otp_input")
                        )

                        Button(
                            onClick = onVerifyLoginOtp,
                            enabled = !login.isSubmitting,
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("normal_login_submit_button"),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = LoboroYellow,
                                contentColor = LoboroRoyalDeep
                            )
                        ) {
                            Text(
                                text = if (login.isSubmitting) strings.verifyingOtpLabel else strings.verifyOtpOpenHomeButton,
                                fontWeight = FontWeight.ExtraBold
                            )
                        }
                    }
                }
            }

            OutlinedButton(
                onClick = onCancelBack,
                border = BorderStroke(1.5.dp, LoboroYellow),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(strings.backToHomepageButton, color = LoboroYellow, fontWeight = FontWeight.Bold)
            }
        }
    }
}

