package digital.tonima.dataestructures

fun main() {
    val linkedList = LinkedList<Int>(20)
    linkedList.printAll()

    linkedList.append(20)
    linkedList.append(100)
    linkedList.append(200)

    linkedList.printAll()
}

