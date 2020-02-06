import org.junit.Test

class TaskTest {

    @Test
    fun testIsAndroid() {
        val task = Task()
        assert(task.isAndroid("Android"))
    }
}