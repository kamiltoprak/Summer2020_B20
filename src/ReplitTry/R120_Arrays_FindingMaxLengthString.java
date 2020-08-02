package ReplitTry;
/*Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

        Example:
        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
        prints jaaaaavvaaaaaaaaaa*/
import java.util.Scanner;
public class R120_Arrays_FindingMaxLengthString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
        }

        int max=0;
        //write your code below
        for(int i=0; i<=4;i++){
            if(words[i].length()>max){
                max=i;
            }



        }
        System.out.println(words[max]);

    }
}
