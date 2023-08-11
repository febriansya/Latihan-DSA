package array_and_string

class ReverseArray {
    fun executeReverse() {
        val array = arrayOf(1, 47, 7, 88, 8, 8, 67, 56)
        val size = array.size - 1
        for (j in size downTo 0) {
            println(array[j])
        }
    }
}

fun main() {
    val reverse = ReverseArray()
    reverse.executeReverse()
}