package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        var sum = 0
        var min = input[0]
        var max = input[0]
        for (i in input) {
            sum += i
            if (i < min) min = i
            else if (i > max) max = i
        }
        return arrayOf(sum-max, sum-min).toIntArray()
    }
}
