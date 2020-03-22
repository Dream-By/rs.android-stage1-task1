package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val result: MutableList<Int> = sadArray.toMutableList()
        var Check = false
        if (result.size != null) { while (!Check)
        { Check = true
            for (i in 1 until result.size - 1)
            {
                if (Find(result, i))
                {
                    result.removeAt(i)
                    Check = false
                    break
                }
            }
        }

            return result.toIntArray()
        } else if (result.size == 0) {
            return sadArray
        }
        throw NotImplementedError("Not implemented")

    }

    private fun Find(array: MutableList<Int>, index: Int) = when {
        array[index] > array[index - 1] + array[index + 1] -> true
        else -> false
    }
}

