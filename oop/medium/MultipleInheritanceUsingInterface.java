// Multiple inheritance using interfaces
// allows one class to implement multiple interfaces.

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