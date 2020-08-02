package ReplitTry;
/*U have an Integer number already declared and assigned value.

        Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

        Enter a number:
        10
        10 is even

        Enter a number:
        33
        33 is odd

        Enter a number:
        0
        0 is even*/
import java.util.*;
public class R042_Scanner_OddEven {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = input.nextInt();
            if (number==0){
                System.out.println(number + " is even");
            } else if (number%2 != 0){
                System.out.println(number + " is odd");
            } else {
                System.out.println(number + " is even");
            }

            //CODE HERE




        }
    }

