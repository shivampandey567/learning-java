package oop.easy;

class Car {
    String name;
    int speed;
    String color;

    // no-arg constructor -> default values
    Car() {
        this.name = "unknown";
        this.speed = 0;
        this.color = "unknown";
    }

    // constructor with only name
    Car(String name) {
        this.name = name;
        this.speed = 0;
        this.color = "unknown";
    }

    // constructor with name and speed
    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.color = "unknown";
    }

    // constructor with name, speed, and color
    Car(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed + ", color: " + this.color);
    }
}

public class MultipleConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("civic");
        Car c3 = new Car("mustang", 250);
        Car c4 = new Car("porche", 357, "red");

        c1.display();
        c2.display();
        c3.display();
        c4.display();
    }
}

// output:
// name: unknown, speed: 0, color: unknown
// name: civic, speed: 0, color: unknown
// name: mustang, speed: 250, color: unknown
// name: porche, speed: 357, color: red