

fun pay(amount:Double, method: PaymentMethod): Boolean {
    return when(method) {
        PaymentMethod.CASH-> payWithCash(amount)
        PaymentMethod.CARD -> payWithCard(amount)
        PaymentMethod.CHECK -> payWithCheck(amount)
        else -> {
            println("Unknown payment method")
            false
        }
    }
}

fun payWithCheck(amount: Double): Boolean {
    return true
}

fun payWithCard(amount: Double): Boolean {
    return true
}

fun payWithCash(amount: Double): Boolean {
    return true
}

enum class PaymentMethod {
    CASH,
    CARD,
    CHECK
}
/*
fun payWithCash( amount:Double) {
    return true
}
fun payWithCard( amount:Double) {
    return true
}
fun payWithCheck(amount:Double) {
    return true
}
*/
fun main() {
    val success = pay(123.0, PaymentMethod.CASH)
    println("Success: ${success}")

    println(PaymentMethod.CASH)

    println(PaymentMethod.CASH.ordinal)
    println(PaymentMethod.CARD.ordinal)
    println(PaymentMethod.CHECK.ordinal)

    for (method in PaymentMethod.values()){
        println(method.ordinal)
    }

    val string1 = "CASH"
    val method: PaymentMethod = PaymentMethod.valueOf(string1)
    println(method)
    val string2: String = method.name
}