package block2_ControlFlow

/*
    Q5: Use a for loop to create a sequence of the first 10 Fibonacci numbers.
 */

fun main() {
    var firstNumber = 0
    var secondNumber = 1

    println("First 10 Fibonacci:")
    for (i in 1..10) {
        println("$i. is $firstNumber ")
        val temp = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = temp
    }
}