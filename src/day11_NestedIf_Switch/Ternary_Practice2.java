package day11_NestedIf_Switch;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Ternary_Practice2 {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        int num=100;
        String result3="";
        if(num>0){
            result3="positive";
        } else if (num < 0) {
            result3="negative";

        }else {
            result3="Zero";
        }
        System.out.println(result3);
        System.out.println("================================================");
        String result4=(num>0)? "positive" : (num<0)? "nagetive": "zero";
        System.out.println(result4);
  /* Compare two  number
   a=10 and b=20
   output  a is greater
            b is greater
            a is equal to b
    */
        System.out.println("please enter first number");
        int numbera=scans.nextInt();
        System.out.println("please enter seond number");
        int numberb=scans.nextInt();
        String compareNumber=(numbera>numberb) ? "Number one is greater" : (numbera==numberb)? "Number one is equal to Number two " : "Number two is greater ";
        System.out.println(compareNumber);
    }




}
