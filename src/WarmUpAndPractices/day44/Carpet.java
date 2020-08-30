package WarmUpAndPractices.day44;
/*create a custom class for the carpet class
instance variables:
        width, length, unitPrice, isPersian
        instance methods:
        calcCost(): should be able to caculate the total cost of the carpet and return it as double
        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

        total price of carpet= (width+length)*unitprice
        if the carpet is persian  carpet, add 200$ to the totalPrice*/

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    public Carpet(double width,double length, double unitPrice,boolean isPersian){
        this.width=width;
        this.length=length;
        this.unitPrice=unitPrice;
        this.isPersian=isPersian;

    }

    public double calcCost(){
        if(isPersian==true){
            return unitPrice*length*width+200;
        }else{
            return unitPrice*length*width;
        }
    }

    public String toString(){
        return "\nlength: "+ length+ "\n width: " + width+"\n price: "+calcCost()+"\n persian: "+isPersian;
    }
}
