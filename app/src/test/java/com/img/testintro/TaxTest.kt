package com.img.testintro

import org.junit.Assert.*
import org.junit.Test

class TaxTest {

    private val grossIncome = 11.0
    private val taxRAte = .23

    @Test
    fun calculateTaxTest() {
        val result = Tax().calculateTax(grossIncome, taxRAte)
        val expectedValue = grossIncome*taxRAte

        assertEquals(result, expectedValue, 0.0)
    }

    @Test
    fun calculateIncome() {
        val result = Tax().calculateIncome(grossIncome, taxRAte)
        val expectedValue = grossIncome - (grossIncome*taxRAte)

        assertEquals(result, expectedValue, 0.0)
    }
}