/**
 * Any class that extends Throwable can be used as an exception. That
 * means it can be thrown using a throw block.Such an exception immediately
 */
class MyError: Throwable("Be happy you got the error")


fun someFunction() {
    throw MyError()
    println("Sorry But this line will not be printed")
}

fun main() {
    try {
        someFunction()
        println("Very Sorry But this line will not be printed")
    }
    catch(e: MyError) {
        println("Caught $e")
    }
}