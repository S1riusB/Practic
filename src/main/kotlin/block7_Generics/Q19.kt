package block7_Generics

/*
    Q19: Define a generic class Box that can hold a single item of any type,
    with functions to add and retrieve the item.

 */

class Box<T> {
    private var item: T? = null
    fun add(newItem: T) {
        item = newItem
        println("'$item' is successfully added to the box")
    }

    fun retrieve(): T? = item
}


fun main() {
    val intBox = Box<Int>()
    intBox.add(7)
    println("Retrieved item: ${intBox.retrieve()}")

    val stringBox = Box<String>()
    stringBox.add("Hello")
    println("Retrieved item: ${stringBox.retrieve()}")
}