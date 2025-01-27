// Mark Villanueva
// mark.a.b.Villanueva

class DataTypeExamples {
    void printExamples() {
        // Integer
        def integerExample = 42, integerMin = Integer.MIN_VALUE, integerMax = Integer.MAX_VALUE
        println "Integer: ${integerExample}, Min: ${integerMin}, Max: ${integerMax}"

        // Float
        def floatExample = 3.14, floatMin = Float.MIN_VALUE, floatMax = Float.MAX_VALUE
        println "Float: ${floatExample}, Min: ${floatMin}, Max: ${floatMax}"

        // Double
        def doubleExample = 3.141592653589793, doubleMin = Double.MIN_VALUE, doubleMax = Double.MAX_VALUE
        println "Double: ${doubleExample}, Min: ${doubleMin}, Max: ${doubleMax}"

        // String
        def stringExample = "Hello, Groovy!"
        println "String: ${stringExample}"

        // Boolean
        def booleanExample = true, booleanMin = false, booleanMax = true
        println "Boolean: ${booleanExample}, Min: ${booleanMin}, Max: ${booleanMax}"

        // List
        def listExample = [1, 2, 3, 4, 5]
        println "List: ${listExample}"

        // Map
        def mapExample = [name: "Groovy", version: "3.0.7"]
        println "Map: ${mapExample}"

        // Byte
        def byteExample = (byte) 127, byteMin = Byte.MIN_VALUE, byteMax = Byte.MAX_VALUE
        println "Byte: ${byteExample}, Min: ${byteMin}, Max: ${byteMax}"

        // Char
        def charExample = 'A' as char, charMin = Character.MIN_VALUE, charMax = Character.MAX_VALUE
        println "Char: ${charExample}, Min: ${charMin}, Max: ${charMax}"

        // Short
        def shortExample = (short) 32000, shortMin = Short.MIN_VALUE, shortMax = Short.MAX_VALUE
        println "Short: ${shortExample}, Min: ${shortMin}, Max: ${shortMax}"

        // Long
        def longExample = 123456789L, longMin = Long.MIN_VALUE, longMax = Long.MAX_VALUE
        println "Long: ${longExample}, Min: ${longMin}, Max: ${longMax}"

        // Closure
        def closureExample = { param -> println "Hello, ${param}!" }
        closureExample("World")
    }
}

new DataTypeExamples().printExamples()