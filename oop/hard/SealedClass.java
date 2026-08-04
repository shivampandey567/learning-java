// A sealed class controls which 
// classes can inherit it.
package oop.hard;

// Parent Class
sealed class Animal permits Dog, Cat {
    void sound() {
        System.out.println("animal sound");
    }
}

final class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }
}

final class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("cat meow");
    }
}

public class SealedClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
    }
}

// output:
// dog barks
// cat meow