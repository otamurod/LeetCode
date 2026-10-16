class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()

        for (token in tokens) {
            when (token) {
                "+" -> stack.addLast(stack.removeLast() + stack.removeLast())
                
                "*" -> stack.addLast(stack.removeLast() * stack.removeLast())

                "-" -> {
                    val b = stack.removeLast()
                    val a = stack.removeLast()
                    stack.addLast(a - b)
                }

                "/" -> {
                    val b = stack.removeLast()
                    val a = stack.removeLast()
                    stack.addLast(a / b)
                }

                else -> stack.addLast(token.toInt())
            }
        }

        return stack.last()
    }
}