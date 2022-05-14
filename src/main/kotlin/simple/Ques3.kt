import java.util.LinkedList

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0

    var maxLen = 0
    var tabs = mutableListOf<Char>()


    s.forEach {
        if (tabs.contains(it)) {
            if (tabs.size > maxLen) {
                maxLen = tabs.size
            }
            val index = tabs.lastIndexOf(it)
            tabs = tabs.subList(index + 1, tabs.size)

        }
        tabs.add(it)
    }
    if (tabs.size > maxLen) {
        maxLen = tabs.size
    }

    return maxLen
}