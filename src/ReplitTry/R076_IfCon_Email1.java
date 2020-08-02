package ReplitTry;
/*In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

        Example:
        input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
        input: barakobama@gmail.com
output: barakobama@gmail.com*/
import java.util.Scanner;
public class R076_IfCon_Email1 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            if(email.contains("_")){
                int a=email.indexOf("_");
                int b=email.indexOf("@");
                String first=email.substring(a+1,b);
                String last=email.substring(0,a);
                email=first+"_"+last+"@gmail.com";
                System.out.println(email);
            }else{
                System.out.println(email);
            }


        }
    }
