package ReplitTry;
/*in this assignment you are given an int num.
        you need to check if num is positive negative or equals to zero.
        use 3 if statements to do this .
        output if num is positive negative or zero

        for example:
        num  = 1

        print:
        "positive"

        num = -6

        print:
        "negative"

        num = 0

        print:
        "zero"*/
import java.util.*;
public class R026_VAriables_PositiveNegativeZero {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            if (num>0){
                System.out.println("positive");
            }else if (num<0){
                System.out.println("negative");
            }else{
                System.out.println("zero");
            }


            //your code here




        }
    }

