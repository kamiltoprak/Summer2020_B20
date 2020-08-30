package day40_CustomClassPractice;
/*BankAccount
        Attribute / data that  can  have are:
        0- AccountType 1-AccountHolder 2 - Account number 3- Balance

        Actions:
        1. CheckBalance,   2. deposit,  3. withdraw

        requirements:
        1. user should be able to deposit money into their account
        2. user should be able to withdraw money from their account

        2.2 if the balance is less than or equal to 0,
            user should not be able to withdraw money
        3. user should be able to see their balance*/
public class BankAccount {
    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;
    // set  account ifo
    public  void setAccountInfo(String accountType,String accountHolder,String accountNumber) {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
    }
    //display  account info
    public  void getAccountInfo() {
        System.out.println("======================================");
        System.out.println("Account Holder Name: "+accountHolder);
        System.out.println("Account Type: "+ accountType);
        System.out.println("Account balance: "+balance);
        System.out.println("======================================");
    }

    public  void  withdraw(double money) {
        System.out.println("withdraw $" + money+" from "+ accountNumber);
        if(money>=balance){
            System.out.println("you do not enough balance");
            return;
        }
        balance-=money;
        System.out.println("======================================");
    }

    public  void  deposit(double money) {
        System.out.println("deposit $" + money+" to "+ accountNumber);
        balance+=money;
    }

    public  void  checkBalance() {
        System.out.println("Available balance: " +balance);
        System.out.println("======================================");

    }





}
