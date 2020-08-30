package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock3 {
    static  int a;
    static  int b;
    static  int c;
    static ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
    static int[] arr={1,2,34,56};
    static{
        a=100;
        b=200;
        c=300;
        a=200;
        b=400;
        c=600;



    }

  /*  public static void main(String[] args) {
        a=100;
        b=200;
        c=300;


    }*/

}
