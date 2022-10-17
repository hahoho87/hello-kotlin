package com.hahoho87.classes

object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("User Authenticate for userName : $userName")
    }
}

fun main() {
    Authenticate.authenticate("hahoho", "1234")
}