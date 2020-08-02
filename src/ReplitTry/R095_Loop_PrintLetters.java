package ReplitTry;
/*Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
        Example:
        input: A
        input: Z
        output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

        Example:
        input: a
        input: f
        output: abcdef

        Example:
        input: a
        input: d
        output: abcd

        Example:
        input: B
        input: O
        output: BCDEFGHIJKLMNO*/
import java.util.Scanner;
public class R095_Loop_PrintLetters {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            char start = scan.next().charAt(0);
            char end = scan.next().charAt(0);
            String newWord="";
            char ch1;
            for(char i=start ; i<=end; i++){

                newWord+=i;

            }
            System.out.println(newWord);

        }
}
