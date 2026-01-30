package org.example.block3_functions

/*
    Q9: Define an infix function plus that adds two Int values together.
 */


infix fun Int.plus(other: Int) = this + other

fun main() {
    val sum = 1 plus 4

    println("1 plus 4 is: $sum")
}