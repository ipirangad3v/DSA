package digital.tonima.algorithms.linkedlist

/**
 * LeetCode #1290 - Convert Binary Number in a Linked List to Integer
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
class BinaryLinkedListToDecimal {
    /**
     * Converts a binary number represented as a linked list to its decimal value
     * Time Complexity: O(n) - single pass through the linked list where n is the number of nodes
     * Space Complexity: O(1) - only using constant extra space
     *
     * Algorithm: Bit manipulation approach
     * - Iterate through each node in the linked list
     * - Shift the current result left by 1 (multiply by 2)
     * - Add the current bit value using bitwise OR
     * - Example: binary 101 -> ((0 << 1 | 1) << 1 | 0) << 1 | 1 = 5
     */
    fun getDecimalValue(head: ListNode?): Int {
        var num = 0
        var current = head

        while (current != null) {
            num = (num shl 1) or current.`val`

            current = current.next
        }

        return num
    }
}
