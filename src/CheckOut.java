import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {

        // Print a header message
        SafeInput.prettyHeader("check out your price");

        // Initialize a variable to keep track of the total price
        double totalPrice = 0.0;

        // Create a Scanner object to read input from the user
        Scanner pipe = new Scanner(System.in);

        // Set the prompt message for the confirmation prompt
        String confirmPrompt = "add more to the price?(y/n)";

        // Repeat until the user chooses to stop
        do {

            // Set the prompt message for the price input and get a double value within a range
            String prompt = "enter price between $0.50 to $9.99";
            double price = SafeInput.getRangedDouble(pipe, prompt, 0.50, 9.99);

            // Add the price to the total
            totalPrice += price;

        } while (SafeInput.getYNConfirm(pipe, confirmPrompt)); // Repeat if the user confirms with 'y'

        // Print the total price
        System.out.println("the total price is " + totalPrice);
    }
}
