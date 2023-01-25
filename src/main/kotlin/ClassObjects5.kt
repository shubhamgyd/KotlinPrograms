interface Animal {
    val breed: String
    fun pet()
}

class Cat(
    val name: String,
    override val breed: String
): Animal {
    override fun pet() {
        println("Meow")
    }
}

class Dog1(
    val name: String,
    override val breed: String
): Animal {
    override fun pet() {
        println("Waff")
    }
}

fun pet(animal: Animal) {
    animal.pet()
}

fun main() {
    println(Cat("Jake", "Munchkin"))
    println(Dog1("Juliet", "Border Collie"))

}