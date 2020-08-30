package day39_CustomClass;
/*create a custom class for BankAccount
        attributes/data that can have are:
        1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: showBalance, deposit, withdraw
        requiremnts:
        1. user should be able to deposit money into their account
        2. user should be able to withdraw money from their account
        2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
        2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
        3. user should be able to see their balance*/
public class BankAccount {
    String aName;
    double aNumber;
    double balance;


    public  void setCustomerInfo(String cusName,double cusNumber,double cusBalance ) {
            aName=cusName;
            aNumber=cusNumber;
            balance=cusBalance;
    }
    public  void getCustomerInfo( ) {
        System.out.println("Customer Name: "+ aName+ " Account Number: "+aNumber+ " Balance: "+balance);;
    }

    public  void addMoney(double add) {
        balance+=add;
    }

    public  void withdrawMoney(double subtract) {
        balance-=subtract;
    }

    public  void balance() {
        System.out.println(balance);
    }
}
