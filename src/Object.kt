fun main() {
    val a = object : A1, C1("Kien") {
        val value = 5
        override fun getInfo() {
            println("A1")
        }
    }
    a.getInfo()
    println(a.name)

    implement.getInfo()
}

interface A1 {
    fun getInfo()
}

open class C1(val name: String)

object implement : C1("kien2"), A1 {
    override fun getInfo() {
        print("A1 implement")
    }

}