package generics.pair;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(99, "shaurya");

        p1.print();
    }
}

// output:
// Key: 99, Value: shaurya