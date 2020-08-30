package WarmUpAndPractices.day44;

import java.util.ArrayList;
import java.util.Arrays;

/*toString -- print all info about offers
        create a class called MyOffers
        Create 5 offer objects
        1. use for loop to print out the info of each offer
        2. write a program that can only retain the offers if:
        1. the offer is for fulltime position
        2. offer is from your local area
        3. salary is greater than 100K*/
public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer("NY","Sony",123000,true);
        Offer offer2=new Offer("PA","ELCtric",87000,true);
        Offer offer3=new Offer("PA","SANS",123000,false);
        Offer offer4=new Offer("NJ","BENS",90000,false);
        Offer offer5=new Offer("NJ","SBF",321000,true);

        ArrayList<Offer> offers=new ArrayList<>();
        offers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));
        System.out.println(offers.size());

        ArrayList<Offer> offers1=new ArrayList<>();
        offers1.addAll(offers);
        offers1.removeIf(p->!p.isFullTime);
        System.out.println(offers1.size());

        ArrayList<Offer> offers2=new ArrayList<>();
        offers2.addAll(offers);
        offers2.removeIf(p->!p.location.equalsIgnoreCase("NY"));
        System.out.println(offers2.size());

        ArrayList<Offer> offers3=new ArrayList<>();
        offers3.addAll(offers);
        offers3.removeIf(p->p.salary<100000);
        System.out.println(offers3.size());

    }

}
