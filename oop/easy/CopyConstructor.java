package oop.easy;

class Car {
    String name;
    int speed;
    String color;

    Car(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    // copy constructor
    Car(Car value) {
        this.name = value.name;
        this.speed = value.speed;
        this.color = value.color;
    }

    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed + ", color: " + this.color);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Car c1 = new Car("porche", 357, "red");

        // calling the copy constructor
        Car c2 = new Car(c1);

        c2.display();
    }
}

// output:
// name: porche, speed: 357, color: red