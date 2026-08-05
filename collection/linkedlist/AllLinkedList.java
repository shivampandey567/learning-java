package collection.linkedlist;

import java.util.LinkedList;

public class AllLinkedList {
    public static void main(String[] args) {
        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("After add(): " + list); // After add(): [Apple, Banana, Orange]

        // addAll()
        LinkedList<String> extra = new LinkedList<>();

        extra.add("A");
        extra.add("B");

        list.addAll(extra);

        System.out.println("After addAll(): " + list); // After addAll(): [Apple, Banana, Orange, A, B]

        // removeAll()
        LinkedList<String> removeList = new LinkedList<>();

        removeList.add("A");

        list.removeAll(removeList);

        System.out.println("After removeAll(): " + list); // After removeAll(): [Apple, Banana, Orange, B]

        // retainAll()
        LinkedList<String> retainList = new LinkedList<>();

        retainList.add("Banana");
        retainList.add("B");

        list.retainAll(retainList);

        System.out.println("After retainAll(): " + list); // After retainAll(): [Banana, B]

    }
}

// output:
// After add(): [Apple, Banana, Orange]
// After addAll(): [Apple, Banana, Orange, A, B]
// After removeAll(): [Apple, Banana, Orange, B]
// After retainAll(): [Banana, B]