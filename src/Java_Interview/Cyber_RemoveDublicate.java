package java_Interview;
/*Write a return method that can remove the duplicated values from String

        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
import  java.util.*;
public class Cyber_RemoveDublicate {
    public static void main(String[] args) {
        System.out.println(test("asasrefefdfre"));
    }

    public static String test(String arr) {
        String a="";
        for (int i = 0; i <arr.length() ; i++) {
            if(!a.contains(""+arr.charAt(i))){
                a+=arr.charAt(i);
            }

        }


        return a;
    }
    public static  String  removeDup1( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }

    public static String removeDup(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }

}
