package collection.stack;

import java.util.Stack;

public class CreateStack {
    public static void main(String[] args) {
        // Creating Stack
        Stack<String> stack = new Stack<>();

        // push()
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");

        System.out.println("After push(): " + stack); // [Java, Python, C++, JavaScript]

        // peek()
        System.out.println("Top Element: " + stack.peek()); // JavaScript

        // search()
        System.out.println("Search C++: " + stack.search("C++")); // 2

        // contains()
        System.out.println("Contains Java: " + stack.contains("Java")); // true

        // size()
        System.out.println("Size: " + stack.size()); // 4

        // isEmpty()
        System.out.println("Is Empty: " + stack.isEmpty()); // false

        // get()
        System.out.println("Element at index 1: " + stack.get(1)); // Python

        // set()
        stack.set(1, "Spring");
        System.out.println("After set(): " + stack); // [Java, Spring, C++, JavaScript]

        // firstElement()
        System.out.println("First Element: " + stack.firstElement()); // Java

        // lastElement()
        System.out.println("Last Element: " + stack.lastElement()); // JavaScript

        // pop()
        System.out.println("Popped: " + stack.pop()); // JavaScript
        System.out.println("After pop(): " + stack); // [Java, Spring, C++]

        // add()
        stack.add("NodeJS");
        System.out.println("After add(): " + stack); // [Java, Spring, C++, NodeJS]

        // addElement()
        stack.addElement("React");
        System.out.println("After addElement(): " + stack); // [Java, Spring, C++, NodeJS, React]

        // remove(index)
        stack.remove(2);
        System.out.println("After remove(index): " + stack); // [Java, Spring, NodeJS, React]

        // remove(object)
        stack.remove("React");
        System.out.println("After remove(object): " + stack); // [Java, Spring, NodeJS]

        // indexOf()
        System.out.println("Index of Spring: " + stack.indexOf("Spring"));// 1

        // lastIndexOf()
        stack.push("Java");
        System.out.println("Last Index of Java: " + stack.lastIndexOf("Java")); // 3

        // forEach()
        System.out.print("forEach(): ");
        stack.forEach(item -> System.out.print(item + " "));
        System.out.println(); // Java Spring NodeJS Java

        // clear()
        stack.clear();
        System.out.println("After clear(): " + stack); // []

        // empty()
        System.out.println("empty(): " + stack.empty()); // true
    }
}

// output:
// After push(): [Java, Python, C++, JavaScript]
// Top Element: JavaScript
// Search C++: 2
// Contains Java: true
// Size: 4
// Is Empty: false
// Element at index 1: Python
// After set(): [Java, Spring, C++, JavaScript]
// First Element: Java
// Last Element: JavaScript
// Popped: JavaScript
// After pop(): [Java, Spring, C++]
// After add(): [Java, Spring, C++, NodeJS]
// After addElement(): [Java, Spring, C++, NodeJS, React]
// After remove(index): [Java, Spring, NodeJS, React]
// After remove(object): [Java, Spring, NodeJS]
// Index of Spring: 1
// Last Index of Java: 3
// forEach(): Java Spring NodeJS Java
// After clear(): []
// empty(): true