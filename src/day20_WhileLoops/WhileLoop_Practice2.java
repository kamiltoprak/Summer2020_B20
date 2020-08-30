package day20_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for(int i = 1; i <= 10; i++ ){
            System.out.print(i +" ");
        }

        System.out.println();

        int num = 1;
        while(num <= 10){

            System.out.print("cybertek");

            num++;
        }
        System.out.println(num);//15
        System.out.println("=================================");


        System.out.println("enter your word");
        String str=scan.nextLine();
        String word="";
        int i=str.length()-1;
        while(i>=0){
            word+=str.charAt(i);
            i--;
        }
        System.out.println(word);
    }
}
