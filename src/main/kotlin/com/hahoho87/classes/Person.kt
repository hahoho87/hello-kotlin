package com.hahoho87.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {
    fun action() {
       println("Person walks")
    }
}

fun main() {
    val person = Person()
    person.action()
    println("Name: ${person.name}, Age: ${person.age}")

    val person1 = Person("Hahoho87", 30)
    person1.action()
    println("Name: ${person1.name}, Age: ${person1.age}")
}