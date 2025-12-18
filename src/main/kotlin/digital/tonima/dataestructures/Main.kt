package digital.tonima.dataestructures

fun main() {
    val linkedList = LinkedList<Int>()
    linkedList.printAll()

    linkedList.append(20)
    linkedList.append(100)
    linkedList.append(200)


    println(linkedList.removeLast())
    linkedList.prepend(1)
    linkedList.prepend(2)
    println(linkedList.removeFirst())
    linkedList.printAll()


    println("Getting items")
    println(linkedList.get(-1))
    println(linkedList.get(0))
    println(linkedList.get(1))
    println(linkedList.get(2))
    println(linkedList.get(3))


    println(linkedList.set(10,20))
    println(linkedList.set(0,20))
    linkedList.printAll()
}

