import java.util.Scanner;

public class Challenge08
{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform and display all arithmetic operations
        System.out.println("\nResults of arithmetic operations:");
        System.out.println("Addition (num1 + num2): " + (num1 + num2));
        System.out.println("Subtraction (num1 - num2): " + (num1 - num2));
        System.out.println("Multiplication (num1 * num2): " + (num1 * num2));

        // Check if num2 is not zero before performing division to avoid division by zero
        if (num2 != 0) {
            System.out.println("Division (num1 / num2): " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Perform modulus operation, checking for division by zero
        if (num2 != 0) {
            System.out.println("Modulus (num1 % num2): " + (num1 % num2));
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }

        // Close the scanner
        scanner.close();
    }
}
