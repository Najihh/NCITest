package com.dicoding.exam.exam2

fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val checkC = valueC ?: 50
    return valueA + valueB - checkC
}

fun result(result: Int): String {
    return "Result is $result"
}