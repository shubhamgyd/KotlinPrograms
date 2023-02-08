enum class PizzaSize(
    val sizeInCm: Int
) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSize) {
    println("$pizzaSize is ${pizzaSize.sizeInCm} cm")
}

fun main() {
    printSize(PizzaSize.MEDIUM) // MEDIUM is 20 cm
    printSize(PizzaSize.EXTRALARGE) // EXTRALARGE is 30 cm
}