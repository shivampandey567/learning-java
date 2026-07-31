import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter you age: ");
        int age = sc.nextInt();

        System.out.print("Enter you gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Are you student: ");
        Boolean isStudent = sc.nextBoolean();

        System.out.print("Enter your height: ");
        Float height = sc.nextFloat();

        System.out.println("\nYour name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your gender: " + gender);
        System.out.println("Is student: " + isStudent);
        System.out.println("Your height: " + height);

        sc.close();
    }
}