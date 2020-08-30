package day14_Recap;
/*
  2. write a program for the shipping info that, the program should ask:
                    building number ( nextInt() )
                     ( nextLine() )
                    Street address (Assume it has more than one word)(nextline());
                    city name( nextLine())
                    state name (next())
                    zip code (next())
                  ( nextLine() )
                    full name of the person:( nextLine() )
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

 */
import java.util.Scanner;
public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter building number");
        int builingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Please enter street  address");
        String streetAddress = input.nextLine();

        System.out.println("Please enter city name: ");
        String cityName = input.nextLine();

        System.out.println("Please enter state name: ");
        String stateName = input.next();

        System.out.println("Please enter zip code: ");
        int zipCode=input.nextInt();

        input.nextLine();

        System.out.println("Please enter person full name: ");
        String fullName=input.nextLine();

        System.out.println("Ship to : "+fullName
                +"\n\t\t\t" +builingNumber+" "+ streetAddress
                +"\n\t\t\t"+cityName+" "+stateName+" "+zipCode );
       // System.out.println("\t\t\t"+builingNumber+" "+"\n"+ streetAddress);
        //System.out.println("\t\t\t"+cityName+" "+stateName+" "+zipCode);
    }

}
