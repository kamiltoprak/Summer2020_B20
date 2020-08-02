package day21_Loops;
/*1. Write a program that asks user to enter his/her username and password until user enters  correctly.
        there are only three attempts
        after three attempts:  lock the account*/

import java.util.Scanner;

public class AccountLocks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String userName="ahmetkaya";
        String passWord="1234abcd";
        //for(int i=1; i<=3; i++)
        int i=1;
        do{
            System.out.println("enter  your userame");
            String userName1=scan.next();
            System.out.println("enter  your password");
            String passWord1=scan.next();
            if( userName.equals(userName1) && passWord.equals(passWord1)){
                System.out.println("thank you, you logined your  account");
                break;
            }else{
                System.out.println("You  entered wrong user info, please  try one more time ");
            }
            i++;
        }while(i<=3);
        System.out.println("you  already tried 3 times, your account will  be locked ");

    }
}
