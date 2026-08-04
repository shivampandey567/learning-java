// toString() returns a string representation of an object.

package oop.hard;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + this.name + "', age=" + this.age + "}";
    }
}

public class ToStringMethod {
    public static void main(String[] args) {
        Student student = new Student("shaurya", 16);

        System.out.println(student);
    }
}

// output:
// Student{name='shaurya', age=16}