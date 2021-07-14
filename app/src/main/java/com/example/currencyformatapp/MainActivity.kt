package com.example.currencyformatapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currencyCodeSpinner: Spinner = findViewById(R.id.currencyCodeSpinner)
        val localeSpinner: Spinner = findViewById(R.id.localeSpinner)

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
        }
    }
}