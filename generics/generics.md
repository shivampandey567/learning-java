# 📘 Java Generics

> A complete beginner-friendly guide to Java Generics with examples.

---

# 📑 Table of Contents

- What are Generics?
- Why do we need Generics?
- Type Parameters
- Generic Class
- Generic Methods
- Generic Interfaces
- Multiple Type Parameters
- Generic Records
- Nested Generics
- Diamond Operator
- Generic Arrays
- `this.value` vs `value`
- Real World Examples
- Best Practices
- Interview Questions
- Summary

---

# What are Generics?

Generics allow us to write **one class, interface, or method** that works with multiple data types while maintaining **compile-time type safety**.

Instead of writing separate classes for different types:

```java
StringBox
IntegerBox
DoubleBox
```

we can write one generic class:

```java
class Box<T> {

    private T value;

}
```

Here, `T` is a placeholder for a datatype.

---

# Why do we need Generics?

Without Generics:

```java
class Box {

    Object value;

}
```

Usage

```java
Box box = new Box();

box.value = "Java";

String s = (String) box.value;
```

Problems

- Manual Casting
- Runtime Errors
- No Type Safety

---

With Generics

```java
Box<String> box = new Box<>();

box.set("Java");
```

Advantages

- ✅ Compile-time Type Safety
- ✅ No Casting
- ✅ Reusable Code
- ✅ Cleaner Code

---

# Type Parameters

Common Generic Letters

| Letter | Meaning |
|---------|---------|
| T | Type |
| E | Element |
| K | Key |
| V | Value |
| N | Number |

Example

```java
Map<String,Integer>
```

```
K = String

V = Integer
```

---

# Generic Class

```java
public class Box<T> {

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }

}
```

Usage

```java
Box<String> box = new Box<>();

box.set("Hello");

System.out.println(box.get());
```

Output

```
Hello
```

---

# Using Different Datatypes

String

```java
Box<String> box = new Box<>();

box.set("Java");
```

Integer

```java
Box<Integer> box = new Box<>();

box.set(100);
```

Double

```java
Box<Double> box = new Box<>();

box.set(99.99);
```

Custom Object

```java
Box<Employee> employeeBox = new Box<>();
```

---

# Multiple Type Parameters

```java
class Pair<K,V>{

    K key;

    V value;

    Pair(K key,V value){

        this.key = key;
        this.value = value;

    }

}
```

Usage

```java
Pair<Integer,String> student =
        new Pair<>(101,"Shivam");
```

---

# Generic Methods

```java
class Printer{

    public <T> void print(T value){

        System.out.println(value);

    }

}
```

Usage

```java
Printer p = new Printer();

p.print(100);

p.print("Java");

p.print(true);
```

---

# Generic Return Method

```java
public static <T> T getValue(T value){

    return value;

}
```

Usage

```java
String name = getValue("Shivam");

Integer age = getValue(20);
```

---

# Generic Interface

```java
interface Storage<T>{

    void add(T item);

    T get();

}
```

Implementation

```java
class StudentStorage implements Storage<String>{

    private String student;

    public void add(String item){

        student = item;

    }

    public String get(){

        return student;

    }

}
```

---

# Generic Record (Java 16+)

```java
public record Result<T>(T data){}
```

Usage

```java
Result<String> r =
        new Result<>("Success");
```

---

# Nested Generics

Example

```java
Map<String,List<Employee>>
```

Even more

```java
HashMap<String,
        ArrayList<Box<Employee>>>
```

---

# Diamond Operator

Old Java

```java
Box<String> box =
new Box<String>();
```

Modern Java

```java
Box<String> box =
new Box<>();
```

---

# Generic Arrays

❌ Not Allowed

```java
T[] arr = new T[10];
```

Use

```java
ArrayList<T> list =
new ArrayList<>();
```

---

# this.value vs value

```java
private T value;
```

Setter

```java
public void set(T value){

    this.value = value;

}
```

Here

```
this.value
```

means

> Instance Variable

while

```
value
```

means

> Method Parameter

---

Inside another method

```java
public void print(){

    System.out.println(value);

}
```

and

```java
public void print(){

    System.out.println(this.value);

}
```

Both are correct because there is no local variable named `value`.

---

# Real World Examples

Collections

```java
List<Employee>
```

Map

```java
Map<String,Integer>
```

Optional

```java
Optional<User>
```

Spring Boot

```java
JpaRepository<User,Long>
```

Response

```java
ResponseEntity<User>
```

Comparator

```java
Comparator<Employee>
```

---

# Best Practices

✅ Use meaningful generic letters.

```
T
E
K
V
N
```

---

✅ Prefer Collections over Generic Arrays.

---

✅ Use the Diamond Operator.

```java
new Box<>();
```

---

✅ Use `this.field` when parameter names and field names are the same.

---

# Interview Questions

## What are Generics?

Generics are a Java feature that allows classes, methods, and interfaces to work with different data types while providing compile-time type safety.

---

## Why were Generics introduced?

- Type Safety
- Remove Casting
- Reusable Code
- Prevent Runtime Errors

---

## What does `<T>` mean?

A placeholder representing the datatype that will be provided when the generic class or method is used.

---

## What is the difference between `Object` and Generics?

| Object | Generics |
|---------|----------|
| Requires Casting | No Casting |
| Runtime Errors | Compile-time Safety |
| Less Type Safe | Fully Type Safe |

---

# Summary

✔ Generic Classes

✔ Generic Methods

✔ Generic Interfaces

✔ Generic Records

✔ Multiple Type Parameters

✔ Nested Generics

✔ Diamond Operator

✔ Type Safety

✔ Compile-time Checking

✔ No Manual Casting

---

# Next Topics

- Bounded Generics (`extends`)
- Multiple Bounds
- Wildcards (`?`)
- `? extends`
- `? super`
- PECS Rule
- Type Erasure
- Generic Collections Deep Dive

---

⭐ If these notes helped you, consider starring the repository!