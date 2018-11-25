package nullSafe

fun main(args: Array<String>) {
//    val str: String? = null
//    println(str?.length)

    val n1 = NullExampleJava()
    println(n1.age)
    println(n1.name)

    val n2 = NullExampleJava.getInstance()
    println(n2.age)
    println(n2?.name?.length)
}