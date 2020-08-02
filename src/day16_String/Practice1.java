package day16_String;
/* Ask user to enter two words. Print first word without its first character then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana
*/
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String str1=input.next(); // "Apple"
        System.out.println("Enter second word");
        String str2=input.next(); // "Banana"
        
        //ppleanana
        //str1=str1.substring(1).concat(str2.substring(1));
        //str1=str1.substring(1,str1.length());
        //str2=str2.substring(1,str2.length());
        String result=str1.substring(1)+str2.substring(1);
        //System.out.println(str1);
        System.out.println(result);




    }
}
