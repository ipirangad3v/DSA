package digital.tonima.algorithms.linkedlist

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * Test cases for LeetCode #1290 - Convert Binary Number in a Linked List to Integer
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
class BinaryLinkedListToDecimalTest {

    private val solution = BinaryLinkedListToDecimal()

    // Helper function to create a linked list from an array
    private fun createLinkedList(values: IntArray): ListNode? {
        if (values.isEmpty()) return null
        val head = ListNode(values[0])
        var current = head
        for (i in 1 until values.size) {
            current.next = ListNode(values[i])
            current = current.next!!
        }
        return head
    }

    @Test
    fun `test getDecimalValue - LeetCode Example 1`() {
        // Input: head = [1,0,1]
        // Output: 5
        // Explanation: (101) in base 2 = (5) in base 10
        val head = createLinkedList(intArrayOf(1, 0, 1))
        val result = solution.getDecimalValue(head)
        assertEquals(5, result)
    }

    @Test
    fun `test getDecimalValue - LeetCode Example 2`() {
        // Input: head = [0]
        // Output: 0
        val head = createLinkedList(intArrayOf(0))
        val result = solution.getDecimalValue(head)
        assertEquals(0, result)
    }

    @Test
    fun `test getDecimalValue - LeetCode Example 3`() {
        // Input: head = [1]
        // Output: 1
        val head = createLinkedList(intArrayOf(1))
        val result = solution.getDecimalValue(head)
        assertEquals(1, result)
    }

    @Test
    fun `test getDecimalValue - binary 10011`() {
        // Input: head = [1,0,0,1,1]
        // Output: 19
        // Explanation: (10011) in base 2 = (19) in base 10
        val head = createLinkedList(intArrayOf(1, 0, 0, 1, 1))
        val result = solution.getDecimalValue(head)
        assertEquals(19, result)
    }

    @Test
    fun `test getDecimalValue - binary 11111`() {
        // Input: head = [1,1,1,1,1]
        // Output: 31
        // Explanation: (11111) in base 2 = (31) in base 10
        val head = createLinkedList(intArrayOf(1, 1, 1, 1, 1))
        val result = solution.getDecimalValue(head)
        assertEquals(31, result)
    }

    @Test
    fun `test getDecimalValue - binary 10000`() {
        // Input: head = [1,0,0,0,0]
        // Output: 16
        // Explanation: (10000) in base 2 = (16) in base 10
        val head = createLinkedList(intArrayOf(1, 0, 0, 0, 0))
        val result = solution.getDecimalValue(head)
        assertEquals(16, result)
    }

    @Test
    fun `test getDecimalValue - binary 1111111111`() {
        // Input: head = [1,1,1,1,1,1,1,1,1,1]
        // Output: 1023
        // Explanation: (1111111111) in base 2 = (1023) in base 10
        // Tests larger binary numbers
        val head = createLinkedList(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1))
        val result = solution.getDecimalValue(head)
        assertEquals(1023, result)
    }

    @Test
    fun `test getDecimalValue - empty list returns 0`() {
        // Input: head = null
        // Output: 0
        val result = solution.getDecimalValue(null)
        assertEquals(0, result)
    }

    @Test
    fun `test getDecimalValue - single node with zero`() {
        // Input: head = [0]
        // Output: 0
        val head = createLinkedList(intArrayOf(0))
        val result = solution.getDecimalValue(head)
        assertEquals(0, result)
    }

    @Test
    fun `test getDecimalValue - alternating bits 10101010`() {
        // Input: head = [1,0,1,0,1,0,1,0]
        // Output: 170
        // Explanation: (10101010) in base 2 = (170) in base 10
        val head = createLinkedList(intArrayOf(1, 0, 1, 0, 1, 0, 1, 0))
        val result = solution.getDecimalValue(head)
        assertEquals(170, result)
    }
}

