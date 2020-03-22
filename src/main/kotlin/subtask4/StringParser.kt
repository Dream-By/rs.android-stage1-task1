package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val arrayresult: MutableList<String> = arrayListOf()

        if (inputString != null) {
            for (i in inputString.indices) {
                when {
                    inputString[i] == '<' -> arrayresult.add(getSubstring(inputString.substring(i), '<', '>'))
                    inputString[i] == '(' -> arrayresult.add(getSubstring(inputString.substring(i), '(', ')'))
                    inputString[i] == '[' -> arrayresult.add(getSubstring(inputString.substring(i), '[', ']'))
                }
            }
        } else {
            throw NotImplementedError("Not implemented")
        }

        return arrayresult.toTypedArray()
    }

    fun getSubstring(string: String, charOpen: Char, charEnd: Char): String {
        var count = 0
        var result = ""

        for (i in 1 until string.length) {
            if (string[i] == charOpen) {
                count++
            } else if (string[i] == charEnd && count != 0) {
                count--
            } else if (string[i] == charEnd && count == 0) {
                result = string.substring(1, i)
                break
            }
        }
        return result
    }
}
