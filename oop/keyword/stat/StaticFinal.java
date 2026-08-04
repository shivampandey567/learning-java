// static final variables are constants 
// and cannot be changed.

package oop.keyword.stat;

class Car {
    public static final int wheels = 4;

    public static final String comapny = "BMW";
}

public class StaticFinal {
    public static void main(String[] args) {
        System.out.println("Company : " + Car.comapny);
        System.out.println("Wheels : " + Car.wheels);

        // Car.WHEELS = 6; ❌ Error
        // Car.COMPANY = "Audi"; ❌ Error
    }
}

// output:
// Company : BMW
// Wheels : 4