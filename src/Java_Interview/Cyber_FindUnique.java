package Java_Interview;

import java.util.Arrays;
import java.util.Collections;

/*Write a return  method that can find the unique characters from the String

        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
public class Cyber_FindUnique {
    public static void main(String[] args) {
        System.out.println(test("amdamdksfirjew"));
    }

    public static String test(String arr) {
        String a="";

        for (int i = 0; i < arr.length() ; i++) {
            int count=0;
            for (int j = 0; j <arr.length() ; j++) {
                if(arr.charAt(i)==arr.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                a+=arr.charAt(i);
            }
        }
        return a;

    }
    public static String unique(String str) {

        String[ ] arr=str.split("");

        String unique1="";

        for(int j=0; j<arr.length; j++) {

            int num=0;

            for(int i=0; i<arr.length; i++ ) {

                if(arr[i].equals(arr[j]) )

                    num++;

            }

            if(num==1)

                unique1+=arr[j];

        }

        return unique1;

    }

    public static String Unique(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }
}
