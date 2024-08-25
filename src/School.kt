open class School {
    open val name: String = "Mak"
}

class Hassan : School() {
    override val name: String = "BecanHouse"
}

fun main() {
    var obj = Hassan()
    println(obj.name)
}