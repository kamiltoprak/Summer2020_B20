package ReplitTry;
/*
This method gets a string and returns the word count of that string.

        example:

        wordCount("foo bar")
        returns 2

        wordCount("one two three")
        returns 3

        wordCount("bla")
        returns 1

        hint:

        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
*/
import java.util.*;

public class R181_Methods_WithString4_WordCount {
        public static int wordCount(String words) {
            String[] newWords=words.split(" ");
            int a=newWords.length;
            return a;
        }

    }

