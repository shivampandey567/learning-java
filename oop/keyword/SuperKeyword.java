package oop.keyword;

class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(super.name); // The super keyword refers to the immediate parent class object

        System.out.println(this.name); // The this keyword refers to the current object of the class.
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.display();
    }
}

// output:
// Animal
// Dog