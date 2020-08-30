package WarmUpAndPractices.day44;
/*Task02:
        Create class called SalaryCalculator
        instance variables:
        hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
        add a constructor can initialize those fields
        instance methods:
        salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
        salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
        stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
        federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)

        toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()*/
public class SalaryCalculator {
    double hourlyRate;
    double  weeklyhour;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate,double  weeklyhour,double stateTaxRate,double federalTaxRate){
        this.hourlyRate=hourlyRate;
        this.weeklyhour=weeklyhour;
        this.stateTaxRate=stateTaxRate;
        this.federalTaxRate=federalTaxRate;
    }


    public double salary(){
        double salary=hourlyRate*weeklyhour*48;
        return salary;
    }

    public double salaryAfterTax(){
        double netSalary=salary()-stateTax()-federalTax();
        return netSalary;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }


    public String toString(){
        return "Hourly Rate: "+hourlyRate+" Weekly hours: "+weeklyhour+" Salary Net: "+salaryAfterTax();
    }
}

