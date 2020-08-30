package ReplitTry;
/*A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

        Example:
        input: breadjambread
        output: jam

        Example:
        input: xxbreadjambreadyy
        output: jam

        Example:
        input: xxbreadapple
        output: nothing

        Example:
        input: breadbutterbread
        output: butter*/
import java.util.*;
public class R100_String_Sandwiches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.contains("bread")){
            int a =str.indexOf("bread");
            int b=str.lastIndexOf("bread");
            if(a!=b){

                System.out.println(str.substring(a+5,b));
            }else{
                System.out.println("nothing");
            }


        }else{
            System.out.println("nothing");
        }

    }
}
