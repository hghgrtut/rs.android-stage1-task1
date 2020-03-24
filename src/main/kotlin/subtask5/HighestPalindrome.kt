package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var sch=0
        var pal= StringBuilder(n)
        for (left in 0 until n/2){
            var right=n-left-1
            if (digitString[left]!=digitString[right]){
                sch++
                if (digitString[left]>digitString[right]) pal.append(digitString[left])
                else pal.append(digitString[right])
            } else pal.append(digitString[left])
        }
        if (sch<=k){
            if (n%2==1) pal.append(digitString[n/2+1])
            for (i in 0 until n/2) pal.append(pal[(n/2)-1-i])
            var i=0
            while (sch<k && i<n/2+1){
                if (pal[i]<'9'){
                    if (digitString[i]!=digitString[n-i-1]){
                        pal[i]='9'
                        pal[n-i-1]='9'
                        sch++
                    } else if (sch+1<k) {
                        pal[i]='9'
                        pal[n-i-1]='9'
                        sch+=2
                    }
                }
                i++
            }
            return pal.toString()
        } else return "-1"
    }
}