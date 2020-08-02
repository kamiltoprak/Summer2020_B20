package OfficeHours.Practices_07_21_2020;

import java.util.Arrays;

public class Array_Desc2 {
    public static void main(String[] args) {
        int[] arr = {98, 97, 100, 200, 55, 68, 79};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int k=arr.length-1;
        int[] descArr = new int[arr.length];
        for(int elements:arr){
            descArr[k]=elements;
            k--;

        }
        System.out.println(Arrays.toString(descArr));
    }
}
