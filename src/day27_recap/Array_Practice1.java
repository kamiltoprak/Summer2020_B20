package day27_recap;

import day13_Scanner.ScannerNextLine;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        String[]  names={"Ali","Mehmet","Ayse","Hasan","Salih" };
        //                  0       1       2       3       4
        System.out.println(names[1]);
        //        System.out.println(names[15]);


        System.out.println("========================");
        for(int i=0 ; i<=names.length-1; i++){
            //if (names[i].charAt(i)!='A'){
             if(!names[i].startsWith("A") ){
                continue;
            }
            System.out.println(names[i]);
        }

        System.out.println("======================================");

        int[] numbers=new int[5];
        System.out.println(numbers);

        numbers[3]=24;
        numbers[4]=10;

        System.out.println(Arrays.toString(numbers));

        System.out.println("======================================");

        Scanner scan=new Scanner(System.in);
        System.out.println("how many  names do  you  want to enter");
        String[] students=new String[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i <students.length-1 ; i++) {
            System.out.println("enter  name");
            students[i] =scan.nextLine();
        }

        System.out.println(Arrays.toString(students));




    }
}

