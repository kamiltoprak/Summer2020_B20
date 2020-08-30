package WarmUpAndPractices.day44;

import java.util.ArrayList;
import java.util.Arrays;

/* create a class called ShoppingList
        create 5 objects of Item and store them into List of Items
        calculate the total cost of all Items in the list */




public class ShoppingList {
    public static void main(String[] args) {
        Item item1 = new Item("Milk",7.99,1);
        Item item2 = new Item("Bread",3.05,2);
        Item item3 = new Item("Chocolate",10.19,1);
        Item item4 = new Item("Avocado",2.09,3);
        Item item5 = new Item("Broccoli",3.30,2);


        ArrayList<Item>  groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalShoping=0;
        for (Item each:groceryList) {
            System.out.println(each);
            totalShoping+= each.calcCost();
        }

        System.out.println(totalShoping);
    }
}
