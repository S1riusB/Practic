package block6_OOP

/*
    Q16: Create a data class Book with properties title, author, and price.
    Then, create a list of Book objects and filter the list for books with a price less than 20.

 */

data class Book(val title: String, val author: String, val price: Double)

fun main() {
    val books = listOf(
        Book("The Picture of Dorian Gray", "Oscar Wilde", 35.0),
        Book("The Adventures of Tom Sawyer", "Mark Twain", 15.0),
        Book("Metro 2033", "Dmitry Glukhovsky", 20.0),
        Book("The Mist", "Stephen King", 10.0)
    )

    val lowPrices = books.filter { it.price < 20.0 }

    println("All books:")
    books.forEach { println(it)}
    println("\nBooks cheaper than 20$:")
    lowPrices.forEach { println(it)}
}