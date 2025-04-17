package com.dicoding.exam.exam3

fun <T> checkType(args: T): String {
    val check: String? = when (args) {
        is Int -> "Integer"
        is String -> "String"
        is Boolean -> "Boolean"
        is Double -> "Double"
        is List<*> -> "List"
        is Map<*, *> -> "Map"
        else -> null
    }
    return if (check==null) "No! it's not any type in defined list" else "Yes! it's $check"
}