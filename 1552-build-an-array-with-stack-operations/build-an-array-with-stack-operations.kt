class Solution {
    fun buildArray(target: IntArray, n: Int): List<String> {
        val result = ArrayList<String>()
        var cur = 1

        for (t in target) {
            while (cur < t) {          // numbers skipped in target
                result.add("Push")
                result.add("Pop")
                cur++
            }
            result.add("Push")         // cur == t, keep it
            cur++
        }
        return result
    }
}