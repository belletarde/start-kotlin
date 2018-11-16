package basic

import java.time.Year
import java.util.*

private fun toUpper(str: String): String = str.toUpperCase()

private fun firstLetter(str: String, index: Int): Char = str[index]

fun whichNumberIsBigger(n1: Int, n2: Int): Int = if (n1 > n2) n1 else n2

//fun whatHapenned(year: Int) = when (year) {
//    2017 -> {
//        "Ano passado"
//    }
//    2018 -> "Ano atual"
//    else -> "nao sei"
//}

fun whatHapenned(year: Int) : String {
    when {
        (1 == 1) -> {
            return "Ano passado"
        }
        year == 2017 -> return "Ano passado"
        else -> return "nao sei"
    }
}

fun main(args: Array<String>) {
    hello()
    println(toUpper("roriIOSIDIOodsd"))
    println(firstLetter("Kevin", 3))

    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)

    println(whatHapenned(year))
}