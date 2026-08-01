package oop.easy;

class Car {
    String name;
    int speed;
    String color;

    // parameterized constructor
    Car(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed + ", color: " + this.color);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // parameters are given to the object
        Car c1 = new Car("porche", 357, "red");

        c1.display();
    }
}

// output:
// name: porche, speed: 357, color: red