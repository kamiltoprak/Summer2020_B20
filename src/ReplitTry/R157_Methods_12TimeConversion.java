package ReplitTry;
/*Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
        Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
        Function Description
        It should print a new string representing the input time in 24 hour format.
        timeConversion has the following parameter(s):
        s: a string representing time in  12 hour format

        Input: 07:05:45PM
        Output: 19:05:45*/

import java.util.*;



public class R157_Methods_12TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String b = s.substring(s.length() - 2, s.length());
        Integer hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
        if (b.equalsIgnoreCase("PM")) {
            hour = hour + 12;
        }

        if(hour<10){
            String newHour = "" +0+ hour + s.substring(s.indexOf(":"),s.indexOf(":")+6);
            System.out.println(newHour);

        }else{
            String newHour = "" + hour + s.substring(s.indexOf(":"),s.indexOf(":")+6);
            System.out.println(newHour);
        }

    }
}