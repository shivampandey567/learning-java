// clone() creates another object
// having the same values.

package oop.hard;

class Student implements Cloneable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ObjectCloning {
    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student s1 = new Student("Shivam", 20);

        Student s2 = (Student) s1.clone();

        System.out.println("Original");

        System.out.println(s1.name);

        System.out.println(s1.age);

        System.out.println();

        System.out.println("Clone");

        System.out.println(s2.name);

        System.out.println(s2.age);

    }
}

// output:
// Original
// Shivam
// 20
//
// Clone
// Shivam
// 20