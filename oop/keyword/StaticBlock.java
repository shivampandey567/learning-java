// A static block is a block of code that is executed only once, 
// when the class is loaded into memory by the JVM.

// It executes before the main() method and before any objects are created.

//It is always executed in the starting and only once

package oop.keyword;

class Car {
    // static block
    static {
        System.out.println("static block executed");
    }

    // initializer block
    {
        System.out.println("initializer block called");
    }

    // constructor
    Car() {
        System.out.println("constructor called");
    }

}

public class StaticBlock {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        Car c3=new Car();
    }
}

// output:
// static block executed
// initializer block called
// constructor called
// initializer block called
// constructor called
// initializer block called
// constructor called