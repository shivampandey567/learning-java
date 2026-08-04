// An Anonymous Inner Class has no class name.
// It is used only once.

package oop.hard;

class Animal {
    void sound() {
        System.out.println("animal sound");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            void sound() {
                System.out.println("dog barks");
            }
        };

        animal.sound();
    }
}

// output:
// dog barks