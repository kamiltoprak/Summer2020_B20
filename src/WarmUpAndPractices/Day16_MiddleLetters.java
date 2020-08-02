package WarmUpAndPractices;

import java.util.Scanner;

public class Day16_MiddleLetters {

    /*Write a Java method to display the middle character of a string
            a) If the length of the string is even there will be two middle characters.
            b) If the length of the string is odd there will be one middle character.
            Input :
            elephant
            Output:
            The middle character in the string: ph

     */

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            String word=scan.nextLine();
            if (word.length()%2==0){
                System.out.println(word.charAt((word.length()/2)-1)+""+word.charAt(word.length()/2));

            }else{
                System.out.println(word.charAt((word.length()-1)/2));

            }
            System.out.println();
        }
    }

