package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Backspace
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Security
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
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
fun AdminPinScreen(
    state: LoboroUiState,
    onSubmitPin: (String) -> Unit,
    onCancelBack: () -> Unit
) {
    val strings = LocalAppStrings.current
    var pinInput by remember { mutableStateOf("") }
    val session = state.ownerSession
    val remainingLockoutSec = ((session.lockoutUntilEpochMs - state.currentEpochMs) / 1000L)
        .coerceAtLeast(0L)
    val isLockedOut = remainingLockoutSec > 0L

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LoboroScreenGradient),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(max = 460.dp)
                .verticalScroll(rememberScrollState())
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Surface(
                shape = RoundedCornerShape(24.dp),
                color = LoboroRoyalDeep,
                border = BorderStroke(1.5.dp, LoboroYellow),
                shadowElevation = 6.dp
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(22.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    LoboroLogoEmblem(size = 56.dp)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = null,
                            tint = LoboroYellow,
                            modifier = Modifier.size(18.dp)
                        )
                        Text(
                            text = strings.adminPinHeader,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.ExtraBold,
                            color = LoboroYellow
                        )
                    }
                    Text(
                        text = strings.adminPinPrompt,
                        style = MaterialTheme.typography.bodySmall,
                        color = LoboroWhite.copy(alpha = 0.88f),
                        textAlign = TextAlign.Center
                    )

                    // Masked 4-dot PIN indicator
                    Row(
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .testTag("owner_pin_dots"),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        repeat(4) { idx ->
                            val filled = idx < pinInput.length
                            Box(
                                modifier = Modifier
                                    .size(22.dp)
                                    .background(
                                        color = if (filled) LoboroYellow else LoboroRoyalCard,
                                        shape = CircleShape
                                    )
                            )
                        }
                    }

                    if (isLockedOut) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LoboroRed
                        ) {
                            Text(
                                text = Translations.fmt(strings.pinLockoutFormat, remainingLockoutSec),
                                style = MaterialTheme.typography.labelMedium,
                                color = LoboroWhite,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                                textAlign = TextAlign.Center
                            )
                        }
                    } else if (session.pinStatusMessage != null) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LoboroRedSoft,
                            border = BorderStroke(1.dp, LoboroRed)
                        ) {
                            Text(
                                text = session.pinStatusMessage,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroRedText,
                                modifier = Modifier.padding(10.dp),
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                    // Tactile numeric keypad
                    val rows = listOf(
                        listOf("1", "2", "3"),
                        listOf("4", "5", "6"),
                        listOf("7", "8", "9")
                    )
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        rows.forEach { rowDigits ->
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                rowDigits.forEach { digit ->
                                    PinPadKey(
                                        label = digit,
                                        enabled = !isLockedOut && pinInput.length < 4,
                                        modifier = Modifier.weight(1f)
                                    ) {
                                        if (pinInput.length < 4) pinInput += digit
                                    }
                                }
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            PinPadKey(
                                label = strings.clrKeyLabel,
                                tagKey = "CLR",
                                enabled = !isLockedOut && pinInput.isNotEmpty(),
                                modifier = Modifier.weight(1f)
                            ) {
                                pinInput = ""
                            }
                            PinPadKey(
                                label = "0",
                                enabled = !isLockedOut && pinInput.length < 4,
                                modifier = Modifier.weight(1f)
                            ) {
                                if (pinInput.length < 4) pinInput += "0"
                            }
                            Surface(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(54.dp)
                                    .clip(RoundedCornerShape(14.dp))
                                    .clickable(enabled = !isLockedOut && pinInput.isNotEmpty()) {
                                        if (pinInput.isNotEmpty()) pinInput = pinInput.dropLast(1)
                                    }
                                    .minimumInteractiveComponentSize(),
                                shape = RoundedCornerShape(14.dp),
                                color = LoboroRoyalCard,
                                border = BorderStroke(1.dp, LoboroRoyalBorder)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.Backspace,
                                        contentDescription = strings.clrKeyLabel,
                                        tint = LoboroYellow
                                    )
                                }
                            }
                        }
                    }

                    Button(
                        onClick = {
                            val submitted = pinInput
                            pinInput = ""
                            onSubmitPin(submitted)
                        },
                        enabled = !isLockedOut && pinInput.length == 4,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("verify_owner_pin_button"),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LoboroYellow,
                            contentColor = LoboroRoyalDeep
                        )
                    ) {
                        Icon(Icons.Filled.Security, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(8.dp))
                        Text(strings.verifyPinServerBtn, fontWeight = FontWeight.ExtraBold)
                    }
                }
            }

            Surface(
                shape = RoundedCornerShape(14.dp),
                color = LoboroRoyalElevated,
                border = BorderStroke(1.dp, LoboroRoyalBorder)
            ) {
                Text(
                    text = Translations.fmt(strings.pinSecurityPolicyFormat, session.failedPinAttempts),
                    style = MaterialTheme.typography.bodySmall,
                    color = LoboroTextMutedLight,
                    modifier = Modifier.padding(12.dp),
                    textAlign = TextAlign.Center
                )
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

@Composable
private fun PinPadKey(
    label: String,
    enabled: Boolean,
    modifier: Modifier = Modifier,
    tagKey: String = label,
    onClick: () -> Unit
) {
    Surface(
        modifier = modifier
            .height(54.dp)
            .clip(RoundedCornerShape(14.dp))
            .clickable(enabled = enabled, onClick = onClick)
            .minimumInteractiveComponentSize()
            .testTag("pin_key_$tagKey"),
        shape = RoundedCornerShape(14.dp),
        color = LoboroRoyalCard.copy(alpha = if (enabled) 1f else 0.45f),
        border = BorderStroke(1.dp, if (enabled) LoboroRoyalBorder else LoboroRoyalBorder.copy(alpha = 0.4f))
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = label,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = if (enabled) LoboroYellow else LoboroTextMutedLight
            )
        }
    }
}

