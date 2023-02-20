/**
 * Pair and Triple
 * -> This is a data class with two constructor properties, you do not need to
 * define it, as it is distributed with Kotlin.
 */

fun main() {
    val Tom = Pair("Cat", 4)
//    println(Tom)
    println(Tom.first)
    println(Tom.second)
    val (name, age) = Tom
    println(name)
    println(age)



}