// Mark Villanueva
// mark.a.b.villanueva
package oops

class Cat extends Animal {
    
    Cat(String name, int age) {
        super(name, age)
    }
    
    @Override
    void makeSound() {
        println "${name} says: Meow!"
    }
    
    void purr() {
        println "${name} is purring..."
    }
}
