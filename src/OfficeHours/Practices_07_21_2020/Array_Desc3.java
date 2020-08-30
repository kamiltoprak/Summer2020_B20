package OfficeHours.Practices_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many  numbers  you  want to  enter?");
        int size=scan.nextInt();
        int[] arr=new int[size];
        for (int i=0; i <=size-1 ; i++) {
            System.out.println("enter your number");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int k=0;
        int[] arrDesc=new int[size];
        for (int elements:arr) {
            arrDesc[k]=elements;
            k++;
        }
        System.out.println(Arrays.toString(arrDesc));
    }
}
