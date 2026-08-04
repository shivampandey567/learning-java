// Immutable means the object data 
// cannot be changed after creation.

package oop.hard;

final class Student {
    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Student s1 = new Student("Shaurya", 20);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());

        // s1.name="kartik"; ❌ Error cannot done this
    }
}

// output:
// shaurya
// 20