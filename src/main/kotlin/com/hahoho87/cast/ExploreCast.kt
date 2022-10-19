package com.hahoho87.cast

import com.hahoho87.classes.Course

fun castNumber(any: Any) {
    when (any) {
        any as? Double -> println("Value is Double")
        any as? Int -> println("Value is Int")
    }
}

fun main() {
    val course = Course(1, "Kotlin", "Hahoho")
    val test = "test"
    checkType(course)
    checkType(test)

    castNumber(1.0)
    castNumber(1) // ClassCastException

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)

    castNumber(numberDouble)

}

fun checkType(type: Any) {
    when (type) {
        is Course -> println(type)
        is String -> println(type.lowercase())
    }
}
