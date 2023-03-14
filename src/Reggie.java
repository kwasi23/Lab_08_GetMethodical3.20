import java.util.Scanner; //mport the Scanner class and define a class named "Reggie".
public class Reggie {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in); //Define the main method, create a new instance of the Scanner class, and name it "pipe

        String ssn=SafeInput.getRegExString(pipe, "enter your social security number", "\\d{3}-\\d{2}-\\d{4}");//Prompt the user to enter their social security number and use the SafeInput.getRegExString()
        System.out.println("social security accepted:"+ssn); //Print a confirmation message showing the accepted social security number.
        String menuChoice=SafeInput.getRegExString(pipe, "enter your menu choice", "[KkWwAaSs]");//Prompt the user to enter their menu choice and use the SafeInput.getRegExString() method to read and validate the input using the regular expression pattern [KkWwAaSs]
        System.out.println("Menu choice recieved:"+menuChoice);//Print a confirmation message showing the received menu choice.
        String ucStudentMNo=SafeInput.getRegExString(pipe, "enter you M number", "(M|m)\\d{5}");
        System.out.println("M number accepted:"+ucStudentMNo);//Print a confirmation message showing the accepted UC student M number.


    }
}