package digital.tonima.dataestructures

class LinkedList<T : Any?>(
    value: T
) {
    private var head: Node? = null
    private var tail: Node? = null
    private var length: Int = 0

    init {
        append(value)
    }

    inner class Node(
        val value: T,
    ) {
        var next: Node? = null
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
