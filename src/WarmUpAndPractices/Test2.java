package WarmUpAndPractices;


import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
        String str=scan.next();
        String str1=scan.next();

        System.out.println(anagram(str,str1));

    }

    public static boolean anagram(String str, String str1) {

        str=str.toLowerCase();
        str1=str1.toLowerCase();

        char[] ch1=str.toCharArray();
        char[] ch2=str.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(ch1.length!=ch2.length){
            return false;
        }else {

            for (int i = 0; i < ch1.length; i++) {
                if(ch1[i]!=ch2[i]){
                    return false;
                }
            }
            return true;
        }

    }
}
