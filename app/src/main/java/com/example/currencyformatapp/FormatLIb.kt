package com.example.currencyformatapp

import java.math.RoundingMode

val currencySymbols = mapOf(
        "-" to "",
        "AED" to "د.إ",
        "AFN" to "؋",
        "ALL" to "Lek",
        "AMD" to "դր.",
        "ANG" to "ƒ",
        "AOA" to "Kz",
        "ARS" to "\$",
        "AUD" to "$",
        "AWG" to "ƒ",
        "AZN" to "m",
        "BAM" to "КМ",
        "BBD" to "\$",
        "BDT" to "৳",
        "BGN" to "лв",
        "BHD" to ".د.ب",
        "BIF" to "Fr",
        "BMD" to "\$",
        "BND" to "$",
        "BOB" to "Bs.",
        "BRL" to "R$",
        "BSD" to "\$",
        "BTN" to "Nu.",
        "BWP" to "P",
        "BYR" to "Br",
        "BZD" to "\$",
        "CAD" to "\$",
        "CDF" to "Fr",
        "CHF" to "Fr",
        "CLP" to "\$",
        "CNY" to "¥",
        "COP" to "\$",
        "CRC" to "₡",
        "CUC" to "\$",
        "CUP" to "\$",
        "CVE" to "\$",
        "CZK" to "Kč",
        "DJF" to "Fr",
        "DKK" to "kr",
        "DOP" to "\$",
        "DZD" to "د.ج",
        "EGP" to "ج.م",
        "ERN" to "Nfk",
        "ETB" to "Br",
        "EUR" to "€",
        "FJD" to "\$",
        "FKP" to "£",
        "GBP" to "£",
        "GEL" to "ლ",
        "GHS" to "₵",
        "GIP" to "£",
        "GMD" to "D",
        "GNF" to "Fr",
        "GTQ" to "Q",
        "GYD" to "\$",
        "HKD" to "\$",
        "HNL" to "L",
        "HRK" to "kn",
        "HTG" to "G",
        "HUF" to "Ft",
        "IDR" to "Rp",
        "ILS" to "₪",
        "INR" to "₹",
        "IQD" to "ع.د",
        "IRR" to "﷼",
        "ISK" to "kr",
        "JMD" to "\$",
        "JOD" to "د.ا",
        "JPY" to "¥",
        "KES" to "Sh",
        "KGS" to "лв",
        "KHR" to "៛",
        "KMF" to "Fr",
        "KPW" to "₩",
        "KRW" to "₩",
        "KWD" to "د.ك",
        "KYD" to "\$",
        "KZT" to "₸",
        "LAK" to "₭",
        "LBP" to "ل.ل",
        "LKR" to "Rs",
        "LRD" to "\$",
        "LSL" to "L",
        "LTL" to "Lt",
        "LYD" to "ل.د",
        "MAD" to "د.م.",
        "MDL" to "L",
        "MGA" to "Ar",
        "MKD" to "ден",
        "MMK" to "Ks",
        "MNT" to "₮",
        "MOP" to "P",
        "MRO" to "UM",
        "MUR" to "₨",
        "MVR" to ".ރ",
        "MWK" to "MK",
        "MXN" to "\$",
        "MYR" to "RM",
        "MZN" to "MT",
        "NAD" to "$",
        "NGN" to "₦",
        "NIO" to "C$",
        "NOK" to "kr",
        "NPR" to "₨",
        "NZD" to "\$",
        "OMR" to "ر.ع.",
        "PAB" to "B/.",
        "PEN" to "S/.",
        "PGK" to "K",
        "PHP" to "₱",
        "PKR" to "₨",
        "PLN" to "zł",
        "PYG" to "₲",
        "QAR" to "ر.ق",
        "RON" to "L",
        "RSD" to "дин.",
        "RUB" to "руб.",
        "RWF" to "Fr",
        "SAR" to "ر.س",
        "SBD" to "\$",
        "SCR" to "₨",
        "SDG" to "£",
        "SEK" to "kr",
        "SGD" to "\$",
        "SHP" to "£",
        "SLL" to "Le",
        "SOS" to "Sh",
        "SRD" to "\$",
        "SSP" to "£",
        "STD" to "Db",
        "SYP" to "ل.س",
        "SZL" to "L",
        "THB" to "฿",
        "TJS" to "ЅМ",
        "TMT" to "m",
        "TND" to "د.ت",
        "TOP" to "T$",
        "TRY" to "NULL",
        "TTD" to "\$",
        "TWD" to "\$",
        "TZS" to "Sh",
        "UAH" to "₴",
        "UGX" to "Sh",
        "USD" to "$",
        "UYU" to "\$",
        "UZS" to "лв",
        "VEF" to "Bs F",
        "VND" to "₫",
        "VUV" to "Vt",
        "WST" to "T",
        "XAF" to "Fr",
        "XCD" to "\$",
        "XOF" to "Fr",
        "XPF" to "Fr",
        "YER" to "﷼",
        "ZAR" to "R",
        "ZMW" to "ZK"
)

