package day16_String;

import com.sun.media.sound.SoftTuning;

import java.sql.SQLOutput;

public class String_Method2 {
    public static void main(String[] args) {
        String name1="Cybertek";
        System.out.println(name1.isEmpty());

        String name2="";
        System.out.println(name2.isEmpty());

        String str1="Java"; // string poll
        String str2=new String("java"); //heap
        System.out.println(str1+" "+str2);
        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        String str3= new String("Java");
        String str4= new String("Java");

        System.out.println(str3==str4); // false
        System.out.println(str3.equals(str4)); // true

        String str5="Java";
        String str6="Java";

        System.out.println(str5=str6); // true
        System.out.println(str5.equals(str6));// true

        String str7="JAVA";
        String str8="java";

        System.out.println(str7.equals(str8));
        System.out.println(str7.compareToIgnoreCase(str8));


        // contains
        String str = "I like to learn java programing language ";
        System.out.println(str.contains("phyton")); // false
        System.out.println(!str.contains("phyton"));// true
        System.out.println(str.contains("java")); //true
        System.out.println(str.contains("JAVA")); // False


        // startsWith();
        String str10="Kamil";
        System.out.println(str10.startsWith("K"));//true
        System.out.println(str10.startsWith("M")); //False

        System.out.println(str10.startsWith("Ka")); // true
        System.out.println(str10.toLowerCase().contains("ka")); //true
                              //  "kamil"

    }
}
