// Abstract methods have no body.
// child classes must implement them.

package oop.medium;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

public class AbstractMethods {
    public static void main(String[] args) {
        Animal d1 = new Dog();

        d1.sound();
    }
}

// output:
// dog barks