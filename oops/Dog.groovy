// Mark Villanueva
// mark.a.b.villanueva
package oops

// Define the child class 'Dog' that inherits from 'Animal'
class Dog extends Animal {
    String breed

    // Override the makeSound method to be specific for dogs
    @Override
    def makeSound() {
        println("${name} barks.")
    }

    // Add a specific method for dogs
    def fetch() {
        println("${name} is fetching the ball.")
    }
}
