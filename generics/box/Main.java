package generics.box;

public class Main {
    public static void main(String[] args) {
        // integer type
        Box<Integer> b1 = new Box<>();

        b1.set(69);

        System.out.println(b1.get());

        // string value
        Box<String> b2 = new Box<>();

        b2.set("hello world");

        System.out.println(b2.get());

        // double type
        Box<Double> b3 = new Box<>();

        b3.set(897.34556);

        System.out.println(b3.get());

        // boolean type
        Box<Boolean> b4 = new Box<>();

        b4.set(true);

        System.out.println(b4.get());

        // char type
        Box<Character> b5 = new Box<>();

        b5.set('Y');

        System.out.println(b5.get());
    }
}

// output:
// 69
// hello world
// 897.34556
// true
// Y