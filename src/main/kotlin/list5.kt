/**
 * Put it all together
 *
 * When it comes to ordering food at local restaurant, there's usually multiple
 * items within a single order for a customer. Using lists is ideal for storing
 * information about an order. You'll also draw on your knowledge of classes
 * and inheritance to create a more robust and scalable Kotlin program, instead
 * of putting all the code within the main() function.
 */

// For the next series of tasks, create a Kotlin program that allows for ordering
// different combinations of food.

open class Item (val name: String, val price:Int){

}
class Noodles: Item("Noodles", 10 ) {
    override fun toString(): String {
        return name
    }
}
// vararg modifier: It allows you to pass a variable number of arguments of the
// same type into a function or constructor.
class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        return if (toppings.isEmpty()) {
            "$name Chef's Choice"
        } else {
            name + " " + toppings.joinToString()
        }
    // joinToString: This method use to join all the toppings into a single string.
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun main() {
    val ordersList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    //This line of code creates a new Order and takes advantages of the Builder pattern.
    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage","Onion"))
    ordersList.add(order4)

    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach")))

    for(order in ordersList) {
        order.print()
        println()
    }
}

/**
 * Detailed explanation of the code.
 * -> First there is a class called Item, where the constructor takes in
 * 2 parameters: a name for the item (as a String) and a price (as an integer).
 * Both properties do not change after they're passed in, so they are marked as
 * val. Since Item is a parent class, and subclasses extend from it, the class
 * is marked with the open keyword.
 *
 * -> The Noodles class constructor takes in no parameter, but extends from Item
 * and calls the superclass constructor by passing in "Noodles" as the name and
 * the price of 10. The Vegetables class is similar but calls the superclass
 * constructor with "Vegetables" and a price of 5.
 *
 * -> The main() function initializes new object instances of Noodles and Vegetables
 * classes, and prints them to the output.
 */

