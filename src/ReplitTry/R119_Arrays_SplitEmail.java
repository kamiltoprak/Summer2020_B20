package ReplitTry;
/*Given a String variable email, write code using split method to print email id and domain in separate lines.

        Example:
        email -> info@cybertekschool.com
Print:
        Email id: info
        Email domain: cybertekschool.com


        If email contains no @ character or multiple @ characters then print invalid email:

        email -> hello-gmail.com
        print:
        invalid email

        email -> my@fancy@email.com
print:
        invalid email*/
import java.util.*;
public class R119_Arrays_SplitEmail {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String email = input.nextLine();
            if (email.contains("@") && email.indexOf("@")==email.lastIndexOf("@")){
                String[] email2=email.split("@");
                //Write your code below
                System.out.println("Email id: "+email2[0]);
                System.out.println("Email domain: "+email2[1]);

            }else{
                System.out.println("invalid email");
            }




        }
}
