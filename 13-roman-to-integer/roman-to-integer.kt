class Solution {
    fun romanToInt(s: String): Int {
        val values = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )

        var total = 0
        for (i in s.indices) {
            val current = values[s[i]] ?: 0
            val next = if (i + 1 < s.length) {
                values[s[i + 1]] ?: 0
            } else {
                0
            }

            total += if (current < next) {
                -current
            } else {
                current
            }
        }

        return total
    }
}