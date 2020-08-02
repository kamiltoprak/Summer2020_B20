package day17_StringReview;

import java.sql.SQLOutput;

//equals, equalsIgnoreCase, isEmpty, ends,starts, contains == > boolean
public class String_Methods2 {
    public static void main(String[] args) {
        String s1="Cat"; // string pool
        String s2=new String("Cat"); // heap
        String s3=new String("Cat"); // heap

        //equals
        System.out.println(s1=s2 );// false
        System.out.println(s1.equals(s2) );// true
        System.out.println(s2==s3);// false
        System.out.println(s2.equals(s3));//true
        System.out.println(s2=="Cat");



        String s4="java";
        String s5="Java";

        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        String s6="MuHtaR";
        String s7="muhtar";
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s6.equals(s7));

        //isEmpty: checks is the lenght of string is 0

        String str= "  ";
        System.out.println(str.isEmpty());
        str=str.trim(); //""
        System.out.println(str.isEmpty());

        String str2="Cybertek";//lenght!=0
        System.out.println(str2.isEmpty());

        str2="";
        System.out.println(str2.isEmpty());
        System.out.println(str2.length());


        // contains: include  or not

        String str3="Java,  C#, Pyton, Ruby,C++";
        System.out.println(str3.contains("Java"));
        System.out.println(str3.contains("java"));
        System.out.println(str3.toLowerCase().contains("java"));


        String str4="ABCD";
        System.out.println(str4.contains("D"));

        // startswith and endswith:

        String str5="Cybertek School";
        System.out.println(str5.startsWith("E") || str5.startsWith("C"));// true
        System.out.println(str5.startsWith("CybABC"));//false

        String str6 = "Corona";
        System.out.println(str6.endsWith("day"));
        System.out.println(str6.endsWith("great"));







    }
}
