package block8_Coroutines

/*
    Q21: Create a coroutine that launches three separate tasks,
    each printing a message after a delay. Use launch and delay
 */

import kotlinx.coroutines.*

fun main() = runBlocking {

    launch {
        delay(3000)
        println("Message 1")
    }

    launch {
        delay(2000)
        println("Message 2")
    }

    launch {
        delay(4000)
        println("Message 3")
    }
    println("Start..")
}