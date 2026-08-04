# ☕ Java OOP Advanced Notes

---

# Introduction

After learning the core concepts of OOP (Classes, Objects, Constructors, Inheritance, Polymorphism, Abstraction, Encapsulation, Interfaces, and Static), Java provides several advanced features that make code cleaner, safer, and easier to maintain.

This section covers the most commonly used advanced OOP topics.

---

# 1. Inner Class

An **Inner Class** is a class declared inside another class.

### Features

* Can access all members of the outer class.
* Requires an object of the outer class.
* Helps organize related classes.

Example:

```java
class Car {

    class Engine {

    }

}
```

Object Creation

```java
Car car = new Car();

Car.Engine engine = car.new Engine();
```

---

# 2. Local Inner Class

A **Local Inner Class** is declared inside a method.

### Features

* Exists only inside that method.
* Cannot be accessed outside the method.
* Useful for small helper classes.

Example

```java
void display() {

    class Engine {

    }

}
```

---

# 3. Anonymous Inner Class

An **Anonymous Inner Class** is a class without a name.

### Features

* Used only once.
* Created while creating an object.
* Often used to override methods quickly.

Example

```java
Animal animal = new Animal() {

    @Override
    void sound() {

        System.out.println("Dog Barks");

    }

};
```

---

# 4. Lambda Expression

A **Lambda Expression** is a short way to implement a **Functional Interface**.

A Functional Interface contains exactly **one abstract method**.

Example

```java
Greeting greet = () -> {

    System.out.println("Hello");

};
```

### Advantages

* Less code
* Cleaner syntax
* Commonly used with Streams and Collections

---

# 5. Enum

An **Enum** stores a fixed set of constants.

Example

```java
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY

}
```

### Uses

* Days of week
* Months
* Status values
* Roles
* Directions

---

# 6. Record (Java 16+)

A **Record** is a special type of class used to store immutable data.

Example

```java
record Student(String name, int age) {

}
```

The compiler automatically generates:

* Constructor
* Accessor methods
* equals()
* hashCode()
* toString()

### Uses

* DTOs
* API responses
* Configuration objects
* Read-only data

---

# 7. Sealed Class (Java 17+)

A **Sealed Class** controls which classes can inherit it.

Example

```java
sealed class Animal permits Dog, Cat {

}
```

### Advantages

* Better control over inheritance
* Improved code safety
* Easier maintenance

---

# 8. Immutable Class

An **Immutable Class** cannot be modified after its object is created.

Characteristics

* Class is usually `final`
* Fields are `private final`
* No setters
* Values are assigned only through the constructor

Example

```java
final class Student {

    private final String name;

}
```

### Advantages

* Thread-safe
* Secure
* Easy to use

---

# 9. Cloneable Interface

The **Cloneable** interface allows an object to be cloned.

Example

```java
class Car implements Cloneable {

}
```

Cloning creates a new object with the same field values.

---

# 10. Object Cloning

Object cloning creates a copy of an existing object using `clone()`.

Example

```java
Student s2 = (Student) s1.clone();
```

### Types

* Shallow Copy
* Deep Copy

---

# 11. equals()

The **equals()** method compares the contents of two objects.

Example

```java
s1.equals(s2);
```

### Difference

```java
==
```

Compares memory addresses.

```java
equals()
```

Compares object data (when overridden).

---

# 12. hashCode()

The **hashCode()** method returns an integer hash value for an object.

Objects that are equal should produce the same hash code.

Example

```java
student.hashCode();
```

### Uses

* HashMap
* HashSet
* Hashtable

---

# 13. toString()

The **toString()** method returns a string representation of an object.

Without overriding

```text
Student@5a07e868
```

After overriding

```text
Student{name='Shivam', age=20}
```

---

# 14. Wrapper Classes

Wrapper Classes convert primitive data types into objects.

| Primitive | Wrapper Class |
| --------- | ------------- |
| byte      | Byte          |
| short     | Short         |
| int       | Integer       |
| long      | Long          |
| float     | Float         |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |

### Why use Wrapper Classes?

Collections such as `ArrayList` and `HashMap` store objects, not primitive types.

---

# 15. Autoboxing & Unboxing

### Autoboxing

Automatically converts a primitive into a wrapper object.

```java
Integer number = 100;
```

---

### Unboxing

Automatically converts a wrapper object back into a primitive.

```java
int value = number;
```

---

# Learning Flow

```text
Inner Class
      ↓
Local Inner Class
      ↓
Anonymous Inner Class
      ↓
Lambda Expression
      ↓
Enum
      ↓
Record
      ↓
Sealed Class
      ↓
Immutable Class
      ↓
Cloneable Interface
      ↓
Object Cloning
      ↓
equals()
      ↓
hashCode()
      ↓
toString()
      ↓
Wrapper Classes
      ↓
Autoboxing & Unboxing
```

---

# Interview Questions

### What is an Inner Class?

A class declared inside another class.

---

### What is a Record?

A special immutable class that automatically generates constructors, accessors, `equals()`, `hashCode()`, and `toString()`.

---

### What is a Sealed Class?

A class that restricts which classes can inherit from it.

---

### What is an Immutable Class?

A class whose objects cannot be modified after creation.

---

### Difference between `==` and `equals()`?

* `==` compares references.
* `equals()` compares object contents (if implemented accordingly).

---

### Why is `hashCode()` important?

It enables efficient storage and lookup in hash-based collections like `HashMap` and `HashSet`.

---

### Why are Wrapper Classes needed?

Because Java Collections work with objects, not primitive data types.

---

### What is Autoboxing?

Automatic conversion of a primitive type into its wrapper object.

---

### What is Unboxing?

Automatic conversion of a wrapper object into its primitive type.

---

# Quick Revision

* Inner Class → Class inside another class.
* Local Inner Class → Class inside a method.
* Anonymous Inner Class → One-time unnamed class.
* Lambda Expression → Short implementation of a functional interface.
* Enum → Fixed set of constants.
* Record → Immutable data class.
* Sealed Class → Restricted inheritance.
* Immutable Class → Object cannot be modified.
* Cloneable → Allows object cloning.
* Object Cloning → Creates a copy of an object.
* equals() → Compares object contents.
* hashCode() → Generates a hash value.
* toString() → Returns a readable string representation.
* Wrapper Classes → Convert primitives into objects.
* Autoboxing → Primitive → Wrapper.
* Unboxing → Wrapper → Primitive.