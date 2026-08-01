// An abstract class can have
// both abstract and normal methods.

package oop.medium;

// abstract class
abstract class Animal {
    // normal method
    void eat() {
        System.out.println("animal is eating");
    }

    // abstract method
    abstract void sound();
}

// child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.eat();
        d1.sound();
    }
}

// output:
// Animal is Eating
// Dog Barks