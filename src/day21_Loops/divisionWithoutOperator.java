package day21_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

/*3. write a program that can divide two numbers without using
        / & % operators and retuns the devision and remainder*/
public class divisionWithoutOperator {
    public static void main(String[] args) {
        /*Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
        int a=scan.nextInt();
        System.out.println("enter your number");
        int b=scan.nextInt();
        int result=1;
        int left=0;
        if(a>b){
            for(int i=b; i<=a;i++){
                if((i-b)==(b*result)){
                    result+=1;
                }
            }
            left=a-(result*b);
        }
        if(b>=a){
            for(int i=a; i<=b;i++){
                if((i-a)==(a*result)){
                    result+=1;
                }
            }
            left=b-(result*a);
        }
        System.out.println(result+" with reminder of "+left);*/
/*        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1=scan.nextInt();
        System.out.println("Please enter the second number: ");
        int num2=scan.nextInt();
        int count=0;
        if (num1>num2){
            while(num1>=num2){
                count++;
                num1-=num2;
            }
            System.out.println("The division is "+count);
            System.out.println("The remainder is "+num1);
        }*/
        Scanner scan=new Scanner(System.in);
        int a=20;
        int b=5;
        int count =0;
        if(b==0){
            System.out.println("invalid input");
            System.exit(0);
        }
        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+ " with a remainder of "+ a);

    }
}
