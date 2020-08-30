package day15_String;

import java.util.Scanner;

public class FullName_Uppercase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName=input.nextLine();//.toUpperCase();

        System.out.println("Please enter your last name:");
        String lastName=input.nextLine();//.toUpperCase();

        String fullName=firstName+" "+lastName;
        fullName=fullName.toUpperCase();

        System.out.println(fullName);
        //System.out.println(firstName.toUpperCase()+" "+lastName.toUpperCase());



    }
}
