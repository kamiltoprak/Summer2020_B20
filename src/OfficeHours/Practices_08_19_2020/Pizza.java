package OfficeHours.Practices_08_19_2020;
/*Create a class named Pizza that stores information about a single pizza.
        Attributes:
        size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
        set(): sets all info of the pizza
        calcCost(): calculates the price and returns it as double
        toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
        Pizza cost is determined by:
        Small: $10 + $2 per topping
        Medium: $12 + $2 per topping
        Large: $14 + $2 per topping*/
public class Pizza {
    String size;
    int numOfChessTopping;
    int numOfPepperoniTopping;

    public void setPizzaInfo(String size,int numOfChessTopping,int numOfPepperoniTopping){
            this.size=size;
            this.numOfChessTopping=numOfPepperoniTopping;
            this.numOfPepperoniTopping=numOfPepperoniTopping;

    }

    public double calcPrice(){
        int totalNumberOfTopping=numOfChessTopping+numOfPepperoniTopping;
        double totalpriceOfToping=totalNumberOfTopping*2;
        double totalPrice=0;
        if(size.equalsIgnoreCase("small")){
            totalPrice=10+totalpriceOfToping;
        }else if(size.equalsIgnoreCase("medium")){
            totalPrice=12+totalpriceOfToping;
        }else{
            totalPrice=14+totalpriceOfToping;
        }
        return totalPrice;
    }


    public String toString(){
        return "Size: "+ size+"\n Number of Chess Topping: "+numOfPepperoniTopping+"\n Number Of Pepperoni Toping: "+
                numOfPepperoniTopping+"\n Total:" + calcPrice();
    }

}
