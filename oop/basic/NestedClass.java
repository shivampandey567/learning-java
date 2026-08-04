// A non-static nested class (inner class)
// belongs to an object of the outer class.

// To create an object of the inner class, you must 
// first create an object of the outer class.

package oop.basic;

class Car {
    String brand = "porche";

    // Non-Static Nested Class
    class Engine {
        void start() {
            System.out.println("Car Brand : " + brand);
            System.out.println("Engine Started");
        }

    }

}

public class NestedClass {
    public static void main(String[] args) {
        // Create Outer Class Object
        Car car = new Car();

        // Create Inner Class Object
        Car.Engine engine = car.new Engine();

        engine.start();
    }
}

// output:
// Car Brand : porche
// Engine Started