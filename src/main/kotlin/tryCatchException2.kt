fun someFunction3() {
    throw Throwable("Some Error")
    println("Will not be printed")
}

fun main() {
    try {
        someFunction3()
        println("Will not be printed")
    } finally {
        println("Finally block was called") // Finally block was called
    }
    println("So Sorry but this never ever be printed")
}