// Mark Villanueva
// mark.a.b.villanueva
class FileHandlingExamples {
    static void main(args) {
        def examples = new FileHandlingExamples()
        examples.createExampleFile()
        examples.createDeleteMeFile()
        examples.createSourceFile()
        examples.readFile()
        examples.writeFile()
        examples.appendFile()
        examples.copyFile()
        examples.deleteFile()
        examples.appendToAllFiles()
    }

    void createExampleFile() {
        new File('example.txt').withWriter('UTF-8') { it.writeLine('This is an example file.\nIt contains multiple lines of text.') }
        println "Created 'example.txt' with sample content."
    }

    void createDeleteMeFile() {
        new File('delete_me.txt').withWriter('UTF-8') { it.writeLine('This file will be deleted.') }
        println "Created 'delete_me.txt' with sample content."
    }

    void createSourceFile() {
        new File('source.txt').withWriter('UTF-8') { it.writeLine('This is the source file.\nIt will be copied to another file.') }
        println "Created 'source.txt' with sample content."
    }

    void readFile() {
        println "Reading file 'example.txt':"
        new File('example.txt').eachLine { println it }
    }

    void writeFile() {
        new File('output.txt').withWriter('UTF-8') { it.writeLine('Hello, World!') }
        println "Written to 'output.txt': Hello, World!"
    }

    void appendFile() {
        new File('output.txt').append('Appending this line.\n')
        println "Appended to 'output.txt': Appending this line."
    }

    void copyFile() {
        try {
            new File('destination.txt') << new File('source.txt').text
            println "Copied from 'source.txt' to 'destination.txt'."
        } catch (FileNotFoundException e) {
            println "Caught: ${e}"
        }
    }

    void deleteFile() {
        def fileToDelete = new File('delete_me.txt')
        if (fileToDelete.exists()) fileToDelete.delete() else println "'delete_me.txt' does not exist."
    }

    void appendToAllFiles() {
        ['example.txt', 'delete_me.txt', 'source.txt', 'output.txt'].each {
            new File(it).append('The quick brown fox jumps over the lazy dog.\n')
            println "Appended to '${it}': The quick brown fox jumps over the lazy dog."
        }
    }
}