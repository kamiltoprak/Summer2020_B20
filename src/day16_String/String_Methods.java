package day16_String;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String email="cybertek@gmail.com";
        email=email.replace("gmail","yahoo");//cybertek@yahoo.com
        System.out.println(email);

        String word="java";
        word=word.replace("a","e"); //jeve
        System.out.println(word);

        String sentence="I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace("Java ", "Python ");
        System.out.println(sentence);

        String s1="I like to  stay in Cybertek,  Cybertek is nice place";//MIT
        s1=s1.replace("Cybertek", "MIT");
        System.out.println(s1);


        String s2=" I like to leaRn Java,  we aRe enjoting Java";// replace R to r
        s2=s2.replace("R","r");
        System.out.println(s2);


        String s3="I like to  drink tea and tea";
        s3=s3.replaceFirst("tea","coke");
        System.out.println(s3);

        String s4="I like to Watch Game of Thrones, and Walking dead";
        s4=s4.replace(", and Walking dead","");
        System.out.println(s4);

        //indexOf()
        String s5="I like to stay in cybertek, we  are learning Java";
        int r1= s5.indexOf("r");
        int r2=s5.indexOf("re");// it retuned r index number, all the time first letter index number will be showed up
        int r13=s5.indexOf("ar");// it returned a  index number
        int r3 = s5.indexOf("rn");// it take r  index  number
        int r14=s5.indexOf("rning Java");// still  get r index number
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


        // LAstIndexOf()
        String s6="Java is a programing language,  and Java is fun";
        int I1=s6.indexOf("J");
        int I2=s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);

        String s7="Java";
        int a1=s7.indexOf("A");
        System.out.println(a1);


        String s8="Java";
        int a=s8.indexOf("a");// you  can assign  index number double but if you  assign this
        // value some where for index it gives error

        char ch= s8.charAt(a);
    }
}
