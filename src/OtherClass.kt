import Enum

fun main() {
    //data class
    val data = Data(5, "hehe")
    println(data.copy(b = "heheCopy"))
    println(data.component1())

    //nested class
    NestedOuter.Nested().printNested()

    //inner class
    InnerOuter().Inner().printInner()

    //enum class
    val color = Enum.RED
    color.getColor()

    //sealed class
    val month = Month.Feb("2")
}

data class Data(val a: Int, val b: String)

class NestedOuter {
    val prop = 5
    fun callNested() {
        Nested().name
        Nested().printNested()
    }

    class Nested {
        val name: String = "Nested class"
        fun printNested() {
            println(name)
        }
    }
}

class InnerOuter {
    private val s = "Inner class"

    inner class Inner {
        fun printInner() {
            println(s)
        }
    }
}

enum class Enum(val value: Int) {
    RED(0) {
        override fun getColor() {
            println("Red")
        }
    },
    GREEN(1) {
        override fun getColor() {
            println("Green")
        }
    };

    abstract fun getColor()

}

sealed class Month() {
    class Jan(val firstName: String) : Month()
    class Feb(val lastName: String) : Month()
}