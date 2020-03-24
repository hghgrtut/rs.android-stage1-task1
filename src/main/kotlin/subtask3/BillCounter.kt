package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var n=bill.size
        var sum=0
        for (i in bill) sum+=i
        sum-=bill[k]
        sum/=2
        if (sum==b) return "Bon Appetit"
        else return (b-sum).toString()
    }
}
