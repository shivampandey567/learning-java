# ☕ Java OOP Medium Notes (Constructors, this, Getters & Setters)

---

# What is a Constructor?

A **constructor** is a special method that is automatically called when an object is created.

It is mainly used to initialize object data.

Example:

```java
class Student {

    Student() {
        System.out.println("Object Created");
    }

}
```

```java
Student s1 = new Student();
```

Output

```
Object Created
```

---

# Rules of Constructors

- Constructor name must be the same as the class name.
- Constructors do not have a return type.
- They are automatically called when an object is created.
- Constructors can be overloaded.

---

# Default Constructor

A constructor with **no parameters**.

Example

```java
class Car {

    Car() {
        System.out.println("Default Constructor");
    }

}
```

---

# Parameterized Constructor

A constructor that accepts values.

Example

```java
class Car {

    String brand;

    Car(String brand) {
        this.brand = brand;
    }

}
```

---

# Multiple Constructors

A class can have more than one constructor.

Example

```java
Car() {

}

Car(String brand) {

}
```

---

# Constructor Overloading

Creating multiple constructors with different parameters.

```java
Car() {

}

Car(String brand) {

}

Car(String brand, int speed) {

}
```

Java chooses the correct constructor based on the arguments passed.

---

# this Keyword

`this` refers to the **current object**.

Example

```java
class Car {

    String brand;

    Car(String brand) {
        this.brand = brand;
    }

}
```

Without `this`, Java cannot distinguish between the parameter and the instance variable when they have the same name.

---

# this vs Instance Variable

```java
class Car {

    String brand;

    Car(String brand) {

        this.brand = brand;

    }

}
```

Here

- Left side → Instance Variable
- Right side → Constructor Parameter

---

# Object Reference

```java
Car car1 = new Car();

Car car2 = car1;
```

Both references point to the **same object**.

```
car1 ----\
          \
           ---> Object
          /
car2 ----/
```

---

# Copy Constructor

Java has **no built-in copy constructor** like C++.

We create one manually.

Example

```java
Car(Car other) {

    this.brand = other.brand;

}
```

---

# Constructor Chaining

One constructor can call another constructor using `this()`.

Example

```java
Car() {

    this("BMW");

}

Car(String brand) {

    this.brand = brand;

}
```

`this()` must always be the first statement inside a constructor.

---

# Private Variables

Variables should usually be private.

```java
private String brand;
```

Benefits

- Protects data
- Prevents direct modification
- Supports Encapsulation

---

# Getter Method

Used to **read** private data.

```java
public String getBrand() {

    return brand;

}
```

---

# Setter Method

Used to **update** private data.

```java
public void setBrand(String brand) {

    this.brand = brand;

}
```

---

# Getter + Setter

```java
class Car {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
```

---

# Encapsulation

Encapsulation means **hiding data** and providing controlled access using getters and setters.

```
User

↓

Getter / Setter

↓

Private Variables
```

Benefits

- Better Security
- Better Maintainability
- Better Control
- Data Validation

---

# Destructor in Java

Unlike C++, **Java does not have destructors**.

Java automatically removes unused objects using the **Garbage Collector (GC)**.

```
Unused Object

↓

Garbage Collector

↓

Memory Released
```

---

# Constructor vs Method

| Constructor | Method |
|-------------|--------|
| Same name as class | Any valid name |
| No return type | Can return values |
| Called automatically | Called manually |
| Initializes object | Performs operations |

---

# Getter vs Setter

| Getter | Setter |
|---------|--------|
| Reads data | Updates data |
| Returns value | Usually returns void |
| Uses `get` prefix | Uses `set` prefix |

---

# this vs this()

| this | this() |
|------|--------|
| Refers to current object | Calls another constructor |
| Accesses variables | Used only inside constructors |

---

# Memory Representation

```
Stack

car1
 |
 |
 V

Heap

+----------------------+
| brand = "BMW"        |
| speed = 200          |
+----------------------+
```

Reference Variable → Stack

Object → Heap

---

# Quick Revision

- Constructor initializes objects.
- Constructors have no return type.
- Constructors can be overloaded.
- `this` refers to the current object.
- `this()` calls another constructor.
- Private variables improve security.
- Getters read data.
- Setters update data.
- Encapsulation hides data.
- Java uses Garbage Collection instead of destructors.