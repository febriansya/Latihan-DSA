package array_and_string

import kotlin.math.E


/*
*  problem 1 find the maximum of number in array
* array =  [1,5,6,7,45,7]
*
*
* */

interface FindMaximum {
    fun findThat(): Int
}

abstract class MathAverage() {
    abstract fun findAverage(): Double
}


class Execute() : FindMaximum {
    private val arr = arrayOf(1, 4, 5, 6, 74, 56, 100)

    override fun findThat(): Int {
        var simpan = 0
        for (i in arr) {
            if (i > simpan) {
                simpan = i
            }
        }
        return simpan
    }
}


fun main() {
    val answer = Execute()
    val result = answer.findThat()
    println(result)
}