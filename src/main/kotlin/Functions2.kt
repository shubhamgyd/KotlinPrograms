/**
 * Variable scope and local functions
 * In this reading, you will learn more about the concept of function scope, and you
 * will also explore how functions can be defined inside other functions.
 *
 * Variable scope
 * Inside of functions, it is possible for variable to be defined. These variables
 * are called local variables, and they are visible only in their definition scope:
 * the braces inside which they are defined. If you have a function, f1 that calls
 * a function, f2, each can have its own local variable. However, these variables
 * can only be used at the function in which they are defined.
 */

/*
fun f1() {
    val a = "Text 1"
    println(a) // can use 'a' here
    // here, I cannot use 'b'
}

fun f2() {
    val b = "Text 2"
    f1()
    println(b) // can use 'b' here
    // here, I cannot use 'a
}

fun main() {
    f2()
    // here, I cannot neither use 'a' or 'b'
}
*/

/**
 * Scope limitations are very important for building independence between functions.
 * Local variables should stay local, ond other functions should not take an interest
 * in them.
 *
 * If you want to define a variable that can be used by multiple functions, you need
 * to define it in a wider scope. As mentioned already, a simple heuristic is that
 * each variable is visible in the scope where it is defined. To make a variable that
 * can be used by multiple functions, define it at the same level as those functions.
 * In the code below, a variable is defined outside all functions. Such variables are
 * known as top-level variables. Then inside setName the value is set to "Mike", and
 * inside printName the current name is printed. As a result, the below code will print
 * "Mike".
 */

/*
var name = ""

fun setName() {
    name = "Mike"
}

fun printName() {
    println(name)
}

fun main() {
    setName()
    printName()
}
*/

/**
 * Local functions
 *
 * Just as local variables can be defined, so to can local functions. This is what
 * functions defined inside other functions are called. Just like local variables,
 * they can only be used in the scope of their definition. So, at the same function
 * and after their definition. Top-level functions do not have such limitations-they
 * can be used everywhere, even in functions defined earlier in the file.
 */

fun b() {
    // here I cannot use function a
}

fun main() {
    // here I cannot use function a
    fun a() {
        println("A")
    }
    a() // Here I can use function a
    b()
    c()
    a() // Here I can use function a
}

fun c() {
    // here I cannot use function a
}