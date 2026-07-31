package oop.basic;

class Car {
    String name;
    int speed;
    String color;

    void display() {
        System.out.println("name: " + name + ", speed: " + speed + ", color: " + color);
    }
}

public class ObjectReference {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.name = "porche";
        c1.speed = 357;
        c1.color = "red";

        // another reference pointing to the same object
        Car c2 = c1;

        c1.display();
        c2.display();
    }
}

// output:
// name: porche, speed: 357, color: red
// name: porche, speed: 357, color: red