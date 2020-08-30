package day29_CustomMethods;

import javax.swing.*;

public class Palindrome {
    public static void main(String[] args) {
        palindrome("salas");
    }

    public static void palindrome(String str) {
        /*int count=0;
        for (int i = 0; i <(str.length()-1)/2 ; i++) {
            if(str.charAt(i)==str.charAt((str.length()-1)-i)){
                count++;
            }
        }
        if(count==(str.length()-1)/2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/

        String reversed="";
        for (int i = str.length()-1 ; i>=0; i--) {
            reversed+=str.charAt(i);

        }
        if(reversed.equalsIgnoreCase(str)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }
}
