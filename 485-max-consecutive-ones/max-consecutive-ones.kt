class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var sum = 0
        val ones = mutableListOf<Int>()

        for (i in 0 until nums.size) {
            if (nums[i] == 1) {
                sum += 1
            } else {
                ones.add(sum)
                sum = 0
            }

            if(i == nums.size - 1){
                ones.add(sum)
                sum = 0
            }
        }

        return ones.max()
    }
}