package day31_Recap;
import Library.Util;
import Library.Util.*;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AABBBCCC";// = > A2B3C3

        String expectedResult="";//A2B3C3
        String nonDup= Util.removeDup(str); //ABC

        /*char ch1=numDup.charAt(0);//A
        int count1=Util.frequence(str,ch1);
        expectedResult+=""+ch1+count1;

        char ch2=numDup.charAt(1);//B
        int count2=Util.frequence(str,ch1);
        expectedResult+=""+ch2+count2;

        char ch3=numDup.charAt(2);//B
        int count3=Util.frequence(str,ch1);
        expectedResult+=""+ch3+count3;*/

        System.out.println(expectedResult);

        for(int i=0; i<=nonDup.length()-1; i++){
            char ch1= nonDup.charAt(i);
            int count1=Util.frequence(str,ch1);
            expectedResult+=""+ch1+count1;//
        }
        System.out.println(expectedResult);
        System.out.println("===================================");

        String str2="cdsfdsfdsfdsifdsofkngjdsfjdsfsfsfs";
        String expectedResult2=frequencyOfChars(str2);
        System.out.println(expectedResult2);
    }


    public static String frequencyOfChars(String str) {
        String expectedResult="";//A2B3C3
        String nonDup= Util.removeDup(str); //ABC
        for(int i=0; i<=nonDup.length()-1; i++){
            char ch1= nonDup.charAt(i);
            int count1=Util.frequence(str,ch1);
            expectedResult+=""+ch1+count1;//
        }
        return expectedResult;
    }
}
