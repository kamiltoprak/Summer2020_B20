package ReplitTry;
/*Write a program that determines the change to be dispensed from a vending
        machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
        increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
        dollar bill to pay for the item.

        - int variable itemPrice
        - int variables quarters, dimes, nickels
        - Scanner object

        The program accepts itemPrice, which is a price for the item you would like to purchase.

        Positive behavior:

        Please follow the example in the image. dots mean empty space.
        -Since the item price was entered 95, change is 1 nickel

        Negative behavior:

        If itemPrice is less than 25 or more than 100 cents, then display an error message:
        Invalid price!

        If itemPrice is not divisible by 5, then also display an error message:
        Invalid price!

        use (itemPrice % 5 == 0) expression to find it is divisible by 5.

        Do not display anything else.*/
import java.util.*;
public class R034_ForLoop_VendingMachine {

        public static void main(String[] args) {
            //ENTER CODE HERE
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter price in cents:");
            int itemPrice=scan.nextInt();
            int single=100;
            int quarter=0;
            int nickel=0;
            int dime=0;

            if (itemPrice%5==0 && itemPrice>=25 && itemPrice<=100){
                quarter=(single-itemPrice)/25;
                dime=(single-(itemPrice+(quarter*25)))/10;
                nickel=(single-(itemPrice+(quarter*25)+(dime*10)))/5;
                System.out.println("Your change is "+quarter+" quarters, "+ dime +" dimes, and "+nickel+ " nickels.");
      /*}else if((single - itemPrice)<25 && (single - itemPrice)>=10){
        dime=(single-itemPrice)/10;
        nickel=(single-(itemPrice+(dime*10)))/5;
        System.out.println("Your change is "+quarter+" quarters"+ dime +" dimes"+nickel+ " nickels");

      }else if((single - itemPrice)<10 ){
         nickel=(single-itemPrice)/5;
        System.out.println("Your change is "+quarter+" quarters"+ dime +" dimes"+nickel+ " nickels");

      }else{
        System.out.println("Since the item price was entered" + itemPrice + ", change is 0 "
        );
      }*/



            }else{
                System.out.println("Invalid price!");
            }


        }
    }

