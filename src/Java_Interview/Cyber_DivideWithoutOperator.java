package java_Interview;

import java.util.Scanner;

public class Cyber_DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        String str1=scan.next();
        double result=(str1.equals("+")) ? num1+num2 : (str1.equals("-")) ?
                num1-num2:(str1.equals("/")) ?  num1/num2:(str1.equals("*")) ? num1*num2:num1%num2;
        System.out.println(result);
        division(num1,num2);
    }

    public static void division(int num1, int num2) {
        if( num2 == 0 ){
            System.out.println("invalid entry ");
            return;
        }
        int count=0;
        System.out.print(num1 + " divide  by "+ num2 + " is ");
        while(num1>=num2){
            num1-=num2;
            count++;
        }
        System.out.println(count+ "  and remaining is "+ num1);

    }
}
