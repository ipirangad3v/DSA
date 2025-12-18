package digital.tonima.dataestructures

class LinkedList<T : Any?> constructor() {

    private var head: Node? = null
    private var tail: Node? = null
    private var length: Int = 0

    constructor(value: T) : this() {
        append(value)
    }

    inner class Node(
        var value: T,
    ) {
        var next: Node? = null

        override fun toString(): String {
            return "Value $value - Next ${next?.value}"
        }
    }

    // O(1) - constant operation since we have direct reference to tail
    fun append(value: T) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }
        length++
    }

    // O(1) - constant operation since we have direct reference to head
    fun prepend(value: T) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head = newNode
        }
        length++
    }

    // O(n) - linear operation since we need to traverse the list to find the second-to-last node
    fun removeLast(): Node? {
        if (length == 0) return null
        var temp = head
        var pre = head
        while (temp?.next != null) {
            pre = temp
            temp = temp.next
        }
        tail = pre
        tail?.next = null
        length--
        if (length == 0) {
            head = null
            tail = null
            return null
        }
        return temp

    }

    // O(1) - constant operation since we only modify the head pointer
    fun removeFirst(): Node? {
        if (length == 0) return null
        val lastHead = head
        head = lastHead?.next
        lastHead?.next = null
        length--
        if (length == 0) tail = null
        return lastHead
    }

    // O(n) - linear operation since we traverse up to the index position
    fun get(index: Int): Node? {
        if (index < 0 || index >= length) return null
        var temp = head
        for (i in 0 until index) {
            temp = temp?.next
        }
        return temp
    }

    // O(n) - linear operation since we traverse up to the index position
    fun set(index: Int, value: T): Boolean {
        get(index)?.let {
            it.value = value
            return true
        }
        return false
    }

    fun printList() {
        println("Items:")
        var temp = head
        while (temp != null) {
            println("${temp.value}" + " next value: ${temp.next?.value}")
            temp = temp.next
        }
    }

    fun getHead() {
        println("Head points to ${head?.value}")
    }

    fun getTail() {
        println("Tail points to ${tail?.value}")
    }

    fun getLength() {
        println("Length is $length")
    }

    fun printAll() {
        println("LinkedList Info:")
        printList()
        getHead()
        getTail()
        getLength()
    }
}
