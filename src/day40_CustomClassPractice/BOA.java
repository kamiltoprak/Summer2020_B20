package day40_CustomClassPractice;

public class BOA {
    public static void main(String[] args) {
        BankAccount dawud=new BankAccount();
        dawud.setAccountInfo("Saving","Ali","12654433");
        dawud.getAccountInfo();
        dawud.deposit(1000);
        dawud.checkBalance();
        dawud.withdraw(300);
        dawud.checkBalance();
        dawud.deposit(250);
        dawud.checkBalance();
        dawud.withdraw(200);
        dawud.checkBalance();
        dawud.withdraw(1000);
        dawud.checkBalance();

    }
}
