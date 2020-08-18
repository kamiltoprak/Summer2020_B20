package WarmUpAndPractices.day42;
 /* Create a class called Chef

        Attributes:
        name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
        Actions: (all void methods)

        setInfo(): sets all of the instance variables with some values taken from the parameters.
        makeOrder(): chef's name + "is making an order"
        washDishes(): chef's name + "is washing the dishes"
        toString(): Returns (String) all the information of a Server
        -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"*/
public class Chef {
     String name;
     int employeeID;
     double hourlyRate;
     boolean fullTime;

     public  void setInfo(String name, int employeeID,double hourlyRate,boolean fullTime){
         this.name=name;
         this.employeeID=employeeID;
         this.hourlyRate=hourlyRate;
         this.fullTime=fullTime;
     }

     public void  makeOrder(){
         System.out.println(name+"is making an order" );
     }
     public void  washDishes(){
         System.out.println(name+"is washing dishes" );
     }

     public String toString(){
         if(fullTime){
             return "name: "+name+ " ID: "+employeeID+" hourly  rate: "+hourlyRate+" fulltime ";
         }else{
             return "name: "+name+ " ID: "+employeeID+" hourly  rate: "+hourlyRate+" part time  ";

         }
     }
}
