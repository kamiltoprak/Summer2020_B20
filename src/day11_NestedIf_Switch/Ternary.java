package day11_NestedIf_Switch;

public class Ternary {
    public static void main(String[] args) {
        int num=100;
        String result = "" ;
       if (num%2 == 0 ){
            result="even";
        }else {
            result="odd";
        }
        System.out.println(result);

        System.out.println("=================================");

        String result2=(num%2==0)? "Even":"odd";
        System.out.println(result2);

        System.out.println("=============================");
        int num1=10;
        int num2=20;
        int max1=0;

        if(num1> num2 ){
            max1=num1;
        }else  {
            max1=num2;
        }
        System.out.println(max1);
        System.out.println("=============================");
        int max2= (num1>num2)? num1:num2;
        System.out.println(max2);

        System.out.println("==================================");
        int age=20;
        boolean eligible=false;
        // can  buy  alcohol
        if (age > 21) {
            eligible =true;
        }else{
            eligible=false;
        }
        System.out.println(eligible);
        // convert alcohol if statement
        boolean eligible2=(age>=21)? true:false;



        // second task  can vote and can not vote
        boolean vote2=(age>=18) ? true:false;


        // third task: write a program that can check if two numbers are equal or not.

        boolean number3=(num1==num2)? true:false;


    }
}
