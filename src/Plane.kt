class Plane {
    var name:String="Raees"

        get() {
            println("calling setter")
            return field
        }
        set(value) {
            field = value
        }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }
}

fun main(){
    val plane=Plane()
    println(plane.name)
}

