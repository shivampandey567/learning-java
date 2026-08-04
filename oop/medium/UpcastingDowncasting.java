package oop.medium;

// Parent Class
class Animal {
    void eat() {
        System.out.println("Animal is Eating");
    }
}

// Child Class
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is Eating");
    }

    void bark() {
        System.out.println("Dog is Barking");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog();

        animal.eat();

        // Downcasting
        Dog dog = (Dog) animal;

        dog.bark();
    }
}

// output:
// Dog is Eating
// Dog is Barking