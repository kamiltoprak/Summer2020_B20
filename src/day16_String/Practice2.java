package day16_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       String  word=input.next();
       String str=""+word;
        int a=100;
        if(str=="Charger"){
            a=100-15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="USB cable"){
            a=100-10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="Headphones"){
            a=100-30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="Pants"){
            a=100-50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="Hat"){
            a=100-25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="Socks"){
            a=100-5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="Blanket"){
            a=100-60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="Pillow"){
            a=100-40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+a+ "$");
        }else if(str=="Smartphone" && str=="Laptop"){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }



    }
}