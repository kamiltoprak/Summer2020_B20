package day45_Constructor;
/* 2. Create class called SalaryCalculator
        instance variables:
        hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
        add a constructor can initialize those fields
        instance methods:
        salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
        stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
        federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
        salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
        toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()*/
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double statetaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double statetaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.statetaxRate = statetaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        return hourlyRate*weeklyHours*48;
    }

    public double stateTax(){
        return salary()*statetaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString(){
        return "Hourly Rate: "+hourlyRate+"\nWeekly Hours: "+weeklyHours+"\nSalary: "+salary()+"\nSalary After taxes:"+salaryAfterTax();
    }
}
