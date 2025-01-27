// Mark Villanueva
// mark.a.b.villanueva
class ListExamples {
    void printExamples() {
        def list = [1, 2, 3, 4, 5]
        println "List: ${list}"

        list << 6; list.add(7)
        println "After adding elements: ${list}"

        list.remove(0); list.remove((Integer) 3)
        println "After removing elements: ${list}"

        println "First element: ${list[0]}"
        println "Last element: ${list[-1]}"

        println "Iterating over list:"
        list.each { println it }

        def found = list.find { it > 4 }
        println "First element greater than 4: ${found}"

        def filtered = list.findAll { it > 4 }
        println "All elements greater than 4: ${filtered}"

        def sorted = list.sort()
        println "Sorted list: ${sorted}"

        def reversed = list.reverse()
        println "Reversed list: ${reversed}"

        def list2 = [8, 9, 10]
        println "Combined list: ${list + list2}"
        println "Intersected list: ${list.intersect(list2)}"
        println "Subtracted list: ${list - list2}"
    }
}

new ListExamples().printExamples()