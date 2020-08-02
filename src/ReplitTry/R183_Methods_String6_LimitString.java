package ReplitTry;
/*This method gets a string and an int, it returns a string.
        what it dose is limit the inputted string to a cretin number of characters.
        for example:
        limit("abcd",2)
        returns "ab"
        limit("bla bla",3)
        returns "bla"
        hint:
        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)*/

public class R183_Methods_String6_LimitString {

        public static String limit(String text, int maxLength)
        {
            text=text.substring(0,maxLength);
            return text;
        }
    }

