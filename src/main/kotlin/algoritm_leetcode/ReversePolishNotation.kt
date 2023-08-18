package algoritm_leetcode

import java.util.Stack

class Solution {

    /*

    Input: tokens = ["2","1","+","3","*"]
    Output: 9
    Explanation: ((2 + 1) * 3) =9

    */

    fun evalRPN(tokens: Array<String>):Int {

        val stack = Stack<Int>()

        for (token in tokens) {
            when{
                token == "+" -> {
                    val operand2 = stack.pop()
                    val operand1 = stack.pop()
                    stack.push(operand1 + operand2)
                }
                token == "-" -> {
                    val operand2 = stack.pop()
                    val operand1 = stack.pop()
                    stack.push(operand1 - operand2)
                }
                token == "*" -> {
                    val operand2 = stack.pop()
                    val operand1 = stack.pop()
                    stack.push(operand1 * operand2)
                }
                token == "/" -> {
                    val operand2 = stack.pop()
                    val operand1 = stack.pop()
                    stack.push(operand1 / operand2)
                }
                else -> {
                    stack.push(token.toInt())
                }
            }
        }

        return stack.pop()
    }
}


fun main() {
    val coba = Solution()
    val arr = arrayOf("2", "1", "+", "3", "*")
   val result =  coba.evalRPN(arr)
    println(result)

}