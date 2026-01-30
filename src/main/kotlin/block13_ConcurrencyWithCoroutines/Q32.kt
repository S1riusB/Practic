package block13_ConcurrencyWithCoroutines

import kotlinx.coroutines.*
import java.io.IOException

/*
    Q32: Implement a suspend function that fetches data and handles retry logic in case of failure.
    Retry up to 3 times with a delay between attempts
 */

suspend fun <T> retry(times: Int, millis: Long, block: suspend () -> T): T {
    repeat(times - 1) {
        try {
            return block()
        } catch (e: Exception) {
            println("Error message: ${e.message} retrying.. ")
            delay(millis)
        }
    }
    return block()
}
var attempts = 0
suspend fun network(): String {
    attempts += 1
    if (attempts < 3) throw IOException("Error 404!")
    return "Successful!"

}

fun main() = runBlocking {
    val result = retry(3, 5000) {
        network()
    }
    println("Result is: $result")
}