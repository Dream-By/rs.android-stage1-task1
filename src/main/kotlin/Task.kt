class Task {

    fun isAndroid(string: String): Boolean {
        return string == ANDROID_STRING
    }

    private companion object {
        private const val ANDROID_STRING = "Android"
    }
}