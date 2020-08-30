package day23_Arrays;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] number=new int[10];

        for (int i = 0; i <number.length ; i++) {
            System.out.println("enter your number "+(i+1));
            number[i]=scan.nextInt();
        }
        int min=number[0];
        int max=number[0];
        for (int i = 0; i <number.length ; i++) {
            if(number[i]<min){
                min=number[i];
            }
            if(number[i]>min){
                max=number[i];
            }
        }

        System.out.println("your max number is "+max+" your Min number is "+min);
    }
}
