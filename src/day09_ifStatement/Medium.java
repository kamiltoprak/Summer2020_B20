package day09_ifStatement;

import java.util.Scanner;
public class Medium {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        double number1=scans.nextDouble();
        double number2=scans.nextDouble();
        double number3=scans.nextDouble();
        boolean medA = number1 < number2 && number1 > number3 || number1 > number2 && number1 < number3;
        boolean medB = number2 < number1 && number2 > number3 || number2 > number1 && number2 < number3;
        boolean medC = number3 < number2 && number3 > number1 || number3 > number2 && number3 < number1;
        if (medA){
            System.out.println(number1 + " is Medium Number");
        }
        if (medB){
            System.out.println(number2 + " is Medium Number");
        }
        if (medC){
            System.out.println(number3 + " is Medium Number");
        }
    }
}


