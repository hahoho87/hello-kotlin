package com.hahoho87.classes

class Item() {
    var name: String = ""
    var price: Double = 0.0

    get() {
        println("Inside Getter")
        return field
    }
    set(value) {
        if (value >= 0.0) {
            println("Inside Setter")
            field = value
        } else {
            throw IllegalArgumentException("Negative Price is not Allowed")
        }
    }

    constructor(_name: String) : this() {
        this.name = _name
    }
}

fun main() {
    val item = Item("item1")
    println(item.name)
    item.price = 10.0
    println(item.price)
    item.price = -10.0
}