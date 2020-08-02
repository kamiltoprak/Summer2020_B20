package ReplitTry;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/*combine two String arrays into one arraylist and return it as a string.

        for example:

        combineRs(["f","o","o"],[" b","a","r"])
        returns "foo bar"


        combineRs(["1","2","3"],[" 4"])
        returns "1234*/
public class R193_Methods_withArrayList3combinearrays {

        public static String combineRs(String[] r1,String[] r2)
        {

            //ArrayList<String> a=new ArrayList<>();
            String a="";
            for(String each:r1){
                a+=each;
            }

            for(String each:r2){
                a+=each;
            }
            return a;
        }
    }

