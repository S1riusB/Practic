package block2_ControlFlow

/*
    Q4: Write a program that calculates the factorial of a given number using recursion.
*/

fun factorial(number: Int): Int {
    if (number <0) throw IllegalArgumentException("Number should be greater than zero!")
    return if (number <= 1)
        1
    else number * factorial(number - 1)
}

fun main() {
    val numbers = listOf(-4, 0, 1, 2, 3, 4, 5)
    for (i in numbers) {
        try {
            println("Factorial of $i: ${factorial(i)}")
        } catch (e: Exception) {
            println("Factorial of $i: ${e.message}")
        }
    }
}