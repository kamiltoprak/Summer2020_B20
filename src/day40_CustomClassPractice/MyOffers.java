package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        Offer offer2=new Offer();
        Offer offer3=new Offer();
        Offer offer4=new Offer();
        Offer offer5=new Offer();
        Offer offer6=new Offer();
        Offer offer7=new Offer();

        offer1.setOfferInfo(100000,"VA",true,true,true,"SDET",true);
        offer2.setOfferInfo(120000,"VA",true,true,true,"QA",true);
        offer3.setOfferInfo(130000,"MA",false,false,true,"CyberSecurity",true);
        offer4.setOfferInfo(90000,"NY",true,true,false,"SDET",true);
        offer5.setOfferInfo(82500,"VA",false,false,false,"SDET",true);
        offer6.setOfferInfo(70000,"NY",true,false,true,"QA",false);
        offer7.setOfferInfo(85000,"MA",false,true,true,"QA",true);

        ArrayList<Offer> jobOffers=new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

        for(Offer  each:jobOffers){
            each.getOfferInfo();
        }

        System.out.println("===================================================");
       /* jobOffers.removeIf(p->p.salary<120000);// less than  120000;
        System.out.println(jobOffers.size());*/

        // less than 120  and is not VA
        /*jobOffers.removeIf(p->p.salary<120000 ||! p.state.equals("VA"));
        System.out.println("number of offer "+jobOffers.size());*/

        // does not have PTO  or does not have  benefit or is  not  full time
        jobOffers.removeIf(p->p.hasPTO==false || p.benefit==false || p.isFullTime==false);
        System.out.println("Number of offer "+ jobOffers.size());

    }


}

