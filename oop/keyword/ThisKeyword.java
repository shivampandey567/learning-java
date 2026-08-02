package oop.keyword;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        // this refers to the current object's variables
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("shaurya", 16);

        s1.display();
    }
}

// output:
// shaurya
// 16