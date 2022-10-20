package com.hahoho87.collections

fun main() {
    val names = listOf("Alex", "Ben", "Anna")
    println("Names: $names")
    val mutableNames = mutableListOf("Alex", "Ben", "Anna")
    println("Names: $mutableNames")
    mutableNames.add("Hahoho")
    println("Mutable Names: $mutableNames")
    println()

    val namesSet = setOf("Alex", "Ben", "Anna")
    println("Name Set: $namesSet")
    val mutableNameSet = mutableSetOf("Alex", "Ben", "Anna")
    println("Name Mutable Set: $mutableNameSet")
    mutableNameSet.add("Hahoho")
    mutableNameSet.add("Alex")
    println("Name Mutable Set: $mutableNameSet")
    println()

    val nameMap = mapOf("Alex" to 11, "Ben" to 21, "Anna" to 31)
    println("Name Map: $nameMap")
    val nameMutableMap = mutableMapOf("Alex" to 11, "Ben" to 21, "Anna" to 31)
    println("Name Mutable Map: $nameMutableMap")
    nameMutableMap["Hahoho"] = 33
    println("Name Mutable Map: $nameMutableMap")
}
