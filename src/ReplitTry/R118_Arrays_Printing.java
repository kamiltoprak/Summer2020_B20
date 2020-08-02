package ReplitTry;
/*The code provided in your main method will take in six Strings and save them into an array called arr.
        Print out the 3 neighboring items of the array in one line until the last line
        each line should contain 3 neighboring items of array element as displayed below
        user for loop

        Example:
        arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
        prints:  apple , banana , kiwi
        banana , kiwi , grape
        kiwi , grape , milk
        grape , milk , soda*/
import java.util.Scanner;
public class R118_Arrays_Printing {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[6];
            for (int i=0;i<6;i++)
            {
                arr[i] = input.nextLine();
            }
            //leave above alone! :)
            //assume you have String array of 6 items
            //and print three neibouring items at a time till last item
            //write your code below
            int count=0;

            for (int i=0; i<arr.length-2; i++){
                String newWord="";
                for(int j=count; j<count+3; j++){
                    newWord+=arr[j]+" , ";
                }
                System.out.print(newWord.substring(0,newWord.length()-3));
                count++;
                System.out.println();
            }

        }
    }

