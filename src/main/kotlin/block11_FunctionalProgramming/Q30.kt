package block11_FunctionalProgramming

/*
    Q30: Implement a custom function similar to filter that takes a predicate
    and returns a new list containing only elements that match the predicate
 */

fun <T> List<T>.customFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    this.forEach { if (predicate(it)) result.add(it) }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val text = listOf("Hello", "World", "Stas", "Kotlin", "List")

    val filteredNumbers = numbers.customFilter { it % 3 == 0 }
    val filteredText = text.customFilter { it.length > 4 }

    println("List of numbers: $numbers")
    println("List of numbers multiples of 3: $filteredNumbers")

    println("List of words: $text")
    println("List of words longer than 4: $filteredText")

}