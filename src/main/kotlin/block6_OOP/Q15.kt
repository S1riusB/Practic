package block6_OOP

/*
    Q15: Create an abstract class Shape with an abstract method area
    and two subclasses Circle and Rectangle that implement area.
    Test the classes by creating instances.
 */


abstract class Shape() {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = 3.14 * radius * radius
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double = width * height
}

fun main() {
    val circle = Circle(4.0)
    val rectangle = Rectangle(6.0, 3.0)

    println("Area of circle is: ${circle.area()}")
    println("Area of rectangle is: ${rectangle.area()}")
}