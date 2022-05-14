package simple

fun twoSum(nums: IntArray, target: Int): IntArray {
    nums.forEachIndexed { index_i, i ->
        nums.forEachIndexed { index_j, j ->
            if (index_i != index_j) {
                if (i + j == target) {
                    return intArrayOf(index_i, index_j)
                }
            }
        }
    }
    return intArrayOf()
}


