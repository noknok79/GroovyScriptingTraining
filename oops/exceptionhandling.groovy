// Mark Villanueva
// mark.a.b.villanueva

class CustomException extends Exception {
    CustomException(String message) {
        super(message)
    }
}

class ExceptionHandlingExamples {
    void printExamples() {
        try { def result = 10 / 0 } catch (ArithmeticException e) { println "Caught an ArithmeticException: ${e.message}" }
        try { def result = 10 / 0 } catch (ArithmeticException e) { println "Caught an ArithmeticException: ${e.message}" } finally { println "This block is always executed" }
        try { def result = "abc".toInteger() } catch (NumberFormatException e) { println "Caught a NumberFormatException: ${e.message}" } catch (Exception e) { println "Caught a general exception: ${e.message}" }
        try { throw new IllegalArgumentException("Invalid argument") } catch (IllegalArgumentException e) { println "Caught an IllegalArgumentException: ${e.message}" }
        try { throw new CustomException("This is a custom exception") } catch (CustomException e) { println "Caught a CustomException: ${e.message}" }
    }
}

new ExceptionHandlingExamples().printExamples()