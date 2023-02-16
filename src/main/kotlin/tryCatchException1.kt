class MyErrorr: Throwable("Some message")

fun someFunction1() {
    throw MyErrorr()
    println("Will not be printed")
}

fun main() {
    someFunction1()
    println("Will not be printed")
}
