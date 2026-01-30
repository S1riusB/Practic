package block14_AnnotationsAndReflection

import kotlin.reflect.full.memberProperties

/*
    Q35: Write a simple function that takes an object and prints all of its property names and values using reflection.
 */

fun getInfo(obj: Any) {
    val kClass = obj::class
    kClass.memberProperties.forEach { property ->
        println("${property.name} = ${property.getter.call(obj)}")
    }

}

data class Employee(val name: String, val access: Boolean)
data class Car(val name: String, val value: Int)

fun main() {
    val car = Car("Porsche 911", 120_000 )
    val manager = Employee("Roberto", true)

    getInfo(car)
    getInfo(manager)
}
