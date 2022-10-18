package com.hahoho87.interfaces

import com.hahoho87.classes.Course

interface CourseRepository {

    val isCoursePersisted: Boolean

    fun getById(id: Int): Course

    fun save(course: Course): Int {
        println("Saving course $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}

class SqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false
    override fun getById(id: Int): Course {
        return Course(id, "Kotlin", "hahoho")
    }

    override fun save(course: Course): Int {
        println("course in SqlCourseRepository : $course")
        isCoursePersisted = true
        return super.save(course)
    }
}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean
        get() = TODO("Not yet implemented")

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
    println("isCoursePersisted is ${sqlCourseRepository.isCoursePersisted}")
    println()

    val noSqlCourseRepository = NoSqlCourseRepository()
    val noSqlCourse = noSqlCourseRepository.getById(2)
    println("course id is ${noSqlCourse.id}, course name is ${noSqlCourse.name}, course author is ${noSqlCourse.author}")
    val noSqlId = noSqlCourseRepository.save(Course(6, "Kotlin", "hahoho"))
    println("course id is $noSqlId")
    println()

    val ab = AB()
    ab.doSomething()
}