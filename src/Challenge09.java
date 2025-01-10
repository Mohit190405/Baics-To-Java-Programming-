import java.util.Scanner;
public class Challenge09
{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first floating-point number
        System.out.print("Enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        // Prompt the user to enter the second floating-point number
        System.out.print("Enter the second floating-point number: ");
        float num2 = scanner.nextFloat();

        // Calculate the product of the two numbers
        float product = num1 * num2;

        // Display the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Close the scanner
        scanner.close();
    }
}
