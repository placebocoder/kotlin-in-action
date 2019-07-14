fun main(){
    val input = "123"
    val game = BaseballGame("253")
    println(game.pitch(input))
}

class BaseballGame(val score: String) {
    fun pitch(input: String): String {
        var strikes: Int = 0
        var ball: Int = 0
        for((index, c) in input.toCharArray().withIndex()){
            when {
                score[index] == c -> strikes++
                score.contains(c) -> ball++
            }
        }
        return "$strikes Strike, $ball Ball"
    }
}