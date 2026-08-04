// Checks whether an object belongs
// to a particular class.

package oop.medium;

class Animal {

}

class Dog extends Animal {

}

public class InstanceofOperator {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog instanceof Dog);

        System.out.println(dog instanceof Animal);

        Animal animal = new Animal();

        System.out.println(animal instanceof Dog);
    }
}

// output:
// true
// true
// false