package day08_LogicalOperators;
import java.util.Scanner;
public class GallonsToLitters {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        double gallon=scans.nextDouble();
        double litters=gallon*3.785;
        System.out.println(gallon + " gallons equal to " + litters+" Litters");


    }
}
