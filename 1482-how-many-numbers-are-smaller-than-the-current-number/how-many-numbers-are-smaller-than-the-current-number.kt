class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var count = 0

        for(i in 0 until nums.size){
            for(j in 0 until nums.size){
                if(nums[j] < nums[i] && j!=i){
                    count++
                }
            }

            result[i] = count
            count = 0
        }

        return result
    }
}