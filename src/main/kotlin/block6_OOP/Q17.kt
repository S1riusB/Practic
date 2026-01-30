package block6_OOP

/*
    Q17: Define an interface Drawable with a draw method, and create two classes,
    Circle and Square, that implement Drawable.
    Implement draw differently in each class.
 */

interface Drawable {
    fun draw()
}

class CircleDrawable(val radius: Double) : Drawable {
    override fun draw() {
        println("Drawing Circle with radius: $radius")
    }
}

class SquareDrawable(val size: Int) : Drawable {
    override fun draw() {
        println("Drawing Square with size: $size")
    }
}

fun main() {
    val shapes = listOf(CircleDrawable(6.5), SquareDrawable(4))
    shapes.forEach { it.draw()}
}