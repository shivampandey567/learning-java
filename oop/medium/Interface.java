// Interfaces contain method declarations.
// classes implement interfaces.

package oop.medium;

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("dog barks");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal d1 = new Dog();

        d1.sound();
    }
}

// output:
// dog barks