package ReplitTry;
/*Write a program that will verify if word contains in the sentence.
        Print out the result as boolean value.*/
import java.util.Scanner;
public class R058_String_VerifyContains {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            String sentence = scan.nextLine();
            //WRITE YOUR CODE HERE
            boolean a=sentence.contains(word);
            System.out.println(a);


        }
    }

