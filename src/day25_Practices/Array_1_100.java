package day25_Practices;

import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {
        int [] numbers=new int[100];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=i+1;
        }
        System.out.print(Arrays.toString(numbers));
    }
}
