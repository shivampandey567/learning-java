package oop.medium;

class Calculator {
    double sum;

    // no input -> number defaults to 0
    Calculator() {
        this.sum = 0;
    }

    // only 1 number (int)
    Calculator(int a) {
        this.sum = a;
    }

    // only 1 number (double)
    Calculator(double a) {
        this.sum = a;
    }

    // int + int
    Calculator(int a, int b) {
        this.sum= a + b;
    }

    // double + double
    Calculator(double a, double b) {
        this.sum= a + b;
    }
    
    // int + double
    Calculator(int a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        
    }
}
