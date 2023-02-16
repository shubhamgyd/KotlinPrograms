import java.lang.IllegalArgumentException

/**
 * Important exceptions
 * There are a few kinds of exceptions defined in Kotlin that are ued in certain
 * situations. The most important ones are:
 * 1) IllegalArgumentException - used when an argument has an incorrect value.
 *      For example, when you expect your argument value to be bigger than 0, and
 *      it is not.
 *
 * 2) IllegalStateException - used when the state of our system is incorrect. That
 *      means the values of properties have values that are not accepted by our
 *      function call.
 */
fun findClusters(number: Int) {
    if (number < 1) throw IllegalArgumentException("The number of clusters cannot" +
            " be smaller than 1, it is $number")
    // ...
}

var userName = ""

fun printUserName() {
    if (userName == "") throw IllegalStateException("User name must not be empty")
    // ...
}