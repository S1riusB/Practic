package block8_Coroutines

/*
    Q20: Write a coroutine that fetches two mock API responses in parallel and combines the results.
    Use async and await to achieve this.

 */

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Fetching both API")

    val data1 = async { firstAPI() }
    val data2 = async { secondAPI() }

    val result = "${data1.await()} ${data2.await()}"
    println("Result: $result")
}

suspend fun firstAPI(): String {
    delay(1000)
    return "Hello"
}

suspend fun secondAPI(): String {
    delay(4000)
    return "World!"
}