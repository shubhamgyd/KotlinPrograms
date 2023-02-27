class Dog(val name: String, s: String) {
    var hunger = 62

    fun feed() {

        println("Feeding $name")

        this.hunger = 0
//        hunger = 0
    /*
        When we call a method, the object of their class is passed to their
        body. It is called a receiver. It can be accessed using this keyword,
        also known as receiver reference. So, if you want to reference an object
        used to call a method inside this method, use the "this" keyword.
         */
    }
}

fun main() {

    val dog = Dog("Rex", "Labrador")

    val dog1 = Dog("Juliet", "s")


    dog.feed() // Feeding Rex Labrador
    println("After feeding Rex's hunger got to "+dog.hunger)
}
