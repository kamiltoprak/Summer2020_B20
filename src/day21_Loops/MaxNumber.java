package day21_Loops;

import java.util.Scanner;

//1. write a program that asks user to enter 5 numbers and retuns the maximum number
public class MaxNumber {
    public static void main(String[] args) {
        int a=Integer.MIN_VALUE;
        System.out.println(a);
        Scanner scan=new Scanner(System.in);
        for(int i=1 ; i<=5; i++){
            System.out.println("enter your Number");
            int num=scan.nextInt();
            if(a<num){
                a=num;
            }
        }
        System.out.println(a);
    }
}
