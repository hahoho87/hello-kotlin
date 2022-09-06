package com.hahoho87.basics


fun main() {
//    loops()
    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    // execute the body at least once
    do {
        println("i is $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("x is $x")
        x++
    }
}

fun loops() {
    val range = 1..10
    for (i in range) {
        println(i)
    }

    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println(i)
    }

    for (i in reverseRange step 2) {
        println("with skip : $i")
    }
}