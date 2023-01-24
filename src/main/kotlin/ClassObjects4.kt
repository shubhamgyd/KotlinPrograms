class Scores(){
    fun checkBest(best: Int, current: Int): Int{
        if(best < current){
            return current
        }
        return best
    }
}

class Player(val name: String, val surname: String){
    var totalScore = 0
    var personalBestScore = 0
    fun fullName(): String {
        return "${name} ${surname}"
    }
}
fun main() {
    val player1 = Player("Donald", "Serino")
    val player2 = Player("Imran", "Walt")
    println(player1.fullName())
    val scoring = Scores() // instance of the Scores class to allow access
    // to checkBest
    var lvlScore = 0

    // Level  = 1
    lvlScore = 12 // insert simulated values for level Score for player1
    player1.totalScore += lvlScore
    player1.personalBestScore = scoring.checkBest(player1.personalBestScore, lvlScore)

    lvlScore = 15 //inserted simulated values for level Score for player2
    player2.totalScore += lvlScore
    player2.personalBestScore = scoring.checkBest(player2.personalBestScore,lvlScore)

    // Level = 2
    lvlScore = 20 // insert simulated values for level Score for player1
    player1.totalScore += lvlScore
    player1.personalBestScore = scoring.checkBest(player1.personalBestScore,lvlScore)

    lvlScore = 18
    player2.totalScore += lvlScore
    player2.personalBestScore = scoring.checkBest(player2.personalBestScore,lvlScore)

    // Level = 3
    lvlScore = 30
    player1.totalScore += lvlScore
    player1.personalBestScore = scoring.checkBest(player1.personalBestScore,lvlScore)

    lvlScore = 40
    player2.totalScore += lvlScore
    player2.personalBestScore = scoring.checkBest(player2.personalBestScore,lvlScore)

    if(player1.totalScore > player2.totalScore)
    {
        println("Ther winner is "+ player1.fullName() + " with a Score of " + player1.totalScore)
        println("Personal Best Score is = " + player1.personalBestScore)
    }
    else
    {
        println("The winner is "+ player2.fullName() + " with a Score of " + player2.totalScore);
        println("Personal Best Score is = " + player2.personalBestScore);
    }




}