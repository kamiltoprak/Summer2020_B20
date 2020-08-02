package day24_Arrays;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
        System.out.println("how many times do you  want to  enter ");
        int n=scan.nextInt();

        int[] arr=new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.println("enter your  number ");
            arr[i]=scan.nextInt();

        }
        int max=arr[0];
        int min=arr[0];
        int maxindex=0;
        int minindex=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                maxindex=i;
                max=arr[i];
            }
            if(arr[i]<min){
                minindex=i;
                min=arr[i];
            }

        }
        System.out.println(" index of number is " + maxindex + "and number is " +max);
        System.out.println(" index of number is " +minindex + min + "and number is " +min);
    }
}
