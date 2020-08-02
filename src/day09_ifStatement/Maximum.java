package day09_ifStatement;

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        double number1=scans.nextDouble();
        double number2=scans.nextDouble();
        double number3=scans.nextDouble();
        boolean maxA = number1>number2 && number1>number3;
        boolean maxB = number2>number1 && number2>number3;
        boolean maxC = number3>number2 && number3>number1;
        if (maxA){
            System.out.println(number1 + " is Max Number");
        }
        if (maxB){
            System.out.println(number2 + " is Max Number");
        }
        if (maxC){
            System.out.println(number3 + " is Max Number");
        }
    }
}


