package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName= "Your First Name";
        String lastName="Your last Name";
        int age=19;
        String citizenShip="X";
        //boolean ages= age>=18;
        //boolean citizen = citizenShip=="USA";
        //boolean voter= ages&&citizen;
        boolean voter= age>=18 &&citizenShip=="USA";
        System.out.println(firstName+" "+lastName+ " is  eligible  to vote: " + voter);


    }
}
