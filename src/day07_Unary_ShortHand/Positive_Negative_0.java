package day07_Unary_ShortHand;
/*

   Positive_Negative_0
        Ex:
            number = 120
        Output:
            120 is a positive number? true
            120 is negative number? false
            120 ii zero? false
 */
import java.util.Scanner;

public class Positive_Negative_0 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int number1=number.nextInt();
        boolean a= number1>0;
        boolean b= number1==0;
        boolean c=number1<0;
        System.out.println(number1+ " is a positive number? "+a);
        System.out.println(number1+ " is a negative number? "+c);
        System.out.println(number1+ " is zero? "+b);

        double number2=number.nextDouble();
        boolean a1= number2>0;
        boolean b1= number2==0;
        boolean c1=number2<0;
        System.out.println(number2+ " is a positive number? "+a1);
        System.out.println(number2+ " is a negative number? "+c1);
        System.out.println(number2+ " is zero? "+b1);

    }
}




