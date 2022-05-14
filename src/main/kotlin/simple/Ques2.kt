fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var carry: Int = 0
    var first = l1
    var second = l2
    val root = ListNode(0)
    var cursor = root
    while (first != null || second != null || carry != 0) {
        val sum = (first?.`val` ?: 0) + (second?.`val` ?: 0) + carry
        carry = sum / 10
        val next = ListNode(sum % 10)
        cursor.next = next
        cursor = next


        first = first?.next
        second = second?.next

    }
    return root.next
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}