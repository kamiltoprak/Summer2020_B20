package ReplitTry;
/*Write a program that will print a week days according to the day number. Use  Switch statement.

        Example
        Display message: "Enter number:"
        1
        Display message: "Monday"*/

import java.util.*;

public class R057_Swith_WeekDays {

        public static void main(String[] args) {
            // DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            int day = scan.nextInt();
            String name="";
            switch (day){
                case 1:
                    name="Monday";
                    break;
                case 2:
                    name="Tuesday";
                    break;
                case 3:
                    name="Wednesday";
                    break;
                case 4:
                    name="Thursday";
                    break;
                case 5:
                    name="Friday";
                    break;
                case 6:
                    name="Saturday";
                    break;
                case 7:
                    name="Sunday";
                    break;
                default:
                    name="Invalid Entry";



            }
            System.out.println(name);

            //WRITE YOUR CODE HERE


        }
    }

