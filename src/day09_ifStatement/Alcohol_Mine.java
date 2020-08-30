package day09_ifStatement;
import java.util.Scanner;
public class Alcohol_Mine {
    public static void main(String[] args) {
        int n, age;
        Scanner howMany=new Scanner(System.in);
        System.out.println("how many  people want to  alcohol");
        n=howMany.nextInt();
        int p[] = new int[n];
        System.out.println("please enter people ages ");
        for (int i=0; i<n; i++){
            p[i] = howMany.nextInt();
        }
        for  (int j=0; j<n; j++) {
            if (p[j] >= 18) {
                System.out.println(p[j] + "  can buy alcohol");
            } else {
                System.out.println(p[j] + " can not buy alcohol");
            }
        }
    }
}