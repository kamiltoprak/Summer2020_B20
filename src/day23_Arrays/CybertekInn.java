package day23_Arrays;

import java.util.Scanner;

public class CybertekInn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int total=0;
        System.out.println("welcome t0  Cybertek Inn");

        while(true) {
            System.out.println("please  choose from the following option");
            System.out.println("1- King Bed: $120");
            System.out.println("2- Queen Bed: $100");
            System.out.println("3- Single Bed: $80");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;
                default:
                    System.out.println("get out ");
                    System.exit(0);
            }
            System.out.println("do you  want to reserve another room");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes"))|| !a.equals("no")){
                System.out.println("invalid enter");
                System.out.println("do  you  want another room ");
                a=scan.next().toLowerCase().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }
        System.out.println("your total price is: " +
                total);

    }
}
