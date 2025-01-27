// Mark Villanueva
// mark.a.b.villanueva
class RangeExamples {
    void printExamples() {
        def range1 = 1..10, range2 = 'a'..'f'
        println "Range 1: ${range1}"; println "Range 2: ${range2}"

        println "First element of range1: ${range1[0]}"; println "Last element of range2: ${range2[-1]}"

        println "Iterating over range1:"; range1.each { println it }

        println "Iterating over range1 with for loop:"
        for (i in range1) println i

        println "Iterating over range2 with for loop:"
        for (i in range2) println i

        println "Is 5 in range1? ${5 in range1}"; println "Is 'd' in range2? ${'d' in range2}"

        println "Size of range1: ${range1.size()}"; println "Size of range2: ${range2.size()}"

        println "Subrange of range1 (2..5): ${range1[2..5]}"; println "Reversed range1: ${range1.reverse()}"

        def age = 25, ageGroup = ''
        switch (age) {
            case 0..12: ageGroup = 'Child'; break
            case 13..19: ageGroup = 'Teenager'; break
            case 20..59: ageGroup = 'Adult'; break
            case 60..100: ageGroup = 'Senior'; break
            default: ageGroup = 'Unknown'
        }
        println "Age group: ${ageGroup}"
    }
}

new RangeExamples().printExamples()