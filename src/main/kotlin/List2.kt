fun main() {
    val colors = listOf("green", "orange", "blue")
    /** Remember that these are invalid operations
    colors.add("purple")
    colors[0] = "yellow"
    */

    // Reversed list creates a totally new list with desired changes
    println("Reversed list: ${colors.reversed()}")
    // Original Changes
    println("List: $colors")

    // This does sorting on the basis alphabetical order and
    // creates a new list same as reversed list
    println("Sorted list: ${colors.sorted()}")

    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")
}