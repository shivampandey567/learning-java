// A static nested class is a class inside another class that is declared with the static keyword.
// Unlike a normal inner class, a static nested class does not need an object of the outer class to be created.
// A class can be static only if it is inside another class.
// java dont allow to create a static top level class.

package oop.keyword;

class Car {
    static class Engine {
        void start() {
            System.out.println("Engine Started");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(); // creating a nested object

        engine.start();
    }
}

// output:
// Engine Started