package WarmUpAndPractices.day42;

/*
Create a class LocalRestaurant that has a main method with the following:
        - Make a Restaurant object
        - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers
        - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs
        - Print your whole restaurants information

        - After setting everything up spend some time interacting with the objects,
        try to call the methods of the objects, access the instance variables.

        - Extra optional tasks (Should still be done in the LocalRestaurant main method)

        - Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates
        - Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time. Their position of server or chef does not matter for these ArrayList, only their employment status
        - Make sure the Restaurant is staffed enough for the level of stars it is using the following requirements:
        5 stars: need at least 6 chefs and 10 servers
        4 stars: need at least 3 chefs and 7 servers
        3 stars: need at least 1 chefs and 4 servers

        - if the restaurant does not have the correct number of chefs or servers based on their number of stars you should print a message: "Need to hire more $chefs or $servers (maybe both). Otherwise you can print: "Up to standard"

*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();
        Server[] servers = {new Server(),new Server(),new Server(),new Server(),new Server()};
        servers[0].setInfo("David",123456,25, true);
        servers[1].setInfo("George",654321,35, false);
        servers[2].setInfo("Lali",123654,28, true);
        servers[3].setInfo("Mariam",456321,33, true);
        servers[4].setInfo("John",162534,27, false);

        restaurant.Servers.addAll(Arrays.asList(servers));

        Chef[] chefs = new Chef[]{new Chef(),new Chef(),new Chef(),new Chef()};
        chefs[0].setInfo("Gabriel", 345267, 45, true);
        chefs[1].setInfo("Romeo", 459865, 47, true);
        chefs[2].setInfo("Juliet", 998877, 48, true);
        chefs[3].setInfo("Ronaldo", 223344, 44, false);

        restaurant.Chefs.addAll(Arrays.asList(chefs));
        System.out.println(restaurant);
        System.out.println("====================================================");

        int costChefs = 0;
        for (Chef each : restaurant.Chefs){
            costChefs += each.hourlyRate;
        }

        System.out.println("total cost of chefs: "+costChefs);
        int costServers = 0;
        for (Server each : restaurant.Servers){
            costServers += each.hourlyRate;
        }
        System.out.println("total cost of chefs: "+costServers);

        System.out.println("Total cost of all employees: $" + (costChefs + costServers));
        System.out.println("====================================================");

        ArrayList<Server> fullTimeServers = new ArrayList<>();
        ArrayList<Chef> fullTimeChefs = new ArrayList<>();
        for (Server each : restaurant.Servers){
            if(each.fullTime==true){
                fullTimeServers.add(each);
            }
        }
        for (Chef each : restaurant.Chefs){
            if(each.fullTime==true){
                fullTimeChefs.add(each);
            }
        }

        System.out.println("there are "+fullTimeChefs.size() + " fullTimeChefs");
        System.out.println(fullTimeChefs);
        System.out.println("there are "+fullTimeServers.size() + " fullTimeServers");
        System.out.println(fullTimeServers);
        System.out.println("====================================================");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of stars that your restaurant has: ");
        restaurant.numberOfStars = scan.nextInt();

        switch(restaurant.numberOfStars){
            case 5:
                if(restaurant.Servers.size()==10 && restaurant.Chefs.size()==6){
                    System.out.println("Up to standard");
                }else{
                    System.out.println("Need to hire more " + (6 - restaurant.Chefs.size() ) + " chefs or " + (10 - restaurant.Servers.size() ) + " servers");
                }
                break;
            case 4:
                if(restaurant.Servers.size()== 7 && restaurant.Chefs.size()== 3){
                    System.out.println("Up to standard");
                }else{
                    System.out.println("Need to hire more " + (7 - restaurant.Chefs.size()) + " chefs or " + (3 -restaurant.Servers.size() ) + " servers");
                }
                break;
            case 3:
                if(restaurant.Servers.size()== 4 && restaurant.Chefs.size()== 1){
                    System.out.println("Up to standard");
                }else{
                    System.out.println("Need to hire more " + (6 - restaurant.Chefs.size() ) + " chefs or " + (10 -restaurant.Servers.size() ) + " servers");
                }
                break;
        }



    }



}
