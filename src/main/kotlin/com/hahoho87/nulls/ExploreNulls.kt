package com.hahoho87.nulls

data class Movie(
    val id: Int?,
    val title: String
)

fun printName(name: String) {
    println("Name is $name")
}

fun main() {
    var nameNullable: String? = null

    nameNullable?.run {
        printName(this)
    }

    // java style
    /* if (nameNullable != null) {
        println("value is ${nameNullable.length}")
    } */
    println("value is ${nameNullable?.length}") // safe operator, ?
//    nameNullable = "hehehe"
    val length = nameNullable?.length?.toLong() ?: 0 // elvis operator (set default value if null), ?:
    println("the length is $length")

    nameNullable = "hahoho"
    println("value is $nameNullable")

    var name: String = "hahoho"
    println("value is $name")
//    name = null

    val movie = Movie(null, "hahoho")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // non null assertion operator, !!
    println("savedMovie is $savedMovie")

}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
//    return movie;
}
