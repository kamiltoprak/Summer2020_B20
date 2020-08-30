package day08_LogicalOperators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Practice2 {
    public static void main(String[] args) {
        String firstName="Conor";
        String lastName="McNugget";
        String fullName= firstName+" "+lastName;
        int age = 45;
        String citizen1 = "Turkey";
        String citizen2 = "Russia";
        boolean eligibleAge = age > 18;// 12 > 18 ==> false
        boolean usCitizen = "USA" == citizen1 || "USA" == citizen2; // "USA"== "USA" ||"France"=="USA"
        //      true     || false
        //              true
        boolean eligibleToVote = eligibleAge && usCitizen;
        //  false && true
        //  false
        System.out.println(fullName +" is eligible to  vote for Trump: " +eligibleToVote);


    }
}