enum class Formats(
        private val separator: Char,
        private val decimalSeparator: Char,
        private val countOfIntegers: Int = 3,
        private val countOfDecimals: Int = 2,
        private val numerals : String = "default"
) {
    SYMBOL_BLANK_COMA_DOT(',', '.'),
    SYMBOL_COMA_DOT(',', '.'), // OK
    SYMBOL_BLANK_DOT_DOT('.', '.'),
    SYMBOL_DOT_DOT('.', '.'),
    SYMBOL_BLANK_BLANK_DOT(' ', '.'),
    SYMBOL_BLANK_DOT(' ', '.'),
    SYMBOL_BLANK_COMA_COMA(',', ','),
    SYMBOL_COMA_COMA(',', ','),
    SYMBOL_BLANK_DOT_COMA('.', ','),
    SYMBOL_DOT_COMA('.', ','),
    SYMBOL_BLANK_BLANK_COMA(' ', ','),
    SYMBOL_BLANK_COMA(' ', ','),
    COMA_DOT_BLANK_SYMBOL(',', '.'),
    COMA_DOT_SYMBOL(',', '.'),
    DOT_DOT_BLANK_SYMBOL('.', '.'),
    DOT_DOT_SYMBOL('.', '.'),
    BLANK_DOT_BLANK_SYMBOL(' ', '.'),
    BLANK_DOT_SYMBOL(' ', '.'),
    COMA_COMA_BLANK_SYMBOL(',', ','),
    COMA_COMA_SYMBOL(',', ','),
    DOT_COMA_BLANK_SYMBOL('.', ','),
    DOT_COMA_SYMBOL('.', ','),
    BLANK_COMA_BLANK_SYMBOL(' ', ','),
    BLANK_COMA_BLANK_SYMBOL_THREE(' ', ',', 3, 3),
    BLANK_COMA_SYMBOL(' ', ','),
    SYMBOL_BLANK_DOT_WITHOUT_FRACTION('.', '-',  3, 0),
    SYMBOL_BLANK_BLANK_WITHOUT_FRACTION(' ', '-', 3, 0),
    SYMBOL_BLANK_COMA_WITHOUT_FRACTION(  ',', '-', 3, 0),
    SYMBOL_COMA(',', '-', 3, 0),
    SYMBOL_DOT('.', '-',  3, 0),
    SYMBOL_BLANK(' ', '-', 3, 0),
    COMA_BLANK_SYMBOL_WITHOUT_FRACTION(',', '-',  3, 0),
    DOT_BLANK_SYMBOL_WITHOUT_FRACTION('.', '-',  3, 0),
    BLANK_BLANK_SYMBOL_WITHOUT_FRACTION(' ', '-',  3, 0),
    COMA_SYMBOL(',', '-', 3, 0),
    DOT_SYMBOL('.', '-',  3, 0),
    BLANK_SYMBOL(' ', '-', 3, 0),
    EMPTY_COMA_BLANK_SYMBOL('-', ',', 0, 2),
    SYMBOL_BLANK_EMPTY_DOT('-', '.',  0, 2),
    QUOTE_DOT_BLANK_SYMBOL('’', '.'),
    SYMBOL_BLANK_QUOTE_DOT('’', '.'),
    SYMBOL_BLANK_QUOTE_COMA('’', ','),
    PERSIAN_TWO_BLANK_SYMBOL(',', ',',3, 2, "persian"),
    SYMBOL_BLANK_PERSIAN_TWO(',', ',', 3, 2, "persian"),
    PERSIAN_THREE_BLANK_SYMBOL(',', ',',  3, 3, "persian"),
    BENGALI_SYMBOL(',', '.',  3, 2, "bengali"),
    SYMBOL_BLANK_BENGALI(',', '.',  3, 2, "bengali"),
    SYMBOL_NEPALI(',', '.',  3, 2, "nepali"),
    SYMBOL_BLANK_NEPALI(',', '.', 3, 2, "nepali"),
    DZONGHKA(',', '.', 3, 2, "dzongkha"),
    BURMESE(',', '.', 3, 2, "burmese"),
    THAI(',', '.', 3, 2, "thai"),
    ARABIC_TWO_BLANK_SYMBOL('٬', '٫',  3, 2, "hindi-arabic"),
    SYMBOL_BLANK_ARABIC_TWO('٬', '٫', 3, 2, "hindi-arabic"),
    SYMBOL_ARABIC_TWO('٬', '٫', 3, 2, "hindi-arabic"),
    ARABIC_THREE('٬', '٫', 3, 3, "hindi-arabic"),
    ARABIC_WITHOUT_FRACTION('٬', '٫',3, 0, "hindi-arabic");

    fun formatNumber(number: Double) : String {
        val listInteger = mutableListOf<Char>()
        val integer = number.toBigDecimal().setScale(countOfDecimals, RoundingMode.HALF_UP).toString().substringBeforeLast('.')
        val decimal = if (countOfDecimals != 0)
            number.toBigDecimal().setScale(countOfDecimals, RoundingMode.HALF_UP).toString().substringAfterLast('.')
        else
            ""
        val strInteger = if (number < 0)
            integer.removeRange(0, 1).toCharArray().reversedArray()
        else
            integer.toCharArray().reversedArray()

        for (i in strInteger.indices){
            if (separator != '-' && i > 0 && i % countOfIntegers == 0)
                listInteger.add(separator)
            listInteger.add(strInteger[i])
        }

        val result = if (decimalSeparator != '-')
            listInteger.asReversed().joinToString("", "", "") + decimalSeparator + decimal
        else
            listInteger.asReversed().joinToString("", "", "")

        return if (numerals == "hindi-arabic"){
            result
                    .replace('0', '٠')
                    .replace('1', '١')
                    .replace('2', '٢')
                    .replace('3', '٣')
                    .replace('4', '٤')
                    .replace('5', '٥')
                    .replace('6', '٦')
                    .replace('7', '٧')
                    .replace('8', '٨')
                    .replace('9', '٩')
                    //.replace(',', '٬')
        } else if (numerals == "persian"){
            result
                    .replace('0', '۰')
                    .replace('1', '۱')
                    .replace('2', '۲')
                    .replace('3', '۳')
                    .replace('4', '۴')
                    .replace('5', '۵')
                    .replace('6', '۶')
                    .replace('7', '۷')
                    .replace('8', '۸')
                    .replace('9', '۹')
                    .replace(' ', ' ')
        } else if (numerals == "bengali"){
            result
                    .replace('0', '০')
                    .replace('1', '১')
                    .replace('2', '২')
                    .replace('3', '৩')
                    .replace('4', '৪')
                    .replace('5', '৫')
                    .replace('6', '৬')
                    .replace('7', '৭')
                    .replace('8', '৮')
                    .replace('9', '৯')
        } else if (numerals == "nepali"){
            result
                    .replace('0', '०')
                    .replace('1', '१')
                    .replace('2', '२')
                    .replace('3', '३')
                    .replace('4', '४')
                    .replace('5', '५')
                    .replace('6', '६')
                    .replace('7', '७')
                    .replace('8', '८')
                    .replace('9', '९')
        } else if (numerals == "dzongkha"){
            result
                    .replace('0', '༠')
                    .replace('1', '༡')
                    .replace('2', '༢')
                    .replace('3', '༣')
                    .replace('4', '༤')
                    .replace('5', '༥')
                    .replace('6', '༦')
                    .replace('7', '༧')
                    .replace('8', '༨')
                    .replace('9', '༩')
                    .replace(',', ',')
                    .replace('.', '.')
        } else if (numerals == "burmese"){
            result
                    .replace('0', '၀')
                    .replace('1', '၁')
                    .replace('2', '၂')
                    .replace('3', '၃')
                    .replace('4', '၄')
                    .replace('5', '၅')
                    .replace('6', '၆')
                    .replace('7', '၇')
                    .replace('8', '၈')
                    .replace('9', '၉')
        } else if (numerals == "thai"){
            result
                    .replace('0', '๐')
                    .replace('1', '๑')
                    .replace('2', '๒')
                    .replace('3', '๓')
                    .replace('4', '๔')
                    .replace('5', '๕')
                    .replace('6', '๖')
                    .replace('7', '๗')
                    .replace('8', '๘')
                    .replace('9', '๙')
                    .replace(',', ',')
                    .replace('.', '.')
        } else
            result
    }
}

