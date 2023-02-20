data class Doggy (
    val name: String,
    var age: Int
)

fun main() {
    var dog = Doggy("Neptune", 3)
    val (name, age) = dog  /** Here dog is destructed and it's values name and age are assigning to
     variabe name and variable age. */
    println(dog.copy())
    println(dog.copy(age = 5))
    println(dog.copy(name = "Pluto"))
    println(name)
    println(age)
    println(dog)
}