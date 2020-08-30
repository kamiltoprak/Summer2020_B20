package OfficeHours.Practices_08_19_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {
    public static void main(String[] args) {
        ArrayList<Pizza> myPizzas=new ArrayList<>();

        for (int i = 0; i < 400; i++) {
            Pizza myPizza=new Pizza();
            myPizza.setPizzaInfo("Large",4,3);
            myPizzas.add(myPizza);
        }

        System.out.println("total  number of pizza " +myPizzas.size());
        double totalPrice=0;
        for (Pizza each:myPizzas) {
            totalPrice+=each.calcPrice();
        }


        System.out.println("total price:" + totalPrice);
        System.out.println("=====================================================");
        Pizza pizza1=new Pizza();
        pizza1.setPizzaInfo("medium",2,3);
        Pizza pizza2=new Pizza();
        pizza2.setPizzaInfo("medium",3,5);
        System.out.println("First pizza total price: "+pizza1.calcPrice());
        System.out.println("Second pizza total price" +pizza2.calcPrice());

    }
}
