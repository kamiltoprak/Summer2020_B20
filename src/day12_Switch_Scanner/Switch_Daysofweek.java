package day12_Switch_Scanner;
import java.util.*;
public class Switch_Daysofweek {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        System.out.println("please enter your day number");
        int dayNumber=scans.nextInt();
        String days="";
        switch(dayNumber){
            case 1:
                days="Monday";
                break;
            case 2:
                days="Tuesday";
                break;
            case 3:
                days="wednesday";
                break;
            case 4:
                days="Thursday";
                break;
            case 5:
                days="friday";
                break;
            case 6:
                days="Saturday";

                break;
            case 7:
                days="Sunday";

                break;
            default:
                days="Invalid Entry";

        }
        System.out.println(days);
    }

}
