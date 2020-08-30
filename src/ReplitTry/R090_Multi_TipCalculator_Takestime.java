package ReplitTry;
/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
        Example:
        input: javapython
        output: true

        Example:
        input: cjavac++
        output: true


        Example:
        input: c#javaruby
        output: false*/
import java.util.*;
public class R090_Multi_TipCalculator_Takestime {
        public static void main(String[] args) {
            //WRITE YOUR CODE HERE
            Scanner scan=new Scanner(System.in);
            boolean split;
            String splitConf;
            int numberOfPeople;
            double checkAmount;
            String serviceQuality;
            double totalPay=0;
            double tip=0;

            System.out.println("Split:");
            splitConf=scan.next();
            System.out.println("Number of people:");
            numberOfPeople=scan.nextInt();
            System.out.println("Check amount:");
            checkAmount=scan.nextDouble();
            System.out.println("Service Quality:");
            serviceQuality=scan.next();


            if(splitConf.equalsIgnoreCase("Yes")){
                System.out.print("Number of people entered: ");
                for(int i=1; i<=numberOfPeople;i++){
                    System.out.print("&");
                }
                System.out.println();
            }


            System.out.print("Total to pay: ");
            switch(serviceQuality){
                case "Poor":
                    tip=checkAmount*0.05;
                    break;
                case "Fair":
                    tip=checkAmount*0.10;
                    break;
                case "Good":
                    tip=checkAmount*0.15;
                    break;
                case "Great":
                    tip=checkAmount*0.20;
                    break;
                case "Excellent":
                    tip=checkAmount*0.25;
                    break;
            }
            totalPay=tip+checkAmount;
            System.out.print(totalPay);
            System.out.println();

            System.out.print("Total tip: ");
            System.out.print(tip);
            System.out.println();

            System.out.print("Total per person: ");
            System.out.print(totalPay/numberOfPeople);
            System.out.println();

            System.out.print("Tip per person: ");
            System.out.print(tip/numberOfPeople);

        }
    }

