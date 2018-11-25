package exercises

fun countLetters(phrase: String, isConsonant: Boolean): Int {
    val validLetters = letterList(isConsonant)
    var totalLetters = 0

    for (letter in phrase) {
        if(letter.toLowerCase() in validLetters) totalLetters++
    }

    return totalLetters
}

private fun letterList(isConsonant: Boolean): String {
    if (isConsonant) {
        return "bcdfghjklmnpqrstvxwyz"
    }
    return "aeiou"
}