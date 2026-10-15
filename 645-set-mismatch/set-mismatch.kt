class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val output = IntArray(2)
        val sorted = nums.sortedArray()

        for (i in 0 until sorted.size){
            if(i+1 < sorted.size && sorted[i] == sorted[i+1]){
                output[0] = sorted[i + 1]
            }

            if(sorted.contains(i + 1) == false){
                output[1] = i + 1
            }
        }

        return output
    }
}