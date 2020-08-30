package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountAction {
    public static void main(String[] args) {
        BankAccount customer1=new BankAccount();
        BankAccount customer2=new BankAccount();
        BankAccount customer3=new BankAccount();
        BankAccount customer4=new BankAccount();

        customer1.setCustomerInfo("ali",12343245,2300);
        customer2.setCustomerInfo("veli",23423134,3400);
        customer3.setCustomerInfo("ayse",23245342,200);
        customer4.setCustomerInfo("fatma",89463345,4500);

        System.out.println("===============================================================");

        ArrayList<BankAccount> cusList=new ArrayList<>();
        cusList.addAll(Arrays.asList(customer1,customer2,customer3,customer4));
        for (BankAccount each:cusList) {
            each.getCustomerInfo();
        }

        System.out.println("===============================================================");
        cusList.removeIf(p->p.balance>100000);
        for (BankAccount each:cusList) {
            each.withdrawMoney(500);
            if (each.balance <= 0) {
                each.balance -= 35;
            }
            each.getCustomerInfo();
        }



    }
}
