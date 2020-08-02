package ReplitTry;
/*Assume that the int variables i and j have been declared, and that n has been declared and initialized.
        Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.

        Example:
        input: 5
        output: *
        output: **
        output: ***
        output: ****
        output: *****

        Example:
        input: 3
        output: *
        output: **
        output: ****/
import java.util.Scanner;
public class R108_Loop_PrintTriangle {
        public static void main(String[] args) {
            int i = 1;
            int j = 1;
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            for(int k=i;k<=n;k++){
                for(int m=j ;m<=k;m++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

