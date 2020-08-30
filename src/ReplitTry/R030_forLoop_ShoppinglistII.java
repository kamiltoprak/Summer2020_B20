package ReplitTry;
/*In this assignment you will write a program to create a shopping list, count and prices.

        Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

        You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

        -Declare 4 String variables item1, item2, item3, report.

        -Declare double variables price1, price2, price3, totalPrice

        -Declare int variables count1, count2, count3

        -Create a Scanner object named scan.

        Execution flow using with example:

        Use scanner to read all 3 values.

        -Display prompt "Enter Item1, count and its price:"
        Tomatoes
        2
        5.4
        Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


        -Display prompt "Enter Item2, count and its price:"
        Cheese
        0
        3.5
        Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


        -Display prompt "Enter Item3, count and its price:"
        Apples
        5
        6.3
        Explanation: (Item3 is "Apples", count is 5, price is 6.3)


        -calculate totalPrice for all items only if the item's count is more than 0!
        - Hint :
        The unit test assumes that item1 count is always more than 0
        The only situations you need to handle are either item2 count is 0 or item3 count is 0.
        Think simple and just handle the only item2 is 0 or  only item3 is 0 branches

        -build the report variable by concatenating Strings and double price values:
        -do not include items that have count 0, use if statement !
        -Calculate total price for the item and concatenate like below

        "Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
        Explanation: (Item2 "Cheese" is not included since its count is 0)

        - Print the value of report variable

        - Print total Price:
        "Total price: 42.3"*/
import java.util.Scanner;

public class R030_forLoop_ShoppinglistII {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int[] count=new int[3];
            String[] item=new String[3];
            double[] price=new double[3];
            double totalPrice=0;
            //WRITE YOUR CODE HERE:
            for(int i=0; i<3; i++){
                System.out.println("Enter Item"+(i+1)+", count and its price:");
                item[i]=scan.next();
                count[i]=scan.nextInt();
                price[i]=scan.nextDouble();
                totalPrice+=(count[i]*price[i]);
            }
      /*for (int j=0; j<3;j++){
        if(count[j]!=0){
        System.out.print(" Item"+(j+1)+": "+item[j]+" Price: "+(price[j]*count[j]));
          if (j<2) {
            System.out.print(",");
           }

        }

      }*/
            if (count[0]!=0 && count[1]!=0 && count[2]!=0){
                System.out.println("Item1: "+item[0]+" Price: "+(price[0]*count[0])+", "+
                        "Item2: "+item[1]+" Price: "+(price[1]*count[1])+", "+
                        "Item3: "+item[2]+" Price: "+(price[2]*count[2]));
            }else if(count[0]==0 && count[1]!=0 && count[2]!=0){
                System.out.println("Item2: "+item[1]+" Price: "+(price[1]*count[1])+", "+
                        "Item3: "+item[2]+" Price: "+(price[2]*count[2]));
            }else if(count[0]!=0 && count[1]==0 && count[2]!=0){
                System.out.println("Item1: "+item[0]+" Price: "+(price[0]*count[0])+", "+
                        "Item3: "+item[2]+" Price: "+(price[2]*count[2]));
            }else if(count[0]!=0 && count[1]!=0 && count[2]==0){
                System.out.println("Item1: "+item[0]+" Price: "+(price[0]*count[0])+", "+
                        "Item2: "+item[1]+" Price: "+(price[1]*count[1]));
            }

            System.out.println("Total price: "+totalPrice);

        }
    }
