package com.dicoding.exam.optionalexam1

fun sumOfBigThree(vararg numbers: Int): Int {
    if (numbers.size < 3) return 0
    val sortedNumbers = numbers.sortedDescending()
    return sortedNumbers[0] + sortedNumbers[1] + sortedNumbers[2]
}
