package ReplitTry;

/*extractNum
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
        or conditions*/
public class R189_Methods_withString12extractnumberFromString {
    public static void main(String[] args) {

    }

    public static String extractNum1(String s) {
        char[] s1 = s.toCharArray();
        String result = "";
        for (char each : s1) {
            if (each <= '9' && each >= '0') {
                result += each;
            }
        }
        return result;
    }
   /* public static String extractNum(String s) {
        String str = "";​
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                str += s.charAt(i);
            }
        }
        return str;
    }*/
}

