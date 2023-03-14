import java.util.Scanner;

public class FavNumber {

    // Start of main method
    public static void main(String[] args) {
        // Create a new scanner object to read input from the console
        Scanner in = new Scanner(System.in);

        // Declare variables to hold the user's favorite integer and double
        int intNum;
        double doubleNum;

        // Prompt the user to enter their favorite double and integer, and read their input
        doubleNum = SafeInput.getDouble(in, "enter your favorite double number");
        intNum = SafeInput.getInt(in, "enter your favorite number");

        // Print out the user's favorite double and integer
        System.out.println("\nyour favorite double number is: " + doubleNum);
        System.out.println("\nyour favorite number is: " + intNum);}}

// End of main method
