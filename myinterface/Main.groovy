// Mark Villanueva
// mark.a.b.villanueva
package myinterface

import myinterface.Car
import myinterface.Toyota
import myinterface.Honda

class Main {
    static void main(String[] args) {
        Car myToyota = new Toyota()
        Car myHonda = new Honda()

        println "Testing Toyota car:"
        myToyota.start()
        myToyota.stop()

        println "\nTesting Honda car:"
        myHonda.start()
        myHonda.stop()
    }
}
