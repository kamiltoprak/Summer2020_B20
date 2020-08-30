package ReplitTry;
import java.util.Scanner;
/*In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

        -Declare integer variables num1, num2, num3, sum.

        -Create a Scanner object named scan.

        -Display prompt "Enter 3 numbers:"

        -Using scanner object let user input 3 numbers

        -Add 3 numbers and assign to sum variable

        -Print "Sum of numbers: ValueOfSum"*/
public class R021_Import_AddNumbers {
     public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scans=new Scanner(System.in);
            System.out.println("Enter 3 numbers:");
            int num1=scans.nextInt();
            int num2=scans.nextInt();
            int num3=scans.nextInt();
            int m=num1+num2+num3;
   /* int[] num=new int[3];
    int m=0;
    for (int i=0;i<3;i++) {
      System.out.println(" please enter your number " + (i+1) );
      num[i]=scans.nextInt();
      m+=num[i];
    }
    System.out.println(" Sum of numbers " +m );
     */

            System.out.println("Sum of numbers: "+m);



        }
    }

