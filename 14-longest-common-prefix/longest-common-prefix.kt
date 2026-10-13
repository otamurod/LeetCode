class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }

        if (strs.size == 1) {
            return strs[0]
        }

        val firstString = strs[0]

        for (i in firstString.indices) {
            val charOfFirstString = firstString[i]

            for (j in 1 until strs.size) {
                val otherString = strs[j]

                if (i >= otherString.length || otherString[i] != charOfFirstString) {
                    return firstString.substring(0, i)
                }
            }
        }

        return firstString
    }
}