package block10_AdvancedFeatures

import java.lang.Thread.sleep

/*
    Q26: Use Kotlin’s inline modifier to define an inline higher-order function that takes a lambda and returns the execution time.

 */

inline fun executionTime(program: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    program()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}

fun main() {
    println("Start..")
    val time = executionTime {
        sleep(5000)
        println("Done!")
    }
    println("Execution time: $time")
}