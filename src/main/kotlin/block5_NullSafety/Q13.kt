package block5_NullSafety

/*
    Q13: Write a function that accepts a nullable List<Int>?
    and returns the sum of its elements, handling nulls safely without using !!
 */

fun sumList(numbers: List<Int>?) = numbers?.sum() ?: 0

fun main() {
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val nullList: List<Int>? = null

    println("List of numbers: $numbersList")
    println("Sum of elements of numbersList: ${sumList(numbersList)}")
    println("Null list: ${sumList(nullList)}")
}