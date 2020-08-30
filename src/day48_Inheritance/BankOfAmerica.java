package day48_Inheritance;

/*   create costum class called BankAccount for Bank of America
public variables:  bankName, firstName, lastName
private variables: accountHolder, accountNumber, balance
        encapsulate all the private data
        (DO NOT USE SHORTCUT)
        create a constructor that can initialize firstName and lastName
        (DO NOT USE SHORTCUT)
        action:
        deposit
        withdraw
        availableBalance*/



public class BankOfAmerica {
    public String firstName;
    public String lastName;


    public BankOfAmerica(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }

    public static String bankName;

    static {
        bankName="Bank of America";
    }


    private String accountHolder;
    private long accountNumber;
    private double balance;


    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getBalance(){
        return  balance;
    }

    public void setBalance(){
        this.balance=balance;
    }

    public void deposit(double amount){
        System.out.println("Deposit: "+ amount);
        balance+=amount;

    }
    public void withdraw(double amount){
        if(amount <0){
            System.out.println("invalid amount");
            return;
        }
        if(amount>balance){
           System.out.println("not enough balance ");
           return;
       }

        System.out.println("Withdrawing: "+amount);
       balance-=amount;

    }

}
