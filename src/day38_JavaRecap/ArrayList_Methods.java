package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("BMW", "TESLA", "INFINITY", "MERCEDES", "TESLA", "MERCEDES", "INFINITY", "TESLA", "MERCEDES", "WV", "LAMBORGHINI", "LEXUS"));
        //                          0       1           2       3       4       5           6

        System.out.println(cars);
        //cars.remove(3);
        //cars.remove("TESLA");
        //cars.removeAll(Arrays.asList("MERCEDES"));
        //System.out.println(cars);

        //cars.removeIf(p->p.toLowerCase().contains("lexus"));
        //System.out.println(cars);
        //cars.removeIf(p->p.toLowerCase().contains("w"));

        cars.retainAll(Arrays.asList("TESLA"));
        System.out.println(cars);

        System.out.println("============================================");
        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Paper Towel","Towels","Toilet", "Paper", "Mango","Avacado","Pepsi"));

        //Pepsi
        boolean r1=groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);

        //"Eggs","Orange","Milk","Water")
        boolean r2=groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk","Water"));
        System.out.println(r2);

        System.out.println("Total Number of Items: "+ groceryList.size());

        groceryList.set(groceryList.size()-1,"Apple");
        groceryList.set(groceryList.indexOf("Paper Towel"), "Dish Washer");
        System.out.println(groceryList);



    }
}
