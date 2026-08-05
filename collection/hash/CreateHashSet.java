package collection.hash;

import java.util.HashSet;

public class CreateHashSet {
    public static void main(String[] args) {
        // Creating HashSet
        HashSet<String> set = new HashSet<>();

        // add()
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate

        System.out.println("After add(): " + set); // [Java, Python, C++] // (Order may vary)

        // add(null)
        set.add(null);
        System.out.println("After adding null: " + set); // [Java, Python, C++, null] // (Order may vary)

        // contains()
        System.out.println("Contains Java: " + set.contains("Java")); // true

        // size()
        System.out.println("Size: " + set.size()); // 4

        // isEmpty()
        System.out.println("Is Empty: " + set.isEmpty()); // false

        // remove()
        set.remove("Python");
        System.out.println("After remove(): " + set); // [Java, C++, null] // (Order may vary)

        // forEach()
        System.out.print("forEach(): ");
        set.forEach(item -> System.out.print(item + " "));
        System.out.println(); // Java Spring // (Order may vary)

        // clear()
        set.clear();
        System.out.println("After clear(): " + set); // []

        // isEmpty()
        System.out.println("Is Empty: " + set.isEmpty()); // true
    }
}

// output:
// After add(): [Java, C++, Python]
// After adding null: [null, Java, C++, Python]
// Contains Java: true
// Size: 4
// Is Empty: false
// After remove(): [null, Java, C++]
// forEach(): null Java C++
// After clear(): []
// Is Empty: true