package WarmUpAndPractices;

import java.util.Scanner;

public class Day15_StringPractices {

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
      hi ==> hihi

 */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            if (word.length()>=5){
                if (word.length()==5){
                    char ch1=word.charAt(4);
                    char ch2=word.charAt(3);
                    char ch3=word.charAt(2);
                    char ch4=word.charAt(1);
                    char ch5=word.charAt(0);
                    System.out.println(ch1+""+ch2+""+ch3+""+ch4+""+ch5);
                }else{
                    System.out.println("Too long!");
                }

            }else{
                System.out.println("Too short!");

            }
            //WRITE YOUR CODE HERE

        }
    }

