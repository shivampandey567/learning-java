// A utility class contains only static methods.

package oop.keyword.stat;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class UtilityClass {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 20));

        System.out.println(Calculator.multiply(10, 20));
    }
}

// output:
// 30
// 200