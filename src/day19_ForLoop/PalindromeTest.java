package day19_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("enter your  word");
            String word = scan.next();
            //int letter=word.length()-1;
            //System.out.println(letter);
            String word2 = "";
            for (int num = word.length() - 1; num >= 0; num--) {
                word2 += word.charAt(num);
            }
            System.out.println(word2);
            System.out.println(word.equalsIgnoreCase(word2));
           /* if (word.equals(word2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }*/
    }
}
