package collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsLinkedList {
    public static void main(String[] args) {
        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("After add(): " + list); // After add(): [Apple, Banana, Orange]

        // forEach()
        System.out.print("forEach(): "); // forEach(): Apple Banana Orange

        list.forEach(item -> System.out.print(item + " "));

        System.out.println();

        // Collections.sort()
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(90);
        numbers.add(20);

        // Collection.sort()
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers); // Sorted: [10, 20, 50, 90]

        // Collections.reverse()
        Collections.reverse(numbers);
        System.out.println("Reverse: " + numbers); // Reverse: [90, 50, 20, 10]

        // Collections.shuffle()
        Collections.shuffle(numbers);
        System.out.println("Shuffle: " + numbers); // Shuffle: [10, 20, 50, 90]

        // Collections.max()
        System.out.println("Max: " + Collections.max(numbers)); // Max: 90

        // Collections.min()
        System.out.println("Min: " + Collections.min(numbers)); // Min: 10

        // Collections.frequency()
        numbers.add(20);
        numbers.add(20);
        System.out.println("Frequency of 20: " + Collections.frequency(numbers, 20)); // Frequency of 20: 3

        // Binary Search
        Collections.sort(numbers);
        System.out.println("Binary Search 50: " + Collections.binarySearch(numbers, 50)); // Binary Search 50: 4
    }
}

// output:
// After add(): [Apple, Banana, Orange]
// forEach(): Apple Banana Orange
// Sorted: [10, 20, 50, 90]
// Reverse: [90, 50, 20, 10]
// Shuffle: [10, 20, 50, 90]
// Max: 90
// Min: 10
// Frequency of 20: 3
// Binary Search 50: 4