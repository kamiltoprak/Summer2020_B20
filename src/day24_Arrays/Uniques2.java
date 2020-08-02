package day24_Arrays;

import java.util.Scanner;

public class Uniques2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your word");
        String str=scan.next();

        String expectedResult="";
        for (int j = 0; j <str.length() ; j++) {
            char ch1 = str.charAt(j);// a
            int count1 = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch1 == each)
                {
                    count1 += 1;
                }
            }
            if (count1 == 1) {
                expectedResult += ch1;
            }
        }
        System.out.println(expectedResult);
    }
}
