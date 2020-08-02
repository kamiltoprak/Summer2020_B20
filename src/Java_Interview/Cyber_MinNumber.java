package Java_Interview;

import java.util.Arrays;

public class Cyber_MinNumber {
    public static void main(String[] args) {
        int[] arr={10043,2232,23,2434,343,534,};

        System.out.println(minNumber(arr));
    }

    public static int minNumber(int[] arr) {
        int a=arr[0];
        for(int each:arr){
            if(a>each){
                a=each;
            }
        }
        return a;

    }
    public static int maxValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }
    public static int maxValue1( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }
}
