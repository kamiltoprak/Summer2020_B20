package day18_ForLoop;

import java.util.Scanner;

/*write a program that will return the domain of an email address:
        Ex:
        input: test@gmail.com
                output: the domain of the email is: gmail
                        inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo*/
public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String email=scan.next();

        //String email="test@yahoo.com";
        int index1=email.indexOf("@");
        int index2=email.lastIndexOf(".");
        String domain=email.substring(index1+1,index2);
        System.out.println(domain);


    }
}
