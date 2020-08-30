package OfficeHours.Practices_08_26_2020;
import Library.Util;
import Library.Util.*;
public class MethodCall {
    public static void main(String[] args) {
        double[] arr1={1.4,2.3,2.5,6.5};
        Practice2.printArray(arr1);



        String str="AABBBCCCDDDEEEAAABBBCCC";
        String nonDup="";

        for (int i = 0; i <= str.length()-1; i++) {
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }

        System.out.println(nonDup);


        String str2="FDFFFGGDSDDSDERFSFRFDFDDGSDSFDFDF";
        String nondup2= Util.removeDup(str2);
        System.out.println(nondup2);

    }
}
