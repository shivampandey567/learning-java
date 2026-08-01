// Method overriding means a child class
// provides its own implementation of a
// method that already exists in the parent class.

package oop.medium;

// parent class
class Animal {
    void sound() {
        System.out.println("animal makes a sound");
    }
}

// child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();

        // parent method
        a1.sound();

        // child method
        d1.sound();
    }
}

// output:
// animal makes a sound
// dog barks