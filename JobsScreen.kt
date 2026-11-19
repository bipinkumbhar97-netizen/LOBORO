package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.Hotel
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Today
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.LoboroDemoRepository
import com.example.domain.model.JobCategoryId
import com.example.domain.model.JobListing
import com.example.domain.model.JobType
import com.example.domain.model.SupportedLanguage
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.components.VoiceSearchBar
import com.example.ui.components.categoryIcon
import com.example.ui.components.launchShareIntent
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedText
import com.example.ui.theme.LoboroRoyalBorder
import com.example.ui.theme.LoboroRoyalCard
import com.example.ui.theme.LoboroRoyalDark
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroRoyalElevated
import com.example.ui.theme.LoboroRoyalMutedSurface
import com.example.ui.theme.LoboroScreenGradient
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow
import com.example.ui.viewmodel.JobSearchFilters
import com.example.ui.viewmodel.LoboroUiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobsScreen(
    state: LoboroUiState,
    onSelectJobType: (JobType) -> Unit,
    onSearchQueryChange: (String) -> Unit,
    onUpdateFilters: ((JobSearchFilters) -> JobSearchFilters) -> Unit,
    onClearFilters: () -> Unit,
    onToggleFavorite: (String) -> Unit,
    onApplyJob: (JobListing) -> Unit,
    onOpenChat: () -> Unit,
    onReportSuspiciousJob: (JobListing) -> Unit
) {
    val strings = LocalAppStrings.current
    val context = LocalContext.current
    var showFilterDrawer by remember { mutableStateOf(false) }
    var selectedJobForDetail by remember { mutableStateOf<JobListing?>(null) }
    var showOriginalLanguageText by remember { mutableStateOf(false) }

    val filteredJobs = remember(
        state.jobs,
        state.activeJobTypeTab,
        state.filters,
        state.masterControls,
        state.activeLanguage,
        strings
    ) {
        val mc = state.masterControls
        if (mc.appMaintenanceMode || !mc.jobSearching) return@remember emptyList()
        state.jobs.filter { job ->
            if (job.isExpired) return@filter false
            if (job.jobType == JobType.DAILY && !mc.dailyJobs) return@filter false
            if (job.jobType == JobType.MONTHLY && !mc.monthlyJobs) return@filter false
            if (job.jobType != state.activeJobTypeTab) return@filter false
            val f = state.filters
            if (f.selectedCategory != null && job.category != f.selectedCategory) return@filter false
            if (f.state != "All States" && !job.state.equals(f.state, ignoreCase = true)) return@filter false
            if (f.foodOnly && !job.foodProvided) return@filter false
            if (f.accommodationOnly && !job.accommodationProvided) return@filter false
            if (!f.willingToRelocate && !job.state.equals(state.activeProfile.homeState, ignoreCase = true)) {
                return@filter false
            }
            if (job.distanceKm > f.maxDistanceKm && f.state == "All States") return@filter false
            if (f.query.isNotBlank()) {
                val tokens = f.query.trim().lowercase()
                    .split(Regex("\\s+"))
                    .filter { it.isNotBlank() }
                val searchableText = buildString {
                    append(job.title).append(' ')
                    append(job.description).append(' ')
                    job.localizedTitles.values.forEach { append(it).append(' ') }
                    job.localizedDescriptions.values.forEach { append(it).append(' ') }
                    append(job.city).append(' ')
                    append(job.district).append(' ')
                    append(job.state).append(' ')
                    append(strings.indianStates[job.state] ?: "").append(' ')
                    append(job.category.defaultName).append(' ')
                    append(strings.categories[job.category] ?: "").append(' ')
                    append(if (job.jobType == JobType.DAILY) strings.dailyJobsTitle else strings.monthlyJobsTitle)
                }.lowercase()
                if (!tokens.all { token -> searchableText.contains(token) }) return@filter false
            }
            true
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
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Strict Separation of Daily Jobs vs Monthly Salary Jobs
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    val dailySelected = state.activeJobTypeTab == JobType.DAILY
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(16.dp))
                            .clickable { onSelectJobType(JobType.DAILY) }
                            .testTag("tab_daily_jobs"),
                        shape = RoundedCornerShape(16.dp),
                        color = if (dailySelected) LoboroYellow else LoboroRoyalElevated,
                        border = BorderStroke(1.5.dp, if (dailySelected) LoboroYellow else LoboroRoyalBorder)
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Today,
                                contentDescription = null,
                                tint = if (dailySelected) LoboroRoyalDeep else LoboroYellow,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = strings.dailyJobsTitle,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = if (dailySelected) LoboroRoyalDeep else LoboroWhite
                            )
                        }
                    }

                    val monthlySelected = state.activeJobTypeTab == JobType.MONTHLY
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(16.dp))
                            .clickable { onSelectJobType(JobType.MONTHLY) }
                            .testTag("tab_monthly_jobs"),
                        shape = RoundedCornerShape(16.dp),
                        color = if (monthlySelected) LoboroYellow else LoboroRoyalElevated,
                        border = BorderStroke(1.5.dp, if (monthlySelected) LoboroYellow else LoboroRoyalBorder)
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.CalendarMonth,
                                contentDescription = null,
                                tint = if (monthlySelected) LoboroRoyalDeep else LoboroYellow,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = strings.monthlyJobsTitle,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = if (monthlySelected) LoboroRoyalDeep else LoboroWhite
                            )
                        }
                    }
                }
            }

            // Voice Search + Filter Toggle Bar
            item {
                VoiceSearchBar(
                    query = state.filters.query,
                    activeLanguage = state.activeLanguage,
                    onQueryChange = onSearchQueryChange,
                    onSearchSubmit = {},
                    showQuickSpokenExamples = false
                )
            }

            // Out-of-State & Global Filter Toggle + State Chips
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = { showFilterDrawer = !showFilterDrawer },
                        border = BorderStroke(1.5.dp, LoboroYellow),
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = if (showFilterDrawer) LoboroYellow else LoboroRoyalElevated,
                            contentColor = if (showFilterDrawer) LoboroRoyalDeep else LoboroYellow
                        ),
                        modifier = Modifier.testTag("toggle_location_filters_button")
                    ) {
                        Icon(Icons.Filled.FilterList, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(6.dp))
                        val filterStateLabel = strings.indianStates[state.filters.state] ?: state.filters.state
                        Text("${strings.outOfStateTitle} ($filterStateLabel)", fontWeight = FontWeight.Bold)
                    }

                    if (state.filters.selectedCategory != null || state.filters.state != "All States" || state.filters.foodOnly || state.filters.accommodationOnly) {
                        TextButton(onClick = onClearFilters) {
                            Text(strings.resetLabel, color = LoboroRedText, fontWeight = FontWeight.Bold)
                        }
                    }
                }

                AnimatedVisibility(visible = showFilterDrawer) {
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        shape = RoundedCornerShape(18.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(14.dp),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Text(
                                text = "${strings.filterCountry}: ${state.filters.country} · ${strings.filterState}",
                                style = MaterialTheme.typography.labelLarge,
                                color = LoboroYellow
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                LoboroDemoRepository.indianStates.forEach { stateName ->
                                    val selected = state.filters.state == stateName
                                    val localizedState = strings.indianStates[stateName] ?: stateName
                                    FilterChip(
                                        selected = selected,
                                        onClick = { onUpdateFilters { it.copy(state = stateName) } },
                                        label = { Text(localizedState) },
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
                                text = "${strings.filterDistance}: ${Translations.fmt(strings.upToKmFormat, state.filters.maxDistanceKm)}",
                                style = MaterialTheme.typography.labelMedium,
                                color = LoboroYellow
                            )
                            Slider(
                                value = state.filters.maxDistanceKm.toFloat(),
                                onValueChange = { km -> onUpdateFilters { it.copy(maxDistanceKm = km.toInt()) } },
                                valueRange = 10f..1500f,
                                colors = SliderDefaults.colors(
                                    thumbColor = LoboroYellow,
                                    activeTrackColor = LoboroYellow,
                                    inactiveTrackColor = LoboroRoyalDark
                                )
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = strings.willingToRelocate,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = LoboroWhite
                                )
                                Switch(
                                    checked = state.filters.willingToRelocate,
                                    onCheckedChange = { v -> onUpdateFilters { it.copy(willingToRelocate = v) } },
                                    colors = SwitchDefaults.colors(
                                        checkedThumbColor = LoboroRoyalDeep,
                                        checkedTrackColor = LoboroYellow
                                    )
                                )
                            }

                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                FilterChip(
                                    selected = state.filters.foodOnly,
                                    onClick = { onUpdateFilters { it.copy(foodOnly = !it.foodOnly) } },
                                    label = { Text(strings.filterFoodIncluded) },
                                    colors = FilterChipDefaults.filterChipColors(
                                        selectedContainerColor = LoboroYellow,
                                        selectedLabelColor = LoboroRoyalDeep,
                                        containerColor = LoboroRoyalCard,
                                        labelColor = LoboroWhite
                                    )
                                )
                                FilterChip(
                                    selected = state.filters.accommodationOnly,
                                    onClick = { onUpdateFilters { it.copy(accommodationOnly = !it.accommodationOnly) } },
                                    label = { Text(strings.filterAccommodation) },
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

            // Category quick strip
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    FilterChip(
                        selected = state.filters.selectedCategory == null,
                        onClick = { onUpdateFilters { it.copy(selectedCategory = null) } },
                        label = { Text(strings.allCategoriesLabel) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = LoboroYellow,
                            selectedLabelColor = LoboroRoyalDeep,
                            containerColor = LoboroRoyalElevated,
                            labelColor = LoboroWhite
                        )
                    )
                    JobCategoryId.entries.forEach { cat ->
                        val catLabel = strings.categories[cat] ?: cat.defaultName
                        FilterChip(
                            selected = state.filters.selectedCategory == cat,
                            onClick = { onUpdateFilters { it.copy(selectedCategory = cat) } },
                            label = { Text(catLabel) },
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

            if (filteredJobs.isEmpty()) {
                item {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        color = LoboroRoyalElevated,
                        border = BorderStroke(1.dp, LoboroRoyalBorder)
                    ) {
                        Column(
                            modifier = Modifier.padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = strings.noMatchingJobsTitle,
                                style = MaterialTheme.typography.titleMedium,
                                color = LoboroYellow
                            )
                            Text(
                                text = strings.noMatchingJobsSubtitle,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroTextMutedLight
                            )
                            Button(
                                onClick = onClearFilters,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroYellow,
                                    contentColor = LoboroRoyalDeep
                                )
                            ) {
                                Text(strings.showAllJobsButton, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            } else {
                items(filteredJobs, key = { it.id }) { job ->
                    val displayTitle = job.localizedTitles[state.activeLanguage] ?: job.title
                    val displayDesc = job.localizedDescriptions[state.activeLanguage] ?: job.description
                    val isTranslatedPreview = job.originalLanguage != state.activeLanguage &&
                        job.localizedTitles.containsKey(state.activeLanguage)
                    val isSaved = job.id in state.favoriteJobIds

                    JobListingCard(
                        job = job,
                        displayTitle = displayTitle,
                        displayDesc = displayDesc,
                        isTranslatedPreview = isTranslatedPreview,
                        isSaved = isSaved,
                        onToggleSave = { onToggleFavorite(job.id) },
                        onClick = {
                            showOriginalLanguageText = false
                            selectedJobForDetail = job
                        }
                    )
                }
            }
        }
    }

    // Job Detail Bottom Sheet
    selectedJobForDetail?.let { job ->
        val translatedTitle = job.localizedTitles[state.activeLanguage]
        val translatedDesc = job.localizedDescriptions[state.activeLanguage]
        val activeTitle = if (showOriginalLanguageText || translatedTitle == null) job.title else translatedTitle
        val activeDesc = if (showOriginalLanguageText || translatedDesc == null) job.description else translatedDesc

        ModalBottomSheet(
            onDismissRequest = { selectedJobForDetail = null },
            containerColor = LoboroRoyalElevated,
            contentColor = LoboroWhite
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(bottom = 28.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = LoboroYellow
                    ) {
                        Text(
                            text = if (job.jobType == JobType.DAILY) strings.dailyWageJobBadge else strings.monthlySalaryJobBadge,
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = LoboroRoyalDeep,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                        )
                    }
                    Text(
                        text = "${job.id} · ${strings.demoDataTag}",
                        style = MaterialTheme.typography.labelSmall,
                        color = LoboroTextMutedLight
                    )
                }

                Text(
                    text = activeTitle,
                    style = MaterialTheme.typography.headlineSmall,
                    color = LoboroYellow
                )

                // Honest Translation Status Indicator
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = LoboroRoyalCard
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                            modifier = Modifier.weight(1f)
                        ) {
                            Icon(Icons.Filled.Translate, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(18.dp))
                            Text(
                                text = Translations.fmt(strings.originalLangFormat, job.originalLanguage.nativeName) + " " +
                                    if (translatedTitle != null) strings.preTranslatedPreviewNote
                                    else strings.configureTranslationApiNote,
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite
                            )
                        }
                        if (translatedTitle != null) {
                            TextButton(onClick = { showOriginalLanguageText = !showOriginalLanguageText }) {
                                Text(
                                    text = if (showOriginalLanguageText) strings.translatedToggle else strings.originalToggle,
                                    color = LoboroYellow,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }

                Text(
                    text = activeDesc,
                    style = MaterialTheme.typography.bodyMedium,
                    color = LoboroWhite
                )

                // Complete Job Condition Breakdown (Daily vs Monthly specific fields)
                Surface(
                    shape = RoundedCornerShape(14.dp),
                    color = LoboroRoyalCard,
                    border = BorderStroke(1.dp, LoboroYellow)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        val payText = if (job.jobType == JobType.DAILY) {
                            Translations.fmt(strings.perDayFormat, job.wageOrSalaryInr)
                        } else {
                            Translations.fmt(strings.perMonthFormat, job.wageOrSalaryInr)
                        }
                        val localizedState = strings.indianStates[job.state] ?: job.state
                        val badgeLabel = strings.badgeLevels[job.employerBadge] ?: job.employerBadge.label
                        DetailLine(strings.compensationLabel, payText)
                        DetailLine(strings.locationLabel, "${job.city}, ${job.district}, $localizedState, ${job.country}")
                        DetailLine(strings.workHoursLabel, job.workHours)
                        DetailLine(strings.workersNeeded, "${job.workersRequired} ${strings.vacanciesUnit}")
                        DetailLine(strings.filterFoodIncluded, if (job.foodProvided) strings.foodAvailable else strings.notProvided)
                        DetailLine(strings.filterAccommodation, if (job.accommodationProvided) strings.accommodationAvailable else strings.notProvided)
                        DetailLine(strings.overtimeLabel, job.overtimeDetails)
                        DetailLine(strings.paymentFreqLabel, job.paymentFrequency)
                        if (job.jobType == JobType.MONTHLY) {
                            DetailLine(strings.weeklyHolidayLabel, job.weeklyHoliday)
                            DetailLine(strings.leavePolicyLabel, job.leavePolicy)
                            DetailLine(strings.joiningDateLabel, job.joiningDate)
                        }
                        DetailLine(strings.employerLabel, "${job.employerName} (${job.employerLoboroId} · $badgeLabel ★${job.employerRating})")
                        DetailLine(strings.expiryLabel, job.expiryLabel)
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Button(
                        onClick = {
                            onApplyJob(job)
                            selectedJobForDetail = null
                        },
                        modifier = Modifier
                            .weight(1f)
                            .testTag("job_detail_apply_button"),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = LoboroYellow,
                            contentColor = LoboroRoyalDeep
                        )
                    ) {
                        Text(strings.applyNow, fontWeight = FontWeight.Bold)
                    }

                    OutlinedButton(
                        onClick = {
                            selectedJobForDetail = null
                            onOpenChat()
                        },
                        modifier = Modifier.weight(1f),
                        border = BorderStroke(1.5.dp, LoboroYellow),
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = LoboroRoyalCard,
                            contentColor = LoboroYellow
                        )
                    ) {
                        Icon(Icons.Filled.Chat, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(6.dp))
                        Text(strings.negotiateChat, fontWeight = FontWeight.Bold)
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    val localizedState = strings.indianStates[job.state] ?: job.state
                    TextButton(onClick = {
                        launchShareIntent(
                            context,
                            "${strings.appName}: $activeTitle — ${job.city}, $localizedState (${job.employerLoboroId})",
                            strings.shareJobButton
                        )
                    }) {
                        Icon(Icons.Filled.Share, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(4.dp))
                        Text(strings.shareJobButton, color = LoboroYellow)
                    }
                    TextButton(onClick = {
                        selectedJobForDetail = null
                        onReportSuspiciousJob(job)
                    }) {
                        Icon(Icons.Filled.Flag, contentDescription = null, tint = LoboroRedText, modifier = Modifier.size(18.dp))
                        Spacer(Modifier.width(4.dp))
                        Text(strings.reportJob, color = LoboroRedText, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}

@Composable
private fun DetailLine(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = LoboroTextMutedLight,
            modifier = Modifier.weight(0.42f)
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.SemiBold,
            color = LoboroWhite,
            modifier = Modifier.weight(0.58f)
        )
    }
}

@Composable
private fun JobListingCard(
    job: JobListing,
    displayTitle: String,
    displayDesc: String,
    isTranslatedPreview: Boolean,
    isSaved: Boolean,
    onToggleSave: () -> Unit,
    onClick: () -> Unit
) {
    val strings = LocalAppStrings.current
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .clickable(onClick = onClick)
            .testTag("job_card_${job.id}"),
        shape = RoundedCornerShape(20.dp),
        color = LoboroRoyalElevated,
        border = BorderStroke(1.dp, LoboroRoyalBorder),
        shadowElevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = LoboroRoyalDeep
                    ) {
                        Icon(
                            imageVector = categoryIcon(job.category),
                            contentDescription = null,
                            tint = LoboroYellow,
                            modifier = Modifier
                                .padding(10.dp)
                                .size(22.dp)
                        )
                    }
                    Column {
                        Text(
                            text = displayTitle,
                            style = MaterialTheme.typography.titleMedium,
                            color = LoboroWhite
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.LocationOn,
                                contentDescription = null,
                                tint = LoboroYellow,
                                modifier = Modifier.size(14.dp)
                            )
                            Text(
                                text = "${job.city}, ${strings.indianStates[job.state] ?: job.state} · ${job.distanceKm} km",
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroTextMutedLight
                            )
                        }
                    }
                }

                IconButton(onClick = onToggleSave) {
                    Icon(
                        imageVector = if (isSaved) Icons.Filled.Bookmark else Icons.Filled.BookmarkBorder,
                        contentDescription = strings.saveJob,
                        tint = if (isSaved) LoboroYellow else LoboroTextMutedLight
                    )
                }
            }

            // Wage / Salary Highlight Pill (Golden Yellow with Royal Deep ink)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = LoboroYellow
                ) {
                    Text(
                        text = if (job.jobType == JobType.DAILY) {
                            Translations.fmt(strings.perDayFormat, job.wageOrSalaryInr)
                        } else {
                            Translations.fmt(strings.perMonthFormat, job.wageOrSalaryInr)
                        },
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.ExtraBold,
                        color = LoboroRoyalDeep,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                    )
                }

                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    if (job.foodProvided) {
                        AmenityBadge(icon = Icons.Filled.Restaurant, label = strings.foodBadge)
                    }
                    if (job.accommodationProvided) {
                        AmenityBadge(icon = Icons.Filled.Hotel, label = strings.stayBadge)
                    }
                }
            }

            Text(
                text = displayDesc,
                style = MaterialTheme.typography.bodySmall,
                color = LoboroTextMutedLight,
                maxLines = 2
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(Icons.Filled.Star, contentDescription = null, tint = LoboroYellow, modifier = Modifier.size(16.dp))
                    Text(
                        text = "${job.employerName} (${job.employerLoboroId} · ${strings.badgeLevels[job.employerBadge] ?: job.employerBadge.label})",
                        style = MaterialTheme.typography.labelSmall,
                        color = LoboroWhite
                    )
                }
                Text(
                    text = if (isTranslatedPreview) "${strings.translatedBadgeLabel} (${job.originalLanguage.nativeName})" else job.expiryLabel,
                    style = MaterialTheme.typography.labelSmall,
                    color = LoboroTextMutedLight
                )
            }
        }
    }
}

@Composable
private fun AmenityBadge(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String
) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = LoboroRoyalMutedSurface
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(icon, contentDescription = label, tint = LoboroYellow, modifier = Modifier.size(14.dp))
            Text(label, style = MaterialTheme.typography.labelSmall, color = LoboroWhite)
        }
    }
}
