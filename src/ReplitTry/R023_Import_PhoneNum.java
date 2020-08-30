package ReplitTry;
/*Write a program that asks user to input int values: areaCode and localNumber.

        -Using concatenation put together in this format and assign to String phoneNumber  variable:

        -(222)-3334444

        -Write a print statement that displays (use phoneNumber variable ):
        Calling number (222)-33*/
import java.util.Scanner;

public class R023_Import_PhoneNum {

        public static void main(String[] args) {
            //YOUR CODE HERE
            Scanner scans=new Scanner(System.in);
            //System.out.println("please enter area code");
            int areCode=scans.nextInt();
            //System.out.println("please enter local number");
            int localNumber=scans.nextInt();
            System.out.println("Calling number (" + areCode+ ")-" +localNumber );

        }

    }
