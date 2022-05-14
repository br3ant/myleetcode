import simple.findMedianSortedArrays
import simple.twoSum
import java.lang.StringBuilder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println(findMedianSortedArrays(intArrayOf(1,1), intArrayOf(1,2)))
    }
}

fun IntArray.print() {
    println("[${this.joinToString(",")}]")
}