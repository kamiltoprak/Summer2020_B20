package java_Interview;
//Write a return method that can reverse String. Ex: String=“ABCD”----> output: DCBA.
import java.util.*;
public class ReverseWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your word");
        String str = scan.next();
        String result2 = "";
        int index = str.length() - 1;
        while (index >= 0) {
            result2 += str.charAt(index);
            index -= 1;
        }
        System.out.println(result2);
    }
}
