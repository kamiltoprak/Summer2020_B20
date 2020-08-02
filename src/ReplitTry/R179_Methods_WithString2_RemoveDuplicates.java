package ReplitTry;
/*uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.

        Examples:

        uniqueChars("java") ==> "jav"

        uniqueChars("mama") ==> "ma"

        uniqueChars("spoon") ==> "spon"*/
import java.util.*;
public class R179_Methods_WithString2_RemoveDuplicates {
        public static void main(String[] args) {
            //test your code
            System.out.println( uniqueChars("wooden-spoon") ) ;
        }

        public static String uniqueChars(String str) {
            char[] ch1=str.toCharArray();
            String word="";
            for(char each:ch1){
                if(!word.contains(""+each)){
                    word+=each;
                }


            }
            return word;
            //TODO: write your below

        }
    }
