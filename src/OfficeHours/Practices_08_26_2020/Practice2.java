package OfficeHours.Practices_08_26_2020;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Practice2 {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        printArray(arr1);


        int[] arr2={9,8,7,6,5,4,3};
        printArray(arr2);


        int[] arr3={100,200,300};
        printArray(arr3);

        String[] arr4={"Ziadiin", "Aysen","Murat","Mehmet"};
        printArray(arr4);

        char[] arr5={'Z', 'A','M','M'};
        printArray(arr5);

        double[] arr6={10.1, 12.4,34.3,23.2};
        printArray(arr6);
    }

    public static void printArray(int[] arr){
        for (int each:arr) {
            System.out.print(each+" ");

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(String [] arr){
        for (String each:arr) {
            System.out.print(each+" ");

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(char [] arr){
        for (char each:arr) {
            System.out.print(each+" ");

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(double [] arr){
        for (double each:arr) {
            System.out.print(each+" ");

        }

        System.out.println(Arrays.toString(arr));
    }




}
