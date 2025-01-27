// Mark Villanueva
// mark.a.b.villanueva
class Person {
    String name
    int age
}

class ClosureExamples {
    void printExamples() {
        def greet = { println "Hello, World!" }
        greet()

        def greetWithName = { name -> println "Hello, ${name}!" }
        greetWithName("John")

        def add = { a, b -> a + b }
        println "Sum: ${add(5, 3)}"

        def greetWithDefault = { name = "Guest" -> println "Hello, ${name}!" }
        greetWithDefault(); greetWithDefault("Jane")

        def square = { x -> x * x }
        println "Square of 4: ${square(4)}"

        [1, 2, 3, 4, 5].each { println "Item: ${it}" }

        def person = new Person(name: "John", age: 30)
        def printPersonDetails = { println "Name: ${name}, Age: ${age}" }
        printPersonDetails.delegate = person; printPersonDetails()

        def multiply = { a, b -> a * b }
        println "Double of 5: ${multiply.curry(2)(5)}"
    }
}

new ClosureExamples().printExamples()