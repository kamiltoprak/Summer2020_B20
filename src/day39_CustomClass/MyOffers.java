package day39_CustomClass;

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

        offer1.setOfferInfo("NewYork",true,125000,true,"SDET" );
        offer2.setOfferInfo("NewYork",false,150000,false,"QA" );
        offer3.setOfferInfo("Chicago",true,125000,true,"Developer" );
        offer4.setOfferInfo("Houston",false,123000,false,"SDET" );
        offer5.setOfferInfo("Pittsburgh",true,125000,true,"QA" );
        offer6.setOfferInfo("Dallas",false,124000,false,"QA" );
        offer7.setOfferInfo("NewYork",false,99000,true,"QA" );

        offer1.getOfferInfo();
        offer2.getOfferInfo();
        offer3.getOfferInfo();
        offer4.getOfferInfo();
        offer5.getOfferInfo();
        offer6.getOfferInfo();
        offer7.getOfferInfo();

        System.out.println("==============================================================");

        ArrayList<Offer> offerList= new ArrayList<>();
        offerList.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));

        for (Offer each:offerList) {
            each.getOfferInfo();
        }
        System.out.println("==============================================================");

        offerList.removeIf(p->!p.location.equals("NewYork"));
        for (Offer each:offerList){
            each.getOfferInfo();
        }
        System.out.println("==============================================================");

        offerList.removeIf(p->!(p.jobtitle.equals("SDET") ||p.jobtitle.equals("QA")) );
        for (Offer each:offerList){
            each.getOfferInfo();
        }

        System.out.println("==============================================================");

        offerList.removeIf(p->p.WFH!=true );
        for (Offer each:offerList){
            each.getOfferInfo();
        }
        System.out.println("==============================================================");

        offerList.removeIf(p->p.benefit!=true );
        for (Offer each:offerList){
            each.getOfferInfo();
        }

    }
}
