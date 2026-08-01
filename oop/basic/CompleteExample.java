package oop.basic;

class Car {
    // instance vaiables
    String name;
    int speed;
    String color;

    // method
    void display() {
        System.out.println("name: " + name + ", speed: " + speed + ", color: " + color);
    }
}

public class CompleteExample {
    public static void main(String[] args) {
        // creating objects
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        // assiging values to each objects
        c1.name = "porche";
        c1.speed = 357;
        c1.color = "red";

        c2.name = "toyota";
        c2.speed = 211;
        c2.color = "white";

        c3.name = "ferrari";
        c3.speed = 467;
        c3.color = "yellow";

        // calling the method
        c1.display();
        ;
        c2.display();
        c3.display();
    }
}

// output:
// name: porche, speed: 357, color: red
// name: toyota, speed: 211, color: white
// name: ferrari, speed: 467, color: yellow