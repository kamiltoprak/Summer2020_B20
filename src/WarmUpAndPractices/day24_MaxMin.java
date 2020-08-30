package WarmUpAndPractices;
/*write a program that asks user how many numbers he wants to enter,
        and get all the user inputs and store them into an array variable,
        and then write the program that can return maximum and minimum numbers*/
import java.util.Scanner;

public class day24_MaxMin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many  number do you  want to  enter");
        int count=scan.nextInt();
        int[] num=new int[count];


        for (int i = 0;i<num.length ; i++) {
            System.out.println("enter your number");
            num[i] = scan.nextInt();
        }

        int max=num[0];
        int min=num[0];
        for (int i = 0; i <count ; i++) {
            if(num[i]>=max){
                max=num[i];
            }

            if(num[i]<=min){
                min=num[i];
            }
        }


            System.out.println("your min number "+min);
            System.out.println("your max number "+max);


        }
    }

