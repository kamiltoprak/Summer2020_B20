package Java_Interview;

import java.util.Arrays;

public class Cyber_Reverse {
    public static void main(String[] args) {

    }

    public static String[] reverse(String[] arr) {
        String[] newArr=new String[arr.length];
        int i=arr.length-1;
        for(String each:arr){
                newArr[i]=each;
                i--;

        }
        return newArr;
    }
    public static String reverse(String arr) {
        String newArr="";
        int i=arr.length()-1;
        for (int j = arr.length()-1; j >=0 ; j--) {
            newArr+=arr.charAt(j);
        }
        return newArr;
    }
    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
