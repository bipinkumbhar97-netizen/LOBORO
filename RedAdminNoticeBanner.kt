package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Campaign
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.domain.model.AdminNotice
import com.example.domain.model.SupportedLanguage
import com.example.i18n.LocalAppStrings
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow

/**
 * Mandatory Red Admin Notice Banner specification:
 * - Bright Red background (#FF0000)
 * - Small yellow uppercase heading: LOBORO ADMIN NOTICE
 * - White announcement message
 * - Yellow action link
 */
@Composable
fun RedAdminNoticeBanner(
    notice: AdminNotice,
    activeLanguage: SupportedLanguage = SupportedLanguage.ENGLISH,
    onActionClick: (String) -> Unit,
    onDismiss: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val strings = LocalAppStrings.current
    val localizedMsg = notice.localizedMessages[activeLanguage] ?: notice.message
    val localizedAction = if (notice.actionLabel.equals("OPEN SAFETY", ignoreCase = true) ||
        notice.actionLabel.equals("VIEW WALLET", ignoreCase = true) ||
        notice.actionLabel.equals("VIEW SAFETY GUIDE", ignoreCase = true) ||
        notice.actionLabel.equals("OPEN DAILY JOBS", ignoreCase = true) ||
        notice.actionLabel.equals("VIEW DETAILS", ignoreCase = true)
    ) {
        when (notice.targetRoute) {
            "safety" -> strings.navHelpSafety
            "wallet" -> strings.navWallet
            else -> strings.navSearchJobs
        }
    } else {
        notice.actionLabel
    }
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .testTag("red_admin_notice_banner"),
        shape = RoundedCornerShape(16.dp),
        color = LoboroRed,
        border = BorderStroke(1.dp, LoboroYellow.copy(alpha = 0.6f)),
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Campaign,
                contentDescription = strings.adminNoticeHeading,
                tint = LoboroYellow,
                modifier = Modifier
                    .padding(top = 2.dp)
                    .size(22.dp)
            )
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = strings.adminNoticeHeading.uppercase(),
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.ExtraBold,
                        letterSpacing = 1.0.sp
                    ),
                    color = LoboroYellow
                )
                Text(
                    text = localizedMsg,
                    style = MaterialTheme.typography.bodyMedium,
                    color = LoboroWhite
                )
                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .clickable { onActionClick(notice.targetRoute) }
                        .padding(vertical = 4.dp, horizontal = 2.dp)
                        .testTag("admin_notice_action_link"),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = localizedAction,
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.ExtraBold
                        ),
                        color = LoboroYellow
                    )
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        tint = LoboroYellow,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
            IconButton(
                onClick = { onDismiss(notice.id) },
                modifier = Modifier.size(32.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = strings.closeLabel,
                    tint = LoboroWhite.copy(alpha = 0.85f),
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}
