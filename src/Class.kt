fun main() {
    val test = Test("hehe")
    println(test)
    println(Test.c)

    val student = Student("Kien", 22, 3.41)
    student.sleep()
}

class Test(a: String) {
    private var a: String
    var b: Int = 5

    companion object {
        val c = 15
        val d = "vip"
    }

    init {
        this.a = a
    }

    constructor(a: String, b: Int) : this(a) {
        this.a = a
        this.b = b
    }

    override fun toString(): String {
        return "a = $a, b = $b"
    }

}

abstract class People(val name: String, val age: Int) {
    abstract fun study()

    open fun sleep() {
        println("people sleep...")
    }
}

class Student(name: String, age: Int, gpa: Double) : People(name, age), InterfaceTest {
    override val x: Int = 10
    override fun getTest() {
        println("test")
    }

    override fun study() {
        println("study...")
    }

    override fun sleep() {
        println("student sleep...")
    }

}

interface InterfaceTest {
    val x: Int

    fun getTest()

    fun getTest2() {
        println("test 2")
    }
}


