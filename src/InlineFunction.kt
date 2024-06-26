fun main(){
    inlineFunction{
        println(it + 2)
    }
    printGeneric("hehe")
    printGeneric(5)
    printGeneric1<String>("hehe")
    printGeneric1<Int>("hehe")
}

inline fun inlineFunction( bar: (Int) -> Unit){
    bar(5)
}

fun <T> printGeneric(a:T){
    println(a)
}

inline fun <reified T> printGeneric1(a:Any){
    println(a is T)
}