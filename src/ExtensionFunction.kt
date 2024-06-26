fun main() {
    val user = User("Kien")
    user.printName()
    user.printName1()
    println(user.age)
    User.printCompanion()
    println(User.companionProp)

    Person().test()

    println(5.plus(5))
}

class User(val name: String) {
    companion object
}

fun User.printName() {
    println("Hello $name")
}

fun User?.printName1() {
    if (this == null) return
    println("Hello $name")
}

val User.age get() = 22

val User.Companion.companionProp get() = 5
fun User.Companion.printCompanion() {
    println("Companion")
}

class Person() {
    fun User.printInfo() {
        println("My name is $name")
    }

    fun test() {
        User("Kien").printInfo()
    }
}

infix fun Int.plus(a: Int): Int {
    return this + a
}