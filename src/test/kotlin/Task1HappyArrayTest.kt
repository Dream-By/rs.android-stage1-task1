import org.junit.Assert.assertArrayEquals
import org.junit.Test
import subtask1.HappyArray

class Task1HappyArrayTest {

    private val converter = HappyArray()

    @Test
    fun testTask1Array1() {
        val sadArray = intArrayOf(1, 5, 2, 7, 93, 8, 9, 3)
        val happyArray = intArrayOf(1, 2, 7, 8, 9, 3)
        assertArrayEquals(happyArray, converter.convertToHappy(sadArray))
    }

    @Test
    fun testTask1Array2() {
        val sadArray = intArrayOf(1, 2, 2, 9, 93, 2, 6, 9, 6, 10)
        val happyArray = intArrayOf(1, 2, 2, 2, 6, 9, 6, 10)
        assertArrayEquals(happyArray, converter.convertToHappy(sadArray))
    }

    @Test
    fun testTask1Array3() {
        val sadArray = intArrayOf(56, 32, 5, 31, 43, 55, 11, 87, 43, 62)
        val happyArray = intArrayOf(56, 32, 5, 11, 43, 62)
        assertArrayEquals(happyArray, converter.convertToHappy(sadArray))
    }

    @Test
    fun testTask1Array4() {
        val sadArray = intArrayOf(1, 2, 2, 9, 93, 2, 6, 8, 6, 12)
        val happyArray = intArrayOf(1, 2, 2, 2, 6, 8, 6, 12)
        assertArrayEquals(happyArray, converter.convertToHappy(sadArray))
    }

    @Test
    fun testTask1Array5() {
        val sadArray = intArrayOf(1, 3, 1)
        val happyArray = intArrayOf(1, 1)
        assertArrayEquals(happyArray, converter.convertToHappy(sadArray))
    }

    @Test
    fun testTask1Array6() {
        val sadArray = intArrayOf()
        val happyArray = intArrayOf()
        assertArrayEquals(happyArray, converter.convertToHappy(sadArray))
    }
}
