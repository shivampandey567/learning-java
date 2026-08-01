// Hierarchical inhertance means
// multiple child classes inherit
// from one parent class.

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

// child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("dog is barking");
    }
}

// child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        // inherited method
        d1.eat();
        d1.sleep();

        // dog own method
        d1.bark();

        // inherited method
        c1.eat();
        c1.sleep();

        // cat own method
        c1.meow();
    }
}

// output:
// animal is eating
// animal is sleeping
// dog is barking
// animal is eating
// animal is sleeping
// cat is meowing