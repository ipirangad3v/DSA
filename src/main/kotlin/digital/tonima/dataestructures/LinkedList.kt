package digital.tonima.dataestructures

class LinkedList<T : Any?> constructor() {

    private var head: Node? = null
    private var tail: Node? = null
    private var length: Int = 0

    constructor(value: T) : this() {
        append(value)
    }

    inner class Node(
        val value: T,
    ) {
        var next: Node? = null

        override fun toString(): String {
            return "Value $value - Next ${next?.value}"
        }
    }

    fun append(value: T) {
        val newNode = Node(value)
        if (length == 0) {
            head = newNode
        }
        tail?.next = newNode
        tail = newNode
        length++
    }

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
