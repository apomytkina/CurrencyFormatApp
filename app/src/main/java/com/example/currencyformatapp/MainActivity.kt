package com.example.currencyformatapp

import android.os.Bundle
import android.os.LocaleList
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decForm : DecimalFormat = DecimalFormat()
        val dfs : DecimalFormatSymbols = DecimalFormatSymbols()


//        val formats = arrayOf(
//                DecimalFormat("# ###,##"), - 100 000 000,97
//                DecimalFormat("#,###.##"),
//                DecimalFormat("#,###.###"),
//                DecimalFormat("#.###,##"), - 100.000.000,97
//                DecimalFormat("# ###.##"), - 100 000 000.97
//                DecimalFormat("# ###"), - 100 000 000
//                DecimalFormat("#, ###.##"), - 100, 000, 000.87
//                DecimalFormat("#.###"),
//                DecimalFormat("#,###"),
//                DecimalFormat("#'###.##"),- 100'000'000.56
//                DecimalFormat("#,##,###.##"),
//                DecimalFormat("#,##")
//        );

//        val countriesFormats = mapOf(
//                "AFN" to formats[11],
//                "ALL" to formats[11],
//                "DZD" to formats[11],
//                "AOA" to formats[11],
//                "ARS" to formats[3],
//                "AMD" to formats[1],
//                "AWG" to formats[1],
//                "AUD" to formats[4],
//                "AZN" to formats[11],
//                "BSD" to formats[1],
//                "BHD" to formats[2],
//                "BDT" to formats[1],
//                "BBD" to formats[11],
//                "BYN" to formats[11],
//                "BYR" to formats[11],
//                "BZD" to formats[1],
//                "BMD" to formats[1],
//                "BTN" to formats[11],
//                "BOB" to formats[1],
//                "BAM" to formats[1],
//                "BWP" to formats[1],
//                "BRL" to formats[3],
//                "BND" to formats[1],
//                "BGN" to formats[11],
//                "BIF" to formats[11],
//                "KHR" to formats[11],
//                "CAD" to formats[1],
//                "CVE" to formats[11],
//                "KYD" to formats[1],
//                "XPF" to formats[11],
//                "CLP" to formats[7],
//                "CNY" to formats[1],
//                "COP" to formats[3],
//                "KMF" to formats[11],
//                "CRC" to formats[3],
//                "HRK" to formats[3],
//                "CUC" to formats[1],
//                "CUP" to formats[1],
//                "CYP" to formats[3],
//                "CZK" to formats[3],
//                "DKK" to formats[3],
//                "DJF" to formats[11],
//                "DOP" to formats[1],
//                "XCD" to formats[1],
//                "EGP" to formats[1],
//                "SVC" to formats[1],
//                "ERN" to formats[11],
//                "ETB" to formats[11],
//                "ATS" to formats[1],
//                "BEF" to formats[1],
//                "DEM" to formats[1],
//                "EEK" to formats[1],
//                "ESP" to formats[1],
//                "EUR" to formats[1],
//                "FIM" to formats[1],
//                "FRF" to formats[1],
//                "GRD" to formats[1],
//                "IEP" to formats[1],
//                "ITL" to formats[1],
//                "LUF" to formats[1],
//                "NLG" to formats[1],
//                "PTE" to formats[1],
//                "FKP" to formats[11],
//                "FJD" to formats[11],
//                "CDF" to formats[11],
//                "XAF" to formats[11],
//                "GMD" to formats[11],
//                "GEL" to formats[11],
//                "GHS" to formats[11],
//                "GHC" to formats[1],
//                "GIP" to formats[1],
//                "GTQ" to formats[1],
//                "GWP" to formats[11],
//                "GYD" to formats[11],
//                "HTG" to formats[11],
//                "HNL" to formats[1],
//                "HKD" to formats[1],
//                "HUF" to formats[7],
//                "ISK" to formats[7],
//                "INR" to formats[10],
//                "IDR" to formats[3],
//                "IRR" to formats[1],
//                "IQD" to formats[11],
//                "JMD" to formats[1],
//                "JPY" to formats[8],
//                "JOD" to formats[2],
//                "KZT" to formats[11],
//                "KES" to formats[1],
//                "KWD" to formats[2],
//                "KGS" to formats[11],
//                "LAK" to formats[11],
//                "LVL" to formats[1],
//                "LBP" to formats[5],
//                "LSL" to formats[11],
//                "LRD" to formats[11],
//                "LYD" to formats[11],
//                "LTL" to formats[0],
//                "MOP" to formats[11],
//                "MKD" to formats[1],
//                "MGA" to formats[11],
//                "MWK" to formats[11],
//                "MYR" to formats[1],
//                "MVR" to formats[11],
//                "MTL" to formats[1],
//                "MRO" to formats[11],
//                "MUR" to formats[8],
//                "MXN" to formats[1],
//                "MDL" to formats[11],
//                "MNT" to formats[11],
//                "MAD" to formats[11],
//                "MZM" to formats[3],
//                "MZN" to formats[11],
//                "MMK" to formats[11],
//                "NAD" to formats[11],
//                "NPR" to formats[1],
//                "ANG" to formats[3],
//                "ILS" to formats[1],
//                "TWD" to formats[11],
//                "TRY" to formats[1],
//                "NZD" to formats[1],
//                "NIO" to formats[11],
//                "NGN" to formats[11],
//                "KPW" to formats[11],
//                "NOK" to formats[3],
//                "PKR" to formats[1],
//                "PAB" to formats[11],
//                "PGK" to formats[11],
//                "PYG" to formats[11],
//                "PEN" to formats[1],
//                "UYU" to formats[3],
//                "PHP" to formats[1],
//                "PLN" to formats[0],
//                "GBP" to formats[1],
//                "QAR" to formats[11],
//                "OMR" to formats[2],
//                "RON" to formats[3],
//                "ROL" to formats[3],
//                "RUB" to formats[3],
//                "RWF" to formats[11],
//                "SAC" to formats[11],
//                "SHP" to formats[11],
//                "WST" to formats[11],
//                "STN" to formats[11],
//                "SAR" to formats[1],
//                "RSD" to formats[11],
//                "SCR" to formats[11],
//                "SLL" to formats[11],
//                "SGD" to formats[1],
//                "SKK" to formats[0],
//                "SIT" to formats[3],
//                "SBD" to formats[11],
//                "SOS" to formats[11],
//                "ZAR" to formats[4],
//                "KRW" to formats[8],
//                "LKR" to formats[11],
//                "SDD" to formats[11],
//                "SRD" to formats[11],
//                "SZL" to formats[6],
//                "SEK" to formats[0],
//                "CHF" to formats[9],
//                "SYP" to formats[11],
//                "TJS" to formats[11],
//                "TZS" to formats[1],
//                "THB" to formats[1],
//                "TOP" to formats[1],
//                "TTD" to formats[11],
//                "TND" to formats[11],
//                "TMM" to formats[11],
//                "TMT" to formats[11],
//                "AED" to formats[1],
//                "UGX" to formats[11],
//                "UAH" to formats[0],
//                "CLF" to formats[11],
//                "USD" to formats[1],
//                "UZS" to formats[11],
//                "VUV" to formats[8],
//                "VES" to formats[3],
//                "VND" to formats[7],
//                "YER" to formats[11],
//                "ZMK" to formats[11],
//                "ZMW" to formats[11],
//                "ZWD" to formats[4]
//        )

        val currencySymbols = mapOf(
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
                "USD" to "\$",
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

        val countryCodeSpinner: Spinner = findViewById(R.id.countryCodeSpinner)
        val currencyCodeSpinner: Spinner = findViewById(R.id.currencyCodeSpinner)
        val languageCodeSpinner: Spinner = findViewById(R.id.languageCodeSpinner)

        val priceEditText: EditText = findViewById(R.id.priceEditText)
        val showFormatButton: Button = findViewById(R.id.showFormatButton)
        val currencyFormatTextView: TextView = findViewById(R.id.currencyFormatTextView)

        ArrayAdapter.createFromResource(
                this,
                R.array.countryCodes,
                android.R.layout.simple_spinner_item
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            countryCodeSpinner.adapter = adapter
        }

        ArrayAdapter.createFromResource(
                this,
                R.array.currencyCodes,
                android.R.layout.simple_spinner_item
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            currencyCodeSpinner.adapter = adapter
        }

        ArrayAdapter.createFromResource(
                this,
                R.array.languageCodes,
                android.R.layout.simple_spinner_item
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            languageCodeSpinner.adapter = adapter
        }

        showFormatButton.setOnClickListener{
            val price = Price(
                    countryCodeSpinner.selectedItem.toString(),
                    currencyCodeSpinner.selectedItem.toString(),
                    languageCodeSpinner.selectedItem.toString(),
                    priceEditText.text.toString()
            )

            val nf = NumberFormat.getCurrencyInstance(Locale(languageCodeSpinner.selectedItem.toString(), countryCodeSpinner.selectedItem.toString()))
            //val df = DecimalFormat("#, ###.##")

            currencyFormatTextView.setText(
                    "${nf.format(priceEditText.text.toString().toDoubleOrNull())}"
            )
//            currencyFormatTextView.setText(
//                    "${countryCodeSpinner.selectedItem.toString()} " +
//                    "${currencyCodeSpinner.selectedItem.toString()} " +
//                            "${currencySymbols[currencyCodeSpinner.selectedItem.toString()]}" +
//                    "${df.format(priceEditText.text.toString().toInt())}" /*+
//                            "${countriesFormats[currencyCodeSpinner.selectedItem.toString()]?.format(priceEditText.text.toString().toInt())}"*/
//             )
        }
    }
}