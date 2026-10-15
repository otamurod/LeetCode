class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val seen = nums.toHashSet()
        val result = mutableListOf<Int>()

        for (i in 1..nums.size) {
            if (i !in seen) {
                result.add(i)
            }
        }

        return result
    }
}