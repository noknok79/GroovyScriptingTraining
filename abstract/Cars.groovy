// Mark Villanueva
// mark.a.b.villanueva
// Cars.groovy
package mypackage

abstract class Cars {
    String make
    String model
    int year

    Cars(String make, String model, int year) {
        this.make = make
        this.model = model
        this.year = year
    }

    abstract void displayInfo()
}
