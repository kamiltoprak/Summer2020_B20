package ReplitTry;
/*You have 2 words, both of them have 3 characters.
        If either of them does not have exactly 3 characters, print "cannot merge"
        Merge their characters one by one and print together like below:

        aok
        lol
        alookl

        ear
        pie
        epaire

        java
        wow
        cannot merge

        hint:
        by inserting +""+ (empty string) between chars, you can concatenate char values.*/
import java.util.*;
public class R066_String_MergeThem {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word1 = scan.next();
            String word2 = scan.next();

            int a=word1.length();
            int b=word2.length();

            if (a==3 && b==3){

                System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2));

            }else{

                System.out.println("cannot merge");
            }

            //YOUR CODE HERE



        }
    }


