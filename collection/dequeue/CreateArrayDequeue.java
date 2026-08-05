package collection.dequeue;

import java.util.ArrayDeque;

public class CreateArrayDequeue {
    public static void main(String[] args) {
        // Creating ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // add()
        deque.add("Java");
        deque.add("Python");
        deque.add("C++");

        System.out.println("After add(): " + deque); // [Java, Python, C++]

        // addFirst()
        deque.addFirst("HTML");
        System.out.println("After addFirst(): " + deque); // [HTML, Java, Python, C++]

        // addLast()
        deque.addLast("Spring");
        System.out.println("After addLast(): " + deque); // [HTML, Java, Python, C++, Spring]

        // offer()
        deque.offer("NodeJS");
        System.out.println("After offer(): " + deque); // [HTML, Java, Python, C++, Spring, NodeJS]

        // offerFirst()
        deque.offerFirst("CSS");
        System.out.println("After offerFirst(): " + deque); // [CSS, HTML, Java, Python, C++, Spring, NodeJS]

        // offerLast()
        deque.offerLast("React");
        System.out.println("After offerLast(): " + deque); // [CSS, HTML, Java, Python, C++, Spring, NodeJS, React]

        // getFirst()
        System.out.println("getFirst(): " + deque.getFirst()); // Output: CSS

        // getLast()
        System.out.println("getLast(): " + deque.getLast()); // React

        // peek()
        System.out.println("peek(): " + deque.peek()); // CSS

        // peekFirst()
        System.out.println("peekFirst(): " + deque.peekFirst()); // CSS

        // peekLast()
        System.out.println("peekLast(): " + deque.peekLast()); // React

        // removeFirst()
        System.out.println("removeFirst(): " + deque.removeFirst()); // CSS
        System.out.println("After removeFirst(): " + deque); // [HTML, Java, Python, C++, Spring, NodeJS, React]

        // removeLast()
        System.out.println("removeLast(): " + deque.removeLast()); // React

        System.out.println("After removeLast(): " + deque); // [HTML, Java, Python, C++, Spring, NodeJS]

        // poll()
        System.out.println("poll(): " + deque.poll()); // HTML
        System.out.println("After poll(): " + deque); // [Java, Python, C++, Spring, NodeJS]

        // pollFirst()
        System.out.println("pollFirst(): " + deque.pollFirst()); // Java
        System.out.println("After pollFirst(): " + deque); // [Python, C++, Spring, NodeJS]

        // pollLast()
        System.out.println("pollLast(): " + deque.pollLast()); // NodeJS

        System.out.println("After pollLast(): " + deque); // [Python, C++, Spring]

        // contains()
        System.out.println("Contains Spring: " + deque.contains("Spring")); // true

        // size()
        System.out.println("Size: " + deque.size()); // 3

        // isEmpty()
        System.out.println("Is Empty: " + deque.isEmpty()); // false

        // push()
        deque.push("StackTop");
        System.out.println("After push(): " + deque); // [StackTop, Python, C++, Spring]

        // pop()
        System.out.println("pop(): " + deque.pop()); // StackTop
        System.out.println("After pop(): " + deque); // [Python, C++, Spring]

        // clear()
        deque.clear();
        System.out.println("After clear(): " + deque); // []
    }
}

// output:
// After add(): [Java, Python, C++]
// After addFirst(): [HTML, Java, Python, C++]
// After addLast(): [HTML, Java, Python, C++, Spring]
// After offer(): [HTML, Java, Python, C++, Spring, NodeJS]
// After offerFirst(): [CSS, HTML, Java, Python, C++, Spring, NodeJS]
// After offerLast(): [CSS, HTML, Java, Python, C++, Spring, NodeJS, React]
// getFirst(): CSS
// getLast(): React
// peek(): CSS
// peekFirst(): CSS
// peekLast(): React
// removeFirst(): CSS
// After removeFirst(): [HTML, Java, Python, C++, Spring, NodeJS, React]
// removeLast(): React
// After removeLast(): [HTML, Java, Python, C++, Spring, NodeJS]
// poll(): HTML
// After poll(): [Java, Python, C++, Spring, NodeJS]
// pollFirst(): Java
// After pollFirst(): [Python, C++, Spring, NodeJS]
// pollLast(): NodeJS
// After pollLast(): [Python, C++, Spring]
// Contains Spring: true
// Size: 3
// Is Empty: false
// After push(): [StackTop, Python, C++, Spring]
// pop(): StackTop
// After pop(): [Python, C++, Spring]
// After clear(): []