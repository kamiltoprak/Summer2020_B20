package java_Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Hacker_NewYearChaos {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        int b=0;
        for (int i = 0; i < count; i++) {
            int arraySize1 = scan.nextInt();
            int[] array1 = new int[arraySize1];
            for (int j = 0; j < arraySize1; j++) {
                array1[j] = scan.nextInt();
            }
            for (int j = 1; j <=arraySize1 ; j++) {
                if(array1[j]-j>2){
                    b++;
                }
            }
            if(b>2){
                break;
            }

        }
        System.out.println(b);
    }
}

