import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Addition ");
        System.out.println("Press 2 for Subtraction ");
        System.out.println("Press 3 for Multiplication ");
        System.out.println("Press 4 for Division ");

        System.out.println("Enter your choice :");

        int choice = sc.nextInt();

        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();


        Calculator myCalculator = new Calculator();

        if (choice == 1) {
            myCalculator.addition(a,b);

        } else if (choice == 2) {
            myCalculator.subtract(a, b);

        } else if (choice == 3) {
            myCalculator.multiplication(a, b);

        } else if (choice == 4) {
            myCalculator.division(a, b);

        } else {
            System.out.println("You made an invalid choice");
        }

    }
}