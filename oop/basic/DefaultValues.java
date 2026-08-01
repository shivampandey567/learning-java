package oop.basic;

class Car {
    String name;
    int speed;
    String color;

    void display() {
        System.out.println("name: " + name + ", speed: " + speed + ", color: " + color);
    }
}

public class DefaultValues {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.display();
    }
}

// output:
// name: null, speed: 0, color: null