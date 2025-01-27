// Mark Villanueva
// mark.a.b.villanueva
// Toyota.groovy
package mypackage

class Toyota extends Cars {
    String variant

    Toyota(String model, int year, String variant) {
        super("Toyota", model, year)
        this.variant = variant
    }

    @Override
    void displayInfo() {
        println "Car Make: ${make}"
        println "Car Model: ${model}"
        println "Year: ${year}"
        println "Variant: ${variant}"
    }
}
