package exercises

fun <T> sumAllParameters(vararg params: T): Int {
  var result = 0
  for (x in params) {
    if (x is Int) {
      result += x
    }
  }

  return result
}
