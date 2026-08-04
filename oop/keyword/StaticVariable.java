// static variable belongs to the class.
// static variable is a shared variable whereas instance variable is seperate for each object

package oop.keyword;

class Car {
    String name;

    static int wheels = 4;

    Car(String name) {
        this.name = name;
    }

    void display() {
        // preferred way is to use Car.wheels not this.wheels and wheels
        System.out.println("car: " + this.name + ", wheels: " + Car.wheels);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Car c1 = new Car("porche");
        c1.display();
        System.out.println(Car.wheels);
    }
}

// output:
// car: porche, wheels: 4
// 4