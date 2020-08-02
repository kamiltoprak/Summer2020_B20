package day16_String;
/* write a program to ask the user enter two number and a math operator.
        ex:
        10
        20
        *
        output:
        200
        10
        2
        /
        output:
        5
        precondition valid math operators are: *, / , +, -, %
        Nested If*/
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        double number1=scan.nextDouble();
        System.out.println("enter second number");
        double number2=scan.nextDouble();
        System.out.println("enter your math oprator");
        char operator=scan.next().charAt(0);

        boolean valid= operator=='*' || operator=='/' || operator=='+' || operator=='%' || operator=='-';
        if(valid){
            switch (operator){
                case '*':
                    System.out.println(number1*number2);
                    break;
                case '/':
                    System.out.println(number1/number2);
                    break;
                case'%':
                    System.out.println(number1%number2);
                    break;
                case'+':
                    System.out.println(number1+number2);
                    break;
                default :
                    System.out.println(number1-number2);
            }
        }else{
            System.out.println("Invalid Operator");
        }

    }
}
