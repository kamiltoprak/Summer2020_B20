package WarmUpAndPractices;
/*write a program for the room reservation:
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$
        the program asks the user which bedroom does he/she wants to reserve and
        calculates the total price
        and then the program will ask:
        do you want to reserve another room:
        if yes ==> repeat the previous steps
        if no ==> your total price is: $$$
        while answer is neither yes or no ==> please re-enter
        HINT: nested loop task, outter loop need to be an infinite loop*/

import java.util.Scanner;

public class day23_RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0;
        int total=0;
        for (int i = 0;  ; ) {
            System.out.println("What kind of  bed you  want");
            String str1=scan.next();
            switch (str1){
                case "king":
                    a+=120;
                    break;
                case "queen":
                    a+=100;
                    break;
                case "single":
                    a+=100;
                    break;

            }
            total+=a;
            System.out.println("Do you want to  continue");
            String str=scan.next();
            while(!str.equalsIgnoreCase("yes")){
                if (str.equalsIgnoreCase("no")){
                    System.out.println(total);
                    System.exit(0);
                }else{
                    System.out.println("enter your  answer again");
                    str=scan.next();
                }

            }





        }


    }
}
