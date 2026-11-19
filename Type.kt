package com.example.ui.theme

import androidx.annotation.FontRes
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.domain.model.SupportedLanguage

val LoboroDisplayFont = FontFamily(
    Font(R.font.space_grotesk, FontWeight.Normal),
    Font(R.font.space_grotesk, FontWeight.Bold)
)

val LoboroBodyFont = FontFamily(
    Font(R.font.plus_jakarta_sans, FontWeight.Normal),
    Font(R.font.plus_jakarta_sans, FontWeight.Medium),
    Font(R.font.plus_jakarta_sans, FontWeight.SemiBold),
    Font(R.font.plus_jakarta_sans, FontWeight.Bold)
)

private fun indicFontFamily(@FontRes fontRes: Int): FontFamily = FontFamily(
    Font(fontRes, FontWeight.Normal),
    Font(fontRes, FontWeight.Medium),
    Font(fontRes, FontWeight.SemiBold),
    Font(fontRes, FontWeight.Bold)
)

private val DevanagariFont by lazy { indicFontFamily(R.font.noto_sans_devanagari) }
private val GujaratiFont by lazy { indicFontFamily(R.font.noto_sans_gujarati) }
private val TeluguFont by lazy { indicFontFamily(R.font.noto_sans_telugu) }
private val TamilFont by lazy { indicFontFamily(R.font.noto_sans_tamil) }
private val BengaliAssameseFont by lazy { indicFontFamily(R.font.noto_sans_bengali) }
private val KannadaFont by lazy { indicFontFamily(R.font.noto_sans_kannada) }
private val MalayalamFont by lazy { indicFontFamily(R.font.noto_sans_malayalam) }
private val GurmukhiFont by lazy { indicFontFamily(R.font.noto_sans_gurmukhi) }
private val OdiaFont by lazy { indicFontFamily(R.font.noto_sans_oriya) }

val LoboroTypography: Typography = typographyForFonts(
    displayFont = LoboroDisplayFont,
    bodyFont = LoboroBodyFont,
    isIndic = false
)

private val DevanagariTypography by lazy { typographyForFonts(DevanagariFont, DevanagariFont, isIndic = true) }
private val GujaratiTypography by lazy { typographyForFonts(GujaratiFont, GujaratiFont, isIndic = true) }
private val TeluguTypography by lazy { typographyForFonts(TeluguFont, TeluguFont, isIndic = true) }
private val TamilTypography by lazy { typographyForFonts(TamilFont, TamilFont, isIndic = true) }
private val BengaliAssameseTypography by lazy { typographyForFonts(BengaliAssameseFont, BengaliAssameseFont, isIndic = true) }
private val KannadaTypography by lazy { typographyForFonts(KannadaFont, KannadaFont, isIndic = true) }
private val MalayalamTypography by lazy { typographyForFonts(MalayalamFont, MalayalamFont, isIndic = true) }
private val GurmukhiTypography by lazy { typographyForFonts(GurmukhiFont, GurmukhiFont, isIndic = true) }
private val OdiaTypography by lazy { typographyForFonts(OdiaFont, OdiaFont, isIndic = true) }

fun loboroTypographyFor(language: SupportedLanguage): Typography = when (language) {
    SupportedLanguage.ENGLISH -> LoboroTypography
    SupportedLanguage.HINDI,
    SupportedLanguage.MARATHI -> DevanagariTypography
    SupportedLanguage.GUJARATI -> GujaratiTypography
    SupportedLanguage.TELUGU -> TeluguTypography
    SupportedLanguage.TAMIL -> TamilTypography
    SupportedLanguage.BENGALI,
    SupportedLanguage.ASSAMESE -> BengaliAssameseTypography
    SupportedLanguage.KANNADA -> KannadaTypography
    SupportedLanguage.MALAYALAM -> MalayalamTypography
    SupportedLanguage.PUNJABI -> GurmukhiTypography
    SupportedLanguage.ODIA -> OdiaTypography
}

private fun typographyForFonts(
    displayFont: FontFamily,
    bodyFont: FontFamily,
    isIndic: Boolean
): Typography {
    // Indic scripts need generous vertical line heights for stacked conjuncts/matras and 0.sp letter spacing to avoid breaking ligatures.
    val lsSmall = if (isIndic) 0.sp else 0.5.sp
    val lsDisplay = if (isIndic) 0.sp else (-0.25).sp

    return Typography(
        displaySmall = TextStyle(
            fontFamily = displayFont,
            fontWeight = FontWeight.Bold,
            fontSize = if (isIndic) 28.sp else 30.sp,
            lineHeight = if (isIndic) 38.sp else 36.sp,
            letterSpacing = lsDisplay
        ),
        headlineMedium = TextStyle(
            fontFamily = displayFont,
            fontWeight = FontWeight.Bold,
            fontSize = if (isIndic) 22.sp else 24.sp,
            lineHeight = if (isIndic) 32.sp else 30.sp
        ),
        headlineSmall = TextStyle(
            fontFamily = displayFont,
            fontWeight = FontWeight.Bold,
            fontSize = if (isIndic) 19.sp else 20.sp,
            lineHeight = if (isIndic) 28.sp else 26.sp
        ),
        titleLarge = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.Bold,
            fontSize = if (isIndic) 18.sp else 19.sp,
            lineHeight = if (isIndic) 27.sp else 25.sp
        ),
        titleMedium = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = if (isIndic) 15.5.sp else 16.sp,
            lineHeight = if (isIndic) 24.sp else 22.sp
        ),
        titleSmall = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            lineHeight = if (isIndic) 22.sp else 20.sp
        ),
        bodyLarge = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = if (isIndic) 26.sp else 24.sp
        ),
        bodyMedium = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = if (isIndic) 22.sp else 20.sp
        ),
        bodySmall = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = if (isIndic) 19.sp else 16.sp
        ),
        labelLarge = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.Bold,
            fontSize = 14.5.sp,
            lineHeight = if (isIndic) 22.sp else 20.sp,
            letterSpacing = 0.sp
        ),
        labelMedium = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            lineHeight = if (isIndic) 18.sp else 16.sp,
            letterSpacing = 0.sp
        ),
        labelSmall = TextStyle(
            fontFamily = bodyFont,
            fontWeight = FontWeight.Bold,
            fontSize = 11.sp,
            lineHeight = if (isIndic) 16.sp else 14.sp,
            letterSpacing = lsSmall
        )
    )
}
