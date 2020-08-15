package day39_CustomClass;

public class Tester {
    String employeeName;
    char employeeGender;
    int SSN;
    String employeeID;
    String jobTitle;
    double salary;
    String companyName;
    int findingBug;
    boolean dailyStandUpMeeting;
    boolean creatingTicket;
    boolean automating;

    public  void setEmployeeInfo(String name,char gender,int ssn, String ID, String job,String title,double empSalary, String company,int bug,boolean standup,boolean ticket,boolean automation) {
        employeeName=name;
        employeeGender=gender;
        SSN=ssn;
        employeeID=ID;
        jobTitle=title;
        salary=empSalary;
        companyName=company;
    }

    public  void findingBug() {
    }

    public  void  dailyStandUpMeeting() {

    }

    public  void creatingTicket() {

    }

    public  void automating() {

    }
}
