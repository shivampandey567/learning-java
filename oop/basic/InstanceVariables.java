package oop.basic;

class Car {
    // instance vaiables
    String name;
    int speed;
    String color;
}

public class InstanceVariables {
    public static void main(String[] args) {
        // creating object
        Car c1 = new Car();

        // assign values
        c1.name = "porche";
        c1.speed = 357;
        c1.color = "red";

        // print values
        System.out.println("name: " + c1.name + ", speed: " + c1.speed + ", color: " + c1.color);
    }
}

// output:
// name: porche, speed: 357, color: red