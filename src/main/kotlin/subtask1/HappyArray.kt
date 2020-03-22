package subtask1


class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var n = sadArray.size
        var flag=1
        var i=1
        while (flag==1){
            flag=0
            for (i in 1 until n-1){
                while (i+1<n && sadArray[i] > sadArray[i - 1] + sadArray[i + 1]) {
                    flag=1
                    for (j in i + 1 until n) {
                        val k = sadArray[j]
                        sadArray[j] = sadArray[j - 1]
                        sadArray[j - 1] = k
                    }
                    n--
                }
            }
        }
        var happyArray = IntArray(n)
        for (i in 0 until n) {
            happyArray[i] = sadArray[i]
        }
        return happyArray
    }
}
