package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue {
    public static void main(String[] args) {
        // creating queue
        Queue<String> queue = new LinkedList<>();

        // offer()
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");
        queue.offer("JavaScript");

        System.out.println("After offer(): " + queue); // [Java, Python, C++, JavaScript]

        // add()
        queue.add("Spring");
        System.out.println("After add(): " + queue); // [Java, Python, C++, JavaScript, Spring]

        // peek()
        System.out.println("peek(): " + queue.peek()); // Java

        // element()
        System.out.println("element(): " + queue.element()); // Java

        // poll()
        System.out.println("poll(): " + queue.poll()); // Java
        System.out.println("After poll(): " + queue); // [Python, C++, JavaScript, Spring]

        // remove()
        System.out.println("remove(): " + queue.remove()); // Python
        System.out.println("After remove(): " + queue); // [C++, JavaScript, Spring]

        // contains()
        System.out.println("Contains Spring: " + queue.contains("Spring")); // true

        // size()
        System.out.println("Size: " + queue.size()); // 3

        // isEmpty()
        System.out.println("Is Empty: " + queue.isEmpty()); // false

        // clear()
        queue.clear();
        System.out.println("After clear(): " + queue); // []

        // isEmpty()
        System.out.println("Is Empty: " + queue.isEmpty()); // true
    }
}

// output:
// peek(): Java
// element(): Java
// poll(): Java
// After poll(): [Python, C++, JavaScript, Spring]
// remove(): Python
// After remove(): [C++, JavaScript, Spring]
// Contains Spring: true
// Size: 3
// Is Empty: false
// After clear(): []
// Is Empty: true