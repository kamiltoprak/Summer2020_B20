package day39_CustomClass;
/* create a custom class for the carpet class that should contain the following:

        instance variables:
        width, length, unitPrice, isPersian (boolean)
        instance methods:
        customOrder(): sets the carpet' width, length, unitprice, & isParsian
        calcCost(): should be able to caculate the total cost of the carpet and return it as double
        getCarpetInfo: should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
        total price of carpet= (width*length)*unitprice
        if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
        create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
        create two ArrayList of carpets:
        persianCarpets
        reugularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
        use for each loop to print out all the persian carpets*/
public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian ;

    public  void customerOrder(double carpetWidth,double carpetLength,double carpetUnitprice,boolean carpetIsParsian) {
        width=carpetWidth;
        length=carpetLength;
        unitPrice=carpetUnitprice;
        isPersian=carpetIsParsian;
    }
    public  double calcCost() {
       double result=length*width*unitPrice;
       return result;
    }

    public  void getCarpetInfo() {
        System.out.println("Carpet width: "+width+" Carpet length: "+length+" Carpet unit Prize: "+unitPrice+" This is persian: "+isPersian);
    }



}
