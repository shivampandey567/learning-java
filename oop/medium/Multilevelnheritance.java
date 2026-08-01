// Multilevel inheritance means
// a class inherits from another class,
// which itself inherits from another class.

package oop.medium;

// grandparent Class
class Animal {
    void eat() {
        System.out.println("animal is eating");
    }
}

// parent Class
class Dog extends Animal {
    void bark() {
        System.out.println("dog is barking");
    }
}

// child Class
class Labrador extends Dog {
    void color() {
        System.out.println("labrador color is golden");
    }
}

public class Multilevelnheritance {
    public static void main(String[] args) {
        Labrador l1 = new Labrador();

        // method from animal
        l1.eat();

        // method from dog
        l1.bark();

        // method from labrador
        l1.color();
    }
}

// output:
// animal is eating
// dog is barking
// labrador color is golden