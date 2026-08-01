// Abstraction means hiding implementation
// and showing only essential details.

package oop.medium;

// abstract class
abstract class Animal {
    abstract void sound();
}

// child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("dog barks");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        // it may contain abstract methods (methods without a body) so cannot do this
        // Animal a1=new Animal();
        // a1.sound();

        Dog d1 = new Dog();
        d1.sound();
    }
}

// output:
// dog barks