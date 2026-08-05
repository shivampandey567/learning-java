package generics.mathutil;

public class MathUtil {
    public static <T> void display(T[] arr) {
        for (T i : arr) {
            System.out.println(i);
        }
    }
}