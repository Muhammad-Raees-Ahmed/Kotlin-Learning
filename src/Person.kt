

interface OfflineGame{
    fun playGame(){
        println("Hello OfflineGame")
    }
}
interface OnlineGame{
    fun playGame(){
        println("Hello OnlineGame")
    }
    fun reading();
}
abstract class Ali{
     open fun playGame(){
        println("Ali is playing OnlineGame")
    }
}
class Person:Ali(),OfflineGame,OnlineGame{
    override fun playGame() {
        super<OfflineGame>.playGame()
        super<OnlineGame>.playGame()
        println("raees is playing")
    }

    override fun reading() {
        println("raees is reading book")
    }
}


fun main() {

    val person=Person()
    person.playGame()

}