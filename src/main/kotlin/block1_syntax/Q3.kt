package block1_syntax

/*
    Q3: Create a simple class Person with properties name and age,
    then create an instance and print its properties using string interpolation.
 */

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Stas", 20)
    println("My name ${person.name}, I`m ${person.age} years old!")
}