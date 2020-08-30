package day45_Constructor;

public class Paycheck {
    public static void main(String[] args) {
        SalaryCalculator obj1=new SalaryCalculator(55,40,0.09,0.24);
        System.out.println("Gross Salary: "+obj1.salary());
        System.out.println("Net Salary After Tax: "+obj1.salaryAfterTax());
        System.out.println("total Tax: "+ (obj1.salary()- obj1.salaryAfterTax()));
        System.out.println("total Tax: "+ (obj1.federalTax()+obj1.stateTax()));



    }
}
