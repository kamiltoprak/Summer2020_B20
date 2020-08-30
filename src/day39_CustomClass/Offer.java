package day39_CustomClass;
/*Offer:
        Attributes:
        Location, hasBenifit(boolean), salary, WFH(boolean), JobTitle

        Actions:
        SetInfo, getInfo


        create a class named MyOffers
		1. create 7 objects Offer Class and store them into an arraylist

                2. write a program that can only keep the offers from local area

                3. write program that can remove all the offers that are not SDET or QA

                4. write a program that can remove all the offers that are not WFH

                5. write a program that can remove all the offers that do not have benifits*/
public class Offer {

    String location;
    boolean benefit;
    double salary;
    boolean WFH;
    String jobtitle;


    public  void setOfferInfo(String offerLocation,boolean offerBenefit,double offerSalary,boolean offerWFH,String offerJobTitle ) {

        location=offerLocation;
        benefit=offerBenefit;
        salary=offerSalary;
        WFH=offerWFH;
        jobtitle=offerJobTitle;
    }

    public  void getOfferInfo() {
        System.out.println("Location: "+location+" Benefit: "+benefit+" Salary: "+salary+" WFH: "+WFH+" JobTitle: "+jobtitle);

    }

}
