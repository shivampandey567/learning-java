package oop.easy;

class Car {
    private String name;
    private int speed;
    private String color;

    Car(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    // getter to get the name
    public String getName() {
        return this.name;
    }

    // getter to get the speed
    public int getSpeed() {
        return this.speed;
    }

    // getter to get the color
    public String getColor() {
        return this.color;
    }

    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed + ", color: " + this.color);
    }
}

public class GetterMethod {
    public static void main(String[] args) {
        Car c1 = new Car("porche", 357, "red");

        // getting the car info
        System.out.println(c1.getName());
        System.out.println(c1.getSpeed());
        System.out.println(c1.getColor());
    }
}

// output:
// porche
// 357
// red