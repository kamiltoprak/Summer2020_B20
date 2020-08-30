package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
        int number=101;

        boolean even = 100%2==0;
        boolean odd = 100%2!=0;

        if(even){
            System.out.println(number + " is even Number ");

        }
        if(odd){
            System.out.println(number + " is odd number ");

        }


    }



}
