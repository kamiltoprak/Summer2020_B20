package WarmUpAndPractices;

import java.util.Arrays;

/*write a program that can sort the array in descending order
        ex:
        arr1: { 10, 11, 8, 9, 12, 5, 15};
        output:
        arr2: {15, 12, 11, 10, 9, 8, 5}
        NOTE: at the end, you must have have an array that contains
        the desending order of the original array*/
public class day25_Descending {
    public static void main(String[] args) {
        int[] arr1={ 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr1);
        int[] arr2=new int[arr1.length];
        int count=0;
        for (int i = arr1.length-1 ; i >=0 ; i--) {
            arr2[i]=arr1[count];
            count++;
        }
        System.out.println(Arrays.toString(arr2));

    }
}
