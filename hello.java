import java.util.Scanner;

public class SimpleJavaProgram {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Close the scanner
        scanner.close();
    }
}
