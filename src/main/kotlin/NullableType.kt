/**
 * Nullable type
 *
 * Part of Kotlin's language design is to avoid errors due to null values. The
 * following code demonstrates this design choice.
 */
/**
 * fun main() {
var message: String = "Hello World"
message = null // compilation error
 }
*/
/**
 * It is not possible to assign a null value to the message variable, and the
 * compiler will display an error.
 */

/**
 * Null Pointer Exception (NPE)
 * When accessing a property or using a function of a non-nullable type, it is
 * always guaranteed not to cause (or throw) a type of error called a null pointer
 * exception (NPE).
 */
/**
fun main() {
var length = message.length // This always works
}
 */

/**
 * Defining a null value
 * Sometimes you will need a way to represent "no value" using null.
 *
 * To do this, use the question mark symbol when defining the variable type. The
 * following is an update to the previous example to be a nullable type by adding
 * the question mark symbol after the string type.
 */
/**
fun main() {
    var message: String? = "Hello World"
    message = null // this is ok
}
*/
/**
 * The risk of using nullable types is that if you try to access a property or function
 * on a variable that is currently assigned a null value, it will cause an NPE.
 *
 * For example, if you try to access the length property of the message variable
 * while the message variable is null, the exception will be thrown.
 */
/**
fun main() {
    var message: String? = "Hello World"
    message = null //Assign null to the variable
    var length = message.length // Will cause a Null Pointer Exception
}
 */

/**
 * To avoid these errors, you will need to check for a null value before accessing
 * the property. Here's the update for the previous example to check for null.
 */
/*
fun main() {
    var message: String? = "Hello World"
    message = null // Assign null to the variable
    if (message != null) {
        var length = message.length // Will not cause an error because you have
        // checked that the value is not null

        print(length)
    } else {
        print(null)
    }
}
 */
/**
 * Sage call
 * Another way to avoid the error is to use a safe call.
 *
 * The safe call is when '?.' is used instead of '.' between an object and its
 * function or property. A safe call calls the right side if the left side is not
 * null. Otherwise, it does nothing and returns null.
 *
 * Let's update the previous example to use a safe call.
 */

/*
fun main() {
    var message: String? = "Hello World"
    print(message?.length) //Will print 11
    message = null //Assign null to the variable
    print(message?.length) //Will print null
}
 */
/**
 * Similarly, if you call a function using the safe call, it will do nothing. Let's
 * update the example to call the uppercase String function.
 */

fun main() {
    var message: String? = "Hello World"
    print(message?.uppercase()) //Will print HELLO WORLD
}