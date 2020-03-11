import org.junit.Assert.assertEquals
import org.junit.Test
import subtask5.HighestPalindrome

class Task1HighestPalindromeTest {

    private val palindromeFinder = HighestPalindrome()

    @Test
    fun testTask5HighestPalindrome1() {
        assertEquals("2882", palindromeFinder.highestValuePalindrome(4, 1, "2842"))
    }

    @Test
    fun testTask5HighestPalindrome2() {
        assertEquals("992299", palindromeFinder.highestValuePalindrome(6, 3, "092282"))
    }

    @Test
    fun testTask5HighestPalindrome3() {
        assertEquals("-1", palindromeFinder.highestValuePalindrome(11, 2, "58346739679"))
    }
}
