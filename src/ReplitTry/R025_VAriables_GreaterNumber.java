package ReplitTry;
/*using an if statement check which int is larger a or b, and then output:
        "number is greater".

        for example:
        a=1
        b=2

        output:
        2 is greater

        a=5
        b=7

        output:
        7 is greater*/
import java.util.*;
public class R025_VAriables_GreaterNumber {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();

            if (b>a){
                System.out.println(b + " is greater");

            } else {

                System.out.println(a + " is greater");
            }

            //WRITE YOUR CODE HERE:


        }
    }

