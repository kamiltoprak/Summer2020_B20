package Java_Interview;
/*Write a return method that check if a string is build out of the same letters as another string.

        Ex:  same("abc",  "cab"); -> true

        same("abc",  "abb"); -> false:*/

import java.util.*;
public class Cyber_SameLetter {

    public static void main(String[] args) {
        System.out.println(test("alj","lia"));
    }

   public static boolean test1(String arr,String arr2) {
        int count=0;
        for (int i = 0; i <arr.length() ; i++) {
            if(arr.contains(""+arr2.charAt(i))){
                arr2.replace(""+arr2.charAt(i),"");
                count++;
            }
        }

        boolean a=count==arr2.length();
        return a;
    }
    public static boolean test(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;



        for(char each: ch2)

            a2 +=each;



        return  a1.equals(a2) ;

    }
}
