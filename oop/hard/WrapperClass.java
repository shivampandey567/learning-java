// Wrapper classes convert primitive 
// data types into objects.

package oop.hard;

public class WrapperClass {
    public static void main(String[] args) {

        Integer number = Integer.valueOf(100);

        Double price = Double.valueOf(999.99);

        Character grade = Character.valueOf('A');

        Boolean result = Boolean.valueOf(true);

        System.out.println(number);

        System.out.println(price);

        System.out.println(grade);

        System.out.println(result);

    }
}

// output:
// 100
// 999.99
// A
// true