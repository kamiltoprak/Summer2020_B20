package ReplitTry;
/*U have 2 numbers already declared and assigned values.

        Using Multi-Branch if statements, check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:

        Enter 2 numbers:
        10
        10
        10 and 10 are equal

        Enter 2 numbers:
        100
        55
        100 is greater than 55

        Enter 2 numbers:
        33
        333
        333 is greater than 33*/
import java.util.*;

public class R040_IfCOn_Nums {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 2 numbers:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            String compareNumbers="";
            if (num1-num2==0){
                compareNumbers=num1 + " and "+ num2 +" are equal";
            }else if(num1-num2>0){
                compareNumbers=num1 + " is greater than "+ num2;
            }else {
                compareNumbers=num2 + " is greater than "+ num1;
            }
            System.out.println(compareNumbers);

            //CODE HERE




        }
    }
