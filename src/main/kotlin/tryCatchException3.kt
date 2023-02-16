/**
 * This program is written to show that finally block will be implemented
 * whether try block is implemented or not
 * Here, You can see that println("Will be printed") is implemented which
 * is written in try{..} block. And finally block is also implemented.
 */

fun someFunction4() {
    println("Will be printed")  // Will be printed
}

fun main() {
    try {
        someFunction4()
        println("Will be printed")  // Will be printed
    }
    /**
     * "Finally block" is used to do operations that should always be done, no
     * matter if an exception occurred or not. It typically involves closing
     * connections or cleaning-up resources.
     */
    finally {
        println("Finally block was called") // Finally block was called
    }
    println("Will be printed") // Will be printed
}
