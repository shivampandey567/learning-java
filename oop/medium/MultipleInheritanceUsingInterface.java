// Multiple inheritance using interfaces
// allows one class to implement multiple interfaces.

// Java does not support multiple inheritance using classes 
// to avoid ambiguity (Diamond Problem). However, 
// Java supports multiple inheritance through interfaces, 
// allowing a class to implement multiple interfaces safely.

package oop.medium;

interface Walk {
    void walk();
}

interface Swim {
    void swim();
}

class Duck implements Walk, Swim {
    @Override
    public void walk() {
        System.out.println("duck walks");
    }

    @Override
    public void swim() {
        System.out.println("duck swims");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        Duck d1 = new Duck();

        d1.walk();
        d1.swim();
    }
}

// output:
// duck walks
// duck swims