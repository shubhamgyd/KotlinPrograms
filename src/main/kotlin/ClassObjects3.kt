class User(var name: String) {

    fun changeName(name: String) {

        println("Changed name from ${this.name} to $name")

        this.name = name
    }
}

fun main() {

    val user = User("Alpha") // Changed name from Alpha to Beta

    user.changeName("Beta") // Beta

    println(user.name)
}