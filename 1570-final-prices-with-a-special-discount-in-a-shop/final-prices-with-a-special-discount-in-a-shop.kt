class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val stack = Stack<Int>()
        
        for (i in prices.indices) {
            // While the stack is not empty and 
            // the previous price is >= current price
            
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                val idx = stack.pop()
                prices[idx] -= prices[i]
            }

            stack.push(i)
        }
        
        return prices
    }
}