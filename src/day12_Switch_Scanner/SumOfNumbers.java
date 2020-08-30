package day12_Switch_Scanner;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        System.out.println("how many  numbers do you want to add them up");
        int numbers=scans.nextInt();
        int[] num=new int[numbers];
        int result=0;
        for(int i=0;i<numbers;i++){
            System.out.println("please enter number "+(i+1));
            num[i]=scans.nextInt();
            result+=num[i];
        }
        System.out.println("sum is : "+result);
    }
}
