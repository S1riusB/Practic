package block4_Collections

/*
    Q11: Write a program that takes a list of strings and returns a list of lengths of each string using map.
 */

fun stringLengths(text: List<String>) = text.map { it.length }

fun main() {
    val text = listOf("Hello", "World!", "Kotlin", "Stas", "Collections")
    println("Strings: $text")
    println("Lengths of each string: ${stringLengths(text)}")
}