import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner pipe = new Scanner(System.in);
        // Prompt the user to enter their birth year and validate the input
        String brithYearPrompt = "enter you birth year, must be between 1950 and 2010";
        int year = SafeInput.getRangedInt(pipe, brithYearPrompt, 1950, 2010);
        // Prompt the user to enter their birth month and validate the input
        String brithMonthPrompt = "enter you birth month, must be between 1 and 12 ";
        int month = SafeInput.getRangedInt(pipe, brithMonthPrompt, 1, 12);
        // Validate the user's input for the birth day based on the entered month
        String brithDayPrompt = "enter you birth day, be realistic";
        int day = validateDay(pipe, brithDayPrompt, month);
        // Format the date of birth as a string and print it
        String dob = month + "/" + day + "/" + year;
        System.out.println("your date of birth is " + dob);
        // Print a header message
        SafeInput.prettyHeader("birth");
    }
    // A helper method to validate the user's input for the birth day based on the entered month
    private static int validateDay(Scanner pipe, String brithDayPrompt, int month) {

        switch (month) {

            // If the month is January, March, May, July, August, October, or December, allow 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return SafeInput.getRangedInt(pipe, brithDayPrompt, 1, 31);

            // If the month is April, June, September, or November, allow 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                return SafeInput.getRangedInt(pipe, brithDayPrompt, 1, 30);

            // If the month is February, allow 29 days (we assume a leap year)
            case 2:
                return SafeInput.getRangedInt(pipe, brithDayPrompt, 1, 29);
        }
        return month;
    }}
        // If the month is invalid, prompt the user to enter a value between 1 and 12
