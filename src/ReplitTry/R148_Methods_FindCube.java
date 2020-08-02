package ReplitTry;
/*Given method called cube. Write all required code inside this method in order  to asks the user for a number and then prints the cubed value of that number:

        Example:

        input: 5
        output: 125

        hint: cube of a number n = n*n*n*/
import java.util.Scanner;
public class R148_Methods_FindCube {


        //your code here
        public static void cube() {

            Scanner scan=new Scanner(System.in);
            int a=scan.nextInt();
            System.out.println(a*a*a);

        }



        //end cube

        public static void main(String[] args) {

            cube();

        }
    }
