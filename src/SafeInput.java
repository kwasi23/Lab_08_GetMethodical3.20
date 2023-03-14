import java.util.Scanner;
import java.util.regex.*;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // Prompt user for input
            retString = pipe.nextLine(); // Read user input
        } while (retString.length() == 0); // Keep prompting user until input is not empty
        return retString; // Return user input
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt;
        while (true) {
            try {
                System.out.print("\n" + prompt + ": "); // Prompt user for input
                retInt = Integer.parseInt(pipe.nextLine()); // Read user input as integer
                break;
            } catch (Exception e) {
                // Ignore exception and keep looping
            }
        }
        return retInt; // Return user input as integer
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble;
        while (true) {
            try {
                System.out.print("\n" + prompt + ": "); // Prompt user for input
                retDouble = Double.parseDouble(pipe.nextLine()); // Read user input as double
                break;
            } catch (Exception e) {
                // Ignore exception and keep looping
            }
        }
        return retDouble; // Return user input as double
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt;
        do {
            retInt = getInt(pipe, prompt); // Get integer input from user
        } while (retInt < low || retInt > high); // Keep prompting user until input is within range
        return retInt; // Return user input as integer
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String str;
        while (true) {
            str = getNonZeroLenString(pipe, prompt); // Get non-empty string input from user
            if (str.equalsIgnoreCase("y") || str.equalsIgnoreCase("Y")) { // Check if input is "y" or "Y"
                break; // Exit loop if input is affirmative
            }
        }
        return str.equalsIgnoreCase("y"); // Return true if input is affirmative, false otherwise
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String str = "";
        Pattern p = Pattern.compile(regEx); // Compile the regular expression pattern
        Matcher m;
        do {
            str = getNonZeroLenString(pipe, prompt); // Get non-empty string input from user
            m = p.matcher(str); // Create matcher object from regular expression pattern and user input
        } while (!m.matches()); // Keep prompting user until input matches regular expression pattern
        return str; // Return user input
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retDouble = 0;
        do {
            System.out.print("\n" + prompt + ": "); // Prompt user for input
            retDouble = pipe.nextDouble(); // Read user input as double
        } while (retDouble <= low || retDouble >= high); // Keep prompting user until input is within range
        return retDouble;}} // Return
