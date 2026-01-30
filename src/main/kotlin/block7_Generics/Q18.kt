package block7_Generics

/*
    Q18: Create a generic function printList that takes a list of any type and prints each item.
    Ensure type safety using generics.
 */

fun <T> printList(list: List<T>) {
    for(i in list) {
        println("List: $i")
    }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val text = listOf("Stas", "Kotlin", "World", "Hello")
    println("Numbers:")
    printList(numbers)
    println("String:")
    printList(text)
}