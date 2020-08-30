package WarmUpAndPractices;

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
public class day48_warmup_BOA {
    static String bankName = "Bank of America";
    public String firstName;
    public String lastName;
    private String accountHolder;
    private int accountNumber;
    private double balance;

    static {
        bankName = " Bank of America";
    }

    public day48_warmup_BOA(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("You deposited: $" + amount);
        System.out.println("Your current balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You don't have enough balance");
        } else {
            balance -= amount;
            System.out.println("Your remaining balance: $" + balance);
        }
    }


    public void availableBalance() {
        System.out.println("Your available balance = $" + balance);
    }

    public String toString(){
        return "bankName: " + bankName +
                "\nfirstName: "+ firstName +
                "\nlastNAme: "+ lastName+
                "\naccountHolder: " + getAccountHolder() +
                "\naccountNumber: "+ getAccountNumber() +
                "\nbalance: $" + getBalance() +
                "\nclass: " + getClass();

    }


}
