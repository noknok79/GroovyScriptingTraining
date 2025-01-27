// Mark Villanueva
// mark.a.b.villanueva

class Greeting {
    void sayHello() { println 'Hello, World!' }
    void displayHostname() { println "Hostname: " + InetAddress.localHost.hostName }
    void printClassName() { println "Class Name: " + this.getClass().getName() }
}

def greeting = new Greeting()
greeting.sayHello()
greeting.displayHostname()
greeting.printClassName()

def languageName = "Groovy", currentYear = 2023, isActiveStatus = true
println "Language Name: ${languageName}"
println "Current Year: ${currentYear}"
println "Is Active Status: ${isActiveStatus}"

def groovyVersion = "3.0.7"
println "Groovy Version: ${groovyVersion}"