package ReplitTry;
import java.util.Scanner;
/*The code provided in your main method will take in five Strings and save them into an array called arr.  Print out the first three letters of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.

        Example:
        arr -> ["apple", "banana"]
        prints: app
        ban
        Hint: How do you get the first 3 letters of any String starting from index 0 till right before index 3?*/
public class R109_Arrays_Printing01 {


        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[5];
            for (int i=0;i<5;i++)
            {
                arr[i] = input.nextLine();
            }
            //leave above alone! :)
            //assume you have String array of 5 items

            //write your code below:
            for(int j=0; j<arr.length;j++){
                System.out.println(arr[j].substring(0,3));
            }


        }
    }
