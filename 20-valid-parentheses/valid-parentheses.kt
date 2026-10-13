class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val pairs = mapOf(')' to '(', ']' to '[', '}' to '{')
 
        for (char in s) {
            when (char) {
                '(', '[', '{' -> stack.addLast(char)
                ')', ']', '}' -> {
                    if (stack.isEmpty() || stack.removeLast() != pairs[char]) {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }
}