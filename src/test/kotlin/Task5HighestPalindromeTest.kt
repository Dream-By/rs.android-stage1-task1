import org.junit.Assert.assertEquals
import org.junit.Test
import task5.T5HighestPalindrome

class Task5HighestPalindromeTest {

    private val task5 = T5HighestPalindrome()

    @Test
    fun testTask5HighestPalindrome1() {
        assertEquals("2882", task5.highestValuePalindrome(4, 1, "2842"))
    }

    @Test
    fun testTask5HighestPalindrome2() {
        assertEquals("992299", task5.highestValuePalindrome(6, 3, "092282"))
    }

    @Test
    fun testTask5HighestPalindrome3() {
        assertEquals("-1", task5.highestValuePalindrome(11, 2, "58346739679"))
    }
}