package array_and_string

class FindAverage() : MathAverage() {

//    titik tengah

    private val arr = arrayOf(1, 4, 5, 6, 74, 56, 100)
    override fun findAverage(): Double {
        var index = 0
        var result = 0

        if (arr.size % 2 == 1) {
            for (i in arr) {
                index += i
            }
            result = index / arr.size
        }
        return result.toDouble()
    }
}

fun main() {
    val findAverage = FindAverage()
    val hasil = findAverage.findAverage()
    println(hasil)

}