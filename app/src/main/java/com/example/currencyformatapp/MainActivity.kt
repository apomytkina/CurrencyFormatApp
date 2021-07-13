package com.example.currencyformatapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        //val countryCodeSpinner: Spinner = findViewById(R.id.countryCodeSpinner)
        val currencyCodeSpinner: Spinner = findViewById(R.id.currencyCodeSpinner)
        val localeSpinner: Spinner = findViewById(R.id.localeSpinner)
        //val languageCodeSpinner: Spinner = findViewById(R.id.languageCodeSpinner)

        val priceEditText: EditText = findViewById(R.id.priceEditText)
        val showFormatButton: Button = findViewById(R.id.showFormatButton)
        val currencyFormatTextView: TextView = findViewById(R.id.currencyFormatTextView)

//        ArrayAdapter.createFromResource(
//                this,
//                R.array.countryCodes,
//                android.R.layout.simple_spinner_item
//        ).also {adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
//            countryCodeSpinner.adapter = adapter
//        }

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
                R.array.locales,
                android.R.layout.simple_spinner_item
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            localeSpinner.adapter = adapter
        }

//        ArrayAdapter.createFromResource(
//                this,
//                R.array.languageCodes,
//                android.R.layout.simple_spinner_item
//        ).also {adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            languageCodeSpinner.adapter = adapter
//        }

        showFormatButton.setOnClickListener{
            currencyFormatTextView.text = Price(
                    localeSpinner.selectedItem.toString(),
                    currencyCodeSpinner.selectedItem.toString(),
                    priceEditText.text.toString()
            ).showFormat()
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