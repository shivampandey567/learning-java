// A Record is a special type of class used to store immutable data.
// Java Version Required : Java 16+
// a record auto generate toString(), equals(), hasCode(), getters

package oop.hard;

record Student(String name, int age) {
}

public class Record {
    public static void main(String[] args) {
        Student s1 = new Student("shaurya", 16);
        Student s2 = new Student("kartik", 34);
        Student s3 = new Student("shaurya", 16);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(s1.name());
        System.out.println(s1.age());
        System.out.println(s2.name());

        System.out.println(s1.getClass());
    }
}

// output:
// Student[name=shaurya, age=16]
// Student[name=kartik, age=34]
// Student[name=shaurya, age=16]
// Student[name=shaurya, age=16]
// Student[name=kartik, age=34]
// Student[name=shaurya, age=16]
// true
// false
// false
// -740576993
// -935484888
// -740576993
// shaurya
// 16
// kartik
// class oop.hard.Student