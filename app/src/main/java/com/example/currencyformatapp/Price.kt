package com.example.currencyformatapp

import java.text.DecimalFormat

class Price(countryCode: String, currencyCode: String, languageCode:String, price: Int) {
    var langiageCode = languageCode
    var countryCode = countryCode
    var currencyCode = currencyCode
    var price = price

    fun showNumber(){
        val df : DecimalFormat = DecimalFormat("#,###")
        println(df.format(price))
    }
}