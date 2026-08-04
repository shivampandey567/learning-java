// hashCode() returns a hash value for an object.

package oop.hard;

import java.util.Objects;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class HashCodeMethod {
    public static void main(String[] args) {
        Student s1 = new Student("Shivam", 20);

        Student s2 = new Student("Shivam", 20);

        System.out.println(s1.hashCode());

        System.out.println(s2.hashCode());
    }
}

// output:
// -568591481
// -568591481