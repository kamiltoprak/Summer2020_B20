package day47_Encapsulation;

import day42_Static.CapitalOne;

public class EmployeeObject {
    public static void main(String[] args) {
        CapitalOneEmployee employee1=new CapitalOneEmployee("ALi",24,"QA");

        employee1.setID("sdsds");
        employee1.setAddress("Virginia");
        employee1.setSalary(123000);


        System.out.println(employee1.employeName);
        System.out.println(employee1.employeeAge);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);


        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);
    }
}
