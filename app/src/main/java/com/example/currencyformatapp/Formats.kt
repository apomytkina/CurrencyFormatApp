package com.example.currencyformatapp

import java.math.RoundingMode

enum class Formats(
        private val separator: Char,
        private val decimalSeparator: Char,
        val blankExists: Boolean,
        val symbolAtTheBeginning: Boolean,
        private val countOfIntegers: Int = 3,
        private val countOfDecimals: Int = 2
) {
    SYMBOL_BLANK_COMA_DOT(',', '.', true, true),
    SYMBOL_COMA_DOT(',', '.', false, true),
    SYMBOL_BLANK_DOT_DOT('.', '.', true, true),
    SYMBOL_DOT_DOT('.', '.', false, true),
    SYMBOL_BLANK_BLANK_DOT(' ', '.', true, true),
    SYMBOL_BLANK_DOT(' ', '.', false, true),
    SYMBOL_BLANK_COMA_COMA(',', ',', true, true),
    SYMBOL_COMA_COMA(',', ',', false, true),
    SYMBOL_BLANK_DOT_COMA('.', ',', true, true),
    SYMBOL_DOT_COMA('.', ',', false, true),
    SYMBOL_BLANK_BLANK_COMA(' ', ',', true, true),
    SYMBOL_BLANK_COMA(' ', ',', false, true),
    COMA_DOT_BLANK_SYMBOL(',', '.', true, false),
    COMA_DOT_SYMBOL(',', '.', false, false),
    DOT_DOT_BLANK_SYMBOL('.', '.', true, false),
    DOT_DOT_SYMBOL('.', '.', false, false),
    BLANK_DOT_BLANK_SYMBOL(' ', '.', true, false),
    BLANK_DOT_SYMBOL(' ', '.', false, false),
    COMA_COMA_BLANK_SYMBOL(',', ',', true, false),
    COMA_COMA_SYMBOL(',', ',', false, false),
    DOT_COMA_BLANK_SYMBOL('.', ',', true, false),
    DOT_COMA_SYMBOL('.', ',', false, false),
    BLANK_COMA_BLANK_SYMBOL(' ', ',', true, false),
    BLANK_COMA_SYMBOL(' ', ',', false, false),
    SYMBOL_BLANK_DOT_WITHOUT_FRACTION('.', '-', true, true, 3, 0),
    SYMBOL_BLANK_BLANK_WITHOUT_FRACTION(' ', '-', true, true, 3, 0),
    SYMBOL_BLANK_COMA_WITHOUT_FRACTION(',', '-', true, true, 3, 0),
    SYMBOL_COMA(',', '-', false, true, 3, 0),
    SYMBOL_DOT('.', '-', false, true, 3, 0),
    SYMBOL_BLANK(' ', '-', false, true, 3, 0),
    COMA_BLANK_SYMBOL_WITHOUT_FRACTION(',', '-', true, false, 3, 0),
    DOT_BLANK_SYMBOL_WITHOUT_FRACTION('.', '-', true, false, 3, 0),
    BLANK_BLANK_SYMBOL_WITHOUT_FRACTION(' ', '-', true, false, 3, 0),
    COMA_SYMBOL(',', '-', false, false, 3, 0),
    DOT_SYMBOL('.', '-', false, false, 3, 0),
    BLANK_SYMBOL(' ', '-', false, false, 3, 0),
    EMPTY_COMA_BLANK_SYMBOL('-', ',', true, false, 0, 2),
    SYMBOL_BLANK_EMPTY_DOT('-', '.', false, false, 0, 2),
    QUOTE_DOT_BLANK_SYMBOL('\'', '.', true, false),
    SYMBOL_BLANK_QUOTE_DOT('\'', '.', true, true),
    SYMBOL_BLANK_QUOTE_COMA('\'', ',', true, true);

    fun formatNumber(number: Double) : String {
        val listInteger = mutableListOf<Char>()
        val decimal = number.toBigDecimal().setScale(countOfDecimals, RoundingMode.HALF_UP).toString().substringAfterLast('.')
        val integer = number.toBigDecimal().setScale(countOfDecimals, RoundingMode.HALF_UP).toString().substringBeforeLast('.')
        val strInteger = if (number < 0)
            integer.removeRange(0, 1).toCharArray().reversedArray()
        else
            integer.toCharArray().reversedArray()

        for (i in strInteger.indices){
            if (i > 0 && i % countOfIntegers == 0 && separator != '-')
                listInteger.add(separator)
            listInteger.add(strInteger[i])
        }

        return listInteger.asReversed().joinToString("", "", "") + decimalSeparator + decimal
    }
}