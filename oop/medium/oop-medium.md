# ☕ Four Pillars of OOP in Java

---

# What are the Four Pillars of OOP?

The **Four Pillars of Object-Oriented Programming (OOP)** are the core principles that make programs **modular, reusable, secure, and easy to maintain**.

The four pillars are:

1. Encapsulation 🔒
2. Inheritance 👨‍👦
3. Polymorphism 🎭
4. Abstraction 🎨

---

# 1. Encapsulation 🔒

## Definition

**Encapsulation** means **hiding the data of an object** and providing controlled access to it using **getter** and **setter** methods.

Instead of allowing direct access to variables, we make them **private** and use methods to read or update them.

---

## Example

```java
class Car {

    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

}
```

---

## Why Use Encapsulation?

* Protects data from unauthorized access.
* Prevents accidental modification.
* Allows validation before updating data.
* Makes code easier to maintain.

---

## Real-Life Example

Think of an **ATM Machine**.

You cannot directly access the money inside the ATM.

Instead, you use buttons and menus to withdraw money.

```
User

↓

ATM Buttons

↓

Bank Database
```

The data is hidden, and access is controlled.

---

# 2. Inheritance 👨‍👦

## Definition

**Inheritance** allows one class to **inherit** the properties and methods of another class.

It helps in **code reuse**.

Java uses the **extends** keyword.

---

## Example

```java
class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }

}

class Car extends Vehicle {

}
```

```java
Car car = new Car();

car.start();
```

Output

```
Vehicle Started
```

---

## Why Use Inheritance?

* Reuse existing code.
* Reduce duplicate code.
* Make programs easier to extend.
* Improve maintainability.

---

## Real-Life Example

```
Vehicle

    ↑

   Car
```

A **Car is a Vehicle**.

Similarly,

```
Animal

   ↑

  Dog
```

A **Dog is an Animal**.

---

# Types of Inheritance in Java

* Single Inheritance
* Multilevel Inheritance
* Hierarchical Inheritance

> Java does **not** support multiple inheritance using classes because it can create ambiguity. It achieves similar behavior using **interfaces**.

---

# 3. Polymorphism 🎭

## Definition

**Polymorphism** means **one method or object can have many forms**.

There are two types of polymorphism.

---

## Compile-Time Polymorphism

Achieved using **Method Overloading**.

```java
int add(int a, int b)

double add(double a, double b)
```

The compiler decides which method to call.

---

## Runtime Polymorphism

Achieved using **Method Overriding**.

```java
class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }

}
```

Output

```
Bark
```

---

## Why Use Polymorphism?

* Makes code flexible.
* Improves readability.
* Makes programs easier to extend.
* Supports dynamic behavior.

---

## Real-Life Example

A single person can have multiple roles.

```
Student

↓

Employee

↓

Parent
```

The same person behaves differently depending on the situation.

---

# 4. Abstraction 🎨

## Definition

**Abstraction** means **showing only the important details** while hiding the implementation.

Users only know **what the object does**, not **how it works internally**.

Java provides abstraction using:

* Abstract Classes
* Interfaces

---

## Example

```java
abstract class Vehicle {

    abstract void start();

}

class Car extends Vehicle {

    @Override
    void start() {

        System.out.println("Car Started");

    }

}
```

---

## Why Use Abstraction?

* Hides complexity.
* Improves security.
* Makes applications easier to use.
* Reduces unnecessary details.

---

## Real-Life Example

When driving a car, you use:

* Steering Wheel
* Brake
* Accelerator

You do not need to know how the engine works internally.

---

# Difference Between the Four Pillars

| Pillar        | Meaning                   | Purpose            |
| ------------- | ------------------------- | ------------------ |
| Encapsulation | Hide data                 | Security           |
| Inheritance   | Reuse code                | Reduce duplication |
| Polymorphism  | One interface, many forms | Flexibility        |
| Abstraction   | Hide implementation       | Reduce complexity  |

---

# Easy Way to Remember

```
Encapsulation

↓

Hide Data
```

```
Inheritance

↓

Reuse Code
```

```
Polymorphism

↓

Many Forms
```

```
Abstraction

↓

Hide Complexity
```

---

# OOP Flow

```
Class

↓

Object

↓

Encapsulation

↓

Inheritance

↓

Polymorphism

↓

Abstraction

↓

Complete OOP Program
```

---

# Interview Questions

### What are the four pillars of OOP?

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

---

### Which pillar provides code reuse?

**Inheritance**

---

### Which pillar hides data?

**Encapsulation**

---

### Which pillar hides implementation?

**Abstraction**

---

### Which pillar allows one method to have many forms?

**Polymorphism**

---

# Quick Revision

* Encapsulation hides data using private variables and getters/setters.
* Inheritance allows one class to inherit another class.
* Polymorphism allows the same method name to behave differently.
* Abstraction hides implementation details and exposes only essential features.
* Together, these four pillars make Java programs reusable, secure, flexible, and maintainable.
