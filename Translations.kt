package com.example.i18n

import com.example.domain.model.SupportedLanguage
import com.example.i18n.strings.AssameseStrings
import com.example.i18n.strings.BengaliStrings
import com.example.i18n.strings.EnglishStrings
import com.example.i18n.strings.GujaratiStrings
import com.example.i18n.strings.HindiStrings
import com.example.i18n.strings.KannadaStrings
import com.example.i18n.strings.MalayalamStrings
import com.example.i18n.strings.MarathiStrings
import com.example.i18n.strings.OdiaStrings
import com.example.i18n.strings.PunjabiStrings
import com.example.i18n.strings.TamilStrings
import com.example.i18n.strings.TeluguStrings
import java.util.Locale

object Translations {

    fun forLanguage(language: SupportedLanguage): AppStrings = when (language) {
        SupportedLanguage.HINDI -> HindiStrings
        SupportedLanguage.ENGLISH -> EnglishStrings
        SupportedLanguage.GUJARATI -> GujaratiStrings
        SupportedLanguage.MARATHI -> MarathiStrings
        SupportedLanguage.TELUGU -> TeluguStrings
        SupportedLanguage.TAMIL -> TamilStrings
        SupportedLanguage.BENGALI -> BengaliStrings
        SupportedLanguage.ASSAMESE -> AssameseStrings
        SupportedLanguage.KANNADA -> KannadaStrings
        SupportedLanguage.MALAYALAM -> MalayalamStrings
        SupportedLanguage.PUNJABI -> PunjabiStrings
        SupportedLanguage.ODIA -> OdiaStrings
    }

    fun fmt(pattern: String, vararg args: Any): String =
        runCatching { String.format(Locale.US, pattern, *args) }
            .getOrElse { pattern }
}
