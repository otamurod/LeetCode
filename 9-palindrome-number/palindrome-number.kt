class Solution {
    fun isPalindrome(x: Int): Boolean {
        // Negative numbers and numbers ending in 0 (except 0 itself) aren't palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var original = x
        var reverted = 0
        while (original > reverted) {
            reverted = reverted * 10 + original % 10
            original /= 10
        }

        // Even digit count: original == reverted
        // Odd digit count: drop the middle digit from reverted
        return original == reverted || original == reverted / 10
    }
}