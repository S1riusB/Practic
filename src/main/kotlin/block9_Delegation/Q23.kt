package block9_Delegation

/*
    Q23: Create a class Car that delegates its drive method to another Driver class using Kotlin’s delegation pattern.
 */

interface Drivable {
    fun drive()
}

class Driver : Drivable {
    override fun drive() = println("Driver is driving..")
}

class Car(driver: Drivable) : Drivable by driver


fun main() {
    val maxVerstappen = Driver()
    val porsche911 = Car(maxVerstappen)

    porsche911.drive()
}