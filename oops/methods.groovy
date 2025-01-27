// Mark Villanueva
// mark.a.b.Villanueva

class MethodExamples {
    def sayHello() { println "Hello, World!" }
    def greet(name) { println "Hello, ${name}!" }
    def add(a, b) { a + b }
    def greetWithDefault(name = "Guest") { println "Hello, ${name}!" }
    def sum(Object[] numbers) { numbers.sum() }
    def printPersonDetails(params) { println "Name: ${params.name}, Age: ${params.age}, City: ${params.city}" }

    void printExamples() {
        sayHello()
        greet("John")
        println "Sum: ${add(5, 3)}"
        greetWithDefault()
        greetWithDefault("Jane")
        println "Total sum: ${sum(1, 2, 3, 4, 5)}"
        printPersonDetails(name: "John", age: 30, city: "New York")
    }
}

new MethodExamples().printExamples()