package day09_ifStatement;
import java.util.Scanner;
public class Minimum {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        double number1=scans.nextDouble();
        double number2=scans.nextDouble();
        double number3=scans.nextDouble();
        boolean minA = number1<number2 && number1<number3;
        boolean minB = number2<number1 && number2<number3;
        boolean minC = number3<number2 && number3<number1;
        if (minA){
            System.out.println(number1 + " is Min Number");
        }
        if (minB){
            System.out.println(number2 + " is Min Number");
        }
        if (minC){
            System.out.println(number3 + " is Min Number");
        }
    }
}


