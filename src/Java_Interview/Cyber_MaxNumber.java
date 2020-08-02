package Java_Interview;

import java.util.Arrays;

public class Cyber_MaxNumber {

    public static void main(String[] args) {

        double[] arr={10043,2232,23,2434,343,534,};

        System.out.println(maxNumber(arr));

    }

    public static int maxNumber(int[] arr) {
        int a=Integer.MIN_VALUE;
        for (int each:arr) {
            if(a<each) {
                a = each;
            }
        }
        return a;
    }
    public static double maxNumber(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}

