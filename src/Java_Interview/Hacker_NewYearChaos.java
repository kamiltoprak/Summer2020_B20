package java_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Hacker_NewYearChaos {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
            int arraySize1=scan.nextInt();
            int[] array1=new int[arraySize1];
            for (int j = 0; j < arraySize1; j++) {
                array1[j]=scan.nextInt();
            }
        //System.out.println(Arrays.toString(array1));
            int arraySize2=scan.nextInt();
            int[] array2=new int[arraySize2];
            for (int j = 0; j < arraySize2; j++) {
                array2[j]=scan.nextInt();
            }
        //System.out.println(Arrays.toString(array2));
        int t=0;
        for (int i = 0; i <arraySize2 ; i++) {
            if (array2[i]>array1[i]){
                t+=(array2[i]-array1[i]);
            }

        }
        System.out.println(count);



    }
}
