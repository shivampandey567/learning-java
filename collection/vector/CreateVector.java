package collection.vector;

import java.util.Vector;

public class CreateVector {
    public static void main(String[] args) {
        // Creating Vector
        Vector<String> vector = new Vector<>();

        // add()
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("After add(): " + vector);

        // add(index, element)
        vector.add(1, "Mango");
        System.out.println("After add(index): " + vector);

        // addElement()
        vector.addElement("Kiwi");
        System.out.println("After addElement(): " + vector);

        // get()
        System.out.println("get(2): " + vector.get(2));

        // set()
        vector.set(2, "Grapes");
        System.out.println("After set(): " + vector);

        // setElementAt()
        vector.setElementAt("Papaya", 0);
        System.out.println("After setElementAt(): " + vector);

        // firstElement()
        System.out.println("First Element: " + vector.firstElement());

        // lastElement()
        System.out.println("Last Element: " + vector.lastElement());

        // contains()
        System.out.println("Contains Mango: " + vector.contains("Mango"));

        // indexOf()
        System.out.println("Index of Mango: " + vector.indexOf("Mango"));

        // lastIndexOf()
        vector.add("Mango");
        System.out.println("Last Index of Mango: " + vector.lastIndexOf("Mango"));

        // size()
        System.out.println("Size: " + vector.size());

        // capacity()
        System.out.println("Capacity: " + vector.capacity());

        // isEmpty()
        System.out.println("Is Empty: " + vector.isEmpty());

        // remove(index)
        vector.remove(1);
        System.out.println("After remove(index): " + vector);

        // remove(object)
        vector.remove("Orange");
        System.out.println("After remove(object): " + vector);

        // removeElement()
        vector.removeElement("Kiwi");
        System.out.println("After removeElement(): " + vector);
    }
}

// output:
// After add(): [Apple, Banana, Orange]
// After add(index): [Apple, Mango, Banana, Orange]
// After addElement(): [Apple, Mango, Banana, Orange, Kiwi]
// get(2): Banana
// After set(): [Apple, Mango, Grapes, Orange, Kiwi]
// After setElementAt(): [Papaya, Mango, Grapes, Orange, Kiwi]
// First Element: Papaya
// Last Element: Kiwi
// Contains Mango: true
// Index of Mango: 1
// Last Index of Mango: 5
// Size: 6
// Capacity: 10
// Is Empty: false
// After remove(index): [Papaya, Grapes, Orange, Kiwi, Mango]
// After remove(object): [Papaya, Grapes, Kiwi, Mango]
// After removeElement(): [Papaya, Grapes, Mango]