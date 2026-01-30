package block4_Collections

/*
    Q10: Given a list of integers, write a function to find the maximum and minimum values using Kotlin’s standard library functions.

 */

fun minMax(numbers: List<Int>) {
    val min = numbers.min()
    val max = numbers.max()

    println("Minimum value is: $min \nMaximum value is: $max ")
}


fun main() {
    val numbers = listOf(15, 2, 13, 4, 5, 11, 7, 5, 9, 10)

    println("List of integers: $numbers")
    print(minMax(numbers))
}