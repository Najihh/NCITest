package com.dicoding.exam.optionalexam2

fun minAndMax(number: Int): Int {
    val count = number.toString().length
    if (count < 2 || count > 9) return 0
    val digits = number.toString().toCharArray().map { it.toString().toInt() }
    val minDigit = digits.minOrNull() ?: 0
    val maxDigit = digits.maxOrNull() ?: 0
    return minDigit + maxDigit
}
