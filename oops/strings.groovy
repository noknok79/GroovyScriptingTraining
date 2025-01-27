// Mark Villanueva
// mark.a.b.Villanueva

class StringExamples {
    void printExamples() {
        def greeting = "Hello, World!"
        println greeting

        def firstName = "John", lastName = "Doe"
        println "Full name: ${firstName + " " + lastName}"

        def multilineString = """This is a
                                 multiline
                                 string."""
        println multilineString
        println multilineString.length()
        println firstName[1]
        println lastName[-1]
        println lastName.indexOf('o')
        println firstName.indexOf('h')

        def age = 30
        println "My name is ${firstName} ${lastName} and I am ${age} years old."

        def originalString = "Groovy Programming"
        println "Uppercase: ${originalString.toUpperCase()}"
        println "Lowercase: ${originalString.toLowerCase()}"
        println "Substring: ${originalString.substring(0, 6)}"
        println "Length: ${originalString.length()}"

        def path = /C:\Users\JohnDoe\Documents/
        println "Slashy string path: ${path}"

        def regex = $/(\d{3})-(\d{2})-(\d{4})/$
        println "Dollar slashy string regex: ${regex}"
    }
}

new StringExamples().printExamples()