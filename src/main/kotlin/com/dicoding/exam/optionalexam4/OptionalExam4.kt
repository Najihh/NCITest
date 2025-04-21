package com.dicoding.exam.optionalexam4

fun getMiddleCharacters(string: String): String {
    val length = string.length
    if (length % 2 == 0) {
        val middleIndex = length / 2
        return string.substring(middleIndex - 1, middleIndex + 1)
    } else {
        val middleIndex = length / 2
        return string.substring(middleIndex, middleIndex + 1)
    }
}