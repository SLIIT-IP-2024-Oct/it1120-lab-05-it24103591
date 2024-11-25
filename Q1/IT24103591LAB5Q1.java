import java.util.Scanner;

public class IT24103591Lab5Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables to store the three integers
        int num1, num2, num3;

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        num3 = scanner.nextInt();
        
        // Find the smallest and largest numbers using conditional statements
        int smallest = num1; // Assume num1 is the smallest
        int largest = num1; // Assume num1 is the largest

        // Compare num2 with smallest and largest
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num2 > largest) {
            largest = num2;
        }

        // Compare num3 with smallest and largest
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Output the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
