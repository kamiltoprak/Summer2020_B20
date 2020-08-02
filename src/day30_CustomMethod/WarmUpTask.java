package day30_CustomMethod;

import java.util.Arrays;
import java.util.Scanner;

/* 1. create a function that can print out the maximum number between two numbers
         2. create a function that can print out the array of integers in descending order
         3. create a function that can print out the combination of two integer arrays
         4.
         step1: create a function that can check if the given integer is positive, negative or zero
         step2: Use the above method to  write a program that can check every single elements of an array of Integers
         MUST use for each loop*/
public class WarmUpTask {
    //task1
    public static void main(String[] args) {
        maxNumber(10,12);
        /*Scanner scan=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=scan.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("enter number "+(i+1));
            arr[i]=scan.nextInt();
        }*/
        int[] arr={1,4,5,6,8,23,45};

        printDes(arr);
        int[] arr1={1,14,51,61,18,23,45};
        int[] arr2={1,114,151,621,138,233,45};
        combine2Array(arr1,arr2);
        PosNegZero(0);
        System.out.println("========================================");
        int[] a3={100,-100, -200,-300,0,3,4,55000,44004};
        for(int each:a3){
            PosNegZero(each);
        }
    }

    public static void maxNumber(int a,int b) {
        if (a==b){
            System.out.println(" equal");
            return;
        }


        if(a>=b){
            System.out.println(a + " is maximum number");
        }else{
            System.out.println(b+ " is  maximum number");
        }

    }// task 1
    public static void printDes(int[] arr){// {10, 9 , 20,  30, 5, 6,7,};
        Arrays.sort(arr);//{5,6,7,9,10,20,30};
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }//task 2
    public static void combine2Array(int[] arr1,int[] arr2) {
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1) {
            arr3[i]=each;
            i++;
        }
        for (int each:arr2) {
            arr3[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));


    } // task 3
    public static void PosNegZero(int num) {
        if(num>0){
            System.out.println(num+" is positive number");
        }else if(num<0){
            System.out.println(num+" is negative number");
        }else{
            System.out.println(num+" is zero");
        }

    } //4

    public static void addition(int a, int b ) {
        int sum=a+b;
        System.out.println(sum);

    }


}
