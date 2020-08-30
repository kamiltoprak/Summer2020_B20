package day22_NestedLoop;
// username:
// password:
import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        String username="cyber";
        String password="tek123";
        Scanner scan=new Scanner(System.in);
        System.out.println("enter user name");
        String userName=scan.next();
        System.out.println("enter password");
        String passWord=scan.next();
        int attempt =1;
        while( !(userName.equals(username) && passWord.equals(password))){
            if(attempt==3){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("invalid user name or password ,  please re-enter");
            System.out.println("Enter your user name");
            userName=scan.next();
            System.out.println("invalid user name or password ,  please re-enter");
            System.out.println("Enter your user name");
            passWord=scan.next();
            attempt++;
        }



        System.out.println("Logged in");


    }
}
