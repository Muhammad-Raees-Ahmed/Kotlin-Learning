data  class Student(var name:String){
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
    val ahmed=Student("SSUET")
    val ali=ahmed.copy()
    println(ahmed.name)
    println(ali.name)
}

