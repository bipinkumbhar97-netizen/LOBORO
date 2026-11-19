package com.example.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

// Mandatory LOBORO Royal Blue Colour System (STRICTLY NO GREEN, NO PURE BLACK BG, NO PURE WHITE BG)
val LoboroRoyalBlue = Color(0xFF102A8F)         // Primary dominant background
val LoboroRoyalDeep = Color(0xFF0B1F6E)         // Top/bottom bars, high-contrast ink on yellow buttons
val LoboroRoyalDark = Color(0xFF081754)         // Deep royal gradient stop / recessed fields
val LoboroRoyalElevated = Color(0xFF1736B0)     // Elevated cards, sheets & dialogs
val LoboroRoyalCard = Color(0xFF1E42CB)         // Featured interactive cards, chips & tiles
val LoboroRoyalMutedSurface = Color(0xFF274FE0) // Nested chips, subtle badges & input highlights
val LoboroRoyalBorder = Color(0xFF476EF2)       // Crisp luminous Royal Blue border
val LoboroRoyalGoldTint = Color(0xFF1935A4)     // Royal surface for golden-bordered feature callouts

// Compatibility aliases mapped cleanly to Royal Blue hierarchy
val LoboroNavy = LoboroRoyalDeep
val LoboroNavyElevated = LoboroRoyalElevated
val LoboroNavyCard = LoboroRoyalCard
val LoboroNavyDeep = LoboroRoyalDark

// Bright Golden Yellow (#FFD700) — Primary Highlights, Active Selections, Icons & CTAs
val LoboroYellow = Color(0xFFFFD700)
val LoboroYellowPressed = Color(0xFFE6BE00)
val LoboroYellowSoft = Color(0xFF1D3A9E)
val LoboroYellowOnNavy = Color(0xFFFFE44D)

// Metallic Gold Shades for the Animated LOBORO Coin
val LoboroGoldHighlight = Color(0xFFFFF4A3)
val LoboroGoldMid = Color(0xFFFFD700)
val LoboroGoldDeep = Color(0xFFC99300)
val LoboroGoldEdge = Color(0xFF966900)

// Text / Icon Ink Tokens (Light ink for Royal Blue surfaces — NEVER used as app/card backgrounds)
val LoboroWhite = Color(0xFFFFFFFF)
val LoboroTextLight = Color(0xFFF3F6FF)
val LoboroTextMutedLight = Color(0xFFC2D2FF)
val LoboroTextOnNavy = Color(0xFFFFFFFF)
val LoboroTextMutedOnNavy = Color(0xFFC2D2FF)

// Royal Blue Surface & Border Tokens
val LoboroSurfaceLight = LoboroRoyalBlue
val LoboroSurfaceCardLight = LoboroRoyalElevated
val LoboroSurfaceMutedLight = LoboroRoyalMutedSurface
val LoboroBorderLight = LoboroRoyalBorder
val LoboroBorderNavy = LoboroRoyalBorder
val LoboroTextOnLight = LoboroTextLight
val LoboroTextMutedOnLight = LoboroTextMutedLight

// Bright Red (#FF0000) & Deep Crimson Shades ONLY for emergencies, alerts, warnings & destructive actions
val LoboroRed = Color(0xFFFF0000)
val LoboroRedDark = Color(0xFFC20000)
val LoboroRedSoft = Color(0xFF4B1036)
val LoboroRedText = Color(0xFFFF8A8A)

val LoboroScreenGradient = Brush.verticalGradient(
    colors = listOf(LoboroRoyalDeep, LoboroRoyalBlue, Color(0xFF1534A8))
)

val LoboroHeroGradient = Brush.verticalGradient(
    colors = listOf(LoboroRoyalDeep, LoboroRoyalCard)
)
