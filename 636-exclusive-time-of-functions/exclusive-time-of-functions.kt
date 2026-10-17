class Solution {
    fun exclusiveTime(n: Int, logs: List<String>): IntArray {
        val ans = IntArray(n)
        val stack = Stack<Int>()
        var pre = 0

        for (log in logs) {
            val parts = log.split(":")

            val funcId = parts[0].toInt()
            val eventType = parts[1]
            val timestamp = parts[2].toInt()

            if (eventType == "start") {
                if (!stack.isEmpty()) {
                    ans[stack.peek()] += timestamp - pre
                }

                stack.push(funcId)
                pre = timestamp
            } else {
                ans[stack.pop()] += timestamp - pre + 1
                pre = timestamp + 1
            }
        }

        return ans
    }
}