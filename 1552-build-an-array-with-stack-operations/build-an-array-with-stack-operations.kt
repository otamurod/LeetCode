class Solution {
    fun buildArray(target: IntArray, n: Int): List<String> {
        val stack = mutableListOf<String>()
        val hashed = target.toHashSet()

        for(i in 1..n){
            if(i in hashed){
                stack.add("Push")
            }else {
                stack.add("Push")
                stack.add("Pop")
            }

            if(i == target.last()){
                break
            }
        }

        return stack.toList()
    }
}