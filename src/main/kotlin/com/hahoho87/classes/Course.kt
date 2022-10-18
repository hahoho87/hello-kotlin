package com.hahoho87.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1, "Kotlin", "Hahoho87")
    println("course id is ${course.id}, course name is ${course.name}, course author is ${course.author}")

    val course1 = Course(1, "Kotlin", "Hahoho87")
    println(course == course1)

    val course2 = course.copy(name = "Kotlin for Android")
    println("course id is ${course2.id}, course name is ${course2.name}, course author is ${course2.author}")
}

