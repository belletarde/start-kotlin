package basic


fun main(args: Array<String>) {

    try {
        "1".toInt()
    } catch (e: NumberFormatException) {
        println("Is not a number")
    } catch (e: NullPointerException) {
        println("Null pointer")
    } catch (e: Exception) {
        println("Idk what happened")
    } finally {
        println("finish")
    }

}