package day12_Switch_Scanner;
import java.util.*;
public class Bigger_Numbers {
    public static void main(String[] args) {
        /*
        1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT
         */
        Scanner scans=new Scanner(System.in);
        int[] n=new int[3];
        for (int i=0; i<3; i++){
            System.out.println("please type your number");
            n[i]=scans.nextInt();
        }
        boolean n0isBigger=n[0]>n[1] && n[0]>n[2];
        boolean n1isBigger=n[1]>n[2] && n[1]>n[0];
        boolean n2isBigger=!n0isBigger&&!n1isBigger;

        String result= "";
        if(n0isBigger){
            result="fisrt is bigger";
        }else if (n1isBigger){
            result="second is bigger";
        }else{
            result="third is bigger";
        }
        System.out.println(result);
        System.out.println("==========================");
        String result1=(n0isBigger)? "fisrt is bigger": (n1isBigger)?"second is bigger":"third is bigger";
        System.out.println(result1);

    }
}
