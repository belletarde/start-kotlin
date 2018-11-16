package basic

//triple "" get the string format
// | before the string and trimmargin still break the line but remove tabs/spaces
// A string is like a array of char, u can access string[i] or string.length
//Template in kotlin for concat
fun main(args: Array<String>) {
    val name = "Kevin"

    val name2 = """ |Kevin
        |Marcelo
        |Belletarde
    """.trimMargin()

    val name3 = "Kevin"
    print("Oi, ${name[0]}")
}