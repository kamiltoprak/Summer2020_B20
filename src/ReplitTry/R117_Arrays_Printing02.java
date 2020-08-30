package ReplitTry;
/*The code provided in your main method will take in eight Strings and save them into an array called arr.
        Print out the 4 lines using for loop:
        each line should contain a pair of array element as displayed below
        user for loop

        Example:
        arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
        prints:  apple , banana
        kiwi , grape
        milk, "soda"
        juice, coffee*/
import java.util.Scanner;
public class R117_Arrays_Printing02 {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[8];
            for (int i=0;i<8;i++)
            {
                arr[i] = input.nextLine();

            }

            for(int i=0; i<8; i+=2){
                System.out.print(arr[i]+" , "+arr[i+1]);
                System.out.println();
            }
            //leave above alone! :)
            //assume you have String array of 8 items
            //and print two items at a time in 4 line
            //write your code below


        }
    }
