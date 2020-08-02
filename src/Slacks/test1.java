package Slacks;

import javax.swing.*;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] a={7,2,3,6,4,1,5};

        for (int i = 0; i < a.length; i++) {
            int b=a[i];
            int num=i;
            for (int j = i+1; j <a.length ; j++) {
                if(b>a[j])
                {
                    b=a[j];
                    num=j;
                }
            }
            a[num]=a[i];
            a[i]=b;
        }

        System.out.println(Arrays.toString(a));

    }


}
