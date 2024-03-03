package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleDatabaseDsl.entries
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.*
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.Braille.DictionaryType.*
import com.lukeneedham.brailledatabase.R
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType.*

class BrailleDatabaseKana : BrailleDatabase() {
    override val dictionaryCategories =
        listOf(
            DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
            DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
            DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION),
            DictionaryCategory(
                R.string.category_contractions,
                8,
                "~",
                GROUPSIGN,
                WORDSIGN
            ).setTranslateToggle(true),
            DictionaryCategory(
                R.string.category_advancedcontractions,
                12,
                "~+",
                INITIALLETTERCONTRACTION,
                FINALLETTERCONTRACTION
            ).setTranslateToggle(true),
            DictionaryCategory(R.string.symbol_shortform, 15, "…", SHORTFORM).setTranslateToggle(
                true
            )
        )

    override val challengeSymbolTypes = listOf(LETTER)

    override val canDoTranslation = true

    override val wordSeparators = listOf(" ")

    override val symbols = entries {
        symbol {
            textRepresented = "っ"
            dictionaryType = LETTER
            cells {
                +Cell2
            }
        }
        symbol {
            textRepresented = "ー"
            dictionaryType = LETTER
            cells {
                +Cell125
            }
        }
        symbol {
            textRepresented = "あ"
            dictionaryType = LETTER
            cells {
                +Cell1
            }
        }
        symbol {
            textRepresented = "い"
            dictionaryType = LETTER
            cells {
                +Cell12
            }
        }
        symbol {
            textRepresented = "う"
            dictionaryType = LETTER
            cells {
                +Cell14
            }
        }
        symbol {
            textRepresented = "え"
            dictionaryType = LETTER
            cells {
                +Cell124
            }
        }
        symbol {
            textRepresented = "お"
            dictionaryType = LETTER
            cells {
                +Cell24
            }
        }
        symbol {
            textRepresented = "か"
            dictionaryType = LETTER
            cells {
                +Cell16
            }
        }
        symbol {
            textRepresented = "き"
            dictionaryType = LETTER
            cells {
                +Cell126
            }
        }
        symbol {
            textRepresented = "く"
            dictionaryType = LETTER
            cells {
                +Cell146
            }
        }
        symbol {
            textRepresented = "け"
            dictionaryType = LETTER
            cells {
                +Cell1246
            }
        }
        symbol {
            textRepresented = "こ"
            dictionaryType = LETTER
            cells {
                +Cell246
            }
        }
        symbol {
            textRepresented = "さ"
            dictionaryType = LETTER
            cells {
                +Cell156
            }
        }
        symbol {
            textRepresented = "し"
            dictionaryType = LETTER
            cells {
                +Cell1256
            }
        }
        symbol {
            textRepresented = "す"
            dictionaryType = LETTER
            cells {
                +Cell1456
            }
        }
        symbol {
            textRepresented = "せ"
            dictionaryType = LETTER
            cells {
                +Cell12456
            }
        }
        symbol {
            textRepresented = "そ"
            dictionaryType = LETTER
            cells {
                +Cell2456
            }
        }
        symbol {
            textRepresented = "た"
            dictionaryType = LETTER
            cells {
                +Cell135
            }
        }
        symbol {
            textRepresented = "ち"
            dictionaryType = LETTER
            cells {
                +Cell1235
            }
        }
        symbol {
            textRepresented = "つ"
            dictionaryType = LETTER
            cells {
                +Cell1345
            }
        }
        symbol {
            textRepresented = "て"
            dictionaryType = LETTER
            cells {
                +Cell12345
            }
        }
        symbol {
            textRepresented = "と"
            dictionaryType = LETTER
            cells {
                +Cell2345
            }
        }
        symbol {
            textRepresented = "な"
            dictionaryType = LETTER
            cells {
                +Cell13
            }
        }
        symbol {
            textRepresented = "に"
            dictionaryType = LETTER
            cells {
                +Cell123
            }
        }
        symbol {
            textRepresented = "ぬ"
            dictionaryType = LETTER
            cells {
                +Cell134
            }
        }
        symbol {
            textRepresented = "ね"
            dictionaryType = LETTER
            cells {
                +Cell1234
            }
        }
        symbol {
            textRepresented = "の"
            dictionaryType = LETTER
            cells {
                +Cell234
            }
        }
        symbol {
            textRepresented = "は"
            dictionaryType = LETTER
            cells {
                +Cell136
            }
        }
        symbol {
            textRepresented = "ひ"
            dictionaryType = LETTER
            cells {
                +Cell1236
            }
        }
        symbol {
            textRepresented = "ふ"
            dictionaryType = LETTER
            cells {
                +Cell1346
            }
        }
        symbol {
            textRepresented = "へ"
            dictionaryType = LETTER
            cells {
                +Cell12346
            }
        }
        symbol {
            textRepresented = "ほ"
            dictionaryType = LETTER
            cells {
                +Cell2346
            }
        }
        symbol {
            textRepresented = "ま"
            dictionaryType = LETTER
            cells {
                +Cell1356
            }
        }
        symbol {
            textRepresented = "み"
            dictionaryType = LETTER
            cells {
                +Cell12356
            }
        }
        symbol {
            textRepresented = "む"
            dictionaryType = LETTER
            cells {
                +Cell13456
            }
        }
        symbol {
            textRepresented = "め"
            dictionaryType = LETTER
            cells {
                +Cell123456
            }
        }
        symbol {
            textRepresented = "も"
            dictionaryType = LETTER
            cells {
                +Cell23456
            }
        }
        symbol {
            textRepresented = "ん"
            dictionaryType = LETTER
            cells {
                +Cell356
            }
        }
        symbol {
            textRepresented = "や"
            dictionaryType = LETTER
            cells {
                +Cell34
            }
        }
        symbol {
            textRepresented = "ゆ"
            dictionaryType = LETTER
            cells {
                +Cell346
            }
        }
        symbol {
            textRepresented = "よ"
            dictionaryType = LETTER
            cells {
                +Cell345
            }
        }
        symbol {
            textRepresented = "ら"
            dictionaryType = LETTER
            cells {
                +Cell15
            }
        }
        symbol {
            textRepresented = "り"
            dictionaryType = LETTER
            cells {
                +Cell125
            }
        }
        symbol {
            textRepresented = "る"
            dictionaryType = LETTER
            cells {
                +Cell145
            }
        }
        symbol {
            textRepresented = "れ"
            dictionaryType = LETTER
            cells {
                +Cell1245
            }
        }
        symbol {
            textRepresented = "ろ"
            dictionaryType = LETTER
            cells {
                +Cell245
            }
        }
        symbol {
            textRepresented = "わ"
            dictionaryType = LETTER
            cells {
                +Cell3
            }
        }
        symbol {
            textRepresented = "ゐ"
            dictionaryType = LETTER
            cells {
                +Cell23
            }
        }
        symbol {
            textRepresented = "ゑ"
            dictionaryType = LETTER
            cells {
                +Cell235
            }
        }
        symbol {
            textRepresented = "を"
            dictionaryType = LETTER
            cells {
                +Cell35
            }
        }
        symbol {
            textRepresented = "が"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell16
            }
        }
        symbol {
            textRepresented = "ぎ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell126
            }
        }
        symbol {
            textRepresented = "ぐ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell146
            }
        }
        symbol {
            textRepresented = "げ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell1246
            }
        }
        symbol {
            textRepresented = "ご"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell246
            }
        }
        symbol {
            textRepresented = "ざ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell156
            }
        }
        symbol {
            textRepresented = "じ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell1256
            }
        }
        symbol {
            textRepresented = "ず"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell1456
            }
        }
        symbol {
            textRepresented = "ぜ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell12456
            }
        }
        symbol {
            textRepresented = "ぞ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell2456
            }
        }
        symbol {
            textRepresented = "だ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell135
            }
        }
        symbol {
            textRepresented = "ぢ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell1235
            }
        }
        symbol {
            textRepresented = "づ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell1345
            }
        }
        symbol {
            textRepresented = "で"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell12345
            }
        }
        symbol {
            textRepresented = "ど"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell2345
            }
        }
        symbol {
            textRepresented = "ば"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell136
            }
        }
        symbol {
            textRepresented = "び"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell1236
            }
        }
        symbol {
            textRepresented = "ぶ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell1346
            }
        }
        symbol {
            textRepresented = "べ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell12346
            }
        }
        symbol {
            textRepresented = "ぼ"
            dictionaryType = LETTER
            cells {
                +Cell5
                +Cell2346
            }
        }
        symbol {
            textRepresented = "ぱ"
            dictionaryType = LETTER
            cells {
                +Cell6
                +Cell136
            }
        }
        symbol {
            textRepresented = "ぴ"
            dictionaryType = LETTER
            cells {
                +Cell6
                +Cell1236
            }
        }
        symbol {
            textRepresented = "ぷ"
            dictionaryType = LETTER
            cells {
                +Cell6
                +Cell1346
            }
        }
        symbol {
            textRepresented = "ぺ"
            dictionaryType = LETTER
            cells {
                +Cell6
                +Cell12346
            }
        }
        symbol {
            textRepresented = "ぽ"
            dictionaryType = LETTER
            cells {
                +Cell6
                +Cell2346
            }
        }
        symbol {
            textRepresented = "きゃ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell16
            }
        }
        symbol {
            textRepresented = "きゅ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell146
            }
        }
        symbol {
            textRepresented = "きょ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell246
            }
        }
        symbol {
            textRepresented = "しゃ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell156
            }
        }
        symbol {
            textRepresented = "しゅ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell1456
            }
        }
        symbol {
            textRepresented = "しょ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell2456
            }
        }
        symbol {
            textRepresented = "ちゃ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell135
            }
        }
        symbol {
            textRepresented = "ちゅ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell1345
            }
        }
        symbol {
            textRepresented = "ちょ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell2345
            }
        }
        symbol {
            textRepresented = "にゃ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell13
            }
        }
        symbol {
            textRepresented = "にゅ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell134
            }
        }
        symbol {
            textRepresented = "にょ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell234
            }
        }
        symbol {
            textRepresented = "ひゃ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell136
            }
        }
        symbol {
            textRepresented = "ひゅ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell1346
            }
        }
        symbol {
            textRepresented = "ひょ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell2346
            }
        }
        symbol {
            textRepresented = "みゃ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell1356
            }
        }
        symbol {
            textRepresented = "みゅ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell13456
            }
        }
        symbol {
            textRepresented = "みょ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell23456
            }
        }
        symbol {
            textRepresented = "りゃ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell15
            }
        }
        symbol {
            textRepresented = "りゅ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell145
            }
        }
        symbol {
            textRepresented = "りょ"
            dictionaryType = LETTER
            cells {
                +Cell4
                +Cell245
            }
        }
        symbol {
            textRepresented = "ぎゃ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell16
            }
        }
        symbol {
            textRepresented = "ぎゅ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell146
            }
        }
        symbol {
            textRepresented = "ぎょ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell246
            }
        }
        symbol {
            textRepresented = "じゃ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell156
            }
        }
        symbol {
            textRepresented = "じゅ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell1456
            }
        }
        symbol {
            textRepresented = "じょ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell2456
            }
        }
        symbol {
            textRepresented = "ぢゃ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell135
            }
        }
        symbol {
            textRepresented = "ぢゅ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell1345
            }
        }

        symbol {
            textRepresented = "ぢょ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell2345
            }
        }
        symbol {
            textRepresented = "びゃ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell136
            }
        }
        symbol {
            textRepresented = "びゅ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell1346
            }
        }
        symbol {
            textRepresented = "びょ"
            dictionaryType = LETTER
            cells {
                +Cell45
                +Cell2346
            }
        }
        symbol {
            textRepresented = "ぴゃ"
            dictionaryType = LETTER
            cells {
                +Cell46
                +Cell136
            }
        }
        symbol {
            textRepresented = "ぴゅ"
            dictionaryType = LETTER
            cells {
                +Cell46
                +Cell1346
            }
        }
        symbol {
            textRepresented = "ぴょ"
            dictionaryType = LETTER
            cells {
                +Cell46
                +Cell2346
            }
        }
        symbol {
            textRepresented = ""
            dictionaryType = NUMBER
            cells {
                +Cell3456
            }
            descriptiveNameRes = R.string.braille_number_sign
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.numbersExplanation
            fillEntryWidth = true
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = "1"
            dictionaryType = NUMBER
            cells {
                +Cell1
            }
        }
        symbol {
            textRepresented = "2"
            dictionaryType = NUMBER
            cells {
                +Cell12
            }
        }
        symbol {
            textRepresented = "3"
            dictionaryType = NUMBER
            cells {
                +Cell14
            }
        }
        symbol {
            textRepresented = "4"
            dictionaryType = NUMBER
            cells {
                +Cell145
            }
        }
        symbol {
            textRepresented = "5"
            dictionaryType = NUMBER
            cells {
                +Cell15
            }
        }
        symbol {
            textRepresented = "6"
            dictionaryType = NUMBER
            cells {
                +Cell124
            }
        }
        symbol {
            textRepresented = "7"
            dictionaryType = NUMBER
            cells {
                +Cell1245
            }
        }
        symbol {
            textRepresented = "8"
            dictionaryType = NUMBER
            cells {
                +Cell125
            }
        }
        symbol {
            textRepresented = "9"
            dictionaryType = NUMBER
            cells {
                +Cell24
            }
        }
        symbol {
            textRepresented = "0"
            dictionaryType = NUMBER
            cells {
                +Cell245
            }
        }
        symbol {
            textRepresented = "."
            dictionaryType = NUMBER
            cells {
                +Cell256
            }
            descriptiveNameRes = R.string.braille_decimal_point
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ","
            dictionaryType = NUMBER
            cells {
                +Cell2
            }
            descriptiveNameRes = R.string.braille_thousands_separator
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = " "
            dictionaryType = INVISIBLE
            cells {
                +CellEmpty
            }
        }
        symbol {
            textRepresented = "。"
            dictionaryType = PUNCTUATION
            cells {
                +Cell256
            }
            descriptiveNameRes = R.string.braille_fullstop
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "？"
            dictionaryType = PUNCTUATION
            cells {
                +Cell26
            }
            descriptiveNameRes = R.string.braille_questionmark
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "！"
            dictionaryType = PUNCTUATION
            cells {
                +Cell235
            }
            descriptiveNameRes = R.string.braille_exclamationmark
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "、"
            dictionaryType = PUNCTUATION
            cells {
                +Cell56
            }
            descriptiveNameRes = R.string.braille_comma
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "・"
            dictionaryType = PUNCTUATION
            cells {
                +Cell5
            }
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "—"
            dictionaryType = PUNCTUATION
            cells {
                +Cell25
                +Cell25
            }
            descriptiveNameRes = R.string.braille_dash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "…"
            dictionaryType = PUNCTUATION
            cells {
                +Cell2
                +Cell2
                +Cell2
            }
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "～"
            dictionaryType = PUNCTUATION
            cells {
                +Cell36
                +Cell36
            }
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "-"
            dictionaryType = PUNCTUATION
            cells {
                +Cell36
            }
            descriptiveNameRes = R.string.braille_hyphen
            onEntryClickType = SHOW_LETTERS_REP
        }
    }
}
