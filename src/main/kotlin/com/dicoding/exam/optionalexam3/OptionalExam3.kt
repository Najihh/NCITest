package com.dicoding.exam.optionalexam3

fun manipulateString(str: String, int: Int): String {
    val string = str.filter { it.isLetter() }
    val digits = str.filter { it.isDigit() }
    val result = if (digits.isNotEmpty()) {
        val digit = digits.toInt()
        if (int < 1 || int > 100) return digits
        val multiplication = digit * int
        multiplication.toString()
    } else {
        int.toString()
    }
    return string + result
}
