package com.example.ui.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Gavel
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PhotoLibrary
import androidx.compose.material.icons.filled.Policy
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import com.example.domain.integrations.BackendServicesChecklist
import com.example.domain.model.SupportedLanguage
import com.example.domain.model.UserRole
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.components.LoboroLogoEmblem
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

@Composable
fun AuthProfileSettingsScreen(
    state: LoboroUiState,
    initialTab: Int = 0, // 0 = Profile & Registration, 1 = Notifications, 2 = Settings & Backend Setup
    onSelectLanguage: (SupportedLanguage) -> Unit,
    onSwitchRolePreview: (UserRole) -> Unit,
    onRegisterProfile: (
        role: UserRole,
        fullName: String,
        homeState: String,
        homeDistrict: String,
        currentCity: String,
        skillsText: String,
        emergencyName: String,
        emergencyPhone: String,
        emergencyConsent: Boolean,
        photoUri: String?,
        faceCaptured: Boolean
    ) -> Unit,
    onSetLowDataMode: (Boolean) -> Unit,
    onSetReducedMotion: (Boolean) -> Unit,
    onOpenNoticeRoute: (String) -> Unit,
    onOpenUserAuth: (Int) -> Unit,
    onLogoutNormalUser: () -> Unit
) {
    val strings = LocalAppStrings.current
    var activeTab by remember(initialTab) { mutableIntStateOf(initialTab) }

    // Registration fields
    var regRole by remember { mutableStateOf(UserRole.WORKER) }
    var regName by remember { mutableStateOf("") }
    var regHomeState by remember { mutableStateOf("Assam") }
    var regHomeDistrict by remember { mutableStateOf("Barpeta") }
    var regCurrentCity by remember { mutableStateOf("Hyderabad, Telangana") }
    var regSkills by remember { mutableStateOf("Mason, Tile Work") }
    var regEmergencyName by remember { mutableStateOf("") }
    var regEmergencyPhone by remember { mutableStateOf("") }
    var regConsent by remember { mutableStateOf(true) }
    var selectedPhotoUri by remember { mutableStateOf<String?>(null) }

    // Compliant zero-permission Android Photo Picker (never requests READ_MEDIA_IMAGES)
    val photoPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.PickVisualMedia()
    ) { uri ->
        if (uri != null) {
            selectedPhotoUri = uri.toString()
        }
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
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Section Tabs
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    listOf(
                        0 to strings.navProfile,
                        1 to strings.navNotifications,
                        2 to strings.navSettings
                    ).forEach { (idx, label) ->
                        val active = activeTab == idx
                        Button(
                            onClick = { activeTab = idx },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = if (active) LoboroYellow else LoboroRoyalElevated,
                                contentColor = if (active) LoboroRoyalDeep else LoboroWhite
                            ),
                            border = BorderStroke(1.dp, if (active) LoboroYellow else LoboroRoyalBorder)
                        ) {
                            Text(label, maxLines = 1, style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }

            when (activeTab) {
                0 -> {
                    // Active Identity Card + Role Preview Switcher
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
                                    LoboroLogoEmblem(size = 48.dp)
                                    Column {
                                        val roleDisplay = strings.userRoles[state.activeRole] ?: state.activeRole.name
                                        val homeSt = strings.indianStates[state.activeProfile.homeState] ?: state.activeProfile.homeState
                                        Text(state.activeProfile.fullName, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                                        Text("${strings.loboroIdLabel}: ${state.activeProfile.loboroId} · ${strings.roleLabel}: $roleDisplay", style = MaterialTheme.typography.bodySmall, color = LoboroWhite)
                                        Text("${state.activeProfile.homeDistrict}, $homeSt → ${state.activeProfile.currentCityState}", style = MaterialTheme.typography.bodySmall, color = LoboroWhite.copy(alpha = 0.85f))
                                    }
                                }

                                if (state.normalUserSession.isSignedIn) {
                                    Text(
                                        text = Translations.fmt(
                                            strings.verifiedNormalAccountBanner,
                                            state.activeProfile.loboroId,
                                            strings.userRoles[state.activeProfile.role] ?: state.activeProfile.role.name
                                        ),
                                        style = MaterialTheme.typography.labelMedium,
                                        color = LoboroYellow
                                    )
                                    OutlinedButton(
                                        onClick = onLogoutNormalUser,
                                        border = BorderStroke(1.dp, LoboroYellow),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        Text(strings.signOutLabel, color = LoboroYellow, fontWeight = FontWeight.Bold)
                                    }
                                } else {
                                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                        Button(
                                            onClick = { onOpenUserAuth(0) },
                                            modifier = Modifier
                                                .weight(1f)
                                                .testTag("profile_open_register_button"),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = LoboroYellow,
                                                contentColor = LoboroRoyalDeep
                                            )
                                        ) {
                                            Text("${strings.registerTab} (OTP)", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                                        }
                                        OutlinedButton(
                                            onClick = { onOpenUserAuth(1) },
                                            modifier = Modifier
                                                .weight(1f)
                                                .testTag("profile_open_login_button"),
                                            border = BorderStroke(1.dp, LoboroYellow)
                                        ) {
                                            Text("${strings.loginTab} (OTP)", color = LoboroYellow, style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                                        }
                                    }

                                    Text(strings.offlinePreviewHeading, style = MaterialTheme.typography.labelMedium, color = LoboroYellow)
                                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                        Button(
                                            onClick = { onSwitchRolePreview(UserRole.WORKER) },
                                            modifier = Modifier.weight(1f),
                                            border = if (state.activeRole == UserRole.WORKER) null else BorderStroke(1.dp, LoboroRoyalBorder),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = if (state.activeRole == UserRole.WORKER) LoboroYellow else LoboroRoyalCard,
                                                contentColor = if (state.activeRole == UserRole.WORKER) LoboroRoyalDeep else LoboroWhite
                                            )
                                        ) {
                                            Text(strings.workerAccountLabel, style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                                        }
                                        Button(
                                            onClick = { onSwitchRolePreview(UserRole.EMPLOYER) },
                                            modifier = Modifier.weight(1f),
                                            border = if (state.activeRole == UserRole.EMPLOYER) null else BorderStroke(1.dp, LoboroRoyalBorder),
                                            colors = ButtonDefaults.buttonColors(
                                                containerColor = if (state.activeRole == UserRole.EMPLOYER) LoboroYellow else LoboroRoyalCard,
                                                contentColor = if (state.activeRole == UserRole.EMPLOYER) LoboroRoyalDeep else LoboroWhite
                                            )
                                        ) {
                                            Text(strings.employerAccountLabel, style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // Offline UI Preview Profile Form (Local Only — Real DB/OTP registration is via "Register (OTP)" above)
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
                                Text(strings.offlinePreviewCardTitle, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                                Text(
                                    text = strings.offlinePreviewCardSubtitle,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Button(
                                        onClick = { regRole = UserRole.WORKER },
                                        modifier = Modifier.weight(1f),
                                        border = if (regRole == UserRole.WORKER) null else BorderStroke(1.dp, LoboroRoyalBorder),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = if (regRole == UserRole.WORKER) LoboroYellow else LoboroRoyalCard,
                                            contentColor = if (regRole == UserRole.WORKER) LoboroRoyalDeep else LoboroWhite
                                        )
                                    ) { Text(strings.workerAccountLabel, fontWeight = FontWeight.Bold) }
                                    Button(
                                        onClick = { regRole = UserRole.EMPLOYER },
                                        modifier = Modifier.weight(1f),
                                        border = if (regRole == UserRole.EMPLOYER) null else BorderStroke(1.dp, LoboroRoyalBorder),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = if (regRole == UserRole.EMPLOYER) LoboroYellow else LoboroRoyalCard,
                                            contentColor = if (regRole == UserRole.EMPLOYER) LoboroRoyalDeep else LoboroWhite
                                        )
                                    ) { Text(strings.employerAccountLabel, fontWeight = FontWeight.Bold) }
                                }

                                OutlinedTextField(
                                    value = regName,
                                    onValueChange = { regName = it },
                                    label = { Text(if (regRole == UserRole.WORKER) strings.fullNameStepLabel else strings.businessNameStepLabel) },
                                    modifier = Modifier.fillMaxWidth(),
                                    singleLine = true
                                )
                                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    OutlinedTextField(
                                        value = regHomeState,
                                        onValueChange = { regHomeState = it },
                                        label = { Text(if (regRole == UserRole.WORKER) strings.homeStateLabel else strings.stateShortLabel) },
                                        modifier = Modifier.weight(1f),
                                        singleLine = true
                                    )
                                    OutlinedTextField(
                                        value = regHomeDistrict,
                                        onValueChange = { regHomeDistrict = it },
                                        label = { Text(if (regRole == UserRole.WORKER) strings.homeDistrictLabel else strings.cityShortLabel) },
                                        modifier = Modifier.weight(1f),
                                        singleLine = true
                                    )
                                }
                                OutlinedTextField(
                                    value = regCurrentCity,
                                    onValueChange = { regCurrentCity = it },
                                    label = { Text(if (regRole == UserRole.WORKER) strings.workLocationLabel else strings.businessAddressLabel) },
                                    modifier = Modifier.fillMaxWidth(),
                                    singleLine = true
                                )
                                OutlinedTextField(
                                    value = regSkills,
                                    onValueChange = { regSkills = it },
                                    label = { Text(if (regRole == UserRole.WORKER) strings.skillsExpLabel else strings.businessCatLabel) },
                                    modifier = Modifier.fillMaxWidth(),
                                    singleLine = true
                                )

                                if (regRole == UserRole.WORKER) {
                                    OutlinedTextField(
                                        value = regEmergencyName,
                                        onValueChange = { regEmergencyName = it },
                                        label = { Text(strings.emergencyContactNameLabel) },
                                        modifier = Modifier.fillMaxWidth(),
                                        singleLine = true
                                    )
                                    OutlinedTextField(
                                        value = regEmergencyPhone,
                                        onValueChange = { regEmergencyPhone = it },
                                        label = { Text(strings.emergencyContactPhoneLabel) },
                                        modifier = Modifier.fillMaxWidth(),
                                        singleLine = true
                                    )
                                } else {
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = LoboroRoyalCard,
                                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                                    ) {
                                        Text(
                                            text = strings.aadhaarPrivacyNote,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroWhite,
                                            modifier = Modifier.padding(10.dp)
                                        )
                                    }
                                }

                                OutlinedButton(
                                    onClick = {
                                        photoPickerLauncher.launch(
                                            PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly)
                                        )
                                    },
                                    border = BorderStroke(1.dp, LoboroYellow),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Icon(Icons.Filled.PhotoLibrary, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(16.dp))
                                    Spacer(Modifier.width(6.dp))
                                    Text(if (selectedPhotoUri != null) strings.photoSelectedBtn else strings.selectProfilePhotoBtn, color = LoboroYellow)
                                }

                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Checkbox(
                                        checked = regConsent,
                                        onCheckedChange = { regConsent = it },
                                        colors = CheckboxDefaults.colors(checkedColor = LoboroYellow, checkmarkColor = LoboroRoyalDeep)
                                    )
                                    Text(
                                        text = strings.offlineConsentCheck,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = LoboroTextMutedLight
                                    )
                                }

                                val registrationPaused = state.masterControls.appMaintenanceMode ||
                                    (regRole == UserRole.WORKER && !state.masterControls.workerRegistration) ||
                                    (regRole == UserRole.EMPLOYER && !state.masterControls.employerRegistration)

                                if (registrationPaused) {
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = LoboroRedSoft,
                                        border = BorderStroke(1.dp, LoboroRed)
                                    ) {
                                        Text(
                                            text = Translations.fmt(
                                                strings.regPausedForRoleFormat,
                                                strings.userRoles[regRole] ?: regRole.name
                                            ),
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroRedText,
                                            modifier = Modifier.padding(10.dp)
                                        )
                                    }
                                }

                                Button(
                                    onClick = {
                                        onRegisterProfile(
                                            regRole,
                                            regName,
                                            regHomeState,
                                            regHomeDistrict,
                                            regCurrentCity,
                                            regSkills,
                                            regEmergencyName,
                                            regEmergencyPhone,
                                            regConsent,
                                            selectedPhotoUri,
                                            false
                                        )
                                    },
                                    enabled = !registrationPaused,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("register_preview_submit_button"),
                                    colors = ButtonDefaults.buttonColors(containerColor = LoboroYellow, contentColor = LoboroRoyalDeep)
                                ) {
                                    Text(strings.previewProfileBtn, fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }

                1 -> {
                    // Notifications History
                    item {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Icon(Icons.Filled.Notifications, contentDescription = null, tint = LoboroYellow)
                            Text(strings.navNotifications, style = MaterialTheme.typography.headlineSmall, color = LoboroYellow)
                        }
                    }
                    items(state.adminNotices, key = { it.id }) { notice ->
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = if (notice.isActive) LoboroRedSoft else LoboroRoyalElevated,
                            border = BorderStroke(1.dp, if (notice.isActive) LoboroRed else LoboroRoyalBorder)
                        ) {
                            Column(
                                modifier = Modifier.padding(14.dp),
                                verticalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = strings.adminNoticeHeading,
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = if (notice.isActive) LoboroRedText else LoboroYellow
                                    )
                                    Text("${notice.timestampLabel} · ${notice.expiryLabel}", style = MaterialTheme.typography.labelSmall, color = LoboroTextMutedLight)
                                }
                                Text(
                                    text = notice.localizedMessages[state.activeLanguage] ?: notice.message,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = Translations.fmt(
                                        strings.audienceScopeFormat,
                                        notice.targetAudience,
                                        notice.regionScope
                                    ),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                                val actionBtnLabel = when (notice.targetRoute) {
                                    "safety" -> if (notice.actionLabel.equals("OPEN SAFETY", ignoreCase = true)) strings.navHelpSafety else notice.actionLabel
                                    "wallet" -> if (notice.actionLabel.equals("VIEW WALLET", ignoreCase = true)) strings.navWallet else notice.actionLabel
                                    else -> notice.actionLabel
                                }
                                Button(
                                    onClick = { onOpenNoticeRoute(notice.targetRoute) },
                                    colors = ButtonDefaults.buttonColors(containerColor = LoboroYellow, contentColor = LoboroRoyalDeep)
                                ) {
                                    Text(actionBtnLabel, fontWeight = FontWeight.Bold)
                                }
                            }
                        }
                    }
                }

                2 -> {
                    // 12-Language Immediate Selector Card
                    item {
                        val langEnabled = state.masterControls.languageSettingsEnabled || state.ownerSession.isAuthenticated
                        Surface(
                            shape = RoundedCornerShape(18.dp),
                            color = LoboroRoyalElevated,
                            border = BorderStroke(1.5.dp, LoboroYellow)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                verticalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Icon(Icons.Filled.Language, contentDescription = null, tint = LoboroYellow)
                                    Column {
                                        Text(strings.languageSectionTitle, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                                        Text(strings.languageSectionSubtitle, style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                                    }
                                }

                                if (!langEnabled) {
                                    Surface(
                                        shape = RoundedCornerShape(10.dp),
                                        color = LoboroRedSoft,
                                        border = BorderStroke(1.dp, LoboroRed)
                                    ) {
                                        Text(
                                            text = strings.languagePausedByOwner,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = LoboroRedText,
                                            modifier = Modifier.padding(10.dp)
                                        )
                                    }
                                }

                                val chunkedLangs = SupportedLanguage.entries.chunked(2)
                                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                    chunkedLangs.forEach { pair ->
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                                        ) {
                                            pair.forEach { lang ->
                                                val selected = lang == state.activeLanguage
                                                Surface(
                                                    modifier = Modifier
                                                        .weight(1f)
                                                        .clip(RoundedCornerShape(12.dp))
                                                        .clickable(enabled = langEnabled) { onSelectLanguage(lang) }
                                                        .testTag("settings_lang_${lang.code}"),
                                                    shape = RoundedCornerShape(12.dp),
                                                    color = if (selected) LoboroYellow else LoboroRoyalCard,
                                                    border = BorderStroke(1.dp, if (selected) LoboroYellow else LoboroRoyalBorder)
                                                ) {
                                                    Row(
                                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                                                        verticalAlignment = Alignment.CenterVertically,
                                                        horizontalArrangement = Arrangement.SpaceBetween
                                                    ) {
                                                        Column(modifier = Modifier.weight(1f)) {
                                                            Text(
                                                                text = lang.nativeName,
                                                                style = MaterialTheme.typography.labelLarge,
                                                                fontWeight = FontWeight.Bold,
                                                                color = if (selected) LoboroRoyalDeep else LoboroWhite
                                                            )
                                                            Text(
                                                                text = lang.englishName,
                                                                style = MaterialTheme.typography.labelSmall,
                                                                color = if (selected) LoboroRoyalDeep.copy(alpha = 0.8f) else LoboroTextMutedLight
                                                            )
                                                        }
                                                        if (selected) {
                                                            Icon(
                                                                imageVector = Icons.Filled.Check,
                                                                contentDescription = strings.activeBadgeLabel,
                                                                tint = LoboroRoyalDeep,
                                                                modifier = Modifier.size(18.dp)
                                                            )
                                                        }
                                                    }
                                                }
                                            }
                                            if (pair.size < 2) {
                                                Spacer(modifier = Modifier.weight(1f))
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // Settings: Low-Data Mode & Reduced Motion
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
                                    Icon(Icons.Filled.Settings, contentDescription = null, tint = LoboroYellow)
                                    Text(strings.settingsHeading, style = MaterialTheme.typography.titleMedium, color = LoboroYellow)
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(strings.lowDataTitle, style = MaterialTheme.typography.titleSmall, color = LoboroWhite)
                                        Text(strings.lowDataSubtitle, style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                                    }
                                    Switch(
                                        checked = state.lowDataMode,
                                        onCheckedChange = onSetLowDataMode,
                                        colors = SwitchDefaults.colors(
                                            checkedThumbColor = LoboroRoyalDeep,
                                            checkedTrackColor = LoboroYellow,
                                            uncheckedThumbColor = LoboroTextMutedLight,
                                            uncheckedTrackColor = LoboroRoyalDark
                                        )
                                    )
                                }
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(strings.reducedMotionTitle, style = MaterialTheme.typography.titleSmall, color = LoboroWhite)
                                        Text(strings.reducedMotionSubtitle, style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                                    }
                                    Switch(
                                        checked = state.reducedMotion,
                                        onCheckedChange = onSetReducedMotion,
                                        colors = SwitchDefaults.colors(
                                            checkedThumbColor = LoboroRoyalDeep,
                                            checkedTrackColor = LoboroYellow,
                                            uncheckedThumbColor = LoboroTextMutedLight,
                                            uncheckedTrackColor = LoboroRoyalDark
                                        )
                                    )
                                }
                            }
                        }
                    }

                    // Privacy Policy, Terms & Support
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
                                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Icon(Icons.Filled.Policy, contentDescription = null, tint = LoboroYellow)
                                    Text(strings.privacyPolicyTitle, style = MaterialTheme.typography.titleSmall, color = LoboroYellow, fontWeight = FontWeight.Bold)
                                }
                                Text(strings.privacyPolicyBody, style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)

                                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Icon(Icons.Filled.Gavel, contentDescription = null, tint = LoboroYellow)
                                    Text(strings.termsOfServiceTitle, style = MaterialTheme.typography.titleSmall, color = LoboroYellow, fontWeight = FontWeight.Bold)
                                }
                                Text(strings.termsOfServiceBody, style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)

                                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Icon(Icons.Filled.HelpOutline, contentDescription = null, tint = LoboroYellow)
                                    Text(strings.helpSupportTitle, style = MaterialTheme.typography.titleSmall, color = LoboroYellow, fontWeight = FontWeight.Bold)
                                }
                                Text(strings.helpSupportBody, style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                            }
                        }
                    }

                    item {
                        Text(
                            text = strings.backendChecklistTitle,
                            style = MaterialTheme.typography.titleMedium,
                            color = LoboroYellow
                        )
                    }
                    items(BackendServicesChecklist.items, key = { it.id }) { svc ->
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = LoboroRoyalElevated,
                            border = BorderStroke(1.dp, LoboroRoyalBorder)
                        ) {
                            Column(
                                modifier = Modifier.padding(14.dp),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(
                                        text = strings.backendServiceNames[svc.id] ?: svc.serviceName,
                                        style = MaterialTheme.typography.titleSmall,
                                        color = LoboroWhite,
                                        modifier = Modifier.weight(1f)
                                    )
                                    Surface(shape = RoundedCornerShape(8.dp), color = LoboroRed) {
                                        Text(
                                            text = strings.integrationStatuses[svc.status] ?: svc.status.name.replace('_', ' '),
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = FontWeight.Bold,
                                            color = LoboroWhite,
                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                        )
                                    }
                                }
                                Text(Translations.fmt(strings.providersLabel, svc.providerOptions), style = MaterialTheme.typography.bodySmall, color = LoboroTextMutedLight)
                                Text(Translations.fmt(strings.secretsLabel, svc.requiredSecrets.joinToString(", ")), style = MaterialTheme.typography.labelSmall, color = LoboroYellow)
                            }
                        }
                    }
                }
            }
        }
    }
}

