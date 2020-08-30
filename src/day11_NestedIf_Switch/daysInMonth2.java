package day11_NestedIf_Switch;

import java.util.*;
public class daysInMonth2 {
    public static void main(String[] args) {
        Scanner Scans=new Scanner(System.in);
        System.out.println("Please enter your  month number");
        int month=Scans.nextInt();
        boolean days28=month==2;
        boolean validNumber=(month>=1 && month<=12);
        boolean days30=month==4||month==6 || month==9||month==11;

        String result="";
        if (validNumber){
            if(days28){
                result="28 days";
            }else if (days30){
                result="30  days";
            }else{
                result="31 days";
            }
        }else{
            result="invalid enter";
        }
        System.out.println(result);
    }
}
