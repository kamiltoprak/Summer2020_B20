package day47_Encapsulation;

import com.sun.xml.internal.bind.v2.model.core.ID;

/*2- create a  class called CapitalOneEmployees
        instance variable :
        employeName
        employeeAge
        private ID
        prviate salary
        private address

        company  name= "Capital One"

        generate getters and setters for private variable*/
public class CapitalOneEmployee {

    public String employeName;
    public int employeeAge;
    public String jobTitle;
    private String ID;
    private double salary;
    private String address;

    public static String companyName;

    static{
        companyName="Capital ONE";
    }

    public CapitalOneEmployee(String employeName,int employeeAge,String jobTitle){
        this.employeeAge=employeeAge;
        this.employeName=employeName;
        this.jobTitle=jobTitle;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getID() {
        return ID;
    }

    public String toString(){
        return "Name: "+employeName+", Age: "+employeeAge+", Job Title: "+jobTitle+", ID: "+getID()+
                ", Salary: "+getSalary()+", Address"+ getAddress();
    }
}
