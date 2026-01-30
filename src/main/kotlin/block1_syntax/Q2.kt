package block1_syntax

/*
    Q2: Implement a function that takes a nullable string,
    returns its length if it’s not null, and returns -1 if it is null.
    Use Kotlin’s safe call operator.
 */

fun IsNull(text: String?): Int {
    return text?.length ?: -1
}

fun main() {
    println(IsNull(null))
    println(IsNull("Hello world!"))
    println(IsNull("Kotlin!"))
}