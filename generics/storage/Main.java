package generics.storage;

public class Main {
    public static void main(String[] args) {
        StudentStorage s1 = new StudentStorage();

        s1.add("shaurya");

        System.out.println(s1.get());
    }
}

// output:
// shaurya