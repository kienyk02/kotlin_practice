import kotlin.time.measureTimedValue
import kotlin.text.toInt as toInt

fun main() {
    val a = 2
    val b = 4
    // if condition
    println("if condition".uppercase())
    if (a > b) {
        println("a > b")
    } else if (a == b) {
        println("a = b")
    } else {
        println("a < b")
    }
    val max = if (a >= b) {
        println("a is max")
        a
    } else {
        println("b is max")
        b
    }
    println(max)
    //when ~ switch case(java)
    println("when".uppercase())
    val s = "100"
    when (max) {
        a -> {
            println("max = a")
        }

        b -> {
            println("max=b")
        }

        s.toInt() -> println("max=100")

        in 10..20 -> println("10 <= max <=20")
        else -> {
            println("max is another value")
        }
    }
    //for loop
    println("for Loop".uppercase())
    val arr = arrayOf(1, 2, 3, 4, 5)
    for (i: Int in arr) {
        print(i.toString() + " ")
    }
    println()
    for (i in 0..<arr.size step 1) {
        print(arr[i].toString() + " ")
    }
    println()
    for((index,value) in arr.withIndex()){
        println("index $index has value $value")
    }
    //while loop
    println("While Loop".uppercase())
    var x=5
    while (x>0){
        println(x)
        x--
    }
    do {
        println(x)
        x++;
    }
    while (x < 5)

}