package WarmUpAndPractices.day44;
/*warmup tasks:
        Task01:
        create a class called Item
        instance variables:
        name, unitPrice, quantity
        add a constructor that can initialize the fields

        instance methods:
        calcCost(): returns the total cost as double
        hint: quantity * unitPrice

        toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
        create a class called ShoppingList
        create 5 objects of Item and store them into List of Items
        calculate the total cost of all Items in the list
        Task02:
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
public class Item {
    String name;
    double unitPrice;
    int quantity;
    public Item(String name,double unitPrice,int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public double calcCost(){
        double total=unitPrice*quantity;
        return total;
    }

    public String toString(){
        return "Name: " +name+ "\n Unit Price: "+ unitPrice+ "\n Quantity: "+quantity+" \n Total Price:"+calcCost();
    }
}
