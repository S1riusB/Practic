package block10_AdvancedFeatures

/*
    Q27: Write a function that takes a vararg of integers and returns their sum.
 */

fun sumNumbers(vararg numbers: Int) = numbers.sum()

fun main() {
    println("Sum of numbers 1..5 is: ${sumNumbers(1, 2, 3, 4, 5)}")
    println("Sum of numbers 44 & 88 is: ${sumNumbers(44, 88)}")
}