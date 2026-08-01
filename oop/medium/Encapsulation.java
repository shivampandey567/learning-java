// Encapsulation means hiding data using
// private variables and providing controlled
// access through Getter and Setter methods.

package oop.medium;

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

    // setter to set the name
    public void setName(String name) {
        this.name = name;
    }

    // setter to set the speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // setter to set the color
    public void setColor(String color) {
        this.color = color;
    }

    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed + ", color: " + this.color);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Car c1 = new Car("porche", 357, "red");

        System.out.println(c1.getName());
        System.out.println(c1.getSpeed());
        System.out.println(c1.getColor());

        c1.display();

        c1.setName("ferrari");
        c1.setSpeed(467);
        c1.setColor("yellow");

        c1.display();
    }
}

// output:
// porche
// 357
// red
// name: porche, speed: 357, color: red
// name: ferrari, speed: 467, color: yellow