/**
 * Loop Through a List
 *
 * To perform an operation on each item in a list, you can loop through the list
 * (also known as iterating through the list). Loops can be used with Lists
 * and MutableList.
 */

/**
 * While loops
 *
 * One type of loop is a while loop. A while loop starts with the while keyword
 * in Kotlin. It contains a block of code (within curly braces) that gets executed
 * over and over again, as long as the expression in the parenthesis is true. To
 * prevent the code from executing forever (called an infinite loop), the code
 * block must contain logic that changes the value of the expression, so that
 * eventually the expression will be false, and you stop executing the loop. At
 * that point, you exit the while loop, and continue with executing the code that
 * comes after the loop.
 */
// While expression
/**
while (expression) {
    //While the expression is true, execue this code block
}
 */
// Note: A while loop doesn't need to involve a list (example here) but it is
// useful for lists.

//Code of using while loop for given list

/**
fun main() {
    val guestsPerFamily = listOf(2, 4, 1, 3)
    var totalGuests = 0
    var index = 0
    while (index < guestsPerFamily.size) {
        totalGuests += guestsPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")
}
 */

// Code of Using For loop for give list
fun main() {
    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for(name in names) {
        println("$name - Number of characters: ${name.length}")
    }
}


