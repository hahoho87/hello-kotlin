package com.hahoho87.basics

import functions.courseName
import functions.topLevelFunction

fun main() {
    val name: String = "hahoho"
    println(name)
    // name = "hahoho87"

    var age: Int = 20
    age = 32

    val num = topLevelFunction()
    println(num)
    println("courseName is $courseName")
}
