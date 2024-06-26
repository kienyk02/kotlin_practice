// let, with, run, also, apply
//extension function: let, run, also, apply
//context object:
//  it: let, also
//  this: with, run, apply
//return value:
//  lambda result: let, with, run
//  object: also, apply
fun main(){
    val user:User1?=User1("Kien")
    user?.let {
        println(it.name)
    }

    val resultWith = with(user){
        this?.name
    }
    println(resultWith)

    val resultRun = user?.run {
        this.name
    }
    println(resultRun)

    val resultAlso = user?.also {
        it.name
    }
    println(resultAlso)

    val resultApply = user?.apply {
        this.name
    }
    println(resultApply)
}

data class User1(val name:String)