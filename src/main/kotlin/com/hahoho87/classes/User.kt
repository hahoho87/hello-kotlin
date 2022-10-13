package com.hahoho87.classes

open class User(val name: String){
    open var isLoggedIn: Boolean = false
    open fun login() {
        println("Inside user login")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false
    override fun login() {
        super.login()
        println("Inside student login")
    }
}

class Instructor(name: String): User(name)

fun main() {
    val student = Student("John")
    println("name is ${student.name}")
    student.login()

    val instructor = Instructor("Jane")
    println("name is ${instructor.name}")
    instructor.login()
}