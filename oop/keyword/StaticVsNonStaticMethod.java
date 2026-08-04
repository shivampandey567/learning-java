// A non-static method can directly call a static method because the class already exists.
// A static method cannot directly call a non-static method because the object is not created yet,
// To call a non-static method by a static method we need to create a object inside the method first.

package oop.keyword;

class CarA {
    static void start() {
        System.out.println("car started");
    }

    void drive() {
        start(); // Directly calling static method

        System.out.println("car is running");
    }
}

class CarB {
    void drive() {
        System.out.println("car is running");
    }

    static void start() {
        // drive(); ❌ Compile-time Error cannot call directly a non-static method
    }
}

class CarC {
    void drive() {
        System.out.println("car is running");
    }

    static void start() {
        CarC car = new CarC(); // creating a object first to call non-static method

        car.drive();
    }
}

public class StaticVsNonStaticMethod {
    public static void main(String[] args) {
        // calling a non static method
        CarA c1 = new CarA();
        c1.drive();

        // calling a static method
        CarB c2 = new CarB();
        c2.start();

        // calling a static method
        CarC c3 = new CarC();
        c3.start();
    }
}

// output:
// car started
// car is running
// car is running