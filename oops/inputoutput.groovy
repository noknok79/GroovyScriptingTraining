// Mark Villanueva
// mark.a.b.villanueva
class InputOutputExamples {
    void printExamples() {
        // Reading from the console and writing to input.txt
        println "Enter your name:"
        def name = System.console().readLine()
        def inputFile = new File('input.txt')
        if (!inputFile.exists()) {
            inputFile.createNewFile()
            println "input.txt created."
        }
        inputFile.withWriterAppend('UTF-8') { it.writeLine(name) }
        println "Appended to input.txt: ${name}"

        // Reading from input.txt
        println inputFile.exists() ? "Reading from input.txt:" : "input.txt does not exist."
        inputFile.eachLine { println it }

        // Writing to a file
        def outputFile = new File('output.txt')
        outputFile.withWriter('UTF-8') { it.writeLine("Hello, World!") }
        println "Written to output.txt: Hello, World!"

        // Appending to a file
        def newData = 'Appending this line.'
        outputFile.append("${newData}\n")
        println "Appended to output.txt: ${newData}"

        // Copying a file
        def sourceFile = new File('source.txt')
        def destinationFile = new File('destination.txt')
        println sourceFile.exists() ? "Copied from source.txt to destination.txt." : "source.txt does not exist."
        if (sourceFile.exists()) destinationFile.text = sourceFile.text

        // Echo the newly appended data from input.txt
        println "Newly appended data in input.txt:"
        inputFile.eachLine { println it }

        // Deleting a file
        def fileToDelete = new File('delete_me.txt')
        println fileToDelete.exists() ? "delete_me.txt deleted." : "delete_me.txt does not exist."
        if (fileToDelete.exists()) fileToDelete.delete()
    }
}

new InputOutputExamples().printExamples()