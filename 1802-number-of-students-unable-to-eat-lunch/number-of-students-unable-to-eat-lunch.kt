class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        var studentsA = 0 // for 0
        var studentsB = 0 // for 1

        for (i in 0 until students.size) {
            if (students[i] == 0) {
                studentsA++
            } else {
                studentsB++
            }
        }

        for (j in 0 until sandwiches.size) {
            if (sandwiches[j] == 0 && studentsA > 0) {
                studentsA--
            } else if (sandwiches[j] == 1 && studentsB > 0) {
                studentsB--
            } else {
                break
            }
        }

        return studentsA + studentsB
    }
}