package day33_LocalDateTime;

import java.util.Arrays;

/* 1. create a return method that can return an int array in descending order
         2. create a return method that can return a double array in descending order
         3. create a return method that can return a String array in descending order
         4. create a return method that can return a char array in descending order*/
public class SortDecending1 {

    public static int[] intDecending(int[] arr) {
        Arrays.sort(arr);
        int[] new_arr=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            new_arr[i]=arr[arr.length-1-i];
        }
        return new_arr;
    }
    public static String[] stringDecending(String[] arr) {
        Arrays.sort(arr);
        String[] new_arr=new String[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            new_arr[i]=arr[arr.length-1-i];
        }
        return new_arr;
    }
    public static char[] charDesending(char[] arr) {
        Arrays.sort(arr);
        char[] new_arr=new char[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            new_arr[i]=arr[arr.length-1-i];
        }
        return new_arr;
    }
    public static double[] doubleDesending(double[] arr) {
        Arrays.sort(arr);
        double[] new_arr=new double[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            new_arr[i]=arr[arr.length-1-i];
        }
        return new_arr;
    }
}
