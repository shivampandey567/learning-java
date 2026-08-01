// Runtime polymorphism means 
// parent reference can point 
// to a child object.

package oop.medium;

class Animal {
    void sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog();
        animal.sound();

        animal = new Cat();
        animal.sound();
    }
}

// output:
// dog barks
// cat meows