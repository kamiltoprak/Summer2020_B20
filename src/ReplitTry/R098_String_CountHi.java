package ReplitTry;
/*Print out the number of times that the string "hi" appears anywhere in the given string.
        Example:
        input: abc hi how hi
        output: 2

        Example:
        input: hi code java please
        output: 1*/
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.*;
public class R098_String_CountHi {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int count = 0;
        String str = scan.nextLine();
        String str1 = str.replaceAll("hi", "");
        int a = (str.length() - str1.length()) / 2;
        System.out.println(a);
    }
}
