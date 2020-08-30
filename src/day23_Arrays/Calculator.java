package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two numbers");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("enter the math oparator");
            char opa = input.next().charAt(0);
            double result = (opa == '+') ? num1 + num2 : (opa == '-') ? num1 - num2 : (opa == '*') ?
                    num1 * num2 : (opa == '/') ? num1 / num2 : (opa == '%') ? num1 % num2 : 0;

            double result1 = 0;

            switch (opa) {
                case '+':
                    result1 = num1 + num2;
                    break;
                case '-':
                    result1 = num1 - num2;
                    break;
                case '*':
                    result1 = num1 * num2;
                    break;
                case '/':
                    result1 = num1 / num2;
                    break;
                case '%':
                    result1 = num1 % num2;
                    break;
                default:
                    System.out.println("please enter correct operator");
            }

            System.out.println(result);
            System.out.println(result1);
            System.out.println("Do you want to continue?");
            String a = input.next().toLowerCase();  // yes

            while (!(a.equals("yes") || a.equals("no"))) { // while the answer is invalid
                System.out.println("Invalid Answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }
        System.out.println("Thanks for using Cybertek' Calculator");
        System.exit(0);
    }
}
