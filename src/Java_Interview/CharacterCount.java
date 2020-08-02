package Java_Interview;
/*Write a return method that can
        find the frequency of characters in a string .
        Ex: String= “AAABBCDD”---->output:A3B2C1D2.*/
import java.util.*;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please  enter your word");
        String str=scan.next();
        for (int i = 0; i <str.length(); ) {
            int count=0;
            String a=str.substring(i,i+1);
            for (int j = 0; j < str.length(); j++) {
                if(str.substring(j,j+1).equals(a)){
                    count++;
                }
            }
            str=str.replaceAll(a,"");
            System.out.print(a+count);
        }
    }
}
