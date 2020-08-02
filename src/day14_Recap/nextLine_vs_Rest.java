package day14_Recap;
import java.util.Scanner;
public class nextLine_vs_Rest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//enter
        System.out.println("Enter your age: ");
        int age=input.nextInt();//19 Enter

        input.nextLine();//Enter

        System.out.println("Enter your full name: ");
        String fullName=input.nextLine();

        System.out.println("Company Name");
        String company=input.nextLine();

        System.out.println(fullName + " is " + age + " years old ");
    }
}
