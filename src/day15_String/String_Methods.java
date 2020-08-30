package day15_String;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        String name="Cybertek";
        //           01234567
        //charAt(index):
        char ch1=name.charAt(0);//'C'
        char ch2=name.charAt(5);//'t'


        System.out.println(ch2);
        System.out.println(ch1);

        // comcat (str):
        String schoolName ="Cybertek";
        schoolName=schoolName.concat(" School"); // " Cybertek School"

        System.out.println(schoolName);


        String r1="Cybertek"+123 +"A"+ true; //123
        System.out.println(r1);


        String r2="Cybertek".concat("123");



    }
}
