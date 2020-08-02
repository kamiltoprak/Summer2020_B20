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
public class R106_Loop_PrintVowels {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String word = inp.nextLine();
            //write your code below
            String newWord="";
            for(int i=0 ; i< word.length(); i++){

                char ch=word.charAt(i);
                if(ch=='o' ||ch=='a' || ch=='i' || ch=='u' || ch=='e'){
                    newWord+=ch;
                }

            }

            System.out.println(newWord);


        }
    }

