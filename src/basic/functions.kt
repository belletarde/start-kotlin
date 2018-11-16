package basic

fun hello() {
    println("Hello")
}

private fun toUpper(str: String): String {
    return  str.toUpperCase()
}

private fun funFirstLetter(str: String, index: Int): Char {
    return str[index]
}

fun main(args: Array<String>) {
    hello()
    println(toUpper("roriIOSIDIOodsd"))
    println(funFirstLetter("Kevin", 3))
}