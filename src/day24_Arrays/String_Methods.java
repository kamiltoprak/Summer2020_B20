package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String str="ABCDEhkloklkij''";
        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));

        System.out.println("================================");

        String str1="DCEBAF";
        String str2="ACBDEG";
        char[] ch1=str1.toCharArray();//['D','C','E','B','A']
        char[] ch2=str2.toCharArray();//['A','B,'C','D','E']
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean b1=Arrays.equals(ch1,ch2);
        System.out.println(b1);

        System.out.println("===========================");
        String sentence="I Love Programming Language ";
        String[] words=sentence.split(" ");
        // I Love Programing Language
        System.out.println(Arrays.toString(words));

    }
}
