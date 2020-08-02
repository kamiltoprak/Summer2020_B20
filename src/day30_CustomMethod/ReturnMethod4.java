package day30_CustomMethod;

import java.util.Arrays;

public class ReturnMethod4 {

    public static void main(String[] args) {
        int[] a1={1,2,3,4,53434};
        int[] a2={34,32,43,53,43};
        //System.out.println(Arrays.toString(combine2Array(a1,a2)));
        int[] a3=combine2Array(a1,a2);
        System.out.println(Arrays.toString(a3));

    }

    public static int[] combine2Array(int[] arr1,int[] arr2) {
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
        return arr3;


    }
}
