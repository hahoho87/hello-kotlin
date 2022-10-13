package com.hahoho87.classes

open class User(val name: String){
    fun login() {
        print("Inside usr login")
    }
}

class Student(name: String): User(name)

class Instructor(name: String): User(name)

fun main() {
    val student = Student("John")
    println("name is ${student.name}")
    student.login()

    val instructor = Instructor("Jane")
    println("name is ${instructor.name}")
    instructor.login()
}