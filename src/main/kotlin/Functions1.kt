fun printStars(num: Int) {
    for(j in 1..num){
        print("*")
    }
    println()
}

fun main() {
    val height = 5
    for (i in 1..height) {
        printStars(i)
    }
}