class Price(locale: String, currencyCode: String, price: String) {
    private var locale = locale
    private var currencyCode = currencyCode
    private var price = price

    fun showFormat() : String {
        val result =  when(locale){
            "", "nds", "bo_CN", "qu_EC", "ta_SG", "vo", "ha_NG", "lkt_US", "ji_001", "vo_001", "ji",
            "nds_DE", "mn", "ta_MY", "ta", "lag", "bo", "to", "qu", "pa_IN_#Guru", "brx",
            "ha", "bo_IN", "cu_RU", "brx_IN", "mg", "nds_NL", "mgo", "to_TO", "pa__#Guru", "ii_CN",
            "pa", "ha_GH", "ta_LK", "qu_PE", "kok_IN", "prg_001", "prg", "lag_TZ", "ur", "ur_PK",
            "mn_MN", "ii", "ta_IN", "lkt", "mg_MG", "cu", "en_IN", "kok"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_COMA_DOT.formatNumber(price.toDouble())

            "zu", "am_ET", "ti_ET", "en_NU", "zh_SG_#Hans", "en_MS", "en_GG", "en_JM", "mer", "en_ZM",
            "ml", "en_MT", "en_LR", "en_GH", "en_IL", "vai_LR_#Latn", "yo_NG", "en_PW", "fil_PH", "en_VC",
            "es_US", "en_KN", "ebu", "zh__#Hans", "es_GT", "so_KE", "kam_KE", "teo", "en_MO", "en_BZ",
            "es_DO", "en_NR", "nd", "en_MP", "en_GD", "en_BW", "en_AU", "en_CY", "kde_TZ", "ti_ER", "nus_SS",
            "nd_ZW", "en_IE", "zh_SG", "en_KI", "om_ET", "or_IN", "en_SZ", "zh", "es_PE", "saq", "en_GB",
            "zh_HK_#Hant", "es_PA", "om_KE", "en_AS", "zh_TW", "kln", "kw", "vai__#Latn", "en_JE", "en_CX",
            "luy_KE", "yue_CN_#Hans", "kn_IN", "en_SX", "ga", "en_TZ", "en_PR", "ko_KP", "sn", "rof", "en_BS",
            "gv", "gd_GB", "en_KE", "guz", "ja", "or", "te", "es_MX", "es_HN", "en_SS", "sw", "en_MG", "vai__#Vaii",
            "kn", "gu", "vun_TZ", "jmc_TZ", "en_TV", "en_PN", "en_MH", "zh__#Hant", "zh_HK_#Hans", "en_GY", "mas",
            "am", "en_NG", "ki_KE", "en_PK", "zh_CN", "en_LC", "gv_IM", "en_TT", "dav", "te_IN", "mt_MT",
            "mer_KE", "ko", "en_BM", "ak", "kde", "en_US", "gu_IN", "yue__#Hans", "en_NF", "bm", "en_GU", "en_AI", "cgg",
            "ms_MY", "en_TO", "cy", "en_PG", "en_ER", "zu_ZA", "en_PH", "zh_MO_#Hans", "en_DM", "en_CK", "ga_IE", "en_AG",
            "en_WS", "ebu_KE", "bem_ZM", "so", "en_NA", "ms", "nus", "sn_ZW", "ug", "hi", "en_SL", "teo_KE",
            "zh_MO_#Hant", "en_SH", "vai", "haw_US", "en_KY", "mt", "si_LK", "kam", "en_ZW", "ee", "en_UM", "en_TK",
            "vai_LR_#Vaii", "saq_KE", "chr", "ms_SG", "yue__#Hant", "es_BZ", "luy", "rof_TZ", "en_FM", "es_PR", "naq",
            "en_SG", "ee_GH", "kln_KE", "om", "hi_IN", "en_SD", "en_MY", "es_SV", "ml_IN", "fil", "en_FK", "yue_HK_#Hant",
            "en_GM", "en_DG", "ak_GH", "zh_CN_#Hans", "es_419", "si", "en_001", "en", "guz_KE", "zh_TW_#Hant", "kw_GB",
            "ug_CN", "es_BR", "zh_HK", "sw_KE", "en_SB", "th_TH", "chr_US", "nyn", "yue", "jmc", "en_MW", "naq_NA", "en_IO",
            "en_CC", "th", "dav_KE", "es_CU", "en_SC", "en_VI", "haw", "en_NZ", "mas_KE", "en_FJ", "en_BB", "so_SO", "bem",
            "en_MU", "en_IM", "en_LS", "en_HK", "en_GI", "en_CA", "gd", "sw_TZ", "so_ET", "cy_GB", "en_VG", "en_TC", "vun",
            "ki", "yo", "es_NI", "mas_TZ", "ti"
            ->  currencySymbols[currencyCode] + Formats.SYMBOL_COMA_DOT.formatNumber(price.toDouble())

            "mfe", "mfe_MU"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_BLANK_DOT.formatNumber(price.toDouble())

            "kkj", "sr_CS", "es_CO", "wo", "az", "az__#Cyrl", "mgh", "mgh_MZ", "az__#Latn", "pt", "en_AT", "nl_SR", "jgo",
            "nl_BQ", "en_NL", "fy_NL", "nnh", "nl_NL", "nl_CW", "rw", "nl_SX", "nl_AW", "qu_BO", "fur",
            "en_CH", "es_AR", "pt_BR", "fur_IT", "fy", "az_AZ_#Cyrl", "es_UY", "nl", "az_AZ_#Latn", "ms_BN"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_DOT_COMA.formatNumber(price.toDouble())

            "es_BO", "sw_CD", "tr_TR", "kl_GL", "kl", "mua", "in", "tr_CY", "lo", "es_VE", "tr", "es_EC", "lo_LA",
            "in_ID", "sg" ->  currencySymbols[currencyCode] + Formats.SYMBOL_DOT_COMA.formatNumber(price.toDouble())

            "os_GE", "nb_SJ", "no", "os", "nb_NO", "no_NO", "eo", "eo_001", "de_AT", "os_RU", "nb"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_BLANK_COMA.formatNumber(price.toDouble())

            "af", "en_ZA", "af_ZA", "es_CR", "af_NA"
            -> currencySymbols[currencyCode] + Formats.SYMBOL_BLANK_COMA.formatNumber(price.toDouble())

            "asa_TZ", "ce", "xog", "asa", "ce_RU", "ar_EH", "iw", "iw_IL"
            -> Formats.COMA_DOT_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "ksb", "luo", "rwk_TZ", "bez", "ksb_TZ", "sbp", "rwk", "lg", "luo_KE", "bez_TZ", "sbp_TZ",
            "ccp", "ccp_BD", "ccp_IN"
            -> Formats.COMA_DOT_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "khq", "ses", "twq", "dje"
            -> Formats.BLANK_DOT_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "hsb", "sr_ME", "dsb_DE", "el", "sr_ME_#Cyrl", "dsb", "it_VA", "es_PH", "es_ES", "bs_BA_#Latn", "hsb_DE",
            "en_150", "ro_RO", "lb_LU", "sr_ME_#Latn", "eu", "lb", "ln_CD", "ln", "gl", "sr__#Cyrl", "es", "fr_MA",
            "sl", "el_CY", "sr_BA_#Cyrl", "bs__#Cyrl", "sr__#Latn", "de_IT", "sr_RS", "bs__#Latn", "bs_BA_#Cyrl",
            "mk_MK", "sl_SI", "it_SM", "ast", "ca_FR", "sr_BA_#Latn", "sr_XK_#Cyrl", "de_BE", "ca_ES", "sr_BA", "de",
            "sr_XK_#Latn", "fr_LU", "es_EA", "ca_IT", "ca_AD", "vi", "de_LU", "de_DE", "en_DK", "it_IT", "ro", "en_SI",
            "ln_AO", "hr_HR", "it", "da_DK", "en_BE", "fo_DK", "fo_FO", "ast_ES", "fo", "hr", "is", "es_IC", "ca", "mk",
            "en_DE", "bs", "ro_MD", "eu_ES", "el_GR", "da_GL", "hr_BA", "ca_ES_VALENCIA", "sr", "sr_RS_#Cyrl", "da",
            "gl_ES", "nl_BE", "sr_RS_#Latn", "ar_DZ", "ar_MA", "ar_TN", "ar_LY"
            -> Formats.DOT_COMA_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "km", "seh", "seh_MZ", "rn", "km_KH", "lu_CD", "lu"
            -> Formats.DOT_COMA_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "nn", "kea", "fr_DZ", "lv", "sv_SE", "sah", "br", "sk", "sv", "cs", "tzm_MA", "smn", "tk_TM", "se_NO",
            "pl_PL", "pt_MO", "fr_PM", "fr_MG", "no_NO_NY", "sq_AL", "ru", "kk", "tk", "hy", "sv_FI", "ka", "fr_MF",
            "kk_KZ", "tt_RU", "fr_MC", "pt_MZ", "ksh", "ru_KZ", "et", "be", "dua", "pt_LU", "fr_BL", "hu_HU", "sq_MK",
            "fi", "uz", "et_EE", "nmg", "uz_UZ_#Latn", "fr_FR", "sah_RU", "ky", "sk_SK", "pt_CH", "fr_HT", "fr_BE",
            "kea_CV", "fr_YT", "fr_RE", "fi_FI", "fr_GP", "uk_UA", "tg", "hu", "fr_CH", "cs_CZ", "ru_MD", "ksf",
            "pt_TL", "sq", "fr", "tg_TJ", "ksh_DE", "ru_RU", "se_FI", "ff", "fr_CD", "fr_SC", "fr_CA", "sq_XK", "dyo",
            "yav", "lt_LT", "nn_NO", "fr_MU", "pl", "se_SE", "se", "be_BY", "pt_CV", "uk", "tt", "ru_BY", "tzm",
            "fr_MQ", "hy_AM", "pt_ST", "lt", "en_SE", "fr_GF", "pt_AO", "ru_KG", "fr_MR", "en_FI", "pt_PT", "bas",
            "ru_UA", "uz__#Latn", "smn_FI", "lv_LV", "ka_GE", "fr_SY", "ky_KG", "sv_AX", "ff_MR", "ewo", "br_FR"
            -> Formats.BLANK_COMA_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "fr_TN" -> Formats.BLANK_COMA_BLANK_SYMBOL_THREE.formatNumber(price.toDouble())  + " ${currencySymbols[currencyCode]}"

            "agq", "shi__#Tfng", "shi__#Latn", "kab_DZ", "shi", "zgh", "zgh_MA", "kab", "shi_MA_#Tfng",
            "shi_MA_#Latn" -> Formats.BLANK_COMA_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "ha_NE", "mgo_CM"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_COMA_WITHOUT_FRACTION.formatNumber(price.toDouble())

            "nnh_CM", "kkj_CM", "wo_SN", "jgo_CM", "es_PY", "rw_RW"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_DOT_WITHOUT_FRACTION.formatNumber(price.toDouble())

            "sw_UG", "en_RW", "ja_JP", "teo_UG", "ko_KR", "en_VU", "en_CM", "nyn_UG", "cgg_UG", "en_BI", "so_DJ",
            "ee_TG", "yo_BJ", "ja_JP_JP_#u-ca-japanese", "bm_ML", "en_UG"
            -> currencySymbols[currencyCode] + Formats.SYMBOL_COMA.formatNumber(price.toDouble())

            "es_CL", "es_GQ", "mua_CM", "sg_CF" -> currencySymbols[currencyCode] + Formats.SYMBOL_DOT.formatNumber(price.toDouble())

            "xog_UG" -> Formats.COMA_BLANK_SYMBOL_WITHOUT_FRACTION.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "lg_UG" -> Formats.COMA_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "ln_CF", "ln_CG", "vi_VN", "is_IS"
            -> Formats.DOT_BLANK_SYMBOL_WITHOUT_FRACTION.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "rn_BI" -> Formats.DOT_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "ses_ML", "dje_NE", "agq_CM", "twq_NE", "khq_ML"
            -> Formats.BLANK_BLANK_SYMBOL_WITHOUT_FRACTION.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "fr_ML", "bas_CM", "nmg_CM", "ksf_CM", "fr_VU", "fr_NE", "fr_NC",
            "fr_CM", "fr_SN", "ff_SN", "fr_BI", "dua_CM", "fr_PF", "pt_GQ", "fr_BJ", "dyo_SN", "fr_GQ",
            "ff_CM", "fr_CI", "fr_CG", "fr_BF", "fr_DJ", "fr_CF", "fr_TG", "fr_GN", "fr_TD", "ewo_CM", "pt_GW",
            "ff_GN", "fr_WF", "fr_KM", "yav_CM", "fr_GA", "fr_RW"
            -> Formats.BLANK_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "bg", "bg_BG" -> Formats.EMPTY_COMA_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "en_US_POSIX" -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_EMPTY_DOT.formatNumber(price.toDouble())

            "gsw_CH", "gsw", "gsw_FR", "rm", "rm_CH", "gsw_LI"
            -> Formats.QUOTE_DOT_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "de_CH", "it_CH", "de_LI" -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_QUOTE_DOT.formatNumber(price.toDouble())

            "wae_CH", "wae" -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_QUOTE_COMA.formatNumber(price.toDouble())

            "ar_SA", "ar_EG", "ar_SD", "ar_SY", "ar_YE", "ar_LB", "ar_AE", "ar_QA"
            -> Formats.ARABIC_TWO_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "ar_MR", "ar_IL", "ar_PS", "ar_SS", "sd", "ar_ER", "ar_SO", "ar", "ckb_IR", "ar_001", "ckb", "sd_PK"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_ARABIC_TWO.formatNumber(price.toDouble())

            "ig", "ig_NG" -> currencySymbols[currencyCode] + Formats.SYMBOL_ARABIC_TWO.formatNumber(price.toDouble())

            "ar_JO", "ar_OM", "ar_BH", "ar_IQ", "ckb_IQ", "ar_KW"
            -> Formats.ARABIC_THREE.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "ar_TD", "ar_KM", "ar_DJ" -> Formats.ARABIC_WITHOUT_FRACTION.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "fa_AF", "fa_IR", "ps", "uz_UZ_#Cyrl", "ps_AF", "pa_PK_#Arab", "uz_#Cyrl", "uz_AF_#Arab"
            -> Formats.PERSIAN_TWO_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "fa", "ur_IN", "lrc_IR", "lrc", "uz_#Arab", "ks_IN", "mzn", "mzn_IR", "ks", "pa_#Arab"
            -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_PERSIAN_TWO.formatNumber(price.toDouble())

            "lrc_IQ" -> Formats.PERSIAN_THREE_BLANK_SYMBOL.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "bn", "bn_BD", "bn_IN" -> Formats.BENGALI_SYMBOL.formatNumber(price.toDouble()) + currencySymbols[currencyCode]

            "as", "as_IN" -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_BENGALI.formatNumber(price.toDouble())

            "mr_IN", "mr" -> currencySymbols[currencyCode] + Formats.SYMBOL_NEPALI.formatNumber(price.toDouble())

            "ne_IN", "ne", "ne_NP" -> "${currencySymbols[currencyCode]} " + Formats.SYMBOL_BLANK_NEPALI.formatNumber(price.toDouble())

            "dz_BT", "dz" -> currencySymbols[currencyCode] + Formats.DZONGHKA.formatNumber(price.toDouble())

            "my", "my_MM" -> Formats.BURMESE.formatNumber(price.toDouble()) + " ${currencySymbols[currencyCode]}"

            "th_TH_TH_#u-nu-thai" -> currencySymbols[currencyCode] + Formats.THAI.formatNumber(price.toDouble())

            else -> ""
        }

        return if (price.toDouble() < 0)
            "-$result"
        else
            result
    }
}