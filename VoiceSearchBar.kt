package com.example.ui.components

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.GraphicEq
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.example.domain.model.SupportedLanguage
import com.example.i18n.LocalAppStrings
import com.example.i18n.Translations
import com.example.ui.theme.LoboroRed
import com.example.ui.theme.LoboroRedSoft
import com.example.ui.theme.LoboroRoyalBorder
import com.example.ui.theme.LoboroRoyalCard
import com.example.ui.theme.LoboroRoyalDeep
import com.example.ui.theme.LoboroRoyalElevated
import com.example.ui.theme.LoboroRoyalMutedSurface
import com.example.ui.theme.LoboroTextMutedLight
import com.example.ui.theme.LoboroWhite
import com.example.ui.theme.LoboroYellow

@Composable
fun VoiceSearchBar(
    query: String,
    activeLanguage: SupportedLanguage,
    onQueryChange: (String) -> Unit,
    onSearchSubmit: (String) -> Unit,
    modifier: Modifier = Modifier,
    showQuickSpokenExamples: Boolean = true
) {
    val context = LocalContext.current
    val strings = LocalAppStrings.current

    var isListening by remember { mutableStateOf(false) }
    var voiceError by remember { mutableStateOf<String?>(null) }
    var showVoicePanel by remember { mutableStateOf(false) }
    var recognizerInstance by remember { mutableStateOf<SpeechRecognizer?>(null) }

    val startRecognition: () -> Unit = remember(context, activeLanguage) {
        {
            voiceError = null
            showVoicePanel = true
            if (!SpeechRecognizer.isRecognitionAvailable(context)) {
                isListening = false
                voiceError = strings.voiceUnavailableHonest
            } else {
                recognizerInstance?.destroy()
                val sr = SpeechRecognizer.createSpeechRecognizer(context)
                recognizerInstance = sr
                sr.setRecognitionListener(object : RecognitionListener {
                    override fun onReadyForSpeech(params: Bundle?) {
                        isListening = true
                    }

                    override fun onBeginningOfSpeech() {}
                    override fun onRmsChanged(rmsdB: Float) {}
                    override fun onBufferReceived(buffer: ByteArray?) {}
                    override fun onEndOfSpeech() {
                        isListening = false
                    }

                    override fun onError(error: Int) {
                        isListening = false
                        voiceError = when (error) {
                            SpeechRecognizer.ERROR_NO_MATCH -> strings.voiceNoMatchError
                            SpeechRecognizer.ERROR_NETWORK, SpeechRecognizer.ERROR_NETWORK_TIMEOUT ->
                                strings.voiceNetworkError
                            SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS -> strings.voiceMicPermissionNeeded
                            else -> Translations.fmt(strings.voiceStoppedError, error)
                        }
                    }

                    override fun onResults(results: Bundle?) {
                        isListening = false
                        val matches = results?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                        val recognized = matches?.firstOrNull().orEmpty()
                        if (recognized.isNotBlank()) {
                            onQueryChange(recognized)
                            voiceError = null
                        }
                    }

                    override fun onPartialResults(partialResults: Bundle?) {
                        val partial = partialResults
                            ?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                            ?.firstOrNull()
                        if (!partial.isNullOrBlank()) {
                            onQueryChange(partial)
                        }
                    }

                    override fun onEvent(eventType: Int, params: Bundle?) {}
                })

                val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                    putExtra(
                        RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
                    )
                    putExtra(RecognizerIntent.EXTRA_LANGUAGE, activeLanguage.bcp47)
                    putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true)
                }
                sr.startListening(intent)
                isListening = true
            }
        }
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (granted) {
            startRecognition()
        } else {
            showVoicePanel = true
            isListening = false
            voiceError = strings.voiceMicPermissionNeeded
        }
    }

    val stopRecognition: () -> Unit = {
        recognizerInstance?.stopListening()
        isListening = false
    }

    DisposableEffect(Unit) {
        onDispose {
            recognizerInstance?.destroy()
            recognizerInstance = null
        }
    }

    val onMicTap: () -> Unit = {
        val granted = ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.RECORD_AUDIO
        ) == PackageManager.PERMISSION_GRANTED
        if (granted) {
            if (isListening) stopRecognition() else startRecognition()
        } else {
            permissionLauncher.launch(Manifest.permission.RECORD_AUDIO)
        }
    }

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Surface(
            shape = RoundedCornerShape(18.dp),
            color = LoboroRoyalCard,
            border = BorderStroke(1.5.dp, if (isListening) LoboroYellow else LoboroRoyalBorder),
            shadowElevation = 3.dp
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                OutlinedTextField(
                    value = query,
                    onValueChange = onQueryChange,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("job_search_input"),
                    placeholder = {
                        Text(
                            text = strings.voiceSearchHint,
                            style = MaterialTheme.typography.bodyMedium,
                            color = LoboroTextMutedLight,
                            maxLines = 1
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = strings.searchAction,
                            tint = LoboroYellow
                        )
                    },
                    trailingIcon = {
                        if (query.isNotEmpty()) {
                            IconButton(onClick = { onQueryChange("") }) {
                                Icon(
                                    imageVector = Icons.Filled.Close,
                                    contentDescription = strings.clearSearchDesc,
                                    tint = LoboroTextMutedLight
                                )
                            }
                        }
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                    keyboardActions = KeyboardActions(onSearch = { onSearchSubmit(query) }),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = LoboroRoyalCard,
                        unfocusedBorderColor = LoboroRoyalCard,
                        focusedTextColor = LoboroWhite,
                        unfocusedTextColor = LoboroWhite,
                        cursorColor = LoboroYellow
                    )
                )

                // Large accessible Microphone button inside search bar
                Surface(
                    modifier = Modifier
                        .size(54.dp)
                        .clip(CircleShape)
                        .clickable(onClick = onMicTap)
                        .minimumInteractiveComponentSize()
                        .testTag("voice_search_mic_button"),
                    shape = CircleShape,
                    color = if (isListening) LoboroRed else LoboroYellow,
                    shadowElevation = 3.dp
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = if (isListening) Icons.Filled.GraphicEq else Icons.Filled.Mic,
                            contentDescription = strings.tapMicToSpeak,
                            tint = if (isListening) LoboroWhite else LoboroRoyalDeep,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            }
        }

        // Visible Voice Search Panel when active
        AnimatedVisibility(visible = showVoicePanel) {
            val pulseScaleState: State<Float> = if (isListening) {
                val transition = rememberInfiniteTransition(label = "mic_pulse")
                transition.animateFloat(
                    initialValue = 1f,
                    targetValue = 1.14f,
                    animationSpec = infiniteRepeatable(
                        animation = tween(650),
                        repeatMode = RepeatMode.Reverse
                    ),
                    label = "pulse"
                )
            } else {
                remember { mutableFloatStateOf(1f) }
            }

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .testTag("voice_search_panel"),
                shape = RoundedCornerShape(18.dp),
                color = LoboroRoyalElevated,
                border = BorderStroke(1.dp, LoboroYellow.copy(alpha = 0.7f))
            ) {
                Column(
                    modifier = Modifier.padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(40.dp)
                                    .graphicsLayer {
                                        val s = pulseScaleState.value
                                        scaleX = s
                                        scaleY = s
                                    }
                                    .background(
                                        if (isListening) LoboroYellow else LoboroRoyalMutedSurface,
                                        CircleShape
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.Mic,
                                    contentDescription = null,
                                    tint = if (isListening) LoboroRoyalDeep else LoboroYellow
                                )
                            }
                            Column {
                                Text(
                                    text = if (isListening) strings.listeningStatus
                                    else "${activeLanguage.nativeName} (${activeLanguage.bcp47})",
                                    style = MaterialTheme.typography.titleSmall,
                                    color = LoboroWhite
                                )
                                Text(
                                    text = strings.voicePrivacyHint,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = LoboroYellow
                                )
                            }
                        }

                        IconButton(onClick = {
                            stopRecognition()
                            showVoicePanel = false
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = strings.closeLabel,
                                tint = LoboroWhite
                            )
                        }
                    }

                    if (voiceError != null) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LoboroRedSoft,
                            border = BorderStroke(1.dp, LoboroRed)
                        ) {
                            Text(
                                text = voiceError ?: "",
                                style = MaterialTheme.typography.bodySmall,
                                color = LoboroWhite,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                    }

                    if (query.isNotBlank()) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = LoboroRoyalCard,
                            border = BorderStroke(1.dp, LoboroYellow)
                        ) {
                            Text(
                                text = "“$query”",
                                style = MaterialTheme.typography.titleSmall,
                                color = LoboroYellow,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(10.dp)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        if (isListening) {
                            Button(
                                onClick = stopRecognition,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = LoboroRed,
                                    contentColor = LoboroWhite
                                ),
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(Icons.Filled.Stop, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.stopListening)
                            }
                        } else {
                            OutlinedButton(
                                onClick = onMicTap,
                                border = BorderStroke(1.dp, LoboroYellow),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = LoboroYellow),
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(Icons.Filled.Refresh, contentDescription = null, modifier = Modifier.size(18.dp))
                                Spacer(Modifier.width(6.dp))
                                Text(strings.retryVoice)
                            }
                        }

                        Button(
                            onClick = {
                                onSearchSubmit(query)
                                showVoicePanel = false
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = LoboroYellow,
                                contentColor = LoboroRoyalDeep
                            ),
                            modifier = Modifier.weight(1f)
                        ) {
                            Icon(Icons.Filled.Search, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(Modifier.width(6.dp))
                            Text(strings.searchAction, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }

        if (showQuickSpokenExamples) {
            val samplePhrases = strings.spokenSamples
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                samplePhrases.forEach { (displayPhrase, searchTerm) ->
                    Surface(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .clickable {
                                onQueryChange(searchTerm)
                                onSearchSubmit(searchTerm)
                            },
                        shape = RoundedCornerShape(20.dp),
                        color = LoboroRoyalMutedSurface,
                        border = BorderStroke(1.dp, LoboroYellow.copy(alpha = 0.55f))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Mic,
                                contentDescription = null,
                                tint = LoboroYellow,
                                modifier = Modifier.size(14.dp)
                            )
                            Text(
                                text = displayPhrase,
                                style = MaterialTheme.typography.labelMedium,
                                color = LoboroWhite
                            )
                        }
                    }
                }
            }
        }
    }
}
