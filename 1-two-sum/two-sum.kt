class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>() // value -> index

        for (i in nums.indices) {
            val difference = target - nums[i]

            seen[difference]?.let { j ->
                return intArrayOf(j, i)
            }

            seen[nums[i]] = i
        }

        throw IllegalArgumentException("No two sum solution found")
    }
}