package block3_functions

/*
    Q7: Write a higher-order function applyDiscount that takes a price and a discount function.
    The discount function should be a lambda that applies a discount percentage to the price.
 */

fun applyDiscount(price: Double, discount: (Double) -> Double): Double {
    return discount(price)
}

fun main() {
    val price = 350.0
    val discount = applyDiscount(price) { it * 0.75}

    println("Price: $price")
    println("Price with discount: $discount")
}