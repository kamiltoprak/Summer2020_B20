package ReplitTry;
/*    Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

    isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

    each letter in word1 should appear in word2 exact number of times
    ignore empty spaces
    make your code case insensitive

    Examples:

    isAnagram("listen", "Silent") ==> true

    isAnagram("earth", "heart") ==> true

    isAnagram("star", "rats") ==> true

    isAnagram("hi", "bye") ==> false

    isAnagram("java", "cava") ==> false*/

import java.util.*;

public class R204_Methods_withString15Anagram {

        public static boolean isAnagram(String word1, String word2) {
            word1=word1.toLowerCase();
            word2=word2.toLowerCase();


            char[] ch1=word1.toCharArray();
            char[] ch2=word2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1,ch2);


        }

        public static boolean isAnagram1(String word1, String word2) {
            word1 =word1.replaceAll(" ", "").toLowerCase();
            word2 =word2.replaceAll(" ", "").toLowerCase();
            for(int i=0;i<=word1.length()-1;i++){
                if(word2.contains(""+word1.charAt(i))){
                    word2 = word2.replaceFirst(""+ word1.charAt(i),"");
                }
            }
            if(word2.equals("")){
                return true;
            }else {
                return false;
            }

        }



    }


