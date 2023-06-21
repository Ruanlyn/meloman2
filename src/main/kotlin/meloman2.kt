import kotlin.math.roundToInt

const val NORMAL = "normal++"
const val SILVER = "silver+"
const val GOLD = "gold"

fun main() {
    val type = SILVER
    val itemPrice = 1000

    val result = calculateDiscount(type, itemPrice)
    val formattedResult = formatResult(result)
    val calculatedTotal = calculate(result)
    println(result)
    println(formattedResult)
    println(calculatedTotal)
}

fun formatResult(amount: Int): String {
    return "result $amount"
}
fun calculateDiscount(
    userType: String,
    price: Int = 11
): Int {
    return when (userType) {
        NORMAL -> price
        SILVER -> (price * 0.95).roundToInt()
        GOLD -> (price * 0.9).roundToInt()
        else -> price
    }
}

@JvmOverloads
fun calculate(price: Int, userType: String = GOLD): Double {
    return when(userType) {
        NORMAL -> price.toDouble()
        SILVER -> price * 0.95
        GOLD -> price * 0.9
        else -> price.toDouble()
    }
}

fun printResult(result: Double) = println(result)

fun format(result: Double) = result.toString()