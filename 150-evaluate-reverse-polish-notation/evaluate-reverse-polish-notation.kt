class Solution {
    var index = 0

    fun evalRPN(tokens: Array<String>): Int {
        index = tokens.size - 1

        return eval(tokens)
    }

    fun eval(tokens: Array<String>): Int {
        val token = tokens[index--]

        if (token != "+" && token != "-" && token != "*" && token != "/") {
            return token.toInt()
        }

        val right = eval(tokens)
        val left = eval(tokens)

        return when (token) {
            "+" -> left + right
            "-" -> left - right
            "*" -> left * right
            else -> left / right
        }
    }
}