package ReplitTry;
/*
Write a program that will print out last letter of the word (string).
*/
import java.util.Scanner;

public class R064_import_PrintLastCharacter {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String word=scan.nextLine();
            char ch1=word.charAt(word.length()-1);
            System.out.println(ch1);





        }
    }

