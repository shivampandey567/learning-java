package generics.demo;

public class Main {
    public static void main(String[] args) {
        Demo d1 = new Demo("shaurya");

        Demo d2 = new Demo(89);

        Demo d3 = new Demo(672.454);

        Demo d4 = new Demo(true);

        Demo d5 = new Demo('W');
    }
}

// output:
// shaurya
// 89
// 672.454
// true
// W