// Common Object class methods:
// toString()
// getClass()
// hashCode()

package oop.medium;

class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car obj = new Car("truck");

        // Object class methods
        System.out.println(car.toString());

        System.out.println(car.getClass());

        System.out.println(car.hashCode());

        System.out.println(car.equals(obj));
    }
}

// output:
// oop.medium.Car@7ad041f3
// class oop.medium.Car
// 2060468723
// false