package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        LocalDate DOB=LocalDate.of(2020,7,20);
        //year -month-days
        System.out.println(DOB);


        LocalDate today=LocalDate.now();
        System.out.println(today);

        LocalDate y=LocalDate.of(2021,1,1);
        boolean result =y.isLeapYear();
        System.out.println(result);

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a year ");
        int year=scan.nextInt();
        boolean result1=LocalDate.of(year,1,1).isLeapYear();
        System.out.println(result1);

        System.out.println("===========================");
        System.out.println("enter birth year, birth month , birth day");
        LocalDate d=LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());
        System.out.println(d);
        System.out.println(d.isLeapYear());


    }
}
