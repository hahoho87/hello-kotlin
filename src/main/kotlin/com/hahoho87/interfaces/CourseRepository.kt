package com.hahoho87.interfaces

import com.hahoho87.classes.Course

interface CourseRepository {
    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Saving course $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id, "Kotlin", "hahoho")
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id, "Kotlin", "hahoho")
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepository : $course")
        return super.save(course)
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("course id is ${course.id}, course name is ${course.name}, course author is ${course.author}")
    val savedId = sqlCourseRepository.save(Course(5, "Kotlin", "hahoho"))
    println("course id is $savedId")


    val noSqlCourseRepository = NoSqlCourseRepository()
    val noSqlCourse = noSqlCourseRepository.getById(2)
    println("course id is ${noSqlCourse.id}, course name is ${noSqlCourse.name}, course author is ${noSqlCourse.author}")
    val noSqlId = noSqlCourseRepository.save(Course(6, "Kotlin", "hahoho"))
    println("course id is $noSqlId")
}