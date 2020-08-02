package day14_Recap;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);// enter enter
        System.out.println("Enter your grade");
        String gender=input.next();//female

        System.out.println("Enter your age ");
        int age=input.nextInt();//19

        input.nextLine();

        System.out.println("Enter Your  country name: ");
        String countryName=input.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipCode=input.nextInt();//23242

        input.nextLine();

        System.out.println("Enter your your Full name: ");
        String fullName=input.nextLine();//23242

        System.out.println("Enter your your company name: ");
        String companyName=input.nextLine();//23242


    }


}
