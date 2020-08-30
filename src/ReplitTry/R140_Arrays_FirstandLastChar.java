package ReplitTry;
/*Given a String array words, iterate through each word and print first and last letter of each element in the format below.

        Example:

        words → ["hello", "why", "by", "apple" , "note"]
        print → [ho, wy, by, ae, ne]*/
import java.util.*;
public class R140_Arrays_FirstandLastChar {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
            String[] wordsNew=new String[words.length];
            for(int i=0; i<=words.length-1; i++){
                wordsNew[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);

            }
            //TODO: Write your code below
            System.out.println(Arrays.toString(wordsNew));


        }
    }

