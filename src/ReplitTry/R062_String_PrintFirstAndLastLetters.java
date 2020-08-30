package ReplitTry;
/*Write a program that will print out first and last letters together.

        adobe
        ae*/
import java.util.Scanner;
public class R062_String_PrintFirstAndLastLetters {
        public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            System.out.println(""+word.charAt(0)+word.charAt(word.length()-1));

            //WRITE YOUR CODE HERE

        }
    }

