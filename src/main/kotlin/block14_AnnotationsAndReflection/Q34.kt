package block14_AnnotationsAndReflection

import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/*
    Q34: Create a custom annotation @ and use reflection to list all properties of a class that have this annotation.
 */

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)

annotation class Serializable

data class Person(
    @Serializable val name: String,
    @Serializable val age: Int,
    val password: String,
    val telephone: String
)

fun main() {
    val person = Person(
        name = "Stas",
        age = 20,
        password = "TopSecret",
        telephone = "+38(095-***-**-78"
    )
    val kClass = Person::class
    for(property in kClass.memberProperties) {
        if(property.findAnnotation<Serializable>() != null) {
            println("${property.name}: ${property.getter.call(person)}")
        }
    }
}