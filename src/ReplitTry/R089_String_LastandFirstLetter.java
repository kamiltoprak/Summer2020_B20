package ReplitTry;
/*Write a program that will print out first and last letters together.

        adobe
        ae*/
import java.util.Scanner;
public class R089_String_LastandFirstLetter {

        public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE
            System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));

        }
    }


