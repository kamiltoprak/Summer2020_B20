package OfficeHours.Practices_08_26_2020;

public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println(reverseStr("kamil"));
        System.out.println(isPalindrome("ava"));
        System.out.println(isPalindrome("fatih"));


    }


    public static String reverseStr(String str) {
        String reversedStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr+=str.charAt(i);
        }

        //System.out.println(str.equalsIgnoreCase(reversedStr));
        return reversedStr;
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseStr(str));
    }


}
