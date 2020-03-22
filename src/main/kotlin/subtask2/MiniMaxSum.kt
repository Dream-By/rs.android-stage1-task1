package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var max = 0
        var min = 100000000
        var sum = 0
        var count = 0


        val result: IntArray

        if (input != null) {

            while (count < input.size) {

                for (i in input.indices) {

                    if (i != count) {
                        sum += input[i]
                    }
                }

                when {
                    sum >= max -> max = sum
                    sum <= min -> min = sum
                }
                sum = 0
                count++
            }
        } else {
            throw NotImplementedError("Not implemented")
        }
        result = intArrayOf(min, max)
        return result
    }
}
