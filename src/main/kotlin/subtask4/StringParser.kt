package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var k=0
        val n=inputString.length
        var tempArray :Array<String> = Array(n){""}
        for (i in 0 until n){
            when {
                inputString[i]=='(' -> {
                    var tempString=StringBuilder()
                    var ti=i+1
                    var sch=0
                    while(inputString[ti]!=')' || sch>0) {
                        if (inputString[ti]=='(') sch++
                        else if (inputString[ti]==')') sch--
                        tempString.append(inputString[ti])
                        ti++
                    }
                    tempArray[k]=tempString.toString()
                    k++
                }
                inputString[i]=='[' -> {
                    var tempString=StringBuilder()
                    var ti=i+1
                    var sch=0
                    while(inputString[ti]!=']' || sch>0) {
                        if (inputString[ti]=='[') sch++
                        else if (inputString[ti]===']') sch--
                        tempString.append(inputString[ti])
                        ti++
                    }
                    tempArray[k]=tempString.toString()
                    k++
                }
                inputString[i]=='<' -> {
                    var tempString=StringBuilder()
                    var ti=i+1
                    var sch=0
                    while(inputString[ti]!='>' || sch>0) {
                        if (inputString[ti]=='<') sch++
                        else if (inputString[ti]=='>') sch--
                        tempString.append(inputString[ti])
                        ti++
                    }
                    tempArray[k]=tempString.toString()
                    k++
                }
            }
        }
        var outputArray: Array<String> = Array(k){""}
        for (i in outputArray.indices) outputArray[i]=tempArray[i]
        return outputArray
    }
}
