import java.util.Scanner;

public class IT24103591Lab5Q3 {
    
    // Constants
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int MIN_VALID_DATE = 1;
    private static final int MAX_VALID_DATE = 31;
    
    public static void main(String[] args) {
        
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables
        int startDate, endDate;
        
        // Prompt user for the start date and end date
        System.out.print("Enter the start date of reservation (1-31): ");
        startDate = scanner.nextInt();
        
        System.out.print("Enter the end date of reservation (1-31): ");
        endDate = scanner.nextInt();
        
        // Validation 1: Check if the dates are within valid range
        if (startDate < MIN_VALID_DATE || startDate > MAX_VALID_DATE || endDate < MIN_VALID_DATE || endDate > MAX_VALID_DATE) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; // Exit the program if the dates are invalid
        }
        
        // Validation 2: Check if the start date is before the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return; // Exit the program if the start date is not before the end date
        }
        
        // Calculate the number of days reserved
        int numDaysReserved = endDate - startDate + 1;
        
        // Determine the discount rate based on the number of days
        int discountRate = 0;
        if (numDaysReserved >= 5) {
            discountRate = 20;
        } else if (numDaysReserved >= 3) {
            discountRate = 10;
        }
        
        // Calculate the total amount before and after discount
        int totalAmount = numDaysReserved * ROOM_CHARGE_PER_DAY;
        int discountAmount = (totalAmount * discountRate) / 100;
        int amountToPay = totalAmount - discountAmount;
        
        // Output the result
        System.out.println("Number of days reserved: " + numDaysReserved);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + amountToPay);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
