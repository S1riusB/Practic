package block1_syntax
/*
    Q1: Write a Kotlin function to check if a given integer is a prime number.
    Use a when expression for decision-making.
 */

fun IsPrime(number: Int): Boolean {
    return when {

        number <=1 -> false
        number <=3 -> true
        number % 2 == 0 || number % 3 == 0 -> false
        else -> {
            var i = 5
            while (i * i <= number) {
                if (number % i == 0 || number % (i + 2) == 0)
                    return false
                i += 6
            }
            true
        }

    }
}

fun main() {
    val numbers = listOf(-5, 0, 1, 2, 3, 4, 5, 7, 9, 13, 15, 25, 49, 97, 121, 169, 199)
    println("Prime numbers: ${numbers.filter(::IsPrime)}")
}