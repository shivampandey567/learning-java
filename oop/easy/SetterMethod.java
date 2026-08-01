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

public class SetterMethod {
    public static void main(String[] args) {
        Car c1 = new Car("porche", 357, "red");

        // display the original car
        c1.display();

        // updating the car
        c1.setName("ferrari");
        c1.setSpeed(467);
        c1.setColor("yellow");

        // display the updated car
        c1.display();
    }
}

// output:
// name: porche, speed: 357, color: red
// name: ferrari, speed: 467, color: yellow