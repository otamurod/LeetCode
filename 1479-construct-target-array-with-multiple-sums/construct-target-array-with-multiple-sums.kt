class Solution {
    fun isPossible(target: IntArray): Boolean {
        if (target.size == 1) {
            return target[0] == 1
        }

        var sum = 0L
        val maxHeap = PriorityQueue<Long>(reverseOrder())

        for (num in target) {
            sum += num
            maxHeap.offer(num.toLong())
        }

        while (maxHeap.peek() > 1) {
            val max = maxHeap.poll()
            val restSum = sum - max

            // If the rest of the elements sum up to 1, we can always reduce max down to 1.
            if (restSum == 1L) {
                return true
            }

            val updated = (max % restSum).toLong()

            // If updated is 0 or didn't change, we can't reduce it further.
            if (updated == 0L || updated == max) {
                return false
            }

            maxHeap.offer(updated)
            sum = sum - max + updated
        }

        return true
    }
}