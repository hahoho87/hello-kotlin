package com.hahoho87.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    var nameLength: Int = 0

    init {
        println("inside init block")
        nameLength = name.length
    }

    constructor(
        _email: String,
        _name: String,
        _age: Int
    ) : this(_name, _age) {
        email = _email
    }

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

    val person2 = Person(_email = "abc@email.com", "Hahoho87", 30)
    person2.action()
    println("Name: ${person2.name}, Age: ${person2.age} and the email is ${person2.email} and name length is ${person2.nameLength}")
}