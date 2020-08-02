package day21_Loops;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int b=Integer.MAX_VALUE;
        System.out.println(b);
        for(int i=1 ; i<=5; i++){
            System.out.println("enter your Number");
            int num=scan.nextInt();
            if(b>num){
                b=num;
            }
        }
        System.out.println(b);
    }
}
