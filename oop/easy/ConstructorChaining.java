package oop.easy;

class Car {

    String name;
    int speed;

    // Constructor 1
    Car() {

        // Calls Constructor 2
        this("porche");

        System.out.println("Default Constructor Called");

    }

    // Constructor 2
    Car(String name) {
        
        // Calls Constructor 3
        this(name, 357);

        System.out.println("One Parameter Constructor Called");

    }

    // Constructor 3
    Car(String name, int speed) {

        this.name = name;
        this.speed = speed;

        System.out.println("Two Parameter Constructor Called");

    }

    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Car c1=new Car();

        c1.display();
    }
}

// output:
// Two Parameter Constructor Called
// One Parameter Constructor Called
// Default Constructor Called
// name: porche, speed: 357