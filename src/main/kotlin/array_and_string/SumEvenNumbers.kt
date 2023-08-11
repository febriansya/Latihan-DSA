package array_and_string

class SumEvenNumbers {

    val arrayBilangan = arrayOf(1, 4, 5, 6, 7, 3, 7, 8, 5, 4, 6, 8, 2)
    fun sumEvenNumbers() {
        val tampungEven = mutableListOf<Int>()
        for (i in arrayBilangan) {
            if (i % 2 == 0) {
                tampungEven.add(i)
            }
        }
        println(
            "bilangan genap dari (1, 4, 5, 6, 7, 3, 7, 8, 5, 4, 6, 8, 2) adalah " +
                    " $tampungEven dengan jumlah sebanyak ${tampungEven.size}"
        )
    }
}

fun main() {
    val even = SumEvenNumbers()
    even.sumEvenNumbers()
}