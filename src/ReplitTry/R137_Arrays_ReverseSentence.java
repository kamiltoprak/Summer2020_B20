package ReplitTry;
/*Given a String variable sentence, write code to type each word in separate lines in a reverse order.
        Example:
        sentence -> "Java is fun"
        Print
        fun
        is
        Java*/
import java.util.*;
public class R137_Arrays_ReverseSentence {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();


            //type your code below
            String[] newWord=sentence.split(" ");

            for (int i=newWord.length-1; i>=0; i--){
                System.out.println(newWord[i]);
            }
            //TODO: Type your code below
        }
    }

