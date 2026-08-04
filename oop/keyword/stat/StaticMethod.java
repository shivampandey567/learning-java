// static method can be called without creating an object.

package oop.keyword.stat;

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 20));
        System.out.println(Calculator.add(89, 23));
        System.out.println(Calculator.add(78, 167));
    }
}

// output:
// 30
// 112
// 245