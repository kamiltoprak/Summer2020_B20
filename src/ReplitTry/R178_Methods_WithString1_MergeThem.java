package ReplitTry;

import javax.imageio.stream.ImageInputStream;
import java.util.*;
/*When gears merge and work together, one teeth from each one goes in order.
        Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

        s1 ==> "12345"
        s2 ==> "abcde"
        mergeStrings(s1,s2) ==> "1a2b3c4d5e"

        mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

        mergeStrings("java", "selenium") ==> "jsaevlaenium"*/

public class R178_Methods_WithString1_MergeThem {
    public static void main(String[] args) {
        System.out.println(mergeStrings("kamil", "Elif"));
    }



        public static String mergeStrings (String one, String two){
            String newWord = "";
            char[] ch1 = one.toCharArray();
            char[] ch2 = two.toCharArray();

            if (ch1.length <= ch2.length) {
                for (int i = 0; i <= ch1.length - 1; i++) {
                    newWord +=""+ch1[i] + ch2[i];
                }
                for (int i = ch1.length; i <= ch2.length - 1; i++) {
                    newWord += ""+ch2[i];
                }
            } else {
                for (int i = 0; i <= ch2.length - 1; i++) {
                    newWord +=""+ ch1[i] + ch2[i];
                }
                for (int i = ch2.length; i <= ch1.length - 1; i++) {
                    newWord +=""+ ch1[i];
                }

            }

            return newWord;
        }
    }


