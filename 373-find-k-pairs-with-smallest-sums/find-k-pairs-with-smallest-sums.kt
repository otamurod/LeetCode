class Solution {
    fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        if (nums1.isEmpty() || nums2.isEmpty() || k <= 0) {
            return result
        }

        // Min-heap to store intArray of [sum, indexInNums1, indexInNums2]
        val minHeap = PriorityQueue<IntArray> { a, b -> 
            a[0] - b[0] 
        }

        // Initialize the heap with the first element of nums2 paired with each element of nums1
        for (i in 0 until min(nums1.size, k)) {
            minHeap.offer(intArrayOf(nums1[i] + nums2[0], i, 0))
        }

        // Extract the k smallest pairs
        while (minHeap.isNotEmpty() && result.size < k) {
            val curr = minHeap.poll()
            val u = curr[1]
            val v = curr[2]

            result.add(listOf(nums1[u], nums2[v]))

            // If there is a next element in nums2, push the new pair into the heap
            if (v + 1 < nums2.size) {
                minHeap.offer(intArrayOf(nums1[u] + nums2[v + 1], u, v + 1))
            }
        }

        return result
    }
}