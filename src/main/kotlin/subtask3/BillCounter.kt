package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var summ = 0
        if (bill != null) {
            for (i in bill.indices) {
                if (i != k) {
                    summ += bill[i]
                }
            }
            summ /= 2
            return when {
                summ == b -> "Bon Appetit"
                else -> "${b - summ}"
            }
        } else {
            throw NotImplementedError("Not implemented")
        }
    }
}
