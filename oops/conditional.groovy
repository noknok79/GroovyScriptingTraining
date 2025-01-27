// Mark Villanueva
// mark.a.b.Villanueva
class ConditionalOperatorsExamples {
    void printExamples() {
        def num1 = 10, num2 = 5

        // If-Else
        println num1 > num2 ? "num1 is greater than num2" : num1 < num2 ? "num1 is less than num2" : "num1 is equal to num2"

        // Switch
        def grade = 'A'
        switch (grade) {
            case 'A': println "Excellent"; break
            case 'B': println "Good"; break
            case 'C': println "Average"; break
            case 'D': println "Below Average"; break
            case 'F': println "Fail"; break
            default: println "Invalid Grade"
        }

        // Ternary Operator
        println "Ternary Operator Result: ${num1 > num2 ? 'num1 is greater' : 'num2 is greater or equal'}"

        // Elvis Operator
        def name = null
        println "Elvis Operator Result: ${name ?: 'Default Name'}"
    }
}

new ConditionalOperatorsExamples().printExamples()