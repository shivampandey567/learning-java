import java.util.Scanner; //import scanner to use input in java

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // use this for string with spaces

        System.out.print("Enter you age: ");
        int age = sc.nextInt(); // use this for int

        System.out.print("Enter you gender (M/F): ");
        char gender = sc.next().charAt(0); // use this for a char points to first index

        System.out.print("Are you student: ");
        Boolean isStudent = sc.nextBoolean(); // use this for bool

        System.out.print("Enter your height: ");
        Float height = sc.nextFloat(); // use this for float

        System.out.println("\nYour name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your gender: " + gender);
        System.out.println("Is student: " + isStudent);
        System.out.println("Your height: " + height);

        sc.close(); // close the scanner after using
    }
}

// input:
// Enter your name: shaurya walia
// Enter you age: 20
// Enter you gender (M/F): M
// Are you student: true
// Enter your height: 6.78

// output:
// Your name: shaurya walia
// Your age: 20
// Your gender: M
// Is student: true
// Your height: 6.78