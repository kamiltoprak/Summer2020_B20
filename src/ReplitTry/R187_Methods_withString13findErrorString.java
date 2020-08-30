package ReplitTry;
/*isError method checks if the line of string it gets has the word error at the start of it.

        it gets a string and returns a boolean.
        true if it found the word 'error' an the start of the line string

        example use:

        isError("foo bar")
        returns : false

        isError("error foo bar")
        returns : true

        isError("error one two")
        returns : true

        isError("three four error")
        returns : false

        hint: check the string methods in the java doc. one of them is helpful for this.

        https://docs.oracle.com/javase/7/docs/api/java/lang/String.html*/

public class R187_Methods_withString13findErrorString {



    public static boolean isError(String line) {
        if (line.substring(0, 5).equals("error")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isError1(String line) {
        if (line.startsWith("error")) {
            return true;
        } else {
            return false;
        }
    }
}
