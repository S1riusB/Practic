package block11_FunctionalProgramming

/*
    Q29: Use flatMap to create a list of all words from a list of sentences
 */

fun main() {
    val text = listOf(
        "Hello World!",
        "My name is Stas",
        "List of all words"
    )

    val wordsList = text.flatMap { it.split(" ") }

    println("Old list: $text")
    println("New list: $wordsList")
}