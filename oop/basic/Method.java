package oop.basic;

class Car {
    String name;
    int speed;
    String color;

    // method
    void display() {
        System.out.println("name: " + name + ", speed: " + speed + ", color: " + color);
    }
}

public class Method {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.name = "porche";
        c1.speed = 357;
        c1.color = "red";

        // calling the method
        c1.display();
    }
}

// output:
// name: porche, speed: 357, color: red