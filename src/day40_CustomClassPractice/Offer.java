package day40_CustomClassPractice;
/*Offer:
        Attribute:
        Salary, location,hasPTO, isFullTime,WFH, joTitle, benefit

        Actions:
        setOfferInfo
        getOfferInfo

        Must use this keyword*/
public class Offer {
    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean WFH;
    String jobTitle;
    boolean benefit;

    public  void setOfferInfo(double salary,String state,boolean hasPTO,boolean isFullTime, boolean WFH,String jobTitle,boolean benefit) {
        this.salary=salary;
        this.state=state;
        this.hasPTO=hasPTO;
        this.isFullTime=isFullTime;
        this.WFH=WFH;
        this.jobTitle=jobTitle;
        this.benefit=benefit;
    }
    public void getOfferInfo(){
        System.out.println("========================================");
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " +  jobTitle);
        System.out.println("State: " + state);
        System.out.println("========================================");
    }

}
