package day21_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

//min max printout
public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //int max=Integer.MIN_VALUE;
        //int min=Integer.MAX_VALUE;

        int max=-999999999;
        int min=999999999;
        for(int i=1; i<=5; i++){
            System.out.println("enter number");
            int num=scan.nextInt();
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }

        }
        System.out.println("max number :"+max);
        System.out.println("min Number :"+ min);
    }
}
