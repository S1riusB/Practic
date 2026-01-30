package block11_FunctionalProgramming

/*
    Q28: Use fold to compute the product of all elements in a list
 */

fun computeProd(numbers: List<Int>) = numbers.fold(1) { acc, number -> acc * number }

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    println("List: $numbers")
    println("Product of all elements is: ${computeProd(numbers)}")
}