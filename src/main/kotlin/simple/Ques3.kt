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
            //窗口管理应该还有更优解
            tabs = tabs.drop(index + 1).toMutableList()
        }
        tabs.add(it)
    }
    if (tabs.size > maxLen) {
        maxLen = tabs.size
    }

    return maxLen
}