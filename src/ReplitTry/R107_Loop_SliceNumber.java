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
import kotlin.reflect.KAnnotatedElement;

import java.util.*;
public class R107_Loop_SliceNumber {



        public static void main(String[] args) {
            //DO NOT CHANGE
            int num, digit1, digit2, digit3, digit4, digit5;
            //WRITE YOUR CODE HERE


            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your number:");
            num=scan.nextInt();
            int k=1;
            String st=""+num;
            for (int i = 0; i <st.length()-1; i++) {
                k*=10;
            }
            System.out.println(k);

            int i=10000;

            while (num>0){
                int b=0;
                b=num/i;
                num=num%i;
                System.out.println(b);
                i=i/10;

            }

        }
}
