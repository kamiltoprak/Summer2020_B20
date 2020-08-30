package day07_Unary_ShortHand;
//write a program that can check if a number is evenly divisible by 2, 3, 5


public class Divisible_2_3_5 {
    public static void main(String[] args) {
        int number=100;
        boolean divisible2 = number%2==0;
        boolean divisible3 = number%3==0;
        boolean divisible5 = number%5==0;
        System.out.println(number + " is divisible by 2: " + divisible2);
        System.out.println(number + " is divisible by 2: " + divisible3);
        System.out.println(number + " is divisible by 2: " + divisible5);








    }
}
