# ☕ Java Static Keyword Notes

---

# What is `static`?

The **`static` keyword** makes a variable, method, block, or nested class belong to the **class** instead of individual objects.

Static members are created **once** when the class is loaded into memory and are shared by all objects.

---

# Why Do We Use `static`?

Without `static`, every object gets its own copy of a variable.

Example:

```java
class Car {

    int wheels = 4;

}
```

If three objects are created:

```java
Car c1 = new Car();
Car c2 = new Car();
Car c3 = new Car();
```

Memory:

```
c1 → wheels = 4

c2 → wheels = 4

c3 → wheels = 4
```

Three copies are created.

With `static`:

```java
class Car {

    static int wheels = 4;

}
```

Memory:

```
Class Area

wheels = 4

      ▲
      │
 ┌────┼────┐
 │    │    │
c1   c2   c3
```

Only one copy exists.

---

# Static Variable

A static variable belongs to the class.

Example:

```java
class Car {

    static int wheels = 4;

}
```

Access:

```java
System.out.println(Car.wheels);
```

---

# Static Method

A static method belongs to the class.

It can be called without creating an object.

Example:

```java
class Calculator {

    static int add(int a, int b) {

        return a + b;

    }

}
```

Call:

```java
Calculator.add(10, 20);
```

---

# Why is `main()` Static?

Every Java program starts from:

```java
public static void main(String[] args)
```

The JVM calls `main()` before creating any objects.

Therefore, `main()` must be static.

---

# Static Block

A static block executes **only once** when the class is loaded.

Example:

```java
class Car {

    static {

        System.out.println("Class Loaded");

    }

}
```

Uses:

* Initialize static variables.
* Load configuration.
* Perform one-time setup.

---

# Static Nested Class

A static nested class is a class inside another class declared using `static`.

Example:

```java
class Car {

    static class Engine {

    }

}
```

Object Creation:

```java
Car.Engine engine = new Car.Engine();
```

No outer class object is required.

---

# Non-Static Nested Class

A non-static nested class belongs to an object of the outer class.

Example:

```java
class Car {

    class Engine {

    }

}
```

Object Creation:

```java
Car car = new Car();

Car.Engine engine = car.new Engine();
```

A `Car` object is required.

---

# Static Import

Static import allows using static members without writing the class name.

Without:

```java
Math.sqrt(25);
```

With:

```java
import static java.lang.Math.*;

sqrt(25);
```

Common methods:

* `sqrt()`
* `pow()`
* `abs()`
* `max()`
* `min()`
* `random()`
* `PI`
* `E`

---

# Static Memory

Static memory is allocated when the class is loaded by the JVM.

It stores:

* Static variables
* Static methods

Memory:

```
Class Area

college = "MSIT"

      ▲
      │
 ┌────┼────┐
 │    │    │
s1   s2   s3
```

Only one copy of the static variable exists.

---

# Static Rules

### Static Method

Can directly access:

* Static variables
* Static methods

Cannot directly access:

* Instance variables
* Instance methods
* `this`
* `super`

---

### Non-Static Method

Can access:

* Static variables
* Static methods
* Instance variables
* Instance methods

---

# Utility Class

A utility class contains only static methods.

Example:

```java
class Calculator {

    static int add(int a, int b) {

        return a + b;

    }

}
```

Call:

```java
Calculator.add(10, 20);
```

---

# static final

`static final` creates a constant.

Example:

```java
public static final double PI = 3.141592653589793;
```

The value cannot be changed.

---

# Singleton Pattern

Singleton ensures that only one object of a class is created.

Example:

```java
class Database {

    private static Database instance = new Database();

    private Database() {

    }

    public static Database getInstance() {

        return instance;

    }

}
```

---

# Static vs Non-Static

| Static                | Non-Static                |
| --------------------- | ------------------------- |
| Belongs to class      | Belongs to object         |
| One copy              | One copy per object       |
| Object not required   | Object required           |
| Shared by all objects | Separate for every object |
| Loaded with the class | Created with the object   |

---

# `this` and `super` with `static`

### `this`

* Refers to the current object.
* Cannot be used inside a static method.

### `super`

* Refers to the parent object.
* Cannot be used inside a static method.

Reason:

Static methods belong to the class, not to any object.

---

# Real-World Uses

`static` is commonly used for:

* `main()` method
* Utility classes
* `Math` class
* Constants
* Configuration values
* Singleton Pattern
* Helper methods
* Shared counters

---

# Learning Flow

```
Static Variable
        ↓
Static Method
        ↓
Static Block
        ↓
Static Nested Class
        ↓
Static Import
        ↓
Static Memory
        ↓
Static Rules
        ↓
Utility Class
        ↓
static final
        ↓
Singleton Pattern
```

---

# Interview Questions

### What is `static`?

A keyword that makes members belong to the class instead of objects.

---

### Why is `main()` static?

Because the JVM calls it before creating any objects.

---

### Can a static method access a non-static method directly?

No.

---

### Can a non-static method access a static method?

Yes.

---

### Can a static method use `this`?

No.

---

### Can a static method use `super`?

No.

---

### How many copies of a static variable exist?

Only one copy per class.

---

# Quick Revision

* `static` belongs to the class.
* Static variables are shared by all objects.
* Static methods can be called without creating an object.
* Static blocks execute once when the class loads.
* Static nested classes do not require an outer object.
* Static import removes the need to repeatedly write the class name.
* Static memory is allocated when the class is loaded.
* `static final` creates constants.
* Singleton Pattern uses a static instance to ensure only one object exists.
* Static methods cannot directly use `this`, `super`, or instance members.
