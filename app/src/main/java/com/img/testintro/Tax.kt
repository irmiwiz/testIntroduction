package com.img.testintro

class Tax {
    fun calculateTax(grossIncome: Double, taxRate: Double) = grossIncome * taxRate
    fun calculateIncome(grossIncome: Double, taxRate: Double) =
        grossIncome - calculateTax(grossIncome, taxRate)
}