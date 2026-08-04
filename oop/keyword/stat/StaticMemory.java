// Static variables have only one copy
// shared by all objects.

package oop.keyword.stat;

class Student {
    String name;
    static String college = "MSIT";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name + " studies at " + Student.college);
    }
}

public class StaticMemory {
    public static void main(String[] args) {
        Student s1 = new Student("shaurya");
        Student s2 = new Student("rahul");

        s1.display();
        s2.display();

        System.out.println();

        Student.college = "IIT Delhi";

        s1.display();
        s2.display();
    }
}

// output:
// shaurya studies at MSIT
// rahul studies at MSIT
//
// shaurya studies at IIT Delhi
// rahul studies at IIT Delhi