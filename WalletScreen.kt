package com.example.ui.screens

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
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AddCard
import androidx.compose.material.icons.filled.FaceRetouchingNatural
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import com.example.domain.model.TransactionStatus
import com.example.domain.model.WalletTransaction
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.components.LoboroCoin
import kotlin.math.abs
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
fun WalletScreen(
    state: LoboroUiState,
    onToggleFreezeWithdrawals: () -> Unit
) {
    val strings = LocalAppStrings.current
    var showPaymentIntegrationDialog by remember { mutableStateOf<Int?>(null) }
    var showWithdrawIntegrationDialog by remember { mutableStateOf(false) }
    var showBankFaceSecurityDialog by remember { mutableStateOf(false) }
    var selectedReceiptTx by remember { mutableStateOf<WalletTransaction?>(null) }

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
            // Hero Golden Coin Balance Card
            item {
                Surface(
                    shape = RoundedCornerShape(24.dp),
                    color = LoboroRoyalDeep,
                    border = BorderStroke(1.5.dp, LoboroYellow),
                    shadowElevation = 6.dp
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(14.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(14.dp)
                        ) {
                            LoboroCoin(
                                size = 68.dp,
                                reducedMotionOverride = state.reducedMotion || state.lowDataMode
                            )
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = strings.walletBalanceTitle,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = LoboroYellow
                                )
                                Text(
                                    text = Translations.fmt(strings.coinsCountFormat, state.wallet.availableCoins),
                                    style = MaterialTheme.typography.displaySmall,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = Translations.fmt(
                                        strings.withdrawableValueFormat,
                                        state.wallet.withdrawableBalanceInr,
                                        state.feeConfig.coinPriceInr
                                    ),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroYellow.copy(alpha = 0.92f)
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            val canBuyCoins = state.masterControls.coinPurchases &&
                                state.masterControls.paymentGatewayEnabled &&
                                !state.masterControls.appMaintenanceMode
                            val canWithdraw = state.masterControls.withdrawals &&
                                !state.wallet.withdrawalsFrozenByUser

                            Button(
                                onClick = { showPaymentIntegrationDialog = 10 },
                                enabled = canBuyCoins,
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("wallet_buy_coins_button"),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroYellow,
                                    contentColor = LoboroRoyalDeep
                                )
                            ) {
                                Icon(Icons.Filled.AddCard, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.buyCoins, fontWeight = FontWeight.Bold)
                            }

                            OutlinedButton(
                                onClick = { showWithdrawIntegrationDialog = true },
                                enabled = canWithdraw,
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("wallet_withdraw_button"),
                                border = BorderStroke(1.5.dp, LoboroYellow),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = LoboroYellow)
                            ) {
                                Icon(Icons.Filled.AccountBalance, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.withdrawCoins, fontWeight = FontWeight.Bold)
                            }
                        }

                        if (!state.masterControls.withdrawals || !state.masterControls.coinPurchases || !state.masterControls.paymentGatewayEnabled) {
                            Text(
                                text = strings.walletActionsPausedNote,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroYellow
                            )
                        }
                    }
                }
            }

            // MANDATORY EQUAL WITHDRAWAL RULE CARD
            item {
                Surface(
                    shape = RoundedCornerShape(18.dp),
                    color = LoboroRoyalElevated,
                    border = BorderStroke(1.5.dp, LoboroYellow)
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(
                            imageVector = Icons.Filled.VerifiedUser,
                            contentDescription = null,
                            tint = LoboroYellow,
                            modifier = Modifier.size(24.dp)
                        )
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                            Text(
                                text = strings.withdrawableRuleTitle,
                                style = MaterialTheme.typography.titleSmall,
                                color = LoboroYellow
                            )
                            Text(
                                text = strings.withdrawableRuleBody,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                        }
                    }
                }
            }

            // Coin Purchase Packages
            item {
                Text(
                    text = strings.coinPackagesTitle,
                    style = MaterialTheme.typography.titleMedium,
                    color = LoboroYellow
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    listOf(5, 10, 30, 50).forEach { packCoins ->
                        val priceInr = packCoins * state.feeConfig.coinPriceInr
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(16.dp))
                                .clickable(enabled = state.masterControls.coinPurchases) {
                                    showPaymentIntegrationDialog = packCoins
                                },
                            shape = RoundedCornerShape(16.dp),
                            color = LoboroRoyalCard,
                            border = BorderStroke(1.dp, LoboroRoyalBorder)
                        ) {
                            Column(
                                modifier = Modifier.padding(vertical = 12.dp, horizontal = 6.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                LoboroCoin(
                                    size = 28.dp,
                                    reducedMotionOverride = state.reducedMotion || state.lowDataMode
                                )
                                Text(
                                    text = Translations.fmt(strings.coinsCountFormat, packCoins),
                                    style = MaterialTheme.typography.labelLarge,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = "₹$priceInr",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = LoboroYellow
                                )
                            }
                        }
                    }
                }
            }

            // Bank/UPI + Face Liveness Verification Lock + Freeze Withdrawals
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
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Icon(Icons.Filled.FaceRetouchingNatural, contentDescription = null, tint = LoboroYellow)
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = strings.bankSecurityTitle,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = Translations.fmt(
                                        strings.payoutDestinationLabel,
                                        state.wallet.payoutDestinationMasked
                                    ),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroTextMutedLight
                                )
                            }
                        }

                        Text(
                            text = strings.bankSecurityStepsNote,
                            style = MaterialTheme.typography.bodySmall,
                            color = LoboroTextMutedLight
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            OutlinedButton(
                                onClick = { showBankFaceSecurityDialog = true },
                                modifier = Modifier.weight(1f),
                                border = BorderStroke(1.dp, LoboroYellow),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = LoboroYellow)
                            ) {
                                Icon(Icons.Filled.Lock, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.changeBankUpiButton)
                            }

                            Button(
                                onClick = onToggleFreezeWithdrawals,
                                modifier = Modifier
                                    .weight(1f)
                                    .testTag("wallet_freeze_button"),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = if (state.wallet.withdrawalsFrozenByUser) LoboroRoyalCard else LoboroRed,
                                    contentColor = if (state.wallet.withdrawalsFrozenByUser) LoboroYellow else LoboroWhite
                                )
                            ) {
                                Icon(Icons.Filled.Shield, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(
                                    text = if (state.wallet.withdrawalsFrozenByUser) strings.unfreezePayoutsButton else strings.lostPhoneFreezeButton,
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        if (state.wallet.withdrawalsFrozenByUser) {
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = LoboroRedSoft,
                                border = BorderStroke(1.dp, LoboroRed)
                            ) {
                                Text(
                                    text = strings.payoutFreezeActiveNote,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = LoboroWhite,
                                    modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                }
            }

            // Complete Auditable Wallet Ledger
            item {
                Text(
                    text = "${strings.transactionHistory} ${strings.demoLedgerSuffix}",
                    style = MaterialTheme.typography.titleMedium,
                    color = LoboroYellow
                )
            }

            items(state.wallet.transactions, key = { it.id }) { tx ->
                val txTitle = tx.localizedTitles[state.activeLanguage]
                    ?: strings.transactionTypes[tx.type]
                    ?: tx.title
                val txStatusLabel = strings.transactionStatuses[tx.status] ?: tx.status.name
                val formattedCoins = (if (tx.coins >= 0) "+" else "-") +
                    Translations.fmt(strings.coinsCountFormat, abs(tx.coins))

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .clickable { selectedReceiptTx = tx },
                    shape = RoundedCornerShape(16.dp),
                    color = LoboroRoyalElevated,
                    border = BorderStroke(1.dp, LoboroRoyalBorder)
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        LoboroCoin(
                            size = 34.dp,
                            reducedMotionOverride = state.reducedMotion || state.lowDataMode
                        )
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = txTitle,
                                style = MaterialTheme.typography.titleSmall,
                                color = LoboroWhite
                            )
                            Text(
                                text = "${tx.timestampLabel} · ${tx.referenceId}",
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroTextMutedLight
                            )
                        }
                        Column(horizontalAlignment = Alignment.End) {
                            Text(
                                text = formattedCoins,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.ExtraBold,
                                color = if (tx.coins >= 0) LoboroYellow else LoboroRedText
                            )
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = when (tx.status) {
                                    TransactionStatus.SUCCESSFUL -> LoboroYellow
                                    TransactionStatus.PENDING -> LoboroRoyalMutedSurface
                                    TransactionStatus.FAILED -> LoboroRed
                                    TransactionStatus.REFUNDED -> LoboroYellow
                                }
                            ) {
                                Text(
                                    text = txStatusLabel,
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = when (tx.status) {
                                        TransactionStatus.SUCCESSFUL, TransactionStatus.REFUNDED -> LoboroRoyalDeep
                                        TransactionStatus.PENDING, TransactionStatus.FAILED -> LoboroWhite
                                    },
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    // Honest Payment Gateway Integration Notice (NEVER simulates real payments!)
    showPaymentIntegrationDialog?.let { coins ->
        val amountInr = coins * state.feeConfig.coinPriceInr
        AlertDialog(
            onDismissRequest = { showPaymentIntegrationDialog = null },
            containerColor = LoboroRoyalElevated,
            title = { Text(Translations.fmt(strings.buyCoinsDialogTitleFormat, coins, amountInr), color = LoboroYellow) },
            text = {
                Text(
                    text = strings.paymentNotConnectedBody,
                    color = LoboroWhite
                )
            },
            confirmButton = {
                TextButton(onClick = { showPaymentIntegrationDialog = null }) {
                    Text(strings.understoodLabel, color = LoboroYellow, fontWeight = FontWeight.Bold)
                }
            }
        )
    }

    if (showWithdrawIntegrationDialog) {
        AlertDialog(
            onDismissRequest = { showWithdrawIntegrationDialog = false },
            containerColor = LoboroRoyalElevated,
            title = { Text(Translations.fmt(strings.withdrawDialogTitleFormat, state.wallet.withdrawableBalanceInr), color = LoboroYellow) },
            text = {
                Text(
                    text = Translations.fmt(
                        strings.withdrawDialogBodyFormat,
                        state.wallet.availableCoins,
                        state.wallet.payoutDestinationMasked
                    ),
                    color = LoboroWhite
                )
            },
            confirmButton = {
                TextButton(onClick = { showWithdrawIntegrationDialog = false }) {
                    Text(strings.closeLabel, color = LoboroYellow, fontWeight = FontWeight.Bold)
                }
            }
        )
    }

    if (showBankFaceSecurityDialog) {
        AlertDialog(
            onDismissRequest = { showBankFaceSecurityDialog = false },
            containerColor = LoboroRoyalElevated,
            title = { Text(strings.bankChangeDialogTitle, color = LoboroYellow) },
            text = {
                Text(
                    text = strings.bankChangeDialogBody,
                    color = LoboroWhite
                )
            },
            confirmButton = {
                TextButton(onClick = { showBankFaceSecurityDialog = false }) {
                    Text(strings.okLabel, color = LoboroYellow, fontWeight = FontWeight.Bold)
                }
            }
        )
    }

    selectedReceiptTx?.let { tx ->
        val txTypeLabel = strings.transactionTypes[tx.type] ?: tx.type.name
        val txStatusLabel = strings.transactionStatuses[tx.status] ?: tx.status.name
        AlertDialog(
            onDismissRequest = { selectedReceiptTx = null },
            containerColor = LoboroRoyalElevated,
            icon = { Icon(Icons.Filled.ReceiptLong, contentDescription = null, tint = LoboroYellow) },
            title = { Text(strings.receiptDialogTitle, color = LoboroYellow) },
            text = {
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(Translations.fmt(strings.receiptIdLabel, tx.id), fontWeight = FontWeight.Bold, color = LoboroWhite)
                    Text(Translations.fmt(strings.receiptRefLabel, tx.referenceId), color = LoboroWhite)
                    Text(Translations.fmt(strings.receiptTypeLabel, txTypeLabel), color = LoboroWhite)
                    Text(Translations.fmt(strings.receiptCoinsLabel, tx.coins, tx.inrValue), color = LoboroWhite)
                    Text(Translations.fmt(strings.receiptStatusLabel, txStatusLabel), color = LoboroWhite)
                    Text(Translations.fmt(strings.receiptTimeLabel, tx.timestampLabel), color = LoboroWhite)
                    Text(strings.receiptWithdrawableYes, color = LoboroYellow)
                }
            },
            confirmButton = {
                TextButton(onClick = { selectedReceiptTx = null }) {
                    Text(strings.closeLabel, color = LoboroYellow, fontWeight = FontWeight.Bold)
                }
            }
        )
    }
}
