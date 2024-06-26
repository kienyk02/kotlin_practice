fun main() {
    foo(::hello)
    println(foo1()(7, 5))
    val x: (Int, Int) -> Unit = { a, b ->
        println(a + b)
    }
    x(4, 5)
}

fun foo(bar: (name: String) -> Unit) {
    bar("Kien")
}

fun hello(name: String) {
    println("hello $name")
}

fun foo1(): (Int, Int) -> Int {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    return ::sum
}