package collection.linkedlist;

import java.util.LinkedList;

public class CreateLinkedList {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("After add(): " + list); // After add(): [Apple, Banana, Orange]

        // add(index, element)
        list.add(1, "Mango");
        System.out.println("After add(index): " + list); // After add(index): [Apple, Mango, Banana, Orange]

        // addFirst()
        list.addFirst("First");

        // addLast()
        list.addLast("Last");

        System.out.println("After addFirst/addLast(): " + list); // After addFirst/addLast(): [First, Apple, Mango, Banana, Orange, Last]

        // get()
        System.out.println("get(2): " + list.get(2)); // get(2): Mango

        // getFirst()
        System.out.println("getFirst(): " + list.getFirst()); // getFirst(): First

        // getLast()
        System.out.println("getLast(): " + list.getLast()); // getLast(): Last

        // set()
        list.set(2, "Grapes");
        System.out.println("After set(): " + list); // After set(): [First, Apple, Grapes, Banana, Orange, Last]

        // contains()
        System.out.println("Contains Apple: " + list.contains("Apple")); // Contains Apple: true

        // indexOf()
        System.out.println("Index of Apple: " + list.indexOf("Apple")); // Index of Apple: 1

        // lastIndexOf()
        list.add("Apple");
        System.out.println("Last Index of Apple: " + list.lastIndexOf("Apple")); // Last Index of Apple: 6

        // size()
        System.out.println("Size: " + list.size()); // Size: 7

        // isEmpty()
        System.out.println("Is Empty: " + list.isEmpty()); // Is Empty: false

        // remove(index)
        list.remove(2);
        System.out.println("After remove(index): " + list); // After remove(index): [First, Apple, Banana, Orange, Last, Apple]

        // remove(object)
        list.remove("Apple");
        System.out.println("After remove(object): " + list); // After remove(object): [First, Banana, Orange, Last, Apple]

        // removeFirst()
        list.removeFirst();

        // removeLast()
        list.removeLast();

        System.out.println("After removeFirst/removeLast(): " + list); // After removeFirst/removeLast(): [Banana, Orange, Last]

        // peek()
        System.out.println("peek(): " + list.peek()); // peek(): Banana

        // peekFirst()
        System.out.println("peekFirst(): " + list.peekFirst()); // peekFirst(): Banana

        // peekLast()
        System.out.println("peekLast(): " + list.peekLast()); // peekLast(): Last

        // offer()
        list.offer("Kiwi");

        // offerFirst()
        list.offerFirst("Papaya");

        // offerLast()
        list.offerLast("Pineapple");

        System.out.println("After offer(): " + list); // After offer(): [Papaya, Banana, Orange, Last, Kiwi, Pineapple]

        // poll()
        System.out.println("poll(): " + list.poll()); // poll(): Papaya

        // pollFirst()
        System.out.println("pollFirst(): " + list.pollFirst()); // pollFirst(): Banana

        // pollLast()
        System.out.println("pollLast(): " + list.pollLast()); // pollLast(): Pineapple

        System.out.println("After polling: " + list); // After polling: [Orange, Last, Kiwi]

        // push()
        list.push("StackTop");

        System.out.println("After push(): " + list); // After push(): [StackTop, Orange, Last, Kiwi]

        // pop()
        System.out.println("pop(): " + list.pop()); // pop(): StackTop

        System.out.println("After pop(): " + list); // After pop(): [Orange, Last, Kiwi]
    }
}

// output:
// After add(): [Apple, Banana, Orange]
// After add(index): [Apple, Mango, Banana, Orange]
// After addFirst/addLast(): [First, Apple, Mango, Banana, Orange, Last]
// get(2): Mango
// getFirst(): First
// getLast(): Last
// After set(): [First, Apple, Grapes, Banana, Orange, Last]
// Contains Apple: true
// Index of Apple: 1
// Last Index of Apple: 6
// Size: 7
// Is Empty: false
// After remove(index): [First, Apple, Banana, Orange, Last, Apple]
// After remove(object): [First, Banana, Orange, Last, Apple]
// After removeFirst/removeLast(): [Banana, Orange, Last]
// peek(): Banana
// peekFirst(): Banana
// peekLast(): Last
// After offer(): [Papaya, Banana, Orange, Last, Kiwi, Pineapple]
// poll(): Papaya
// pollFirst(): Banana
// pollLast(): Pineapple
// After polling: [Orange, Last, Kiwi]
// After push(): [StackTop, Orange, Last, Kiwi]
// pop(): StackTop
// After pop(): [Orange, Last, Kiwi]