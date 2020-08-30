package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitolOne {
    public static void main(String[] args) {
        BankAccount customer1=new BankAccount();
        BankAccount customer2=new BankAccount();
        BankAccount customer3=new BankAccount();
        BankAccount customer4=new BankAccount();
        BankAccount customer5=new BankAccount();


        customer1.setAccountInfo("Saving","Dilyar","23334423");
        customer2.setAccountInfo("checking","Elvira","44678767");
        customer3.setAccountInfo("Saving","Zeliha","23334423");
        customer4.setAccountInfo("Checking","Gulay","55347678");
        customer5.setAccountInfo("Saving","Paban","45342334");

        ArrayList<BankAccount> customerList=new ArrayList<>();
        customerList.addAll(Arrays.asList(customer1,customer2,customer3,customer4,customer5));
        for (BankAccount each:customerList) {
            each.getAccountInfo();
            each.deposit(500);
            each.checkBalance();

        }
        customerList.get(3).deposit(1000);
        customerList.get(3).checkBalance();
        customerList.get(2).deposit(600);
        customerList.get(2).checkBalance();
        System.out.println(customerList.size());

        System.out.println("===================================================");
        customerList.removeIf(p->p.balance<1000);
        System.out.println(customerList.size());
        for (BankAccount each:customerList) {
            each.getAccountInfo();
        }



    }
}
