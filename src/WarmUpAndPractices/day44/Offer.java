package WarmUpAndPractices.day44;
/* 2.  Create a class called Offer that has:
        fields :
        location, company, salary , isFullTime
        create a constructor that can initialize all the fields

        toString -- print all info about offers
        create a class called MyOffers
        Create 5 offer objects
        1. use for loop to print out the info of each offer
        2. write a program that can only retain the offers if:
        1. the offer is for fulltime position
        2. offer is from your local area
        3. salary is greater than 100K
   3. create a custom class for the carpet class
instance variables:
        width, length, unitPrice, isPersian
        instance methods:
        calcCost(): should be able to caculate the total cost of the carpet and return it as double
        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

        total price of carpet= (width+length)*unitprice
        if the carpet is persian  carpet, add 200$ to the totalPrice*/

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    public Offer(String location, String company,double salary,boolean isFullTime){
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFullTime=isFullTime;
    }

    public String toString(){
        return "\n location: "+ location+"\n company: "+company+"\n salary: "+salary+"\n isFullTime: "+isFullTime;
    }

}
