import java.util.Scanner;
public class Challenge05
{
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the name entered by the user
        String name = scanner.nextLine();

        // Respond with a welcome message
        System.out.println("Welcome " + name + " to Mark-Ross Agency");

        // Close the scanner
        scanner.close();
    }
}
