// A Local Inner Class is declared inside a method.
// It can only be used inside that method.

package oop.hard;

class Car {

    void display() {

        class Engine {
            void start() {
                System.out.println("engine started");
            }
        }

        Engine engine = new Engine();

        engine.start();

    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Car car = new Car();

        car.display();
    }
}

// output:
// engine started