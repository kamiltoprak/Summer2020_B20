package day21_Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean result=false;
        while(result){
            System.out.println("hello word");
        }
        System.out.println("=====================");
        do{
            System.out.println("hello word");
        }while(result);
    }
}
