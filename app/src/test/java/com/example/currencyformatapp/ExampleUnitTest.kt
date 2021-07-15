package com.example.currencyformatapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    /**
     * Check is integer separator is implemented correctly
     */
    @Test
    fun integerSeparation_isCorrect(){
        assertEquals("€10,000,005,247.24", Price("en_CY", "EUR", 10000005247.23796.toString()).showFormat())
        assertEquals("\$9 000 032 057,24", Price("af_NA", "USD", 9000032057.23796.toString()).showFormat())
        assertEquals("Rs ٦٤٬٥٤٢٬٣٠٣٫٢٤", Price("sd_PK", "LKR", 64542303.23796.toString()).showFormat())
    }

    /**
     * Check is fraction separator is implemented correctly
     */
    @Test
    fun fraction_isCorrect(){
        assertEquals("฿๖๕๓,๔๘๒.๐๐", Price("th_TH_TH_#u-nu-thai", "THB", 653482.toString()).showFormat())
        assertEquals("Nu.༨,༥༢༩.༦༠", Price("dz_BT", "BTN", 8529.6.toString()).showFormat())
        assertEquals("€ 243,43", Price("de_AT", "EUR", 243.43267.toString()).showFormat())
    }

    /**
     * Check if minus is written before currency sign
     */
    @Test
    fun negative_isCorrect(){
        assertEquals("-\$ 48216.68", Price("en_US_POSIX", "USD", (-48216.67786).toString()).showFormat())
        assertEquals("-62 347,00 руб.", Price("ru_RU", "RUB", (-62347).toString()).showFormat())
    }

    /**
     * Check if rounding is correct
     * HALF_UP rounding mode is used
     */
    @Test
    fun rounding_isCorrect(){
        assertEquals("23’785.35 €", Price("gsw_FR", "EUR", (23785.34555).toString()).showFormat())
        assertEquals("-Fr4,436", Price("en_CM", "XOF", (-4435.7574).toString()).showFormat())
    }

    /**
     * Check if appropriate numerals is used
     */
    @Test
    fun numerals_isCorrect(){
        assertEquals("742.656,00 дин.", Price("sr_RS", "RSD", 742656.toString()).showFormat())
        assertEquals("₹९०,६५४.३४", Price("mr_IN", "INR",  90654.3423.toString()).showFormat())
        assertEquals("৯০,৬৫৪.৩৪৳", Price("bn_BD", "BDT", 90654.3423.toString()).showFormat())
        assertEquals("၆၇,၃၂၁.၂၅ K", Price("my_MM", "PGK",  67321.246.toString()).showFormat())
        assertEquals("۶۷٬۳۲۱٫۲۵", Price("fa_AF", "-", 67321.246.toString()).showFormat())
    }
}