package day16_String;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Write a program StartEndWords:
        you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second word are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If*/
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your first word ");
        String word1=scan.next();

        System.out.println("enter your second word");
        String word2=scan.next();

        boolean result=word1.length()==5 && word2.length()==5;
        /*if (result){
            if(word1.charAt(4)==word2.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz - did not match");
            }

        }else{
            System.out.println("need to be exactly 5 chars length");
        }*/

        if(result){
            boolean b1=word1.endsWith(""+word2.charAt(0));//word1  last  letter same as word 2  first  letter
            boolean b2=word2.startsWith(""+word1.charAt(word1.length()-1)); //word 2 fisrt  letter is same as owrd1 last  letter
            if (b1&&b2){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }
        }else{
            System.out.println("need to be exactly 5 chars length");
        }

    }
}
