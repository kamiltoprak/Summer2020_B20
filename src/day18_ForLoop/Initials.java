package day18_ForLoop;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.Scanner;

/* write a program that asks user's first and last name, then prints out the initials of the user

         input:
         cybertek
         batch18
         output:
         your initial is: CB
         DO NOT use charAt method*/
public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String firstName=scan.next();
        String lastName=scan.next();
        /*String firstName="Cybertek";
        String lastName="School";*/
        /*firstName.substring(0,1);
        lastName.substring(0,1);*/
        String initial=firstName.substring(0,1)+"."+lastName.substring(0,1); //"jp"
        initial=initial.toUpperCase();//"JP"
        System.out.println(initial);

        char ch1=firstName.charAt(0);
        char ch2=lastName.charAt(0);
        String initial1=""+ch1+ch2;
        //initial1=initial1.toUpperCase();
        System.out.println(initial1.toUpperCase());



    }
}
