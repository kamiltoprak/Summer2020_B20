package ReplitTry;
/*Inputs:
        String word;

        Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
        In: howdyho
        oo

        In: huehuehuehue
        ueueueue

        In: poopoo what idk what im doing
        ooooaiaioi*/
import java.util.Scanner;
public class R101_Loop_Vowel {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            ;
            for(int  i=0; i<word.length();i++)
            {
                String print=""+word.charAt(i);
                if(print.equalsIgnoreCase("a") ||print.equalsIgnoreCase("o") ||
                        print.equalsIgnoreCase("e") ||print.equalsIgnoreCase("i") ||print.equalsIgnoreCase("u")
                ){
                    System.out.print(print);
                }
            }


        }
    }

