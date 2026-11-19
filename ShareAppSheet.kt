package com.example.ui.components

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Sms
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.theme.LoboroRoyalBorder
import com.example.ui.theme.LoboroRoyalCard
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroRoyalElevated
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShareLoboroBottomSheet(
    userLoboroId: String,
    referralEnabled: Boolean,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    val strings = LocalAppStrings.current
    val referralUrl = if (referralEnabled) {
        "https://loboro.app/join?ref=$userLoboroId"
    } else {
        "https://loboro.app"
    }
    val shareMessage = Translations.fmt(strings.shareMessageTemplate, userLoboroId, referralUrl)

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        containerColor = LoboroRoyalElevated,
        contentColor = LoboroWhite
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(bottom = 28.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                LoboroLogoEmblem(size = 40.dp)
                Column {
                    Text(
                        text = strings.shareAppTitle,
                        style = MaterialTheme.typography.titleLarge,
                        color = LoboroYellow
                    )
                    Text(
                        text = strings.shareAppCta,
                        style = MaterialTheme.typography.bodySmall,
                        color = LoboroTextMutedLight
                    )
                }
            }

            Surface(
                shape = RoundedCornerShape(14.dp),
                color = LoboroRoyalCard,
                border = BorderStroke(1.dp, LoboroYellow)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = if (referralEnabled) "${strings.yourReferralLinkLabel} ($userLoboroId)" else strings.loboroLinkLabel,
                        style = MaterialTheme.typography.labelMedium,
                        color = LoboroYellow
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = referralUrl,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = LoboroWhite
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    onClick = {
                        launchShareIntent(context, shareMessage, strings.shareAppTitle)
                    },
                    modifier = Modifier
                        .weight(1f)
                        .testTag("share_native_button"),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = LoboroYellow,
                        contentColor = LoboroRoyalDeep
                    )
                ) {
                    Icon(Icons.Filled.Share, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text(strings.shareMenuButton, fontWeight = FontWeight.Bold, maxLines = 1)
                }

                OutlinedButton(
                    onClick = {
                        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                        clipboard.setPrimaryClip(ClipData.newPlainText(strings.loboroLinkLabel, referralUrl))
                        Toast.makeText(context, strings.referralCopiedToast, Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .weight(1f)
                        .testTag("copy_referral_link_button"),
                    border = BorderStroke(1.5.dp, LoboroYellow),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = LoboroRoyalCard,
                        contentColor = LoboroYellow
                    )
                ) {
                    Icon(Icons.Filled.ContentCopy, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(Modifier.width(6.dp))
                    Text(strings.copyLinkButton, fontWeight = FontWeight.Bold, maxLines = 1)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ShareTargetChip(
                    label = "WhatsApp",
                    modifier = Modifier.weight(1f),
                    onClick = {
                        launchTargetedAppShare(
                            context,
                            "com.whatsapp",
                            shareMessage,
                            strings.openingShareMenuToast,
                            strings.shareAppTitle
                        )
                    }
                )
                ShareTargetChip(
                    label = "Telegram",
                    modifier = Modifier.weight(1f),
                    onClick = {
                        launchTargetedAppShare(
                            context,
                            "org.telegram.messenger",
                            shareMessage,
                            strings.openingShareMenuToast,
                            strings.shareAppTitle
                        )
                    }
                )
                ShareTargetChip(
                    label = "SMS",
                    modifier = Modifier.weight(1f),
                    onClick = {
                        val smsIntent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:")).apply {
                            putExtra("sms_body", shareMessage)
                        }
                        runCatching { context.startActivity(smsIntent) }
                            .onFailure { launchShareIntent(context, shareMessage, strings.shareAppTitle) }
                    }
                )
            }
        }
    }
}

@Composable
private fun ShareTargetChip(
    label: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, LoboroRoyalBorder),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = LoboroRoyalCard,
            contentColor = LoboroWhite
        )
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            maxLines = 1
        )
    }
}

fun launchShareIntent(context: Context, text: String, chooserTitle: String = "LOBORO") {
    val sendIntent = Intent(Intent.ACTION_SEND).apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, text)
        type = "text/plain"
    }
    context.startActivity(Intent.createChooser(sendIntent, chooserTitle))
}

private fun launchTargetedAppShare(
    context: Context,
    packageName: String,
    text: String,
    fallbackToast: String,
    chooserTitle: String
) {
    val targeted = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TEXT, text)
        setPackage(packageName)
    }
    runCatching { context.startActivity(targeted) }
        .onFailure {
            Toast.makeText(context, fallbackToast, Toast.LENGTH_SHORT).show()
            launchShareIntent(context, text, chooserTitle)
        }
}
