package digital.tonima.dataestructures

fun main() {
    val linkedList = LinkedList<Int>()
    linkedList.printAll()

    linkedList.append(20)
    linkedList.append(100)
    linkedList.append(200)


    println(linkedList.removeLast())
    linkedList.printAll()
}

