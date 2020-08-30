package day23_Arrays;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*String[] groceryList={"Tomotoes","Cheese","Water","Eggplant","Chocolate","Eggs","Bread"};
        double[] prices={2.4,3.5,4.3,3.4,4.5,5,2};
        int[]  count=new int[7];
        double total=0;
        for (int i = 0; i <groceryList.length ; i++) {
            System.out.println("How much "+groceryList[i]+" do you want? ");
            count[i]=scan.nextInt();
            System.out.println("you will pay for "+groceryList[i]+"just $"+(count[i]*prices[i]));
            total+=(count[i]*prices[i]);
        }
        System.out.println("Your  total will  be: "+total);*/

        String[] shoppingList=new  String[7];
        shoppingList[0] = "Toilet Paper";
        shoppingList[1] = "Hand Sanitizer";
        shoppingList[4] = "Eggs";
        shoppingList[6] = "Corona Beer";
        shoppingList[2] = "Bread";
        shoppingList[3] = "Milk";
        shoppingList[5] = "Water";

        for (int i = 0; i <shoppingList.length ; i++) {
            System.out.println(shoppingList[i]);

        }



    }
}
