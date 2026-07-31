# Java OOP Basics Notes (Before Constructors & Four Pillars)

---

# What is OOP?

**OOP (Object-Oriented Programming)** is a programming style where we create **objects** from **classes**.

Instead of writing everything in one place, we divide the program into small objects that have their own data and functions.

Real-life example:

* Car → Object
* Student → Object
* Mobile → Object
* Bank Account → Object

---

# What is a Class?

A **class** is a **blueprint** or **template** used to create objects.

It tells Java:

* What data an object will store.
* What actions an object can perform.

Example:

```java
class Student {
    String name;
    int age;

    void study() {
        System.out.println("Student is studying");
    }
}
```

Think of a class as a house blueprint.

The blueprint is not the actual house.

---

# What is an Object?

An **object** is the real thing created from a class.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();
```

Here,

* `Student` → Class
* `s1` → Object
* `s2` → Object

Every object has its own data.

Example:

```java
s1.name = "Rahul";
s2.name = "Shivam";
```

Output:

```
Rahul
Shivam
```

Although both belong to the same class, they store different values.

---

# Class vs Object

| Class                | Object               |
| -------------------- | -------------------- |
| Blueprint            | Real thing           |
| Defines properties   | Stores actual values |
| Created once         | Can create many      |
| No memory for values | Uses memory          |

Example:

```
Class → Student

Objects →
Student 1
Student 2
Student 3
```

---

# Syntax of a Class

```java
class Student {

}
```

Basic syntax with variables and method:

```java
class Student {

    String name;

    int age;

    void display() {
        System.out.println(name);
    }

}
```

---

# What are Variables (Data Members)?

Variables store information about an object.

Example:

```java
class Car {

    String brand;

    int speed;

}
```

Here,

* brand stores the company name.
* speed stores the speed.

---

# What is a Method?

A method is a function inside a class.

Methods define what an object can do.

Example:

```java
class Dog {

    void bark() {
        System.out.println("Woof");
    }

}
```

Here,

`bark()` is a method.

---

# Creating an Object

Syntax:

```java
ClassName objectName = new ClassName();
```

Example:

```java
Student s1 = new Student();
```

Breakdown:

```
Student
```

Class name

```
s1
```

Object name

```
new
```

Creates memory for the object

```
Student()
```

Creates an object of Student class

---

# Accessing Variables

Use the dot (`.`) operator.

Example:

```java
Student s1 = new Student();

s1.name = "Shivam";

s1.age = 19;
```

Reading values:

```java
System.out.println(s1.name);

System.out.println(s1.age);
```

---

# Calling Methods

Syntax:

```java
objectName.methodName();
```

Example:

```java
Student s1 = new Student();

s1.display();
```

---

# Complete Example

```java
class Student {

    String name;

    int age;

    void display() {

        System.out.println(name);

        System.out.println(age);

    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Shivam";

        s1.age = 19;

        s1.display();

    }

}
```

Output

```
Shivam

19
```

---

# Multiple Objects

```java
class Student {

    String name;

}
```

```java
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student();

        s1.name = "Rahul";

        s2.name = "Aman";

        System.out.println(s1.name);

        System.out.println(s2.name);

    }

}
```

Output

```
Rahul

Aman
```

Every object has its own copy of variables.

---

# Dot (.) Operator

The dot operator is used to access variables and methods.

Example:

```java
Student s1 = new Student();

s1.name = "Shivam";

s1.display();
```

```
s1.name
```

Access variable

```
s1.display()
```

Call method

---

# Object Reference

```java
Student s1 = new Student();
```

Here,

```
s1
```

does not store the whole object.

It stores the **reference (address)** of the object in memory.

```
s1
 |
 |
 V
+----------------+
| name           |
| age            |
+----------------+
```

---

# Default Values

If we don't assign values, Java gives default values.

| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| double    | 0.0           |
| boolean   | false         |
| char      | '\u0000'      |
| String    | null          |

Example:

```java
class Student {

    int age;

}
```

```java
Student s = new Student();

System.out.println(s.age);
```

Output

```
0
```

---

# Why Do We Create Classes?

Without classes:

```
Many unrelated variables
Many unrelated functions
Messy code
```

With classes:

```
Student class

↓

Objects

↓

Organized code
Easy to manage
Easy to understand
Reusable
```

---

# Memory Representation

```
Student s1 = new Student();
```

Memory

```
Stack

s1
 |
 |
 V

Heap

+----------------+
| name = null    |
| age = 0        |
+----------------+
```

The object is stored in the **Heap**.

The reference variable is stored in the **Stack**.

---

# Important Keywords

### class

Used to create a class.

Example

```java
class Student {

}
```

---

### new

Creates a new object.

Example

```java
Student s = new Student();
```

---

### public

Makes a class or method accessible from anywhere.

Example

```java
public class Main {

}
```

---

### void

Means the method does **not return** any value.

Example

```java
void display() {

}
```

---

### static

Allows a method or variable to belong to the class instead of an object.

The `main()` method is static so Java can run it without creating an object of `Main`.

Example

```java
public static void main(String[] args) {

}
```

---

### main()

The starting point of every Java program.

Execution always begins from:

```java
public static void main(String[] args) {

}
```

---

### System.out.println()

Used to print output on the console.

Example

```java
System.out.println("Hello");
```

---

# Naming Rules

### Class Names

* Start with a capital letter.
* Use PascalCase.

Good

```java
Student
```

```java
BankAccount
```

Bad

```java
student
```

---

### Object Names

* Start with a small letter.
* Use camelCase.

Good

```java
student1
```

```java
bankAccount
```

Bad

```java
Student1
```

---

### Method Names

* Start with a small letter.
* Use camelCase.

Good

```java
display()
```

```java
calculateMarks()
```

---

# Quick Revision

* OOP organizes programs using objects.
* A class is a blueprint.
* An object is an instance of a class.
* Variables store object data.
* Methods define object behavior.
* Use `new` to create an object.
* Use the dot (`.`) operator to access variables and methods.
* Objects are stored in the heap, while reference variables are stored in the stack.
* Every object has its own copy of instance variables.
* `main()` is where every Java program starts.
