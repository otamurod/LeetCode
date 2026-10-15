class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        var dup = -1
        var missing = -1

        for (n in nums) {
            val i = Math.abs(n) - 1
            
            if (nums[i] < 0) {
                dup = Math.abs(n)
            } else {
                nums[i] = -nums[i]
            }
        }

        for (i in nums.indices) {
            if (nums[i] > 0) {
                missing = i + 1
            }
        }

        return intArrayOf(dup, missing)
    }
}