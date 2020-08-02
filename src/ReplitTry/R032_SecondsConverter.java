package ReplitTry;
import java.util.*;


/*Write a program that outputs the number of hours, minutes, and seconds that
        corresponds to input total seconds.

        -create a Scanner object
        - declare int variables inputSeconds, hours, minutes, seconds
        -Ask user enter seconds by printing:
        "Enter seconds:"

        -Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
        -Assign values to the hours, minutes, seconds variables
        -Display the result.

        Example run:
        Enter seconds:
        3695
        1 hours, 1 minutes, and 35 seconds*/
public class R032_SecondsConverter {

        public static void main(String[] args) {
            //YOUR CODE HERE:
            Scanner scans=new Scanner(System.in);
            System.out.println("Enter seconds:");
            int seconds=scans.nextInt();
            int hours=seconds/3600;
            int minutes=(seconds%3600)/60;
            int second=(seconds%3600)%60;
            System.out.println(hours + " hours, "+minutes+" minutes," + " and "+second+ " seconds" );




        }
    }
