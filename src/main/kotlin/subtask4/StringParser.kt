package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val n=inputString.length
        val tempList :MutableList<String> = mutableListOf()
        for (i in inputString.indices){
            when {
                inputString[i] == '(' -> tempList.add(findSubstring(i, n, '(', ')', inputString))
                inputString[i] == '[' -> tempList.add(findSubstring(i, n, '[', ']', inputString))
                inputString[i] == '<' -> tempList.add(findSubstring(i, n, '<', '>', inputString))
            }
        }
        return tempList.toTypedArray()
    }

    private fun findSubstring(i: Int, max: Int, openBrace: Char, closeBrace: Char, string: String): String{
        var substring=""
        var sch=0
        var index=i+1
        while(string[index]!=closeBrace || sch>0) {
            if (string[index]==openBrace) sch++
            else if (string[index]==closeBrace) sch--
            substring+=string[index]
            index++
        }
        return substring
    }
}
