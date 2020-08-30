package day31_Recap;

import java.sql.SQLOutput;

public class Methods_Practice {

    public static void main(String[] args) {
        max(10,20);
        System.out.println();
        int b= max2(10,20);
        System.out.println(max2(10,20));
        System.out.println(max2(10,20)*30);
    }

    public static void max(int a, int b) {
        int max=a>b? a:b;
        System.out.println(max);
    }

    public static int max2(int a, int b) {
        int max=a>b? a:b;
        return max;
    }


}
