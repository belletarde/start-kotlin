package exercises

import org.junit.Assert
import org.junit.Test

class VowelConsonantTest {

    @Test fun countVowels() {
        Assert.assertEquals(11, countLetters("Quantas vogais tem esta frase?", false))
    }

    @Test fun countConsonants() {
        Assert.assertEquals(21, exercises.countLetters("Geralmente uma frase possui mais consoantes", true))
    }

    @Test fun countVowelsAndConsonants() {
        val phrase = "Estou gostando muito de aprender Kotlin!"
        Assert.assertEquals(15, countLetters(phrase, false))
        Assert.assertEquals(19, countLetters(phrase, true))
    }
}