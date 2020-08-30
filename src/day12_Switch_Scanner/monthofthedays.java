package day12_Switch_Scanner;
import java.util.*;
public class monthofthedays {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        System.out.println("please enter month  number");
        int monthNumber=scans.nextInt();
        String days="" ;
        switch(monthNumber){
            case 2:
                days="28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days="30 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days="31 days";
                break;
            default :
                days="invalid entry";
        }
        System.out.println(days);
    }
}
