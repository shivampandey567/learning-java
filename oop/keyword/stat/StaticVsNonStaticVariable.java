// static method dont have access of a instance variable
// need to create the object to access instance variables

// on the other hand a non-static method have access of static 
// variables beacuse we dont have to create object to use them

package oop.keyword.stat;

class Demo {
    static int x = 10;
    int y = 20;

    static void staticMethod() {
        System.out.println("Static Method");
        System.out.println(x);
        // System.out.println(y); ❌ Not Allowed
    }

    void nonStaticMethod() {
        System.out.println("Non-Static Method");
        System.out.println(x);
        System.out.println(y);
        staticMethod();
    }
}

public class StaticVsNonStaticVariable {
    public static void main(String[] args) {
        Demo obj = new Demo();

        Demo.staticMethod();

        System.out.println();

        obj.nonStaticMethod();
    }
}
