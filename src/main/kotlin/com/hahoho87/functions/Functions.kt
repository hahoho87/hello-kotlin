package com.hahoho87.functions

fun main() {
    printName("hahoho")

    val result = addition(1, 2)
    println("Result is $result")

    val resultApproach = addition_approach(1, 2)
    println("Result_Approach is $resultApproach")


}

fun addition(first: Int, second: Int): Int {
    return first + second
}

fun addition_approach(x: Int, y: Int): Int = x + y


fun printName(name: String) {
    println(name)
}
