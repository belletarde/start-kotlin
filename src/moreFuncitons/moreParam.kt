package moreFuncitons

import java.util.*

fun writeAddress(street: String, city: String = "", state: String, cep: String = "") {
    println("Rua: $street")
    println("Cidade: $city, $state - $cep")
}

fun main(args: Array<String>) {
//    writeAddress(street = "Rua do Kotlin", state = "02408-060")
    manyParam(1, "", true)
}

fun <T> manyParam(vararg name: T) {
    for (x in name) {
        when (x) {
            is Int -> println("int")
            is Boolean -> println("boolean")
            is String -> println("String")
        }
    }
}