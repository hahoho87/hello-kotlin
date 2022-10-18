package com.hahoho87.nulls

data class Movie(
    val id: Int?,
    val title: String
)

fun main() {
    var nameNullable: String? = null
    println("value is $nameNullable")

    nameNullable = "hahoho"
    println("value is $nameNullable")

    var name: String = "hahoho"
    println("value is $name")
//    name = null

    val movie = Movie(null, "hahoho")
    val savedMovie = saveMovie(movie)
    println("savedMovie is $savedMovie")

}

fun saveMovie(movie: Movie) : Movie {
    return movie.copy(id = 1)
}
