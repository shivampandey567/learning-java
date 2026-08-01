package oop.easy;

class Ca {
    // Private Instance Variables
    private String name;
    private int speed;
    private String color;

    // default constructor
    Ca() {
        this.name = "unknown";
        this.speed = 0;
        this.color = "unknown";
    }

    // Parameterized Constructor
    Ca(String name, int speed, String color) {
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

    // method to display car details
    void display() {
        System.out.println("name: " + this.name + ", speed: " + this.speed + ", color: " + this.color);
    }
}

public class CompleteExample {
    public static void main(String[] args) {
        // Create Object using Constructor
        Ca c1 = new Ca();
        Ca c2 = new Ca("porche", 357, "red");
        Ca c3 = new Ca("ferrari", 467, "yellow");

        // getting c1 details
        System.out.println(c1.getName());
        System.out.println(c1.getSpeed());
        System.out.println(c1.getColor());

        // getting c2 details
        System.out.println(c2.getName());
        System.out.println(c2.getSpeed());
        System.out.println(c2.getColor());

        // geting c3 details
        System.out.println(c3.getName());
        System.out.println(c3.getName());
        System.out.println(c3.getName());

        // display original car details
        c1.display();
        c2.display();
        c3.display();

        // updating c1 details
        c1.setName("bmw");
        c1.setSpeed(342);
        c1.setColor(null);

        // updating c2 details
        c2.setName(null);
        c2.setSpeed(0);
        c2.setColor("green");

        // updating c3 details
        c3.setName("toyota");
        c3.setSpeed(149);
        c3.setColor("purple");

        // display updated car details
        c1.display();
        c2.display();
        c3.display();
    }
}

// output:
// unknown
// 0
// unknown
// porche
// 357
// red
// ferrari
// ferrari
// ferrari
// name: unknown, speed: 0, color: unknown
// name: porche, speed: 357, color: red
// name: ferrari, speed: 467, color: yellow
// name: bmw, speed: 342, color: null
// name: null, speed: 0, color: green
// name: toyota, speed: 149, color: purple