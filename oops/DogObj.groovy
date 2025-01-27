// Mark Villanueva
// mark.a.b.villanueva
package oops

// Import the classes
import oops.Animal
import oops.Dog

// Example usage
def animal = new Animal(name: 'Generic Animal')
animal.makeSound() // Output: Generic Animal makes a sound.

def dog = new Dog(name: 'Buddy', breed: 'Golden Retriever')
dog.makeSound() // Output: Buddy barks.
dog.fetch() // Output: Buddy is fetching the ball.
