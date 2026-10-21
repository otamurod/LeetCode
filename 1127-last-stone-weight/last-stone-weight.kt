class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        // Create a max-heap using a reverse order comparator
        val maxHeap = PriorityQueue<Int>(reverseOrder())
        
        for (stone in stones) {
            maxHeap.offer(stone)
        }

        while (maxHeap.size > 1) {
            val y = maxHeap.poll() // Heaviest stone
            val x = maxHeap.poll() // Second heaviest stone

            if (y != x) {
                maxHeap.offer(y - x)
            }
        }

        return if (maxHeap.isEmpty()) 0 else maxHeap.peek()
    }
}