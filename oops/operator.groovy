// Mark Villanueva
// mark.a.b.Villanueva

class OperatorExamples {
    void printExamples() {
        def num1 = 10, num2 = 5
        println "Addition: ${num1 + num2}"
        println "Subtraction: ${num1 - num2}"
        println "Multiplication: ${num1 * num2}"
        println "Division: ${num1 / num2}"
        println "Modulus: ${(num1 as int) % (num2 as int)}"
        println "Exponentiation: ${num1 ** num2}"
        println "Is Equal: ${num1 == num2}"
        println "Is Not Equal: ${num1 != num2}"
        println "Is Greater: ${num1 > num2}"
        println "Is Less: ${num1 < num2}"
        println "Is Greater Or Equal: ${num1 >= num2}"
        println "Is Less Or Equal: ${num1 <= num2}"
        println "AND Operator: ${(num1 > 0) && (num2 > 0)}"
        println "OR Operator: ${(num1 > 0) || (num2 < 0)}"
        println "NOT Operator: ${!(num1 > 0)}"
        println "Precedence Example: ${num1 + num2 * num2}"
        println "Short-Circuit AND: ${(num1 > 0) && (num2 > 10)}"
        println "Short-Circuit OR: ${(num1 > 0) || (num2 > 10)}"
        println "Bitwise AND: ${num1 & num2}"
        println "Bitwise OR: ${num1 | num2}"
        println "Bitwise XOR: ${num1 ^ num2}"
        println "Bitwise Negation: ${~num1}"
        println "Left Shift: ${num1 << 2}"
        println "Right Shift: ${num1 >> 2}"
        println "Unsigned Right Shift: ${num1 >>> 2}"
        def assign = num1
        println "Assign: ${assign}"
        println "Add and Assign: ${assign += num2}"
        println "Subtract and Assign: ${assign -= num2}"
        println "Multiply and Assign: ${assign *= num2}"
        println "Divide and Assign: ${assign = (assign / num2) as int}"
        println "Modulus and Assign: ${assign = (assign % num2) as int}"
        println "Exponentiation and Assign: ${assign = (assign ** num2) as int}"
    }
}

new OperatorExamples().printExamples()