package java_Interview;

import java.util.Scanner;

public class Cyber_FactorialNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=1;
        for (int i = 1; i <= a; i++) {
            b*=i;
        }
        System.out.println(b);
    }
}
