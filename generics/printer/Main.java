package generics.printer;

public class Main {
    public static void main(String[] args) {
        Printer p1 = new Printer();

        // A method itself can be generic even if the class isn't.
        p1.print("hello");
        p1.print(69.9999);
        p1.print(true);
        p1.print('V');
        p1.print(true);
    }
}

// output:
// hello
// 69.9999
// true
// V
// true