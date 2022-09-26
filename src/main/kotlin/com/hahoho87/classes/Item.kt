package com.hahoho87.classes

class Item() {
    var name: String = ""

    constructor(_name: String) : this() {
        this.name = _name
    }
}

fun main() {
    val item = Item("item1")
    println(item.name)
}