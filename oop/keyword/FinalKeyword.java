package oop.keyword;

public class FinalKeyword {
    public static void main(String[] args) {
        final int speed = 220;

        System.out.println(speed);

        // speed = 300; // Error // Final keyword cannot changed
    }
}

// output:
// 220