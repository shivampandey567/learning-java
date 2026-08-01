// Inheritance allows a child class
// to inherit the properties and methods
// of a parent class.

package oop.medium;

// parent class
class Animal {
    void eat() {
        System.out.println("animal is eating");
    }

    void sleep() {
        System.out.println("animal is sleeping");
    }
}

// child Class
class Dog extends Animal {
    void bark() {
        System.out.println("dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        // inherited method
        d1.eat();
        d1.sleep();

        // dog own method
        d1.bark();
    }
}

// output:
// animal is eating
// animal is sleeping
// dog is barking