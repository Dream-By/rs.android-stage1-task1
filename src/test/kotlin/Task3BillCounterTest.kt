import org.junit.Assert.assertEquals
import org.junit.Test
import task3.T3BillCounter

class Task3BillCounterTest {

    private val task3 = T3BillCounter()
    private val fairlySplit = "bon appetit"

    @Test
    fun testTask3BillCounter1() {
        val billArray = intArrayOf(10, 1, 9)
        assertEquals(fairlySplit, task3.calculateFairlySplit(billArray, 0, 5).toLowerCase())
    }

    @Test
    fun testTask3BillCounter2() {
        val billArray = intArrayOf(3, 10, 2, 9, 18, 25)
        assertEquals(fairlySplit, task3.calculateFairlySplit(billArray, 3, 29).toLowerCase())
    }

    @Test
    fun testTask3BillCounter3() {
        val billArray = intArrayOf(3, 10, 2, 9)
        assertEquals("5", task3.calculateFairlySplit(billArray, 1, 12).toLowerCase())
    }

    @Test
    fun testTask3BillCounter4() {
        val billArray = intArrayOf(3, 10, 2, 9, 18, 25 ,45)
        assertEquals("22", task3.calculateFairlySplit(billArray, 4, 69).toLowerCase())
    }
}