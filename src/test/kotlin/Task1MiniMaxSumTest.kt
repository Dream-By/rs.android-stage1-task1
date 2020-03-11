import org.junit.Test
import org.junit.Assert.assertArrayEquals
import subtask2.MiniMaxSum

class Task1MiniMaxSumTest {

    private val miniMaxSum = MiniMaxSum()

    @Test
    fun testMiniMaxSum1() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val result = intArrayOf(10, 14)
        assertArrayEquals(result, miniMaxSum.getResult(input))
    }

    @Test
    fun testMiniMaxSum2() {
        val input = intArrayOf(6, 2, 8, 15, 1)
        val result = intArrayOf(17, 31)
        assertArrayEquals(result, miniMaxSum.getResult(input))
    }

    @Test
    fun testMiniMaxSum3() {
        val input = intArrayOf(13, 2, 36, 48, 59, 0, 120)
        val result = intArrayOf(158, 278)
        assertArrayEquals(result, miniMaxSum.getResult(input))
    }

    @Test
    fun testMiniMaxSum4() {
        val input = intArrayOf(10, 2, 36, 484, 759, 103, 120, 34, 3, 90, 908)
        val result = intArrayOf(1641, 2547)
        assertArrayEquals(result, miniMaxSum.getResult(input))
    }
}
