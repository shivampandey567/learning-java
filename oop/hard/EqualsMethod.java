// equals() compares the contents of two objects.

package oop.hard;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;

        return name.equals(other.name) && age == other.age;

    }

}

public class EqualsMethod {

    public static void main(String[] args) {

        Student s1 = new Student("Shivam", 20);

        Student s2 = new Student("Shivam", 20);

        Student s3 = new Student("Rahul", 21);

        System.out.println(s1.equals(s2));

        System.out.println(s1.equals(s3));

    }

}

// output:
// true
// false