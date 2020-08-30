package day24_Arrays;

import java.util.Scanner;

public class Uniques {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your word");
        String str=scan.next();
        String a="" ;
        for (int i = 0; i <str.length() ; i++) {
            /*if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                a+=str.charAt(i);
            }*/
            char ch=str.charAt(i);
            int first=str.indexOf(ch);
            int last=str.lastIndexOf(ch);
            if(first==last){
                a+=ch;
            }

        }
        System.out.println(a);
    }
}
