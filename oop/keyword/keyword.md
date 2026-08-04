# ☕ Java Keywords Notes

---

# What are Keywords?

**Keywords** are reserved words in Java that have a predefined meaning.

They are used by the Java compiler to perform specific tasks and **cannot be used as variable names, method names, or class names**.

Example:

```java
class Student {

}
```

Here, `class` is a keyword.

---

# 1. class

Used to create a class.

Example:

```java
class Car {

}
```

---

# 2. new

Creates a new object.

Example:

```java
Car car = new Car();
```

---

# 3. this

Refers to the **current object**.

Uses:

* Access instance variables.
* Resolve naming conflicts.
* Call methods of the current object.
* Call another constructor using `this()`.

Example:

```java
this.brand = brand;
```

---

# 4. super

Refers to the **immediate parent class**.

Uses:

* Access parent variables.
* Call parent methods.
* Call parent constructor using `super()`.

Example:

```java
super.display();
```

---

# 5. extends

Used for inheritance.

Example:

```java
class Dog extends Animal {

}
```

---

# 6. implements

Used to implement an interface.

Example:

```java
class Dog implements Animal {

}
```

---

# 7. interface

Used to create an interface.

An interface defines a contract that implementing classes must follow.

Example:

```java
interface Animal {

    void sound();

}
```

---

# 8. abstract

Used to create:

* Abstract classes
* Abstract methods

Abstract classes cannot be instantiated.

Example:

```java
abstract class Animal {

    abstract void sound();

}
```

---

# 9. final

Used to prevent modification.

Can be used with:

* Variables
* Methods
* Classes

Example:

```java
final int speed = 220;
```

---

# 10. static

Makes variables, methods, blocks, or nested classes belong to the class instead of objects.

Example:

```java
static int count;
```

---

# 11. public

Accessible from anywhere.

Example:

```java
public class Main {

}
```

---

# 12. private

Accessible only inside the same class.

Example:

```java
private String name;
```

---

# 13. protected

Accessible:

* Inside the same package
* By subclasses

Example:

```java
protected int age;
```

---

# 14. default (Package-Private)

If no access modifier is written, the member is accessible only within the same package.

Example:

```java
class Student {

}
```

---

# 15. void

Indicates that a method does **not return** any value.

Example:

```java
void display() {

}
```

---

# 16. return

Returns a value from a method.

Example:

```java
return speed;
```

---

# 17. instanceof

Checks whether an object belongs to a particular class or interface.

Example:

```java
dog instanceof Animal
```

Output:

```text
true
```

---

# 18. package

Declares the package to which a class belongs.

Example:

```java
package oop.easy;
```

---

# 19. import

Imports classes or packages.

Example:

```java
import java.util.Scanner;
```

---

# 20. @Override

`@Override` is **not a keyword**.

It is an **annotation** that tells the compiler a method overrides a parent class or interface method.

Example:

```java
@Override
void sound() {

}
```

---

# Access Modifier Keywords

| Keyword   | Access Level              |
| --------- | ------------------------- |
| public    | Everywhere                |
| protected | Same package + subclasses |
| default   | Same package              |
| private   | Same class only           |

---

# Constructor Keywords

| Keyword | Purpose                                     |
| ------- | ------------------------------------------- |
| this()  | Calls another constructor in the same class |
| super() | Calls the parent class constructor          |

---

# Inheritance Keywords

| Keyword    | Purpose                     |
| ---------- | --------------------------- |
| extends    | Inherit from a class        |
| implements | Implement an interface      |
| super      | Access parent class members |

---

# OOP Keywords

| Keyword    | Use                      |
| ---------- | ------------------------ |
| class      | Create a class           |
| new        | Create an object         |
| this       | Current object           |
| super      | Parent class             |
| extends    | Inheritance              |
| implements | Interface implementation |
| interface  | Create an interface      |
| abstract   | Abstract class or method |
| final      | Prevent modification     |
| static     | Belongs to the class     |

---

# Java Keyword Learning Flow

```text
class
   ↓
new
   ↓
this
   ↓
super
   ↓
extends
   ↓
implements
   ↓
interface
   ↓
abstract
   ↓
static
   ↓
final
   ↓
instanceof
```

---

# Quick Revision

* `class` → Creates a class.
* `new` → Creates an object.
* `this` → Refers to the current object.
* `super` → Refers to the parent class.
* `extends` → Inherits a class.
* `implements` → Implements an interface.
* `interface` → Defines a contract.
* `abstract` → Creates abstract classes or methods.
* `final` → Prevents modification, inheritance, or overriding.
* `static` → Belongs to the class.
* `public` → Accessible everywhere.
* `private` → Accessible only inside the same class.
* `protected` → Accessible within the package and subclasses.
* `default` → Accessible within the same package.
* `void` → No return value.
* `return` → Returns a value.
* `instanceof` → Checks an object's type.
* `package` → Declares a package.
* `import` → Imports classes or packages.
* `@Override` → Annotation used when overriding methods.

---

# Interview Tips

* `this` → Current object.
* `super` → Parent class.
* `extends` → Inherit a class.
* `implements` → Implement an interface.
* `static` → Belongs to the class.
* `final` → Prevents changes.
* `instanceof` → Checks an object's type.
* `@Override` is an annotation, **not** a Java keyword.
