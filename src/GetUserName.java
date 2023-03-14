import java.util.Scanner; //The code imports the Scanner class from the java.util package
public class GetUserName //The code defines the GetUserName class.
{ public static void main(String[] args) //The code defines the main method, which is the entry point for the program.

    {
        Scanner in = new Scanner(System.in);
        String lastName = "";
        String firstName = "";
//The code initializes two empty strings, 'firstName' and 'lastName'

        firstName = SafeInput.getNonZeroLenString(in, "enter first name"); // The user's input is stored in the 'firstName' variable.
        lastName = SafeInput.getNonZeroLenString(in, "enter last name"); // The user's input is stored in the 'lastName' variable.
        System.out.println("\nyour full name is: " + firstName + " " + lastName);
    }

}


