package exercises

fun reverseUsingSB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {
    var newStr: String = ""
    for (x in str.length downTo 1) {
        newStr = "$newStr${str[x - 1]}"
    }
    return newStr

//    var sbPhrase = StringBuilder()
//    var i = str.length - 1
//
//    while (i >= 0) {
//        sbPhrase.append(str[i])
//        i--
//    }
//    return  sbPhrase.toString()
}
