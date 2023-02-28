/**
 * Examples of functions with parameters and results
 *
 * In this reading, you will examine practical examples of using functions with
 * parameters and results.
 *
 * Functions with parameters
 * Functions with parameters are very important and popular in programming. Let's
 * examine a few examples based on what you've learned in the course so far.
 *
 * In an earlier reading, you learned to print a triangle made up of stars.
 */

/*
fun main() {
    val height = 5
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
*/

/**
 * You could, however define it more easily with functions. First, you need a function
 * to print a line with a certain number of stars. Let's call it printStars, and it
 * should have a parameter that will be used to specify the number of stars. Such
 * a function would be useful not only for this but also for most other triangles.
 */

/*
fun printStars1(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun main() {
    val height = 5
    for (i in 1..height) {
        printStars1(i)
    }
}
 */
// Now, you can extract a function to draw the whole ascending triangle.

/*
fun printStars2(num: Int) {
    for (j in 1.. num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars2(i)
    }
}

fun main() {
    ascendingTriangle(5)
}
*/

/**
 * You could do the same to define the descending triangle. What is more, by
 * connecting both functions, you can print an isosceles triangle
 */

/*
fun printStars1(num: Int) {
    for (j in 1..num){
        print("*")
    }
    println()
}

fun ascendingTriangle(height: Int) {
    for (stars in 1..height) {
        printStars1(stars)
    }
}

fun descendingTriangle(height: Int) {
    for (stars in height downTo 1) {
        printStars1(stars)
    }
}

fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

fun main() {
    println("Ascending triangle:")
    ascendingTriangle(5)
    println("Descending triangle:")
    descendingTriangle(5)
    println("Isosceles triangle:")
    isoscelesTriangle(5)
}
*/

/**
 * Functions with return
 * Functions can also return a value. For that, a function should declare the
 * return type, using a colon and type after the parameters parenthesis. Inside
 * a body, such a function should also use return to "return" the value.
 *
 * Here is a definition of triangleArea. It's a function that calculates the area
 * of a triangle with a certain width and height. Its result is of type Double, so
 * you can place the function call on the right side of teh value assignment. Once
 * this function returns a value, it is assigned to the variable, and you can use
 * it later.
 */

/*
fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

fun main() {
    val area: Double = triangleArea(1.0,2.0)
    println(area) // 1.0
    println(triangleArea(2.0,2.0)) // 2.0
    println(triangleArea(5.0,5.0)) // 12.5
    println(triangleArea(10.0,20.0)) // 100.0
}
*/

/**
 * Let's now implement the biggerOf function so that out of two arguments, it
 * returns the largest one. You could implement it using an if-else statement,
 * with return in each branch.
 */

/*
fun biggerOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main() {
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20
}
*/

/**
 * Such a function could be simplified by usign if-else as an expression, but that's
 * not the point. Notice that in this case, you specify return two times: one for
 * each possible branch of condition.
 */

/**
 * Unreachable code after return
 * Using the 'return' keyword immediately ends a function call, so whatever is place
 * after it won't be called. Let's say that you modify 'triangleArea' by adding a
 * 'print' call after 'return'. Does it change anything? No, it does not! Once 'return'
 * is called, the function is finished, so this 'return' is unreachable.
 */

/*
fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
    println("Will never be called")
}

fun main() {
    println(triangleArea(10.0, 20.0))
}
*/

/**
 * That also means that in the biggerOf implementation, you do not need an else block.
 * You could also implement it in the following way:
 */

/*
fun biggerOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun main() {
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20
}
*/

/**
 * The behaviour of 'biggerOf' stayed the same. If 'a' is greater than 'b', than
 * 'a' will be returned, and the function will be finished. Otherwise, 'b' will
 * be returned.
 */

/**
 * Singe-expression functions
 *
 * Often, developers define functions just to return a processed value.
 * Both 'triangleArea' and 'biggerOf' are great examples. Such functions can be
 * recognized by the 'return' keyword used in the first line. That means the
 * whole body is just a single expression.
 */

/*
fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

fun biggerOf(a: Int, b: Int): Int {
    return if (a > b) a else b
}
*/

/**
 * In Kotlin, there is a special syntax for single expression functions. Instead
 * of braces with the body, you see the equality sign, which specifies what
 * should be returned.
 */

/*
fun triangleArea(width: Double, height: Double): Double = width * height /2

fun biggerOf(a: Int, b: Int): Int = if(a > b) a else b
*/

/**
 * Such a notation is shorter, but you won't really encounter it in the course
 * because it can be overly complicated. But you need to be aware that single-expression
 * functions exist because they are popular in professional projects.
 *
 * Single-expression functions are nothing new, they are just a simpler notation
 * for functions. Here is how you can understand them:
 */

/*
fun {function name}({parameters}): {result type} = {expression body }

// is equivalent to

fun {function name}({parameters}): {result type} {
    return {expression body}
}
 */
// For instance:
/*
fun triangleArea(width: Double, height: Double): Double = width * height / 2

// is equivalent to

fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}
 */
