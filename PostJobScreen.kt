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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.data.LoboroDemoRepository
import com.example.domain.model.JobCategoryId
import com.example.domain.model.JobType
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.components.LoboroCoin
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedSoft
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
fun PostJobScreen(
    state: LoboroUiState,
    calculateFeeCoins: (JobType, JobCategoryId) -> Int,
    onPostJobSubmit: (
        title: String,
        description: String,
        jobType: JobType,
        category: JobCategoryId,
        wageOrSalary: Int,
        stateName: String,
        cityName: String,
        workersNeeded: Int,
        workHours: String,
        foodProvided: Boolean,
        accommodationProvided: Boolean,
        overtimeDetails: String,
        weeklyHoliday: String,
        leavePolicy: String,
        joiningDate: String
    ) -> Unit
) {
    val strings = LocalAppStrings.current
    var selectedType by remember { mutableStateOf(JobType.DAILY) }
    var selectedCategory by remember { mutableStateOf(JobCategoryId.MASON) }
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var wageText by remember { mutableStateOf("900") }
    var stateName by remember { mutableStateOf("Telangana") }
    var cityName by remember { mutableStateOf("Hyderabad") }
    var workersText by remember { mutableStateOf("3") }
    var workHours by remember { mutableStateOf("8:30 AM – 5:30 PM") }
    var foodProvided by remember { mutableStateOf(true) }
    var accommodationProvided by remember { mutableStateOf(true) }
    var overtimeDetails by remember { mutableStateOf("₹120/hr extra") }
    var weeklyHoliday by remember { mutableStateOf("Sunday Off") }
    var leavePolicy by remember { mutableStateOf("2 Paid Leaves / Month") }
    var joiningDate by remember { mutableStateOf("Immediate") }

    val requiredCoins = calculateFeeCoins(selectedType, selectedCategory)
    val feeInr = requiredCoins * state.feeConfig.coinPriceInr
    val postingDisabled = !state.masterControls.jobPosting

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
                    text = strings.navPostJob,
                    style = MaterialTheme.typography.headlineSmall,
                    color = LoboroYellow
                )
            }

            if (postingDisabled) {
                item {
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = LoboroRedSoft,
                        border = BorderStroke(1.dp, LoboroRed)
                    ) {
                        Text(
                            text = Translations.fmt(strings.postingPausedFormat, state.masterControls.activeScopeLabel),
                            style = MaterialTheme.typography.bodyMedium,
                            color = LoboroWhite,
                            modifier = Modifier.padding(14.dp)
                        )
                    }
                }
            }

            // Job Type Separator
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    JobType.entries.forEach { type ->
                        val active = selectedType == type
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(14.dp))
                                .clickable {
                                    selectedType = type
                                    wageText = if (type == JobType.DAILY) "900" else "22000"
                                },
                            shape = RoundedCornerShape(14.dp),
                            color = if (active) LoboroYellow else LoboroRoyalElevated,
                            border = BorderStroke(1.5.dp, if (active) LoboroYellow else LoboroRoyalBorder)
                        ) {
                            Text(
                                text = if (type == JobType.DAILY) strings.dailyJobsTitle else strings.monthlyJobsTitle,
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold,
                                color = if (active) LoboroRoyalDeep else LoboroWhite,
                                modifier = Modifier.padding(14.dp)
                            )
                        }
                    }
                }
            }

            // Category picker
            item {
                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(
                        text = strings.selectCategoryLabel,
                        style = MaterialTheme.typography.titleSmall,
                        color = LoboroYellow
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        state.categoryConfigs.filter { it.active }.forEach { cfg ->
                            val label = strings.categories[cfg.id] ?: cfg.id.defaultName
                            FilterChip(
                                selected = selectedCategory == cfg.id,
                                onClick = { selectedCategory = cfg.id },
                                label = { Text(label) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = LoboroYellow,
                                    selectedLabelColor = LoboroRoyalDeep,
                                    containerColor = LoboroRoyalElevated,
                                    labelColor = LoboroWhite
                                )
                            )
                        }
                    }
                }
            }

            // Form fields
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
                        OutlinedTextField(
                            value = title,
                            onValueChange = { title = it },
                            label = { Text(strings.jobTitleLabel) },
                            placeholder = { Text(strings.jobTitlePlaceholder) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("post_job_title_input"),
                            singleLine = true
                        )
                        OutlinedTextField(
                            value = description,
                            onValueChange = { description = it },
                            label = { Text(strings.jobDescLabel) },
                            placeholder = { Text(strings.jobDescPlaceholder) },
                            modifier = Modifier.fillMaxWidth(),
                            minLines = 2
                        )
                        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                            OutlinedTextField(
                                value = wageText,
                                onValueChange = { wageText = it.filter { ch -> ch.isDigit() } },
                                label = {
                                    Text(if (selectedType == JobType.DAILY) strings.dailyWageInrLabel else strings.monthlySalaryInrLabel)
                                },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                modifier = Modifier.weight(1f),
                                singleLine = true
                            )
                            OutlinedTextField(
                                value = workersText,
                                onValueChange = { workersText = it.filter { ch -> ch.isDigit() } },
                                label = { Text(strings.vacanciesLabel) },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                modifier = Modifier.weight(0.7f),
                                singleLine = true
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                            OutlinedTextField(
                                value = cityName,
                                onValueChange = { cityName = it },
                                label = { Text(strings.cityTownLabel) },
                                modifier = Modifier.weight(1f),
                                singleLine = true
                            )
                            OutlinedTextField(
                                value = strings.indianStates[stateName] ?: stateName,
                                onValueChange = { stateName = it },
                                label = { Text(strings.stateLabel) },
                                modifier = Modifier.weight(1f),
                                singleLine = true
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .horizontalScroll(rememberScrollState()),
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            LoboroDemoRepository.indianStates.filter { it != "All States" }.forEach { st ->
                                FilterChip(
                                    selected = stateName == st,
                                    onClick = { stateName = st },
                                    label = { Text(strings.indianStates[st] ?: st) },
                                    colors = FilterChipDefaults.filterChipColors(
                                        selectedContainerColor = LoboroYellow,
                                        selectedLabelColor = LoboroRoyalDeep,
                                        containerColor = LoboroRoyalCard,
                                        labelColor = LoboroWhite
                                    )
                                )
                            }
                        }
                        OutlinedTextField(
                            value = workHours,
                            onValueChange = { workHours = it },
                            label = { Text(strings.workHoursLabel) },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )
                        OutlinedTextField(
                            value = overtimeDetails,
                            onValueChange = { overtimeDetails = it },
                            label = { Text(strings.overtimeLabel) },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )

                        if (selectedType == JobType.MONTHLY) {
                            OutlinedTextField(
                                value = weeklyHoliday,
                                onValueChange = { weeklyHoliday = it },
                                label = { Text(strings.weeklyHolidayLabel) },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = true
                            )
                            OutlinedTextField(
                                value = leavePolicy,
                                onValueChange = { leavePolicy = it },
                                label = { Text(strings.leavePolicyLabel) },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = true
                            )
                            OutlinedTextField(
                                value = joiningDate,
                                onValueChange = { joiningDate = it },
                                label = { Text(strings.joiningDateLabel) },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = true
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(strings.foodAvailable, color = LoboroWhite)
                            Switch(
                                checked = foodProvided,
                                onCheckedChange = { foodProvided = it },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = LoboroRoyalDeep,
                                    checkedTrackColor = LoboroYellow
                                )
                            )
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(strings.accommodationAvailable, color = LoboroWhite)
                            Switch(
                                checked = accommodationProvided,
                                onCheckedChange = { accommodationProvided = it },
                                colors = SwitchDefaults.colors(
                                    checkedThumbColor = LoboroRoyalDeep,
                                    checkedTrackColor = LoboroYellow
                                )
                            )
                        }
                    }
                }
            }

            // Transparent Owner-Configurable Job Fee Card (Never secret!)
            item {
                Surface(
                    shape = RoundedCornerShape(18.dp),
                    color = LoboroRoyalDeep,
                    border = BorderStroke(1.5.dp, LoboroYellow)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        LoboroCoin(
                            size = 44.dp,
                            reducedMotionOverride = state.reducedMotion || state.lowDataMode
                        )
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = Translations.fmt(strings.transparentJobFeeTitle, requiredCoins, feeInr),
                                style = MaterialTheme.typography.titleSmall,
                                color = LoboroYellow
                            )
                            val cpLabel = strings.feeChargePoints[state.feeConfig.chargePoint]
                                ?: state.feeConfig.chargePoint.name
                            Text(
                                text = Translations.fmt(
                                    strings.configuredByOwnerSub,
                                    cpLabel,
                                    state.wallet.availableCoins
                                ),
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroTextMutedLight
                            )
                        }
                    }
                }
            }

            item {
                Button(
                    onClick = {
                        onPostJobSubmit(
                            title,
                            description,
                            selectedType,
                            selectedCategory,
                            wageText.toIntOrNull() ?: 800,
                            stateName,
                            cityName,
                            workersText.toIntOrNull() ?: 1,
                            workHours,
                            foodProvided,
                            accommodationProvided,
                            overtimeDetails,
                            weeklyHoliday,
                            leavePolicy,
                            joiningDate
                        )
                    },
                    enabled = !postingDisabled,
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("submit_post_job_button"),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = LoboroYellow,
                        contentColor = LoboroRoyalDeep
                    )
                ) {
                    Text(
                        text = Translations.fmt(strings.confirmAndPostJobButton, requiredCoins),
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(vertical = 6.dp)
                    )
                }
            }
        }
    }
}
