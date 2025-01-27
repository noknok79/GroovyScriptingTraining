// Mark Villanueva
// mark.a.b.villanueva
// Import the classes
import oops.Animal
import oops.Cat
import oops.Dog
import oops.DogProperty

// Example usage
def buddy = new DogProperty(name: 'Buddy', breed: 'Golden Retriever', age: 3, weight: 30.5, color: 'Golden')
println(buddy)
buddy.bark()
buddy.eat()
buddy.sleep()
buddy.play()

def whiskers = new Cat(name: 'Whiskers', age: 2)
whiskers.speak()
