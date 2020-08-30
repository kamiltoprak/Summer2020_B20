package day12_Switch_Scanner;
import java.util.*;
public class switch_practice2 {
    public static void main(String[] args) {
        Scanner scans=new Scanner(System.in);
        System.out.println("please enter product name");
        String productName=scans.next();
       String brand="";
        switch(productName){
            case "galazxy":
               brand="Samsung";
                break;
            case "iphone":
            case "ipad":
            case "macbook":
                brand="Apple";
                break;
        }
        System.out.println(brand);

    }
}
