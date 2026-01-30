package block9_Delegation


/*
    Q24: Use the by lazy delegate to initialize a property only when it’s accessed for the first time.

 */

class StartEngine {
    val status: String by lazy {
        println("Starting engine...")
        "Engine is working.."
    }
}

fun main() {
    val engine = StartEngine()

    println("Status: ${engine.status}")

    println("\nStatus: ${engine.status}")
}