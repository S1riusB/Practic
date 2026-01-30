package block8_Coroutines

import kotlinx.coroutines.*

/*
    Q22: Write a coroutine that simulates a long-running task but allows the user to cancel it by using a Job.
 */

fun main() = runBlocking {

    val job: Job = launch {
        try {
            repeat(200) { i ->
                delay(1000)
                print("Working.. ")
            }

        } catch (e: CancellationException) {
            println("Program was cancelled.")
        }
    }


    delay(10000)
    println("\nCancelling...")
    job.cancelAndJoin()
    println("Done!")
}