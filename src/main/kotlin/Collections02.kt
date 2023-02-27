/**
 * Use a Set
 * In this reading, you will learn to create a set using the setOf function. You
 * will also learn how to add elements to sets and explore how to iterate over a
 * set.
 *
 * Set
 * Sets are quite similar to lists; that's why similar methods are used to operate
 * on them. However, sets do not treat the order as seriously as lists. Some kinds
 * of sets might not respect it. That is why you cannot get elements by index. Instead
 * , sets require their elements to be unique. You will learn how they do that. But
 * let's start from the beginning, that is, creating a set.
 *
 * Creating a set
 * You create a set using the setOf function, and then you specify the next values
 * using arguments.
 */

/*
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
}
 */

/**
 * The result type is Set<T>, where T is the type of elements in this set. Since
 * the above code has a set with char values, the type is Set<Char>.
 */

/*
fun main() {
    val set: Set<Char> = setOf('A', 'B', 'C')
    println(set) // [A, B, C]
    val ints: Set<Long> = setOf(1L, 2L, 3L)
    println(ints) // [1, 2, 3]
}
 */

/**
 * Adding elements to sets
 * The easiest way to add elements to sets is by using the plus sign. You can add
 * a single element to a set, or you can add two sets together.
 */

/*
fun main() {
    val set = setOf('A', 'B')
    println(set + 'C') // [A, B, C]
    println(set + setOf('C', 'D'))
    println(setOf('Z') + set) // [Z, A, B]
}
 */

/**
 * Establishing the size of a set
 * You can always check the number of elements in a set using the size property.
 */

/*
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set.size) // 3
}
 */

/**
 * To check if a set is empty, you can compare its size to 0, or you can use the
 * isEmpty method.
 */

/*
fun main() {
    val set = setOf('A', "B", 'C')
    println(set.size == 0) // false
    println(set.isEmpty())  // false

    val empty: Set<Int> = setOf()
    println(empty.size == 0) // true
    println(empty.isEmpty()) // true
}
 */

/**
 * Elements in sets are unique
 * Elements that are already in a set are not added; their addition is just ignored.
 */

/*
fun main() {
    val set = setOf('A', 'B', 'C')
    println(set + 'B')
    println(set + setOf('B', 'D'))

    val list = listOf('A', 'B', 'C')
    println(list + 'B')  // [A, B, C, B]
    println(list + listOf('B', 'D')) // [A, B, C, B, D]
}
 */

/**
 * Also, if you duplicate arguments in the setOf function, the second argument
 * will be ignored.
 */

/*
fun main() {
    val set = setOf('A', 'B', 'A')
    println(set) // [A, B]
}
 */

/**
 * Two elements are duplicated if they are equal, so if == between them returns
 * true. Since regular classes are considered unique, they are never considered
 * to be duplicates.
 */


/*
class User1(val name: String)
fun main() {
    val set = setOf(User1("A"), User1("A"))
    println(set + User1("A")) // [User@XXX, User@YYY, User@ZZZ]
}
*/

/**
 * However, data classes are equal when their all-constructor properties have
 * the same values.
 */

/*
data class User2(val name: String)

fun main() {
    val set = setOf(User("A"), User("A"))
    println(set + User("A")) // [User(name=A)]
}
 */

/**
 * Checking if a set contains an element
 *
 * You can check if a set contains a certain element. You can use th contains method
 * or in operator. Both options return true if there is an element in the set
 * equal to the element you are looking for, otherwise it returns false.
 */


/*
fun main() {
    val letters = setOf('A', 'B', 'C')
    println(letters.contains('A'))
    println(letters.contains('Z'))
    println('A' in letters) // true
    println('Z' in letters) // false
}
*/

/**
 * You can also check the opposite to determine if the set does not contain the
 * element, by using !in operator.
 */

/*
fun main() {
    val letters = setOf("A", "B", "C")
    println("A" !in letters) // false
    println("Z" !in letters) // true
}
 */

/**
 * Iterating over sets
 * You can iterate over a set using a for-loop. Simply place a set on the right
 * side of 'in'.
 */

/*
fun main() {
    val letters = setOf('A', 'B', 'C')
    for (letter in letters) {
        print(letter)
    }
}
*/

/**
 * Using mutable sets
 * 'Set' is a type representing read-only sets. If you want to create a mutable set,
 * user 'mutableSetOf', and the result type is 'MutableSet'. With mutable sets, you can
 * use methods like 'add' or 'remove' to add or remove a certain element.
 */

fun main() {
    val set = mutableSetOf('A', 'B')
    set.add('C')
    println(set) // [A, B, C]
    set.remove('B')
    println(set) // [A, C]
}

/**
 * Concluding thoughts
 *In this reading, you learned to create a set using the "setOf" function. You
 * also learned how to add elements to sets and discovered how to iterate over
 * a set.
 */
