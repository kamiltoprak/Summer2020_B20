package ReplitTry;
import java.util.Scanner;
/*Write a program that will print out month names by receiving a number. Use Switch Statement.

        Example:
        Display message: "Enter month number:"
        input: 5
        Display message: "May"*/
public class R058_Switch_Calendar {

        public static void main(String[] args) {
            // DO NOT CHANGE
            Scanner scan = new Scanner (System.in);
            System.out.println("Enter month number:");
            int monthNum = scan.nextInt();
            String nameMonth="";
            switch (monthNum){
                case 1:
                    nameMonth="January";
                    break;
                case 2:
                    nameMonth="February";
                    break;
                case 3:
                    nameMonth="March";
                    break;
                case 4:
                    nameMonth="April";
                    break;
                case 5:
                    nameMonth="May";
                    break;
                case 6:
                    nameMonth="June";
                    break;
                case 7:
                    nameMonth="July";
                    break;
                case 8:
                    nameMonth="August";
                    break;
                case 9:
                    nameMonth="September";
                    break;
                case 10:
                    nameMonth="October";
                    break;
                case 11:
                    nameMonth="November";
                    break;
                case 12:
                    nameMonth="December";
                    break;
                default:
                    nameMonth="Invalid Number!";

            }
            System.out.println(nameMonth);

            //WRITE YOUR CODE HERE:




        }
    }

