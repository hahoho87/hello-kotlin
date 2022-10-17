package com.hahoho87.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    open fun login() {
        println("Inside user login")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false

    companion object {
        const val numberOfEnroll = 10
        fun country() = "Korea"
    }

    override fun login() {
        super.login()
        println("Inside student login")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("John")
    println("name is ${student.name}")
    student.login()
    val country = Student.country()
    println("Country is $country")
    println("NumberOfEnrollment is : ${Student.numberOfEnroll}")

    val instructor = Instructor("Jane")
    println("name is ${instructor.name}")
    instructor.login()
}