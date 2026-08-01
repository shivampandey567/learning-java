package oop.easy;

class Car {
    // private variables
    private String name;
    private int speed;
    private String color;

    Car(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed + ", color: " + this.color);
    }
}

public class PrivateVariables {
    public static void main(String[] args) {
        Car c1 = new Car("porche", 357, "red");

        // correct way
        c1.display();

        // Wrong Way
        // c1.name = "porche";
        // c1.speed =357;
        // c1.color="red";

        // cannot access name, speed, color because they are private use getter, setter
    }
}

// output:
// name: porche, speed: 357, color: red