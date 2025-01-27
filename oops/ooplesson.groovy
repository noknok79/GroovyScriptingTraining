// Mark Villanueva
// mark.a.b.villanueva
// Define a base class for fruits
class Fruit {
    String name, color
    void describe() { println "${name} is ${color}." }
}

// Define subclasses for fruits
class Apple extends Fruit {
    String variety
    void describe() { println "${name} is a ${color} ${variety} apple." }
    void displayInfo() { println "Name: ${name}, Color: ${color}, Variety: ${variety}" }
}

class Banana extends Fruit {
    int length
    void describe() { println "${name} is a ${color} banana, ${length} cm long." }
    void displayInfo() { println "Name: ${name}, Color: ${color}, Length: ${length} cm" }
}

class Orange extends Fruit {
    String taste
    void describe() { println "${name} is a ${color} orange and tastes ${taste}." }
    void displayInfo() { println "Name: ${name}, Color: ${color}, Taste: ${taste}" }
}

// Define a class with a static method for fruits
class FruitBasket {
    static void add(Fruit fruit) {
        println "Adding ${fruit.name} to the basket..."
        fruit.describe()
    }
}

// Define a base class for cars
class Car {
    String brand, color
    void describe() { println "The ${brand} car is ${color}." }
}

// Define subclasses for cars
class Sedan extends Car {
    String model
    void describe() { println "The ${brand} ${model} sedan is ${color}." }
    void displayInfo() { println "Brand: ${brand}, Model: ${model}, Color: ${color}" }
}

class SUV extends Car {
    int seatingCapacity
    void describe() { println "The ${brand} SUV with seating capacity of ${seatingCapacity} is ${color}." }
    void displayInfo() { println "Brand: ${brand}, Seating Capacity: ${seatingCapacity}, Color: ${color}" }
}

// Define a class with a static method for cars
class Garage {
    static void park(Car car) {
        println "Parking the ${car.brand} car..."
        car.describe()
    }
}

// Define a base class for animals
class Animal {
    String name, type
    void move() { println "${name} the ${type} moves." }
}

// Define subclasses for animals
class Dog extends Animal {
    void move() { println "${name} the ${type} runs." }
    void displayInfo() { println "Name: ${name}, Type: ${type}" }
}

class Bird extends Animal {
    void move() { println "${name} the ${type} flies." }
    void displayInfo() { println "Name: ${name}, Type: ${type}" }
}

// Define a class with a static method for animals
class Zoo {
    static void add(Animal animal) {
        println "Adding ${animal.name} the ${animal.type} to the zoo..."
        animal.move()
    }
}

// Create instances of the subclasses for fruits
def apple = new Apple(name: "Honeycrisp", color: "red", variety: "Honeycrisp")
def banana = new Banana(name: "Plantain", color: "green", length: 25)
def orange = new Orange(name: "Navel", color: "orange", taste: "sweet")

// Call methods on the instances for fruits
[apple, banana, orange].each {
    it.displayInfo()
    it.describe()
    FruitBasket.add(it)
}

// Create instances of the subclasses for cars
def sedan = new Sedan(brand: "Toyota", color: "blue", model: "Camry")
def suv = new SUV(brand: "Ford", color: "black", seatingCapacity: 7)

// Call methods on the instances for cars
[sedan, suv].each {
    it.displayInfo()
    it.describe()
    Garage.park(it)
}

// Create instances of the subclasses for animals
def dog = new Dog(name: "Buddy", type: "dog")
def bird = new Bird(name: "Tweety", type: "bird")

// Call methods on the instances for animals
[dog, bird].each {
    it.displayInfo()
    it.move()
    Zoo.add(it)
}