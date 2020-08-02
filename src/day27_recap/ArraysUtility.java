package day27_recap;

import java.sql.SQLOutput;
import java.util.Arrays;

//sort
//toString
//equals
//deepto  string method

public class ArraysUtility {
    public static void main(String[] args) {
        String[] names={"Odina","Liliia","Berk","Emine"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("================================");

        int[] score={80,434,34,54,5454,645,54,54,54};
        System.out.println(Arrays.toString(score));
        System.out.println("Max: " + score[score.length-1]);
        System.out.println("Min: "+score[0]);
        System.out.println("================================");

        String[] s1={"A","B","C"};
        String[] s2={"A","B","C"};
        System.out.println(Arrays.equals(s1,s2));

        String[] s3={"C","A","B"};
        System.out.println(Arrays.equals(s1,s3));

        System.out.println("================================");
        String[] a1={"A","C","B"};
        String[] a2={"B","C","A"};

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1,a2));

    }
}
