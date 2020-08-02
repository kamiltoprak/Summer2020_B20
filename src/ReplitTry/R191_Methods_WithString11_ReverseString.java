package ReplitTry;
/*reverse method reverse a string.
        it gets a string and returns it in reverse.

        for example:

        reverse("foo") ==> "oof"

        reverse("student") ==> "tneduts"*/

import java.util.*;

public class R191_Methods_WithString11_ReverseString {

    public static String reverse(String input) {
        char[] ch1 = input.toCharArray();
        String newInput = "";
        for (int i = ch1.length - 1; i >= 0; i--) {
            newInput = newInput + ch1[i];

        }
        return newInput;
    }

    /*public static String reverse(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i > -1; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }*/
}

