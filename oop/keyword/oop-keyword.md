# ☕ Java OOP Keywords

---

# What are Keywords?

**Keywords** are reserved words in Java that have a predefined meaning. They are used to perform specific tasks and **cannot be used as variable, method, or class names**.

Example:

```java
class Student {

}
```

Here, `class` is a keyword.

---

# 1. class

Used to create a class.

```java
class Car {

}
```

---

# 2. new

Creates a new object.

```java
Car car = new Car();
```

---

# 3. this

Refers to the **current object**.

```java
this.brand = brand;
```

Uses:

* Access instance variables.
* Call methods of the current object.
* Resolve naming conflicts.
* Call another constructor using `this()`.

---

# 4. super

Refers to the **parent class**.

```java
super.display();
```

Uses:

* Access parent variables.
* Call parent methods.
* Call parent constructor using `super()`.

---

# 5. extends

Used to inherit a class.

```java
class Dog extends Animal {

}
```

---

# 6. implements

Used to implement an interface.

```java
class Dog implements Animal {

}
```

---

# 7. interface

Used to create an interface.

```java
interface Animal {

    void sound();

}
```

---

# 8. abstract

Used to create abstract classes and abstract methods.

```java
abstract class Animal {

    abstract void sound();

}
```

---

# 9. final

Prevents modification.

```java
final int speed = 220;
```

Can also prevent:

* Method overriding
* Class inheritance

---

# 10. public

Accessible from anywhere.

```java
public class Main {

}
```

---

# 11. private

Accessible only inside the same class.

```java
private String name;
```

---

# 12. protected

Accessible within the same package and by subclasses.

```java
protected int age;
```

---

# 13. static

Belongs to the class instead of an object.

```java
static int count;
```

---

# 14. void

Indicates that a method does **not return** a value.

```java
void display() {

}
```

---

# 15. return

Returns a value from a method.

```java
return speed;
```

---

# 16. instanceof

Checks whether an object belongs to a particular class or interface.

```java
dog instanceof Animal
```

Output

```text
true
```

---

# 17. package

Declares the package of a Java class.

```java
package oop.easy;
```

---

# 18. import

Imports classes or packages.

```java
import java.util.Scanner;
```

---

# 19. @Override

`@Override` is **not a keyword**. It is an **annotation** that tells the compiler a method overrides a parent method.

```java
@Override
void sound() {

}
```

---

# Access Modifier Keywords

| Keyword   | Access                    |
| --------- | ------------------------- |
| public    | Everywhere                |
| private   | Same class only           |
| protected | Same package + subclasses |
| default   | Same package              |

---

# Constructor Keywords

| Keyword | Purpose                                     |
| ------- | ------------------------------------------- |
| this()  | Calls another constructor in the same class |
| super() | Calls the parent class constructor          |

---

# Inheritance Keywords

| Keyword    | Purpose                |
| ---------- | ---------------------- |
| extends    | Inherit from a class   |
| implements | Implement an interface |
| super      | Access parent class    |

---

# OOP Learning Flow

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

final
↓

instanceof
```

---

# Quick Revision

* `class` → Create a class
* `new` → Create an object
* `this` → Current object
* `super` → Parent class
* `extends` → Inheritance
* `implements` → Interface implementation
* `interface` → Create an interface
* `abstract` → Abstract class or method
* `final` → Prevent modification
* `public` → Accessible everywhere
* `private` → Accessible only inside the class
* `protected` → Accessible in the package and subclasses
* `static` → Belongs to the class
* `void` → No return value
* `return` → Return a value
* `instanceof` → Check object type
* `package` → Declare package
* `import` → Import classes/packages
* `@Override` → Annotation for method overriding

---

# Interview Tip

Remember these three differences:

* `this` → Refers to the current object.
* `super` → Refers to the parent class.
* `new` → Creates a new object.
