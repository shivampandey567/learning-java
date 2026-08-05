package generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class UnboundWildcard {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shivam", "Rahul");

        List<Integer> numbers = Arrays.asList(10, 20, 30);

        List<Double> marks = Arrays.asList(95.5, 80.2);

        printList(names);

        printList(numbers);

        printList(marks);
    }
}

// output:
// Shivam
// Rahul
// 10
// 20
// 30
// 95.5
// 80.2