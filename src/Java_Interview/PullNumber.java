package Java_Interview;
//  word: dsdsds4fdf4jk53 => 4453
import java.util.Scanner;

public class PullNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your  words");
        String str = scan.next();
        char[] str1 = str.toCharArray();
        String result = "";
        for (char each : str1) {
            if (each <= '9' && each >= '0') {
                result += each;
            }
        }
        System.out.println(result);
    }
}

