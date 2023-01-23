class Scores(val Playerdetails: Player,val total_score: Int,val personal_best_score: Int) {

}
class Player(val name: String,val surname: String) {

//    val name1: String = name
//    val surname1: String = surname
}

fun main() {
    val player1 = Player("Nicola", "Tesla")
    val player2 = Player("Boris", "Johnson")
    val player1Score = Scores(player1, 34, 45,)

    println(player1.name)
    println(player1.surname)
    println(player1Score.Playerdetails.name)
    println(player1Score.total_score)
    println("The winner is ${player1.name} ${player1.surname} with a Score" +
            "of 158 Personal Best Score is = ${player1Score.personal_best_score}")
}