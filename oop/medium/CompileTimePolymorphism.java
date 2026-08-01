// Compile time polymorphism is
// achieved using Method Overloading.

package oop.medium;

class Add {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Add a1 = new Add();

        System.out.println(a1.add(10, 20));
        System.out.println(a1.add(10.5, 20.5));
        System.out.println(a1.add(10, 20, 30));
    }
}

// output:
// 30
// 31.0
// 60