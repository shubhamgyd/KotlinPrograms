/**
 * Create a List
 * In this reading, you will learn how to create a list using the listOf function to:
 * @ add elements to lists
 * @ get elements at certain positions
 * @ check if a list contains an element
 * @ iterate over a list
 * @ make and use a mutable list
 *
 * List
 * List is a most basic type of collection. It represents an ordered list of element.
 * The same elements can be reapeated multiple times. You might use a list to represent
 * products in a shopping cart or delivery method options. The order of elements is preserve,
 * so if you define a list of delivery methods in some configuration, those elements should
 * be displayed in the same order on the payment window.
 */


/**
 * Creating a list
 * To create a list, the listOf function is used. The next values are then specified
 * using arguments.
  */
/*
fun main() {
    val list = listOf("A", "B", "C")
    println(list)
}
 */

/**
 * The result type is List<T>, where "T" is the type of elements in this list. Since
 * the code above consists of a list with string values, the type is List<String>.
 */

/*
fun main() {
    val list: List<String> = listOf("A", "B", "C")
    println(list) // [A, B, C]
    val ints: List<Int> = listOf(1,2,3)
    println(ints)
}
 */

/**
 * Adding elements to lists
 * The easiest way to add elements to lists is using the plus sign. You can add a
 * single element to a list, or you can add two lists together.
 */

/*
fun main() {
    val list = listOf("A", "B")
    println(list + "C") // [A, B, C]
    println(list + listOf("C", "D"))  // [A, B, C, D]
    println(listOf("Z") + list) // [Z, A, B]
}
 */

/**
 * Getting the size of a list
 * You can always check the number of elements in a list using the size property.
 */

/*
fun main() {
    val list = listOf("A", "B", "C")
    println(list.size)  // 3
}
 */

/**
 * To check if a list is empty, you can compare its size to 0, or you can use the
 * isEmpty method.
 */

/*
fun main() {
    val list = listOf("A", "B", "C")
    println(list.size == 0) // 3
    println(list.isEmpty()) // False

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // True
    println(empty.isEmpty()) // True
}
 */

/**
 * Getting elements at certain positions
 * You can think of a list like it is a shelf of an infinite size, where you place
 * the next elements at the next positions. It is important ot note that the position
 * of the first element is 0.
 *
 * You can get an element at a certain position using box brackets.
 */

/*
fun main() {
    val list = listOf("A", "B", "C")
    println(list[0]) // A
    println(list[1]) // B
    println(list[2]) // C
}
 */

/**
 * Checking if a list contains an element
 *
 * You can check if a set contains a certain element. For that, you can
 * use the "contains" method or the "in" operator. Both of those options return
 * "true" if in the list there is an element equal to the element you are
 * looking for, and it returns "false" otherwise.
 */

/*
fun main() {
    val letters = listOf("A", "B", "C")
    println(letters.contains("A")) // true
    println(letters.contains("Z")) // false
    println("A" in letters) // true
    println("Z" in letters) // false
 }
 */

/**
 * You can also check the opposite to determine if the collection does not
 * contain the element using the "!in" operator.
 */

/*
fun main() {
    val letters = listOf("A", "B", "C")
    println("A" !in letters) // false
    println("Z" !in letters) // true
}
*/

/**
 * Iterating over lists
 *
 * You can iterate over a list using a for-loop. Simply place a list on the
 * right side of "in".
 */

/*
fun main() {
    val letters = listOf("A", "B", "C")
         for (letter in letters) {
             print(letter)
         }
}
 */

/**
 * Using mutable lists
 *
 * List is a type representing read-only lists. If you want to create a mutable
 * list, use mutableListOf, and the result type is MutableList. With mutable lists,
 * you can use methods like add or remove to add or remove a certain element.
 */

/*
fun main() {
    val list = mutableListOf("A", "B")
    list.add("C")
    println(list) // [A, B, C]
    list.remove("B")
    println(list) // [A, C]
}
 */

/**
 * You can also change an element at a certain position using box brackets with
 * index and assignment.
 */

fun main() {
    val list = mutableListOf("A", "B", "C")
    list[1] = "Z"
    println(list) // [A, Z, C]
}

/**
 * Concluding thoughts
 *
 * Lists are incredibly versatile when used to store data in an ordered fashion.
 * This reading provided you with a basic overview of some of the ways lists can
 * be used.
 */