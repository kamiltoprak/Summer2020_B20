package WarmUpAndPractices;
/*write a program that can find the unique characters from a String
        Ex:
        input: aabccd
        output: bd*/
import java.util.Scanner;

public class day24_Unique_Char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your word");
        String str1=scan.next();
        String a="";
        for (int i = 0; i < str1.length(); ) {
            if(!str1.substring(i+1,str1.length()).contains(""+str1.charAt(i))){
                a+=str1.charAt(i);
                str1=str1.replaceAll(""+str1.charAt(i),"");
            }else{
                str1=str1.replaceAll(""+str1.charAt(i),"");
            }

        }
        System.out.println(a);
    }
}
