package ReplitTry;
/*SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

        In this assignment you will write a program that will find vehicle for recall.
        -Create a scanner object
        -Create int variable named vehicleYear

        -Display prompt: "Enter vehicle's year:"
        input: 1996

        if the value of modelYear does fall within the four recall ranges, display output:
        "Your vehicle needs to be recalled!"

        Otherwise, display message:
        "Your vehicle is fine, enjoy!"*/
import java.util.*;

public class R053_IfCon_VehicleRecall {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter vehicle's year:");
            int vehicleYear=scan.nextInt();
            if(vehicleYear>=1995 &&  vehicleYear<=2017){
                if(vehicleYear>=1995 && vehicleYear<=1998){
                    System.out.println("Your vehicle needs to be recalled!");
                }else if(vehicleYear>=2001 && vehicleYear<=2002){
                    System.out.println("Your vehicle needs to be recalled!");
                }else if(vehicleYear>=2004 && vehicleYear<=2006){
                    System.out.println("Your vehicle needs to be recalled!");
                }else if(vehicleYear>=2015 && vehicleYear<=2017){
                    System.out.println("Your vehicle needs to be recalled!");
                }else{
                    System.out.println("Your vehicle is fine, enjoy!");
                }
            }else{
                System.out.println("Your vehicle is fine, enjoy!");
            }
        }
    }

