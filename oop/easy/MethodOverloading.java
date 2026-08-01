package oop.easy;

class Add {
    // no input number defaults to 0
    public int add() {
        return 0;
    }

    // only 1 number (int)
    public int add(int a) {
        return a;
    }

    // only 1 number (double)
    public double add(double a) {
        return a;
    }

    // int + int
    public int add(int a, int b) {
        return a + b;
    }

    // double + double
    public double add(double a, double b) {
        return a + b;
    }

    // int + double
    public double add(int a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Add a1 = new Add();

        // calling the methods in diff parameters
        System.out.println(a1.add());
        System.out.println(a1.add(56));
        System.out.println(a1.add(89.566));
        System.out.println(a1.add(342, 4567));
        System.out.println(a1.add(7243.34, 6788));
        System.out.println(a1.add(562.3655, 987.683));
    }
}

// output:
// 0
// 56
// 89.566
// 4909
// 14031.34
// 1550.0484999999999