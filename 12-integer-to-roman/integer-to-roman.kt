class Solution {
    fun intToRoman(number:Int):String{

        // val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        // val symbols = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        
        // val romanStringBuilder = StringBuilder()
        // var givenNumber = number

        // for(i in values.indices){
        //     while(givenNumber >= values[i]){
        //         givenNumber -= values[i]
        //         romanStringBuilder.append(symbols[i])
        //     }
        // }

        // return romanStringBuilder.toString()


        
        // Ones place (0-9):
        // 0 -> ""
        // 1 -> I
        // 2 -> II
        // 3 -> III
        // 4 -> IV
        // 5 -> V
        // 6 -> VI
        // 7 -> VII
        // 8 -> VIII
        // 9 -> IX
        val ones = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

        // Tens place (0, 10, 20, ... 90):
        // 0 -> ""
        // 10 -> X
        // 20 -> XX
        // 30 -> XXX
        // 40 -> XL
        // 50 -> L
        // 60 -> LX
        // 70 -> LXX
        // 80 -> LXXX
        // 90 -> XC
        val tens = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")

        // Hundreds place (0, 100, 200, ... 900):
        // 0 -> ""
        // 100 -> C
        // 200 -> CC
        // 300 -> CCC
        // 400 -> CD
        // 500 -> D
        // 600 -> DC
        // 700 -> DCC
        // 800 -> DCCC
        // 900 -> CM
        val hundreds = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")

        // Thousands place (number is capped at 3999, so only need 0-3):
        // 0 -> ""
        // 1000 -> M
        // 2000 -> MM
        // 3000 -> MMM
        val thousands = arrayOf("", "M", "MM", "MMM")

        // Split number into its 4 digits, e.g. 1994 -> th=1, h=9, t=9, o=4
        val th = number / 1000
        val h = (number % 1000) / 100
        val t = (number % 100) / 10
        val o = number % 10

        // Look up each digit's pattern and glue them together
        return thousands[th] + hundreds[h] + tens[t] + ones[o]
    }
}