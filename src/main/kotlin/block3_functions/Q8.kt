package block3_functions

/*
    Q8: Create an extension function isPalindrome for the String class that returns true if the string is a palindrome, ignoring case.
 */

fun String.isPalindrome(): Boolean {
    val text = this.lowercase()
    return text.reversed() == text
}

fun main() {
    val text = listOf("ABOBA", "Robert", "Toot", "moM", "0101", "Dad")
    for (i in text) {
        println("$i is a Palindrome: ${i.isPalindrome()}")
    }
}