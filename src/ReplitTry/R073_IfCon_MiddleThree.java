package ReplitTry;
/*You have a word, do the following:

        If the word has odd number of characters
        and has 5 or more characters, print the middle three
        characters of the word.

        Otherwise print "invalid".

        fifteen ==> fte
        apple ==> ppl
        hey ==> invalid
        java ==> invalid
        whatsup ==> ats
        $ ==> invalid*/

import java.util.*;
public class R073_IfCon_MiddleThree {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String word = scan.next();
            //YOUR CODE HERE
            if(word.length()%2==0 || word.length()<5 ){
                System.out.println("invalid");
            }else{
                System.out.println(word.substring((word.length()/2)-1,(word.length()/2)+2));

            }


        }
    }

