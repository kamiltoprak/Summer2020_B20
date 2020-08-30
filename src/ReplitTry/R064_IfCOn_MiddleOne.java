package ReplitTry;
import java.util.*;
/*You have a word, do the following:

        1. When word has odd number of characters and:
        - 3 or more characters, print middle letter
        oak ==> a
        javav ==> v
        - Single character, print that character 3 times
        # ==> ###
        q ==> qqq

        2. When word has even number of characters and:
        - 4 or more characters, print middle 2
        java ==> av
        apples ==> pl
        #$%^&* ==> %^
        - 2 characters, print those 2 characters twice
@@ ==>@@@@
        $$ ==>$$$$
        hi ==> hihi*/
public class R064_IfCOn_MiddleOne {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            //YOUR CODE HERE
            int number = word.length();
            if ( number >1) {
                if (number%2!=0){
                    System.out.println(word.charAt(word.length()/2));
                }else if(number==2){
                    System.out.println(word+word);
                }else {
                    char ch2=word.charAt(word.length()/2);
                    char ch1=word.charAt((word.length()/2)-1);
                    System.out.println(ch1+""+ch2);
                }

            }else{
                System.out.println(word+word+word);
            }

        }
    }

