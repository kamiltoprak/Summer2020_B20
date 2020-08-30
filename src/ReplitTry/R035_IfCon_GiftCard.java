package ReplitTry;
/*
Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
        Hint
        Use if/ else if / else
        CODE EXAMPLE:
        Example #1
        input: Hat
        output: Thank you for your purchase!
        output: Your current balance is: 75$

        Example #2
        input: Pants
        output: Thank you for your purchase!
        output: Your current balance is: 50$

        Example #3
        input: Laptop
        output: Sorry, not enough funds on your gift card!

        Example #4
        input: Cupcake
        output: Invalid item!
        List of items


*/
import java.util.*;
public class R035_IfCon_GiftCard {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String item = input.nextLine();

            int price = 100;

            if (item.equals("Charger")) {
                price -=15;
            }else if (item.equals("USB cable")) {
                price -=10;
            } else if (item.equals("Headphones")){
                price -=30;
            }else if (item.equals("Pants")) {
                price -=50;
            }else if (item.equals("Hat")) {
                price -=25;
            }else if (item.equals("Socks")) {
                price -=5;
            }else if (item.equals("Blanket")) {
                price -=60;
            }else if (item.equals("Pillow")){
                price -=40;
            }else if (item.equals("Laptop")) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }else if (item.equals("Smartphone")) {
                System.out.println("Sorry, not enough funds on your gift card!");
            }else {
                System.out.println("Invalid item!");
            }

            if (price < 100) {
                System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: " +price + "$");
            }
        }
    }

