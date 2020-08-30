package WarmUpAndPractices;
import java.util.ArrayList;
import java.util.Collections;

/*1-write a program  that can find  the unique  characters from a  string
        Do not  use nested loop

        "ABABCDEE"
        output CD*/


/*	Write a program that can find  the frequency of   each chracter  from a string
            Do not  use nested loop

     "AABBCCDEFGE"
      out put :  A2B2C2D1E2F1G1*/

public class day36_Unique {
    public static void main(String[] args) {
        String str = "ABABCDEE";
        ArrayList<Character> ch1 = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            ch1.add(str.charAt(i));
        }

        ArrayList<Character> uniques = new ArrayList<>(); // {2}
        for (Character elemenet : ch1) {
            if (Collections.frequency(ch1, elemenet) == 1) {
                uniques.add(elemenet);
            }
        }
        System.out.println(uniques);

        ArrayList<String> frequency = new ArrayList<>(); // {2}
        String a="";
        for (Character element : ch1) {
            a="" + element + Collections.frequency(ch1, element);
            if(!frequency.contains(a)){
                frequency.add(a);
            }
            a="";
        }
        System.out.println(frequency);
    }
}

