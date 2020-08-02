package day15_String;

import java.util.Scanner;

public class Practice1 {
    //..

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your first name: ");
        String firstName=input.nextLine();// Cybertek
        char firstInitial=firstName.charAt(0);
        System.out.println("enter your last name: ");
        String lastName=input.nextLine();//School
        char lastInitial=lastName.charAt(0);//

        System.out.println("your initial is: " +firstInitial+"."+lastInitial);
        System.out.println("==========================================");
        //lenght() ==>  int

        String name="Cybertek School";
        int l=name.length();
        System.out.println(l);
        System.out.println("=======================================");

        int lasIndexNumber=name.length()-1;
        System.out.println(lasIndexNumber);
        System.out.println("=======================================");


        int l2=name.length();



    }

    // write prog  that ask you  to  the enter first name  and then last name .
    //print the initials of the person
}
