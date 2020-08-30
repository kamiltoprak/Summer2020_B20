package WarmUpAndPractices.day42;
/*Create a class called Server

        Attributes:
        name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
        Actions: (all void methods)

        setInfo(): sets all of the instance variables with some values taken from the parameters.
        toString:
        takeOrder(): server's name + "is taking an order"
        cleanTable(): server's name + "is cleaning the table"
        toString(): Returns (String) all the information of a Server
        -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"*/
public class Server {
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

    public void  takeOrder(){
        System.out.println(name+"is taking an order" );
    }
    public void  cleanTable(){
        System.out.println(name+"is cleaning table" );
    }

    public String toString(){
        if(fullTime){
            return "name: "+name+ " ID: "+employeeID+" hourly  rate: "+hourlyRate+" fulltime ";
        }else{
            return "name: "+name+ " ID: "+employeeID+" hourly  rate: "+hourlyRate+" part time  ";

        }
    }


}
