class Solution {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
        var time = 0
        
        for (i in tickets.indices) {
            if (i <= k) {
                time += min(tickets[i], tickets[k])
            } else {
                time += min(tickets[i], tickets[k] - 1)
            }
        }
        
        return time
    }
}