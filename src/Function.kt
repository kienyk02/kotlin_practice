import java.lang.invoke.SerializedLambda

fun double(x: Int): Int {
    return 2 * x
}

fun sum(a: Int = 5, b: Int) = a + b

fun lambdaTest(a: Int = 0, b: Int = 1, lambda: (x: Int) -> Unit) {
    lambda(5)
    println("lambda Test")
}

fun varargTest(vararg strings: String) {
    println(strings.size)
}

fun localFunTest(){
    fun localFun(){
        println("local function")
    }
    println("local function test")
    localFun()
}

open class B {
    open fun method1(i: Int = 5) {
        println(i)
    }
}

class A : B() {
    override fun method1(i: Int) {
        println(i + 2)
    }
}

fun main() {
    println(double(2))
    println(sum(b = 6))
    val a = A()
    a.method1(5)
    lambdaTest { x -> println(x * x) }
    varargTest(strings = arrayOf("a", "b", "c"))
    localFunTest()
}
