// Mark Villanueva
// mark.a.b.Villanueva

class LoopExamples {
    void printExamples() {
        // For Loop
        println "For Loop:"
        for (i in 0..<5) println "i: ${i}"

        // For-in Loop
        println "For-in Loop:"
        [1, 2, 3, 4, 5].each { println "item: ${it}" }

        // Using 1.upto
        println "Using 1.upto"
        1.upto(5) { println "$it" }

        // Using 5.times
        println "Using 5.times"
        5.times { println "$it" }

        // Using 1.step(10, 2)
        println "Using 1.step(10, 2)"
        1.step(10, 2) { println "$it" }

        // Map Loop
        println "Map Loop"
        [name: "Groovy", version: "3.0.7", type: "Programming Language"].each { k, v -> println "$k: $v" }

        // While loop
        println "While Loop:"
        def count = 0
        while (count < 5) println "count: ${count++}"
    }
}

new LoopExamples().printExamples()