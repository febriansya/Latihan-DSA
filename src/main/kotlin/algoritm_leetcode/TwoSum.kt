package algoritm_leetcode

import kotlin.math.tan

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var tanda = 0
        val addResult = mutableListOf<Int>()
        val size = nums.size - 1
        var found = false

        for (i in 0..size) {
            for (j in i+1..size){
                if (nums[i] + nums[j] == target) {
                    addResult.add(i)
                    addResult.add(j)
                }
            }

        }
        println("$addResult")
        return addResult.toIntArray()
    }
}

fun main() {
    val twoSum = TwoSum()
    val array = intArrayOf(2, 7, 11, 15)
    twoSum.twoSum(array, 9)
}