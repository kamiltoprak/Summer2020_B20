package ReplitTry;
/*
extractNum

        description:
        a method that cleans any non number string from a string it gets
        and returns the clean string
        input:
        -s (string)- a string the method gets
        return: string: a string of numbers only

        example use:

        extractNum("aa2aa3") ==> 23

        extractNum("aa2") ==> 2

        extractNum("aa10aa") ==> 10

        extractNum("aa!!%$#.10aa") ==> 10


        hint:
        you can use:
        Character.isDigit(ch)
        or conditions
*/

public class R209_Methods_withString12extractNumberFromString {
    public static String extractNum(String s) {

        String n = "";
        char[] ch1 = s.toCharArray();
        for (int i = 0; i <= ch1.length - 1; i++) {
            if (ch1[i] >= '0' && ch1[i] <= '9') {
                n += ch1[i];
            }
        }

        return n;


    }


    public static String extractNum1(String s) {
        String result = "";
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                result += each;

            }
        }
        return result;
    }
}
