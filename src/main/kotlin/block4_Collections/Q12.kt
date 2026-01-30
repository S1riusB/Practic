package block4_Collections

/*
    Q12: Use filter and sortedByDescending to get a sorted list of only the odd numbers from a list of integers.
 */

fun oddSort(numbers: List<Int>) = numbers.filter { it % 2 != 0 }.sortedByDescending { it}


fun main() {
    val numbers = listOf(1, 3, 3, 8, 5, 13, 7, 16, 9, 10)
    println("List of integers: $numbers")
    println("Sorted list of odd numbers: ${oddSort(numbers)}")
}
