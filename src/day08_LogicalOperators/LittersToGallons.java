package day08_LogicalOperators;

import java.util.Scanner;

public class LittersToGallons {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        double liter=scans.nextDouble();
        double gallon=liter/3.785;
        System.out.println(liter + " liters equal to " + (int)gallon+" Gallons");
    }
}
