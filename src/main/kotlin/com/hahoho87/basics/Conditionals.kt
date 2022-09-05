package com.hahoho87.basics

fun main() {
    // if-else
    var name = "hahoho"
    if (name.length == 6) {
        println("length of name is 6")
        name
    } else {
        println("length of name is not 6")
        name
    }
    println("length of name $name is ${name.length}")

    var rank = 1
    val result = if (rank == 1) {
        "Gold"
    } else if (rank == 2) {
        "Silver"
    } else if (rank == 3) {
        "Bronze"
    } else {
        "No Medal"
    }
    println(result)

    // when
    rank = 2
    val medal = when (rank) {
        1 -> "Gold"
        2 -> "Silver"
        3 -> "Bronze"
        else -> "No Medal"
    }

    println(medal)


}