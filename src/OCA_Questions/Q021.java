package OCA_Questions;

public class Q021 {
    public static void main(String[] args) {
        Vehicle v = new Bus();
    }
}
    class Vehicle {
        Vehicle(){
            System.out.println("Vehicle");
        }
    }
    class Bus extends Vehicle{
        Bus(){
            System.out.println("Bus");
        }
    }

//What is the result?
//A.	Vehicle
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything


