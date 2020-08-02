package day10_ifStatement;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class MultiBranch {
    public static void main(String[] args) {
        int number = 100;
        if (number>0){
            System.out.println(number +" is positive ");
        }
        if (number < 0){
            System.out.println(number +  " is nagative ");
        }
        if (number == 0) {

            System.out.println(number + " is ZERO ");
        }
        System.out.println("========================================");

        if (number>0){
            System.out.println(number +" is  positive");
        }else if (number<0){
            System.out.println(number + " is nagative ");
        }else {
            System.out.println(number + " is Zero");
        }
    }
}
