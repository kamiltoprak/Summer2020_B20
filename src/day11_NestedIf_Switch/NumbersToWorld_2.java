package day11_NestedIf_Switch;
import java.sql.SQLOutput;
import java.util.*;

public class NumbersToWorld_2{
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        System.out.println("please enter your number");
        int number=scans.nextInt();
        String[] numberName={"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "nine"};
        for(int i=0;i<10; i++){
            if(i==number){
                System.out.println(numberName[i]);
            }
        }
        if (number>9 || number<0){
            System.out.println("invalid");
        }
    }


}

