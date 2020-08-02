package ReplitTry;
/*In this assignment you will write a program to create a shopping list and prices.

        You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

        -Declare 4 String variables item1, item2, item3, report.

        -Declare double variables price1, price2, price3, totalPrice

        -Create a Scanner object named scan.

        Execution flow with example:

        -Display prompt "Enter Item1 and its price:"
        Tomatoes
        5.5

        -Display prompt "Enter Item2 and its price:"
        Cheese
        3.5

        -Display prompt "Enter Item3 and its price:"
        Apples
        6.3

        -calculate totalPrice for all items

        -build the report variable by concatenating Strings and double values:

        "Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
        "Total price: 15.3"

        - Print the value of report variable*/
import java.util.Scanner;

public class R022_IfLoop_ShoppinglistI {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan=new Scanner(System.in);
            String[] item=new String[3];
            double[] price=new double[3];
            for (int i=0; i<3; i++){
                System.out.println("Enter Item"+(i+1)+" and its price:");
                item[i]=scan.next();
                price[i]=scan.nextDouble();
            }
            System.out.println("Item1: "+item[0]+ " Price: " +price[0]+
                    ", Item2: "+item[1]+ " Price: " +price[1]+
                    ", Item3: "+item[2]+ " Price: " +price[2]);
            System.out.println("Total price: " + (price[0]+price[1]+price[2]));





        }
    }
