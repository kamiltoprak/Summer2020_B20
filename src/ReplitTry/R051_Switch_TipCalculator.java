package ReplitTry;
/*Write your code inside the method.
        Use the values given as method parameters.
        Assign final values.
        Then user should select service quality that will correspond to tip percent.
        Poor = 5%
        Fair = 10%
        Good = 15%
        Great = 20%
        Excellent = 25%
        The program should display the following information based on the user input:
        Split or No split
        Number of people entered: &&&&
        Service Quality:
        Total to pay:
        Total tip:
        Total per person:
        Tip per person:
        https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

        Input:
        Split:Yes
        Number of people:4
        Check amount:476.0
        Service Quality:Excellent

        Output:

        Number of people entered: &&&&
        Total to pay: 595.0
        Total tip: 119.0
        Total per person: 148.75
        Tip per person: 29.75*/
import java.util.*;
public class R051_Switch_TipCalculator {
    public static void main(String[] args) {


    //WRITE YOUR CODE HERE
    Scanner scan = new Scanner(System.in);
    boolean split;
    String splitConf;
    int numberOfPeople;
    double checkAmount;
    String serviceQuality;
    double totalPay = 0;
    double tip = 0;

            System.out.println("Split:");
    splitConf=scan.next();
            System.out.println("Number of people:");
    numberOfPeople=scan.nextInt();
            System.out.println("Check amount:");
    checkAmount=scan.nextDouble();
            System.out.println("Service Quality:");
    serviceQuality=scan.next();


            if(splitConf.equalsIgnoreCase("Yes"))

    {
        System.out.print("Number of people entered: ");
        for (int i = 1; i <= numberOfPeople; i++) {
            System.out.print("&");
        }
        System.out.println();
    }


            System.out.print("Total to pay: ");
            switch(serviceQuality)

    {
        case "Poor":
            tip = checkAmount * 0.05;
            break;
        case "Fair":
            tip = checkAmount * 0.10;
            break;
        case "Good":
            tip = checkAmount * 0.15;
            break;
        case "Great":
            tip = checkAmount * 0.20;
            break;
        case "Excellent":
            tip = checkAmount * 0.25;
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




