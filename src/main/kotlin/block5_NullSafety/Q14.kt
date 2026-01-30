package block5_NullSafety

/*
    Q14: Implement a function that takes a nullable String?
    and prints “Empty” if it’s null or blank, or prints the string itself otherwise.
 */

fun checkString(text: String?) {
    if (text.isNullOrBlank()) {
        println("String is 'Empty'")
    } else {
        println("String is '${text}'")
    }
}


fun main() {
    val text = "Stas"
    val nullText: String? = null
    val blankText = ""

    checkString(text)
    checkString(nullText)
    checkString(blankText)
}