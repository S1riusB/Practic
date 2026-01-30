package block13_ConcurrencyWithCoroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
    Q33: Write a function to run multiple coroutines simultaneously using coroutineScope,
    collecting the results as they finish.
 */

suspend fun doTask(name: String, time: Long): String {
    delay(time)
    return "$name is done for $time ms"
}

suspend fun startTasks(): List<String> = coroutineScope {
    val tasks = listOf (
        async { doTask("First", 2500) },
        async { doTask("Second", 1000) },
        async { doTask("Third", 4000) }
    )

    tasks.awaitAll()
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val results = startTasks()
        println("Results: $results")
    }

    println("Time taken: $time ms")
}