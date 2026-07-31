package oop.medium;

class Car {
    String name;
    int speed;
    String color;

    // default constructor
    Car() {
        System.out.println("hello welcome to the car factory");
    }

    void display() {
        System.out.println("name: " + name + ", speed: " + speed + ", color: " + color);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        // constructor is calling automatically first
        Car c1 = new Car();

        c1.name = "porche";
        c1.speed = 357;
        c1.color = "red";

        c1.display();
    }
}

// output:
// hello welcome to the car factory
// name: porche, speed: 357, color: red