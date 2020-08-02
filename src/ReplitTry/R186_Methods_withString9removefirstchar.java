package ReplitTry;
/*The method gets a string and returns a string minus the first string.

        for example:

        removeFirst("aaa")
        returns "aa"*/
public class R186_Methods_withString9removefirstchar {
        public static String removeFirst(String target) {
            target=target.substring(1,target.length());
            return target;

        }
    public static String removeFirst1(String target) {
        return target.substring(1,target.length());
    }
    }

