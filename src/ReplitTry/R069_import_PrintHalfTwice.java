package ReplitTry;
import java.util.Scanner;
/*Write a program that will print out first half of the word twice.

        Example:

        input: java
        output: jaja*/
public class R069_import_PrintHalfTwice {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String word = scan.next();
            word=word.substring(0,(word.length()/2));
            System.out.println(word+word);

            //WRITE YOUR CODE HERE
        }
    }

