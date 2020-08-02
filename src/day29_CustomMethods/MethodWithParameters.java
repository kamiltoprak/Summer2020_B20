package day29_CustomMethods;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class MethodWithParameters {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //int birthYear=scan.nextInt();
        //int currentYear=scan.nextInt();
        printHello(30);
        //age(birthYear, currentYear);
        age(scan.nextInt(),scan.nextInt());
    }
    public static void printHello(int numberOftimes) {

        for (int i = 0; i <numberOftimes ; i++) {
            System.out.println("Hello World");

        }

    }


    public static void age(int birthYear,int currentYear) {
        int age=currentYear-birthYear;
        System.out.println("you  are "+age+" years old");

    }
}
