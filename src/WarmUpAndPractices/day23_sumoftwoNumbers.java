package WarmUpAndPractices;
/*write a program that will ask to user to enter two numbers and calculates the sum of those two numbers.
 then it will ask the user if he/she wants to continue
        if the answer is yes, repeat the whole process again
        if the answer is no, only return the addition
        but while the answer is not a valid answer (not yes or no),
         the the program should repeatedly ask the user re-enter
        HINT: nested loop task, outter loop need to be an infinite loop*/
import java.util.Scanner;

public class day23_sumoftwoNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 0;  ; ) {
            System.out.println("enter first number ");
            int a=scan.nextInt();
            System.out.println("enter second number ");
            int b=scan.nextInt();
            int sum=a+b;
            System.out.println("Your  sum of numbers is: "+sum);
            System.out.println("Do you want to  continue");
            String str=scan.next().toLowerCase();
            while(!str.equals("yes")){
                if (str.equals("no")){
                    System.out.println("Thank  using this program");
                    System.exit(0);
                }else{
                    System.out.println("enter your answer again");
                    str=scan.next();
                }
            }
        }
    }
}
