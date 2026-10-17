class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = Stack<Int>()
        var maxArea = 0
        val n = heights.size

        // Loop up to n to process a dummy height of 0 at the end, 
        // which flushes out all remaining bars in the stack.
        for (i in 0..n) {
            val currentHeight = if (i == n) {
                0
             } else {
                heights[i]
             }

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                val h = heights[stack.pop()]
                val w = if (stack.isEmpty()) {
                    i 
                } else {
                    i - stack.peek() - 1
                }

                maxArea = max(maxArea, h * w)
            }

            stack.push(i)
        }

        return maxArea
    }
}