package block2_ControlFlow

/*
    Q6: Write a when expression that takes an integer and prints “Even” if it’s even and “Odd” if it’s odd.
 */

fun checkNumber(number: Int): String {
    return when {
        number % 2 == 0 -> "Even"
        else -> "Odd"
    }

}


fun main() {
    val numbers = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in numbers) {
        println("$i is ${checkNumber(i)}")
    }
}