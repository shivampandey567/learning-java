package collection.arraylist;

import java.util.ArrayList;

public class AllArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // addAll()
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Kiwi");
        moreFruits.add("Pineapple");

        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        // addAll(index, collection)
        ArrayList<String> extra = new ArrayList<>();
        extra.add("Papaya");
        extra.add("Guava");

        fruits.addAll(2, extra);
        System.out.println("After addAll(index): " + fruits);

        // removeAll()
        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("Apple");
        removeList.add("Kiwi");

        fruits.removeAll(removeList);
        System.out.println("After removeAll(): " + fruits);

        // retainAll()
        ArrayList<String> keepList = new ArrayList<>();
        keepList.add("Papaya");
        keepList.add("Pineapple");

        fruits.retainAll(keepList);
        System.out.println("After retainAll(): " + fruits);
    }
}

// output:
// After addAll(): [Apple, Banana, Orange, Kiwi, Pineapple]
// After addAll(index): [Apple, Banana, Papaya, Guava, Orange, Kiwi, Pineapple]
// After removeAll(): [Banana, Papaya, Guava, Orange, Pineapple]
// After retainAll(): [Papaya, Pineapple]