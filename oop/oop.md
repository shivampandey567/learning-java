# ☕ OOP Short Notes (Java)

## What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm that organizes programs using **classes** and **objects**. It helps make code reusable, modular, and easier to maintain.

---

## Class

A **class** is a blueprint used to create objects.

```java
class Student {

    String name;

}
```

---

## Object

An **object** is an instance of a class.

```java
Student s1 = new Student();
```

---

## Instance Variables

Variables declared inside a class but outside methods.

```java
class Student {

    String name;
    int age;

}
```

---

## Method

A method defines the behavior of an object.

```java
void display() {

    System.out.println("Hello");

}
```

---

## Constructor

A constructor initializes an object.

* Same name as the class.
* No return type.
* Called automatically when an object is created.

```java
Student() {

}
```

---

## Types of Constructors

* Default Constructor
* Parameterized Constructor

---

## Constructor Overloading

Multiple constructors with different parameter lists.

```java
Student() {

}

Student(String name) {

}
```

---

## Method Overloading

Multiple methods with the same name but different parameters.

```java
add(int a, int b)

add(int a, int b, int c)
```

---

## `this` Keyword

Refers to the current object.

```java
this.name = name;
```

---

## `this()`

Calls another constructor of the same class.

```java
Student() {

    this("Unknown");

}
```

---

## Object Reference

A reference variable stores the address of an object.

```java
Student s1 = new Student();

Student s2 = s1;
```

Both variables point to the same object.

---

## Copy Constructor

Java does not provide a built-in copy constructor.

We create one manually.

```java
Student(Student other) {

}
```

---

## Access Modifiers

| Modifier  | Accessible                |
| --------- | ------------------------- |
| public    | Everywhere                |
| private   | Inside the same class     |
| protected | Same package + subclasses |
| default   | Same package              |

---

## Private Variables

Private variables cannot be accessed directly from outside the class.

```java
private String name;
```

---

## Getter

Reads a private variable.

```java
public String getName() {

    return name;

}
```

---

## Setter

Updates a private variable.

```java
public void setName(String name) {

    this.name = name;

}
```

---

## Encapsulation

Encapsulation means hiding data using **private variables** and providing access through **getters** and **setters**.

Benefits:

* Better Security
* Better Data Control
* Easier Maintenance
* Better Code Organization

---

## Destructor

Java **does not have destructors**.

Memory is managed automatically by the **Garbage Collector (GC)**.

---

## Stack vs Heap

```
Stack

student
   |
   V

Heap

+----------------+
| name = "John"  |
| age = 20       |
+----------------+
```

* Reference variables → Stack
* Objects → Heap

---

## Constructor vs Method

| Constructor          | Method                 |
| -------------------- | ---------------------- |
| Same name as class   | Any valid name         |
| No return type       | Can have a return type |
| Called automatically | Called manually        |
| Initializes object   | Performs tasks         |

---

## Getter vs Setter

| Getter            | Setter                 |
| ----------------- | ---------------------- |
| Reads data        | Updates data           |
| Returns a value   | Usually returns `void` |
| Starts with `get` | Starts with `set`      |

---

## `this` vs `this()`

| `this`                         | `this()`                      |
| ------------------------------ | ----------------------------- |
| Refers to the current object   | Calls another constructor     |
| Accesses variables and methods | Used only inside constructors |

---

# Quick Revision

* Class → Blueprint
* Object → Instance of a class
* Method → Behavior
* Constructor → Initializes an object
* `this` → Current object
* `this()` → Constructor chaining
* Getter → Read private data
* Setter → Update private data
* Encapsulation → Hide data using private variables
* Java uses Garbage Collection instead of destructors
* Objects are stored in the Heap, references in the Stack
