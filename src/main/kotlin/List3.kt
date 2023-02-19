fun main() {
    val entrees = mutableListOf<String>()
    /**
     * This another way of writing the above line
     */
//    val entrees: MutableList<String> = mutableListOf()
    println("Entrees: $entrees")

    /**
     * Mutable lists become interesting when you add, remove, and update
     * elements.
     */

    //Adding noddles to the entrees list
    println("Add noodles: ${entrees.add("noodles")}")

    //Printing Entrees again
    println("Entrees: $entrees")

    //Adding spaghetti to the list
    entrees.add("spaghetti")
    println("Entrees: $entrees")

    /**
     * Instead of adding elements one by one using add(), you can
     * add multiple elements at a time using addAll() and pass in a list.
     */

    // Creating a list of moreItems
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")

    // Using addAll(), adding all the items from the moreitems list to entrees.
    entrees.addAll(moreItems)
    println("Entrees: $entrees")

    // Adding integer to the entrees list fails because it can
    // have only type String.

    /**
     * Remove elements from a list
     */
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")

    // If you want remove item from the list which is not there it will
    // show false with print statement else nothing will happen

    // Removing First element from the list using removeAt(index)
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    // To clear the whole list using clear()
    entrees.clear()
    println("Entrees: $entrees")

    // To check whether the list is empty or not using isEmpty()
    println("Empty? ${entrees.isEmpty()}")



}
