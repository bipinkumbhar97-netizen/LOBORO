package com.example.ui.theme

import android.app.Activity
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.example.domain.model.SupportedLanguage

private val LoboroColorScheme = darkColorScheme(
    primary = LoboroYellow,
    onPrimary = LoboroRoyalDeep,
    primaryContainer = LoboroRoyalCard,
    onPrimaryContainer = LoboroYellow,
    secondary = LoboroYellow,
    onSecondary = LoboroRoyalDeep,
    secondaryContainer = LoboroRoyalMutedSurface,
    onSecondaryContainer = LoboroYellow,
    tertiary = LoboroRoyalElevated,
    onTertiary = LoboroWhite,
    tertiaryContainer = LoboroRoyalCard,
    onTertiaryContainer = LoboroTextLight,
    background = LoboroRoyalBlue,
    onBackground = LoboroWhite,
    surface = LoboroRoyalElevated,
    onSurface = LoboroWhite,
    surfaceVariant = LoboroRoyalCard,
    onSurfaceVariant = LoboroTextMutedLight,
    surfaceContainerLowest = LoboroRoyalDark,
    surfaceContainerLow = LoboroRoyalDeep,
    surfaceContainer = LoboroRoyalElevated,
    surfaceContainerHigh = LoboroRoyalCard,
    surfaceContainerHighest = LoboroRoyalMutedSurface,
    outline = LoboroRoyalBorder,
    outlineVariant = LoboroRoyalMutedSurface,
    error = LoboroRed,
    onError = LoboroWhite,
    errorContainer = LoboroRedSoft,
    onErrorContainer = LoboroWhite,
    inverseSurface = LoboroRoyalCard,
    inverseOnSurface = LoboroWhite,
    inversePrimary = LoboroYellow
)

val LoboroShapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(22.dp),
    extraLarge = RoundedCornerShape(28.dp)
)

@Composable
fun LoboroTheme(
    language: SupportedLanguage = SupportedLanguage.ENGLISH,
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        LaunchedEffect(view) {
            val window = (view.context as? Activity)?.window
            if (window != null) {
                WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
            }
        }
    }

    MaterialTheme(
        colorScheme = LoboroColorScheme,
        typography = loboroTypographyFor(language),
        shapes = LoboroShapes,
        content = content
    )
}
