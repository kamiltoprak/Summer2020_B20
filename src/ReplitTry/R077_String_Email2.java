package ReplitTry;
/*Write a program that will print out information about user based on email. Print first and last name from the upper case.

        Example:
        Input: craig_federighi@apple.com
Output:
        First name: Craig
        Last name: Federighi
        Domain: apple
        Top-Level Domain: com*/
import java.util.Scanner;
public class R077_String_Email2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();
            String firstName=email.substring(0,email.indexOf('_'));
            firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1,firstName.length());
            System.out.println("First name: "+firstName);
            String lastName=email.substring(email.indexOf('_')+1,email.indexOf('@'));
            lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1,lastName.length());
            System.out.println("Last name: "+lastName);
            String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));
            System.out.println("Domain: "+domain);
            String extension=email.substring(email.indexOf('.')+1,email.length());
            System.out.println("Top-Level Domain: "+extension);

        }
    }

