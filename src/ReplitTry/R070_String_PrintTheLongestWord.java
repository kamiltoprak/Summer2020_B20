package ReplitTry;
/*
Write a program that will print out the longest word.
*/
import java.util.Scanner;

public class R070_String_PrintTheLongestWord {

        public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            String word1 = scan.next();
            String word2 = scan.next();
            if (word1.length()>word2.length()){
                System.out.println(word1);

            }else{
                System.out.println(word2);
            }
            //WIRTE YOUR CODE HERE
        }
    }
