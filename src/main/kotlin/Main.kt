import simple.twoSum
import java.lang.StringBuilder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(lengthOfLongestSubstring("dvcdf"))
    }
}

fun IntArray.print() {
    println("[${this.joinToString(",")}]")
}