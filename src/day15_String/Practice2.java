package day15_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=scan.next(); // Cybertek
        System.out.println("Enter your last name");
        String lastName=scan.next(); // School

        //
        // String fullName=firstName.concat(" ".concat(lastName)); // "CyberSchool"

        String fullName= firstName+" "+lastName;

        //System.out.println("your  full name is: ".concat(fullName));
        System.out.println("your  full name is: "+fullName);
        System.out.println("===========================================");
        // toLowerCase
        String name1 = "CYBERTEK SCHOOL";
        name1=name1.toLowerCase(); //" cybertek school"

        System.out.println(name1);

        // toUpperCase
        String name2="muhtar";
        name2=name2.toUpperCase(); // "MUHTAR"
        System.out.println(name2);

        System.out.println("==============================");
        //Trim()
        String p="     Cybertek             School    " ;
        p=p.trim(); // ()"Cybertek School";
        System.out.println(p);



    }
}
