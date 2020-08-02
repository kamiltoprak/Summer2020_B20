package day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first Word");
        String first=scan.next();

        System.out.println("Enter second Word");
        String second=scan.next();

        String result= (first.equalsIgnoreCase(second))? "Equal" : "Not Equal"; //True
        String result1= (first==second)? "Equal" : "Not Equal";//false
        System.out.println(result); //
        System.out.println(result1);
    }
}
