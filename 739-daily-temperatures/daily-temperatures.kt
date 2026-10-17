class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size
        val answer = IntArray(n)
        val stack = Stack<Int>()

        for (i in 0 until n) {
            // While we find a warmer temperature than the day at the stack's top
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                val prevIndex = stack.pop()
                answer[prevIndex] = i - prevIndex
            }
            
            stack.push(i)
        }

        return answer
    }
}